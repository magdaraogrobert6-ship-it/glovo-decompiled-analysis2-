package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.io.Serializable;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class ErrorNotification implements Serializable {
        public final Throwable write;

        public final int hashCode() {
            return this.write.hashCode();
        }

        public ErrorNotification(Throwable th) {
            this.write = th;
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.write + "]";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ErrorNotification)) {
                return false;
            }
            Object obj2 = ((ErrorNotification) obj).write;
            Throwable th = this.write;
            if (th != obj2) {
                return th != null && th.equals(obj2);
            }
            return true;
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static final class DisposableNotification implements Serializable {
        public final Disposable RemoteActionCompatParcelizer;

        public DisposableNotification(Disposable disposable) {
            this.RemoteActionCompatParcelizer = disposable;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.RemoteActionCompatParcelizer + "]";
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        public final FwFClientclose11 write;

        public SubscriptionNotification(FwFClientclose11 fwFClientclose11) {
            this.write = fwFClientclose11;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.write + "]";
        }
    }

    public static Object disposable(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Disposable getDisposable(Object obj) {
        return ((DisposableNotification) obj).RemoteActionCompatParcelizer;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).write;
    }

    public static FwFClientclose11 getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).write;
    }

    public static Object subscription(FwFClientclose11 fwFClientclose11) {
        return new SubscriptionNotification(fwFClientclose11);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        if (obj == COMPLETE) {
            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            fwFClientaddFeatureKeysfeaturesUpdated1.onError(((ErrorNotification) obj).write);
            return true;
        }
        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        if (obj == COMPLETE) {
            fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            fwFClientaddFeatureKeysfeaturesUpdated1.onError(((ErrorNotification) obj).write);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(((SubscriptionNotification) obj).write);
            return false;
        }
        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
        return false;
    }

    public static <T> boolean accept(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).write);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).write);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).RemoteActionCompatParcelizer);
            return false;
        }
        observer.onNext(obj);
        return false;
    }
}
