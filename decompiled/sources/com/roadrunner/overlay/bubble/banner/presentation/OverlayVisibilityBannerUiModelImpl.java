package com.roadrunner.overlay.bubble.banner.presentation;

import androidx.compose.ui.graphics.Fields;
import com.logistics.rider.glovo.R;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.overlay.bubble.banner.OverlayVisibilityBannerUiModel;
import com.sentiance.core.model.events.C$b;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.AsyncImagePreviewHandlerCompanionDefault1;
import o.BrazeExternalSyntheticLambda5;
import o.CrossfadePainter;
import o.isOpenInternalroom_runtime;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class OverlayVisibilityBannerUiModelImpl implements OverlayVisibilityBannerUiModel {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final ContextScope IconCompatParcelizer;
    public final CrossfadePainter MediaBrowserCompatMediaItem;
    public final C$b MediaDescriptionCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final SharedFlowImpl RatingCompat;
    public final StateFlow RemoteActionCompatParcelizer;
    public final isOpenInternalroom_runtime read;
    public final BrazeExternalSyntheticLambda5 serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 7;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        if (i2 % 2 == 0) {
            stateFlow = this.RemoteActionCompatParcelizer;
            int i4 = 49 / 0;
        } else {
            stateFlow = this.RemoteActionCompatParcelizer;
        }
        int i5 = i3 + 91;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow write() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 27;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            stateFlow = this.MediaSessionCompatQueueItem;
            int i4 = 68 / 0;
        } else {
            stateFlow = this.MediaSessionCompatQueueItem;
        }
        int i5 = i2 + 117;
        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public OverlayVisibilityBannerUiModelImpl(BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5, ContextScope contextScope, C$b c$b, CrossfadePainter crossfadePainter, isOpenInternalroom_runtime isopeninternalroom_runtime, setTransactionSuccessful settransactionsuccessful) {
        brazeExternalSyntheticLambda5.getClass();
        c$b.getClass();
        crossfadePainter.getClass();
        isopeninternalroom_runtime.getClass();
        settransactionsuccessful.getClass();
        this.serializer = brazeExternalSyntheticLambda5;
        this.IconCompatParcelizer = contextScope;
        this.MediaDescriptionCompat = c$b;
        this.MediaBrowserCompatMediaItem = crossfadePainter;
        this.read = isopeninternalroom_runtime;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.RatingCompat = SharedFlowKt.RemoteActionCompatParcelizer(1, 0, null, 6);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NafathModalUiModelImpl$1(this, null, 5), 3);
        this.MediaSessionCompatQueueItem = StateFlowKt.read(new AsyncImagePreviewHandlerCompanionDefault1(settransactionsuccessful.IconCompatParcelizer(R.string.overlay_visibility_banner_title), settransactionsuccessful.IconCompatParcelizer(R.string.overlay_visibility_banner_description), settransactionsuccessful.IconCompatParcelizer(R.string.overlay_visibility_banner_go_to_settings)));
    }
}
