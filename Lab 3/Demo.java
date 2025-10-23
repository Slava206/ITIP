package Laba3;
public class Demo {
    public static void main(String[] args) {
        HashTable<String, Integer> table = new HashTable<>();
        System.out.println("___Хэш-таблица___");    

        // Добавляем елементы
        table.put("Яблоки", 100);
        table.put("Груши", 80);
        table.put("Апельсины", 150);

        // Выводим таблицу
        table.print();
        System.out.println();

        // Получаем значения
        System.out.println("Цена яблок: " + table.get("Яблоки"));
        System.out.println("Цена груш: " + table.get("Груши"));
        System.out.println("Цена бананов: " + table.get("Бананы"));     //null
        System.out.println();

        // Меняем цену
        table.put("Груши", 100);
        System.out.println("Новая цена груш:" + table.get("Груши"));
        System.out.println();

        // Удаляем елемент
        table.remove("Апельсины");
        System.out.println("После удаления апельсинов: ");
        table.print();
        System.out.println();

        // Проверяем размер
        System.out.println("Размер таблицы: " + table.size());
        System.out.println("Таблица пустая:" + table.isEmpty());
    }
}