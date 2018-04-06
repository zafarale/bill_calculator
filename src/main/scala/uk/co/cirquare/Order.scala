package uk.co.cirquare

import scala.collection.mutable.ListBuffer

class Order {

  val items:ListBuffer[MenuItem[Double]] = ListBuffer[MenuItem[Double]]()

  def add(item: MenuItem[Double]) = {

    items += item
  }

  def calculateBill: Double ={
    return items.map(_.price()).sum
  }
}
