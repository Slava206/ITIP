public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация иерархии приложений ===\n");
        
        System.out.println("=== ПОЛИМОРФИЗМ ===");
        
        // Социальная сеть
        App socialApp = new SocialNetwork("VK", 250.5, 4.3, 50000000, "Mobile");
        socialApp.displayInfo();
        socialApp.start();
        socialApp.close();
        System.out.println("---");
        
        // Игра
        App gameApp = new Game("Angry Birds", 150.0, 4.8, "Puzzle", 50);
        gameApp.displayInfo();
        gameApp.start();
        gameApp.close();
        System.out.println("---");
        
        // Погода
        App weatherApp = new Weather("Yandex Weather", 80.2, 4.1, "Moscow", 10);
        weatherApp.displayInfo();
        weatherApp.start();
        weatherApp.close();
        System.out.println("---");
        
        // Демонстрация счетчика объектов
        System.out.println("=== СЧЕТЧИК ОБЪЕКТОВ ===");
        new SocialNetwork();
        new SocialNetwork("Instagram", 300.0, 4.5, 1000000000, "Mobile");
        System.out.println("Создано социальных сетей: " + SocialNetwork.getSocialNetworkCount());
    }
}