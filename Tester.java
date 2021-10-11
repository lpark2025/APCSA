import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Tester {
static Thread th;


public static void main(String[] args) throws Exception {
     Clip clip = AudioSystem.getClip();
     AudioInputStream ais = AudioSystem.getAudioInputStream(new File("/Users/pbarker/eclipse-workspace/test.wav"));
     clip.open(ais);
     clip.loop(0);
     // Calculate totalFrames
     long totalFrames = (long)(clip.getFrameLength() * clip.getFormat().getFrameRate());
     Thread.sleep( ( totalFrames* 1000 )); // pause the thread till the sound plays

     System.out.println(clip.getFrameLength());
     System.out.println(clip.getFormat().getFrameRate());           
 }
}
