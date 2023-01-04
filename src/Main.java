import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Мурка", new Cat("Мурка", 10));
        cats.put("Алиса", new Cat("Алиса", 8));
        cats.put("Лолита", new Cat("Лолита", 5));
        cats.put("Алекс", new Cat("Алекс", 3));
        cats.put("Бетси", new Cat("Бетси", 11));
        cats.put("Шарлотта", new Cat("Шарлотта", 7));
        cats.put("Фиона", new Cat("Фиона", 6));
        cats.put("Пелагея", new Cat("Пелагея", 1));
        cats.put("Анфиса", new Cat("Анфиса", 7));
        cats.put("Барсик", new Cat("Барсик", 4));
        Cat cat = new Cat("Марыся", 7);
        cats.put("Марыся", cat);
        System.out.println(cats);
        System.out.println();
        System.out.println(cats.get("Фиона")); //возвращает значение объекта по ключу
        System.out.println(cats.containsKey("Барсик")); //возвращает true, если коллекция содержит ключ
        System.out.println(cats.containsValue(cat)); //возвращает true, если коллекция содержит значение
        System.out.println(cats.size()); //возвращает размер коллекции
        System.out.println(cats.keySet()); // возвращает набор всех ключей отображения
        System.out.println(cats.values()); // возвращает набор всех значений отображения
        System.out.println(cats.isEmpty()); // возвращает true, если коллекция пуста
    }
}