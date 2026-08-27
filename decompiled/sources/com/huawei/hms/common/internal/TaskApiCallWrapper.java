package com.huawei.hms.common.internal;

import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes2.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {
    private final TaskApiCall<? extends AnyClient, TResult> a;
    private final ViewLayerCompanionOutlineProvider1 b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        super(1);
        this.a = taskApiCall;
        this.b = viewLayerCompanionOutlineProvider1;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.a;
    }

    public ViewLayerCompanionOutlineProvider1 getTaskCompletionSource() {
        return this.b;
    }
}
