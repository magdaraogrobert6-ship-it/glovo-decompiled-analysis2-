package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.CashPayment$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "cash_payment")
public final class DelegatingFontLoaderForBridgeUsage extends DeviceFontFamilyNameFontKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String addActionTitle;
    public final String cancelActionTitle;
    public final String currency;
    public final Double defaultAmount;
    public final String description;
    public final String doneActionTitle;
    public final String editActionTitle;
    public final boolean editable;
    public final String id;
    public final String key;
    public final String note;
    public final FontLoadingStrategy reason;
    public final boolean required;
    public final String requiredText;
    public final String title;
    public final List trackingEvents;
    public final String validation;
    public static final CashPayment$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CashPayment$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 35;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            DelegatingFontLoaderForDeprecatedUsage_androidKt delegatingFontLoaderForDeprecatedUsage_androidKt = DelegatingFontLoaderForDeprecatedUsage_androidKt.write;
            int i4 = IconCompatParcelizer + 3;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return delegatingFontLoaderForDeprecatedUsage_androidKt;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(0))};

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = (~((~i2) | i5)) | i3;
        int i8 = ~i3;
        int i9 = (~(i8 | i5)) | (~(i8 | i2)) | (~(i5 | i2));
        int i10 = (~(i2 | (~i5))) | i8;
        int i11 = i3 + i5 + i4 + ((-2137991558) * i6) + (111092868 * i);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i3) - 566755328) + (427185167 * i5) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i4) + ((-1247805440) * i6) + ((-1807745024) * i) + ((-591921152) * i12);
        int i14 = (i3 * (-1469267343)) + 1003592187 + (i5 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i4 * (-1469268067)) + (i6 * 1951436498) + (i * (-746069772)) + (i12 * (-1529348096));
        int i15 = i13 + (i14 * i14 * 1762131968);
        if (i15 == 1) {
            DelegatingFontLoaderForBridgeUsage delegatingFontLoaderForBridgeUsage = (DelegatingFontLoaderForBridgeUsage) objArr[0];
            int i16 = 2 % 2;
            int i17 = read + 3;
            int i18 = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i18;
            int i19 = i17 % 2;
            String str = delegatingFontLoaderForBridgeUsage.note;
            int i20 = i18 + 15;
            read = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i21 = i20 % 2;
            return str;
        }
        if (i15 == 2) {
            return write(objArr);
        }
        DelegatingFontLoaderForBridgeUsage delegatingFontLoaderForBridgeUsage2 = (DelegatingFontLoaderForBridgeUsage) objArr[0];
        int i22 = 2 % 2;
        int i23 = RemoteActionCompatParcelizer + 21;
        int i24 = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i24;
        int i25 = i23 % 2;
        String str2 = delegatingFontLoaderForBridgeUsage2.title;
        int i26 = i24 + 119;
        RemoteActionCompatParcelizer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i27 = i26 % 2;
        return str2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CashPayment$Companion] */
    static {
        int i = write + 119;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        DelegatingFontLoaderForBridgeUsage delegatingFontLoaderForBridgeUsage = (DelegatingFontLoaderForBridgeUsage) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 81;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = delegatingFontLoaderForBridgeUsage.doneActionTitle;
        int i5 = i2 + 9;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.cancelActionTitle;
        int i5 = i3 + 7;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return str;
    }

    public final FontLoadingStrategy MediaBrowserCompatMediaItem() {
        FontLoadingStrategy fontLoadingStrategy;
        int i = 2 % 2;
        int i2 = read + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            fontLoadingStrategy = this.reason;
            int i4 = 74 / 0;
        } else {
            fontLoadingStrategy = this.reason;
        }
        int i5 = i3 + 105;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return fontLoadingStrategy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 111;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.editActionTitle;
        int i5 = i2 + 123;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = read + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.id;
        }
        int i3 = 84 / 0;
        return this.id;
    }

    public final String MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.validation;
        }
        throw null;
    }

    public final String ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 123;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.requiredText;
        int i5 = i2 + 121;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public final boolean PlaybackStateCompat() {
        boolean z;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 41;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            z = this.required;
            int i4 = 55 / 0;
        } else {
            z = this.required;
        }
        int i5 = i2 + 77;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 21;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.trackingEvents;
        int i5 = i2 + 81;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 49;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.editable;
        int i4 = i2 + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final Double RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        Double d = this.defaultAmount;
        int i5 = i3 + 55;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return d;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 89;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.addActionTitle;
        int i5 = i2 + 65;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.description;
        }
        throw null;
    }

    public /* synthetic */ DelegatingFontLoaderForBridgeUsage(int i, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, String str7, String str8, String str9, String str10, Double d, String str11, String str12, FontLoadingStrategy fontLoadingStrategy, List list) {
        String str13;
        Object obj = null;
        if (18390 != (i & 18390)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 18390, DelegatingFontLoaderForDeprecatedUsage_androidKt.write.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            int i2 = read + 3;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str13 = "cash_payment";
        } else {
            str13 = str;
        }
        this.id = str13;
        this.title = str2;
        this.description = str3;
        if ((i & 8) == 0) {
            int i4 = RemoteActionCompatParcelizer + 89;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                this.note = null;
                obj.hashCode();
                throw null;
            }
            this.note = null;
        } else {
            this.note = str4;
        }
        this.required = z;
        if ((i & 32) == 0) {
            this.requiredText = null;
        } else {
            this.requiredText = str5;
            int i5 = 2 % 2;
        }
        this.editable = z2;
        this.addActionTitle = str6;
        this.editActionTitle = str7;
        this.cancelActionTitle = str8;
        this.doneActionTitle = str9;
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
            this.currency = null;
            int i6 = 2 % 2;
        } else {
            this.currency = str10;
        }
        if ((i & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0) {
            int i7 = read + 73;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            this.defaultAmount = null;
        } else {
            this.defaultAmount = d;
        }
        if ((i & 8192) == 0) {
            this.validation = null;
        } else {
            this.validation = str11;
        }
        this.key = str12;
        if ((32768 & i) == 0) {
            int i9 = read + 93;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                this.reason = null;
                throw null;
            }
            this.reason = null;
        } else {
            this.reason = fontLoadingStrategy;
        }
        int i10 = 2 % 2;
        this.trackingEvents = (i & 65536) == 0 ? instance_delegatelambda0.write : list;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CashPayment(id=", this.id, ", title=", this.title, ", description=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.description, ", note=", this.note, ", required=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", requiredText=", this.requiredText, ", editable=", sbM, this.required);
        IconCompatParcelizer.RemoteActionCompatParcelizer(", addActionTitle=", this.addActionTitle, ", editActionTitle=", sbM, this.editable);
        c8$$ExternalSyntheticOutline0.m(sbM, this.editActionTitle, ", cancelActionTitle=", this.cancelActionTitle, ", doneActionTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.doneActionTitle, ", currency=", this.currency, ", defaultAmount=");
        sbM.append(this.defaultAmount);
        sbM.append(", validation=");
        sbM.append(this.validation);
        sbM.append(", key=");
        sbM.append(this.key);
        sbM.append(", reason=");
        sbM.append(this.reason);
        sbM.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.trackingEvents, ")");
        int i4 = read + 49;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.description);
        String str = this.note;
        int iHashCode5 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = RemoteActionCompatParcelizer + 55;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.required);
        String str2 = this.requiredText;
        if (str2 == null) {
            int i4 = RemoteActionCompatParcelizer + 119;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int iM3 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((iM2 + iHashCode2) * 31, 31, this.editable), 31, this.addActionTitle), 31, this.editActionTitle), 31, this.cancelActionTitle), 31, this.doneActionTitle);
        String str3 = this.currency;
        if (str3 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
            int i5 = read + 95;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        Double d = this.defaultAmount;
        if (d == null) {
            int i7 = read + 59;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = d.hashCode();
        }
        String str4 = this.validation;
        int iM4 = af$$ExternalSyntheticOutline0.m((((((iM3 + iHashCode3) * 31) + iHashCode4) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.key);
        FontLoadingStrategy fontLoadingStrategy = this.reason;
        if (fontLoadingStrategy == null) {
            int i9 = RemoteActionCompatParcelizer + 41;
            int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 99;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            iHashCode5 = fontLoadingStrategy.hashCode();
        }
        return this.trackingEvents.hashCode() + ((iM4 + iHashCode5) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof DelegatingFontLoaderForBridgeUsage) {
            DelegatingFontLoaderForBridgeUsage delegatingFontLoaderForBridgeUsage = (DelegatingFontLoaderForBridgeUsage) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, delegatingFontLoaderForBridgeUsage.id}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, delegatingFontLoaderForBridgeUsage.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, delegatingFontLoaderForBridgeUsage.description}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.note, delegatingFontLoaderForBridgeUsage.note}, getCieXyz.write())).booleanValue() || this.required != delegatingFontLoaderForBridgeUsage.required) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredText, delegatingFontLoaderForBridgeUsage.requiredText}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.editable == delegatingFontLoaderForBridgeUsage.editable) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.addActionTitle, delegatingFontLoaderForBridgeUsage.addActionTitle}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.editActionTitle, delegatingFontLoaderForBridgeUsage.editActionTitle}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cancelActionTitle, delegatingFontLoaderForBridgeUsage.cancelActionTitle}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.doneActionTitle, delegatingFontLoaderForBridgeUsage.doneActionTitle}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currency, delegatingFontLoaderForBridgeUsage.currency}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.defaultAmount, delegatingFontLoaderForBridgeUsage.defaultAmount}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.validation, delegatingFontLoaderForBridgeUsage.validation}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, delegatingFontLoaderForBridgeUsage.key}, getCieXyz.write())).booleanValue()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reason, delegatingFontLoaderForBridgeUsage.reason}, getCieXyz.write())).booleanValue()) {
                                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, delegatingFontLoaderForBridgeUsage.trackingEvents}, getCieXyz.write())).booleanValue();
                                }
                                int i2 = RemoteActionCompatParcelizer + 25;
                                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i3 = i2 % 2;
                                return false;
                            }
                            int i4 = read + 97;
                            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            return i4 % 2 == 0;
                        }
                        int i5 = RemoteActionCompatParcelizer;
                        int i6 = i5 + 83;
                        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        int i8 = i5 + 73;
                        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                            return false;
                        }
                        throw null;
                    }
                    int i9 = RemoteActionCompatParcelizer + 7;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i9 % 2 != 0;
                }
                int i10 = RemoteActionCompatParcelizer + 97;
                read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return false;
            }
            int i12 = RemoteActionCompatParcelizer + 99;
            read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i13 = 62 / 0;
            }
            return false;
        }
        int i14 = RemoteActionCompatParcelizer + 117;
        read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i14 % 2 != 0;
    }

    public final String MediaSessionCompatToken() {
        int iSerializer = com.mapbox.navigator.R.serializer();
        int iSerializer2 = com.mapbox.navigator.R.serializer();
        int iSerializer3 = com.mapbox.navigator.R.serializer();
        return (String) read(com.mapbox.navigator.R.serializer(), iSerializer, -1096693729, iSerializer2, 1096693729, new Object[]{this}, iSerializer3);
    }

    public final String MediaDescriptionCompat() {
        int iSerializer = com.mapbox.navigator.R.serializer();
        int iSerializer2 = com.mapbox.navigator.R.serializer();
        int iSerializer3 = com.mapbox.navigator.R.serializer();
        return (String) read(com.mapbox.navigator.R.serializer(), iSerializer, -1897392651, iSerializer2, 1897392652, new Object[]{this}, iSerializer3);
    }

    public final String serializer() {
        int iSerializer = com.mapbox.navigator.R.serializer();
        int iSerializer2 = com.mapbox.navigator.R.serializer();
        int iSerializer3 = com.mapbox.navigator.R.serializer();
        return (String) read(com.mapbox.navigator.R.serializer(), iSerializer, -1688220075, iSerializer2, 1688220077, new Object[]{this}, iSerializer3);
    }
}
