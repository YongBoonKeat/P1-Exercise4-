package ArrayOneDimensional;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program!!!");
		
		String backpack[] = {"Shotgun","Assault Rifle","Sniper"};
		String zombies[] = {"Close-range zombie","Mid-range zombie","Long-range zombie"};
		int numberszombiesHATE[] = {10,20,30,40,50,60};
		int numberszombiesNOTHATE[];
		numberszombiesNOTHATE = new int[4];
		numberszombiesNOTHATE[0]=1;
		numberszombiesNOTHATE[1]=10;
		numberszombiesNOTHATE[2]=100;
		numberszombiesNOTHATE[3]=1000;
		
		System.out.println("Backpack items!");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);
		
		System.out.println("These are the zombies!");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]);
		
		System.out.println("Numbers Zombies HATE!");
		System.out.println(numberszombiesHATE[0]);
		System.out.println(numberszombiesHATE[1]);
		
		System.out.println("Numbers Zombies NOTHATE!");
		System.out.println(numberszombiesNOTHATE[2]);
		System.out.println(numberszombiesNOTHATE[3]);
	}
}
