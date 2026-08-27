package o;

import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import io.sentry.CombinedScopeView;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class x5 implements ec {
    private static int MediaSessionCompatToken = 1;
    private static int ParcelableVolumeInfo;
    public final MutableStateFlow IconCompatParcelizer;
    public final s7 MediaBrowserCompatMediaItem;
    public final getSupportedCipherSuites MediaDescriptionCompat;
    public final f2ExternalSyntheticLambda4 MediaMetadataCompat;
    public final MutableStateFlow MediaSessionCompatQueueItem;
    public final vg RatingCompat;
    public final readFileContent RemoteActionCompatParcelizer;
    public final checkSdkClickResponse read;
    public final subscribeToBannersUpdateslambda2 serializer;
    public final getContentViewGroupParentLayout write;

    @Override // o.ec
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 9;
        MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        MutableStateFlow mutableStateFlow = this.MediaSessionCompatQueueItem;
        int i4 = i2 + 81;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return mutableStateFlow;
    }

    public x5(f2ExternalSyntheticLambda4 f2externalsyntheticlambda4, getSupportedCipherSuites getsupportedciphersuites, CombinedScopeView combinedScopeView, getContentViewGroupParentLayout getcontentviewgroupparentlayout, s7 s7Var, vg vgVar, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2, checkSdkClickResponse checksdkclickresponse, readFileContent readfilecontent) {
        f2externalsyntheticlambda4.getClass();
        getsupportedciphersuites.getClass();
        combinedScopeView.getClass();
        getcontentviewgroupparentlayout.getClass();
        s7Var.getClass();
        vgVar.getClass();
        subscribetobannersupdateslambda2.getClass();
        checksdkclickresponse.getClass();
        readfilecontent.getClass();
        this.MediaMetadataCompat = f2externalsyntheticlambda4;
        this.MediaDescriptionCompat = getsupportedciphersuites;
        this.write = getcontentviewgroupparentlayout;
        this.MediaBrowserCompatMediaItem = s7Var;
        this.RatingCompat = vgVar;
        this.serializer = subscribetobannersupdateslambda2;
        this.read = checksdkclickresponse;
        this.RemoteActionCompatParcelizer = readfilecontent;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new f9(instance_delegatelambda0.write));
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new SaveShiftInfo$invoke$2(combinedScopeView, this, shortNewsContentCardView, 5), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, shortNewsContentCardView, 6), 3);
    }
}
