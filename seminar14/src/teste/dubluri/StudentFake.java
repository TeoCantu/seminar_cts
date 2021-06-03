package teste.dubluri;

import clase.IStudent;

import java.util.List;

public class StudentFake implements IStudent {

    private String nume;
    private int nota;
    private float medie;
    private boolean areRestante;

    public StudentFake setNota(int nota) {
        this.nota = nota;
        return this;
    }

    public StudentFake setMedie(float medie) {
        this.medie = medie;
        return this;
    }

    public StudentFake setAreRestante(boolean areRestante) {
        this.areRestante = areRestante;
        return this;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return medie;
    }

    @Override
    public int getNota(int index) {
        return nota;
    }

    @Override
    public boolean areRestante() {
        return areRestante;
    }
}
