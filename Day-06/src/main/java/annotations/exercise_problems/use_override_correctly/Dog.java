package annotations.exercise_problems.use_override_correctly;

public class Dog extends Animal {
    // Overriding the makeSound() method and use annotation @override
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}
