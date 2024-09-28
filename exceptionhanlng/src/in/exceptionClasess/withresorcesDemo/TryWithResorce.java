package in.exceptionClasess.withresorcesDemo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TryWithResorce {
    public void sorted(int... intArray){
        try(IntStream intStream=Arrays.stream(intArray)){
            intStream.sorted().forEach(e->System.out.println(e));
            
        }
    }

}
