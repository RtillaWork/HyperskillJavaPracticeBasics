import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StockItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public StockItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + pricePerUnit + ", " + quantity + ";";
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Utils {
    public static List<StockItem> sort(List<StockItem> stockItems) {
        // your code here
        List<StockItem> sortedList = new ArrayList<>(stockItems);
        Comparator<StockItem> totalValueCompare = (s1, s2) ->
                Double.compare((s1.getPricePerUnit() * s1.getQuantity()), (s2.getPricePerUnit() * s2.getQuantity()));
        sortedList.sort(totalValueCompare.reversed());
        return sortedList;
    }
}



/////////////// OR ///////////////////

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;

// class StockItem {
//     private String name;
//     private double pricePerUnit;
//     private int quantity;

//     public StockItem(String name, double pricePerUnit, int quantity) {
//         this.name = name;
//         this.pricePerUnit = pricePerUnit;
//         this.quantity = quantity;
//     }

//     @Override
//     public String toString() {
//         return name + ": " + pricePerUnit + ", " + quantity + ";";
//     }

//     public String getName() {
//         return name;
//     }

//     public double getPricePerUnit() {
//         return pricePerUnit;
//     }

//     public int getQuantity() {
//         return quantity;
//     }
// }

// class Utils {
//     public static List<StockItem> sort(List<StockItem> stockItems) {
//         // your code here
//         List<StockItem> sortedList = new ArrayList<>(stockItems);
//         Comparator<StockItem> totalValueCompare = (s1, s2) -> 
//                 Double.compare((s2.getPricePerUnit() * s2.getQuantity()), (s1.getPricePerUnit() * s1.getQuantity()));
//         sortedList.sort(totalValueCompare);
//         return sortedList;
//     }
// }
