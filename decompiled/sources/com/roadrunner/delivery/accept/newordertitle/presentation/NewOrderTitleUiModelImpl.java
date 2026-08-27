package com.roadrunner.delivery.accept.newordertitle.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.newordertitle.api.NewOrderTitleUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AndroidFont;
import o.ShortNewsContentCardView;
import o.getContentViewGroupParentLayout;
import o.getSharedTextAndroidCanvas;

/* JADX INFO: loaded from: classes3.dex */
public final class NewOrderTitleUiModelImpl implements NewOrderTitleUiModel {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final StateFlow MediaDescriptionCompat;
    public final StateFlow RemoteActionCompatParcelizer;
    public final AndroidFont read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        StateFlow stateFlow = this.RemoteActionCompatParcelizer;
        int i4 = i3 + 29;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stateFlow;
    }

    public NewOrderTitleUiModelImpl(AndroidFont androidFont, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.read = androidFont;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(getSharedTextAndroidCanvas.RemoteActionCompatParcelizer);
        this.write = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 26), 3);
    }
}
