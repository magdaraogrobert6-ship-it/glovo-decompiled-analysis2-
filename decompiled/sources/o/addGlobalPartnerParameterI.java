package o;

import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class addGlobalPartnerParameterI extends applyUnregisterDisplayedMessageResult {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    @Override // o.registerInAppMessageManagerlambda7
    public final Object get() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(((FirebaseRemoteConfigProvider) this.MediaMetadataCompat).IconCompatParcelizer.get());
        int i4 = RemoteActionCompatParcelizer + 5;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lValueOf;
    }

    public addGlobalPartnerParameterI(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
