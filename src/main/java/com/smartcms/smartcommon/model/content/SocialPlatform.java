package com.smartcms.smartcommon.model.content;

import lombok.Getter;

@Getter
public enum SocialPlatform {
    FACEBOOK("Facebook", "fb.com"),
    INSTAGRAM("Instagram", "instagram.com"),
    TWITTER("Twitter", "twitter.com"),
    LINKEDIN("LinkedIn", "linkedin.com"),
    YOUTUBE("YouTube", "youtube.com"),
    SNAPCHAT("Snapchat", "snapchat.com"),
    PINTEREST("Pinterest", "pinterest.com"),
    THREAD("Thread", "thread.com");

    private final String platformName;
    private final String baseUrl;

    SocialPlatform(String platformName, String baseUrl) {
        this.platformName = platformName;
        this.baseUrl = baseUrl;
    }
}


