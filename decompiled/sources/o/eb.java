package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class eb {
    public final g7 RemoteActionCompatParcelizer;

    public eb(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = new g7(((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("default_map_zoom_level_android"));
    }
}
