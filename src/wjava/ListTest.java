package wjava;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<String>();
        list.add("params 1");
        list.add("params 2");
        List<? extends Object> objectList=list;
        List<Object> list1=((List<Object>)objectList);
        list1.add(1);
        System.out.println(list.get(2));
    }
}
