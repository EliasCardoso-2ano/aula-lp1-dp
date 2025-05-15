import java.util.Scanner;

public class sla {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        float area = 0f;
        float aultura = 0f;
        float base = 0f;

        imprimirTexto("Digite a altura:");
        aultura = lerNumeroFloat();

        imprimirTexto("digite a base:");
        base = lerNumeroFloat();
        
        imprimirTexto("calculando área.........");
        area = calcularAreaTriangulo(base, aultura);

        imprimirTexto("Área do Triangulo é: " + area + "m²");



    }

    public static void imprimirTexto(String texto){
        System.out.println(texto);
    }

    public static float lerNumeroFloat(){
        float n = 0f;
        n = LER.nextFloat();
        return n;
    }

    public static float calcularAreaTriangulo(float b, float a){

        float area = 0f;

        area = (b * a) / 2;

        return area;
    }



}
