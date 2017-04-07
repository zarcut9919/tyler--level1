
public class HarryPotterRunner {

	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter potter= new HarryPotter();
		// 2. become invisible
		potter.makeInvisible(true);
		// 3. spy on professor snape
		potter.spyOnSnape();
		// 4. become visible again
		potter.makeInvisible(false);
		// 5. cast a “stupefy” spell
		potter.castSpell("stupefy");
	}
}
