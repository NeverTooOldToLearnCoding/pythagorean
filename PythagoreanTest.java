public class PythagoreanTest {
	public static void main(String[] args) {
		Pythagorean id = new Pythagorean();
		Double hypotenuse = id.calculateHypotenuse(4,4);
		System.out.println("The hypotenuse is: " + hypotenuse);
	}
}