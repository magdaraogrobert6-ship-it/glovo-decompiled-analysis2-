package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.TransferChange$Companion;
import kotlinx.serialization.Serializable;
import o.FontSynthesisCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "transfer_change")
public final class getStyleGVVA2EU extends DeviceFontFamilyNameFontKt {
    public static final TransferChange$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.TransferChange$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 1;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                FontSynthesisCompanion fontSynthesisCompanion = FontSynthesisCompanion.IconCompatParcelizer;
                throw null;
            }
            FontSynthesisCompanion fontSynthesisCompanion2 = FontSynthesisCompanion.IconCompatParcelizer;
            int i3 = read + 21;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 81 / 0;
            }
            return fontSynthesisCompanion2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String cashTaskId;
    public final String id;
    public final boolean isTransferChangeSuccessful;
    public final boolean required;
    public final FontMatcher successData;
    public final getNormal_LCdwA taskData;
    public final String title;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i)) | i4;
        int i9 = i | i4 | i7;
        int i10 = i4 + i2 + i3 + (1159740906 * i5) + ((-617157175) * i6);
        int i11 = i10 * i10;
        int i12 = ((i4 * 934236018) - 2089811968) + (934236018 * i2) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i3) + (1488977920 * i5) + (2111832064 * i6) + (2070937600 * i11);
        int i13 = (i4 * (-824977050)) + 1921657099 + (i2 * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i3 * (-824977973)) + (i5 * (-135083378)) + (i6 * 1125239651) + (i11 * 298844160);
        if (i12 + (i13 * i13 * 2098200576) != 1) {
            return IconCompatParcelizer(objArr);
        }
        getStyleGVVA2EU getstylegvva2eu = (getStyleGVVA2EU) objArr[0];
        int i14 = 2 % 2;
        int i15 = read + 41;
        int i16 = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i16;
        int i17 = i15 % 2;
        String str = getstylegvva2eu.cashTaskId;
        int i18 = i16 + 33;
        read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i19 = i18 % 2;
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.TransferChange$Companion] */
    static {
        int i = write + 79;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getStyleGVVA2EU getstylegvva2eu = (getStyleGVVA2EU) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        FontMatcher fontMatcher = getstylegvva2eu.successData;
        int i5 = i3 + 81;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return fontMatcher;
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.required;
        int i4 = i3 + 121;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = read + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.title;
        }
        int i3 = 82 / 0;
        return this.title;
    }

    public final boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isTransferChangeSuccessful;
        int i4 = i3 + 45;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return z;
    }

    public final getNormal_LCdwA RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.taskData;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getStyleGVVA2EU(int i, String str, String str2, boolean z, boolean z2, String str3, getNormal_LCdwA getnormal_lcdwa, FontMatcher fontMatcher) {
        if (31 == (i & 31)) {
            this.id = str;
            this.cashTaskId = str2;
            this.required = z;
            this.isTransferChangeSuccessful = z2;
            this.title = str3;
            if ((i & 32) == 0) {
                this.taskData = null;
            } else {
                this.taskData = getnormal_lcdwa;
                int i2 = 2 % 2;
            }
            if ((i & 64) != 0) {
                this.successData = fontMatcher;
                return;
            }
            int i3 = IconCompatParcelizer + 43;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i4;
            if (i3 % 2 == 0) {
                this.successData = null;
                int i5 = 42 / 0;
            } else {
                this.successData = null;
            }
            int i6 = i4 + 9;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, FontSynthesisCompanion.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.cashTaskId), 31, this.required), 31, this.isTransferChangeSuccessful), 31, this.title);
        getNormal_LCdwA getnormal_lcdwa = this.taskData;
        if (getnormal_lcdwa == null) {
            int i4 = IconCompatParcelizer + 63;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iIntValue = 0;
        } else {
            iIntValue = ((Integer) getNormal_LCdwA.RemoteActionCompatParcelizer(1453649912, -1453649911, new Object[]{getnormal_lcdwa}, getShouldOptInWhenPushAuthorized.IconCompatParcelizer(), getShouldOptInWhenPushAuthorized.IconCompatParcelizer(), getShouldOptInWhenPushAuthorized.IconCompatParcelizer(), getShouldOptInWhenPushAuthorized.IconCompatParcelizer())).intValue();
        }
        FontMatcher fontMatcher = this.successData;
        return ((iM + iIntValue) * 31) + (fontMatcher != null ? fontMatcher.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TransferChange(id=", this.id, ", cashTaskId=", this.cashTaskId, ", required=");
        af$$ExternalSyntheticOutline0.m(sbM, this.required, ", isTransferChangeSuccessful=", this.isTransferChangeSuccessful, ", title=");
        sbM.append(this.title);
        sbM.append(", taskData=");
        sbM.append(this.taskData);
        sbM.append(", successData=");
        sbM.append(this.successData);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r22 instanceof o.getStyleGVVA2EU) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4 = r4 + 21;
        o.getStyleGVVA2EU.read = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r1 = (o.getStyleGVVA2EU) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.id, r1.id}, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r1 = o.getStyleGVVA2EU.IconCompatParcelizer + 53;
        o.getStyleGVVA2EU.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.cashTaskId, r1.cashTaskId}, o.getCieXyz.write())).booleanValue()) == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r21.required == r1.required) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r21.isTransferChangeSuccessful == r1.isTransferChangeSuccessful) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.title, r1.title}, o.getCieXyz.write())).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.taskData, r1.taskData}, o.getCieXyz.write())).booleanValue() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.successData, r1.successData}, o.getCieXyz.write())).booleanValue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0110, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0112, code lost:
    
        r1 = o.getStyleGVVA2EU.IconCompatParcelizer + 33;
        o.getStyleGVVA2EU.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        return false;
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
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStyleGVVA2EU.equals(java.lang.Object):boolean");
    }

    public final FontMatcher serializer() {
        return (FontMatcher) IconCompatParcelizer(bo.app.d2.write(), 2102242024, new Object[]{this}, bo.app.d2.write(), -2102242024, bo.app.d2.write(), bo.app.d2.write());
    }

    public final String read() {
        return (String) IconCompatParcelizer(bo.app.d2.write(), -810428701, new Object[]{this}, bo.app.d2.write(), 810428702, bo.app.d2.write(), bo.app.d2.write());
    }
}
