package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class va {
    private static int serializer = 1;
    private static int write;
    public final verifyAndTrackPlayStorePurchaseI RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;

    public va(transferSessionPackageI transfersessionpackagei, verifyAndTrackPlayStorePurchaseI verifyandtrackplaystorepurchasei) {
        transfersessionpackagei.getClass();
        verifyandtrackplaystorepurchasei.getClass();
        this.read = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = verifyandtrackplaystorepurchasei;
    }

    public final boolean read() {
        int i = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_FIREBASE_TO_FWF_MIGRATION_ENABLED)) {
            firebaseRemoteConfigImpl.getClass();
            return firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SESSIONS_ON_MAP_PHASE_1_ENABLED);
        }
        int i2 = serializer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((Gen2FunWithFlagsConfigRepository) this.RemoteActionCompatParcelizer).serializer(v8.write, displayInAppMessagelambda1.serializer(vb.class));
            vb vbVar = vb.TREATMENT;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (((Gen2FunWithFlagsConfigRepository) this.RemoteActionCompatParcelizer).serializer(v8.write, displayInAppMessagelambda1.serializer(vb.class)) == vb.TREATMENT) {
            int i3 = write + 119;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = serializer + 9;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
