package com.roadrunner.delivery.accept.orderitems.presentation;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.orderitems.api.OrderItemsNavigationUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ShortNewsContentCardView;
import o.createGraphemeClusterSegmentFinder;
import o.getContentViewGroupParentLayout;
import o.isHiraganaKatakanaBoundary;
import o.previousStartBoundary;
import o.q4ExternalSyntheticLambda9;

/* JADX INFO: loaded from: classes3.dex */
public final class OrderItemsNavigationUiModelImpl implements OrderItemsNavigationUiModel {
    private static int ParcelableVolumeInfo = 1;
    private static int RatingCompat;
    public final MutableStateFlow IconCompatParcelizer;
    public final q4ExternalSyntheticLambda9 MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final createGraphemeClusterSegmentFinder MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final getContentViewGroupParentLayout RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final Application serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        int i3 = i2 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        StateFlow stateFlow = this.read;
        int i4 = i3 + 85;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stateFlow;
    }

    public OrderItemsNavigationUiModelImpl(isHiraganaKatakanaBoundary ishiraganakatakanaboundary, Application application, q4ExternalSyntheticLambda9 q4externalsyntheticlambda9, createGraphemeClusterSegmentFinder creategraphemeclustersegmentfinder, getContentViewGroupParentLayout getcontentviewgroupparentlayout, boolean z) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = application;
        this.MediaBrowserCompatMediaItem = q4externalsyntheticlambda9;
        this.MediaMetadataCompat = creategraphemeclustersegmentfinder;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        this.MediaDescriptionCompat = z;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.read = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(previousStartBoundary.write);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaSessionCompatQueueItem = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new BridgeManager$trackEvent$2(ishiraganakatakanaboundary, this, (ShortNewsContentCardView) null, 22), 3);
    }
}
