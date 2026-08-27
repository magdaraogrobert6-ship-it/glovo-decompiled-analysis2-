package com.roadrunner.freelancing.presentation.outsideactivearea;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.freelancing.api.presentation.outsideactivearea.OutsideActiveAreaUiModel;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.CoreComponentFactory;
import o.access500;
import o.areNotificationsEnabled;
import o.vg;

/* JADX INFO: loaded from: classes3.dex */
public final class OutsideActiveAreaUiModelImpl implements OutsideActiveAreaUiModel {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final CoreComponentFactory MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final vg read;
    public final StateFlow serializer;
    public final access500 write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 31;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public OutsideActiveAreaUiModelImpl(access500 access500Var, vg vgVar, CoreComponentFactory coreComponentFactory, ContextScope contextScope) {
        this.write = access500Var;
        this.read = vgVar;
        this.MediaBrowserCompatMediaItem = coreComponentFactory;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(areNotificationsEnabled.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.serializer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 17), 3);
    }
}
