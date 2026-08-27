package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class _set_userId_lambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw write = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(8);
    public final setFirstNamelambda0 IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String MediaSessionCompatQueueItem;
    public final List RatingCompat;
    public final Double RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        Double d = this.RemoteActionCompatParcelizer;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        String str2 = this.serializer;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        setFirstNamelambda0 setfirstnamelambda0 = this.IconCompatParcelizer;
        int iHashCode4 = setfirstnamelambda0 == null ? 0 : setfirstnamelambda0.hashCode();
        List list = this.RatingCompat;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str3 = this.MediaDescriptionCompat;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.MediaSessionCompatQueueItem;
        return (((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ (str4 != null ? str4.hashCode() : 0)) * (-2128831035);
    }

    public _set_userId_lambda0(removeFromCustomAttributeArray removefromcustomattributearray) {
        this.read = removefromcustomattributearray.serializer;
        this.RemoteActionCompatParcelizer = removefromcustomattributearray.write;
        this.serializer = removefromcustomattributearray.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = removefromcustomattributearray.read;
        ArrayList arrayList = removefromcustomattributearray.IconCompatParcelizer;
        this.RatingCompat = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.MediaDescriptionCompat = removefromcustomattributearray.MediaSessionCompatQueueItem;
        this.MediaSessionCompatQueueItem = removefromcustomattributearray.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TurnElement{category=");
        sb.append(this.read);
        sb.append(", duration=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", ended=");
        sb.append(this.serializer);
        sb.append(", features=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", peaks=");
        sb.append(this.RatingCompat);
        sb.append(", start=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", type=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r5 = r5.MediaSessionCompatQueueItem;
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
            boolean r2 = r5 instanceof o._set_userId_lambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o._set_userId_lambda0 r5 = (o._set_userId_lambda0) r5
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L1d:
            java.lang.Double r2 = r5.RemoteActionCompatParcelizer
            java.lang.Double r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L2b:
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L39:
            o.setFirstNamelambda0 r2 = r5.IconCompatParcelizer
            o.setFirstNamelambda0 r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L47:
            java.util.List r2 = r5.RatingCompat
            java.util.List r3 = r4.RatingCompat
            if (r3 == r2) goto L55
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L55:
            java.lang.String r2 = r5.MediaDescriptionCompat
            java.lang.String r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L63
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L63:
            java.lang.String r5 = r5.MediaSessionCompatQueueItem
            java.lang.String r2 = r4.MediaSessionCompatQueueItem
            if (r2 == r5) goto L73
            if (r2 == 0) goto L72
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L72
            goto L73
        L72:
            return r1
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o._set_userId_lambda0.equals(java.lang.Object):boolean");
    }
}
