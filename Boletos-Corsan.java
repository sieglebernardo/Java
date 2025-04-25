import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       
       System.out.printf("Quantidade de consumidores que deseja inserir: \n");
       int q = a.nextInt();
       
       double[] consumoMensal = new double[q];
       int[] codigoConsumidor = new int[q];
       int[] anoInstalacao = new int[q];
       int menorA=9999999, maiorB=0;
       String[] nomeConsumidor = new String[q];
       String[] enderecoConsumidor = new String[q];
       double totalArrecadadoCorsan=0, mediaConsumo=0, icmsArrecadado=0, icms=0, consumo=0;
       
        for(int i=0; i<q; i++){
            System.out.printf("Codigo de consumidor: \n");
            codigoConsumidor[i] = a.nextInt();
            System.out.printf("Nome do consumidor: \n");
            nomeConsumidor[i] = a.next();
            System.out.printf("Endereco do consumidor: \n");
            enderecoConsumidor[i] = a.next();
            System.out.printf("Consumo mensal em m3: \n");
            consumoMensal[i] = a.nextDouble();
            consumo+=consumoMensal[i];
            if(consumoMensal[i] <=200){//classe A
                consumoMensal[i] = consumoMensal[i] * 0.5;
                consumoMensal[i] = consumoMensal[i] + (consumoMensal[i] * 0.05);
                totalArrecadadoCorsan += consumoMensal[i];
                icms = consumoMensal[i]*0.18;
                icmsArrecadado += icms;
                consumoMensal[i] += icms;
                if(consumoMensal[i] < menorA) menorA = i;
            }
            else if(consumoMensal[i] > 200 && consumoMensal[i] <= 400){//classe B
                consumoMensal[i] = consumoMensal[i] * 0.85;
                consumoMensal[i] = consumoMensal[i] + (consumoMensal[i] * 0.1);
                totalArrecadadoCorsan += consumoMensal[i];
                icms = consumoMensal[i]*0.18;
                icmsArrecadado += icms;
                consumoMensal[i] += icms;
                if(consumoMensal[i] > maiorB) maiorB = i;
            }
            else{//classe C
                consumoMensal[i] = consumoMensal[i] * 1.5;
                consumoMensal[i] = consumoMensal[i] + (consumoMensal[i] * 0.2);
                totalArrecadadoCorsan += consumoMensal[i];
                icms = consumoMensal[i]*0.18;
                icmsArrecadado += icms;
                consumoMensal[i] += icms;
            }
            
            mediaConsumo = consumo / q;
            
            System.out.printf("Ano da instalacao do registro: \n");
            anoInstalacao[i] = a.nextInt();
        }
        System.out.printf("a) A conta de cada um dos consumidores:\n");
       for(int i=0; i<q; i++){
       System.out.printf("a) %s: %.2f\n", nomeConsumidor[i], consumoMensal[i]);
       }
       System.out.printf("b) Total de ICMS arrecadado pelo estado do RS:\n%.2f\n", icmsArrecadado);
       System.out.printf("c) Nome e endereço do maior consumidor da classe B:\nNome: %s.\tEndereco: %s\n", nomeConsumidor[maiorB], enderecoConsumidor[maiorB]);
       System.out.printf("d) Nome e endereço do menor consumidor da classe A:\nNome: %s.\tEndereco: %s\n", nomeConsumidor[menorA], enderecoConsumidor[menorA]);
       System.out.printf("e) Total arrecadado pela CORSAN:\n%f\n", totalArrecadadoCorsan);
       System.out.printf("f) A média de consumo de água de todos os consumidores:\n %.2f\n", mediaConsumo);
    }
}
