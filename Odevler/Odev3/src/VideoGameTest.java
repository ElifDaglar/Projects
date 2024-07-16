public class VideoGameTest {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame(" The Last of us 1",100,50, String.valueOf(VideoGame.gameType.Adventure));
        VideoGame game2 = new VideoGame("Puzzle", 150, 100,String.valueOf(VideoGame.gameType.Puzzle));
        ShoppingSite shoppingSite = new ShoppingSite(" Game Center");
        shoppingSite.addVideoGame(game1);
        shoppingSite.addVideoGame(game2);
        shoppingSite.displayVideoGame(game1);
        System.out.println("Name of the game store:"+shoppingSite.getStoreName());
        System.out.println("Name of the game:"+ game1.getGameName());
        System.out.println("Price of the game:"+" $"+game1.getGamePrice());
        System.out.println("Type of the game: "+VideoGame.gameType.Adventure);
        System.out.println("Total game stock of the shopping site: " +ShoppingSite.totalGameStock);
        VideoGame game3=new VideoGame("oyun",20,30,String.valueOf(VideoGame.gameType.Fighting),"şirket");


    }
}
