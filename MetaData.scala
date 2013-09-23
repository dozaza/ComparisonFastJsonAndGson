import java.math.BigDecimal

/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 9/23/13
 * Time: 2:55 PM
 */
class MetaData {

  private var securityId: Long = 0
  private var timestamp: String = "19000101 00:00:00.000"
  private var ticker: String = "default ticker"
  private var totalTradeValue: BigDecimal = new BigDecimal(0)
  private var totalTradeQuantity: BigDecimal = new  BigDecimal(0)
  private var tradePrice: BigDecimal = new BigDecimal(0)
  private var exchangeCode: String = "default code"

  /*
  def this() = {
    this(
      0,
      new LocalDateTime("19000101 00:00:00.000"),
      "default ticker",
      BigDecimal(0),
      BigDecimal(0),
      BigDecimal(0),
      "default code")
  }
  */

  def getSecurityId = {securityId}

  def setSecurityId(securityId: Long) = {this.securityId = securityId}

  def getTimestamp = {timestamp}

  def setTimestamp(timestamp: String) = {this.timestamp = timestamp}

  def getTicker = {ticker}

  def setTicker(ticker: String) = {this.ticker = ticker}

  def getTotalTradeValue = {totalTradeValue}

  def setTotalTradeValue(totalTradeValue: BigDecimal) = {this.totalTradeValue = totalTradeValue}

  def getTotalTradeQuantity = {totalTradeQuantity}

  def setTotalTradeQuantity(totalTradeQuantity: BigDecimal) = {this.totalTradeQuantity = totalTradeQuantity}

  def getTradePrice = {tradePrice}

  def setTradePrice(tradePrice: BigDecimal) = {this.tradePrice = tradePrice}

  def getExchangeCode = {exchangeCode}

  def setExchangeCode(exchangeCode: String) = {this.exchangeCode = exchangeCode}

  override def toString = {
    "MetaData { securityId: " + securityId + " timestamp: " + timestamp + " ticker: " + ticker +
      " totalTradeValue: " + totalTradeValue + " totalTradeQuantity: " + totalTradeQuantity + " tradePrice: " +
      tradePrice + " exchangeCode: " + exchangeCode + "}"
  }
}
