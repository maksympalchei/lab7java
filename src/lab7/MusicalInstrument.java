/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author korjk
 */
public abstract class MusicalInstrument {

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Appointment
     */
    public String[] getAppointment() {
        return Appointment;
    }

    /**
     * @param Appointment the Appointment to set
     */
    public void setAppointment(String[] Appointment) {
        this.Appointment = Appointment;
    }

    /**
     * @return the SoundSource
     */
    public String[] getSoundSource() {
        return SoundSource;
    }

    /**
     * @param SoundSource the SoundSource to set
     */
    public void setSoundSource(String[] SoundSource) {
        this.SoundSource = SoundSource;
    }

    /**
     * @return the SoundRange
     */
    public String getSoundRange() {
        return SoundRange;
    }

    /**
     * @param SoundRange the SoundRange to set
     */
    public void setSoundRange(String SoundRange) {
        this.SoundRange = SoundRange;
    }
    private String Name; //Назва інструменту
    private String[] Appointment; //Призначення (сольні, навчальні, оркестрові, кабінетні тощо)
    private String[] SoundSource; //Джерело звуку (струнні, язичкові, духові, ударні, електромузичні)
    private String SoundRange; //Діапазон звучання
    public MusicalInstrument(String name, String[] appointment, String[] soundsource, String soundrange)
    {
        Name = name;
        Appointment = appointment;
        SoundSource = soundsource;
        SoundRange = soundrange;
    }
    public void PlayInst()
    {
        System.out.println("Ви зіграли на інструменті:"+this.getName());
    }
}
