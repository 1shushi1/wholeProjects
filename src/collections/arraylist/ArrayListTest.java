package collections.arraylist;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        // Заджди виводить тільки кількість наявних елементів в масиві
        System.out.println(words.size());
        words.add("Hello"); // додає елемент в кінець масиву
        words.add("World");
        // method of the class collections which add a list of values into an array
        Collections.addAll(words, "one", "two", "three", "four", "five",
                "six", "seven", "eight");
        System.out.println(words);
        words.add(0, "Stasya"); // insert/paste a value into some position(index)
        System.out.println(words);
        String name = words.get(0); // give you a copy of the value from particular position(index)
        System.out.println();
        int size = words.size(); // gives us a size of the array
        System.out.println(size);
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            System.out.print(word + " ");
        }
        System.out.println("\n");
        for (int i = words.size() - 1; i >= 0; i--) {
            String word = words.get(i);
            System.out.println(word);
        }
        System.out.println();
        boolean contains = words.contains("Stasya"); // перевіряє чи містить певне значення
        System.out.println(contains);
        int index = words.indexOf("eight"); // повертає індекс, де лежить передане значення
        // якщо вона є в масиві, якщо його немає, то повертає -1

        System.out.println(index);
        words.add(null);
        words.add(0, null);
        System.out.println(words);
        int indexOfEight = words.indexOf("eight");
        // завжди перевіряти на відсутність -1
        words.set(indexOfEight, "Vasya"); // заміняє на певні позиції іншим значенням
        System.out.println(words);
        //Якщо в нас декілька однакових значень, то indexOf видасть індекс який найближчий
        //до нульової комірки(індекса)
        int indexOfNull = words.indexOf(null);
        System.out.println(indexOfNull);
        int lastIndexOfNull = words.lastIndexOf(null); //видасть індекс комірки, яка найближча
        //до останьої комірки
        ArrayList<String> wordsForJoin = new ArrayList<>();
        Collections.addAll(wordsForJoin, "Petya", "Sasha", "Tanya", "Masha", "Tolya");
        words.addAll(wordsForJoin);
        System.out.println(words);
        words.addAll(1, wordsForJoin);
        System.out.println(words);
        boolean checker = words.remove("Vasya");
        System.out.println(checker);
        String removeWithIndex = words.remove(4);
        System.out.println(removeWithIndex);
        //створити лист для інтів та видалити всі відємне значення
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 34, 5, 6, 7, 88, -4, 5, -3, -10, 10, 10, 12, 1, 2, 5, 7, 6, 12, -65, 19, -9);
        for (int i = numbers.size() - 1; i > 0; i--) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
        ArrayList<Integer> removalNumbers = new ArrayList<>();
        Collections.addAll(removalNumbers, 10, 1, 2, 5, 6, 7, 88, 19);
        numbers.removeAll(removalNumbers);
        System.out.println(numbers);
        System.out.println(words);
        words.clear(); // чистить масив повністю
        System.out.println(words);
        // є лист стрінгів з дублікатами. З використанням іншого листа отримати набір унікальних значень
        ArrayList<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, "Michael Kors", "Balinciaga", "GUCCI", "Prada", "Prada", "Pinko", "Dior", "Dior");
        ArrayList<String> wordsWithOutDuplicates = new ArrayList<>();
        for (int i = 0; i < wordsList.size(); i++) {
            if (!wordsWithOutDuplicates.contains(wordsList.get(i))) {
                wordsWithOutDuplicates.add(wordsList.get(i));
            }
        }
        System.out.println(wordsWithOutDuplicates);
        for (String word : wordsList) {
            if (!wordsWithOutDuplicates.contains(word)) {
                wordsWithOutDuplicates.add(word);
            }
        }
        System.out.println(wordsWithOutDuplicates);
        //в листі з інтами знайти максимум і мінімум
        ArrayList<Integer> minMax = new ArrayList<>();
        Collections.addAll(minMax, 5, 10, 15, -9, 8, 14, -16, 43, -13, 55);
        int max = 0;
        int min = 0;
        for (int number : minMax) {
            if (number > max) {
                max = number;
            } else {
                min = number;
            }
        }
        System.out.println("Min value is : " + min + "\n" + "Max value is : " + max);
        //є лист інтів всі відʼємні зробити додітніми та навпаки
        ArrayList<Integer> numbersChanger = new ArrayList<>();
        Collections.addAll(numbersChanger, 5, 10, 15, -9, 8, 14, -16, 43, -13, 55, 1, 2, 34, 5, 6, 7, 88, -4, 5, -3, -10, 10, 10, 12, 1, 2, 5, 7, 6, 12, -65, 19, -9);
        for (int i = 0; i < numbersChanger.size(); i++) {
            numbersChanger.set(i, numbersChanger.get(i) * -1);
        }
        System.out.println(numbersChanger);
        //є лист. зробити з нього обертня(новий лист)
        ArrayList<Integer> viceVersa = new ArrayList<>();
        Collections.addAll(viceVersa, 5, 10, 15, -9, 8, 14, -16, 43, -13, 55, 1, 2, 34, 5, 6, 7, 88, -4, 5, -3, -10, 10, 10, 12, 1, 2, 5, 7, 6, 12, -65, 19, -9);
        ArrayList<Integer> collector = new ArrayList<>();
        for (int i = viceVersa.size() - 1; i > 0; i--) {
            collector.add(viceVersa.get(i));
        }
        System.out.println("--------------------------");
        for (int i = 0, j = collector.size() - 1; i < collector.size() / 2; i++, j--) {
            int temp;
            temp = collector.get(i);
            collector.set(i, collector.get(j));
            collector.set(j, temp);
        }
        System.out.println(collector);
        // склеїти два ліста
        ArrayList<Integer> collab = new ArrayList<>();
        Collections.addAll(collab, 5, 10, 15, -9, 8, 14, -16, 43);
        ArrayList<Integer> collaboration = new ArrayList<>();
        Collections.addAll(collaboration, -13, 55, 1, 2, 34, 5, 6);
        collab.addAll(collaboration); // за допомогою addAll ми можемо додати два ArrayList'a
        System.out.println(collab);
        System.out.println("Is ArrayList collab empty?" + " - " + collab.isEmpty());

        //є масив з стрінгами з дублікатами. Порахувати кількість кожного зі стрінгів в ньому
        // з використанням 2-х листів
        String[] arr = {"Vasya", "Vasya", "Petya", "Ivan", "Vasya", "Petya"};
        ArrayList<String> originalWords = new ArrayList<>();
        ArrayList<Integer> wordsRepetition = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!originalWords.contains(arr[i])) {
                originalWords.add(arr[i]);
                wordsRepetition.add(1);
            } else {
                int indexPos = originalWords.indexOf(arr[i]);
                int values = wordsRepetition.get(indexPos);
                values++;
                wordsRepetition.set(indexPos, values);
            }
        }
        System.out.println(originalWords);
        System.out.println(wordsRepetition);
        ArrayList<Integer>sorting = new ArrayList<>();
        Collections.addAll(sorting, 1,4,5,67,7,12,-5,7,10,32);
        Collections.sort(sorting);
        System.out.println(sorting);
        //є лист з однаковою кількістю додатніх та відємних елементів. Зробити їх в шахматному порядку
        ArrayList<Integer> arrList = new ArrayList<>();
        Collections.addAll(arrList, 1,3,-6,5,7,8,9,-4,-10,-1,-5,-3);
        Collections.sort(arrList);
        for (int i = 1, j = arrList.size() - 2; i < arrList.size()/2; i+=2, j-=2) {
                int temp;
                temp = arrList.get(i);
                arrList.set(i, arrList.get(j));
                arrList.set(j, temp);
        }
        System.out.println(arrList);
    }
}
