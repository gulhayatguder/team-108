package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4};
        List<Integer> list1 = new ArrayList<>();
        for (int each : arr
        ) {
            list1.add(each);


        }
        System.out.println(list1);

        // array deki  cift sayilari olusturacaginmiz bir liste olusturalim}


            

    }
}