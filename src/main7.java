public class main7
{
    public static void main(String[] args)
    {
        Cat7[] cats = {
                new Cat7(5, "Муся"),
                new Cat7(7, "Дашка"),
                new Cat7(10, "Машка")
        };

        Plate7 plate = new Plate7(20);

        for (Cat7 cat : cats)
        {
            cat.eat(plate);
        }

        plate.increaseFood(50);

        for (Cat7 cat : cats)
        {
            cat.eat(plate);
        }
    }
}
