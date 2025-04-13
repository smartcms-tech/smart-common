package com.smartcms.smartcommon.model.content;

import com.smartcms.smartcommon.model.account.OrgDetails;
import com.smartcms.smartcommon.model.account.UserDetails;
import com.smartcms.smartcommon.model.ai.AIInsights;
import com.smartcms.smartcommon.model.media.MediaReference;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
import java.util.List;

@Document(collection = "content")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@CompoundIndex(name = "unique_slug_per_org", def = "{'orgDetails.orgId': 1, 'contentDetails.slug': 1}", unique = true, sparse = true)
public class Content {

    @Id
    private String id;

    private String title;
    private List<String> tags;
    private String description;

    private ContentStatus status;
    private ContentType contentType;

    private ContentDetails contentDetails; // Polymorphic field

    private UserDetails author;
    private OrgDetails orgDetails;

    private Instant createdAt;
    private Instant updatedAt;
    private int version;
    private UserDetails lastUpdatedBy;

    private Instant scheduledPublishAt;
    private Instant deletedAt;

    private AIInsights aiInsights;
}

