package Practice_code.Interfaces_Java;

public class Car implements Engine,Media,Brake {
    @Override
    public void play()
    {
        System.out.println("Playing the music nigga");
    }
    @Override
    public void stop()
    {
        System.out.println("Stopping the engine dude");
    }
    @Override
    public void pause()
    {
        System.out.println("Pause the media player");
    }
    @Override
    public void start()
    {
        System.out.println("Start the engine");
    }
}
