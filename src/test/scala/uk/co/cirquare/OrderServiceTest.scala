package uk.co.cirquare
import org.scalatest._

class OrderServiceTest extends FlatSpec with Matchers {


  "Order " should "give total price" in {
    val order = new Order
    order.add(new DrinkItem(name = "Cola", 0.5,itemType = ItemType.COLD))
    order.add(new DrinkItem(name = "Coffee", 1,itemType = ItemType.COLD))
    order.add(new FoodItem(name = "Cheese Sandwich", 2.00, itemType = ItemType.COLD))

    assert(order.calculateBill == 3.5)
  }

}
