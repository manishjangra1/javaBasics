
// Packages and access Modifiers

//package can be a folder
// we can have package inside a package

// example : com.manishjangra

package com.manishjangra.files;

//to include a file or something from a file which is located in other package
// we can import that by using the below synrax

// import packageName.*;    <--- it will include everything from that package

public class Code10 {
    public int a = 20;
    public static void main(String[] args) {
        Code10 code10 = new Code10();
        C obj = new C(code10);
        obj.functionName();
    }
}

class C {
    Code10 code10;
    public C(Code10 code10){
        this.code10 = code10;
        System.out.println("C constructor called");
    }

    public void functionName(){
        System.out.println(code10.a+20);
    }
}

// if access modifier used is public, then:
// Called in
//{same class: yes,
//same package subclass: yes,
// same package non-subclass: yes,
// different package subclass: yes,
// different package non-subclass: yes} 

//if access modifier is default, then:
// {same class: yes, same package: yes, same package non-subclass: yes, different package subclass: no, different package non-subclass: no}

//if access is protected, then
//{accessed anywhere except different package non-subcass}

//if access is private, then
//{accessed only inside the same class}


// to make stop overriding, make it final

final class FinalClass{

    final int num = 45;

    final void functionName(){

    }
}


