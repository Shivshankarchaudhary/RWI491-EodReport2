class Man {
    void run() {
        System.out.println("man can purchase house");
    }
}

class RunTimePolymorphism extends Man {
    void run() {
        System.out.println("Women can purchase house");
    }

    public static void main(String args[]) {
        RunTimePolymorphism obj1 = new RunTimePolymorphism();
        Man obj2 = new RunTimePolymorphism();
        obj1.run();
        obj2.run();
    }
}