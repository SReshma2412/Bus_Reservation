public class Bus {
   private int busNo;
   private boolean ac;
   private int capacity;
   private String driverName;

    Bus(int no,boolean ac,int ca,String driverName)
    {
        this.busNo=no;
        this.ac=ac;
        this.capacity=ca;
        this.driverName=driverName;

    }
    public int getBusNo()
    {
        return busNo;
    }

    public boolean getAc()
    {
        return ac;
    }
    public void setAc(boolean val)
    {
        this.ac=val;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public void setCapacity(int capacity)
    {
        this.capacity=capacity;
    }

//    public void display()
//    {
//        System.out.println("Bus No: "+busNo+" Ac is: "+ac+" Capacity is: "+capacity+"Driver name is: "+driverName);
//    }
}
