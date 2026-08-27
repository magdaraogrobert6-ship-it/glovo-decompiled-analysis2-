package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdasendReftagReferrer17 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final transferSessionPackageI IconCompatParcelizer;

    public lambdasendReftagReferrer17(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    public final lambdasetExternalDeviceIdInDelay51 write() {
        int i = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.IconCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.REALTIME_CONNECTION_ENABLED);
        String str = firebaseRemoteConfigImpl.IconCompatParcelizer.read("realtime_connection_url");
        firebaseRemoteConfigImpl.getClass();
        lambdasetExternalDeviceIdInDelay51 lambdasetexternaldeviceidindelay51 = new lambdasetExternalDeviceIdInDelay51(str, zIconCompatParcelizer, firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.REALTIME_CONNECTION_RECONNECT_TOKEN_EXPIRATION_ANDROID_ENABLED), firebaseRemoteConfigImpl.IconCompatParcelizer.IconCompatParcelizer(updateAdidI.REALTIME_CONNECTION_DEBUG_LOGS_ENABLED.getFirebaseFlagName()));
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return lambdasetexternaldeviceidindelay51;
    }
}
