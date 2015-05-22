public abstract class Figure {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void addFigure(Figure figure);

	// Prints name and type
	public abstract String draw();

	// Prints the sum of the circumferences of the composed figures, if it a
	// composite figure
	public abstract int calcCirc();

}
