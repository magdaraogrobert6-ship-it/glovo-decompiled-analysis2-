package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class applySpanStyle {
    private static int read = 1;
    private static int write;
    public final transferSessionPackageI IconCompatParcelizer;

    public applySpanStyle(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    public final boolean serializer() {
        int i = 2 % 2;
        transferSessionPackageI transfersessionpackagei = this.IconCompatParcelizer;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        firebaseRemoteConfigImpl.getClass();
        Object[] objArr = {firebaseRemoteConfigImpl, updateAdidI.IS_NAVER_ROUTE_PREVIEW_ENABLED};
        int iSerializer = com.mapbox.navigator.R.serializer();
        if (!((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), iSerializer, objArr)).booleanValue()) {
            return false;
        }
        int i2 = write + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        firebaseRemoteConfigImpl2.getClass();
        if (!firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_NAVER_MAPS_ENABLED)) {
            return false;
        }
        int i4 = write + 11;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
