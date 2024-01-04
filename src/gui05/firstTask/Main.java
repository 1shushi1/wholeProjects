//package gui05.firstTask;
//
//import gui05.firstTask.Crr;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        String[] arr = {"salon A", "Mercedes", "130000",
//                "salon B", "Mercedes", "120000",
//                "salon C", "Ford", "110000",
//                "salon B", "Opel", "90000",
//                "salon C", "Honda", "95000",
//                "salon A", "Ford", "105000",
//                "salon A", "Renault", "75000"};
//
//        Map<String, List<Crr>> m = new HashMap<>();
//        Crr cheapestCar = null;
//        for (int i = 0; i < arr.length; i += 3) {
//            m.putIfAbsent(arr[i], new ArrayList<>());
//            m.get(arr[i]).add(new Crr(arr[i + 1], arr[i + 2]));
//        }
//        for (String keys : m.keySet()) {
//            System.out.print(keys);
//            System.out.print("=[");
//            for (Crr car : m.get(keys)) {
//                if(cheapestCar.price <= car.price) {
//                    cheapestCar = car;
//                }
//                System.out.print(car);
//                System.out.print(", ");
//            }
//            System.out.println("],");
//        }
//
//        System.out.println();
//
//
//// System.out.println("hello");
//    }
//}