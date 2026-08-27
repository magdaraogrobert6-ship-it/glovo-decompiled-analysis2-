package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getDerivedIsAttached implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ RemoteConfigManager read;

    public /* synthetic */ getDerivedIsAttached(RemoteConfigManager remoteConfigManager) {
        this.read = remoteConfigManager;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.read.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.read.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
