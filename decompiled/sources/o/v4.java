package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class v4 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final transferSessionPackageI IconCompatParcelizer;
    public final verifyAndTrackPlayStorePurchaseI read;

    public v4(transferSessionPackageI transfersessionpackagei, verifyAndTrackPlayStorePurchaseI verifyandtrackplaystorepurchasei) {
        transfersessionpackagei.getClass();
        verifyandtrackplaystorepurchasei.getClass();
        this.IconCompatParcelizer = transfersessionpackagei;
        this.read = verifyandtrackplaystorepurchasei;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.IconCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_INFRA_PAYMENTS_ON_MAP_ENABLED)) {
            if (((Gen2FunWithFlagsConfigRepository) this.read).serializer(v6.RemoteActionCompatParcelizer, displayInAppMessagelambda1.serializer(v5.class)) == v5.TREATMENT) {
                int i4 = write + 33;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return true;
            }
        } else {
            int i6 = write + 55;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = write + 9;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
