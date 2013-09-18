import com.google.gson._
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 9/18/13
 * Time: 3:59 PM
 */

private class LocalDateTimeSerializer extends JsonSerializer[LocalDateTime] {
  def serialize(src: LocalDateTime , typeOfSrc: Type, context: JsonSerializationContext): JsonElement = {
    new JsonPrimitive(src.toString)
  }
}

private class LocalDateTimeDeserializer extends JsonDeserializer[LocalDateTime] {
  def deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): LocalDateTime = {
    new LocalDateTime(json.getAsJsonPrimitive.getAsString)
  }
}

private class BigDecimalSerializer extends JsonSerializer[BigDecimal] {
  def serialize(src: BigDecimal, typeOfSrc: Type, context: JsonSerializationContext): JsonElement = {
    new JsonPrimitive(src.bigDecimal)
  }
}

private class BigDecimalDeserializer extends JsonDeserializer[BigDecimal] {
  def deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): BigDecimal = {
    BigDecimal(json.getAsJsonPrimitive.getAsBigDecimal)
  }
}

object parse {

  def main(args: Array[String]) {

    //val mess = """{"securityId":1,"timestamp":"20130918 15:03:12.0","ticker":"XSHG.000001","totalTradeValue":1.01333e+11,"totalTradeQuantity":115111887,"tradePrice":2191.85,"exchangeCode":"XSHG"}"""
    //val mess2 = """[{"securityId":1,"timestamp":"20130918 15:03:12.0","ticker":"XSHG.000001","totalTradeValue":1.01333e+11,"totalTradeQuantity":115111887,"tradePrice":2191.85,"exchangeCode":"XSHG"},{"securityId":2,"timestamp":"20130918 15:12:14.0","ticker":"XSHE.000001","totalTradeValue":7.86898e+08,"totalTradeQuantity":61700281,"tradePrice":12.79,"exchangeCode":"XSHE"}]"""

    var testMess = "["
    val temp = ""","timestamp":"20130918 15:03:12.0","ticker":"XSHG.000001","totalTradeValue":1.01333e+11,"totalTradeQuantity":115111887,"tradePrice":2191.85,"exchangeCode":"XSHG"}"""
    for(i <- 1 until 100000) {
      testMess += """{"securityId":""" + i.toString + temp + ","
    }
    testMess += """{"securityId":""" + 100000 + temp + "]"

    println(testMess)

    val builder = new GsonBuilder
    builder.registerTypeAdapter(classOf[LocalDateTime], new LocalDateTimeSerializer)
    builder.registerTypeAdapter(classOf[LocalDateTime], new LocalDateTimeDeserializer)
    builder.registerTypeAdapter(classOf[BigDecimal], new BigDecimalSerializer)
    builder.registerTypeAdapter(classOf[BigDecimal], new BigDecimalDeserializer)

    val gson = builder.create()
    //val data = gson.fromJson(mess, classOf[MarketData])
    val data = gson.fromJson(testMess, classOf[Array[MarketData]])

    data.foreach(println)

  }

}
