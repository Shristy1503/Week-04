package reflection.intermediate_level.retrieve_annotation;

import java.lang.annotation.Annotation;

public class RetrieveAnnotation {
    public static void main(String[] args) {
        try {
            // Get the Class object for MyClass
            Class<?> myClass = MyClass.class;

            // Check if the @Author annotation is present
            if (myClass.isAnnotationPresent(Author.class)) {
                // Retrieve the annotation
                Author authorAnnotation = myClass.getAnnotation(Author.class);

                // Display the annotation value
                System.out.println("Author Name: " + authorAnnotation.name());
            } else {
                System.out.println("No @Author annotation present.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
