package com.roadrunner.delivery.ontheway.deliverynotes.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesLinkUiModel;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.getQueryContext;
import o.invokeKlQnJC8;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryNotesLinkUiModelImpl implements DeliveryNotesLinkUiModel {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final StateFlow IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final getQueryContext serializer;
    public final StateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 105;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        throw null;
    }

    public DeliveryNotesLinkUiModelImpl(SendTestPushUseCase sendTestPushUseCase, ContextScope contextScope, getQueryContext getquerycontext) {
        this.serializer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(invokeKlQnJC8.read);
        this.read = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.write = mutableStateFlow2;
        this.IconCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(sendTestPushUseCase, this, null, 7), 3);
    }
}
