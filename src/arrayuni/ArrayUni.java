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
    
        //imprime una array hecha por mi
        for(int w =0;w<fin;w++){
            System.out.println(array[w]);
        }
        
        //Da valor 0 una array, 1 en la diagonal y la imprime
   array2 = new int[10][10];
    int end=array2.length;
   
    //1r for para la altura
        for(int i=0;end>i;i++){
            //2ndo for para la longitud
            for(int j=0;end>j;j++){
            array2[i][j]=0;
                if (j==i){
                array2[i][j]=1;
                }
                 System.out.print(array2[i][j]);
            }
            System.out.println();
            
        }     
        
        
    }
    
    public static void main(String[] args) {
        ArrayUni var = new ArrayUni();
        var.inicio();
    }
    
}
