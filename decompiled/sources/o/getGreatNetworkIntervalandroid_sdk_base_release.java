package o;

import com.sentiance.core.model.thrift.O$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getGreatNetworkIntervalandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8 write = new r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8(3);
    public final Short IconCompatParcelizer;
    public final Byte MediaBrowserCompatMediaItem;
    public final Long RemoteActionCompatParcelizer;
    public final Long read;
    public final List serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.read.hashCode();
        List list = this.serializer;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (list == null ? 0 : list.hashCode())) * (-2128831035)) ^ this.MediaBrowserCompatMediaItem.hashCode()) * (-2128831035);
    }

    public getGreatNetworkIntervalandroid_sdk_base_release(O$b o$b) {
        this.IconCompatParcelizer = (Short) o$b.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Long) o$b.write;
        this.read = (Long) o$b.serializer;
        ArrayList arrayList = (ArrayList) o$b.read;
        this.serializer = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.MediaBrowserCompatMediaItem = (Byte) o$b.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timeline{type=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", time_horizon=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", current_marker_epoch=");
        sb.append(this.read);
        sb.append(", markers=");
        sb.append(this.serializer);
        sb.append(", detection_type=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.MediaBrowserCompatMediaItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r5 = r5.MediaBrowserCompatMediaItem;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof o.getGreatNetworkIntervalandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getGreatNetworkIntervalandroid_sdk_base_release r5 = (o.getGreatNetworkIntervalandroid_sdk_base_release) r5
            java.lang.Short r2 = r5.IconCompatParcelizer
            java.lang.Short r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L1b:
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L27:
            java.lang.Long r2 = r5.read
            java.lang.Long r3 = r4.read
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L33:
            java.util.List r2 = r5.serializer
            java.util.List r3 = r4.serializer
            if (r3 == r2) goto L41
            if (r3 == 0) goto L4e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L41:
            java.lang.Byte r5 = r5.MediaBrowserCompatMediaItem
            java.lang.Byte r2 = r4.MediaBrowserCompatMediaItem
            if (r2 == r5) goto L4f
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L4e
            goto L4f
        L4e:
            return r1
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getGreatNetworkIntervalandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
