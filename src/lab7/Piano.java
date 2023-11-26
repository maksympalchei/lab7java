/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author korjk
 */
public class Piano extends MusicalInstrument {

    String WhereComeFrom;

    public Piano(String name, String[] appointment, String[] soundsource, String soundrange) {
        super(name, appointment, soundsource, soundrange);
        WhereComeFrom = "Назва походить від італійських слів forte(голосно) та piano(тихо)";
    }

}
