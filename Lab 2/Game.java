public class Game extends App {
    private String genre;
    private int levels;
    private boolean isMultiplayer;

    public Game() {
        super();
        this.genre = "Arcade";
        this.levels = 1;
        this.isMultiplayer = false;
    }

    public Game(String name, double size, double rating, String genre, int levels){
        super(name, size, rating);
        this.genre = genre;
        this.levels = levels;
        this.isMultiplayer = true;
    }

    @Override
    public void start() {
        System.out.println("Запускаем игру " + name + " Готово");
    }

    @Override
    public void close() {
        System.out.println("Сохранение прогресса игры... " + name + " закрыто");
    }
    
    public void playLevel() {
        System.out.println("Игровой уровень " + genre + " игра: " + name);
    }
    
    public void highScore() {
        System.out.println("Новый рекорд в " + name + "!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Жанр: " + genre + ", Уровень: " + levels + ", Мультипеллер: " + isMultiplayer);
    }
    
    // Геттеры и сеттеры
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    
    public int getLevels() { return levels; }
    public void setLevels(int levels) { this.levels = levels; }
    
    public boolean isMultiplayer() { return isMultiplayer; }
    public void setMultiplayer(boolean multiplayer) { isMultiplayer = multiplayer; }
}