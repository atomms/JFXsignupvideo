package sample;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * 
 * @author ernesto
 *
 */
public class Controller {

    @FXML
    private MediaView mediaView;

    public void initialize() {

        Media media2= new Media(getClass().getResource("media/Top_10_Extreme_Sports.mp4").toExternalForm());
        MediaPlayer player=new MediaPlayer(media2);
        mediaView.setMediaPlayer(player);
        player.setVolume(0);
        player.play();

    }
}
