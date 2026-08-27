package o;

import com.sentiance.core.model.thrift.O$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE RemoteActionCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(7);
    public final Double IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final Double read;
    public final Double serializer;
    public final String write;

    public final int hashCode() {
        String str = this.write;
        int iHashCode = str == null ? 0 : str.hashCode();
        Double d = this.read;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        Double d2 = this.serializer;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.IconCompatParcelizer;
        int iHashCode4 = d3 == null ? 0 : d3.hashCode();
        List list = this.MediaBrowserCompatMediaItem;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ (list != null ? list.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0(O$b o$b) {
        this.write = (String) o$b.read;
        this.read = (Double) o$b.write;
        this.serializer = (Double) o$b.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = (Double) o$b.serializer;
        ArrayList arrayList = (ArrayList) o$b.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = arrayList == null ? null : Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiPlace{name=");
        sb.append(this.write);
        sb.append(", probability=");
        sb.append(this.read);
        sb.append(", latitude=");
        sb.append(this.serializer);
        sb.append(", longitude=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", category_hierarchy=");
        return MediaSessionCompatQueueItem.read(sb, this.MediaBrowserCompatMediaItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0 r5 = (o.r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0) r5
            java.lang.String r2 = r5.write
            java.lang.String r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L1d:
            java.lang.Double r2 = r5.read
            java.lang.Double r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L2b:
            java.lang.Double r2 = r5.serializer
            java.lang.Double r3 = r4.serializer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L39:
            java.lang.Double r2 = r5.IconCompatParcelizer
            java.lang.Double r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L47:
            java.util.List r5 = r5.MediaBrowserCompatMediaItem
            java.util.List r2 = r4.MediaBrowserCompatMediaItem
            if (r2 == r5) goto L57
            if (r2 == 0) goto L56
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L56
            goto L57
        L56:
            return r1
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0.equals(java.lang.Object):boolean");
    }
}
