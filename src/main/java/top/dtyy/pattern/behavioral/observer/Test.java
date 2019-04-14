package top.dtyy.pattern.behavioral.observer;

/**
 * @author lzp
 * @version v1.0 at 2019/4/14
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Blog blog = new Blog("观察者模式");
        BlogOwner lzp = new BlogOwner("lzp");
        // 举例不够合适，可以添加多个观察者
        blog.addObserver(lzp);

        Review review = new Review();
        review.setUserName("ping");
        review.setReviewContent("设计模式学习");

        blog.produceQuestion(blog,review);
    }
}
