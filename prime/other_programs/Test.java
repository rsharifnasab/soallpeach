

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

    public static boolean isPrime(int i) {
        if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0 ) {
            return false;
        } else {
            long sqrti = (long) Math.sqrt(i) + 1;
            for (long j = 6L; i<= sqrti;i=+6 ){
                if(i%(j-1)==0 || i%(j+1)==0)
                    return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(s -> {
                if (isPrime(Integer.parseInt(s))) {
                    System.out.println(1);

                } else {
                    System.out.println(0);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
