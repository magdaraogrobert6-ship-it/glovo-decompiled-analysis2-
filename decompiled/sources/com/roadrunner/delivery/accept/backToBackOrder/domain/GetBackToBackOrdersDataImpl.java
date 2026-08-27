package com.roadrunner.delivery.accept.backToBackOrder.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.bubble.presentation.GetBubbleUiState;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1;
import o.AndroidViewHolder_androidKtNoOpScrollConnection1;
import o.accessrequireViewFactoryHolder;
import o.copyhu1Yfodefault;

/* JADX INFO: loaded from: classes3.dex */
public final class GetBackToBackOrdersDataImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final accessrequireViewFactoryHolder serializer;

    public GetBackToBackOrdersDataImpl(accessrequireViewFactoryHolder accessrequireviewfactoryholder, copyhu1Yfodefault copyhu1yfodefault) {
        this.serializer = accessrequireviewfactoryholder;
    }

    public final CombineKt$zipImpl$$inlined$unsafeFlow$1 write() {
        int i = 2 % 2;
        StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$2 = ((StateProviderImpl) ((AndroidViewHolder_androidKtNoOpScrollConnection1) this.serializer)).MediaSessionCompatQueueItem;
        Object obj = null;
        CombineKt$zipImpl$$inlined$unsafeFlow$1 combineKt$zipImpl$$inlined$unsafeFlow$1 = new CombineKt$zipImpl$$inlined$unsafeFlow$1(new StateProviderImpl$special$$inlined$map$2(stateProviderImpl$special$$inlined$map$2, 11), new StateProviderImpl$special$$inlined$map$2(stateProviderImpl$special$$inlined$map$2, 10), new GetBubbleUiState.AnonymousClass2(this, null, 3));
        int i2 = write + 113;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return combineKt$zipImpl$$inlined$unsafeFlow$1;
        }
        obj.hashCode();
        throw null;
    }
}
