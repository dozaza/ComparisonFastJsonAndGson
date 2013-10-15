package data

import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
import com.alibaba.fastjson.serializer.JSONSerializerMap
import com.alibaba.fastjson.{JSON, JSONObject}
import com.google.gson._
import java.lang.reflect.Type

/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 9/18/13
 * Time: 5:46 PM
 */

private class LocalDateTimeSerializer extends JsonSerializer[LocalDateTime] {

  def serialize(src: LocalDateTime, typeOfSrc: Type, context: JsonSerializationContext): JsonElement = {
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

    val test =
      """{"XSHG": {"securityId":1, "timestamp":"20130918 15:03:12.0","ticker":"XSHG.000001","totalTradeValue":1.01333e+11,"totalTradeQuantity":115111887,"tradePrice":2191.85,"exchangeCode":"XSHG"},""" +
         """"XSHE": {"securityId":2, "timestamp":"20130918 15:03:12.0","ticker":"XSHG.000001","totalTradeValue":1.01333e+11,"totalTradeQuantity":115111887,"tradePrice":2191.85,"exchangeCode":"XSHE"}}"""

    val temp = ""","timestamp":"20130918 15:03:12.0","ticker":"XSHG.000001","totalTradeValue":1.01333e+11,"totalTradeQuantity":115111887,"tradePrice":2191.85,"exchangeCode":"XSHG"}"""
    val mess = "[" + (1 to 6000).map("""{"securityId":""" + _ + temp).mkString(",") + "]"

    val start = System.currentTimeMillis()
    //val fdata = JSON.parseObject(mess, classOf[Array[MarketData]])
    val end = System.currentTimeMillis()
    //println("fastjson: " + (end - start) + " size: " + fdata.size)
    //println(fdata.apply(6000-1))




    val builder = new GsonBuilder
    builder.registerTypeAdapter(classOf[LocalDateTime], new LocalDateTimeSerializer)
    builder.registerTypeAdapter(classOf[LocalDateTime], new LocalDateTimeDeserializer)
    builder.registerTypeAdapter(classOf[BigDecimal], new BigDecimalSerializer)
    builder.registerTypeAdapter(classOf[BigDecimal], new BigDecimalDeserializer)

    val gson = builder.create()

    val start2 = System.currentTimeMillis()
    //val data = gson.fromJson(mess, classOf[Array[MarketData]])
    val end2 = System.currentTimeMillis()

    println(test)
    //val data = gson.fromJson(test, classOf[MarketData])

    //println("new gson: " + data)


    val mess_future = """{"marketMetaData":{"length":0,"timestamp":0,"millisecond":0,"exchangeId":0,"localMillSecond":0,"versionId":0,"localTimestamp":231},"tradingDay":null,"instrumentId":null,"exchangeId":null,"exchangeInstId":null,"lastPrice":null,"preSettlementPrice":null,"preClosePrice":null,"preOpenInterest":null,"openPrice":null,"highestPrice":null,"lowestPrice":null,"volume":null,"turnOver":null,"openInterest":null,"closePrice":null,"settlementPrice":null,"upperLimitPrice":null,"lowerLimitPrice":null,"preDelta":null,"currDelta":null,"updateTime":null,"updateMillisec":null,"bidBook":[null,null,null,null,null],"askBook":[null,null,null,null,null],"averagePrice":null,"actionDay":null}"""
    val future = gson.fromJson(mess_future, classOf[FutureMarketData])

    println(future)
    //println("gson: " + (end2 - start2) + " size: " + data.size)
    //println(data.apply(6000-1))
  }

}
