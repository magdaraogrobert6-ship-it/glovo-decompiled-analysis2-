package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class OfflineRegionError implements Serializable {
    private final boolean isFatal;
    private final String message;
    private final Date retryAfter;
    private final OfflineRegionErrorType type;

    public boolean getIsFatal() {
        return this.isFatal;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getRetryAfter() {
        return this.retryAfter;
    }

    public OfflineRegionErrorType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        OfflineRegionErrorType offlineRegionErrorType = this.type;
        String str = this.message;
        boolean z = this.isFatal;
        return Objects.hash(offlineRegionErrorType, str, Boolean.valueOf(z), this.retryAfter);
    }

    public OfflineRegionError(OfflineRegionErrorType offlineRegionErrorType, String str, boolean z, Date date) {
        this.type = offlineRegionErrorType;
        this.message = str;
        this.isFatal = z;
        this.retryAfter = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", message: ");
        IconCompatParcelizer.read(sb, this.message, ", isFatal: ");
        MediaSessionCompatQueueItem.write(sb, this.isFatal, ", retryAfter: ");
        sb.append(RecordUtils.fieldToString(this.retryAfter));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionError.class != obj.getClass()) {
            return false;
        }
        OfflineRegionError offlineRegionError = (OfflineRegionError) obj;
        return Objects.equals(this.type, offlineRegionError.type) && Objects.equals(this.message, offlineRegionError.message) && this.isFatal == offlineRegionError.isFatal && Objects.equals(this.retryAfter, offlineRegionError.retryAfter);
    }
}
