package com.roadrunner.delivery.accept.earnings.presentation;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.earnings.api.EarningsUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.LayoutCompatHyphenationFrequency;
import o.LayoutCompatLineBreakStyle;
import o.LayoutCompatTextDirection;
import o.ShortNewsContentCardView;
import o.analyzeBidi;
import o.getContentViewGroupParentLayout;
import o.getDownstreamHorizontal;
import o.q4ExternalSyntheticLambda9;

/* JADX INFO: loaded from: classes3.dex */
public final class EarningsUiModelImpl implements EarningsUiModel {
    private static int PlaybackStateCompatCustomAction = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final getContentViewGroupParentLayout MediaMetadataCompat;
    public final q4ExternalSyntheticLambda9 MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final getDownstreamHorizontal MediaSessionCompatToken;
    public final StateFlow ParcelableVolumeInfo;
    public final LayoutCompatLineBreakStyle PlaybackStateCompat;
    public final LayoutCompatTextDirection RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final Application serializer;
    public final analyzeBidi write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 45;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.MediaDescriptionCompat;
        int i5 = i3 + 85;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return stateFlow;
    }

    public EarningsUiModelImpl(LayoutCompatTextDirection layoutCompatTextDirection, getDownstreamHorizontal getdownstreamhorizontal, LayoutCompatLineBreakStyle layoutCompatLineBreakStyle, analyzeBidi analyzebidi, Application application, q4ExternalSyntheticLambda9 q4externalsyntheticlambda9, getContentViewGroupParentLayout getcontentviewgroupparentlayout, boolean z) {
        getcontentviewgroupparentlayout.getClass();
        this.RatingCompat = layoutCompatTextDirection;
        this.MediaSessionCompatToken = getdownstreamhorizontal;
        this.PlaybackStateCompat = layoutCompatLineBreakStyle;
        this.write = analyzebidi;
        this.serializer = application;
        this.MediaSessionCompatQueueItem = q4externalsyntheticlambda9;
        this.MediaMetadataCompat = getcontentviewgroupparentlayout;
        this.MediaBrowserCompatMediaItem = z;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(bool);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(LayoutCompatHyphenationFrequency.RemoteActionCompatParcelizer);
        this.read = mutableStateFlow2;
        this.ParcelableVolumeInfo = mutableStateFlow2;
        MutableStateFlow mutableStateFlow3 = StateFlowKt.read(bool);
        this.IconCompatParcelizer = mutableStateFlow3;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow3;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 19), 3);
    }
}
