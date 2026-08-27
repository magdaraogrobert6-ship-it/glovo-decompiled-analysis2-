package o;

import com.sentiance.core.model.events.C$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o read = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(7);
    public final String IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0 write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035);
    }

    public r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o(C$b c$b) {
        this.IconCompatParcelizer = (String) c$b.IconCompatParcelizer;
        this.write = (r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0) c$b.serializer;
        this.RemoteActionCompatParcelizer = Collections.unmodifiableList((ArrayList) c$b.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiLocation{significance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", place=");
        sb.append(this.write);
        sb.append(", place_candidates=");
        return MediaSessionCompatQueueItem.read(sb, this.RemoteActionCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o r5 = (o.r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o) r5
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L1b:
            o.r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0 r2 = r5.write
            o.r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0 r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L27:
            java.util.List r5 = r5.RemoteActionCompatParcelizer
            java.util.List r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o.equals(java.lang.Object):boolean");
    }
}
