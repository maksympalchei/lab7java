/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author korjk
 */
public class Clarinet extends MusicalInstrument {
    String[] Varieties;
    public Clarinet(String name, String[] appointment, String[] soundsource, String soundrange)
    {
        super(name,appointment,soundsource,soundrange);
        this.Varieties =new String[]{"кларнет-піколо","басетгорн","бас-кларнет"};
    }
    
}
