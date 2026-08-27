package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setAutomaticLocationCollectionEnabledandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setDefaultNotificationChannelNameandroid_sdk_base_release serializer = new setDefaultNotificationChannelNameandroid_sdk_base_release(11);
    public final Long IconCompatParcelizer;
    public final Long RemoteActionCompatParcelizer;
    public final Long read;
    public final List write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035);
    }

    public setAutomaticLocationCollectionEnabledandroid_sdk_base_release(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.IconCompatParcelizer = (Long) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.write = Collections.unmodifiableList((ArrayList) iscontentcardsunreadvisualindicatorenabled.write);
        this.read = (Long) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Long) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        return "UserSegments{segments_detection_time=" + this.IconCompatParcelizer + ", segments=" + this.write + ", fromMs=" + this.read + ", toMs=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r5 = r5.RemoteActionCompatParcelizer;
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
            boolean r2 = r5 instanceof o.setAutomaticLocationCollectionEnabledandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setAutomaticLocationCollectionEnabledandroid_sdk_base_release r5 = (o.setAutomaticLocationCollectionEnabledandroid_sdk_base_release) r5
            java.lang.Long r2 = r5.IconCompatParcelizer
            java.lang.Long r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L1b:
            java.util.List r2 = r5.write
            java.util.List r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L27:
            java.lang.Long r2 = r5.read
            java.lang.Long r3 = r4.read
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L33:
            java.lang.Long r5 = r5.RemoteActionCompatParcelizer
            java.lang.Long r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L41
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L40
            goto L41
        L40:
            return r1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAutomaticLocationCollectionEnabledandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
