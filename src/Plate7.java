public class Plate7
{
    private int food;

    public Plate7(int food)
    {
        this.food = food;
    }
    public void decreaseFood(int appetite)
    {
        if (!hasEnoughFoodFor(appetite))
        {
            System.out.println("Аппетит больше, чем еды в миске!");
        }
        else
        {
            food = food - appetite;
        }
    }

    public boolean hasEnoughFoodFor(int appetite)
    {
        return appetite < food;
    }

    public void increaseFood(int countOfFood)
    {
        food += countOfFood;
    }
}