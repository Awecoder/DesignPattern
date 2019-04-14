package top.dtyy.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @author lzp
 * @version v1.0 at 2019/4/14
 * @description: 被观察者，继承jdk Observable接口
 */
public class Blog extends Observable {
    // 博客名称属性
    private String blogName;

    public Blog(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogName() {
        return blogName;
    }

    /**
     * 提交评论
     *
     * @param blog   博客
     * @param review 评论
     */
    public void produceQuestion(Blog blog, Review review) {
        System.out.println("[" + review.getUserName()
                + "]针对[" + blog.getBlogName()
                + "]博客提交了一个评论，评论的内容是[" + review.getReviewContent()
                + "].");
        setChanged();
        notifyObservers(review);
    }
}
