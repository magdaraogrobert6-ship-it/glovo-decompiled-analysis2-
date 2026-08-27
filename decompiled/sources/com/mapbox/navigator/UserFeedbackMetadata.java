package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class UserFeedbackMetadata implements Serializable {
    private final String feedbackId;
    private final List<FixLocation> locationsAfter;
    private final List<FixLocation> locationsBefore;
    private final Step step;

    public String getFeedbackId() {
        return this.feedbackId;
    }

    public List<FixLocation> getLocationsAfter() {
        return this.locationsAfter;
    }

    public List<FixLocation> getLocationsBefore() {
        return this.locationsBefore;
    }

    public Step getStep() {
        return this.step;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.feedbackId, this.locationsBefore, this.locationsAfter, this.step);
    }

    public UserFeedbackMetadata(String str, List<FixLocation> list, List<FixLocation> list2, Step step) {
        this.feedbackId = str;
        this.locationsBefore = list;
        this.locationsAfter = list2;
        this.step = step;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[feedbackId: ");
        IconCompatParcelizer.read(sb, this.feedbackId, ", locationsBefore: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.locationsBefore, ", locationsAfter: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.locationsAfter, ", step: ");
        sb.append(RecordUtils.fieldToString(this.step));
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
        UserFeedbackMetadata userFeedbackMetadata = (UserFeedbackMetadata) obj;
        return Objects.equals(this.feedbackId, userFeedbackMetadata.feedbackId) && Objects.equals(this.locationsBefore, userFeedbackMetadata.locationsBefore) && Objects.equals(this.locationsAfter, userFeedbackMetadata.locationsAfter) && Objects.equals(this.step, userFeedbackMetadata.step);
    }
}
