package exampleGeneric2;

class Test<T extends Wheeler>
{
    T var;

    Test(T v)
    {
        var = v;
    }
    //again
    public void vehicleName()
    {
        System.out.println("Name of the Vehicle :: "+var.name);
    }

    public static void main(String[] args)
    {
        Bus b = new Bus("Volvo");
        Sedan s = new Sedan("Mercedes-Benz");


        Test<Bus> bus = new  Test<>(b);
        Test<Sedan> sedan = new  Test<>(s);


        bus.vehicleName();
        sedan.vehicleName();
    }


}
