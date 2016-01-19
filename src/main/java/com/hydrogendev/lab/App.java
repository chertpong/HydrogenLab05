package com.hydrogendev.lab;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public int fibo(int targetIndex){
        int fib0 = 0;
        int fib1 = 1;

        if(targetIndex == 0) return fib0;
        if(targetIndex == 1) return fib1;

        return fibo(targetIndex-1)+fibo(targetIndex-2);
    }
}
