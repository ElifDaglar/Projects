public class VideoGame {
    private String gameName;
    private int gameStock;
    private int gamePrice;
    private String gameType;
    private String company;


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGameStock() {
        return gameStock;
    }

    public void setGameStock(int gameStock) {
        this.gameStock = gameStock;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public VideoGame(String gameName, int gamePrice, int gameStock, String gameType) {
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.gameStock = gameStock;
        this.gameType = gameType;


    }

    public VideoGame(String gameName, int gamePrice, int gameStock, String gameType, String company) {
        this.gameName = gameName;
        this.gameType = gameType;
        this.gamePrice = gamePrice;
        this.gameStock = gameStock;
        this.company = company;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public enum gameType {
        Adventure,
        Sports,
        Fighting,
        Puzzle,
        Simulation,
        Strategy,
        Racing
    }


}
