# Java-collection
创建不可变集合
## 1.1如何创建不可变集合？

在List、Set、Map接口中，都存在of方法，可以创建一个不可变的集合

| 方法名称                                  | 说明                               |
| ----------------------------------------- | ---------------------------------- |
| static  <E> List<E> of(E…elements)        | 创建一个具有指定元素的List集合对象 |
| static  <E> Set<E> of(E…elements)         | 创建一个具有指定元素的Set集合对象  |
| static <K  , V>  Map<K，V> of(E…elements) | 创建一个具有指定元素的Map集合对象  |

这个集合不能添加，不能删除，不能修改。

## 1.2不可变集合的特点？

定义完成后不可以修改，或者添加、删除

## 1.3如何创建不可变集合？

List、Set、Map接口中，都存在of方法可以创建不可变集合

```java
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
```
