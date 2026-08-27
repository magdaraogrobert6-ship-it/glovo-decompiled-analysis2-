package com.roadrunner.delivery.ontheway.address.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.ontheway.address.DestinationAddressUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ShortNewsContentCardView;
import o.gapLength;
import o.getHeadingrAG3T2k;
import o.isStateSaved;
import o.performCreate;
import o.s8ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class DestinationAddressUiModelImpl implements DestinationAddressUiModel {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final isStateSaved IconCompatParcelizer;
    public final performCreate MediaBrowserCompatMediaItem;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final getHeadingrAG3T2k serializer;
    public final StateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 63;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.write;
        int i5 = i3 + 119;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public DestinationAddressUiModelImpl(gapLength gaplength, ContextScope contextScope, isStateSaved isstatesaved, performCreate performcreate, getHeadingrAG3T2k getheadingrag3t2k) {
        this.IconCompatParcelizer = isstatesaved;
        this.MediaBrowserCompatMediaItem = performcreate;
        this.serializer = getheadingrag3t2k;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow;
        this.write = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(s8ExternalSyntheticLambda0.serializer);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new BridgeManager$trackEvent$2(gaplength, this, shortNewsContentCardView, 28), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 2), 3);
    }
}
