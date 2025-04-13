package com.smartcms.smartcommon.model.content;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BlogPostContent.class, name = "BLOG_POST"),
        @JsonSubTypes.Type(value = SocialMediaContent.class, name = "SOCIAL_MEDIA"),
        @JsonSubTypes.Type(value = NewsletterContent.class, name = "NEWSLETTER"),
        @JsonSubTypes.Type(value = LandingPageContent.class, name = "LANDING_PAGE"),
        @JsonSubTypes.Type(value = PromotionalEmailContent.class, name = "PROMOTIONAL_EMAIL"),
        @JsonSubTypes.Type(value = CampaignBundleDetails.class, name = "CAMPAIGN_BUNDLE")
})
public interface ContentDetails {}
