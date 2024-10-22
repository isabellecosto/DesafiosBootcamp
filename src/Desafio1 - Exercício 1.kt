abstract class Animal(var name: String){
    open fun makeSound() {}
}
class Dog(name: String): Animal(name){
    override fun makeSound() {
        println("Woof")
    }
}
class Cat(name: String): Animal(name){
    override fun makeSound(){
        println("Miau")
    }
}

fun main() {
    val dog: Animal = Dog("Dog")
    dog.makeSound()
    val cat: Animal = Cat("Cat")
    cat.makeSound()
}