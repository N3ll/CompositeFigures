public class Test {

	public static void main(String[] args) {
		Figure rec = new Rectangle("1st figure.");
		Figure rec2 = new Rectangle("2nd figure.");
		Figure tr = new Triangle("3rd figure.");
		Figure ell = new Ellipse("4th figure");

		rec2.addFigure(tr);
		rec2.addFigure(ell);
		rec.addFigure(rec2);

		System.out.println(rec.draw());
		System.out.println("The number of the shapes all together is "
				+ rec.calcCirc());

	}

}
