package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class getStableKey {
    private final String IconCompatParcelizer;
    private final isExpired MediaMetadataCompat;
    private final Integer RemoteActionCompatParcelizer;
    private final String read;
    private final boolean serializer;
    private final Integer write;

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean MediaDescriptionCompat() {
        return this.serializer;
    }

    public final Integer RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return this.read;
    }

    public final isExpired serializer() {
        return this.MediaMetadataCompat;
    }

    public final Integer write() {
        return this.RemoteActionCompatParcelizer;
    }

    public getStableKey(String str, Integer num, Integer num2, boolean z, isExpired isexpired) {
        this(UUID.randomUUID().toString(), str, num, num2, z, isexpired);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogUploadRequest{id='");
        sb.append(this.IconCompatParcelizer);
        sb.append("', tag='");
        sb.append(this.read);
        sb.append("', fromDate=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", toDate=");
        sb.append(this.write);
        sb.append(", includeIncompleteLogs=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.serializer, '}');
    }

    public getStableKey(String str, boolean z, isExpired isexpired) {
        this(str, null, null, z, isexpired);
    }

    public getStableKey(String str, String str2, Integer num, Integer num2, boolean z, isExpired isexpired) {
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = num;
        this.write = num2;
        this.serializer = z;
        this.MediaMetadataCompat = isexpired;
    }
}
