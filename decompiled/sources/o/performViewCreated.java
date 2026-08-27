package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class performViewCreated {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final transferSessionPackageI IconCompatParcelizer;

    public performViewCreated(transferSessionPackageI transfersessionpackagei) {
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((FirebaseRemoteConfigImpl) this.IconCompatParcelizer).read.read();
            throw null;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.IconCompatParcelizer;
        String str = firebaseRemoteConfigImpl.read.read();
        if (str != null) {
            return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_TURN_BY_TURN_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl);
        }
        int i3 = write + 121;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        return false;
    }
}
