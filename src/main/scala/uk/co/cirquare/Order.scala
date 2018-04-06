package uk.co.cirquare

import scala.collection.mutable.ListBuffer

class Order {

  val items: ListBuffer[Item[Double, FoodType.Value, ItemType.Value]] = ListBuffer[Item[Double, FoodType.Value, ItemType.Value]]()

  def add(item: Item[Double, FoodType.Value, ItemType.Value]) = {

    items += item

  }

  def calculateBill(): Double = {
    return items.map(_.price()).sum
  }

  def calculateServiceCharge() = {

    var serviceCharge: Double = 0

    //Any Drink
    if (items.filter(_.itemType() == FoodType.FOOD).size > 0) {
      serviceCharge = 10
    }

    if (items.filter(_.itemType() == FoodType.FOOD).filter(_.itemState() == ItemType.HOT).size > 0) {
      serviceCharge = 20
    }

    //print ((calculateBill()/100)*serviceCharge)
    println(">>>>"+serviceCharge)

    serviceCharge
  }
}
