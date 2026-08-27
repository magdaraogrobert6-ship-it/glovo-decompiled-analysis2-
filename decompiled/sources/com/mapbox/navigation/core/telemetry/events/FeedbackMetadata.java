package com.mapbox.navigation.core.telemetry.events;

import com.google.gson.Gson;
import com.mapbox.navigation.base.ExperimentalPreviewMapboxNavigationAPI;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigator.UserFeedbackMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@ExperimentalPreviewMapboxNavigationAPI
public final class FeedbackMetadata {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_CATEGORY = "FeedbackMetadata";
    private final UserFeedbackMetadata userFeedbackMetadata;

    public final UserFeedbackMetadata getUserFeedbackMetadata$navigation_release() {
        return this.userFeedbackMetadata;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalPreviewMapboxNavigationAPI
        public final FeedbackMetadata fromJson(String str) {
            str.getClass();
            try {
                return (FeedbackMetadata) new Gson().fromJson(str, FeedbackMetadata.class);
            } catch (Exception e) {
                LoggerProviderKt.logE("Unable to create FeedbackMetadata: " + e, FeedbackMetadata.LOG_CATEGORY);
                return null;
            }
        }

        private Companion() {
        }

        public final /* synthetic */ FeedbackMetadata create$navigation_release(UserFeedbackMetadata userFeedbackMetadata) {
            userFeedbackMetadata.getClass();
            return new FeedbackMetadata(userFeedbackMetadata, null);
        }
    }

    @ExperimentalPreviewMapboxNavigationAPI
    public static final FeedbackMetadata fromJson(String str) {
        return Companion.fromJson(str);
    }

    public int hashCode() {
        return this.userFeedbackMetadata.hashCode();
    }

    private FeedbackMetadata(UserFeedbackMetadata userFeedbackMetadata) {
        this.userFeedbackMetadata = userFeedbackMetadata;
    }

    public final String toJson(Gson gson) {
        gson.getClass();
        String json = gson.toJson(this);
        json.getClass();
        return json;
    }

    public String toString() {
        return "FeedbackMetadata(userFeedbackMetadata=" + this.userFeedbackMetadata + ')';
    }

    public /* synthetic */ FeedbackMetadata(UserFeedbackMetadata userFeedbackMetadata, DefaultConstructorMarker defaultConstructorMarker) {
        this(userFeedbackMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!FeedbackMetadata.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userFeedbackMetadata, ((FeedbackMetadata) obj).userFeedbackMetadata}, getCieXyz.write())).booleanValue();
    }
}
