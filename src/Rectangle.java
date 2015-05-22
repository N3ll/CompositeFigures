import java.util.ArrayList;
import java.util.Iterator;


public class Rectangle extends Figure{
	ArrayList figures = new ArrayList();

	public Rectangle(String name) {
		setName(name);
	}

	public void addFigure(Figure figure) {
		figures.add(figure);
	}

	@Override
	public String draw() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName()+" "+getClass()+"\n");
		Iterator it = figures.iterator();
		while (it.hasNext()) {
			Figure temp = (Figure) it.next();
			sb.append(temp.draw());
		}
		return sb.toString();
	}

	@Override
	public int calcCirc() {
		
		int sum=1;

		Iterator it = figures.iterator();
		while (it.hasNext()) {
			Figure temp = (Figure) it.next();
			sum+=temp.calcCirc();

		}
		return sum;
	}

}
