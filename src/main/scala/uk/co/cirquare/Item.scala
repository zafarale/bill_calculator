package uk.co.cirquare

object ItemType extends Enumeration{
  val HOT, COLD = Value
}
object FoodType extends Enumeration{
  val FOOD, DRINK = Value
}

trait Item[A, B, C]{

  def price(): A

  def itemType(): B

  def itemState(): C
}



class MenuItem(name: String, iprice: Double, foodType: FoodType.Value, foodState: ItemType.Value) extends Item[Double, FoodType.Value, ItemType.Value] {

  override def price(): Double = {
    return this.iprice
  }

  override def itemType: FoodType.Value ={
    this.foodType
  }
  override def itemState(): ItemType.Value = {
    return this.foodState
  }

  override def toString: String = {
    return " Name = " + name +
      ", price  = " + price +
      ", state  = " + foodState +
      ", itemType = " + itemType.toString()
  }
}


