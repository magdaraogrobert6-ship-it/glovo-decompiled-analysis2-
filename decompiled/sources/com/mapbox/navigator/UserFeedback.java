package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class UserFeedback implements Serializable {
    private final String description;
    private final List<String> feedbackSubType;
    private final String feedbackType;
    private final ScreenshotFormat screenshot;

    public String getDescription() {
        return this.description;
    }

    public List<String> getFeedbackSubType() {
        return this.feedbackSubType;
    }

    public String getFeedbackType() {
        return this.feedbackType;
    }

    public ScreenshotFormat getScreenshot() {
        return this.screenshot;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.feedbackType, this.feedbackSubType, this.description, this.screenshot);
    }

    public UserFeedback(String str, List<String> list, String str2, ScreenshotFormat screenshotFormat) {
        this.feedbackType = str;
        this.feedbackSubType = list;
        this.description = str2;
        this.screenshot = screenshotFormat;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[feedbackType: ");
        IconCompatParcelizer.read(sb, this.feedbackType, ", feedbackSubType: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.feedbackSubType, ", description: ");
        IconCompatParcelizer.read(sb, this.description, ", screenshot: ");
        sb.append(RecordUtils.fieldToString(this.screenshot));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserFeedback userFeedback = (UserFeedback) obj;
        return Objects.equals(this.feedbackType, userFeedback.feedbackType) && Objects.equals(this.feedbackSubType, userFeedback.feedbackSubType) && Objects.equals(this.description, userFeedback.description) && Objects.equals(this.screenshot, userFeedback.screenshot);
    }
}
