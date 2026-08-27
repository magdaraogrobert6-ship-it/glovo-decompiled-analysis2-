package com.roadrunner.delivery.ontheway.header.implementation.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.header.api.DestinationHeaderUiModel;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.AndroidStringDelegate_androidKt;
import o.getComposePaint;
import o.getNexteUduSuo;
import o.getQueryContext;
import o.getSpanVerticalAligndo9XGgannotations;
import o.r8lambdaMcHG3qYj2V0v5xX04YffgaUC3R8;
import o.toURLSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class DestinationHeaderUiModelImpl implements DestinationHeaderUiModel {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int ParcelableVolumeInfo = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final UnifiedPhoneCallerImpl MediaDescriptionCompat;
    public final toURLSpan MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final StateFlow RatingCompat;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final MutableStateFlow serializer;
    public final CustomerChatFloatingButtonUiModel write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 105;
        int i3 = i2 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 107;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public DestinationHeaderUiModelImpl(getComposePaint getcomposepaint, getNexteUduSuo getnexteudusuo, ContextScope contextScope, UnifiedPhoneCallerImpl unifiedPhoneCallerImpl, toURLSpan tourlspan, getQueryContext getquerycontext) {
        this.read = contextScope;
        this.MediaDescriptionCompat = unifiedPhoneCallerImpl;
        this.MediaMetadataCompat = tourlspan;
        this.RemoteActionCompatParcelizer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        this.write = getnexteudusuo.RemoteActionCompatParcelizer(contextScope);
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(r8lambdaMcHG3qYj2V0v5xX04YffgaUC3R8.serializer);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(getcomposepaint, this, null, 15), 3);
    }

    public final void RemoteActionCompatParcelizer(getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations) {
        int i = 2 % 2;
        getspanverticalaligndo9xggannotations.getClass();
        this.MediaMetadataCompat.serializer(getspanverticalaligndo9xggannotations);
        this.RemoteActionCompatParcelizer.serializer(AndroidStringDelegate_androidKt.serializer);
        BuildersKt.RemoteActionCompatParcelizer(this.read, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(this, getspanverticalaligndo9xggannotations, null, 16), 3);
        int i2 = MediaBrowserCompatMediaItem + 33;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
