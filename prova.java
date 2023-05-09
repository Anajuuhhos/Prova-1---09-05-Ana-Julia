import java.util.Scanner;

public class prova {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a placa do veículo: ");
    String placa = teclado.next();
    System.out.println("Digite o valor do litro do combustível: ");
    float valor = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 60 KM/H: ");
    float q60 = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 80 KM/H: ");
    float q80 = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 100 KM/H: ");
    float q100 = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 120 KM/H: ");
    float q120 = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 140 KM/H: ");
    float q140 = teclado.nextFloat();

    double lkm60 = q60/30.7;
    double lkm80 = q80/26.8;
    double lkm100 = q100/22.4;
    double lkm120 = q120/18.1;
    double lkm140 = q140/14.5;

    double total = lkm60+lkm80+lkm100+lkm120+lkm140;
    double media = ((q60*60)+(q80*80)+(q100*100)+(q120*120)+(q140*140))/100;
    double custo = valor*lkm60+valor*lkm80+valor*lkm100+valor*lkm120+valor*lkm140;

    System.out.println("Placa do veículo: " + placa);
    System.out.printf("Consumo total:  %.4f litros %n", total);
    System.out.printf("Valor total: R$    %.2f %n", custo);
    System.out.println("Velocidade média ponderada:  " + media + "Km");
    
    teclado.close();
  }
}