package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Set;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class NavFeedbackSubmitted {
    private final String description;
    private final String feedbackId;
    private final HistoryPoint location;
    private final Set<String> subtype;
    private final String type;

    public final String component1() {
        return this.feedbackId;
    }

    public final String component2() {
        return this.type;
    }

    public final Set<String> component3() {
        return this.subtype;
    }

    public final HistoryPoint component4() {
        return this.location;
    }

    public final String component5() {
        return this.description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFeedbackId() {
        return this.feedbackId;
    }

    public final HistoryPoint getLocation() {
        return this.location;
    }

    public final Set<String> getSubtype() {
        return this.subtype;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.feedbackId.hashCode() * 31, 31, this.type);
        int iHashCode = this.subtype.hashCode();
        return this.description.hashCode() + ((this.location.hashCode() + ((iHashCode + iM) * 31)) * 31);
    }

    public NavFeedbackSubmitted(String str, String str2, Set<String> set, HistoryPoint historyPoint, String str3) {
        str.getClass();
        str2.getClass();
        set.getClass();
        historyPoint.getClass();
        str3.getClass();
        this.feedbackId = str;
        this.type = str2;
        this.subtype = set;
        this.location = historyPoint;
        this.description = str3;
    }

    public final NavFeedbackSubmitted copy(String str, String str2, Set<String> set, HistoryPoint historyPoint, String str3) {
        str.getClass();
        str2.getClass();
        set.getClass();
        historyPoint.getClass();
        str3.getClass();
        return new NavFeedbackSubmitted(str, str2, set, historyPoint, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavFeedbackSubmitted copy$default(NavFeedbackSubmitted navFeedbackSubmitted, String str, String str2, Set set, HistoryPoint historyPoint, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navFeedbackSubmitted.feedbackId;
        }
        if ((i & 2) != 0) {
            str2 = navFeedbackSubmitted.type;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            set = navFeedbackSubmitted.subtype;
        }
        Set set2 = set;
        if ((i & 8) != 0) {
            historyPoint = navFeedbackSubmitted.location;
        }
        HistoryPoint historyPoint2 = historyPoint;
        if ((i & 16) != 0) {
            str3 = navFeedbackSubmitted.description;
        }
        return navFeedbackSubmitted.copy(str, str4, set2, historyPoint2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavFeedbackSubmitted)) {
            return false;
        }
        NavFeedbackSubmitted navFeedbackSubmitted = (NavFeedbackSubmitted) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.feedbackId, navFeedbackSubmitted.feedbackId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, navFeedbackSubmitted.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtype, navFeedbackSubmitted.subtype}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, navFeedbackSubmitted.location}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, navFeedbackSubmitted.description}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavFeedbackSubmitted(feedbackId=");
        sb.append(this.feedbackId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", description=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.description, ')');
    }
}
