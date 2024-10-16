package SCJP.cap2p116.code161024;

class Animal161024 { }
class Dog extends Animal161024{ }
class DogTest{
    public static void main(String[] args) {
        Animal161024 animal = new Animal161024();
        Dog d = (Dog) animal; //Cast exception
    }
}
