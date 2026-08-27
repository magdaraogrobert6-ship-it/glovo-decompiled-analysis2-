package o;

import com.roadrunner.delivery.state.StateV3$ScreenType;

/* JADX INFO: loaded from: classes3.dex */
public final class getOffscreenPageLimit {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final ContainsAlllambda0 IconCompatParcelizer;
    public final StateV3$ScreenType RemoteActionCompatParcelizer;
    public final setFitInsetsSides read;
    public final AndroidView_androidKtcreateAndroidViewNodeFactory11 serializer;
    public final AndroidPopup_androidKtLocalIsInPopupLayout1 write;

    public getOffscreenPageLimit(AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11, AndroidPopup_androidKtLocalIsInPopupLayout1 androidPopup_androidKtLocalIsInPopupLayout1, ContainsAlllambda0 containsAlllambda0, StateV3$ScreenType stateV3$ScreenType, setFitInsetsSides setfitinsetssides) {
        this.serializer = androidView_androidKtcreateAndroidViewNodeFactory11;
        this.write = androidPopup_androidKtLocalIsInPopupLayout1;
        this.IconCompatParcelizer = containsAlllambda0;
        this.RemoteActionCompatParcelizer = stateV3$ScreenType;
        this.read = setfitinsetssides;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DeliveryAcceptanceStateResponse(acceptData=" + this.serializer + ", autoAcceptData=" + this.write + ", backToBackOrdersState=" + this.IconCompatParcelizer + ", screenType=" + this.RemoteActionCompatParcelizer + ", metadata=" + this.read + ")";
        int i2 = MediaDescriptionCompat + 51;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = this.serializer;
        if (androidView_androidKtcreateAndroidViewNodeFactory11 == null) {
            int i2 = MediaDescriptionCompat + 27;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = androidView_androidKtcreateAndroidViewNodeFactory11.hashCode();
        }
        AndroidPopup_androidKtLocalIsInPopupLayout1 androidPopup_androidKtLocalIsInPopupLayout1 = this.write;
        if (androidPopup_androidKtLocalIsInPopupLayout1 == null) {
            int i4 = MediaDescriptionCompat + 85;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = androidPopup_androidKtLocalIsInPopupLayout1.hashCode();
        }
        ContainsAlllambda0 containsAlllambda0 = this.IconCompatParcelizer;
        int iHashCode4 = containsAlllambda0 == null ? 0 : containsAlllambda0.hashCode();
        StateV3$ScreenType stateV3$ScreenType = this.RemoteActionCompatParcelizer;
        if (stateV3$ScreenType == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = stateV3$ScreenType.hashCode();
            int i6 = MediaDescriptionCompat + 61;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        setFitInsetsSides setfitinsetssides = this.read;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3) * 31) + (setfitinsetssides != null ? setfitinsetssides.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOffscreenPageLimit)) {
            return false;
        }
        getOffscreenPageLimit getoffscreenpagelimit = (getOffscreenPageLimit) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getoffscreenpagelimit.serializer}, getCieXyz.write())).booleanValue()) {
            int i2 = MediaSessionCompatQueueItem + 77;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getoffscreenpagelimit.write}, getCieXyz.write())).booleanValue()) {
            int i4 = MediaSessionCompatQueueItem;
            int i5 = i4 + 113;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 43;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getoffscreenpagelimit.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == getoffscreenpagelimit.RemoteActionCompatParcelizer) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getoffscreenpagelimit.read}, getCieXyz.write())).booleanValue();
        }
        int i9 = MediaDescriptionCompat + 83;
        MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
