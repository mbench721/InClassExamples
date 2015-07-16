package Barrel;

import java.util.ArrayList;

public class Main {
	
	private static final int NUMBER_FISH = 10;
	private static final int N_ROCK = 3;
	
public static void main(String[] args) {
	
	ArrayList<Submersible> fishes = buildFish();
	submerge(fishes);
	
	ArrayList<Submersible> rocks = buildRocks();
	submerge(rocks);
}

private static void submerge(ArrayList<Submersible> subs){
	for(Submersible s : subs){
		s.submerge();
	}
}

private static ArrayList<Submersible> buildFish() {
	
	ArrayList<Submersible> fishes = new ArrayList<Submersible>();
	
	for (int i = 0; i < NUMBER_FISH; ++i){
		Fish fish = new Fish();
		fishes.add(fish);
	}
	return fishes;
}
private static ArrayList<Submersible> buildRocks() {
	
	ArrayList<Submersible> rocks = new ArrayList<Submersible>();
	
	for (int i = 0; i < N_ROCK; ++i){
		Rock rock = new Rock();
		rocks.add(rock);
	}
	return rocks;
}
}
