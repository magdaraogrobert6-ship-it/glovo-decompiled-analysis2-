package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class v9 {
    private static int read = 1;
    private static int write;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final verifyAndTrackPlayStorePurchaseI serializer;

    public v9(transferSessionPackageI transfersessionpackagei, verifyAndTrackPlayStorePurchaseI verifyandtrackplaystorepurchasei) {
        verifyandtrackplaystorepurchasei.getClass();
        transfersessionpackagei.getClass();
        this.serializer = verifyandtrackplaystorepurchasei;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }

    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = write + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_FIREBASE_TO_FWF_MIGRATION_ENABLED)) {
            String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
            if (strSerializer == null) {
                return false;
            }
            return firebaseRemoteConfigImpl.IconCompatParcelizer.serializer(updateAdidI.IS_RUSH_BONUS_PHASE_1_ENABLED.getFirebaseFlagName(), strSerializer);
        }
        if (((Gen2FunWithFlagsConfigRepository) this.serializer).serializer(v3.IconCompatParcelizer, displayInAppMessagelambda1.serializer(v7.class)) != v7.TREATMENT) {
            return false;
        }
        int i4 = write + 73;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
