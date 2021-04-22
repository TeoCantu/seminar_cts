package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;

public class Program {
    public static void main (String[] args){

        Masa masa = new Masa(10);
        masa.elibereazaMasa();
        masa.rezervaMasa();
        masa.rezervaMasa();
        masa.ocupaMasa();
        masa.ocupaMasa();
        masa.elibereazaMasa();
    }
}
