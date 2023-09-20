class AudioPlayer {
  public void play(String file) {
      System.out.println("Playing audio: " + file);
  }

  public void stop() {
      System.out.println("Stopping audio playback");
  }
}

class VolumeController {
  public void increaseVolume() {
      System.out.println("Increasing volume");
  }

  public void decreaseVolume() {
      System.out.println("Decreasing volume");
  }
}

class PlaylistManager {
  public void createPlaylist(String playlist) {
      System.out.println("Creating playlist: " + playlist);
  }

  public void addSong(String song) {
      System.out.println("Adding song to playlist: " + song);
  }
}

class MusicPlayerFacade {
  private AudioPlayer audioPlayer;
  private VolumeController volumeController;
  private PlaylistManager playlistManager;

  public MusicPlayerFacade() {
      this.audioPlayer = new AudioPlayer();
      this.volumeController = new VolumeController();
      this.playlistManager = new PlaylistManager();
  }

  public void playMusic(String file) {
      audioPlayer.play(file);
      volumeController.increaseVolume();
  }

  public void stopMusic() {
      audioPlayer.stop();
      volumeController.decreaseVolume();
  }

  public void createPlaylist(String playlist) {
      playlistManager.createPlaylist(playlist);
  }

  public void addSongToPlaylist(String song) {
      playlistManager.addSong(song);
  }
}

public class JavaExample {
  public static void main(String[] args) {
      MusicPlayerFacade musicPlayer = new MusicPlayerFacade();

      System.out.println("===== Play Music =====");
      musicPlayer.playMusic("song.mp3");

      System.out.println("\n===== Create Playlist =====");
      musicPlayer.createPlaylist("My Hit List");
      musicPlayer.addSongToPlaylist("Song 1");
      musicPlayer.addSongToPlaylist("Song 2");

      System.out.println("\n===== Stop Music =====");
      musicPlayer.stopMusic();
  }
}
