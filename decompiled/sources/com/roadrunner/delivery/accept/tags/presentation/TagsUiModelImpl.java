package com.roadrunner.delivery.accept.tags.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.tags.api.TagsUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AndroidFont;
import o.ShortNewsContentCardView;
import o.getContentViewGroupParentLayout;
import o.getFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class TagsUiModelImpl implements TagsUiModel {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final StateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final AndroidFont serializer;
    public final getContentViewGroupParentLayout write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 51;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 3;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return stateFlow;
    }

    public final StateFlow write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 1;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 39;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public TagsUiModelImpl(AndroidFont androidFont, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.write = getcontentviewgroupparentlayout;
        this.serializer = androidFont;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getFileDescriptor.read);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow2;
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 29), 3);
    }
}
