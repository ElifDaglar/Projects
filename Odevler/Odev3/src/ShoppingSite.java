public class ShoppingSite {
    private final String storeName;
    private int videoGameCount = 0;
    public static int totalGameStock = 0;




    private VideoGame[] videoGameList; //composition kavramı

    public ShoppingSite(String storeName) {
        this.storeName = storeName;
        videoGameList=new VideoGame[10];

    }


    public void addVideoGame(VideoGame game) {
        videoGameList[videoGameCount]=game;
        videoGameCount++;
        totalGameStock = game.getGameStock() + totalGameStock;




    }
    public void displayVideoGame(VideoGame game1){
        System.out.println("Name: " + game1.getGameName());
        System.out.println("price: " + game1.getGamePrice());
    }




    public String getStoreName() {
        return storeName;
    }


    public int getVideoGameCount() {
        return videoGameCount;
    }

    public void setVideoGameCount(int videoGameCount) {
        this.videoGameCount = videoGameCount;
    }

    public static int getTotalGameStock() {
        return totalGameStock;
    }

    public static void setTotalGameStock(int totalGameStock) {
        ShoppingSite.totalGameStock = totalGameStock;
    }

    public VideoGame[] getVideoGameList() {
        return videoGameList;
    }

    public void setVideoGameList(VideoGame[] videoGameList) {
        this.videoGameList = videoGameList;
    }
}


/*
-----------------------ARRAYLIST ILE YAPILAN HALİ-----------------
   public ArrayList<VideoGame> videoGameArrayList = new ArrayList<>();

    public void addVideoGame(VideoGame videoGame) {
        videoGameArrayList.add(videoGame);
        videoGameCount++;
        totalGameStock += videoGame.getGameStock();
    }
}


videogametest de
ShoppingSite shoppingSite = new ShoppingSite(" Game Center");
shoppingSite.addVideoGame(game1);
shoppingSite.deleteVideoGame(game1);

silmek için:
public void deleteVideoGame(Videogame videogame){
VideoGameList.remove(videoGame);
// remove yerine clear yazılırsa hepsini siler.
VideoGameList.clear();
videoGameCount--;
totalGameStock-=videoGame.getGameStock();
totalPrice-=videoGame.getGamePrice();
}


 */
