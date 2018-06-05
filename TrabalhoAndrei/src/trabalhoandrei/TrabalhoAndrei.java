
package trabalhoandrei;
import console.Console;

public class TrabalhoAndrei {

    public static void main(String[] args) {
        /*Enunciado: faça um programa para implementar um controle de caixa de uma lanchonete. 
        Monte um cardápio de produtos com, no mínimo, 3 produtos e mostre o cardápio para o operador do sistema a 
        cada venda.
        O operador poderá escolher os produtos que fazem parte de cada venda, 
        calcular quanto deverá ser pago a cada venda e mostrar o valor que deve ser pago pelo cliente.
        No final, o programa deverá informar o valor total das vendas da lanchonete.
        Lembre-se: a lanchonete pode fazer N vendas e cada venda pode ter N produtos.*/
        
        Console.writeLn("      Cardápio lanchonete do seu zé " + 
                     "\n ---------------------------------------------- " + 
                     "\n|  1  |        PÃO COM BOLINHO          | 8,50 |" +
                     "\n|----------------------------------------------|" +
                     "\n|  2  |      FATIA BOLO DE CENOURA      | 4,25 |" + 
                     "\n|----------------------------------------------|" +
                     "\n|  3  |             CAFÉ                | 3,75 |" + 
                     "\n|----------------------------------------------|" +
                     "\n|  4  |        SUCO DE LARANJA          | 4,00 |" +
                     "\n|----------------------------------------------|" +
                     "\n|  5  |         PÃO DE QUEIJO           | 0,75 |" +
                     "\n|----------------------------------------------|" +
                     "\n|  6  |             CUCA                | 2,15 |" + 
                     "\n|----------------------------------------------|" +
                     "\n|  7  |            TOTAL                       |" +
                     "\n ---------------------------------------------- ");
        
        float somaTotal=0;
        int somaItens=0, item = 0 ;
        Console.write("Item:");
        item = Console.readInt();
        
        while ((item > 0)  && (item < 7))
        {
            if (item == 1)
            {
                Console.write("Pão Com Bolinho.");
                somaTotal = somaTotal + 8.50f;
                somaItens++;
            }
            if (item == 2)
            {            
                Console.write("Fatia Bolo de Cenoura.");
                somaTotal = somaTotal + 4.25f;
                somaItens++;
            }
            if (item == 3)
            {            
                Console.write("Café.");
                somaTotal = somaTotal + 3.75f;
                somaItens++;
            }
            if (item == 4)
            {            
                Console.write("Suco de laranja.");
                somaTotal = somaTotal + 4.00f;
                somaItens++;
            }
            if (item == 5)
            {            
                Console.write("Pão de queijo.");
                somaTotal = somaTotal + 0.75f;
                somaItens++;
            }
            if (item == 6)
            {            
                Console.write("Cuca.");
                somaTotal = somaTotal + 2.15f;
                somaItens++;
            }
            Console.writeLn("      Cardápio lanchonete do seu zé " + 
                     "\n ---------------------------------------------- " + 
                     "\n|  1  |        PÃO COM BOLINHO          | 8,50 |" +
                     "\n|----------------------------------------------|" +
                     "\n|  2  |      FATIA BOLO DE CENOURA      | 4,25 |" + 
                     "\n|----------------------------------------------|" +
                     "\n|  3  |             CAFÉ                | 3,75 |" + 
                     "\n|----------------------------------------------|" +
                     "\n|  4  |        SUCO DE LARANJA          | 4,00 |" +
                     "\n|----------------------------------------------|" +
                     "\n|  5  |         PÃO DE QUEIJO           | 0,75 |" +
                     "\n|----------------------------------------------|" +
                     "\n|  6  |             CUCA                | 2,15 |" + 
                     "\n|----------------------------------------------|" +
                     "\n|  7  |            TOTAL                       |" +
                     "\n ---------------------------------------------- ");
            
            Console.write("Item:");
            item = Console.readInt();
            
        }
    }    
}    
    
