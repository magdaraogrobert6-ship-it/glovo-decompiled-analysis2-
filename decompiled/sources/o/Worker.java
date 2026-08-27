package o;

import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class Worker implements addRearDisplayStatusListener {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final List IconCompatParcelizer;
    public final onViewDetachedFromWindowlambda1 MediaSessionCompatQueueItem;
    public final r8lambdadiHCtAejt895m8HzbAibmUGZMKo RemoteActionCompatParcelizer;
    public final List read;
    public final getTouchaOaMEAU serializer;
    public final transferSessionPackageI write;

    public Worker(GetRiderStatusImpl getRiderStatusImpl, r8lambdadiHCtAejt895m8HzbAibmUGZMKo r8lambdadihctaejt895m8hzbaibmugzmko, getTouchaOaMEAU gettouchaoameau, transferSessionPackageI transfersessionpackagei) {
        r8lambdadihctaejt895m8hzbaibmugzmko.getClass();
        gettouchaoameau.getClass();
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = r8lambdadihctaejt895m8hzbaibmugzmko;
        this.serializer = gettouchaoameau;
        this.write = transfersessionpackagei;
        this.read = androidx.sqlite.SQLite.read(isTrackingEnabled.AVAILABLE, isTrackingEnabled.ENDING, isTrackingEnabled.READY, isTrackingEnabled.WORKING);
        this.IconCompatParcelizer = androidx.sqlite.SQLite.read(isTrackingEnabled.ON_BREAK, isTrackingEnabled.ON_PAID_BREAK);
        this.MediaSessionCompatQueueItem = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new SealedClassSerializer$$ExternalSyntheticLambda0(getRiderStatusImpl, 2, this));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new HeatmapMapLayerUiModelImpl$1(accessisrendernodecompatiblecp, this, null, 27), 3);
        int i2 = MediaDescriptionCompat + 63;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
