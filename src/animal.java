public class animal
{
    float maxRunDistance;
    float maxSwimDistance;

    public animal(float maxRunDistance, float maxSwimDistance)
    {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }
    public void runOn(float requiredDistance)
    {
        if (requiredDistance > maxRunDistance)
        {
            System.out.println("Не сможет пробежать " + requiredDistance);
            System.out.println("Максимум возможностей: " + maxRunDistance);
        }
        else
        {
            System.out.println("Расстояние бега " + requiredDistance + " пробежал.");
        }

        System.out.println();
    }
    public void swimOn(float requiredDistance)
    {
        if (requiredDistance > maxSwimDistance)
        {
            System.out.println("Не смог проплыть " + requiredDistance);
            System.out.println("Максимум возможностей: " + maxRunDistance);
        }
        else
        {
            System.out.println("Расстояние для заплыва " + requiredDistance + " проплыл.");
        }

        System.out.println();
    }
}
