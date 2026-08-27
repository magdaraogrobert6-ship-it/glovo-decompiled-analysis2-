package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtPopuppopupLayout111121;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "preferences")
public final class AndroidPopup_androidKtPopupTestTag1 extends invokeozmzZPI {
    public static final StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 77;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidPopup_androidKtPopuppopupLayout111121 androidPopup_androidKtPopuppopupLayout111121 = AndroidPopup_androidKtPopuppopupLayout111121.read;
            int i4 = read + 61;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return androidPopup_androidKtPopuppopupLayout111121;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String description;
    public final AndroidPopup_androidKtSimpleStack111 details;
    public final Api21Impl dialogMessage;
    public final boolean isShiftEnding;
    public final getSystemBarsHeight pushMessage;
    public final String stateOffText;
    public final String stateOnText;
    public final String statePausedText;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$Companion] */
    static {
        int i = read + 85;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ AndroidPopup_androidKtPopupTestTag1(int i, String str, String str2, boolean z, String str3, String str4, String str5, AndroidPopup_androidKtSimpleStack111 androidPopup_androidKtSimpleStack111, getSystemBarsHeight getsystembarsheight, Api21Impl api21Impl) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        int i2 = 2 % 2;
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
            int i3 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i4 = RemoteActionCompatParcelizer + 31;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.isShiftEnding = false;
        } else {
            this.isShiftEnding = z;
        }
        if ((i & 8) == 0) {
            this.stateOnText = null;
            int i6 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            this.stateOnText = str3;
        }
        if ((i & 16) == 0) {
            int i9 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            this.stateOffText = null;
        } else {
            this.stateOffText = str4;
        }
        if ((i & 32) == 0) {
            this.statePausedText = null;
            int i11 = 2 % 2;
        } else {
            this.statePausedText = str5;
        }
        if ((i & 64) == 0) {
            this.details = null;
        } else {
            this.details = androidPopup_androidKtSimpleStack111;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.pushMessage = null;
        } else {
            this.pushMessage = getsystembarsheight;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.dialogMessage = null;
        } else {
            this.dialogMessage = api21Impl;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Preferences(title=", this.title, ", description=", this.description, ", isShiftEnding=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", stateOnText=", this.stateOnText, ", stateOffText=", sbM, this.isShiftEnding);
        c8$$ExternalSyntheticOutline0.m(sbM, this.stateOffText, ", statePausedText=", this.statePausedText, ", details=");
        sbM.append(this.details);
        sbM.append(", pushMessage=");
        sbM.append(this.pushMessage);
        sbM.append(", dialogMessage=");
        sbM.append(this.dialogMessage);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.title;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.description;
        int iM = d$$ExternalSyntheticOutline0.m(((iHashCode4 * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isShiftEnding);
        String str3 = this.stateOnText;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.stateOffText;
        if (str4 == null) {
            int i2 = RemoteActionCompatParcelizer + 45;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str4.hashCode();
        }
        String str5 = this.statePausedText;
        if (str5 == null) {
            int i3 = RemoteActionCompatParcelizer + 39;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        AndroidPopup_androidKtSimpleStack111 androidPopup_androidKtSimpleStack111 = this.details;
        int iHashCode6 = androidPopup_androidKtSimpleStack111 == null ? 0 : androidPopup_androidKtSimpleStack111.hashCode();
        getSystemBarsHeight getsystembarsheight = this.pushMessage;
        if (getsystembarsheight == null) {
            int i5 = RemoteActionCompatParcelizer + 115;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = getsystembarsheight.hashCode();
        }
        Api21Impl api21Impl = this.dialogMessage;
        return ((((((((((iM + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + (api21Impl != null ? api21Impl.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 99;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof AndroidPopup_androidKtPopupTestTag1)) {
            int i3 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        AndroidPopup_androidKtPopupTestTag1 androidPopup_androidKtPopupTestTag1 = (AndroidPopup_androidKtPopupTestTag1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidPopup_androidKtPopupTestTag1.title}, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, androidPopup_androidKtPopupTestTag1.description}, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 37;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (this.isShiftEnding != androidPopup_androidKtPopupTestTag1.isShiftEnding) {
            int i8 = RemoteActionCompatParcelizer + 69;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stateOnText, androidPopup_androidKtPopupTestTag1.stateOnText}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stateOffText, androidPopup_androidKtPopupTestTag1.stateOffText}, getCieXyz.write())).booleanValue()) {
            int i10 = IconCompatParcelizer + 71;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.statePausedText, androidPopup_androidKtPopupTestTag1.statePausedText}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.details, androidPopup_androidKtPopupTestTag1.details}, getCieXyz.write())).booleanValue()) {
            int i12 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pushMessage, androidPopup_androidKtPopupTestTag1.pushMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dialogMessage, androidPopup_androidKtPopupTestTag1.dialogMessage}, getCieXyz.write())).booleanValue();
    }
}
