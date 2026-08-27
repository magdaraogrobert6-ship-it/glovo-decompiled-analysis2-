package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$PushMessage$Companion;
import kotlinx.serialization.Serializable;
import o.getMaxDialogHeightExcludingSystemBarInsets;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getSystemBarsHeight {
    public static final StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$PushMessage$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$PushMessage$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            getMaxDialogHeightExcludingSystemBarInsets getmaxdialogheightexcludingsystembarinsets;
            int i = 2 % 2;
            int i2 = write + 33;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getmaxdialogheightexcludingsystembarinsets = getMaxDialogHeightExcludingSystemBarInsets.read;
                int i3 = 81 / 0;
            } else {
                getmaxdialogheightexcludingsystembarinsets = getMaxDialogHeightExcludingSystemBarInsets.read;
            }
            int i4 = write + 41;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getmaxdialogheightexcludingsystembarinsets;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final String body;
    public final String sound;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$PushMessage$Companion] */
    static {
        int i = read + 77;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    public /* synthetic */ getSystemBarsHeight(int i, String str, String str2, String str3) {
        int i2;
        Object obj = null;
        if ((i & 1) == 0) {
            this.title = null;
            int i3 = serializer + 25;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
            }
            if ((i & 2) == 0) {
                this.body = null;
            } else {
                this.body = str2;
            }
            if ((i & 4) == 0) {
                this.sound = str3;
                return;
            }
            i2 = IconCompatParcelizer + 47;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                this.sound = null;
            } else {
                this.sound = null;
                obj.hashCode();
                throw null;
            }
        }
        this.title = str;
        int i4 = 2 % 2;
        if ((i & 2) == 0) {
            this.body = null;
        } else {
            this.body = str2;
        }
        if ((i & 4) == 0) {
            this.sound = str3;
            return;
        }
        i2 = IconCompatParcelizer + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.sound = null;
        } else {
            this.sound = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PushMessage(title=", this.title, ", body=", this.body, ", sound="), this.sound, ")");
            int i3 = 1 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PushMessage(title=", this.title, ", body=", this.body, ", sound="), this.sound, ")");
        }
        int i4 = IconCompatParcelizer + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0 ? (str = this.title) != null : (str = this.title) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i3 + 11;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        String str2 = this.body;
        if (str2 == null) {
            int i6 = IconCompatParcelizer + 27;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.sound;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.getSystemBarsHeight) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r3 = r3 + 119;
        o.getSystemBarsHeight.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = (o.getSystemBarsHeight) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.title, r1.title}, o.getCieXyz.write())).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r1 = o.getSystemBarsHeight.IconCompatParcelizer + 93;
        o.getSystemBarsHeight.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.body, r1.body}, o.getCieXyz.write())).booleanValue()) == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.sound, r1.sound}, o.getCieXyz.write())).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        r1 = o.getSystemBarsHeight.serializer + 27;
        o.getSystemBarsHeight.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        r1 = o.getSystemBarsHeight.IconCompatParcelizer + 51;
        r3 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.getSystemBarsHeight.serializer = r3;
        r1 = r1 % 2;
        r3 = r3 + 63;
        o.getSystemBarsHeight.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        if ((r3 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        r1 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSystemBarsHeight.equals(java.lang.Object):boolean");
    }
}
