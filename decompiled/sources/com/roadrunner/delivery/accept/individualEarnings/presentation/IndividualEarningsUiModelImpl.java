package com.roadrunner.delivery.accept.individualEarnings.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.individualEarnings.api.presentation.IndividualEarningsUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AndroidFont;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactoryDefaultCompanion;
import o.StaticLayoutParams;
import o.accessgetStaticLayoutConstructor;
import o.getContentViewGroupParentLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class IndividualEarningsUiModelImpl implements IndividualEarningsUiModel {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final accessgetStaticLayoutConstructor IconCompatParcelizer;
    public final AndroidFont MediaBrowserCompatMediaItem;
    public final StaticLayoutParams MediaDescriptionCompat;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final StateFlow serializer;
    public final getContentViewGroupParentLayout write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 39;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        StateFlow stateFlow = this.serializer;
        int i4 = i3 + 81;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stateFlow;
    }

    public final StateFlow RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 119;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        StateFlow stateFlow = this.RatingCompat;
        int i4 = i2 + 33;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stateFlow;
    }

    public IndividualEarningsUiModelImpl(getContentViewGroupParentLayout getcontentviewgroupparentlayout, StaticLayoutParams staticLayoutParams, accessgetStaticLayoutConstructor accessgetstaticlayoutconstructor, AndroidFont androidFont) {
        getcontentviewgroupparentlayout.getClass();
        this.write = getcontentviewgroupparentlayout;
        this.MediaDescriptionCompat = staticLayoutParams;
        this.IconCompatParcelizer = accessgetstaticlayoutconstructor;
        this.MediaBrowserCompatMediaItem = androidFont;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(StaticLayoutFactoryDefaultCompanion.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 22), 3);
        this.serializer = mutableStateFlow2;
    }
}
