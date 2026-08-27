package com.roadrunner.rider.state.finishedshift.presentation;

import androidx.compose.ui.graphics.Fields;
import com.logistics.rider.glovo.R;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.rider.state.finishedshift.api.presentation.FinishedShiftUiModel;
import com.sentiance.core.model.events.C$b;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.dispatchChildDetached;
import o.r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class FinishedShiftUiModelImpl implements FinishedShiftUiModel {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final C$b IconCompatParcelizer;
    public final StateFlow MediaSessionCompatQueueItem;
    public final StateFlow RemoteActionCompatParcelizer;
    public final dispatchChildDetached read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer;
        }
        int i3 = 88 / 0;
        return this.RemoteActionCompatParcelizer;
    }

    public FinishedShiftUiModelImpl(setTransactionSuccessful settransactionsuccessful, C$b c$b, ContextScope contextScope, dispatchChildDetached dispatchchilddetached) {
        this.IconCompatParcelizer = c$b;
        this.read = dispatchchilddetached;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk(settransactionsuccessful.IconCompatParcelizer(R.string.session_ending_soon_title), settransactionsuccessful.IconCompatParcelizer(R.string.session_ending_soon_description)));
        this.serializer = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow2;
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NafathModalUiModelImpl$1(this, null, 16), 3);
    }
}
