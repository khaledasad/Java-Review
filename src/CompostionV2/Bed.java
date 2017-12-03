package CompostionV2;

public class Bed {

    private String style;
    private int sheet;
    private int height;
    private int pillows;
    private int quilt;


    public Bed(String style, int sheet, int height, int pillows, int quilt) {
        this.style = style;
        this.sheet = sheet;
        this.height = height;
        this.pillows = pillows;
        this.quilt = quilt;
    }

    public void make()
    {
        System.out.println("Bed --> Make()");
    }

    public String getStyle() {
        return style;
    }

    public int getSheet() {
        return sheet;
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }
}
