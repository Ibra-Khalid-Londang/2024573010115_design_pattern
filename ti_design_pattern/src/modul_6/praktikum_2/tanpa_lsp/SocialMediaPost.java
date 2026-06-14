package modul_6.praktikum_2.tanpa_lsp;

public class SocialMediaPost {
    protected String content;

    public SocialMediaPost(String content) {
        this.content = content;
    }

    public void publish() {
        System.out.println("Publishing post: " + content);
    }

    public int calculateMaxCharacters() {
        return 1000;
    }
}
