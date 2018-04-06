package uk.co.cirquare
import org.scalatest._

class OrderServiceTest extends FlatSpec with Matchers {


  "Order " should "allow calculating total" in {
    val order = new Order

    order.add(new MenuItem(name = "Cola", 0.5,foodState = ItemType.COLD, foodType = FoodType.DRINK))
    order.add(new MenuItem(name = "Coffee", 1,foodState = ItemType.COLD, foodType = FoodType.DRINK))
    order.add(new MenuItem(name = "Cheese Sandwich", 2.00, foodState= ItemType.COLD, foodType = FoodType.FOOD))
    assert(order.calculateBill() == 3.5)
  }


  "Order " should "allow calculating service charges" in {
    val order = new Order

    order.add(new MenuItem(name = "Cola", 0.5,foodState = ItemType.COLD, foodType = FoodType.DRINK))
    order.add(new MenuItem(name = "Coffee", 1,foodState = ItemType.COLD, foodType = FoodType.DRINK))

    order.add(new MenuItem(name = "Steak Sandwich", 4.50, foodState= ItemType.HOT, foodType = FoodType.FOOD))
    assert(order.calculateServiceCharge() == 20)


  }


}
