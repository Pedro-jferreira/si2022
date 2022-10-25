package testes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

public class BandeiraDoBrasil extends JPanel {

    public BandeiraDoBrasil() {
        super.setPreferredSize( new Dimension( 10000000, 9000000) );
        super.setBackground( Color.BLACK );
    }

    public void paint(Graphics g ) {
        super.paint(g);
        int larguraTela = super.getWidth();
        int alturaTela = super.getHeight();

        int centroX = larguraTela / 2;
        int centroY = alturaTela  / 2;

        int larguraBandeira = 4000;
        int bandeiraX = centroX - ( larguraBandeira / 2 );
        int alturaBandeira = 3500;
        int bandeiraY = centroY - ( alturaBandeira / 2 );

        g.setColor( Color.GREEN );
        g.fillRect( bandeiraX, bandeiraY, larguraBandeira, alturaBandeira);

        int[] losangoXs = new int[ 4 ];
        int larguraLosango = 1000;
        losangoXs[0] = centroX - ( larguraLosango / 2 );
        losangoXs[1] = centroX;
        losangoXs[2] = centroX + ( larguraLosango / 2 );
        losangoXs[3] = centroX;

        int[] losangoYs = new int[ 4 ];
        losangoYs[0] = centroY;
        int alturaLosango = 400;
        losangoYs[1] = centroY - ( alturaLosango / 2 );
        losangoYs[2] = centroY;
        losangoYs[3] = centroY + ( alturaLosango / 2 );

        g.setColor( Color.YELLOW );
        g.fillPolygon( losangoXs, losangoYs, 4 );

        int raioCirculo = 100;
        int circuloX = centroX - raioCirculo;
        int circuloY = centroY - raioCirculo;
        int larguraCirculo = 2 * raioCirculo;
        int alturaCirculo = 2 * raioCirculo;

        String text = "ordem e progresso";
        int dimex= 2000;
        int dimey = 2000;





        g.setColor( Color.BLUE );
        g.fillArc( circuloX, circuloY, larguraCirculo , alturaCirculo, 0, 480 );
        JTextArea textAreal = new JTextArea(text);
        textAreal.setPreferredSize(new Dimension(300, 150));
        g.drawString(text,dimex,dimey );

    }

    public static void main(String[] args) {
        BandeiraDoBrasil painel = new BandeiraDoBrasil();

        JFrame f = new JFrame();
        f.setContentPane( painel );
        f.setTitle( "Bandeira do Brasil" );
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setSize( 500, 500 );
        f.setLocationRelativeTo( f );
        f.setVisible( true );
    }

}