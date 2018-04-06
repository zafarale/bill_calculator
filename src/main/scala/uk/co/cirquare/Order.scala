package uk.co.cirquare

import scala.collection.mutable.ListBuffer

class Order {

  val items:ListBuffer[Item[Double, ItemType.Value]] = ListBuffer[Item[Double, ItemType.Value]]()

  def add(item: Item[Double, ItemType.Value]) = {

    items += item
  }

  def calculateBill: Double ={
    return items.map(_.price()).sum
  }
  /*
  def serviceCharge: Double ={
    items.map(_.itemType)
  }*/
}
