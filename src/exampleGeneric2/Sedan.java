package exampleGeneric2;

public class Sedan extends Wheeler {

    Sedan(String name)
    {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Sedan Started");
    }
}
