//Ameer Ahmed 

import java.util.ArrayList;

public class PokemonLinkedList {
	public static void main(String[] args) {

		ArrayList<String> Pokemon = new ArrayList<>();

		Pokemon.add("Umbreon");
		Pokemon.add("Espeon");
		Pokemon.add("Pikachu");
		Pokemon.add("Togetic");

		System.out.println("My belt is filled with: " + Pokemon + "\n");

		String catching = Pokemon.get(3);
		System.out.println("My fourth Poke Ball is: " + catching + "\n");

		Pokemon.set(0, "Glaceon");
		System.out.println("I replaced my Umbreon to a: " + Pokemon.get(0) + "\n");
		System.out.println("My Pokemon before removing a Poke Ball: " + Pokemon + "\n");

		String removeFromPocket = Pokemon.remove(2);
		System.out.println("The Pokemon that I removed from my belt was: " + removeFromPocket + "\n");
		
		for(String PokemonList : Pokemon) {	
		System.out.println("My belt is now with: " + PokemonList + "\n");
		}
		
		Pokemon.clear();
		System.out.println("I'm taking these Pokemon away! " + "\n");
		System.out.println("Professor Oak wanted you to get more Pokemon! " + Pokemon);
		}
	}