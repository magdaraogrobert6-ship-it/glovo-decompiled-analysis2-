package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setDefaultNotificationChannelDescriptionlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY IconCompatParcelizer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(29);
    public final Byte RemoteActionCompatParcelizer;
    public final Byte read;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        Byte b = this.read;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (b == null ? 0 : b.hashCode())) * (-2128831035);
    }

    public setDefaultNotificationChannelDescriptionlambda0(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy) {
        this.RemoteActionCompatParcelizer = (Byte) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
        this.write = (Long) r8lambdadeozq815xuuwmllyyvm_qv79qy.write;
        this.read = (Byte) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallEvent{call_event_type=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", timestamp=");
        sb.append(this.write);
        sb.append(", call_protocol=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.read, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r5 = r5.read;
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
            boolean r2 = r5 instanceof o.setDefaultNotificationChannelDescriptionlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setDefaultNotificationChannelDescriptionlambda0 r5 = (o.setDefaultNotificationChannelDescriptionlambda0) r5
            java.lang.Byte r2 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L1b:
            java.lang.Long r2 = r5.write
            java.lang.Long r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L27:
            java.lang.Byte r5 = r5.read
            java.lang.Byte r2 = r4.read
            if (r2 == r5) goto L37
            if (r2 == 0) goto L36
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L36
            goto L37
        L36:
            return r1
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDefaultNotificationChannelDescriptionlambda0.equals(java.lang.Object):boolean");
    }
}
