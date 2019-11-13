/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayuni;


public class ArrayUni {

    private void inicio(){
    int[] array;
    array = new int[5];
    array[0]=1;
    array[1]=2;
    array[2]=3;
    array[3]=4;
    array[4]=5;
    int fin=array.length;
    
        for(int w =0;w<fin;w++){
            System.out.println(array[w]);
        }
    }
    
    public static void main(String[] args) {
        ArrayUni var = new ArrayUni();
        var.inicio();
    }
    
}
