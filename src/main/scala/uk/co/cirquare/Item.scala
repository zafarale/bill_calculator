package uk.co.cirquare

object ItemType extends Enumeration{
  val HOT, COLD = Value
}

trait Item[A, B]{

  def price(): A

  def itemType(): B
}



class MenuItem(name: String, iprice: Double, itype: ItemType.Value) extends Item[Double, ItemType.Value] {

  override def price(): Double = {
    return this.iprice;
  }

  override def itemType(): ItemType.Value = {
    return this.itype;
  }
}


