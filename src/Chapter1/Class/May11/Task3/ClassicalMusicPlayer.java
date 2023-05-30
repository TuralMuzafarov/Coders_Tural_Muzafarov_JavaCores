package Chapter1.Class.May11.Task3;

public class ClassicalMusicPlayer implements  MusicPlayer {
    @Override
    public void play()
    {
        System.out.println("Class Music Played!");
    }

    @Override
    public void pause() {
        System.out.println("Class Music Paused!");
    }

    @Override
    public void stop() {
        System.out.println("Class Music Stopped!");
    }

    protected void playClassicalMusic()
    {
        System.out.println("Classical Music is played in JazzMusicPlayer!");
    }

}
