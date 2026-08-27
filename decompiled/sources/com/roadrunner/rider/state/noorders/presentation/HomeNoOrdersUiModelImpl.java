package com.roadrunner.rider.state.noorders.presentation;

import androidx.compose.ui.graphics.Fields;
import com.logistics.rider.glovo.R;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.rider.state.noorders.api.HomeNoOrdersUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.SingleProcessDataStoredata1;
import o.isAdapterPositionOnScreen;
import o.requestAndResolve;
import o.resolveLink;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeNoOrdersUiModelImpl implements HomeNoOrdersUiModel {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final resolveLink MediaDescriptionCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final ContextScope RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final boolean serializer = true;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        StateFlow stateFlow = this.MediaBrowserCompatMediaItem;
        int i4 = i3 + 21;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return stateFlow;
    }

    @Override // o.onViewCreated
    public final boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 51;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.serializer;
        int i5 = i2 + 47;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return z;
    }

    public HomeNoOrdersUiModelImpl(setTransactionSuccessful settransactionsuccessful, resolveLink resolvelink, ContextScope contextScope, SingleProcessDataStoredata1 singleProcessDataStoredata1) {
        this.MediaDescriptionCompat = resolvelink;
        this.RemoteActionCompatParcelizer = contextScope;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new OtpNavigationKt$$ExternalSyntheticLambda4(singleProcessDataStoredata1, 27, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(new requestAndResolve(settransactionsuccessful.IconCompatParcelizer(R.string.searching_for_orders_title)));
        this.read = mutableStateFlow2;
        this.MediaSessionCompatQueueItem = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NafathModalUiModelImpl$1(this, null, 18), 3);
    }
}
