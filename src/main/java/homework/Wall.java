package homework;


public class Wall implements FunctionOfBarrier {
    private int maxDist;

    public Wall(int maxDist) {
        this.maxDist = maxDist;
    }

    public int getMaxDist() {
        return maxDist;
    }

    public void setMaxDist(int maxDist) {
        this.maxDist = maxDist;
    }

    public void overcoming(Functionable f)
    {
        if(f.run(maxDist)){
            System.out.println(f.getClass().getName() + " Успешно прыгнул");
        }else
        {
            System.out.println(f.getClass().getName()+"Не перепрыгнул");
        }
    }
}
