public class Student {
    private final String name;
    private final Integer age;
    private final String city;
    private final Double distance_native_city;
    private int[] marks;


    public Student(String name, Integer age, String city, Double distanceNativeCity) {
        this.name = name;
        this.age = age;
        this.city = city;
        distance_native_city = distanceNativeCity;
    }

    public double getAvgMarks(){
        int summ = 0;
        for(var mark: marks){
            summ += mark;
        }
        return (double) summ / marks.length;
    }
}
