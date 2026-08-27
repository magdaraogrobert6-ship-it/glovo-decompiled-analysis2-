package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaE7oIx09KQauliA8paOfGanE2_e8 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o write = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(0);
    public final List IconCompatParcelizer;
    public final Short MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final Byte MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final Short MediaSessionCompatResultReceiverWrapper;
    public final Short RatingCompat;
    public final Short RemoteActionCompatParcelizer;
    public final BrazeCompanionExternalSyntheticLambda4 read;
    public final Short serializer;

    public final int hashCode() {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.read;
        int iHashCode = brazeCompanionExternalSyntheticLambda4 == null ? 0 : brazeCompanionExternalSyntheticLambda4.hashCode();
        List list = this.IconCompatParcelizer;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Short sh = this.serializer;
        int iHashCode3 = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.RemoteActionCompatParcelizer;
        int iHashCode4 = sh2 == null ? 0 : sh2.hashCode();
        Short sh3 = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = sh3 == null ? 0 : sh3.hashCode();
        Short sh4 = this.RatingCompat;
        int iHashCode6 = sh4 == null ? 0 : sh4.hashCode();
        List list2 = this.MediaSessionCompatQueueItem;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        String str = this.MediaDescriptionCompat;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        Byte b = this.MediaMetadataCompat;
        int iHashCode9 = b == null ? 0 : b.hashCode();
        Short sh5 = this.MediaSessionCompatResultReceiverWrapper;
        return (((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ (sh5 != null ? sh5.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaE7oIx09KQauliA8paOfGanE2_e8(r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q) {
        this.read = (BrazeCompanionExternalSyntheticLambda4) r8lambdabirsljoagmyxhikohl5z5hht12q.serializer;
        ArrayList arrayList = (ArrayList) r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.serializer = (Short) r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Short) r8lambdabirsljoagmyxhikohl5z5hht12q.write;
        this.MediaBrowserCompatMediaItem = (Short) r8lambdabirsljoagmyxhikohl5z5hht12q.read;
        this.RatingCompat = (Short) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat;
        List list = (List) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem;
        this.MediaSessionCompatQueueItem = list != null ? Collections.unmodifiableList(list) : null;
        this.MediaDescriptionCompat = (String) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = (Byte) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat;
        this.MediaSessionCompatResultReceiverWrapper = (Short) r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat;
    }

    public final String toString() {
        return "CrashEvent{location=" + this.read + ", models=" + this.IconCompatParcelizer + ", max_magnitude=" + this.serializer + ", confidence=" + this.RemoteActionCompatParcelizer + ", speed_at_impact=" + this.MediaBrowserCompatMediaItem + ", delta_v=" + this.RatingCompat + ", historic_locations=" + this.MediaSessionCompatQueueItem + ", crash_severity=" + this.MediaDescriptionCompat + ", detector_mode=" + this.MediaMetadataCompat + ", max_magnitude_g=" + this.MediaSessionCompatResultReceiverWrapper + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:
    
        r5 = r5.MediaSessionCompatResultReceiverWrapper;
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
            boolean r2 = r5 instanceof o.r8lambdaE7oIx09KQauliA8paOfGanE2_e8
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaE7oIx09KQauliA8paOfGanE2_e8 r5 = (o.r8lambdaE7oIx09KQauliA8paOfGanE2_e8) r5
            o.BrazeCompanionExternalSyntheticLambda4 r2 = r5.read
            o.BrazeCompanionExternalSyntheticLambda4 r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L9c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9c
        L1d:
            java.util.List r2 = r5.IconCompatParcelizer
            java.util.List r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L9c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9c
        L2b:
            java.lang.Short r2 = r5.serializer
            java.lang.Short r3 = r4.serializer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L9c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9c
        L39:
            java.lang.Short r2 = r5.RemoteActionCompatParcelizer
            java.lang.Short r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L9c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9c
        L47:
            java.lang.Short r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Short r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L55
            if (r3 == 0) goto L9c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9c
        L55:
            java.lang.Short r2 = r5.RatingCompat
            java.lang.Short r3 = r4.RatingCompat
            if (r3 == r2) goto L63
            if (r3 == 0) goto L9c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9c
        L63:
            java.util.List r2 = r5.MediaSessionCompatQueueItem
            java.util.List r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L71
            if (r3 == 0) goto L9c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9c
        L71:
            java.lang.String r2 = r5.MediaDescriptionCompat
            java.lang.String r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L7f
            if (r3 == 0) goto L9c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9c
        L7f:
            java.lang.Byte r2 = r5.MediaMetadataCompat
            java.lang.Byte r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L8d
            if (r3 == 0) goto L9c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9c
        L8d:
            java.lang.Short r5 = r5.MediaSessionCompatResultReceiverWrapper
            java.lang.Short r2 = r4.MediaSessionCompatResultReceiverWrapper
            if (r2 == r5) goto L9d
            if (r2 == 0) goto L9c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L9c
            goto L9d
        L9c:
            return r1
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaE7oIx09KQauliA8paOfGanE2_e8.equals(java.lang.Object):boolean");
    }
}
