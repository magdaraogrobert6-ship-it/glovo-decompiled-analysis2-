package com.roadrunner.delivery.accept.deliverydetails.presentation;

import androidx.compose.ui.graphics.Fields;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.deliverydetails.api.DeliveryDetailsUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AndroidFont;
import o.CanvasCompatQ;
import o.ShortNewsContentCardView;
import o.getContentViewGroupParentLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryDetailsUiModelImpl implements DeliveryDetailsUiModel {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaDescriptionCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout read;
    public final AndroidFont serializer;
    public final StateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 91;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.write;
        int i5 = i2 + 35;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public DeliveryDetailsUiModelImpl(AndroidFont androidFont, getContentViewGroupParentLayout getcontentviewgroupparentlayout, n0 n0Var) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = androidFont;
        this.read = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.write = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(CanvasCompatQ.read);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 18), 3);
    }
}
