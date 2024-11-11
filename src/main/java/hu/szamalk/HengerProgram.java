package hu.szamalk;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<MertaniHenger> hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public void run() {
        System.out.printf("hengerek (%d db):\n", MertaniHenger.getHengerDarab());

        for (MertaniHenger henger : this.lista()) {
            System.out.println(henger.toString());
        }

        System.out.print("Átlagtérfogat:\n" + this.atlagTerfogat());
    }

    public HengerProgram() {
        this(new ArrayList<>());
        hengerek = new ArrayList<>();

        hengerek.add(new MertaniHenger(1, 1));
        hengerek.add(new TomorHenger(1, 1));
        hengerek.add(new TomorHenger(1, 1, 0.5));
        hengerek.add(new LyukasHenger(1, 1, 0.1));
        hengerek.add(new LyukasHenger(1, 1, 0.5));
        hengerek.add(new LyukasHenger(1, 1, 0.9));
    }

    public HengerProgram(List<MertaniHenger> hengerek) {
        this.hengerek = hengerek;
    }

    public double atlagTerfogat() {
        double terfogatok = 0;

        for (MertaniHenger henger : this.lista()) {
            terfogatok += henger.terfogat();
        }
        return terfogatok / MertaniHenger.getHengerDarab();
    }

    public double csovekSulya() {

        for (MertaniHenger henger : this.lista()) {

        }
        return 0;
    }

    private List<MertaniHenger> lista() {
        return hengerek;
    }

}