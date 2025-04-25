package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       float voto, sbt=0, globo=0, record=0, bandeirantes=0, nulo=0, espectadores=0, branco=0, total;
       while(true){
           System.out.printf("Que canal você estava assistindo?\n 1=SBT \t 2=Globo\t3=Records\t4=Bandeirantes\t5=A TV estava desligada\t0=sair\n");
           voto = a.nextInt();
           if(voto == 0) break;
           if(voto == 1){
               System.out.printf("Quantas pessoas estavam assistindo?\n");
               sbt += a.nextInt();
           }
           if(voto == 2){
               System.out.printf("Quantas pessoas estavam assistindo?\n");
               globo += a.nextInt();
           }
           if(voto == 3){
               System.out.printf("Quantas pessoas estavam assistindo?\n");
               record += a.nextInt();
           }
           if(voto == 4){
               System.out.printf("Quantas pessoas estavam assistindo?\n");
               bandeirantes += a.nextInt();
           }
           if(voto == 5){
               branco++;
           }
       }
       total = sbt + globo + record + bandeirantes;
       System.out.printf("Porcentagem de audiência SBT: %f\n", (sbt / total) * 100);
       System.out.printf("Porcentagem de audiência Globo: %f\n", (globo / total) * 100);
       System.out.printf("Porcentagem de audiência Record: %f\n", (record / total) * 100);
       System.out.printf("Porcentagem de audiência Bandeirantes: %f\n", (bandeirantes / total) * 100);
    }   
}
