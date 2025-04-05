package com.smartcms.smartcommon.model;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AIInsights {
    private String prompt;
    private int wordCount;
    private String tone;
    private String targetAudience;
    private String generatedBy;
    private Instant generatedAt;
}