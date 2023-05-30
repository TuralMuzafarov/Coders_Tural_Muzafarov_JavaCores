package Chapter1.Class.May11.Task3;

public class JazzMusicPlayer implements  MusicPlayer{
    @Override
    public void play()
    {
        System.out.println("Jazz Music Played!");
    }

    @Override
    public void pause() {
        System.out.println("Jazz Music Paused!");
    }

    public void stop() {
        System.out.println("Jazz Music Stopped!");
    }

    protected void playJazzMusic()
    {
        System.out.println("Jazz Music is played in the JazzMusicPlayer");
    }

}
