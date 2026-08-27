package o;

import com.sentiance.core.model.thrift.O$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeUser implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeCompanionExternalSyntheticLambda21 read = new BrazeCompanionExternalSyntheticLambda21(29);
    public final List IconCompatParcelizer;
    public final Map MediaBrowserCompatMediaItem;
    public final Long RemoteActionCompatParcelizer;
    public final List serializer;
    public final Byte write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        Map map = this.MediaBrowserCompatMediaItem;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ (map == null ? 0 : map.hashCode())) * (-2128831035);
    }

    public BrazeUser(O$b o$b) {
        this.write = (Byte) o$b.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Long) o$b.write;
        this.serializer = Collections.unmodifiableList((ArrayList) o$b.serializer);
        this.IconCompatParcelizer = Collections.unmodifiableList((ArrayList) o$b.read);
        HashMap map = (HashMap) o$b.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SensorDataEvent{type=");
        sb.append(this.write);
        sb.append(", base_timestamp=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", base_offsets=");
        sb.append(this.serializer);
        sb.append(", i32_measurements=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", android_sensor_timestamp_reference_points=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.MediaBrowserCompatMediaItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
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
            boolean r2 = r5 instanceof o.BrazeUser
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.BrazeUser r5 = (o.BrazeUser) r5
            java.lang.Byte r2 = r5.write
            java.lang.Byte r3 = r4.write
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
            java.util.List r2 = r5.serializer
            java.util.List r3 = r4.serializer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L33:
            java.util.List r2 = r5.IconCompatParcelizer
            java.util.List r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L3f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L3f:
            java.util.Map r5 = r5.MediaBrowserCompatMediaItem
            java.util.Map r2 = r4.MediaBrowserCompatMediaItem
            if (r2 == r5) goto L4f
            if (r2 == 0) goto L4e
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L4e
            goto L4f
        L4e:
            return r1
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BrazeUser.equals(java.lang.Object):boolean");
    }
}
