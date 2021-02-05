package homework;

public class Cat implements Functionable {
    private int maxRunDist;
    private int maxJumpDist;
    //private boolean index;

    public Cat(int maxRunDist, int maxJumpDist) {
        this.maxRunDist = maxRunDist;
        this.maxJumpDist = maxJumpDist;
    }

//    public boolean isIndex() {
//        return index;
//    }

    public void setMaxRunDist(int maxRunDist) {
        this.maxRunDist = maxRunDist;
    }

    public void setMaxJumpDist(int maxJumpDist) {
        this.maxJumpDist = maxJumpDist;
    }

    public int getMaxJumpDist() {
        return maxJumpDist;
    }

    public int getMaxRunDist() {
        return maxRunDist;
    }
    public boolean run(int dist) {
        if(dist < maxRunDist){
            return true;
        }else{
            return false;
        }

    }

    public boolean jump(int dist) {
        if(dist < maxJumpDist){
            return true;
        }else{
            return false;
        }

    }
}
