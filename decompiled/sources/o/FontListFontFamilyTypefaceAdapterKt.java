package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.delivery.common.data.model.tasks.QrCodeScanTask$QrScanScreen$Companion;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontListFontFamilyTypefaceAdapterpreload32111;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontListFontFamilyTypefaceAdapterKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final preloadlambda1 errorMessage;
    public final FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1 fallbackScreen;
    public final getDismissOnBackPress fallbackScreenButton;
    public final String headline;
    public final String instructionMessage;
    public final String qrCode;
    public final preloadlambda1 successMessage;
    public final List trackingEvents;
    public static final QrCodeScanTask$QrScanScreen$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.QrCodeScanTask$QrScanScreen$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 87;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return FontListFontFamilyTypefaceAdapterpreload32111.write;
            }
            int i3 = 82 / 0;
            return FontListFontFamilyTypefaceAdapterpreload32111.write;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(9)), null, null};

    public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i2));
        int i12 = i8 | i;
        int i13 = ~(i12 | i6);
        int i14 = (~(i2 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i + i6 + i3 + (1650861130 * i5) + ((-924421097) * i4);
        int i16 = i15 * i15;
        int i17 = (i * (-405912681)) + 1474035712 + ((-405912681) * i6) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i3) + (986710016 * i5) + ((-948436992) * i4) + ((-1864630272) * i16);
        int i18 = ((i * (-959335331)) - 587927435) + (i6 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i3 * (-959334869)) + (i5 * 22983790) + (i4 * 637852125) + (i16 * (-1124859904));
        return i17 + ((i18 * i18) * (-1807482880)) != 1 ? serializer(objArr) : read(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.QrCodeScanTask$QrScanScreen$Companion] */
    static {
        int i = serializer + 27;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        FontListFontFamilyTypefaceAdapterKt fontListFontFamilyTypefaceAdapterKt = (FontListFontFamilyTypefaceAdapterKt) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            getDismissOnBackPress getdismissonbackpress = fontListFontFamilyTypefaceAdapterKt.fallbackScreenButton;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getDismissOnBackPress getdismissonbackpress2 = fontListFontFamilyTypefaceAdapterKt.fallbackScreenButton;
        int i4 = i3 + 65;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getdismissonbackpress2;
    }

    public final preloadlambda1 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        preloadlambda1 preloadlambda1Var = this.errorMessage;
        int i5 = i3 + 115;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return preloadlambda1Var;
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 71;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.qrCode;
        int i5 = i2 + 39;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final preloadlambda1 MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        preloadlambda1 preloadlambda1Var = this.successMessage;
        int i5 = i3 + 59;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return preloadlambda1Var;
    }

    public final List MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 35;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.trackingEvents;
        int i5 = i2 + 53;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.fallbackScreen;
        }
        int i3 = 22 / 0;
        return this.fallbackScreen;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.headline;
        int i5 = i3 + 103;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 125;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.instructionMessage;
        int i5 = i2 + 123;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapterKt(int i, String str, String str2, preloadlambda1 preloadlambda1Var, preloadlambda1 preloadlambda1Var2, String str3, List list, getDismissOnBackPress getdismissonbackpress, FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1 fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1) {
        if (223 == (i & Constant.ERROR_WSS_TIME_DIFF_LARGE)) {
            this.instructionMessage = str;
            this.headline = str2;
            this.errorMessage = preloadlambda1Var;
            this.successMessage = preloadlambda1Var2;
            this.qrCode = str3;
            if ((i & 32) == 0) {
                this.trackingEvents = null;
            } else {
                this.trackingEvents = list;
                int i2 = RemoteActionCompatParcelizer + 3;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.fallbackScreenButton = getdismissonbackpress;
            this.fallbackScreen = fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1;
            int i5 = IconCompatParcelizer + 83;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, Constant.ERROR_WSS_TIME_DIFF_LARGE, FontListFontFamilyTypefaceAdapterpreload32111.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.instructionMessage.hashCode() * 31, 31, this.headline);
        int iM2 = af$$ExternalSyntheticOutline0.m((this.successMessage.hashCode() + ((this.errorMessage.hashCode() + iM) * 31)) * 31, 31, this.qrCode);
        List list = this.trackingEvents;
        if (list == null) {
            int i4 = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = list.hashCode();
        }
        int iHashCode2 = this.fallbackScreen.hashCode() + ((this.fallbackScreenButton.hashCode() + ((iM2 + iHashCode) * 31)) * 31);
        int i5 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        FontListFontFamilyTypefaceAdapterKt fontListFontFamilyTypefaceAdapterKt = (FontListFontFamilyTypefaceAdapterKt) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("QrScanScreen(instructionMessage=", fontListFontFamilyTypefaceAdapterKt.instructionMessage, ", headline=", fontListFontFamilyTypefaceAdapterKt.headline, ", errorMessage=");
        sbM.append(fontListFontFamilyTypefaceAdapterKt.errorMessage);
        sbM.append(", successMessage=");
        sbM.append(fontListFontFamilyTypefaceAdapterKt.successMessage);
        sbM.append(", qrCode=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, fontListFontFamilyTypefaceAdapterKt.qrCode, ", trackingEvents=", fontListFontFamilyTypefaceAdapterKt.trackingEvents, ", fallbackScreenButton=");
        sbM.append(fontListFontFamilyTypefaceAdapterKt.fallbackScreenButton);
        sbM.append(", fallbackScreen=");
        sbM.append(fontListFontFamilyTypefaceAdapterKt.fallbackScreen);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FontListFontFamilyTypefaceAdapterKt)) {
            return false;
        }
        FontListFontFamilyTypefaceAdapterKt fontListFontFamilyTypefaceAdapterKt = (FontListFontFamilyTypefaceAdapterKt) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.instructionMessage, fontListFontFamilyTypefaceAdapterKt.instructionMessage}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.headline, fontListFontFamilyTypefaceAdapterKt.headline}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorMessage, fontListFontFamilyTypefaceAdapterKt.errorMessage}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successMessage, fontListFontFamilyTypefaceAdapterKt.successMessage}, getCieXyz.write())).booleanValue()) {
                    int i2 = RemoteActionCompatParcelizer + 109;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 == 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.qrCode, fontListFontFamilyTypefaceAdapterKt.qrCode}, getCieXyz.write())).booleanValue()) {
                    int i3 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, fontListFontFamilyTypefaceAdapterKt.trackingEvents}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fallbackScreenButton, fontListFontFamilyTypefaceAdapterKt.fallbackScreenButton}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fallbackScreen, fontListFontFamilyTypefaceAdapterKt.fallbackScreen}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i5 = RemoteActionCompatParcelizer + 75;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 88 / 0;
                }
                return true;
            }
            int i7 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }

    public final String toString() {
        return (String) IconCompatParcelizer(-1622015421, new Object[]{this}, getFailureResponseData.RemoteActionCompatParcelizer(), getFailureResponseData.RemoteActionCompatParcelizer(), getFailureResponseData.RemoteActionCompatParcelizer(), getFailureResponseData.RemoteActionCompatParcelizer(), 1622015421);
    }

    public final getDismissOnBackPress write() {
        return (getDismissOnBackPress) IconCompatParcelizer(-622890116, new Object[]{this}, getFailureResponseData.RemoteActionCompatParcelizer(), getFailureResponseData.RemoteActionCompatParcelizer(), getFailureResponseData.RemoteActionCompatParcelizer(), getFailureResponseData.RemoteActionCompatParcelizer(), 622890117);
    }
}
