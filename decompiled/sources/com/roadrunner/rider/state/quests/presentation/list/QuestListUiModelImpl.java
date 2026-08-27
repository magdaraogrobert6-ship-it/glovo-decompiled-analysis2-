package com.roadrunner.rider.state.quests.presentation.list;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.rider.state.quests.api.list.QuestListUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.PlatformStringDelegate;
import o.addDateInMilliseconds;
import o.addDuration;
import o.dispatchChildDetached;

/* JADX INFO: loaded from: classes3.dex */
public final class QuestListUiModelImpl implements QuestListUiModel {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final StateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final dispatchChildDetached MediaSessionCompatQueueItem;
    public final addDateInMilliseconds RatingCompat;
    public final BlockRunner RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final PlatformStringDelegate serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 55;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.IconCompatParcelizer;
        int i5 = i3 + 87;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public QuestListUiModelImpl(BlockRunner blockRunner, PlatformStringDelegate platformStringDelegate, addDateInMilliseconds adddateinmilliseconds, ContextScope contextScope, dispatchChildDetached dispatchchilddetached) {
        this.RemoteActionCompatParcelizer = blockRunner;
        this.serializer = platformStringDelegate;
        this.RatingCompat = adddateinmilliseconds;
        this.MediaSessionCompatQueueItem = dispatchchilddetached;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(addDuration.serializer);
        this.write = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NafathModalUiModelImpl$1(this, null, 26), 3);
    }
}
