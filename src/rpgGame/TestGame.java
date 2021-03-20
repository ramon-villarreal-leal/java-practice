package rpgGame;

public class TestGame {
    private String gameText;
    private String prompts;
    private String test1;
    private String test2;

    public String getGameText() {
        return gameText;
    }

    public void setGameText(String gameText) {
        this.gameText = gameText;
    }

    public String getPrompts() {
        return prompts;
    }

    public void setPrompts(String prompts) {
        this.prompts = prompts;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public TestGame(String gameText, String prompts, String test1, String test2) {
        this.gameText = gameText;
        this.prompts = prompts;
        this.test1 = test1;
        this.test2 = test2;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
}
