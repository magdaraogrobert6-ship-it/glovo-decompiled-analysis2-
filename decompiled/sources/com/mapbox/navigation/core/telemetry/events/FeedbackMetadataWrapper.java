package com.mapbox.navigation.core.telemetry.events;

import com.mapbox.navigation.base.ExperimentalPreviewMapboxNavigationAPI;
import com.mapbox.navigator.UserFeedbackHandle;
import com.mapbox.navigator.UserFeedbackMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@ExperimentalPreviewMapboxNavigationAPI
public final class FeedbackMetadataWrapper {
    public static final Companion Companion = new Companion(null);
    private final UserFeedbackHandle userFeedbackHandle;

    public final FeedbackMetadata get() {
        FeedbackMetadata.Companion companion = FeedbackMetadata.Companion;
        UserFeedbackMetadata metadata = this.userFeedbackHandle.getMetadata();
        metadata.getClass();
        return companion.create$navigation_release(metadata);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ FeedbackMetadataWrapper create(UserFeedbackHandle userFeedbackHandle) {
            userFeedbackHandle.getClass();
            return new FeedbackMetadataWrapper(userFeedbackHandle, null);
        }
    }

    private FeedbackMetadataWrapper(UserFeedbackHandle userFeedbackHandle) {
        this.userFeedbackHandle = userFeedbackHandle;
    }

    public /* synthetic */ FeedbackMetadataWrapper(UserFeedbackHandle userFeedbackHandle, DefaultConstructorMarker defaultConstructorMarker) {
        this(userFeedbackHandle);
    }
}
