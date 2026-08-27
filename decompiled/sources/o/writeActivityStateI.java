package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class writeActivityStateI implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ updateAdidI RemoteActionCompatParcelizer;
    public final /* synthetic */ FirebaseRemoteConfigImpl read;
    public final /* synthetic */ int write;

    public /* synthetic */ writeActivityStateI(FirebaseRemoteConfigImpl firebaseRemoteConfigImpl, updateAdidI updateadidi, String str, int i) {
        this.write = i;
        this.read = firebaseRemoteConfigImpl;
        this.RemoteActionCompatParcelizer = updateadidi;
        this.IconCompatParcelizer = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        String str = this.IconCompatParcelizer;
        updateAdidI updateadidi = this.RemoteActionCompatParcelizer;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = this.read;
        if (i4 != 0) {
            Object[] objArr = {firebaseRemoteConfigImpl, firebaseRemoteConfigImpl.IconCompatParcelizer.IconCompatParcelizer(updateadidi.getFirebaseFlagName(), str)};
            int iSerializer = com.mapbox.navigator.R.serializer();
            zBooleanValue = ((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(28645399, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -28645399, com.mapbox.navigator.R.serializer(), iSerializer, objArr)).booleanValue();
        } else {
            boolean zSerializer = firebaseRemoteConfigImpl.IconCompatParcelizer.serializer(updateadidi.getFirebaseFlagName(), str);
            int i5 = MediaBrowserCompatMediaItem + 43;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            zBooleanValue = zSerializer;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
