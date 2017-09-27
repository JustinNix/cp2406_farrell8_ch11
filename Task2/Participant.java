public class Participant {
    String name;
    int age;
    String address;

    public Participant(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + address;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if()
//    }
}
