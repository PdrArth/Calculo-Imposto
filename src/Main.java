import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite por favor as suas horas trabalhadas no mês: ");
        var horas = ler.nextDouble();
        var salario = horas * 5;
        if(salario<=900) {
            var inss = (salario * 10) / 100;//
            var fgts = (salario * 11) / 100;
            var total = inss + fgts;
            var salarioliquido = salario - inss;
            System.out.println("Aqui está a sua lista de descontos.");
            System.out.println("Seu salario bruto R$ " + salario);
            System.out.println("Voce essta insento de imposto de renda");
            System.out.println("O seu desconto de INSS é de  R$ " + inss);
            System.out.println("O seu desconto de FGTS R$ " + fgts);
            System.out.println("Total de descontos R$ " + total);
            System.out.println("Seu salario liquido R$ " + salarioliquido);
        } else if (salario>900 && salario<=1500) {
            var ir = (salario * 5) / 100;
            var inss = (salario * 10) / 100;
            var fgts = (salario * 11) / 100;
            var total = inss + fgts +ir ;
            var salarioliquido = salario - (ir + inss);
            System.out.println("Aqui está a sua lista de descontos.");
            System.out.println("Seu salario bruto R$ " + salario);
            System.out.println("O seu desconto de IR é de  R$ " + ir);
            System.out.println("O seu desconto de INSS é de  R$ " + inss);
            System.out.println("O seu desconto de FGTS R$ " + fgts);
            System.out.println("Total de descontos R$ " + total);
            System.out.println("Seu salario liquido R$ " + salarioliquido);
        }else if(salario > 1500 && salario<=2500){
            var ir = (salario * 10) / 100;
            var inss = (salario * 10) / 100;
            var fgts = (salario * 11) / 100;
            var total = inss + fgts + inss;
            var salarioliquido = salario - (ir + inss );
            System.out.println("Aqui está a sua lista de descontos.");
            System.out.println("Seu salario bruto R$ " + salario);
            System.out.println("O seu desconto de IR é de  R$ " + ir);
            System.out.println("O seu desconto de INSS é de  R$ " + inss);
            System.out.println("O seu desconto de FGTS R$ " + fgts);
            System.out.println("Total de descontos R$ " + total);
            System.out.println("Seu salario liquido R$ " + salarioliquido);
        }else if(salario>=2500){
            var ir = (salario * 20) / 100;
            var inss = (salario * 10) / 100;
            var fgts = (salario * 11) / 100;
            var total = inss + fgts + inss;
            var salarioliquido = salario - (ir + inss );
            System.out.println("Aqui está a sua lista de descontos.");
            System.out.println("Seu salario bruto R$ " + salario);
            System.out.println("O seu desconto de IR é de  R$ " + ir);
            System.out.println("O seu desconto de INSS é de  R$ " + inss);
            System.out.println("O seu desconto de FGTS R$ " + fgts);
            System.out.println("Total de descontos R$ " + total);
            System.out.println("Seu salario liquido R$ " + salarioliquido);
        }
    }
}