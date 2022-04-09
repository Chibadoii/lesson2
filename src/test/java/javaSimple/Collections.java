package javaSimple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0]=1;
        nums[1]=10;
        try{
            nums[2]=1;
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }finally {
            System.out.println("OUps");
        }

        System.out.println(nums[1]);

        String[] str = {"2","4","8"};
        System.out.println(str[1]);

        ArrayList <String> list = new ArrayList<>();
        list.add("sdferiwerwreцц");
        list.add("ergerg");
        list.add("er1561");
        list.add("15165166");

        for (int i = 0; i< list.size();i++) {
            System.out.println(list.get(i));
        }

        for (String s: list){
            System.out.println(s);
        }

        list.forEach(s -> System.out.println("stream = " +s));
        list.stream().filter(s -> s.length()<14).forEach(s -> System.out.println("filtered = "+ s));
        list.stream().filter(s -> s.contains("a")).forEach(s -> System.out.println("filtered2 = "+ s));

        ArrayList<String> secondList = (ArrayList<String>)list.stream().filter(s -> s.length()<14).collect(Collectors.toList());
        secondList.forEach(s -> System.out.println(s));

        HashMap<String,String> map = new HashMap<>();
        map.put("Key1","Value1");
        map.put("Key2","sgregaerge");
        System.out.println(map.get("Key2"));

        Set<String> set;
        set = map.keySet();
        set.forEach(s -> System.out.println("keys="+s));

        for(String s: set){
            System.out.println("Значение ключа "+ s + "=" + map.get(s));
        }
/*
        for (Map.Entry<String,String> m : map.entrySet());
        System.out.println("Key =" + n.getKey());
        System.out.println("Value =" + m.getValue());
 */

        //Задание с коллекциями



        list.stream().filter(s -> s.length()<7).forEach(s -> System.out.println("Значения с размером строки меньше 7 = "+ s));
        list.stream().filter(s -> s.contains("66")).forEach(s -> System.out.println("Значения с ц = "+ Integer.parseInt(s)));
        list.stream().filter(s -> s.contains("66")).forEach(s -> System.out.println("Значения с ц = "+ Float.parseFloat(s)));
    }



}
