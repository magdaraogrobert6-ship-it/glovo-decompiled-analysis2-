package com.roadrunner.rider.state.refresh.presentation;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.location.service.LocationServiceLifecycleObserverImpl$onCreate$1$1$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ShortNewsContentCardView;
import o.addI;
import o.displayInAppMessagelambda1;
import o.generateSendingParametersI;
import o.getContentViewGroupParentLayout;
import o.getTimerInterval;
import o.getTryInstallReferrer;
import o.isAllowUrlStrategyFallback;
import o.isBound;
import o.readPackageQueueI;
import o.restoreChildFragmentState;
import o.setOnSessionTrackingSucceededListener;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class StateRefreshFloatingItemUiModelImpl implements generateSendingParametersI {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final restoreChildFragmentState MediaBrowserCompatMediaItem;
    public final addI RatingCompat;
    public final setOnSessionTrackingSucceededListener RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final getContentViewGroupParentLayout serializer;
    public final StateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 111;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.write;
        int i5 = i2 + 57;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public StateRefreshFloatingItemUiModelImpl(addI addi, restoreChildFragmentState restorechildfragmentstate, SaveHeatmapUrlImpl saveHeatmapUrlImpl, StateFlow stateFlow, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getTryInstallReferrer gettryinstallreferrer;
        setOnSessionTrackingSucceededListener setonsessiontrackingsucceededlistener;
        stateFlow.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.RatingCompat = addi;
        this.MediaBrowserCompatMediaItem = restorechildfragmentstate;
        this.serializer = getcontentviewgroupparentlayout;
        isBound isbound = (isBound) saveHeatmapUrlImpl.serializer;
        int i = 2;
        if (((FirebaseRemoteConfigImpl) isbound.RemoteActionCompatParcelizer).IconCompatParcelizer(updateAdidI.IS_KILL_REFRESH_BUTTON_EXPERIMENT_ENABLED)) {
            gettryinstallreferrer = (getTryInstallReferrer) ((Gen2FunWithFlagsConfigRepository) isbound.read).serializer(isAllowUrlStrategyFallback.write, displayInAppMessagelambda1.serializer(getTryInstallReferrer.class));
        } else {
            gettryinstallreferrer = getTryInstallReferrer.NO_POLLING_BUTTON_VISIBLE;
            int i2 = MediaMetadataCompat + 117;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (getTimerInterval.IconCompatParcelizer[gettryinstallreferrer.ordinal()]) {
            case 1:
            case 2:
                setonsessiontrackingsucceededlistener = setOnSessionTrackingSucceededListener.VISIBLE;
                int i5 = MediaDescriptionCompat + 115;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                } else {
                    int i7 = 4 % 2;
                }
                break;
            case 3:
            case 4:
                setonsessiontrackingsucceededlistener = setOnSessionTrackingSucceededListener.PLACEBO;
                break;
            case 5:
            case 6:
                setonsessiontrackingsucceededlistener = setOnSessionTrackingSucceededListener.HIDDEN;
                break;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
        }
        this.RemoteActionCompatParcelizer = setonsessiontrackingsucceededlistener;
        int i8 = readPackageQueueI.RemoteActionCompatParcelizer[setonsessiontrackingsucceededlistener.ordinal()];
        int i9 = 3;
        boolean z = true;
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
            }
            int i10 = MediaDescriptionCompat + 59;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            z = false;
        }
        this.write = StateFlowKt.read(Boolean.valueOf(z));
        Boolean bool = Boolean.FALSE;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(bool);
        this.IconCompatParcelizer = mutableStateFlow;
        this.read = FlowKt.write(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(stateFlow, mutableStateFlow, new LocationServiceLifecycleObserverImpl$onCreate$1$1$1(i9, i, shortNewsContentCardView)), getcontentviewgroupparentlayout, SharingStarted.Companion.read(2), bool);
        int i13 = MediaMetadataCompat + 81;
        MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
