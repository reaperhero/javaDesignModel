package obserber;

public class CurrentConditions {
    // 温度 气压 湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新天气情况，是由WeatherData来调用，我使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("=======Today mTemperature" + temperature + "=======");
        System.out.println("=======Today mpressure" + pressure + "=======");
        System.out.println("=======Today mhumidity" + humidity + "=======");
    }
}
