abstract class App {
    protected String name;
    protected double size;      // в МБ
    protected double rating;

    // Конструкторы
    public App(){
        this.name = "Неизвестное приложение";
        this.size = 0;
        this.rating = 0.0;
    }

    public App(String name, double size, double rating){
        this.name = name;
        this.rating = rating;
        this.size = size;
    }

    // Абстрактные методы
    public abstract void start();
    public abstract void close();

    // Обычные методы
    public void displayInfo(){
        System.out.println("App: " + name + ", Size: " + size + "MB, Rating: " + rating + "/5");
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }
}