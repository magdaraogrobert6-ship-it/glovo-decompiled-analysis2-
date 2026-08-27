package com.roadrunner.rider.state.cashblock.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.rider.state.cashblock.api.presentation.CashBlockUiModel;
import com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.PlatformStringDelegate;
import o.dispatchChildDetached;
import o.getInstallSessionBackoffStrategy;

/* JADX INFO: loaded from: classes3.dex */
public final class CashBlockUiModelImpl implements CashBlockUiModel {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final OtpLogger IconCompatParcelizer;
    public final dispatchChildDetached MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final StateFlow RatingCompat;
    public final PlatformStringDelegate RemoteActionCompatParcelizer;
    public final GetCashBlockUiState read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final boolean x_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 11;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 15;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RatingCompat;
        }
        int i3 = 64 / 0;
        return this.RatingCompat;
    }

    public CashBlockUiModelImpl(GetCashBlockUiState getCashBlockUiState, OtpLogger otpLogger, ContextScope contextScope, PlatformStringDelegate platformStringDelegate, dispatchChildDetached dispatchchilddetached) {
        this.read = getCashBlockUiState;
        this.IconCompatParcelizer = otpLogger;
        this.RemoteActionCompatParcelizer = platformStringDelegate;
        this.MediaBrowserCompatMediaItem = dispatchchilddetached;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getInstallSessionBackoffStrategy.IconCompatParcelizer);
        this.serializer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NafathModalUiModelImpl$1(this, null, 14), 3);
    }
}
