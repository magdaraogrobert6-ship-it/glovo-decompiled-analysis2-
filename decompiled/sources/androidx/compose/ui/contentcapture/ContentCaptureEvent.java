package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import bo.app.d$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class ContentCaptureEvent {
    private final int id;
    private final ViewStructureCompat structureCompat;
    private final long timestamp;
    private final ContentCaptureEventType type;

    public final int component1() {
        return this.id;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final ContentCaptureEventType component3() {
        return this.type;
    }

    public final ViewStructureCompat component4() {
        return this.structureCompat;
    }

    public final int getId() {
        return this.id;
    }

    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ContentCaptureEventType getType() {
        return this.type;
    }

    public final ContentCaptureEvent copy(int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        return new ContentCaptureEvent(i, j, contentCaptureEventType, viewStructureCompat);
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.timestamp);
        int iHashCode = this.type.hashCode();
        ViewStructureCompat viewStructureCompat = this.structureCompat;
        return ((iHashCode + iM) * 31) + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public ContentCaptureEvent(int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        this.id = i;
        this.timestamp = j;
        this.type = contentCaptureEventType;
        this.structureCompat = viewStructureCompat;
    }

    public static /* synthetic */ ContentCaptureEvent copy$default(ContentCaptureEvent contentCaptureEvent, int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contentCaptureEvent.id;
        }
        if ((i2 & 2) != 0) {
            j = contentCaptureEvent.timestamp;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            contentCaptureEventType = contentCaptureEvent.type;
        }
        ContentCaptureEventType contentCaptureEventType2 = contentCaptureEventType;
        if ((i2 & 8) != 0) {
            viewStructureCompat = contentCaptureEvent.structureCompat;
        }
        return contentCaptureEvent.copy(i, j2, contentCaptureEventType2, viewStructureCompat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) obj;
        if (this.id != contentCaptureEvent.id || this.timestamp != contentCaptureEvent.timestamp || this.type != contentCaptureEvent.type) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.structureCompat, contentCaptureEvent.structureCompat}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", structureCompat=" + this.structureCompat + ')';
    }
}
