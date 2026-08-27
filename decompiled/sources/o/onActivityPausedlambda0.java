package o;

import com.sentiance.core.model.events.ThriftBool;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class onActivityPausedlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final onActivityResumedlambda0 read = new onActivityResumedlambda0();
    public final ThriftBool RemoteActionCompatParcelizer;
    public final Byte write;

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public onActivityPausedlambda0(IOParser$Decoder iOParser$Decoder) {
        this.RemoteActionCompatParcelizer = (ThriftBool) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.write = (Byte) iOParser$Decoder.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LowBatteryLevelState{is_low=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", percent_threshold=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.write, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.write;
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
            boolean r2 = r5 instanceof o.onActivityPausedlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.onActivityPausedlambda0 r5 = (o.onActivityPausedlambda0) r5
            com.sentiance.core.model.events.ThriftBool r2 = r5.RemoteActionCompatParcelizer
            com.sentiance.core.model.events.ThriftBool r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Byte r5 = r5.write
            java.lang.Byte r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onActivityPausedlambda0.equals(java.lang.Object):boolean");
    }
}
