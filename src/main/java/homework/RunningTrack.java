package homework;

public class RunningTrack implements FunctionOfBarrier{

    private int maxDist;

    public RunningTrack(int maxDist) {
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
           System.out.println(f.getClass().getName()+ " Успешно бежал");
       }else
       {
           System.out.println(f.getClass().getName()+"Не пробежал");
       }
    }

}
