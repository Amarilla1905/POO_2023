public class Salario {
    
    public static void main(String[] args) {
        double horasT=48;
        double valorHora=5000;
        double salarioBruto= horasT*valorHora;
        double retencionFuente=salarioBruto*0.125;
        double salarioNeto= ((salarioBruto)-(retencionFuente));
        
        System.out.println("El salario bruto del trabajador a la semana es "+salarioBruto+ "Pesos");
        System.out.println("La retencion de fuente del trabajador a la semana es "+retencionFuente+ "Pesos");
        System.out.println("El salario neto del trabajador a la semana es " +salarioNeto+ "Pesos");
 
 
 
     }
 }
