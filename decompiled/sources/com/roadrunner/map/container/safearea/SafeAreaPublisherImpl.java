package com.roadrunner.map.container.safearea;

import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.e9;

/* JADX INFO: loaded from: classes3.dex */
public final class SafeAreaPublisherImpl {
    public final FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final e9 serializer;

    public SafeAreaPublisherImpl(e9 e9Var) {
        e9Var.getClass();
        this.serializer = e9Var;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.read = mutableStateFlow;
        this.RemoteActionCompatParcelizer = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new SaveShiftInfo$invoke$2(this, null, 3), FlowKt.write(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(mutableStateFlow), 100L));
    }
}
