package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.common.TelemetrySystemUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class AttachmentMetadata {
    private final String created;
    private String endTime;
    private final String fileId;
    private final String format;
    private final String name;
    private final String sessionId;
    private Integer size;
    private String startTime;
    private final String type;

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.created;
    }

    public final String component3() {
        return this.fileId;
    }

    public final String component4() {
        return this.format;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.sessionId;
    }

    public final Integer component7() {
        return this.size;
    }

    public final String component8() {
        return this.startTime;
    }

    public final String component9() {
        return this.endTime;
    }

    public final String getCreated() {
        return this.created;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getType() {
        return this.type;
    }

    public final void setEndTime(String str) {
        this.endTime = str;
    }

    public final void setSize(Integer num) {
        this.size = num;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.created), 31, this.fileId), 31, this.format), 31, this.type), 31, this.sessionId);
        Integer num = this.size;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.startTime;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.endTime;
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final AttachmentMetadata copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        return new AttachmentMetadata(str, str2, str3, str4, str5, str6, num, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentMetadata)) {
            return false;
        }
        AttachmentMetadata attachmentMetadata = (AttachmentMetadata) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, attachmentMetadata.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.created, attachmentMetadata.created}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fileId, attachmentMetadata.fileId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.format, attachmentMetadata.format}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, attachmentMetadata.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, attachmentMetadata.sessionId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.size, attachmentMetadata.size}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startTime, attachmentMetadata.startTime}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endTime, attachmentMetadata.endTime}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AttachmentMetadata(name=");
        sb.append(this.name);
        sb.append(", created=");
        sb.append(this.created);
        sb.append(", fileId=");
        sb.append(this.fileId);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.endTime, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AttachmentMetadata(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        if ((i & 2) != 0) {
            String strObtainCurrentDate = TelemetrySystemUtils.obtainCurrentDate();
            strObtainCurrentDate.getClass();
            str9 = strObtainCurrentDate;
        } else {
            str9 = str2;
        }
        this(str, str9, str3, str4, str5, str6, (i & 64) != 0 ? null : num, (i & Fields.SpotShadowColor) != 0 ? null : str7, (i & Fields.RotationX) != 0 ? null : str8);
    }

    public AttachmentMetadata(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        this.name = str;
        this.created = str2;
        this.fileId = str3;
        this.format = str4;
        this.type = str5;
        this.sessionId = str6;
        this.size = num;
        this.startTime = str7;
        this.endTime = str8;
    }
}
