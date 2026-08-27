package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getPayloadsFromContentProviderIntentAction extends getPayloadFromSystemPropertyReflection {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String write;

    public getPayloadsFromContentProviderIntentAction(String str, String str2) {
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NoZoneSelection(description=", this.write, ", buttonText=", this.IconCompatParcelizer, ")");
            int i3 = serializer + 39;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strWrite;
            }
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NoZoneSelection(description=", this.write, ", buttonText=", this.IconCompatParcelizer, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() << (this.write.hashCode() / 30);
        } else {
            iHashCode = (this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
        }
        int i3 = serializer + 45;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r4.IconCompatParcelizer.equals(r5.IconCompatParcelizer) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getPayloadsFromContentProviderIntentAction.RemoteActionCompatParcelizer
            int r1 = r1 + 97
            int r2 = r1 % 128
            o.getPayloadsFromContentProviderIntentAction.serializer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L47
            if (r4 != r5) goto L12
            goto L2e
        L12:
            boolean r1 = r5 instanceof o.getPayloadsFromContentProviderIntentAction
            if (r1 != 0) goto L17
            goto L39
        L17:
            o.getPayloadsFromContentProviderIntentAction r5 = (o.getPayloadsFromContentProviderIntentAction) r5
            java.lang.String r1 = r4.write
            java.lang.String r3 = r5.write
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L24
            goto L39
        L24:
            java.lang.String r1 = r4.IconCompatParcelizer
            java.lang.String r5 = r5.IconCompatParcelizer
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L39
        L2e:
            int r5 = o.getPayloadsFromContentProviderIntentAction.RemoteActionCompatParcelizer
            int r5 = r5 + 37
            int r1 = r5 % 128
            o.getPayloadsFromContentProviderIntentAction.serializer = r1
            int r5 = r5 % r0
            r5 = 1
            return r5
        L39:
            int r5 = o.getPayloadsFromContentProviderIntentAction.serializer
            int r5 = r5 + 13
            int r1 = r5 % 128
            o.getPayloadsFromContentProviderIntentAction.RemoteActionCompatParcelizer = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L46
            r5 = 0
            return r5
        L46:
            throw r2
        L47:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPayloadsFromContentProviderIntentAction.equals(java.lang.Object):boolean");
    }
}
