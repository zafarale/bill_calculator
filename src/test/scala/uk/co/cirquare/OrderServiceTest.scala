package uk.co.cirquare
import org.scalatest._

class OrderServiceTest extends FlatSpec with Matchers {


  "Order " should "give total price" in {
    val order = new Order
    new MenuItem(name = "", iprice = 1, itype = ItemType.COLD)

    order.add(new MenuItem(name = "Cola", 0.5,itype = ItemType.COLD))
    order.add(new MenuItem(name = "Coffee", 1,itype = ItemType.COLD))
    order.add(new MenuItem(name = "Cheese Sandwich", 2.00, itype = ItemType.COLD))

    assert(order.calculateBill == 3.5)
  }

}
