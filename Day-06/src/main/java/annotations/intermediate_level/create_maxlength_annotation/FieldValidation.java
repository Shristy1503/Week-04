package annotations.intermediate_level.create_maxlength_annotation;
import java.lang.reflect.Field;
public class FieldValidation {
    // Username should not exceed 10 characters
    @MaxLength(10)
    private String username;

    public FieldValidation(String username) {
        this.username = username;
        // validate field length
        validateMaxLength();
    }

    private void validateMaxLength() {
        try {
            for (Field field : this.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(MaxLength.class)) {
                    // allow access to private fields
                    field.setAccessible(true);
                    // get field value
                    String value = (String) field.get(this);
                    int maxLength = field.getAnnotation(MaxLength.class).value();

                    if (value.length() > maxLength) {
                        throw new IllegalArgumentException(
                                field.getName() + " exceeds max length of " + maxLength
                        );
                    }
                }
            } //catch the exception occurred
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
