public class Car<K, V> {
    private K key;
    private V value;

    public Car(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void showTypes() {
        System.out.println("Типы");
        System.out.println("<K>: " + key.getClass().getSimpleName());
        System.out.println("<V>: " + value.getClass().getSimpleName());
        System.out.println();
    }

    public void getKeysAndValues() {
        System.out.println("Ключ и значение");
        System.out.println("<K>: " + getKey());
        System.out.println("<V>: " + getValue());
        System.out.println();
    }

    public static <T> void getTypeOfMethod(T t) {
        System.out.println("Метод работает с типом: " + t.getClass().getSimpleName());
    }

    public static void getInfo(Car<Integer, String> car) {
        System.out.println("РАБОТА С ОБЪЕКТОМ: " + car.getClass().getName());
        System.out.println();
        car.showTypes();
        car.getKeysAndValues();
        getTypeOfMethod(car);
        System.out.println("----------------------------------------------------------");
    }

    public static void main(String[] args) {
        Car<Integer, String> car = new Car<>(1, "Car");
        getInfo(car);

        Toyota<Integer, String> toyota = new Toyota<>(2, "Toyota");
        getInfo(toyota);

        Nissan<Integer, String> nissan = new Nissan<>(3, "Nissan");
        getInfo(nissan);
    }
}
