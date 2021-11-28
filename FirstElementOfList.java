package Assignment7;
import java.util.*;
import java.util.stream.*;
public class FirstElementOfList {
        public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
            for (Integer integer : myList) {
                System.out.println(integer);
                break;
            }
        }
    }

