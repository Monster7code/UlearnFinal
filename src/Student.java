import java.util.Random;


public class Student {
    private final String name;
    private final Integer age;
    private final String city;
    private final int distance_native_city;
    private int[] marks;


    public Student(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        distance_native_city = GetRandomDistance();
    }

    public double getAvgMarks(){
        int summ = 0;
        for(var mark: marks){
            summ += mark;
        }
        return (double) summ / marks.length;
    }

    public int GetRandomDistance(){
        // Создаем объект Random
        Random random = new Random();

        // Генерируем случайное число от 1 до 70000
        int randomNumber = random.nextInt(70000) + 1; // +1, чтобы включить 1 в диапазон

        // Выводим сгенерированное число
        return randomNumber;
    }
}
