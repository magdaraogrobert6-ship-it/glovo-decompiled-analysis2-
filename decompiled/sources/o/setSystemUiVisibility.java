package o;

import com.roadrunner.freelancing.presentation.map.FreelancingMapLayerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setSystemUiVisibility implements ec {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int ParcelableVolumeInfo = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final CoreComponentFactory MediaDescriptionCompat;
    public final f2ExternalSyntheticLambda4 MediaMetadataCompat;
    public final vg MediaSessionCompatQueueItem;
    public final StateFlow RatingCompat;
    public final getContentViewGroupParentLayout RemoteActionCompatParcelizer;
    public final getRootStableInsets read;
    public final v4 serializer;
    public final getActionList write;

    @Override // o.ec
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.RatingCompat;
        int i5 = i3 + 125;
        ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public setSystemUiVisibility(f2ExternalSyntheticLambda4 f2externalsyntheticlambda4, getRootStableInsets getrootstableinsets, getContentViewGroupParentLayout getcontentviewgroupparentlayout, CoreComponentFactory coreComponentFactory, vg vgVar, v4 v4Var, getActionList getactionlist) {
        getcontentviewgroupparentlayout.getClass();
        this.MediaMetadataCompat = f2externalsyntheticlambda4;
        this.read = getrootstableinsets;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        this.MediaDescriptionCompat = coreComponentFactory;
        this.MediaSessionCompatQueueItem = vgVar;
        this.serializer = v4Var;
        this.write = getactionlist;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new f9(instance_delegatelambda0.write));
        this.IconCompatParcelizer = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new FreelancingMapLayerUiModelImpl$1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new FreelancingMapLayerUiModelImpl$1(this, shortNewsContentCardView, 1), 3);
    }
}
