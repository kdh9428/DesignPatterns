package Observers.Swing;

public class MailPlatform implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("새 글 등록 알림");

        if (subject instanceof TechBlog){
            TechBlog techBlog = (TechBlog) subject;
            Article article = techBlog.getArticle();
            System.out.println(article);
        }
    }
}
