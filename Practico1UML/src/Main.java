import Clases.*;

public class Main {
    public static void main(String[] args) {
        Piloto piloto1= new Piloto(15021990,"Pedro Genaro", 15 , 112223412);
        Avion avion1= new Avion(2020,15200,"Airbus A320");
        Flota flotaMendoza= new Flota("Mendoza");
        flotaMendoza.addAviones(avion1);
        Vuelo mdzBsAS= new Vuelo(25200,152);
        mdzBsAS.setAvion(avion1);
        mdzBsAS.getAvion();
        Cliente cliente1 = new Cliente(210604,"Francis Catarine", 1);
        Reserva reservaMdzBsAS= new Reserva("Mendoza","Buenos Aires", 15, 2500,cliente1, mdzBsAS);
        reservaMdzBsAS.imprimirReserva();
        piloto1.Volar();
   }
}
