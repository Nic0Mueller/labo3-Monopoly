/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

public class Piece {

    private Square currentPosition;
    private String name;

    public Piece (String name, Square square) {
        this.currentPosition = square;
        this.name = name;
    }

    public Square getCurrentPosition() {
        return currentPosition;
    }

    public String getName() {
        return name;
    }

    public void setCurrentPosition(Square currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void setName(String name) {
        this.name = name;
    }
}
