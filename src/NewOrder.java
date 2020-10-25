import java.util.LinkedList;
import java.util.List;

public class NewOrder {
    private int numberOfOrders;
    private List<Cake> cakeList = new LinkedList<>();

    public NewOrder() {
    }

    public NewOrder(int numberOfOrders, List<Cake> cakeList) {
        this.numberOfOrders = numberOfOrders;
        this.cakeList = cakeList;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public List<Cake> getCakeList() {
        return cakeList;
    }

    public void setCakeList(List<Cake> cakeList) {
        this.cakeList = cakeList;
    }

    @Override
    public String toString() {
        return "NewOrders{" +
                "numberOfOrders=" + numberOfOrders +
                ", cakeList=" + cakeList +
                '}';
    }
}
