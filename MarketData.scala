import java.util.Date

/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 9/18/13
 * Time: 3:49 PM
 */
case class MarketData(securityId: Long,
                         timestamp: LocalDateTime,
                         ticker: String,
                         totalTradeValue: BigDecimal,
                         totalTradeQuantity: BigDecimal,
                         tradePrice: BigDecimal,
                         exchangeCode: String) {

}