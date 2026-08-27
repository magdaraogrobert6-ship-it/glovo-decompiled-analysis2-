package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, FwFClientclose11 {
    public FwFClientclose11 IconCompatParcelizer;
    public final FwFClientaddFeatureKeysfeaturesUpdated1 RemoteActionCompatParcelizer;
    public AppendOnlyLinkedArrayList read;
    public boolean serializer;
    public volatile boolean write;

    @Override // o.FwFClientclose11
    public final void cancel() {
        this.IconCompatParcelizer.cancel();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        if (SubscriptionHelper.validate(this.IconCompatParcelizer, fwFClientclose11)) {
            this.IconCompatParcelizer = fwFClientclose11;
            this.RemoteActionCompatParcelizer.onSubscribe(this);
        }
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        this.IconCompatParcelizer.request(j);
    }

    public SerializedSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.RemoteActionCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onError(Throwable th) {
        if (this.write) {
            RxJavaPlugins.IconCompatParcelizer(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.write) {
                if (this.serializer) {
                    this.write = true;
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.read;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.read = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.IconCompatParcelizer[0] = NotificationLite.error(th);
                    return;
                }
                this.write = true;
                this.serializer = true;
                z = false;
            }
            if (z) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.RemoteActionCompatParcelizer.onError(th);
            }
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onComplete() {
        if (this.write) {
            return;
        }
        synchronized (this) {
            if (this.write) {
                return;
            }
            if (!this.serializer) {
                this.write = true;
                this.serializer = true;
                this.RemoteActionCompatParcelizer.onComplete();
            } else {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.read;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.read = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.write(NotificationLite.complete());
            }
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onNext(Object obj) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        if (this.write) {
            return;
        }
        if (obj == null) {
            this.IconCompatParcelizer.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.write) {
                return;
            }
            if (this.serializer) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.read;
                if (appendOnlyLinkedArrayList2 == null) {
                    appendOnlyLinkedArrayList2 = new AppendOnlyLinkedArrayList();
                    this.read = appendOnlyLinkedArrayList2;
                }
                appendOnlyLinkedArrayList2.write(NotificationLite.next(obj));
                return;
            }
            this.serializer = true;
            this.RemoteActionCompatParcelizer.onNext(obj);
            do {
                synchronized (this) {
                    appendOnlyLinkedArrayList = this.read;
                    if (appendOnlyLinkedArrayList == null) {
                        this.serializer = false;
                        return;
                    }
                    this.read = null;
                }
            } while (!appendOnlyLinkedArrayList.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
        }
    }
}
