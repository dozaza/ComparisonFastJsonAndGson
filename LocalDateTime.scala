/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 9/18/13
 * Time: 5:43 PM
 */
case class LocalDateTime(mess: String) {

  val year = mess.substring(0, 4)

  val month = mess.substring(4, 6)

  val date = mess.substring(6, 8)

  val hour = mess.substring(9, 11)

  val minute = mess.substring(12, 14)

  val second = mess.substring(15, 17)

  val millisecond = mess.substring(18)

}
