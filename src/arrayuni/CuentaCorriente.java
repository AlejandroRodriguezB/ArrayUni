package arrayuni;


public class CuentaCorriente {
    private double interes;
    private double saldo;
    private static int numcuentas=0;
    
    public CuentaCorriente(){
    interes=100;
    saldo=0.02;
    numcuentas++;
    
    }
    public CuentaCorriente(double saldo){
    numcuentas++;
    interes=0.05;
    this.saldo=saldo;
    
    }
    public CuentaCorriente(double saldo,double interes){
    this.interes=interes;
    this.saldo=saldo;
    numcuentas++;
    
    }
    
    public void deposito (double x){
        saldo=saldo+x;
    }
    
    public void pago (double x){
        if (saldo-x<0){
            System.out.println("Error numeros rojos" );
        }
    }
    
    public void abono_interes(){
        saldo= saldo+ saldo*interes;
    }
    
    
    public void modificar_interes(double interes){
        this.interes=interes;
    }
    
    public double obtener_saldo(){
        return saldo;
    }
    
    public boolean transferencia(CuentaCorriente c, double x){
        if(saldo-x>0){
            c.saldo=c.saldo+x;
            saldo=saldo-x;
            return true;
        }
        else{
            return false;
        }
    
    }
    
    public static boolean transferencia2(CuentaCorriente cemisora,CuentaCorriente creceptora, double x){
        if(cemisora.saldo-x>0){
            creceptora.saldo=creceptora.saldo+x;
            cemisora.saldo=cemisora.saldo-x;
            return true;
        }
        else{
            return false;
        }
    }
    
    public static int consultar_Cuentas(){
        return numcuentas;
    }
    
}
