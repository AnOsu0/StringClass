package Lesson;

public class StrinTest {
    public static void main(String[] args) {

        long start = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
           builder.append(i);
           builder.append(" ");
        }
        long time = System.nanoTime();
        System.out.println(builder);
        System.out.println("Czas wykonywania pętli to " + (time-start) + " nanosekund");
    }
}
