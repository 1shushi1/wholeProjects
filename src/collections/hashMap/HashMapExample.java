package collections.hashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        //створити прайс-лист машин БМВ
        HashMap<String, Integer> priceList = new HashMap<>();
        priceList.put("M5 F90", 4_952_000);
        priceList.put("X6M", 5_600_000);
        priceList.put("X7", 3_780_000);
        priceList.put("M3 G20", 3_864_000);
        System.out.println(priceList);

        //PUT.Якщо записати значення з інснуючим ключем, то старе значення перезапишиться
        priceList.put("M3 G20", 3_900_000);
        System.out.println(priceList);

        //GET.Метод get повертає values
        Integer price = priceList.get("M5 F90");
        System.out.println("Price for BMW M5 F90 - " + price);

        //З мапами та листами краще використовувати Integer
        Integer priceX9 = priceList.get("X9");
        System.out.println(priceX9);

        //REPLACE
        priceList.replace("M3 G20", 4_000_000);
        System.out.println(priceList);
        priceList.replace("X7", 3_780_000, 4_000_000);
        System.out.println(priceList);

        //Put відрізняється від replace тим, що в put воно обоʼязково додастся, а в replace ні

        //containsKey перевіряє чи є певний KEY в мапі
        boolean answer = priceList.containsKey("X9");
        System.out.println(answer);

        //containsValue перевіряє чи є певний VALUE в мапі
        boolean answer2 = priceList.containsValue(4_000_000);
        System.out.println(answer2);

        priceList.put("550", 2_000_000);
        priceList.put("330", 1_800_000);
        System.out.println(priceList);

        //Remove
        Integer result = priceList.remove("550");
        priceList.remove("330", 1_800_000);
        System.out.println(priceList);

        Integer remove = priceList.remove("X9");
        System.out.println(remove);

        //Clear. Очищає всю мапу
//        priceList.clear();
//        System.out.println(priceList);

        //Роздрукувати всі KEY
        for (String model : priceList.keySet()) {
            System.out.println(model);
        }
        System.out.println("______________________________________________________");

        //Роздрукувати список всіх значень
        for (Integer model1 : priceList.values()) {
            System.out.println(model1);
        }
        System.out.println("_____________________________________________________");

        //Вивести всі ключі і збоку значення в вигляді таблички
        for (String keysColum : priceList.keySet()) {
            System.out.println(keysColum + " - " + priceList.get(keysColum));
        }

        //Знайти найдорожче авто
        int theHighestPrice = 0;
        String carBrand = "";
        for (String brandName : priceList.keySet()) {
            if (priceList.get(brandName) > theHighestPrice) {
                theHighestPrice = priceList.get(brandName);
                carBrand = brandName;
            }
        }
        System.out.println("The most expensive car is " + carBrand + " - " + theHighestPrice);
        //Є мапа типу Int String знайти найбільший інт та відповідний йому стрінг.
        HashMap<Integer, String> map = new HashMap<>();
        map.put(158, "Lviv");
        map.put(520, "Kyiv");
        map.put(300, "Bukovel");
        map.put(350, "Warsaw");
        map.put(140, "Yagodyn");
        int mx = 0;
        String cityName = "";
        for (Integer km : map.keySet()) {
            if (km > mx) {
                mx = km;
                cityName = map.get(km);
            }
        }
        System.out.println("The biggest distance is to " + cityName + " - " + mx);
        //Є масив стрінгів з дублікатами. Отримати список неповторюванних стрінгів з використанням мапи
        HashMap<String, Integer> car = new HashMap<>();
        String[] arr = {"Audi", "BMW", "Mercedes", "BMW", "BMW", "Audi", "Mercedes", "BMW"};
        for (int i = 0; i < arr.length; i++) {
            car.put(arr[i], i++);
        }
        System.out.println(car.keySet());

        //В мапі типу стрінг-добл збільшити всі додатні в півтора раза, а відʼємні зменшити на 32%
        HashMap<String, Double> numbers = new HashMap<>();
        numbers.put("Vasya", 2.5);
        numbers.put("Petya", -14.3);
        numbers.put("Sasha", 12.9);
        numbers.put("Masha", 7.13);
        numbers.put("Tolya", -12.12);
        numbers.put("Liolya", -24.2);
        numbers.put("Vika", 19.23);
        numbers.put("Jenia", -9.2);
        numbers.put("Tioma", 3.33);
        for (String name : numbers.keySet()) {
            if (numbers.get(name) < 0) {
                numbers.replace(name, numbers.get(name) * 1.32);
            }
            if (numbers.get(name) > 0) {
                numbers.replace(name, numbers.get(name) * 1.5);
            }
        }
        System.out.println(numbers);
        //Є мапа типу стрніг-дабл інвертувати її
        HashMap<String, Double> invertor = new HashMap<>();
        invertor.put("Vasya", 2.5);
        invertor.put("Petya", -14.3);
        invertor.put("Sasha", 12.9);
        invertor.put("Masha", 7.13);
        invertor.put("Tolya", -12.12);
        invertor.put("Liolya", -24.2);
        invertor.put("Vika", 19.23);
        invertor.put("Jenia", -9.2);
        invertor.put("Tioma", 3.33);
        HashMap<Double, String> path = new HashMap<>();
        for (String name : invertor.keySet()) {
            path.put(invertor.get(name), name);
        }
        System.out.println(path);
        //Є масив інтів з використанням мапи порахувати кількість кожного з інтів в масиві
        int[] arrInt = {1, 2, 3, 3, 5, 5, 1, 8, 19, 19, 2, 3, 4, 5, 6, 7, 10, 11, 12, 10, 11, 4, 5, 6};
        int counter = 1;
        HashMap<Integer, Integer> statistic = new HashMap<>();
        for (int i = 0; i < arrInt.length ; i++) {
            if (!statistic.containsKey(arrInt[i])){
                statistic.put(arrInt[i],1);
            }
            else {
                int value = statistic.get(arrInt[i]);
                value++;
                statistic.put(arrInt[i], value);
            }
        }
        System.out.println(statistic);
        //Є мапа типу інт-стрінг збільшити ключі, які відʼємні в три рази, а додатні в півтора
        HashMap<Integer, String> marks = new HashMap<>();
        marks.put(-25, "Viktoria");
        marks.put(43, "Anatoliy");
        marks.put(-12, "Artem");
        marks.put(33, "Mykola");
        marks.put(-50, "Maksym");
        marks.put(42, "Sasha");
        marks.put(-7, "Valeria");
        HashMap<Integer, String> marksDest = new HashMap<>();
        for (Integer mark : marks.keySet()) {
            if (mark < 0){
                marksDest.put(mark * 3,marks.get(mark));
            }
            if (mark > 0){
                marksDest.put(mark * 2, marks.get(mark));
            }
        }
        System.out.println(marksDest);
        //В хешмапі типу інт - стрінг всі стрінги розвернути навпаки
        HashMap<Integer, String> revers = new HashMap<>();
        revers.put(1,"Hello");
        revers.put(2,"Advantage");
        revers.put(3,"Extracurricular");
        revers.put(4,"Fabulous");
        revers.put(5,"Well-off");
        revers.put(6,"Entertaining");
        for (Integer numeration : revers.keySet()){
            String empty = "";
            char [] arrRev = revers.get(numeration).toCharArray();
            for (int i = 0; i < arrRev.length; i++) {
                empty = arrRev[i] + empty;
            }
            revers.replace(numeration, empty);
        }
        System.out.println(revers);
        {}
    }
}
