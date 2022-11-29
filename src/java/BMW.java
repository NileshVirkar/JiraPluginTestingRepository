public class BMW extends Car{
    public int seatHeight;
    public BMW(int gear, int speed,
                 int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
        System.out.println(newValue);
        System.out.println(newValue);
    }
    public int getLength(String[] strings) {

        int length = 0;
        if (strings == null || strings.length == 0) return 0;

        for (String str : strings) {
            length += str.length();
        }

        return length;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
