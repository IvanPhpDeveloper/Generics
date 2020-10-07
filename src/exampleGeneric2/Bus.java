package exampleGeneric2;

class Bus extends Wheeler
{
    Bus(String name)
    {
        this.name = name;
    }
    @Override
    public void start() {
        System.out.println("Bus Started");
    }
}