package com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ShortNewsContentCardView;
import o.accessgetLtrcp;
import o.accessgetParagraphcp;
import o.getContents_7Xco;
import o.getLooseusljTpc;
import o.getQueryContext;
import o.toURLSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class TripInformationUiModelImpl implements TripInformationUiModel {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public final getQueryContext IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final accessgetParagraphcp MediaDescriptionCompat;
    public final getContents_7Xco MediaMetadataCompat;
    public final getLooseusljTpc MediaSessionCompatQueueItem;
    public final UnifiedPhoneCallerImpl MediaSessionCompatResultReceiverWrapper;
    public final toURLSpan RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final ContextScope serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 73;
        int i3 = i2 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.read;
        int i5 = i3 + 93;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TripInformationUiModelImpl(getQueryContext getquerycontext, ContextScope contextScope, getContents_7Xco getcontents_7xco, UnifiedPhoneCallerImpl unifiedPhoneCallerImpl, toURLSpan tourlspan, accessgetParagraphcp accessgetparagraphcp, getLooseusljTpc getlooseusljtpc) {
        this.IconCompatParcelizer = getquerycontext;
        this.serializer = contextScope;
        this.MediaMetadataCompat = getcontents_7xco;
        this.MediaSessionCompatResultReceiverWrapper = unifiedPhoneCallerImpl;
        this.RatingCompat = tourlspan;
        this.MediaDescriptionCompat = accessgetparagraphcp;
        this.MediaSessionCompatQueueItem = getlooseusljtpc;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(accessgetLtrcp.RemoteActionCompatParcelizer);
        this.write = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, (ShortNewsContentCardView) null, 13), 3);
    }
}
