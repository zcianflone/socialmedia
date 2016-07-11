package socialmedia;


import java.util.ArrayList;
import java.util.List;


/**
 * This is the main class for the example. It sets up several facebook posts,
 * tweets, and youtube videos and analyzes them. It can't actually analyze
 * the YouTube videos yet, because they don't implement the correct interface.
 * Once you get them working, uncomment the lines at the bottom of this file
 * that add them to the list.
 * 
 * @author sburton
 */
public class SocialMediaDemo implements Runnable {

    public void run () {
        analyzeFacebookPosts();
        analyzeTweets();
        analyzeYouTubeVideos();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SocialMediaDemo().run();
    }

    private void analyzeFacebookPosts() {
        System.out.println("Setting up Facebook posts...");
        
        FacebookPost post1 = new FacebookPost("John", "It's another great day", 300);
        FacebookPost post2 = new FacebookPost("Emily", "I love CS 246", 21);
        FacebookPost post3 = new FacebookPost("Andy", "Everything is awesome!", 1000);
        
        List<SocialMediaEntry> entries = new ArrayList<>();
        entries.add(post1);
        entries.add(post2);
        entries.add(post3);
        
        DataAnalyzer analyzer = new DataAnalyzer();
        analyzer.analyzeEntries(entries);
    }

    private void analyzeTweets() {
        System.out.println("Setting up Tweets...");
        
        Tweet tweet1 = new Tweet("Allison", "Java is so much fun.", 12);
        Tweet tweet2 = new Tweet("Jean-luc", "Now I have a problem factory.", 58);
        
        List<SocialMediaEntry> entries = new ArrayList<>();
        entries.add(tweet1);
        entries.add(tweet2);
        
        DataAnalyzer analyzer = new DataAnalyzer();
        analyzer.analyzeEntries(entries);    }

    private void analyzeYouTubeVideos() {
        System.out.println("Setting up YouTube videos...");
        
        YouTubeVideo video1 = new YouTubeVideo("MormonMessages", "Bullying",
                "President Uchtdorf counsels us to stop bullying.");
        
        YouTubeVideo video2 = new YouTubeVideo("MormonMessages", "Patterns of Light",
                "Elder Bednar teaches about the Light of Christ.");
        
        YouTubeVideo video3 = new YouTubeVideo("Randy Pausch", "The Last Lecture",
                "Achieving your childhood dreams.");
        
        YouTubeVideoAdapter adaptVideo1 = new YouTubeVideoAdapter(video1);
        YouTubeVideoAdapter adaptVideo2 = new YouTubeVideoAdapter(video2);
        YouTubeVideoAdapter adaptVideo3 = new YouTubeVideoAdapter(video3);
        
        List<SocialMediaEntry> entries = new ArrayList<>();
        
        // YouTubeVideo does not implement the correct interface to allow this!
        entries.add(adaptVideo1);
        entries.add(adaptVideo2);
        entries.add(adaptVideo3);
        
        DataAnalyzer analyzer = new DataAnalyzer();
        analyzer.analyzeEntries(entries);
    }
    
}
