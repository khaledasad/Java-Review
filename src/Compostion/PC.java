package Compostion;

public class PC {

    private Case theCase;
    private Monitor monitors;
    private MontherBoard montherBoard;

    public PC(Case theCase, Monitor monitors, MontherBoard montherBoard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.montherBoard = montherBoard;
    }

    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }


    private void drawLogo()
    {
        monitors.drawPixelAt(2500, 1440, "Green");
    }




//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitors() {
//        return monitors;
//    }
//
//    private MontherBoard getMontherBoard() {
//        return montherBoard;
//    }
}
