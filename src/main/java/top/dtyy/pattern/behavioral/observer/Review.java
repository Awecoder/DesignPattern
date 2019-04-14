package top.dtyy.pattern.behavioral.observer;

/**
 * @author lzp
 * @version v1.0 at 2019/4/14
 * @description: 问题类，针对博客提出的问题
 */
public class Review {
    // 评论提出人
    private String userName;
    // 评论内容
    private String reviewContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }
}
