package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class vd {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final transferSessionPackageI read;
    public final verifyAndTrackPlayStorePurchaseI write;

    public vd(transferSessionPackageI transfersessionpackagei, verifyAndTrackPlayStorePurchaseI verifyandtrackplaystorepurchasei) {
        transfersessionpackagei.getClass();
        verifyandtrackplaystorepurchasei.getClass();
        this.read = transfersessionpackagei;
        this.write = verifyandtrackplaystorepurchasei;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0046 A[RETURN] */
    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
            firebaseRemoteConfigImpl.getClass();
            int i3 = 43 / 0;
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SHOW_CITY_BOUNDARIES_ENABLED)) {
                if (((Gen2FunWithFlagsConfigRepository) this.write).serializer(vc.write, displayInAppMessagelambda1.serializer(ve.class)) == ve.TREATMENT) {
                    return true;
                }
            }
        } else {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.read;
            firebaseRemoteConfigImpl2.getClass();
            if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_SHOW_CITY_BOUNDARIES_ENABLED)) {
                if (((Gen2FunWithFlagsConfigRepository) this.write).serializer(vc.write, displayInAppMessagelambda1.serializer(ve.class)) == ve.TREATMENT) {
                    return true;
                }
            }
        }
        int i4 = RemoteActionCompatParcelizer + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return false;
    }
}
