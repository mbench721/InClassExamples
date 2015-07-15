package Game;
import java.util.Random;
public class SingleRandom {
	private static Random rgen = new Random();
	
	
public static Random get(){
	return rgen;
}

}
