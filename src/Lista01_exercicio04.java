import java.util.Scanner;
public class Lista01_exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do 1° bimestre: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a nota do 2° bimestre: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a nota do 3° bimestre: ");
        double nota3 = input.nextDouble();

        System.out.println("Digite a nota do 4° bimestre: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua media anual é:" + media) ;

    }
}

