package fp.dam.psp.unidad2.ejemplos.ejemplo11;

public class Consumidor extends Thread {
    private long retardo;
    private Almacen almacen;
    public Consumidor(Almacen almacen, long retardo) {
        super("consumidor");
        this.retardo = retardo;
        this.almacen = almacen;
    }
    public void run(){
        while (true) {
            String producto = almacen.retirar();
            System.out.println("producto " + producto + " retirado");
            try { Thread.sleep(retardo); } catch (InterruptedException e) {}
        }
    }
}
