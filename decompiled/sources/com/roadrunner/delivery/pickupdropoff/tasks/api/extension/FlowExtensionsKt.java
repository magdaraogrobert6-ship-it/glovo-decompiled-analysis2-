package com.roadrunner.delivery.pickupdropoff.tasks.api.extension;

import androidx.compose.ui.graphics.Fields;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FlowExtensionsKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static final FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 write(Flow flow, MutableStateFlow mutableStateFlow, Object obj, String str) {
        int i = 2 % 2;
        mutableStateFlow.getClass();
        Object obj2 = null;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(flow, new FlowExtensionsKt$handleObservingError$1(mutableStateFlow, obj, str, null));
        int i2 = RemoteActionCompatParcelizer + 119;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        }
        obj2.hashCode();
        throw null;
    }
}
