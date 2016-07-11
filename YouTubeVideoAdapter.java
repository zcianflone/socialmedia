/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author zaccianflone
 */
public class YouTubeVideoAdapter implements SocialMediaEntry {
    
    YouTubeVideo youTubeVideo;
    
    public YouTubeVideoAdapter (YouTubeVideo youTubeVideo){
        this.youTubeVideo = youTubeVideo;
    }
    
     public String getUser(){
         return youTubeVideo.getAuthor();
     }
    public String getPostText(){
        return youTubeVideo.getTitle() + "//" + youTubeVideo.getDescription();
    }
    
}
