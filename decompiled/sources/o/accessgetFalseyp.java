package o;

import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.location.core.domain.ObserveDistanceToLocationUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetFalseyp implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final accessrequireViewFactoryHolder IconCompatParcelizer;
    public final ObserveDistanceToLocationUseCaseImpl RemoteActionCompatParcelizer;
    public final getActionViewIntentlambda0 read;
    public final transferSessionPackageI serializer;
    public final r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU write;

    public accessgetFalseyp(accessrequireViewFactoryHolder accessrequireviewfactoryholder, r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU r8lambdalvqgmqhtfjmewpae6dqnfdblu, getActionViewIntentlambda0 getactionviewintentlambda0, ObserveDistanceToLocationUseCaseImpl observeDistanceToLocationUseCaseImpl, transferSessionPackageI transfersessionpackagei) {
        accessrequireviewfactoryholder.getClass();
        r8lambdalvqgmqhtfjmewpae6dqnfdblu.getClass();
        getactionviewintentlambda0.getClass();
        observeDistanceToLocationUseCaseImpl.getClass();
        transfersessionpackagei.getClass();
        this.IconCompatParcelizer = accessrequireviewfactoryholder;
        this.write = r8lambdalvqgmqhtfjmewpae6dqnfdblu;
        this.read = getactionviewintentlambda0;
        this.RemoteActionCompatParcelizer = observeDistanceToLocationUseCaseImpl;
        this.serializer = transfersessionpackagei;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 59;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_NEAR_DESTINATION_OBSERVER_ENABLED)) {
            ShortNewsContentCardView shortNewsContentCardView = null;
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(accessisrendernodecompatiblecp, this, shortNewsContentCardView, 19), 3);
            int i4 = MediaMetadataCompat + 103;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
    }
}
