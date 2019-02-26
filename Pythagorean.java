import static java.lang.Math.sqrt;
public class Pythagorean {
	public double calculateHypotenuse(int legA, int legB){
		double hypotenuse = Math.sqrt(legA*legA+legB*legB);
		//String str = String.valueOf(hypotenuse);
		//System.out.println("Hypotenuse value is: "+str);
		return hypotenuse;
	}
}