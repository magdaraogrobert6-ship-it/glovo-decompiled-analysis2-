package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.startworking.data.startworking.oneclick.PreferenceLabel$Companion;
import kotlinx.serialization.Serializable;
import o.getAllFeatureFlagslambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getCachedContentCardsUpdatedEvent {
    public static final PreferenceLabel$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.PreferenceLabel$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 79;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getAllFeatureFlagslambda0 getallfeatureflagslambda0 = getAllFeatureFlagslambda0.serializer;
            int i4 = IconCompatParcelizer + 29;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return getallfeatureflagslambda0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String bag;
    public final String hyperlinkText;
    public final String text;
    public final String vehicle;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.PreferenceLabel$Companion] */
    static {
        int i = write + 79;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 51 / 0;
        }
    }

    public /* synthetic */ getCachedContentCardsUpdatedEvent(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.text = str;
            this.hyperlinkText = str2;
            this.vehicle = str3;
            this.bag = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getAllFeatureFlagslambda0.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PreferenceLabel(text=", this.text, ", hyperlinkText=", this.hyperlinkText, ", vehicle="), this.vehicle, ", bag=", this.bag, ")");
        }
        int i3 = 93 / 0;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PreferenceLabel(text=", this.text, ", hyperlinkText=", this.hyperlinkText, ", vehicle="), this.vehicle, ", bag=", this.bag, ")");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.bag.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.hyperlinkText), 31, this.vehicle);
        int i4 = serializer + 63;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return iHashCode;
    }

    public getCachedContentCardsUpdatedEvent(String str, String str2, String str3, String str4) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.text = str;
        this.hyperlinkText = str2;
        this.vehicle = str3;
        this.bag = str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r22 instanceof o.getCachedContentCardsUpdatedEvent) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1 = (o.getCachedContentCardsUpdatedEvent) r22;
        r12 = new java.lang.Object[]{r21.text, r1.text};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r1 = o.getCachedContentCardsUpdatedEvent.serializer + 109;
        o.getCachedContentCardsUpdatedEvent.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        r19 = new java.lang.Object[]{r21.hyperlinkText, r1.hyperlinkText};
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        r19 = new java.lang.Object[]{r21.vehicle, r1.vehicle};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        r19 = new java.lang.Object[]{r21.bag, r1.bag};
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d4, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCachedContentCardsUpdatedEvent.equals(java.lang.Object):boolean");
    }
}
