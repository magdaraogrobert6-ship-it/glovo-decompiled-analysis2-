package com.mapbox.search.internal.bindgen;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class FeedbackProperties implements Serializable {
    private final String appSessionId;
    private final String appUserId;
    private final String feedbackId;
    private final String feedbackReason;
    private final String feedbackText;
    private final boolean isTest;
    private final Point reportLocation;
    private final byte[] screenshot;

    public String getAppSessionId() {
        return this.appSessionId;
    }

    public String getAppUserId() {
        return this.appUserId;
    }

    public String getFeedbackId() {
        return this.feedbackId;
    }

    public String getFeedbackReason() {
        return this.feedbackReason;
    }

    public String getFeedbackText() {
        return this.feedbackText;
    }

    public boolean getIsTest() {
        return this.isTest;
    }

    public Point getReportLocation() {
        return this.reportLocation;
    }

    public byte[] getScreenshot() {
        return this.screenshot;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.feedbackReason, this.feedbackText, this.screenshot, this.reportLocation, this.appUserId, this.appSessionId, this.feedbackId, Boolean.valueOf(this.isTest));
    }

    public FeedbackProperties(String str, String str2, byte[] bArr, Point point, String str3, String str4, String str5, boolean z) {
        this.feedbackReason = str;
        this.feedbackText = str2;
        this.screenshot = bArr;
        this.reportLocation = point;
        this.appUserId = str3;
        this.appSessionId = str4;
        this.feedbackId = str5;
        this.isTest = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[feedbackReason: ");
        IconCompatParcelizer.read(sb, this.feedbackReason, ", feedbackText: ");
        IconCompatParcelizer.read(sb, this.feedbackText, ", screenshot: ");
        sb.append(RecordUtils.fieldToString(this.screenshot));
        sb.append(", reportLocation: ");
        c8$$ExternalSyntheticOutline0.m(this.reportLocation, sb, ", appUserId: ");
        IconCompatParcelizer.read(sb, this.appUserId, ", appSessionId: ");
        IconCompatParcelizer.read(sb, this.appSessionId, ", feedbackId: ");
        IconCompatParcelizer.read(sb, this.feedbackId, ", isTest: ");
        return ff$$ExternalSyntheticOutline0.m(this.isTest, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FeedbackProperties feedbackProperties = (FeedbackProperties) obj;
        return Objects.equals(this.feedbackReason, feedbackProperties.feedbackReason) && Objects.equals(this.feedbackText, feedbackProperties.feedbackText) && Objects.equals(this.screenshot, feedbackProperties.screenshot) && Objects.equals(this.reportLocation, feedbackProperties.reportLocation) && Objects.equals(this.appUserId, feedbackProperties.appUserId) && Objects.equals(this.appSessionId, feedbackProperties.appSessionId) && Objects.equals(this.feedbackId, feedbackProperties.feedbackId) && this.isTest == feedbackProperties.isTest;
    }
}
