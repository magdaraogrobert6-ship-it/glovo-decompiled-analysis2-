package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class invalidateCallbacksFor {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final AndroidSystemCallbacksActivityCallbacks serializer;
    public final List write;

    public invalidateCallbacksFor(AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks, boolean z, List list, boolean z2) {
        this.serializer = androidSystemCallbacksActivityCallbacks;
        this.IconCompatParcelizer = z;
        this.write = list;
        this.RemoteActionCompatParcelizer = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + c8$$ExternalSyntheticOutline0.m(this.write, d$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer), 31);
        int i4 = MediaMetadataCompat + 39;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return iHashCode;
    }

    public static invalidateCallbacksFor read(invalidateCallbacksFor invalidatecallbacksfor, AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks, boolean z, ArrayList arrayList, boolean z2, int i) {
        List list;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = MediaMetadataCompat + 101;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                androidSystemCallbacksActivityCallbacks = invalidatecallbacksfor.serializer;
            } else {
                AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks2 = invalidatecallbacksfor.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 2) != 0) {
            z = invalidatecallbacksfor.IconCompatParcelizer;
        }
        List list2 = arrayList;
        if ((i & 4) != 0) {
            int i4 = MediaMetadataCompat;
            int i5 = i4 + 21;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                list = invalidatecallbacksfor.write;
                int i6 = 81 / 0;
            } else {
                list = invalidatecallbacksfor.write;
            }
            int i7 = i4 + 73;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            list2 = list;
        }
        if ((i & 8) != 0) {
            z2 = invalidatecallbacksfor.RemoteActionCompatParcelizer;
        }
        invalidatecallbacksfor.getClass();
        return new invalidateCallbacksFor(androidSystemCallbacksActivityCallbacks, z, list2, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r4.RemoteActionCompatParcelizer != r5.RemoteActionCompatParcelizer) goto L21;
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
            int r1 = o.invalidateCallbacksFor.read
            int r1 = r1 + 109
            int r2 = r1 % 128
            o.invalidateCallbacksFor.MediaMetadataCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L4d
            r1 = 0
            if (r4 != r5) goto L12
            goto L3d
        L12:
            boolean r2 = r5 instanceof o.invalidateCallbacksFor
            if (r2 != 0) goto L17
            goto L3c
        L17:
            o.invalidateCallbacksFor r5 = (o.invalidateCallbacksFor) r5
            o.AndroidSystemCallbacksActivityCallbacks r2 = r4.serializer
            o.AndroidSystemCallbacksActivityCallbacks r3 = r5.serializer
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            goto L3c
        L24:
            boolean r2 = r4.IconCompatParcelizer
            boolean r3 = r5.IconCompatParcelizer
            if (r2 == r3) goto L2b
            goto L3c
        L2b:
            java.util.List r2 = r4.write
            java.util.List r3 = r5.write
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            goto L3c
        L36:
            boolean r2 = r4.RemoteActionCompatParcelizer
            boolean r5 = r5.RemoteActionCompatParcelizer
            if (r2 == r5) goto L3d
        L3c:
            return r1
        L3d:
            int r5 = o.invalidateCallbacksFor.MediaMetadataCompat
            int r5 = r5 + 57
            int r2 = r5 % 128
            o.invalidateCallbacksFor.read = r2
            int r5 = r5 % r0
            r0 = 1
            if (r5 == 0) goto L4c
            r5 = 92
            int r5 = r5 / r1
        L4c:
            return r0
        L4d:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invalidateCallbacksFor.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CustomPasswordViewState(passwordData=" + this.serializer + ", shouldEnableCreatePasswordButton=" + this.IconCompatParcelizer + ", passwordRules=" + this.write + ", showLoading=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = MediaMetadataCompat + 89;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
