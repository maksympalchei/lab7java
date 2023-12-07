/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author korjk
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Привіт! Початок виконання програми...");
        while (true) {
            MainMenu();
            int var;
            Scanner scanner = new Scanner(System.in);
            var = scanner.nextInt();
            switch (var) {
                case 1: {
                    FirstPunctMainMenu();
                    int var1 = scanner.nextInt();
                    switch (var1) {
                        case 1: {
                            ChooseInstrumentMenu();
                            int var2;
                            var2 = scanner.nextInt();
                            PlayInstrumentSwitch(var2);
                        }
                        break;
                        case 2: {
                            System.out.println("Вихід в меню...");
                        }
                        break;
                        default: {
                            System.out.println("Такого варіанту не існує");
                        }
                        break;
                    }
                }
                break;
                case 2: {
                    ChooseInstrumentMenu();
                    int var3;
                    var3 = scanner.nextInt();
                    PrintlnInstrumentInfoSwitch(var3);
                }
                break;
                case 3: {
                    System.out.println("Вихід з програми...");
                }
                return;
                default: {
                    System.out.println("Такого варіанту не існує");
                }
                break;
            }
        }
    }

    public static void MainMenu() {
        System.out.println("Головне меню!");
        System.out.println("1. Зіграти на інструменті");
        System.out.println("2. Вивести інформацію про інструмент");
        System.out.println("3.Вихід");
    }

    public static void FirstPunctMainMenu() {
        System.out.println("Оберіть варіант");
        System.out.println("1.Зіграти");
        System.out.println("2. Вихід в головне меню");
    }

    public static void ChooseInstrumentMenu() {
        System.out.println("Оберіть інструмент");
        System.out.println("1. Бандура");
        System.out.println("2. Кларнет");
        System.out.println("3. Барбани");
        System.out.println("4. Піаніно");
        System.out.println("5. Синтезатор");
        System.out.println("6. Вихід в головне меню");
    }

    public static void PlayInstrumentSwitch(int var2) {
        switch (var2) {
            case 1: {
                String[] appointment = {"навчальні", "оркестрові", "кабінетні"};
                String[] soundsource = {"Струнно-щипковий"};
                String soundrange = "від «до» великої октави до «соль» (подекуди «ля») 3-ї октави";
                Bandura b = new Bandura("Бандура", appointment, soundsource, soundrange);
                b.PlayInst();
            }
            break;
            case 2: {
                String[] appointment = {"Сольний", "симфонічний"};
                String[] soundsource = {"Духовий"};
                String soundrange = "від е до с^4";
                Clarinet c = new Clarinet("Кларнет", appointment, soundsource, soundrange);
                c.PlayInst();
            }
            break;
            case 3: {
                String[] appointment = {"Симфонічний", "оркестровий", "навчальний"};
                String[] soundsource = {"Ударний"};
                String soundrange = "Не вимірюється";
                Drums d = new Drums("Барабани", appointment, soundsource, soundrange);
                d.PlayInst();
            }
            break;
            case 4: {
                String[] appointment = {"Сольний", "симфонічний", "навчальний", "оркестровий"};
                String[] soundsource = {"Струнний"};
                String soundrange = "від 27,5 Гц до 4186,0 Гц";
                Piano p = new Piano("Піаніно", appointment, soundsource, soundrange);
                p.PlayInst();
            }
            break;
            case 5: {
                String[] appointment = {"Сольний", "симфонічний", "навчальний", "оркестровий"};
                String[] soundsource = {"Синтезує звук за допомогою одного чи кількох електричних генераторів коливань"};
                String soundrange = "Максимально широкий діапазон, бо може включати різні пресети";
                Synthesizer s = new Synthesizer("Синтезатор", appointment, soundsource, soundrange);
                s.PlayInst();
            }
            break;
            case 6: {
                System.out.println("Повертаюсь...");
                var2 = 0;
            }
            break;
            default: {
                System.out.println("Такого варіанту не існує");
            }
            break;
        }
    }

    public static void PrintlnInstrumentInfoSwitch(int var3) {
        switch (var3) {
            case 1: {
                String[] appointment = {"навчальні", "оркестрові", "кабінетні"};
                String[] soundsource = {"Струнно-щипковий"};
                String soundrange = "від «до» великої октави до «соль» (подекуди «ля») 3-ї октави";
                Bandura b = new Bandura("Бандура", appointment, soundsource, soundrange);
                System.out.println(b.getName());
                System.out.println(Arrays.toString(b.getAppointment()));
                System.out.println(Arrays.toString(b.getSoundSource()));
                System.out.println(b.getSoundRange());
            }
            break;
            case 2: {
                String[] appointment = {"Сольний", "симфонічний"};
                String[] soundsource = {"Духовий"};
                String soundrange = "від е до с^4";
                Clarinet c = new Clarinet("Кларнет", appointment, soundsource, soundrange);
                System.out.println(c.getName());
                System.out.println(Arrays.toString(c.getAppointment()));
                System.out.println(Arrays.toString(c.getSoundSource()));
                System.out.println(c.getSoundRange());
            }
            break;
            case 3: {
                String[] appointment = {"Симфонічний", "оркестровий", "навчальний"};
                String[] soundsource = {"Ударний"};
                String soundrange = "Не вимірюється";
                Drums d = new Drums("Барабани", appointment, soundsource, soundrange);
                System.out.println(d.getName());
                System.out.println(Arrays.toString(d.getAppointment()));
                System.out.println(Arrays.toString(d.getSoundSource()));
                System.out.println(d.getSoundRange());
            }
            break;
            case 4: {
                String[] appointment = {"Сольний", "симфонічний", "навчальний", "оркестровий"};
                String[] soundsource = {"Струнний"};
                String soundrange = "від 27,5 Гц до 4186,0 Гц";
                Piano p = new Piano("Піаніно", appointment, soundsource, soundrange);
                System.out.println(p.getName());
                System.out.println(Arrays.toString(p.getAppointment()));
                System.out.println(Arrays.toString(p.getSoundSource()));
                System.out.println(p.getSoundRange());
            }
            break;
            case 5: {
                String[] appointment = {"Сольний", "симфонічний", "навчальний", "оркестровий"};
                String[] soundsource = {"Синтезує звук за допомогою одного чи кількох електричних генераторів коливань"};
                String soundrange = "Максимально широкий діапазон, бо може включати різні пресети";
                Synthesizer s = new Synthesizer("Синтезатор", appointment, soundsource, soundrange);
                System.out.println(s.getName());
                System.out.println(Arrays.toString(s.getAppointment()));
                System.out.println(Arrays.toString(s.getSoundSource()));
                System.out.println(s.getSoundRange());
            }
            break;
            case 6: {
                System.out.println("Повертаюсь...");
            }
            break;
            default: {
                System.out.println("Такого варіанту не існує");
            }
            break;
        }
    }
}
