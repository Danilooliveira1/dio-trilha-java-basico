public class Operadores {
    public static void main(String[] args) throws Exception {

        //Concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //número = número +1;
        int numero = 5;

        //incrementa + 1
        numero++;

        //incrementa + 1 no print
        System.out.println(++ numero);
        System.out.println(numero);

        //A mesma regra serve para decrementar, porém os sinais seram "--"

        //Oporerador negação (!)
        boolean variavel =  true;
        System.out.println(variavel);

        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);

        //operador ternário
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "Falso";
        System.out.println(resultado);

        //operador lógico
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas são verdade!");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma condição é verdade!");
        }

        
    }
}
