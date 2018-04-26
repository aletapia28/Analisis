/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

import java.util.*;    
class Test {    
int a, b, c, d, e;   
    
public Test(int a, int b, int c, int d, int e) {    
    this.a = a;    
    this.b = b;    
    this.c = c;    
    this.d = d;    
    this.e = e;    
}    
}    
public class Timeline {    
public static void main(String[] args) {    
        
    Map<Integer,Test> map=new HashMap<Integer,Test>();    
        
    Test t1=new Test(1,2,3,4,5);    
    Test t2=new Test(6,7,8,9,10);        
       
    map.put(1,t1);  
    map.put(2,t2);   
       
    for(Map.Entry<Integer, Test> entry:map.entrySet()){    
        int key=entry.getKey();  
        Test t=entry.getValue();  
        System.out.println(key+" HashMap:");  
        System.out.println(t.a+" "+t.b+" "+t.c+" "+t.d+" "+t.e);   
    }    
}    
}    