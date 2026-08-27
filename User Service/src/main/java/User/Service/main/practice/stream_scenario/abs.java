package User.Service.main.practice.stream_scenario;

@FunctionalInterface
interface Person {
    int asp(int a, int b);
}

class bou {
    public static void main(String[] args) {
        Person person = (a, b) -> a + b;
        int c = person.asp(8,5);
        System.out.println(c);
    }
}

