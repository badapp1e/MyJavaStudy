import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class RandomChars {
    private static Random rand = new Random();
    public char next() {
        return (char)rand.nextInt(128);
    }
    public static void main(String[] args) {
        RandomChars rc = new RandomChars();
        for(int i = 0; i < 10; i++)
            System.out.print(rc.next() + " ");
    }
}

class AdaptedRandomChars extends RandomChars implements Readable {
    private int count;
    public AdaptedRandomChars(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if(count-- == 0) return -1;
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }
}

// Cycle
interface Cycle { int getWheelNum(); }

class Unicycle implements Cycle { public int getWheelNum() { System.out.println("Unicycle has 1 wheel."); return 1; }; }

interface CycleFactory { Cycle getCycle(); }

class UnicycleFactory implements CycleFactory { public Cycle getCycle() { return new Unicycle(); } }

class Bicycle implements Cycle { public int getWheelNum() { System.out.println("Bicycle has 2 wheels."); return 2; }; }

class BicycleFactory implements CycleFactory { public Cycle getCycle() {return new Bicycle(); } }

class Tricycle implements Cycle { public int getWheelNum() { System.out.println("Tricycle has 3 wheels."); return 3; } }

class TricycleFactory implements CycleFactory { public Cycle getCycle() {return new Tricycle(); } }

class CycleFactories {
    public static void rideCycle(CycleFactory cf) {
        Cycle cycle = cf.getCycle();
        cycle.getWheelNum();
    }
}

// Game
interface Game { void flip(); }

interface GameFactory { Game getGame(); }

class CoinGame implements Game { public void flip() {}; }

class CoinGameFactory implements GameFactory { public Game getGame() { return new CoinGame(); } }

class DiceGame implements Game { public void flip() {}; }

class DiceGameFactory implements GameFactory { public Game getGame() { return new DiceGame(); } }

/*
章节9：接口
 */
public class Chapter9Practice {
    /*
    练习十六：随机生成char序列并适配Scanner
     */
    static void randomChars() {
        Scanner s = new Scanner(new AdaptedRandomChars(10));
        while(s.hasNext())
            System.out.print(s.next() + " ");
    }

    /*
    练习十八：工厂模式
     */
    static void factoryMode() {
        CycleFactories.rideCycle(new UnicycleFactory());
        CycleFactories.rideCycle(new BicycleFactory());
        CycleFactories.rideCycle(new TricycleFactory());
    }

    public static void main(String[] args) {
        factoryMode();
    }
}
