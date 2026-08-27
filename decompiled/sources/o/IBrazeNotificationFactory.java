package o;

import com.sentiance.core.model.thrift.k$c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class IBrazeNotificationFactory implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o read = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(26);
    public final List IconCompatParcelizer;
    public final List MediaDescriptionCompat;
    public final List MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final List RatingCompat;
    public final List RemoteActionCompatParcelizer;
    public final List serializer;
    public final List write;

    public final int hashCode() {
        List list = this.RemoteActionCompatParcelizer;
        int iHashCode = list == null ? 0 : list.hashCode();
        List list2 = this.serializer;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.write;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        List list4 = this.IconCompatParcelizer;
        int iHashCode4 = list4 == null ? 0 : list4.hashCode();
        List list5 = this.MediaSessionCompatQueueItem;
        int iHashCode5 = list5 == null ? 0 : list5.hashCode();
        List list6 = this.MediaMetadataCompat;
        int iHashCode6 = list6 == null ? 0 : list6.hashCode();
        List list7 = this.MediaDescriptionCompat;
        int iHashCode7 = list7 == null ? 0 : list7.hashCode();
        List list8 = this.RatingCompat;
        return (((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ (list8 != null ? list8.hashCode() : 0)) * (-2128831035);
    }

    public IBrazeNotificationFactory(k$c k_c) {
        ArrayList arrayList = (ArrayList) k_c.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        ArrayList arrayList2 = (ArrayList) k_c.write;
        this.serializer = arrayList2 == null ? null : Collections.unmodifiableList(arrayList2);
        ArrayList arrayList3 = (ArrayList) k_c.IconCompatParcelizer;
        this.write = arrayList3 == null ? null : Collections.unmodifiableList(arrayList3);
        ArrayList arrayList4 = (ArrayList) k_c.read;
        this.IconCompatParcelizer = arrayList4 == null ? null : Collections.unmodifiableList(arrayList4);
        ArrayList arrayList5 = (ArrayList) k_c.serializer;
        this.MediaSessionCompatQueueItem = arrayList5 == null ? null : Collections.unmodifiableList(arrayList5);
        ArrayList arrayList6 = (ArrayList) k_c.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = arrayList6 == null ? null : Collections.unmodifiableList(arrayList6);
        ArrayList arrayList7 = (ArrayList) k_c.MediaSessionCompatQueueItem;
        this.MediaDescriptionCompat = arrayList7 == null ? null : Collections.unmodifiableList(arrayList7);
        ArrayList arrayList8 = (ArrayList) k_c.MediaDescriptionCompat;
        this.RatingCompat = arrayList8 != null ? Collections.unmodifiableList(arrayList8) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BehaviorEvents{acceleration=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", anomalies=");
        sb.append(this.serializer);
        sb.append(", boundaries=");
        sb.append(this.write);
        sb.append(", turn=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", crash=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", idle=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", traffic=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", breakdown=");
        return MediaSessionCompatQueueItem.read(sb, this.RatingCompat, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        r5 = r5.RatingCompat;
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
            boolean r2 = r5 instanceof o.IBrazeNotificationFactory
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.IBrazeNotificationFactory r5 = (o.IBrazeNotificationFactory) r5
            java.util.List r2 = r5.RemoteActionCompatParcelizer
            java.util.List r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L1d:
            java.util.List r2 = r5.serializer
            java.util.List r3 = r4.serializer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L2b:
            java.util.List r2 = r5.write
            java.util.List r3 = r4.write
            if (r3 == r2) goto L39
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L39:
            java.util.List r2 = r5.IconCompatParcelizer
            java.util.List r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L47:
            java.util.List r2 = r5.MediaSessionCompatQueueItem
            java.util.List r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L55
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L55:
            java.util.List r2 = r5.MediaMetadataCompat
            java.util.List r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L63
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L63:
            java.util.List r2 = r5.MediaDescriptionCompat
            java.util.List r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L71
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L71:
            java.util.List r5 = r5.RatingCompat
            java.util.List r2 = r4.RatingCompat
            if (r2 == r5) goto L81
            if (r2 == 0) goto L80
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L80
            goto L81
        L80:
            return r1
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IBrazeNotificationFactory.equals(java.lang.Object):boolean");
    }
}
