package packpage;

import java.util.ArrayList;

public class RomanToInt {

    public static int romanToInt(String s){
        int value = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i=0; i< s.length(); i++){

            switch (s.charAt(i)) {
                case 'I':
                    a.add(1);
                    break;
                case 'V':
                    a.add(5);
                    break;
                case 'X':
                    a.add(10);
                    break;
                case 'L':
                    a.add(50);
                    break;
                case 'C':
                    a.add(100);
                    break;
                case 'D':
                    a.add(500);
                    break;
                case 'M':
                    a.add(1000);
                    break;
            }
        }


        while (a.size() > 1){  //tem pelo menos 2 termos
            if(a.get(0) >= a.get(1)){
                value += a.get(0);
                a.remove(0);
            }else{
                value += (a.get(1) - a.get(0));
                a.remove(1);
                a.remove(0);
            }
        }if(a.size() == 1){
            value += a.get(0);
        }

        return value;
    }
}
