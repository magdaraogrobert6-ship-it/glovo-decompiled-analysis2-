package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getNoneeUduSuo {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final transferSessionPackageI serializer;

    public getNoneeUduSuo(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.serializer = transfersessionpackagei;
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        String str = firebaseRemoteConfigImpl.read.read();
        if (str != null) {
            return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_HEURISTICS_IMPROVEMENTS_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl);
        }
        int i2 = IconCompatParcelizer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return false;
    }
}
