package data


class FutureMarketData {

  private var marketMetaData: MarketMetaData_old = null
  private var tradingDay: String = ""
  private var instrumentId: String = ""
  private var exchangeId: String = ""
  private var exchangeInstId: String = ""
  private var lastPrice: BigDecimal = BigDecimal(0)
  private var preSettlementPrice: BigDecimal = BigDecimal(0)
  private var preClosePrice: BigDecimal = BigDecimal(0)
  private var preOpenInterest: BigDecimal = BigDecimal(0)
  private var openPrice: BigDecimal = BigDecimal(0)
  private var highestPrice: BigDecimal = BigDecimal(0)
  private var lowestPrice: BigDecimal = BigDecimal(0)
  private var volume: BigDecimal = BigDecimal(0)
  private var turnOver: BigDecimal = BigDecimal(0)
  private var openInterest: BigDecimal = BigDecimal(0)
  private var closePrice: BigDecimal = BigDecimal(0)
  private var settlementPrice: BigDecimal = BigDecimal(0)
  private var upperLimitPrice: BigDecimal = BigDecimal(0)
  private var lowerLimitPrice: BigDecimal = BigDecimal(0)
  private var preDelta: BigDecimal = BigDecimal(0)
  private var currDelta: BigDecimal = BigDecimal(0)
  private var updateTime: String = ""
  private var updateMillisec: Int = 0
  private var bidBook: Array[PricingData] = Array.empty[PricingData]
  private var askBook: Array[PricingData] = Array.empty[PricingData]
  private var averagePrice: BigDecimal = BigDecimal(0)
  private var actionDay: String = ""

  def getMarketMetaData = marketMetaData
  def setMarketMetaData(marketMetaData: MarketMetaData_old) = {this.marketMetaData = marketMetaData}

  def getTradingDay = tradingDay
  def setTradingDay(tradingDay: String) = {this.tradingDay = tradingDay}

  def getInstrumentId = instrumentId
  def setInstrumentId(instrumentId: String) = {this.instrumentId = instrumentId}

  def getExchangeId = exchangeId
  def setExchangeId(exchangeId: String) = {this.exchangeId = exchangeId}

  def getExchangeInstId = exchangeInstId
  def setExchangeInstId(exchangeInstId: String) = {this.exchangeInstId = exchangeInstId}

  def getLastPrice = lastPrice
  def setLastPrice(lastPrice: BigDecimal) = {this.lastPrice = lastPrice}

  def getPreSettlementPrice = preSettlementPrice
  def setPreSettlementPrice(preSettlementPrice: BigDecimal) = {this.preSettlementPrice = preSettlementPrice}

  def getPreClosePrice = preClosePrice
  def setPreClosePrice(preClosePrice: BigDecimal) = {this.preClosePrice = preClosePrice}

  def getPreOpenInterest = preOpenInterest
  def setPreOpenInterest(preOpenInterest: BigDecimal) = {this.preOpenInterest = preOpenInterest}

  def getOpenPrice = openPrice
  def setOpenPrice(openPrice: BigDecimal) = {this.openPrice = openPrice}

  def getHighestPrice = highestPrice
  def setHighestPrice(higthestPrice: BigDecimal) = {this.highestPrice = higthestPrice}

  def getLowestPrice = lowestPrice
  def setLowestPrice(lowestPrice: BigDecimal) = {this.lowestPrice = lowestPrice}

  def getVolume = volume
  def setVolume(voluem: BigDecimal) = {this.volume = volume}

  def getTurnOver = turnOver
  def setTurnOver(turnOver: BigDecimal) = {this.turnOver = turnOver}

  def getOpenInterest = openInterest
  def setOpenInterest(openInterest: BigDecimal) = {this.openInterest = openInterest}

  def getClosePrice = closePrice
  def setClosePrice(closePrice: BigDecimal) = {this.closePrice = closePrice}

  def getSettlementPrice = settlementPrice
  def setSettlementPrice(settlementPrice: BigDecimal) = {this.settlementPrice = settlementPrice}

  def getUpperLimitPrice = upperLimitPrice
  def setUpperLimitPrice(upperLimitPrice: BigDecimal) = {this.upperLimitPrice = upperLimitPrice}

  def getLowerLimitPrice = lowerLimitPrice
  def setLowerLimitPrice(lowerLimitPrice: BigDecimal) = {this.lowerLimitPrice = lowerLimitPrice}

  def getPreDelta = preDelta
  def setPreDelta(preDelta: BigDecimal) = {this.preDelta = preDelta}

  def getCurrDelta = currDelta
  def setCurrDelta(currDelta: BigDecimal) = {this.currDelta = currDelta}

  def getUpdateTime = updateTime
  def setUpdateTime(updateTime: String) = {this.updateTime = updateTime}

  def getUpdateMillisec = updateMillisec
  def setUpdateMillisec(updateMillisec: Int) = {this.updateMillisec = updateMillisec}

  def getBidBook = bidBook
  def setBidBook(bidBook: Array[PricingData]) = {this.bidBook = bidBook}

  def getAskBook = askBook
  def setAskBook(askBook: Array[PricingData]) = {this.askBook = askBook}

  def getAveragePrice = averagePrice
  def setAveragePrice(averagePrice: BigDecimal) = {this.averagePrice = averagePrice}

  def getActionDay = actionDay
  def setActionDay(actionDay: String) = {this.actionDay = actionDay}

  override def toString = {
    "(FutureMarketData) " + marketMetaData.toString + ", instrumentId: " + instrumentId
  }

}
