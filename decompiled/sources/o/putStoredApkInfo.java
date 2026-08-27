package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.StartTutorialData$Companion;
import kotlinx.serialization.Serializable;
import o.loadExistingExtractions;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class putStoredApkInfo {
    public static final StartTutorialData$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.StartTutorialData$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 109;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return loadExistingExtractions.RemoteActionCompatParcelizer;
            }
            loadExistingExtractions loadexistingextractions = loadExistingExtractions.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final getTimeStamp action;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.StartTutorialData$Companion] */
    static {
        int i = serializer + 97;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ putStoredApkInfo(int i, String str, String str2, getTimeStamp gettimestamp) {
        if (7 == (i & 7)) {
            this.title = str;
            this.subtitle = str2;
            this.action = gettimestamp;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, loadExistingExtractions.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.action.hashCode() / af$$ExternalSyntheticOutline0.m(this.title.hashCode() >>> 59, 71, this.subtitle);
        } else {
            iHashCode = this.action.hashCode() + af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
        }
        int i3 = read + 65;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("StartTutorialData(title=", this.title, ", subtitle=", this.subtitle, ", action=");
            sbM.append(this.action);
            sbM.append(")");
            return sbM.toString();
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("StartTutorialData(title=", this.title, ", subtitle=", this.subtitle, ", action=");
        sbM2.append(this.action);
        sbM2.append(")");
        sbM2.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.putStoredApkInfo) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r4 = r4 + 43;
        o.putStoredApkInfo.read = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        r1 = (o.putStoredApkInfo) r22;
        r12 = new java.lang.Object[]{r21.title, r1.title};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        r19 = new java.lang.Object[]{r21.subtitle, r1.subtitle};
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        r1 = o.putStoredApkInfo.IconCompatParcelizer + 99;
        o.putStoredApkInfo.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        r19 = new java.lang.Object[]{r21.action, r1.action};
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        r1 = o.putStoredApkInfo.IconCompatParcelizer + 15;
        o.putStoredApkInfo.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return true;
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
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.putStoredApkInfo.read
            int r3 = r3 + 103
            int r4 = r3 % 128
            o.putStoredApkInfo.IconCompatParcelizer = r4
            int r3 = r3 % r2
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L1a
            r3 = 15
            int r3 = r3 / r6
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r5
        L1d:
            boolean r3 = r1 instanceof o.putStoredApkInfo
            if (r3 != 0) goto L2d
            int r4 = r4 + 43
            int r1 = r4 % 128
            o.putStoredApkInfo.read = r1
            int r4 = r4 % r2
            if (r4 == 0) goto L2b
            goto L2c
        L2b:
            r5 = r6
        L2c:
            return r5
        L2d:
            o.putStoredApkInfo r1 = (o.putStoredApkInfo) r1
            java.lang.String r3 = r0.title
            java.lang.String r4 = r1.title
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r3 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r4 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r3
            r9 = r4
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5c
            return r6
        L5c:
            java.lang.String r7 = r0.subtitle
            java.lang.String r8 = r1.subtitle
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r8}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r4
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L8d
            int r1 = o.putStoredApkInfo.IconCompatParcelizer
            int r1 = r1 + 99
            int r3 = r1 % 128
            o.putStoredApkInfo.read = r3
            int r1 = r1 % r2
            return r6
        L8d:
            o.getTimeStamp r7 = r0.action
            o.getTimeStamp r1 = r1.action
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r4
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lb5
            return r6
        Lb5:
            int r1 = o.putStoredApkInfo.IconCompatParcelizer
            int r1 = r1 + 15
            int r3 = r1 % 128
            o.putStoredApkInfo.read = r3
            int r1 = r1 % r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.putStoredApkInfo.equals(java.lang.Object):boolean");
    }
}
