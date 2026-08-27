package o;

import android.content.ContentValues;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.ondevice.datasyncing.DataSyncPayloadType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 {
    private final String IconCompatParcelizer;
    private final boolean MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final String MediaSessionCompatQueueItem;
    private final long RemoteActionCompatParcelizer;
    private final long read;
    private final long serializer;
    private final DataSyncPayloadType write;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        throw null;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer;
    }

    public final long read() {
        return this.MediaMetadataCompat;
    }

    public final DataSyncPayloadType serializer() {
        return this.write;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("creation_time", Long.valueOf(this.RemoteActionCompatParcelizer));
        contentValues.put("data_type", this.write.name());
        contentValues.put("size", Long.valueOf(this.MediaMetadataCompat));
        contentValues.put("is_requested", Boolean.valueOf(this.MediaDescriptionCompat));
        contentValues.put("payload_time", Long.valueOf(this.serializer));
        contentValues.put("uuid", this.IconCompatParcelizer);
        contentValues.put("schema_version", this.MediaSessionCompatQueueItem);
        return contentValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.read) * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
        int iM2 = d$$ExternalSyntheticOutline0.m((this.write.hashCode() + iM) * 31, 31, this.MediaMetadataCompat);
        boolean z = this.MediaDescriptionCompat;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return this.MediaSessionCompatQueueItem.hashCode() + ((iM2 + r1) * 31);
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs write() {
        return setJsonObject.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw)) {
            return false;
        }
        r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw r8lambda8fze8wecod2wkcwbnycfxmvefxw = (r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw) obj;
        if (this.read != r8lambda8fze8wecod2wkcwbnycfxmvefxw.read) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambda8fze8wecod2wkcwbnycfxmvefxw.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != r8lambda8fze8wecod2wkcwbnycfxmvefxw.RemoteActionCompatParcelizer || this.serializer != r8lambda8fze8wecod2wkcwbnycfxmvefxw.serializer || this.write != r8lambda8fze8wecod2wkcwbnycfxmvefxw.write || this.MediaMetadataCompat != r8lambda8fze8wecod2wkcwbnycfxmvefxw.MediaMetadataCompat || this.MediaDescriptionCompat != r8lambda8fze8wecod2wkcwbnycfxmvefxw.MediaDescriptionCompat) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, r8lambda8fze8wecod2wkcwbnycfxmvefxw.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSyncPayloadEntry(id=");
        sb.append(this.read);
        sb.append(", uuid='");
        sb.append(this.IconCompatParcelizer);
        sb.append("', creationTime=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", payloadTime=");
        sb.append(this.serializer);
        sb.append(", dataType=");
        sb.append(this.write);
        sb.append(", size=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", isRequested=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", schemaVersion='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, "')");
    }

    public /* synthetic */ r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw(long j, String str, long j2, long j3, DataSyncPayloadType dataSyncPayloadType, long j4, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, j2, j3, dataSyncPayloadType, j4, z, str2);
    }

    public r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw(long j, String str, long j2, long j3, DataSyncPayloadType dataSyncPayloadType, long j4, boolean z, String str2) {
        str.getClass();
        dataSyncPayloadType.getClass();
        str2.getClass();
        this.read = j;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = j2;
        this.serializer = j3;
        this.write = dataSyncPayloadType;
        this.MediaMetadataCompat = j4;
        this.MediaDescriptionCompat = z;
        this.MediaSessionCompatQueueItem = str2;
    }
}
