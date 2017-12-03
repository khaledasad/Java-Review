package Compostion;

public class MontherBoard {

    private String model;
    private String manifacuring;
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public MontherBoard(String model, String manifacuring, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manifacuring = manifacuring;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public static void loadProgram(String programName){
        System.out.println("Program " + programName + " ");


    }

    public String getModel() {
        return model;
    }

    public String getManifacuring() {
        return manifacuring;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
