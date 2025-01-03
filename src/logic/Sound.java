/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 *
 * @author DELL
 */
public class Sound {
    Clip clip;
    URL soundURL[] = new URL[30];
    public Sound(){
        soundURL[0] = getClass().getResource("/res/New.wav");          //screen
        soundURL[1] = getClass().getResource("/res/Boom.wav");         //isHasMine
        soundURL[2] = getClass().getResource("/res/ClickNumber.wav");  //Click square is number or flag
    
}
    
    public void setFile(int i){
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        }catch(Exception e){
        }
    }
    public void play(){
        clip.start();
    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop(){
        clip.stop();
    }
}

