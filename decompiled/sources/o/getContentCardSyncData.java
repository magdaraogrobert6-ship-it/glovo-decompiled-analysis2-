package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class getContentCardSyncData {
    private final int IconCompatParcelizer;
    private final boolean MediaDescriptionCompat;
    private final ByteBuffer RemoteActionCompatParcelizer;
    private final int read;
    private final List<getContentCardSyncUserId> serializer;
    private final ByteBuffer write;

    public final boolean IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final ByteBuffer RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final int read() {
        return this.IconCompatParcelizer;
    }

    public final List<getContentCardSyncUserId> serializer() {
        return this.serializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(this.read, this.RemoteActionCompatParcelizer.hashCode() * 31, 31), 31);
        int iM2 = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, (this.write.hashCode() + iM) * 31, 31);
        boolean z = this.MediaDescriptionCompat;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iM2 + r1;
    }

    public getContentCardSyncData(ByteBuffer byteBuffer, int i, List<getContentCardSyncUserId> list, ByteBuffer byteBuffer2, int i2, boolean z) {
        this.RemoteActionCompatParcelizer = byteBuffer;
        this.read = i;
        this.serializer = list;
        this.write = byteBuffer2;
        this.IconCompatParcelizer = i2;
        this.MediaDescriptionCompat = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getContentCardSyncData)) {
            return false;
        }
        getContentCardSyncData getcontentcardsyncdata = (getContentCardSyncData) obj;
        return this.RemoteActionCompatParcelizer.equals(getcontentcardsyncdata.RemoteActionCompatParcelizer) && this.read == getcontentcardsyncdata.read && this.serializer.equals(getcontentcardsyncdata.serializer) && this.write.equals(getcontentcardsyncdata.write) && this.IconCompatParcelizer == getcontentcardsyncdata.IconCompatParcelizer && this.MediaDescriptionCompat == getcontentcardsyncdata.MediaDescriptionCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashContext(buffer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", crashThreadId=");
        sb.append(this.read);
        sb.append(", modules=");
        sb.append(this.serializer);
        sb.append(", stack=");
        sb.append(this.write);
        sb.append(", pointerSize=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isArm32=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.MediaDescriptionCompat, ')');
    }
}
