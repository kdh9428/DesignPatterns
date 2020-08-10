package Observers.Swing;

import java.util.List;

public class TechBlog implements Subject {

    private List<Observer> observerList;
    private Article article;

    public TechBlog(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

        int index = observerList.indexOf(observer);

        if (index >= 0){
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {

        System.out.println("등록 알람");
        for (Observer observer : observerList){
            observer.update(this);
        }
    }

    public void newPosting(Article article){
        System.out.println("새 글 등록");
        this.article = article;
        notifyObservers();
    }

    public Article getArticle() {

        return article;
    }
}
