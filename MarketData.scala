/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 9/18/13
 * Time: 5:42 PM
 */
case class MarketData(securityId: Long,
                         timestamp: LocalDateTime,
                         ticker: String,
                         totalTradeValue: BigDecimal,
                         totalTradeQuantity: BigDecimal,
                         tradePrice: BigDecimal,
                         exchangeCode: String) {

}