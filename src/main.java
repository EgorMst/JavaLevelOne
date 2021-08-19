public class main
{
    public static void main(String[] args)
    {
        AnimalFactory factory = new AnimalFactory();

        Cat Cat = factory.newCat(200);
        dog dog = factory.newDog(500, 10);

        Cat.runOn(200);
        Cat.swimOn(5);

        dog.runOn(500);
        dog.swimOn(10);

        System.out.println("Животных создано всего: " + factory.getAnimalsCount());
        System.out.println("Собак создано всего: " + factory.getDogsCount());
        System.out.println("Кошек создано всего: " + factory.getCatsCount());
    }
}

