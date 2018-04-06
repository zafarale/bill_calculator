package uk.co.cirquare


trait MenuItem[A]{

  def price(): A
  //var itemType: ItemType.Value = ItemType.COLD;
}

object ItemType extends Enumeration{
  val HOT, COLD = Value
}


case class FoodItem(name: String, itemPrice: Double, itemType: ItemType.Value) extends MenuItem[Double]{

  override def price(): Double =  {
    return this.itemPrice;
  }
}




case class DrinkItem(name: String, itemPrice: Double, itemType: ItemType.Value) extends MenuItem[Double]{

  override def price(): Double =  {
    return this.itemPrice;
  }
}
