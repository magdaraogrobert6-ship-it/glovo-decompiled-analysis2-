package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.CardCashPayment$Companion;
import kotlinx.serialization.Serializable;
import o.createFontFamilyResolver;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "cash_card_payment")
public final class getLoaderui_text extends DeviceFontFamilyNameFontKt {
    public static final CardCashPayment$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CardCashPayment$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 11;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            createFontFamilyResolver createfontfamilyresolver = createFontFamilyResolver.IconCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 101;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfontfamilyresolver;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final double amount;
    public final getBlockingPKNRLFQ cardPayment;
    public final DelegatingFontLoaderForBridgeUsage cashPayment;
    public final String defaultPayment;
    public final String id;
    public final boolean required;
    public final String status;
    public final String successMessage;
    public final String successPostMessage;
    public final String title;

    public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i5) | i7);
        int i9 = ~(i4 | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i5;
        int i12 = ~(i7 | i5);
        int i13 = i6 + i5 + i3 + (1577873432 * i2) + (977123338 * i);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i6) - 865599488) + ((-647756440) * i5) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i3) + ((-767557632) * i2) + (1290797056 * i) + ((-539361280) * i14);
        int i16 = (i6 * (-1177406726)) + 1326046462 + (i5 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i3 * (-1177406223)) + (i2 * 1546282648) + (i * (-1884272278)) + (i14 * 70909952);
        if (i15 + (i16 * i16 * 451280896) != 1) {
            return IconCompatParcelizer(objArr);
        }
        getLoaderui_text getloaderui_text = (getLoaderui_text) objArr[0];
        int i17 = 2 % 2;
        int i18 = IconCompatParcelizer + 13;
        int i19 = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i19;
        int i20 = i18 % 2;
        boolean z = getloaderui_text.required;
        int i21 = i19 + 71;
        IconCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i22 = i21 % 2;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CardCashPayment$Companion] */
    static {
        int i = write + 69;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final DelegatingFontLoaderForBridgeUsage IconCompatParcelizer() {
        DelegatingFontLoaderForBridgeUsage delegatingFontLoaderForBridgeUsage;
        int i = 2 % 2;
        int i2 = serializer + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            delegatingFontLoaderForBridgeUsage = this.cashPayment;
            int i4 = 80 / 0;
        } else {
            delegatingFontLoaderForBridgeUsage = this.cashPayment;
        }
        int i5 = i3 + 119;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return delegatingFontLoaderForBridgeUsage;
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 83;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = serializer + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.successMessage;
        int i4 = i3 + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.successPostMessage;
        int i5 = i2 + 113;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String RatingCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 9;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 17;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    public final getBlockingPKNRLFQ RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 105;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        getBlockingPKNRLFQ getblockingpknrlfq = this.cardPayment;
        int i4 = i2 + 39;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getblockingpknrlfq;
    }

    public final double read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        double d = this.amount;
        int i5 = i3 + 49;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return d;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 91;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.defaultPayment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getLoaderui_text(int i, String str, String str2, String str3, String str4, String str5, double d, String str6, boolean z, DelegatingFontLoaderForBridgeUsage delegatingFontLoaderForBridgeUsage, getBlockingPKNRLFQ getblockingpknrlfq) {
        if (767 == (i & 767)) {
            this.id = str;
            this.status = str2;
            this.title = str3;
            this.successMessage = str4;
            this.successPostMessage = str5;
            this.amount = d;
            this.defaultPayment = str6;
            this.required = z;
            if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
                this.cashPayment = null;
            } else {
                this.cashPayment = delegatingFontLoaderForBridgeUsage;
                int i2 = serializer + 45;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 3;
                } else {
                    int i4 = 2 % 2;
                }
            }
            this.cardPayment = getblockingpknrlfq;
            int i5 = IconCompatParcelizer + 123;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 767, createFontFamilyResolver.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getLoaderui_text getloaderui_text = (getLoaderui_text) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(getloaderui_text.amount, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getloaderui_text.id.hashCode() * 31, 31, getloaderui_text.status), 31, getloaderui_text.title), 31, getloaderui_text.successMessage), 31, getloaderui_text.successPostMessage), 31), 31, getloaderui_text.defaultPayment), 31, getloaderui_text.required);
        DelegatingFontLoaderForBridgeUsage delegatingFontLoaderForBridgeUsage = getloaderui_text.cashPayment;
        int iHashCode = getloaderui_text.cardPayment.hashCode() + ((iM + (delegatingFontLoaderForBridgeUsage != null ? delegatingFontLoaderForBridgeUsage.hashCode() : 0)) * 31);
        int i4 = IconCompatParcelizer + 9;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return Integer.valueOf(iHashCode);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CardCashPayment(id=", this.id, ", status=", this.status, ", title=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.title, ", successMessage=", this.successMessage, ", successPostMessage=");
        sbM.append(this.successPostMessage);
        sbM.append(", amount=");
        sbM.append(this.amount);
        sbM.append(", defaultPayment=");
        sbM.append(this.defaultPayment);
        sbM.append(", required=");
        sbM.append(this.required);
        sbM.append(", cashPayment=");
        sbM.append(this.cashPayment);
        sbM.append(", cardPayment=");
        sbM.append(this.cardPayment);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 83;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getLoaderui_text)) {
            return false;
        }
        getLoaderui_text getloaderui_text = (getLoaderui_text) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, getloaderui_text.id}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 79;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, getloaderui_text.status}, getCieXyz.write())).booleanValue()) {
            int i5 = IconCompatParcelizer + 35;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getloaderui_text.title}, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 119;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successMessage, getloaderui_text.successMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successPostMessage, getloaderui_text.successPostMessage}, getCieXyz.write())).booleanValue()) {
            int i9 = serializer + 119;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (Double.compare(this.amount, getloaderui_text.amount) != 0) {
            int i11 = serializer + 97;
            IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.defaultPayment, getloaderui_text.defaultPayment}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.required != getloaderui_text.required) {
            int i13 = IconCompatParcelizer + 59;
            serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cashPayment, getloaderui_text.cashPayment}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cardPayment, getloaderui_text.cardPayment}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i15 = serializer + 49;
        IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i15 % 2 != 0) {
            int i16 = 22 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int i = sendPreinstallReferrerI.read();
        int i2 = sendPreinstallReferrerI.read();
        int i3 = sendPreinstallReferrerI.read();
        return ((Integer) IconCompatParcelizer(sendPreinstallReferrerI.read(), new Object[]{this}, i3, i2, i, 197488135, -197488135)).intValue();
    }

    public final boolean MediaMetadataCompat() {
        int i = sendPreinstallReferrerI.read();
        int i2 = sendPreinstallReferrerI.read();
        int i3 = sendPreinstallReferrerI.read();
        return ((Boolean) IconCompatParcelizer(sendPreinstallReferrerI.read(), new Object[]{this}, i3, i2, i, -502626317, 502626318)).booleanValue();
    }
}
