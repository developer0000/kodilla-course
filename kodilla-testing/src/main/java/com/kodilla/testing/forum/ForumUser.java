package com.kodilla.testing.forum;
import java.util.*;
public class ForumUser {

    private String name;                                        // [6]
    private String realName;                                    // [7]
    private List<ForumPost> posts = new ArrayList<>();          // [8]
    private List<ForumComment> comments = new LinkedList<>();


    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }


    public void addPost(String author, String postBody) {       // [14]
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }                                                           // [15]

    public void addComment(ForumPost thePost, String author, String commentBody) {   // [16]
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }

    public int getPostsQuantity() {                             // [18]
        return posts.size();
                                                      // [19]
    }                                                           // [20]

    public int getCommentsQuantity() {                          // [21]
        // return 100 temporarily
        return comments.size();
    }

    public ForumPost getPost(int postNumber) {                  // [24]
        if (postNumber >= 0 && postNumber < posts.size()) {
            return posts.get(postNumber);
        }

        return null;                                             // [25]
    }                                                           // [26]

    public ForumComment getComment(int commentNumber) {         // [27]
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(ForumPost thePost) {              // [30]
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
        }
        return result;                                            // [31]
    }                                                           // [32]

    public boolean removeComment(ForumComment theComment) {     // [33]
        boolean result = false;
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }





}
