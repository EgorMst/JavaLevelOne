public class AnimalFactory
{
    private int animalsCount;
    private int dogsCount;
    private int catsCount;

    public AnimalFactory()
    {
        animalsCount = 0;
        dogsCount = 0;
        catsCount = 0;
    }

    public Cat newCat(int maxRunLimit)
    {
        Cat cat = new Cat(maxRunLimit);

        animalsCount++;
        catsCount++;

        return cat;
    }

    public dog newDog(int maxRunLimit, int maxSwimLimit)
    {
        dog dog = new dog(maxRunLimit, maxSwimLimit);

        animalsCount++;
        dogsCount++;

        return dog;
    }

    public int getAnimalsCount()
    {
        return animalsCount;
    }

    public int getDogsCount()
    {
        return dogsCount;
    }

    public int getCatsCount()
    {
        return catsCount;
    }
}