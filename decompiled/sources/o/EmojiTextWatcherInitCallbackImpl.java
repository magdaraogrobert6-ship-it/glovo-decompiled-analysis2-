package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.help_center_url.HelpCenterUrlResponse$Companion;
import kotlinx.serialization.Serializable;
import o.DialogFragment;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EmojiTextWatcherInitCallbackImpl {
    public static final HelpCenterUrlResponse$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.help_center_url.HelpCenterUrlResponse$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 65;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return DialogFragment.RemoteActionCompatParcelizer;
            }
            int i3 = 37 / 0;
            return DialogFragment.RemoteActionCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String helpCenterUrl;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.help_center_url.HelpCenterUrlResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 15;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 34 / 0;
        }
    }

    public /* synthetic */ EmojiTextWatcherInitCallbackImpl(int i, String str) {
        if (1 == (i & 1)) {
            this.helpCenterUrl = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, DialogFragment.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.helpCenterUrl.hashCode();
            throw null;
        }
        int iHashCode = this.helpCenterUrl.hashCode();
        int i3 = read + 85;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("HelpCenterUrlResponse(helpCenterUrl=", this.helpCenterUrl, ")");
        int i4 = read + 73;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((!(r13 instanceof o.EmojiTextWatcherInitCallbackImpl)) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r12.helpCenterUrl, ((o.EmojiTextWatcherInitCallbackImpl) r13).helpCenterUrl}, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 59;
        o.EmojiTextWatcherInitCallbackImpl.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.EmojiTextWatcherInitCallbackImpl.read
            int r2 = r1 + 71
            int r3 = r2 % 128
            o.EmojiTextWatcherInitCallbackImpl.IconCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L16
            r2 = 60
            int r2 = r2 / r3
            if (r12 != r13) goto L20
            goto L18
        L16:
            if (r12 != r13) goto L20
        L18:
            int r1 = r1 + 59
            int r13 = r1 % 128
            o.EmojiTextWatcherInitCallbackImpl.IconCompatParcelizer = r13
            int r1 = r1 % r0
            return r4
        L20:
            boolean r0 = r13 instanceof o.EmojiTextWatcherInitCallbackImpl
            r0 = r0 ^ r4
            if (r0 == r4) goto L53
            o.EmojiTextWatcherInitCallbackImpl r13 = (o.EmojiTextWatcherInitCallbackImpl) r13
            java.lang.String r0 = r12.helpCenterUrl
            java.lang.String r13 = r13.helpCenterUrl
            java.lang.Object[] r10 = new java.lang.Object[]{r0, r13}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r13 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L52
            return r3
        L52:
            return r4
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.EmojiTextWatcherInitCallbackImpl.equals(java.lang.Object):boolean");
    }
}
