package o;

import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getTimerStart implements SemanticsInfo {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final InitializeAppStartupItemsImpl IconCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaBrowserCompatMediaItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RatingCompat;
    public final GetRiderStatusImpl RemoteActionCompatParcelizer;
    public final qdExternalSyntheticLambda8 read;
    public boolean serializer;
    public final getContentViewGroupParentLayout write;

    public getTimerStart(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, qdExternalSyntheticLambda8 qdexternalsyntheticlambda8, GetRiderStatusImpl getRiderStatusImpl, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, isMainThread ismainthread, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = initializeAppStartupItemsImpl;
        this.read = qdexternalsyntheticlambda8;
        this.RemoteActionCompatParcelizer = getRiderStatusImpl;
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = getcontentviewgroupparentlayout;
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj.hashCode();
            throw null;
        }
        boolean z = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (!z) {
            this.serializer = true;
            BuildersKt.RemoteActionCompatParcelizer(this.write, null, null, new RiderStateConnectivityObserver$init$2(this, null, 0), 3);
            return createfromparcel2;
        }
        int i3 = MediaDescriptionCompat + 77;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 59;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel2;
        }
        obj.hashCode();
        throw null;
    }
}
