package collections.hashMap.wareHouseHashMap;
import java.util.*;
public class Storage {
    private Scanner s = new Scanner(System.in);
    private HashMap<Integer, HashMap<Integer, Product[]>> rooms = new HashMap<>();
    public Storage() {
        System.out.println("How many rooms would you like to have in your storage?");
        int storageRooms = Integer.parseInt(s.nextLine());
        for (int i = 1; i <= storageRooms; i++) {
            System.out.println("How many stalls in " + i + " room?");
            int stalls = Integer.parseInt(s.nextLine());
            HashMap<Integer, Product[]> room = new HashMap<>();
            for (int j = 1; j <= stalls; j++) {
                System.out.println("How many cells you would like to have in room : " + i + " on stall number : " + j + "?");
                int cells = Integer.parseInt(s.nextLine());
                Product[] array = new Product[cells];
                room.put(j, array);
            }
            rooms.put(i, room);
        }
        for (Integer number : rooms.keySet()) {
            System.out.println("Room with number : " + number);
            HashMap<Integer, Product[]> room = rooms.get(number);
            int stallsCounter = room.size();
            System.out.println("Stalls in this room : " + stallsCounter);
            for (Integer stallsNumber : room.keySet()) {
                Product[] cellsNumber = room.get(stallsNumber);
                System.out.println("Cells in this room : " + Arrays.toString(cellsNumber));
            }
        }
        menu();
    }
    public void add() {
        System.out.println("What product you would like to put");
        String productName = s.nextLine();
        System.out.println("In what amount?");
        int amount = Integer.parseInt(s.nextLine());
        System.out.println("With what price?");
        double productPrice = Double.parseDouble(s.nextLine());
        int roomNumber = 0;
        int stallNumber = 0;
        int cellNumber = 0;
        for (Integer roomNum : rooms.keySet()) {
            HashMap<Integer, Product[]> room = rooms.get(roomNum);
            for (Integer stallNum : room.keySet()) {
                Product[] products = room.get(stallNum);
                for (int i = 0; i < products.length; i++) {
                    if (products[i] != null && (products[i].getTitle().equals(productName) && products[i].getPrice() == productPrice)) {
                        int productsAmount = products[i].getAmount();
                        amount += productsAmount;
                        products[i].setAmount(amount);
                        System.out.println("You've added your product in room number " + roomNum + ". Stall number " + stallNum + ". Cell number " + i + ".");
                        return;
                    } else if (products[i] == null && roomNumber == 0) {
                        roomNumber = roomNum;
                        stallNumber = stallNum;
                        cellNumber = i;
                    }
                }
            }
        }
        if (roomNumber == 0) {
            System.out.println("There is no free space in the warehouse");
        } else {
            Product product = new Product(productName, amount, productPrice);
            HashMap<Integer, Product[]> room = rooms.get(roomNumber);
            Product[] stall = room.get(stallNumber);
            stall[cellNumber] = product;
            System.out.println("You've added your product in room number " + roomNumber + ". Stall number " + stallNumber + ". Cell number " + cellNumber + ".");
        }
    }
    public void take() {
        System.out.println("Enter a product name you would like to take");
        String productName = s.nextLine();
        System.out.println("Enter a product amount");
        int amount = Integer.parseInt(s.nextLine());
        System.out.println("Enter a product price");
        double productPrice = Double.parseDouble(s.nextLine());
        for (Integer roomNumber : rooms.keySet()) {
            HashMap<Integer, Product[]> room = rooms.get(roomNumber);
            for (Integer stallNum : room.keySet()) {
                Product[] products = room.get(stallNum);
                for (int i = 0; i < products.length; i++) {
                    if (products[i] != null) {
                        if (products[i].getTitle().equals(productName) && products[i].getPrice() == productPrice) {
                            if (products[i].getAmount() >= amount) {
                                int productRefreshment = products[i].getAmount() - amount;
                                products[i].setAmount(productRefreshment);
                                System.out.println("You've taken : " + amount + " " + productName);
                                return;
                            } else if (products[i].getAmount() < amount) {
                                int productLeft = products[i].getAmount();
                                System.out.println("Products left on a warehouse : " + productLeft + ". Would you like to take leftovers?");
                                System.out.println("Yes or No?");
                                String sel = s.nextLine();
                                switch (sel.toUpperCase()) {
                                    case "Yes":
                                        products[i].setAmount(0);
                                        System.out.println("You successfully took " + productLeft + " " + productName + "`s");
                                }
                            } else if (products[i].getAmount() == 0) {
                                System.out.println("There is no such product available at this moment");
                            }
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Can't find a product you are looking for");
    }
    public void find() {
        System.out.println("Enter a number : 1 - find by product name, 2 - find by product and price, 3 - list of the products that are already running out, 4 - exit");
        int selection = Integer.parseInt(s.nextLine());
        switch (selection) {
            case 1 -> findByProductName();
            case 2 -> findByNameAndPrice();
            case 3 -> listOfProductsThatAreRunningOut();
            case 4 -> System.exit(0);
        }
    }
    public void findByProductName() {
        System.out.println("Enter a product name");
        String productName = s.nextLine();
        int counter = 0;
        for (Integer number : rooms.keySet()) {
            HashMap<Integer, Product[]> stalls = rooms.get(number);
            for (Integer stallsNum : stalls.keySet()) {
                Product[] products = stalls.get(stallsNum);
                for (int i = 0; i < products.length; i++) {
                    if (products[i] != null && productName.equals(products[i].getTitle())) {
                        counter++;
                        products[i].info();
                        System.out.println("Your product is in the room : " + number + ". On the stall with the number : " + stallsNum + ", and cell number : "
                                + i);
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("There is no such product");
        }
    }
    public void findByNameAndPrice() {
        System.out.println("Enter a product name");
        String productName = s.nextLine();
        System.out.println("Enter a product price");
        double productPrice = Double.parseDouble(s.nextLine());
        for (Integer number : rooms.keySet()) {
            HashMap<Integer, Product[]> stalls = rooms.get(number);
            for (Integer stall : stalls.keySet()) {
                Product[] products = stalls.get(stall);
                for (int i = 0; i < products.length; i++) {
                    if (products[i] != null && productName.equals(products[i].getTitle()) && productPrice == products[i].getPrice()) {
                        products[i].info();
                        System.out.println("Your product is in the room : " + number + ". On the stall with the number : " + stall + ", and cell number : "
                                + i);
                        return;
                    }
                }
            }
        }
        System.out.println("There is no such product");
    }
    public void listOfProductsThatAreRunningOut() {
        for (Integer number : rooms.keySet()) {
            HashMap<Integer, Product[]> stalls = rooms.get(number);
            for (Integer stall : stalls.keySet()) {
                Product[] products = stalls.get(stall);
                for (int i = 0; i < products.length; i++) {
                    if (products[i] != null && products[i].getAmount() < 5) {
                        products[i].info();
                    }
                }
            }
        }
    }
    public void menu() {
        while (true) {
            System.out.println("Enter a number : 1 - add product to your storage, 2 - take, 3 - find, 4 - exit");
            int selection = Integer.parseInt(s.nextLine());
            switch (selection) {
                case 1 -> add();
                case 2 -> take();
                case 3 -> find();
                case 4 -> System.exit(0);
            }
        }
    }
}
