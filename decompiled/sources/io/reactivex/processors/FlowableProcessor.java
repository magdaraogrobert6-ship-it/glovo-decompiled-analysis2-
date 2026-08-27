package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FlowableProcessor<T> extends Flowable<T> implements FlowableSubscriber<T> {
    public final FlowableProcessor RemoteActionCompatParcelizer() {
        return this instanceof SerializedProcessor ? this : new SerializedProcessor((UnicastProcessor) this);
    }
}
