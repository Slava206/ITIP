public class Weather extends App {
    private String location;
    private boolean hasNotifications;
    private int forecastDays;
    
    public Weather() {
        super();
        this.location = "Текущее местоположение";
        this.hasNotifications = true;
        this.forecastDays = 7;
    }
    
    public Weather(String name, double size, double rating, String location, int forecastDays) {
        super(name, size, rating);
        this.location = location;
        this.forecastDays = forecastDays;
        this.hasNotifications = true;
    }
    
    @Override
    public void start() {
        System.out.println(name + " запущено приложение \"Погода\". Проверка погоды в " + location);
    }
    
    @Override
    public void close() {
        System.out.println("приложение " + name + " закрыто");
    }
    
    public void checkWeather() {
        System.out.println("Проверка прогноза погоды на " + forecastDays + " дней в " + location);
    }
    
    public void setLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Местоположение изменено на: " + newLocation);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Локация: " + location + ", Дни: " + forecastDays + " дней, Уведомдение: " + hasNotifications);
    }
    
    // Геттеры и сеттеры
    public String getLocation() { return location; }
    
    public boolean isHasNotifications() { return hasNotifications; }
    public void setHasNotifications(boolean hasNotifications) { this.hasNotifications = hasNotifications; }
    
    public int getForecastDays() { return forecastDays; }
    public void setForecastDays(int forecastDays) { this.forecastDays = forecastDays; }
}
