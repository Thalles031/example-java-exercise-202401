import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        double[] temperatura = new double[12];
        float mediaTotal = 0;

        for ( int i = 0; i <= 11; i++){
            boolean aux = true;
            System.out.println("Digite a temperatura " + (i + 1) + "(entre 4 e 10): ");

            while (aux) {
                temperatura[i] = imput.nextDouble();

                if (temperatura[i] < 4 || temperatura[i] > 10)
                {System.out.print("Valor inválido. Tente novamente.\n ");}
                
                else
                    { aux = false; }
            }
        
        } 

        for ( int i = 0; i <= 11; i++){
         mediaTotal += temperatura[i];
        }
        
        mediaTotal /= temperatura.length;

        
     System.out.printf(" A média da temperaturas do dia de hoje é: " + df.format(mediaTotal) + (" graus Celsius "));

        
        imput.close();
       
       
    }
}

