import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Conversor de moedas");

        //CRIAR ESCUTA PARA O TECLADO

        Scanner teclado = new Scanner (System.in);

        var valor = teclado.nextInt();

        //SELECIONANDO AS MOEDAS>
    reiciar:{
        while (true) {
            System.out.println("""
[1] DOLAR
[2] EURO
[3] RUBLO RUSSO

Use Somente numeros:
                """);
        
            var select = teclado.nextInt();
        
            if(select == 1){
                System.out.println("Convertendo para dolar\n");
                var dolar = valor/4.9;
                System.out.println("Voce tem dolar "+ dolar);

                break;
            }if (select == 2) {
                System.out.println("Convertendo para Euro");
                var euro = valor/5.4;
                System.out.println("voce tem euro "+ euro);
                break;
            }if (select == 3) {
                System.out.println("Convertendo para Rublo Russo");
                var rublo = valor/0.054;
                System.out.println("Voce tem Rublo "+ rublo);
                break;

            }else{
                System.out.println("Opção não encontrada tente usar numeros\n");
            }
        }
    } 
        
        
    }
}
