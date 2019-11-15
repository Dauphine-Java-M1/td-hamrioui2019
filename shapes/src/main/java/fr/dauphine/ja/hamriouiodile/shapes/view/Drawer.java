package fr.dauphine.ja.hamriouiodile.shapes.view;

import java.awt.Graphics;
/*Je crée une interface drawer */
public interface Drawer {
	/*Cette méthode est chargée de dessiner la représentation de l'objet,
	 * 	selon son implémentation. donc si je veux dessiner une forme je dois implémenter cette 
	 * methode de tel sorte à ce que je puisse dessiner celle ci
	 */
	public void draw(Graphics g);
}
