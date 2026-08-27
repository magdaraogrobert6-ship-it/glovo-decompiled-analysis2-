package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$QrScanScreen$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.limit;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PreviewParameter {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final mapTreeWithStitching errorMessage;
    public final accessgetCountjd fallbackScreen;
    public final ComposeAnimationState fallbackScreenButton;
    public final String headline;
    public final String instructionMessage;
    public final String qrCode;
    public final mapTreeWithStitching successMessage;
    public final List trackingEvents;
    public static final QrCodeScanTaskUiItem$QrScanScreen$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$QrScanScreen$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 99;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            limit limitVar = limit.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 123;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return limitVar;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(8))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$QrScanScreen$Companion] */
    static {
        Object obj = null;
        int i = serializer + 93;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final accessgetCountjd read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        accessgetCountjd accessgetcountjd = this.fallbackScreen;
        int i4 = i3 + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return accessgetcountjd;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ PreviewParameter(int i, String str, String str2, String str3, mapTreeWithStitching maptreewithstitching, mapTreeWithStitching maptreewithstitching2, ComposeAnimationState composeAnimationState, accessgetCountjd accessgetcountjd, List list) {
        if (255 == (i & 255)) {
            this.instructionMessage = str;
            this.headline = str2;
            this.qrCode = str3;
            this.errorMessage = maptreewithstitching;
            this.successMessage = maptreewithstitching2;
            this.fallbackScreenButton = composeAnimationState;
            this.fallbackScreen = accessgetcountjd;
            this.trackingEvents = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 255, limit.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public PreviewParameter(String str, String str2, String str3, mapTreeWithStitching maptreewithstitching, mapTreeWithStitching maptreewithstitching2, ComposeAnimationState composeAnimationState, accessgetCountjd accessgetcountjd, List list) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.instructionMessage = str;
        this.headline = str2;
        this.qrCode = str3;
        this.errorMessage = maptreewithstitching;
        this.successMessage = maptreewithstitching2;
        this.fallbackScreenButton = composeAnimationState;
        this.fallbackScreen = accessgetcountjd;
        this.trackingEvents = list;
    }

    public static PreviewParameter IconCompatParcelizer(PreviewParameter previewParameter, accessgetCountjd accessgetcountjd) {
        int i = 2 % 2;
        String str = previewParameter.instructionMessage;
        String str2 = previewParameter.headline;
        String str3 = previewParameter.qrCode;
        mapTreeWithStitching maptreewithstitching = previewParameter.errorMessage;
        mapTreeWithStitching maptreewithstitching2 = previewParameter.successMessage;
        ComposeAnimationState composeAnimationState = previewParameter.fallbackScreenButton;
        List list = previewParameter.trackingEvents;
        previewParameter.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        maptreewithstitching.getClass();
        maptreewithstitching2.getClass();
        composeAnimationState.getClass();
        list.getClass();
        PreviewParameter previewParameter2 = new PreviewParameter(str, str2, str3, maptreewithstitching, maptreewithstitching2, composeAnimationState, accessgetcountjd, list);
        int i2 = RemoteActionCompatParcelizer + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return previewParameter2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.instructionMessage.hashCode() * 31, 31, this.headline), 31, this.qrCode);
        int iHashCode = this.errorMessage.hashCode();
        int iHashCode2 = this.successMessage.hashCode();
        int iHashCode3 = this.fallbackScreenButton.hashCode();
        int iHashCode4 = this.trackingEvents.hashCode() + ((this.fallbackScreen.hashCode() + ((iHashCode3 + ((iHashCode2 + ((iHashCode + iM) * 31)) * 31)) * 31)) * 31);
        int i4 = read + 83;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("QrScanScreen(instructionMessage=", this.instructionMessage, ", headline=", this.headline, ", qrCode=");
        sbM.append(this.qrCode);
        sbM.append(", errorMessage=");
        sbM.append(this.errorMessage);
        sbM.append(", successMessage=");
        sbM.append(this.successMessage);
        sbM.append(", fallbackScreenButton=");
        sbM.append(this.fallbackScreenButton);
        sbM.append(", fallbackScreen=");
        sbM.append(this.fallbackScreen);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 117;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            return true;
        }
        if (!(obj instanceof PreviewParameter)) {
            return false;
        }
        PreviewParameter previewParameter = (PreviewParameter) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.instructionMessage, previewParameter.instructionMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.headline, previewParameter.headline}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.qrCode, previewParameter.qrCode}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorMessage, previewParameter.errorMessage}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successMessage, previewParameter.successMessage}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fallbackScreenButton, previewParameter.fallbackScreenButton}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fallbackScreen, previewParameter.fallbackScreen}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, previewParameter.trackingEvents}, getCieXyz.write())).booleanValue()) {
                    int i2 = read + 69;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 == 0;
                }
                int i3 = RemoteActionCompatParcelizer + 13;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            int i4 = read + 111;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 111;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
