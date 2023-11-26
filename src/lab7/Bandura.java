/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author korjk
 */
public class Bandura extends MusicalInstrument {
    String PositionDurGame;
    String[] WaysOfPlaying;
    public Bandura(String name, String[] appointment, String[] soundsource, String soundrange) {
        //super("Бандура",{"навчальні","оркестрові","кабінетні"},{"струнно-щипковий"},"від «до» великої октави до «соль» (подекуди «ля») 3-ї октави");
        super("Бандура",appointment,soundsource,soundrange);
        this.WaysOfPlaying = new String[]{"щипок", "удар", "тремоло", "флажолет", "глісандо"};
        PositionDurGame = "Положення під час гри тільки вертикальне";
    }
}
