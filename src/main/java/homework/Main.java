package homework;

public class Main {
    public static void main(String[] args) {
        Functionable[] entities = new Functionable[5];
        FunctionOfBarrier[] barriers = new FunctionOfBarrier[5];

        entities[0] = new Cat(140, 6);
        entities[1] = new Robot(400,1);
        entities[2] = new Human(200,4);
        entities[3] = new Human(250,3);
        entities[4] = new Robot(160,10);

        barriers[1] = new Wall(2);
        barriers[0] = new RunningTrack(150);
        barriers[2] = new Wall(3);
        barriers[4] = new Wall(4);
        barriers[3] = new RunningTrack(200);

        for (int i = 0; i < entities.length; i++) {
            for(int j = 0; j< barriers.length; j++){
                barriers[j].overcoming(entities[i]);
            }
        }

    }
}
