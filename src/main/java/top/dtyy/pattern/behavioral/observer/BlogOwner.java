package top.dtyy.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lzp
 * @version v1.0 at 2019/4/14
 * @description: 观察者，评论提出后被通知的那个对象
 */
public class BlogOwner implements Observer {
    private String blogOwnerName; // 博客主姓名

    public BlogOwner(String blogOwnerName) {
        this.blogOwnerName = blogOwnerName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Blog blog = (Blog) o;
        Review review = (Review) arg;
        System.out.println("作者[" + blogOwnerName
                + "]的[" + blog.getBlogName()
                + "]博客收到由[" + review.getUserName()
                + "]提出的一条评论，评论内容是[" + review.getReviewContent()
                + "].");
    }
}
