package com.training.java;

class Animal2{  
void eat(){System.out.println("eating...");}  
}  

//Hierarchical Inheritance Example
class Dog2 extends Animal2{  
void bark(){System.out.println("barking...");}  
}  

//Hierarchical Inheritance Example
class Cat2 extends Animal2{  
void meow(){System.out.println("meowing...");}  
}  


class TestInheritance3{  
public static void main(String args[]){  
Cat2 c=new Cat2();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  
}}  