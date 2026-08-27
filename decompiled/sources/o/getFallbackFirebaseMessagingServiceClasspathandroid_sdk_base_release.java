package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomLocationProviderNamesandroid_sdk_base_release IconCompatParcelizer = new setCustomLocationProviderNamesandroid_sdk_base_release(3);
    public final Byte RemoteActionCompatParcelizer;
    public final List read;
    public final Byte serializer;
    public final getDeviceObjectAllowlistandroid_sdk_base_release write;

    public final int hashCode() {
        getDeviceObjectAllowlistandroid_sdk_base_release getdeviceobjectallowlistandroid_sdk_base_release = this.write;
        int iHashCode = getdeviceobjectallowlistandroid_sdk_base_release == null ? 0 : getdeviceobjectallowlistandroid_sdk_base_release.hashCode();
        List list = this.read;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        Byte b = this.serializer;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (b != null ? b.hashCode() : 0)) * (-2128831035);
    }

    public getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.write = (getDeviceObjectAllowlistandroid_sdk_base_release) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        ArrayList arrayList = (ArrayList) iscontentcardsunreadvisualindicatorenabled.write;
        this.read = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.RemoteActionCompatParcelizer = (Byte) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.serializer = (Byte) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VenueInfo{chosen=");
        sb.append(this.write);
        sb.append(", candidates=");
        sb.append(this.read);
        sb.append(", significance=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", provider=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.serializer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        r5 = r5.serializer;
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
            boolean r2 = r5 instanceof o.getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release r5 = (o.getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release) r5
            o.getDeviceObjectAllowlistandroid_sdk_base_release r2 = r5.write
            o.getDeviceObjectAllowlistandroid_sdk_base_release r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L46
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L1d:
            java.util.List r2 = r5.read
            java.util.List r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L46
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L2b:
            java.lang.Byte r2 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L37
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L37:
            java.lang.Byte r5 = r5.serializer
            java.lang.Byte r2 = r4.serializer
            if (r2 == r5) goto L47
            if (r2 == 0) goto L46
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L46
            goto L47
        L46:
            return r1
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
