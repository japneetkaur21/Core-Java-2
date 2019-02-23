enum CoffeeType{ latte, americano, iced, cold}

abstract class Customer{
private String name;
private int contact;
public abstract boolean WaitForCoffee();
public abstract boolean CollectCoffee();
}

class Order{
    public String Order_id;
private CoffeeType type;
}

interface PendingOrderQueue{
    public abstract void AddOrder(Order o);
    public abstract void getNextOrder(Order o);
}

abstract class Cashier implements PendingOrderQueue{
    private String name;
    private String emp_id;
    public abstract int TakeOrder(double cash);
    public void AddOrder(Order o){
    //Add order to pending queue
    }
}

abstract class Barista implements PendingOrderQueue{
 private String emp_id;
 public void getNextOrder(Order o){
     //Get next order from pending queue
 }
 public abstract void PrepareCoffee(Order o);
 public abstract int AddOrderToCompleteQueue(Order o);
 public abstract int NotifyOrderComplete(Order o);
}

abstract class FinishedOrderQueue extends Barista{
    //Completed order is added to this queue
}
