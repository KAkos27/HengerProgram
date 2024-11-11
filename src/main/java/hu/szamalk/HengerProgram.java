package hu.szamalk;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<MertaniHenger> hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public void run() {
        MertaniHenger m = new MertaniHenger(1, 1);
        TomorHenger t = new TomorHenger(1, 1);
        LyukasHenger ly = new LyukasHenger(1, 1, 0.5);

        System.out.printf("hengerek (%d db):\n", MertaniHenger.getHengerDarab());

        System.out.println(m.toString());
        System.out.println(t.toString());
        System.out.println(ly.toString());
    }

    public HengerProgram() {
        this(new ArrayList<>());
    }

    public HengerProgram(List<MertaniHenger> hengerek) {
        this.hengerek = hengerek;
    }

    public double atlagTerfogat() {
        return 0;
    }

    public double csovekSulya() {
        return 0;
    }

    private List<MertaniHenger> lista() {
        return new ArrayList<>();
    }

}