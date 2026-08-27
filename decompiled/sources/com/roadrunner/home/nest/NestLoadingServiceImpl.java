package com.roadrunner.home.nest;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ItemTouchHelperAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class NestLoadingServiceImpl {
    public final NestLoadingServiceImpl$special$$inlined$map$1 IconCompatParcelizer;
    public final MutableStateFlow read;

    public NestLoadingServiceImpl() {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(ItemTouchHelperAdapter.serializer);
        this.read = mutableStateFlow;
        this.IconCompatParcelizer = new NestLoadingServiceImpl$special$$inlined$map$1(mutableStateFlow, 0);
    }
}
