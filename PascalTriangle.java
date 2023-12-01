package DSA;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows){
        List<Integer> myList = new ArrayList<>();

        List<List<Integer>> out = new ArrayList<>();
        for (int i=1; i<=numRows; i++){
            if (i==1){
                myList.add(1);
                out.add(myList);
            } else if (i==2) {

                myList = new ArrayList<>();
                myList.add(1);
                myList.add(1);
                out.add(myList);
            }else {
                List<Integer> temp = out.get(out.size()-1);
                myList = new ArrayList<>();
                myList.add(1);
                for (int j=0; j<temp.size()-1; j++){
                    myList.add(temp.get(j) + temp.get(j+1));
                }
                myList.add(1);
                out.add(myList);
            }
        }

        return out;
    }
    public static void main(String[] args) {
        List<List<Integer>> out = generate(5);
        System.out.println(out);
    }
}
