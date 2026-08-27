package com.roadrunner.rider.state.onpause.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import o.checkSdkClickResponse;
import o.dispatchChildDetached;
import o.getCieXyz;
import o.getPackageInfo;
import o.removeNodeAtDepth;
import o.subscribeToBannersUpdateslambda2;
import o.vd;

/* JADX INFO: loaded from: classes3.dex */
public final class GetOnPauseUiState {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final vd IconCompatParcelizer;
    public final dispatchChildDetached RemoteActionCompatParcelizer;
    public final checkSdkClickResponse read;
    public final GetRiderStatusImpl serializer;
    public final subscribeToBannersUpdateslambda2 write;

    public GetOnPauseUiState(GetRiderStatusImpl getRiderStatusImpl, checkSdkClickResponse checksdkclickresponse, vd vdVar, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2, dispatchChildDetached dispatchchilddetached) {
        this.serializer = getRiderStatusImpl;
        this.read = checksdkclickresponse;
        this.IconCompatParcelizer = vdVar;
        this.write = subscribetobannersupdateslambda2;
        this.RemoteActionCompatParcelizer = dispatchchilddetached;
    }

    public final Flow RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 29;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read.RemoteActionCompatParcelizer();
            throw null;
        }
        if (!(!this.read.RemoteActionCompatParcelizer()) && this.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write.read(), "ON_DEMAND"}, getCieXyz.write())).booleanValue()) {
                return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(getPackageInfo.RemoteActionCompatParcelizer);
            }
        }
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = new GetMapScope$invoke$$inlined$map$1(this.serializer.IconCompatParcelizer(), this, 8);
        int i3 = MediaMetadataCompat + 93;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getMapScope$invoke$$inlined$map$1;
    }
}
