package Laba3;
import java.util.LinkedList;

public class HashTable<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Entry<K,V>>[] table;
    private int size;
    private int capacity = 16;

    @SuppressWarnings("unchecked")      // Убираем предупреждение
    public HashTable(){
        table = new LinkedList[capacity];
        size = 0;
    }

    //Хэш-функция
    private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }

    // Добавить или обновить эелемент
    public void put(K key, V value){
        int index = hash(key);
        if (table[index] == null){
            table[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : table[index]){
            if (entry.key.equals(key)){
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
        size++;
    }

    // Получить значение по ключу
    public V get(K key){
        int index = hash(key);
        if (table[index] == null){
            return null;
        }
        for(Entry<K, V> entry : table[index]){
            if (entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }

    // Удалить елемент по ключу
    public V remove(K key){
        int index = hash(key);
        if (table[index] == null){
            return null;
        }
        var iterator = table[index].iterator();
        while (iterator.hasNext()) {
            Entry<K, V> entry = iterator.next();
            if (entry.key.equals(key)){
                V value = entry.value;
                iterator.remove();
                size--;
                return value;
            }
        }
        return null;
    }

    // Количество элементов
    public int size(){
        return size;
    }
    // Пустая ли таблица
    public boolean isEmpty(){
        return size == 0;
    }

    public void print(){
        System.out.println("Хэш-таблица:");
        for (int i = 0; i < capacity; i++){
            System.out.print(i + ": ");
            if (table[i] == null){
                System.out.println("пусто");
            } else{
                for (Entry<K, V> entry : table[i]){
                    System.out.print("[" + entry.key + " = " + entry.value + "]");
                }
            System.out.println();
            }
        }
        System.out.println("Всего елементов: " + size);
    }

}