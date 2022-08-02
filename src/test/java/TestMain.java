import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class TestMain {
    public static void main(String[] args) {
        TestModel testModel = new TestModel();
        Class<? extends TestModel> clazz = testModel.getClass();
        System.out.println("======================================");
        System.out.println("Annotations (Class)");
        for (Annotation annotation : clazz.getDeclaredAnnotations())
            System.out.println(" - " + annotation.toString());
        for (Field field : testModel.getClass().getFields()) {
            try {
                System.out.println("--------------------------------------");
                System.out.println("Field: " + field.getName() + " (" + field.getGenericType().getTypeName() + ")");
                System.out.println("Annotations");
                for (Annotation annotation : field.getDeclaredAnnotations())
                    System.out.println(" - " + annotation.toString());
                Object fieldValue = field.get(testModel);
                if (fieldValue != null)
                    System.out.println("Default Value: " + fieldValue);
                System.out.println("--------------------------------------");
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("======================================");
    }
}
