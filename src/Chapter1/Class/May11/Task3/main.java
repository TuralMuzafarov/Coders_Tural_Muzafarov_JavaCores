package Chapter1.Class.May11.Task3;
import Chapter1.Class.May11.Task3.*;

public class main {

    public static void main(String[] args) {
        JazzMusicPlayer player1 = new JazzMusicPlayer();
        ClassicalMusicPlayer player2 = new ClassicalMusicPlayer();

        player1.stop();
        player2.stop();

        player1.play();
        player2.play();

        player1.pause();
        player2.pause();

        player1.playJazzMusic();
        player2.playClassicalMusic();

    }







}
