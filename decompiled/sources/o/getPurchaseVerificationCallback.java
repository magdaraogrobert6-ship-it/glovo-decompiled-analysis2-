package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getPurchaseVerificationCallback {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final getFirstErrorCode RemoteActionCompatParcelizer;
    public final transferSessionPackageI serializer;
    public final r8lambdaPnQjar0gr6y5YvWKJl7PF6WWjMM write;

    public getPurchaseVerificationCallback(transferSessionPackageI transfersessionpackagei, r8lambdaPnQjar0gr6y5YvWKJl7PF6WWjMM r8lambdapnqjar0gr6y5yvwkjl7pf6wwjmm, getFirstErrorCode getfirsterrorcode) {
        transfersessionpackagei.getClass();
        r8lambdapnqjar0gr6y5yvwkjl7pf6wwjmm.getClass();
        getfirsterrorcode.getClass();
        this.serializer = transfersessionpackagei;
        this.write = r8lambdapnqjar0gr6y5yvwkjl7pf6wwjmm;
        this.RemoteActionCompatParcelizer = getfirsterrorcode;
    }

    public final boolean read() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = read + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        firebaseRemoteConfigImpl.getClass();
        boolean zRemoteActionCompatParcelizer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_RIDER_SAFETY_PHASE2_ENABLED);
        firebaseRemoteConfigImpl.getClass();
        boolean zRemoteActionCompatParcelizer2 = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_SAFETY_OPTION_AVAILABLE_IN_SETTINGS);
        r8lambdaPnQjar0gr6y5YvWKJl7PF6WWjMM r8lambdapnqjar0gr6y5yvwkjl7pf6wwjmm = this.write;
        Boolean boolIconCompatParcelizer = r8lambdapnqjar0gr6y5yvwkjl7pf6wwjmm.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdapnqjar0gr6y5yvwkjl7pf6wwjmm.IconCompatParcelizer.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_safety_tracking));
        if (zRemoteActionCompatParcelizer) {
            if (!zRemoteActionCompatParcelizer2) {
                int i4 = IconCompatParcelizer + 57;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else if (boolIconCompatParcelizer != null) {
                zBooleanValue = boolIconCompatParcelizer.booleanValue();
            }
            zBooleanValue = true;
        } else {
            zBooleanValue = false;
        }
        getFirstErrorCode getfirsterrorcode = this.RemoteActionCompatParcelizer;
        getfirsterrorcode.getClass();
        getfirsterrorcode.RemoteActionCompatParcelizer("rider_safety_safety_detections_enabled", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(com.braze.models.FeatureFlag.ENABLED, String.valueOf(zBooleanValue)), new onViewAttachedToWindowlambda0("safety_feature_enabled", String.valueOf(zRemoteActionCompatParcelizer)), new onViewAttachedToWindowlambda0("safety_option_available_in_settings", String.valueOf(zRemoteActionCompatParcelizer2)), new onViewAttachedToWindowlambda0("safety_tracking_preference_enabled", String.valueOf(boolIconCompatParcelizer))));
        return zBooleanValue;
    }
}
