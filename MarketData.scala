import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 9/18/13
 * Time: 5:42 PM
 */
class MarketData {

  @SerializedName("XSHG")
  private var metaDataXSHG: MetaData = null

  @SerializedName("XSHE")
  private var metaDataXSHE: MetaData = null

  def getMetaDataXSHG = metaDataXSHG

  def setMetaDataXSHG(metaDataXSHG: MetaData) = {this.metaDataXSHG = metaDataXSHG}

  def getMetaDataXSHE = metaDataXSHE

  def setMetaDataXSHE(metaDataXSHE: MetaData) = {this.metaDataXSHE = metaDataXSHE}

  override def toString = {
    val metaXSHG = if(metaDataXSHG != null) {
      metaDataXSHG.toString + " "
    }
    else {
      ""
    }
    val metaXSHE = if(metaDataXSHE != null) {
      metaDataXSHE.toString + " "
    }
    else {
      ""
    }
    "MarketData: " + metaXSHG + metaXSHE
  }

}