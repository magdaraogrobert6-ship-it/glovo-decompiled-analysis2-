package io.reactivex.processors;

import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
final class SerializedProcessor<T> extends FlowableProcessor<T> {
    public boolean IconCompatParcelizer;
    public final UnicastProcessor RemoteActionCompatParcelizer;
    public volatile boolean read;
    public AppendOnlyLinkedArrayList serializer;

    public final void serializer() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.serializer;
                if (appendOnlyLinkedArrayList == null) {
                    this.IconCompatParcelizer = false;
                    return;
                }
                this.serializer = null;
            }
            appendOnlyLinkedArrayList.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.RemoteActionCompatParcelizer.subscribe(fwFClientaddFeatureKeysfeaturesUpdated1);
    }

    public SerializedProcessor(UnicastProcessor unicastProcessor) {
        this.RemoteActionCompatParcelizer = unicastProcessor;
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onError(Throwable th) {
        if (this.read) {
            RxJavaPlugins.IconCompatParcelizer(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.read) {
                this.read = true;
                if (this.IconCompatParcelizer) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.serializer;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.serializer = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.IconCompatParcelizer[0] = NotificationLite.error(th);
                    return;
                }
                this.IconCompatParcelizer = true;
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
        if (this.read) {
            return;
        }
        synchronized (this) {
            if (this.read) {
                return;
            }
            this.read = true;
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                this.RemoteActionCompatParcelizer.onComplete();
                return;
            }
            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.serializer;
            if (appendOnlyLinkedArrayList == null) {
                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                this.serializer = appendOnlyLinkedArrayList;
            }
            appendOnlyLinkedArrayList.write(NotificationLite.complete());
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onNext(Object obj) {
        if (this.read) {
            return;
        }
        synchronized (this) {
            if (this.read) {
                return;
            }
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                this.RemoteActionCompatParcelizer.onNext(obj);
                serializer();
            } else {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.serializer;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.serializer = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.write(NotificationLite.next(obj));
            }
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        if (!this.read) {
            synchronized (this) {
                boolean z = true;
                if (!this.read) {
                    if (this.IconCompatParcelizer) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.serializer;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.serializer = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.write(NotificationLite.subscription(fwFClientclose11));
                        return;
                    }
                    this.IconCompatParcelizer = true;
                    z = false;
                }
                if (!z) {
                    this.RemoteActionCompatParcelizer.onSubscribe(fwFClientclose11);
                    serializer();
                    return;
                }
            }
        }
        fwFClientclose11.cancel();
    }
}
