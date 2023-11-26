/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author korjk
 */
public class Synthesizer extends MusicalInstrument {

    String[] TypesOfSynthesis;

    public Synthesizer(String name, String[] appointment, String[] soundsource, String soundrange) {
        super(name, appointment, soundsource, soundrange);
        this.TypesOfSynthesis = new String[]{"Підсумовувальний", "Віднімальний", "Табличний", "Операторний", "Фізичний"};
    }

}
