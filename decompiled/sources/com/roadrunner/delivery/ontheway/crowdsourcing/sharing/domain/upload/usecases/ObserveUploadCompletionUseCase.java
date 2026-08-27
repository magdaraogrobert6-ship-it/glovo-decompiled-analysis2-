package com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain.upload.usecases;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkManagerImpl;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.auth.data.SignInDataStore$get$1;
import com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState$invoke$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
import o.ItemTouchHelperAdapter;
import o.ShortNewsContentCardView;
import o.instance_delegatelambda0;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveUploadCompletionUseCase {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final WorkManagerImpl IconCompatParcelizer;

    public ObserveUploadCompletionUseCase(WorkManagerImpl workManagerImpl) {
        workManagerImpl.getClass();
        this.IconCompatParcelizer = workManagerImpl;
    }

    public final FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 read(String str) {
        int i = 2;
        int i2 = 2 % 2;
        str.getClass();
        Flow flowIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer("crowd_sourcing_upload_work_".concat(str));
        int i3 = 3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new SignInDataStore$get$$inlined$map$1(new FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(new onViewAttachedToWindowlambda0(ItemTouchHelperAdapter.serializer, instance_delegatelambda0.write), flowIconCompatParcelizer, new GetCashBlockUiState$invoke$1(i3, i, shortNewsContentCardView))), this, 13)), new SignInDataStore$get$1(i3, i, shortNewsContentCardView));
        int i4 = write + 37;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
    }
}
