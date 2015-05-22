Exercise description

Basic geometrical figures are triangles, rectangles and ellipses (in this exercise). A geometrical figure is either a basic figure or a figure composed of other figures (that can be basic or composed).
Every geometrical figure has a name (with get/set methods), a draw() method (that just prints the name and type (triangle, rectangles, composite, etc.) of the figure) and a calcCirc() method (that calculates the circumference of the figure; it is the sum of the circumferences of the composed figures, if it a composite figure).
In a Composite pattern implementation of figures, Figure will be the base interface (either implemented as an interface or an abstract class – the latter is the easiest).
Programme a test class that builds a figure composed of other figures (some basic and some composed). You must be able to draw the whole figure with just one use of the draw() method and to calculate the total circumference with just one use of the calcCirc() method.
