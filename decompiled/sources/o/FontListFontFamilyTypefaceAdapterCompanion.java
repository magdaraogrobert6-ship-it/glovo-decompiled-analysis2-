package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$QrCodePayment$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetFontMatchercp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontListFontFamilyTypefaceAdapterCompanion {
    public static final QrCodePaymentTask$QrCodePayment$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$QrCodePayment$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 105;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetFontMatchercp accessgetfontmatchercp = accessgetFontMatchercp.read;
            int i4 = RemoteActionCompatParcelizer + 49;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return accessgetfontmatchercp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final double amount;
    public final getDismissOnBackPress button;
    public final String currency;
    public final String description;
    public final preloadlambda30 qrPaymentDetails;
    public final FontListFontFamilyTypefaceAdapterpreload321 qrPaymentScreen;
    public final boolean required;
    public final String title;

    public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i3);
        int i8 = (~((~i3) | (~i2))) | i7;
        int i9 = i3 | i2;
        int i10 = i3 + i2 + i4 + ((-39394691) * i5) + ((-2104995841) * i6);
        int i11 = i10 * i10;
        int i12 = (i3 * (-1880913482)) + 198443008 + ((-1880913482) * i2) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i4) + ((-1529085952) * i5) + ((-319553536) * i6) + ((-289079296) * i11);
        int i13 = ((i3 * 1773844906) - 1404835566) + (i2 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i4 * 1773845519) + (i5 * 1055723859) + (i6 * 1996616689) + (i11 * (-1450508288));
        return i12 + ((i13 * i13) * (-778371072)) != 1 ? read(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$QrCodePayment$Companion] */
    static {
        int i = write + 79;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        FontListFontFamilyTypefaceAdapterCompanion fontListFontFamilyTypefaceAdapterCompanion = (FontListFontFamilyTypefaceAdapterCompanion) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        getDismissOnBackPress getdismissonbackpress = fontListFontFamilyTypefaceAdapterCompanion.button;
        int i5 = i3 + 25;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getdismissonbackpress;
    }

    public final double IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        double d = this.amount;
        int i4 = i2 + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return d;
    }

    public final boolean MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.required;
        int i4 = i3 + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return z;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = serializer + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 63;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final FontListFontFamilyTypefaceAdapterpreload321 RatingCompat() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.qrPaymentScreen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final preloadlambda30 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        preloadlambda30 preloadlambda30Var = this.qrPaymentDetails;
        int i5 = i3 + 7;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return preloadlambda30Var;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.description;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.currency;
        }
        int i3 = 58 / 0;
        return this.currency;
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapterCompanion(int i, String str, String str2, preloadlambda30 preloadlambda30Var, getDismissOnBackPress getdismissonbackpress, FontListFontFamilyTypefaceAdapterpreload321 fontListFontFamilyTypefaceAdapterpreload321, double d, String str3, boolean z) {
        if (243 == (i & 243)) {
            this.title = str;
            this.description = str2;
            if ((i & 4) == 0) {
                this.qrPaymentDetails = null;
            } else {
                this.qrPaymentDetails = preloadlambda30Var;
                int i2 = serializer + 11;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            }
            if ((i & 8) == 0) {
                this.button = null;
                int i4 = serializer + 69;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } else {
                this.button = getdismissonbackpress;
            }
            this.qrPaymentScreen = fontListFontFamilyTypefaceAdapterpreload321;
            this.amount = d;
            this.currency = str3;
            this.required = z;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 243, accessgetFontMatchercp.read.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[PHI: r2 r4
  0x003d: PHI (r2v14 int) = (r2v7 int), (r2v18 int) binds: [B:8:0x0039, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r4v4 o.preloadlambda30) = (r4v1 o.preloadlambda30), (r4v7 o.preloadlambda30) binds: [B:8:0x0039, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003b A[PHI: r2
  0x003b: PHI (r2v8 int) = (r2v7 int), (r2v18 int) binds: [B:8:0x0039, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object read(Object[] objArr) {
        int iM;
        preloadlambda30 preloadlambda30Var;
        int iHashCode;
        FontListFontFamilyTypefaceAdapterCompanion fontListFontFamilyTypefaceAdapterCompanion = (FontListFontFamilyTypefaceAdapterCompanion) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(fontListFontFamilyTypefaceAdapterCompanion.title.hashCode() - 12, 49, fontListFontFamilyTypefaceAdapterCompanion.description);
            preloadlambda30Var = fontListFontFamilyTypefaceAdapterCompanion.qrPaymentDetails;
            if (preloadlambda30Var == null) {
                iHashCode = 0;
            } else {
                iHashCode = preloadlambda30Var.hashCode();
                int i3 = IconCompatParcelizer + 77;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(fontListFontFamilyTypefaceAdapterCompanion.title.hashCode() * 31, 31, fontListFontFamilyTypefaceAdapterCompanion.description);
            preloadlambda30Var = fontListFontFamilyTypefaceAdapterCompanion.qrPaymentDetails;
            if (preloadlambda30Var == null) {
                iHashCode = 0;
            } else {
                iHashCode = preloadlambda30Var.hashCode();
                int i5 = IconCompatParcelizer + 77;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        getDismissOnBackPress getdismissonbackpress = fontListFontFamilyTypefaceAdapterCompanion.button;
        return Integer.valueOf(Boolean.hashCode(fontListFontFamilyTypefaceAdapterCompanion.required) + af$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(fontListFontFamilyTypefaceAdapterCompanion.amount, (fontListFontFamilyTypefaceAdapterCompanion.qrPaymentScreen.hashCode() + ((((iM + iHashCode) * 31) + (getdismissonbackpress != null ? getdismissonbackpress.hashCode() : 0)) * 31)) * 31, 31), 31, fontListFontFamilyTypefaceAdapterCompanion.currency));
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("QrCodePayment(title=", this.title, ", description=", this.description, ", qrPaymentDetails=");
        sbM.append(this.qrPaymentDetails);
        sbM.append(", button=");
        sbM.append(this.button);
        sbM.append(", qrPaymentScreen=");
        sbM.append(this.qrPaymentScreen);
        sbM.append(", amount=");
        sbM.append(this.amount);
        sbM.append(", currency=");
        sbM.append(this.currency);
        sbM.append(", required=");
        sbM.append(this.required);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 63;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 85;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 85;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof FontListFontFamilyTypefaceAdapterCompanion)) {
            int i8 = i4 + 33;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        FontListFontFamilyTypefaceAdapterCompanion fontListFontFamilyTypefaceAdapterCompanion = (FontListFontFamilyTypefaceAdapterCompanion) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, fontListFontFamilyTypefaceAdapterCompanion.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, fontListFontFamilyTypefaceAdapterCompanion.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.qrPaymentDetails, fontListFontFamilyTypefaceAdapterCompanion.qrPaymentDetails}, getCieXyz.write())).booleanValue()) {
            int i10 = IconCompatParcelizer + 57;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.button, fontListFontFamilyTypefaceAdapterCompanion.button}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.qrPaymentScreen, fontListFontFamilyTypefaceAdapterCompanion.qrPaymentScreen}, getCieXyz.write())).booleanValue() || Double.compare(this.amount, fontListFontFamilyTypefaceAdapterCompanion.amount) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currency, fontListFontFamilyTypefaceAdapterCompanion.currency}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.required == fontListFontFamilyTypefaceAdapterCompanion.required) {
            return true;
        }
        int i12 = serializer + 29;
        IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }

    public final int hashCode() {
        return ((Integer) IconCompatParcelizer(r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat(), new Object[]{this}, 610371929, -610371929, r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat(), r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat(), r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat())).intValue();
    }

    public final getDismissOnBackPress write() {
        return (getDismissOnBackPress) IconCompatParcelizer(r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat(), new Object[]{this}, 831359841, -831359840, r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat(), r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat(), r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat());
    }
}
