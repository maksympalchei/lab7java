/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author korjk
 */
public class Drums extends MusicalInstrument {

    String[] Architecture;

    public Drums(String name, String[] appointment, String[] soundsource, String soundrange) {
        super("Барабани", appointment, soundsource, soundrange);
        this.Architecture = new String[]{"Певний вид шкіри", "резонатор"};
    }

}
