package tomb_tetelek_gyakorlasa;
import java.math.*;
import java.util.Scanner;

public class Tomb_tetelek_gyakorlasa {

    public static void main(String[] args) {
        String var = "i";
        Scanner sc;
        sc = new Scanner(System.in);
        do{
        int szam1 =(int)  (Math.random()*20)+10;
        int szam2 =(int)  (Math.random()*20)+10;
        int tomb1[] =new int[szam1];
        int tomb2[] =new int[szam2];
        int tombPar[] = new int[szam1+szam2];
        int k = 0;
        for(int i =0;i<szam1;i++){
            tomb1[i] = (int) (Math.random()*100)-50;
        }
        for(int i =0;i<szam2;i++){
            tomb2[i] = (int) (Math.random()*100)-50;
        }
        for(int i =0;i<szam1;i++){
            System.out.print(String.format("%,3d",tomb1[i])+" ");
        }
        System.out.println("\n");
        for(int i =0;i<szam2;i++){
            System.out.print(String.format("%,3d",tomb2[i])+" ");
        }
        for(int i =0;i<szam1;i++){
            if(tomb1[i]%5 == 0 && tomb1[i]%2 ==0 && tomb1[i] !=0){
                tombPar[k] = tomb1[i];
                k++;
            }
        }
        for(int i =0;i<szam2;i++){
            if(tomb2[i]%5 == 0 && tomb2[i]%2 == 0 && tomb2[i] !=0){
                tombPar[k] = tomb2[i];
                k++;
            }
        }
        System.out.println("\n");
        for(int i =0;i<k;i++){
            System.out.print(String.format("%,3d",tombPar[i])+" ");
        }
        int min =1000;
        int max = -1000;
        for(int i =0;i<k;i++){
            if(tombPar[i]<min){
            min = tombPar[i]; }
            if(tombPar[i]>max){
            max = tombPar[i]; }
        }
        System.out.println("\nmax= "+max+" min= "+min);
        System.out.println(0/5);
        if(max%min == 0){
            System.out.println("Igen");
        }
        System.out.println("Ha szeretné újra futtatni i/n: ");
        var = " ";
        var = sc.nextLine();
        }while("i".equals(var));
    
    }
}