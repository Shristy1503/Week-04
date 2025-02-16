package annotations.intermediate_level.create_maxlength_annotation;

public class MaxLengthAnnotationMain {
    public static void main(String[] args) {
        try {
            FieldValidation user1 = new FieldValidation("JohnDoe");
            System.out.println("User1 created successfully.");

            // Invalid
            FieldValidation user2 = new FieldValidation("VeryLongUsername123");
            // Will not execute
            System.out.println("User2 created successfully.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
