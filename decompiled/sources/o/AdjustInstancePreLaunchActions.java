package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustInstancePreLaunchActions {
    public final v9 IconCompatParcelizer;
    public final boolean MediaMetadataCompat;
    public final AdjustLinkResolution MediaSessionCompatQueueItem;
    public final setTransactionSuccessful RemoteActionCompatParcelizer;
    public final va read;
    public final setLastHorizontalStyle serializer;
    public final xa write;

    public AdjustInstancePreLaunchActions(AdjustLinkResolution adjustLinkResolution, setTransactionSuccessful settransactionsuccessful, va vaVar, v9 v9Var, xa xaVar, setLastHorizontalStyle setlasthorizontalstyle, createQuery createquery) {
        this.MediaSessionCompatQueueItem = adjustLinkResolution;
        this.RemoteActionCompatParcelizer = settransactionsuccessful;
        this.read = vaVar;
        this.IconCompatParcelizer = v9Var;
        this.write = xaVar;
        this.serializer = setlasthorizontalstyle;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) createquery.write;
        firebaseRemoteConfigImpl.getClass();
        this.MediaMetadataCompat = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SESSION_LOG_FOR_AR_ENABLED);
    }
}
