package com.roadrunner.location.toggle.presentation.bottomsheet;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.location.toggle.api.bottomsheet.EnableLocationUiModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.WorkManagerImpl;
import o.WorkManagerInitializer;
import o.r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class EnableLocationUiModelImpl implements EnableLocationUiModel {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik MediaBrowserCompatMediaItem;
    public final WorkManagerImpl MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final StateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final WorkManagerInitializer serializer;
    public final WorkerWrapper.Builder write;

    @Override // o.onViewCreated
    public final boolean x_() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 89;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return false;
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 67;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        StateFlow stateFlow = this.RemoteActionCompatParcelizer;
        int i4 = i3 + 7;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return stateFlow;
        }
        obj.hashCode();
        throw null;
    }

    public EnableLocationUiModelImpl(WorkManagerImpl workManagerImpl, WorkerWrapper.Builder builder, r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik r8lambda_dfitvnggdulnvz_azfzdrtp1ik, transferSessionPackageI transfersessionpackagei, WorkManagerInitializer workManagerInitializer, ContextScope contextScope) {
        this.MediaDescriptionCompat = workManagerImpl;
        this.write = builder;
        this.MediaBrowserCompatMediaItem = r8lambda_dfitvnggdulnvz_azfzdrtp1ik;
        this.serializer = workManagerInitializer;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(o.WorkerWrapper.RemoteActionCompatParcelizer);
        this.read = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED)) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, null, 23), 3);
            int i = RatingCompat + 69;
            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = MediaSessionCompatQueueItem + 99;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
