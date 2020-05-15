import org.testng.annotations.Test;

public class FirstClass<b> {
    @Test
    public void test001() {

        System.out.println("Hello First Automation Class!");
    }

    @Test
    public void test002() {
        int myNumber = 5;
        System.out.println(myNumber);

    }

    @Test
    public void test003() {
        String messageOne = new String("Who let the dogs out?");

        String messageTwo = "Who who who who!";

        String completeMessage = messageOne + messageTwo;

        System.out.println(completeMessage);

    }

    @Test
    public void test004() {
        int num = 5;
        String message = "I have " + num + " cookies";
        System.out.println(message);

    }

    @Test
    public void test005() {
        boolean toBe = false;
        boolean b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }

    }

    @Test
    public void test006() {
        int a = 5;
        if (a == 5)
            System.out.println("Ah, a is equal 5!");
        else
            System.out.println("Oh, well, a is not 5...");
        }


    @Test
    public void test007() {
        int [] arr = {1, 2, 3, 4};
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}



