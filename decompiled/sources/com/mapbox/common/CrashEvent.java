package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class CrashEvent implements Serializable {
    private final String appStartDate;
    private final HashMap<String, String> customData;
    private final boolean isSilent;
    private final String threadDetails;

    public String getAppStartDate() {
        return this.appStartDate;
    }

    public HashMap<String, String> getCustomData() {
        return this.customData;
    }

    public boolean getIsSilent() {
        return this.isSilent;
    }

    public String getThreadDetails() {
        return this.threadDetails;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public CrashEvent(boolean z, String str, String str2, HashMap<String, String> map) {
        this.isSilent = z;
        this.threadDetails = str;
        this.appStartDate = str2;
        this.customData = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[isSilent: ");
        MediaSessionCompatQueueItem.write(sb, this.isSilent, ", threadDetails: ");
        IconCompatParcelizer.read(sb, this.threadDetails, ", appStartDate: ");
        IconCompatParcelizer.read(sb, this.appStartDate, ", customData: ");
        sb.append(RecordUtils.fieldToString(this.customData));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        boolean z = this.isSilent;
        return Objects.hash(Boolean.valueOf(z), this.threadDetails, this.appStartDate, this.customData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrashEvent crashEvent = (CrashEvent) obj;
        return this.isSilent == crashEvent.isSilent && Objects.equals(this.threadDetails, crashEvent.threadDetails) && Objects.equals(this.appStartDate, crashEvent.appStartDate) && Objects.equals(this.customData, crashEvent.customData);
    }
}
