/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 9/18/13
 * Time: 4:09 PM
 */
case class LocalDateTime(s: String) {

  val year = s.substring(0, 4)

  val month = s.substring(4, 6)

  val day = s.substring(6, 8)

  val hour = s.substring(9, 11)

  val minute = s.substring(12, 14)

  val second = s.substring(15, 17)

  val millisecond = s.substring(18)

  override def toString: String = {
    "LocalDateTime: " + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second + "." + millisecond
  }
}
