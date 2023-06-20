package com.example.godeep.Modal;

public class Follow {

    public Follow() {
    }
    public String getFollowedAt() {
        return Integer.toString((int) followedAt);
    }

    public void setFollowedAt(long followedAt) {
        this.followedAt = followedAt;
    }

    private long followedAt;


    private String followedBy;

    public String getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(String followedBy) {
        this.followedBy = followedBy;
    }




}
