package com.qualtrics.digital;

import com.qualtrics.digital.theming.embedded.EmbeddedAppFeedbackTheme;
import com.qualtrics.digital.theming.prompt.MobileAppPromptTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class QualtricsTheme {
    public static final Companion Companion = new Companion(null);
    private final EmbeddedAppFeedbackTheme embeddedAppFeedbackTheme;
    private final MobileAppPromptTheme mobileAppPromptTheme;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final QualtricsTheme buildDefaultQualtricsTheme() {
            return new Builder().build();
        }

        private Companion() {
        }
    }

    public final EmbeddedAppFeedbackTheme getEmbeddedAppFeedbackTheme() {
        return this.embeddedAppFeedbackTheme;
    }

    public final MobileAppPromptTheme getMobileAppPromptTheme() {
        return this.mobileAppPromptTheme;
    }

    public static final class Builder {
        private MobileAppPromptTheme mobileAppPromptTheme = new MobileAppPromptTheme(0, 0, null, 0, null, 0, 0, null, null, 511, null);
        private EmbeddedAppFeedbackTheme embeddedAppFeedbackTheme = new EmbeddedAppFeedbackTheme(0, 0, 0, null, null, null, null, null, null, null, null, null, null, 8191, null);

        public final EmbeddedAppFeedbackTheme getEmbeddedAppFeedbackTheme$qualtrics_productionRelease() {
            return this.embeddedAppFeedbackTheme;
        }

        public final MobileAppPromptTheme getMobileAppPromptTheme$qualtrics_productionRelease() {
            return this.mobileAppPromptTheme;
        }

        public final QualtricsTheme build() {
            return new QualtricsTheme(this, null);
        }

        public final Builder setEmbeddedAppFeedbackTheme(EmbeddedAppFeedbackTheme embeddedAppFeedbackTheme) {
            embeddedAppFeedbackTheme.getClass();
            this.embeddedAppFeedbackTheme = embeddedAppFeedbackTheme;
            return this;
        }

        public final void setEmbeddedAppFeedbackTheme$qualtrics_productionRelease(EmbeddedAppFeedbackTheme embeddedAppFeedbackTheme) {
            embeddedAppFeedbackTheme.getClass();
            this.embeddedAppFeedbackTheme = embeddedAppFeedbackTheme;
        }

        public final Builder setMobileAppPromptTheme(MobileAppPromptTheme mobileAppPromptTheme) {
            mobileAppPromptTheme.getClass();
            this.mobileAppPromptTheme = mobileAppPromptTheme;
            return this;
        }

        public final void setMobileAppPromptTheme$qualtrics_productionRelease(MobileAppPromptTheme mobileAppPromptTheme) {
            mobileAppPromptTheme.getClass();
            this.mobileAppPromptTheme = mobileAppPromptTheme;
        }
    }

    public static final QualtricsTheme buildDefaultQualtricsTheme() {
        return Companion.buildDefaultQualtricsTheme();
    }

    private QualtricsTheme(Builder builder) {
        this.mobileAppPromptTheme = builder.getMobileAppPromptTheme$qualtrics_productionRelease();
        this.embeddedAppFeedbackTheme = builder.getEmbeddedAppFeedbackTheme$qualtrics_productionRelease();
    }

    public /* synthetic */ QualtricsTheme(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
