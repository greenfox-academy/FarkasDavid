public class Excercise02UrlFixer {
    public static void main(String... args){

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!


        String url = "https//www.reddit.com/r/nevertellmethebots";


            String replaceString = url.replace("bots","odds");//replaces all occurrences of "is" to "was"
            replaceString = replaceString.replace("s/","s:/");
            System.out.println(replaceString);

        }
    }






