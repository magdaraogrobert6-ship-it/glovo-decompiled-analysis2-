package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.android.play.core.appupdate.zzz;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.util.ConnectConsumer;
import o.forceAccessibilityForTesting;
import o.tagKey;

/* JADX INFO: loaded from: classes4.dex */
public final class ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory implements forceAccessibilityForTesting {
    public final zzz IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory(zzz zzzVar, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = zzzVar;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.RemoteActionCompatParcelizer;
        zzz zzzVar = this.IconCompatParcelizer;
        if (i == 0) {
            return (tagKey) zzzVar.serializer;
        }
        Gson$$ExternalSyntheticBUOutline0 gson$$ExternalSyntheticBUOutline0 = new Gson$$ExternalSyntheticBUOutline0(16, zzzVar);
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.BUFFER;
        int i2 = Flowable.write;
        ObjectHelper.write(backpressureStrategy, "mode is null");
        FlowableCreate flowableCreate = new FlowableCreate(gson$$ExternalSyntheticBUOutline0, backpressureStrategy);
        int i3 = Flowable.write;
        ObjectHelper.serializer(i3, "bufferSize");
        FlowablePublish flowablePublishSerializer = FlowablePublish.serializer(flowableCreate, i3);
        flowablePublishSerializer.serializer(new ConnectConsumer());
        return flowablePublishSerializer;
    }
}
