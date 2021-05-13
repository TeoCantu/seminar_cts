package ro.ase.acs.template.program;

import ro.ase.acs.template.clase.Spectator;
import ro.ase.acs.template.clase.SpectatorAbstract;
import ro.ase.acs.template.clase.SpectatorVIP;

public class Program {
    public static void main(String[] args) {
        Spectator spectator = new Spectator("Ion");
        SpectatorAbstract spectator2 = new Spectator("Vasile");
        spectator.intrareSpectatorStadion();
        spectator2.intrareSpectatorStadion();

        SpectatorVIP spectatorVIP = new SpectatorVIP("Gigel");
        spectatorVIP.intrareSpectatorStadion();
    }
}
