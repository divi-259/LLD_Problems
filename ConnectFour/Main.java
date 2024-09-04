package ConnectFour;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(6, 7);
        Game game = new Game(grid, 4, 10);
        game.play();
    }
}


// command to compile all the files together - javac ConnectFour/*.java
// to run  - java ConnectFour.Main
