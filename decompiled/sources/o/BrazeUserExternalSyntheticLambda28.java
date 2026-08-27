package o;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeUserExternalSyntheticLambda28 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o IconCompatParcelizer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(24);
    public final Short read;
    public final Byte serializer;
    public final Byte write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035)) ^ this.serializer.hashCode()) * (-2128831035);
    }

    public BrazeUserExternalSyntheticLambda28(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy) {
        this.read = (Short) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
        this.write = (Byte) r8lambdadeozq815xuuwmllyyvm_qv79qy.write;
        this.serializer = (Byte) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusUpdateConfig{minimum_app_foreground_trigger_interval_in_minutes=");
        sb.append(this.read);
        sb.append(", low_battery_level_state_percent_threshold=");
        sb.append(this.write);
        sb.append(", low_disk_space_state_percent_threshold=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.serializer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
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
            boolean r2 = r5 instanceof o.BrazeUserExternalSyntheticLambda28
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.BrazeUserExternalSyntheticLambda28 r5 = (o.BrazeUserExternalSyntheticLambda28) r5
            java.lang.Short r2 = r5.read
            java.lang.Short r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L1b:
            java.lang.Byte r2 = r5.write
            java.lang.Byte r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L27:
            java.lang.Byte r5 = r5.serializer
            java.lang.Byte r2 = r4.serializer
            if (r2 == r5) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BrazeUserExternalSyntheticLambda28.equals(java.lang.Object):boolean");
    }
}
