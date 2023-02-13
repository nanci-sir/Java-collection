package unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {

        //1.不可变的list集合
        List<Double> lists = List.of( 567.3, 323.6, 677.8, 570.4 );
        System.out.println( lists );
        //不支持添加操作
        //lists.add(988.0);
       // System.out.println( lists );
        //不支持修改
        //lists.set( 2,677.9 );
        double score = lists.get(1);
        System.out.println( score );

        //2.不可变的set集合 不允许重复修改
       Set<String> names =  Set.of("低级","空间","多少","换的");
        //不支持添加操作
        //names.add("跟胡");
        System.out.println( names );

        //3.不可变的Map集合 不允许重复修改
        Map<String,Integer> maps = Map.of("huawei",2,"java",1,"手表",8);
        //maps.put("衣服",3);
        System.out.println( maps );


    }
}