package com.google.firebase.inappmessaging.internal;

import com.roadrunner.home.CreateHomeScope;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.util.ConnectConsumer;
import o.assertConsistent;
import o.logTree;

/* JADX INFO: loaded from: classes2.dex */
public final class AnalyticsEventsManager {
    public final logTree read;
    public final FlowablePublish serializer;
    public assertConsistent write;

    public AnalyticsEventsManager(logTree logtree) {
        this.read = logtree;
        CreateHomeScope createHomeScope = new CreateHomeScope(this);
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.BUFFER;
        int i = Flowable.write;
        ObjectHelper.write(backpressureStrategy, "mode is null");
        FlowableCreate flowableCreate = new FlowableCreate(createHomeScope, backpressureStrategy);
        int i2 = Flowable.write;
        ObjectHelper.serializer(i2, "bufferSize");
        FlowablePublish flowablePublishSerializer = FlowablePublish.serializer(flowableCreate, i2);
        this.serializer = flowablePublishSerializer;
        flowablePublishSerializer.serializer(new ConnectConsumer());
    }
}
