package data

/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 9/18/13
 * Time: 5:43 PM
 */
class LocalDateTime(mess: String) {

  private var year = mess.substring(0, 4)

  private var month = mess.substring(4, 6)

  private var day = mess.substring(6, 8)

  private var hour = mess.substring(9, 11)

  private var minute = mess.substring(12, 14)

  private var second = mess.substring(15, 17)


  private var millisecond = mess.substring(18)

  def this() = {
    this("19000101 00:00:00.000")
  }

  def getYear() = {year}

  def setYear(year: String) = {this.year = year}

  def getMonth() = {month}

  def setMonth(month: String) = {this.month = month}

  def getDay() = {day}

  def setDay(day: String) = {this.day = day}

  def getHour() = {hour}

  def setHour(hour: String) = {this.hour = hour}

  def getMinute() = {minute}

  def setMinute(minute: String) = {this.minute = minute}

  def getSecond() = {second}

  def setSecond(second: String) = {this.second = second}

  def getMilliseconcd() = {millisecond}

  def setMillisecond(millisecond: String) = {this.millisecond = millisecond}



}
