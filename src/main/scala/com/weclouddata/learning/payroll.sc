/*
 * reference: https://github.com/WeCloudData-Academy/de_programming/wiki/payroll.sc
 */

object payroll {
  var rate = 10.50

  /*calculate the weekly paycheck for an hourly employee
   * logic requirement: if working hours is less or equal then 40 hours, then 
   * the earning will return rate time hours, otherwise, the hours beyond 40 hours will be
   * paid by 1.5 times of the standard rate
   */
  def earnings(s:Char, h:Double):String = {
   ???
  }

  println(earnings(25))
  println(earnings(40))
  println(earnings(65))
  println(earnings(0))
}
