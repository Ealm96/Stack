package com.Andrew;

public class Stack{
    int top = -1;
    int[] A;
    //Sets the size of the array
    public Stack(int x){
        A = new int [x];
    }
    //places an item on the top of the stack
    public void push(int x){
        top++;
        A[top] = x;
    } 
    //takes top item off of the stack   
    public void pop(){
        top--;
    }
    //returns where the top of the stack is 
    public int top(){
        if(A[top]==A.length - 1){
            resize();
        }
             return A[top];
    }
    //reports whether the stack is empty or not
    public boolean isEmpty(){
        return top==-1;
    }
    // makes the array for the stack larger.
    private void resize(){
        int[] B = new int [A.length * 2];
            for(int i = 0; i<A.length; i++){
                B[i] = A[i];
            }
            A = B;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
