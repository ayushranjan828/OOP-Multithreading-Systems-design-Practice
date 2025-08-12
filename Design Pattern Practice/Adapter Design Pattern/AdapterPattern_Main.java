// Target Interface
interface MediaPlayer 
{
    void play(String audioType, String fileName);
}

// Adaptee
class AdvancedMediaPlayer 
{
    public void playMp4(String fileName) 
    {
        System.out.println("Playing mp4 file: " + fileName);
    }
}

// Adapter
class MediaAdapter implements MediaPlayer 
{
    private AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedPlayer) 
    {
        this.advancedPlayer = advancedPlayer;
    }

    @Override
    public void play(String audioType, String fileName) 
    {
        if (audioType.equalsIgnoreCase("mp4")) 
        {
            advancedPlayer.playMp4(fileName);
        } 
        else 
        {
            System.out.println("Format not supported: " + audioType);
        }
    }
}

// Client
class AudioPlayer implements MediaPlayer 
{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) 
    {
        if (audioType.equalsIgnoreCase("mp3")) 
        {
            System.out.println("Playing mp3 file: " + fileName);
        } 
        else if (audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(new AdvancedMediaPlayer());
            mediaAdapter.play(audioType, fileName);
        } 
        else 
        {
            System.out.println("Invalid media: " + audioType);
        }
    }
}

// Test
public class AdapterPattern_Main 
{
    public static void main(String[] args) 
    {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song.mp3");
        player.play("mp4", "movie.mp4");
        player.play("avi", "clip.avi");
    }
}
