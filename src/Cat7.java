public class Cat7
{
    private boolean isFull;
    private int appetite;
    private String name;

    public Cat7(int appetite, String name)
    {
        isFull = false;
        this.appetite = appetite;
        this.name = name;
    }
    public void eat(Plate7 plate)
    {
        if (plate.hasEnoughFoodFor(appetite) && !isFull)
        {
            System.out.println(name + " кушает.");
            plate.decreaseFood(appetite);
            isFull = true;
        }
        else if (!plate.hasEnoughFoodFor(appetite))
        {
            System.out.println(name + " котейка шипит, тарелка почти пуста!");
        }
        else if (isFull)
        {
            System.out.println("У " + name + " в пузе уже есть корм!");
        }
    }
}
