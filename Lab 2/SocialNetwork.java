public class SocialNetwork extends App {
    private int usersCount;
    private boolean hasMessages;
    private String platform; // mobile, web.
    private static int socialNetworkCount = 0; // Счетчик
    
    public SocialNetwork() {
        super();
        this.usersCount = 0;
        this.hasMessages = true;
        this.platform = "Mobile";
        socialNetworkCount++;
    }
    
    public SocialNetwork(String name, double size, double rating, int usersCount, String platform) {
        super(name, size, rating);
        this.usersCount = usersCount;
        this.platform = platform;
        this.hasMessages = true;
        socialNetworkCount++;
    }
    
    @Override           // Переопределение
    public void start() {
        System.out.println(name + " Социальная сеть загружается... Добро пожаловать!");
    }
    
    @Override
    public void close() {
        System.out.println("Выход из системы " + name);
    }
    
    public void postMessage() {
        System.out.println("Сообщение, опубликованное в " + name);
    }
    
    public void addFriend() {
        System.out.println("Добавлен в друзья! Всего пользователей: " + usersCount);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Пользователей: " + usersCount + ", Платформа: " + platform + ", Сообщения: " + hasMessages);
    }
    
    // Геттеры и сеттеры
    public int getUsersCount() { return usersCount; }
    public void setUsersCount(int usersCount) { this.usersCount = usersCount; }
    
    public boolean isHasMessages() { return hasMessages; }
    public void setHasMessages(boolean hasMessages) { this.hasMessages = hasMessages; }
    
    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }
    
    public static int getSocialNetworkCount() { return socialNetworkCount; }
}