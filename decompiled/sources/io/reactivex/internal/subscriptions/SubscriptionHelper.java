package io.reactivex.internal.subscriptions;

import bo.app.af$$ExternalSyntheticOutline0;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientclose11;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public enum SubscriptionHelper implements FwFClientclose11 {
    CANCELLED;

    @Override // o.FwFClientclose11
    public void cancel() {
    }

    @Override // o.FwFClientclose11
    public void request(long j) {
    }

    public static boolean setOnce(AtomicReference<FwFClientclose11> atomicReference, FwFClientclose11 fwFClientclose11) {
        ObjectHelper.write(fwFClientclose11, "s is null");
        while (!atomicReference.compareAndSet(null, fwFClientclose11)) {
            if (atomicReference.get() != null) {
                fwFClientclose11.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                reportSubscriptionSet();
                return false;
            }
        }
        return true;
    }

    public static boolean cancel(AtomicReference<FwFClientclose11> atomicReference) {
        FwFClientclose11 andSet;
        FwFClientclose11 fwFClientclose11 = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (fwFClientclose11 == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void deferredRequest(AtomicReference<FwFClientclose11> atomicReference, AtomicLong atomicLong, long j) {
        FwFClientclose11 fwFClientclose11 = atomicReference.get();
        if (fwFClientclose11 != null) {
            fwFClientclose11.request(j);
            return;
        }
        if (validate(j)) {
            BackpressureHelper.write(atomicLong, j);
            FwFClientclose11 fwFClientclose12 = atomicReference.get();
            if (fwFClientclose12 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    fwFClientclose12.request(andSet);
                }
            }
        }
    }

    public static boolean replace(AtomicReference<FwFClientclose11> atomicReference, FwFClientclose11 fwFClientclose11) {
        FwFClientclose11 fwFClientclose12;
        do {
            fwFClientclose12 = atomicReference.get();
            if (fwFClientclose12 == CANCELLED) {
                if (fwFClientclose11 == null) {
                    return false;
                }
                fwFClientclose11.cancel();
                return false;
            }
        } while (!SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(atomicReference, fwFClientclose12, fwFClientclose11));
        return true;
    }

    public static void reportMoreProduced(long j) {
        RxJavaPlugins.IconCompatParcelizer(new ProtocolViolationException(af$$ExternalSyntheticOutline0.m(j, "More produced than requested: ")));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.IconCompatParcelizer(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<FwFClientclose11> atomicReference, FwFClientclose11 fwFClientclose11) {
        FwFClientclose11 fwFClientclose12;
        do {
            fwFClientclose12 = atomicReference.get();
            if (fwFClientclose12 == CANCELLED) {
                if (fwFClientclose11 == null) {
                    return false;
                }
                fwFClientclose11.cancel();
                return false;
            }
        } while (!SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(atomicReference, fwFClientclose12, fwFClientclose11));
        if (fwFClientclose12 == null) {
            return true;
        }
        fwFClientclose12.cancel();
        return true;
    }

    public static boolean deferredSetOnce(AtomicReference<FwFClientclose11> atomicReference, AtomicLong atomicLong, FwFClientclose11 fwFClientclose11) {
        if (!setOnce(atomicReference, fwFClientclose11)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        fwFClientclose11.request(andSet);
        return true;
    }

    public static boolean validate(FwFClientclose11 fwFClientclose11, FwFClientclose11 fwFClientclose12) {
        if (fwFClientclose12 == null) {
            RxJavaPlugins.IconCompatParcelizer(new NullPointerException("next is null"));
            return false;
        }
        if (fwFClientclose11 == null) {
            return true;
        }
        fwFClientclose12.cancel();
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.IconCompatParcelizer(new IllegalArgumentException(af$$ExternalSyntheticOutline0.m(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean setOnce(AtomicReference<FwFClientclose11> atomicReference, FwFClientclose11 fwFClientclose11, long j) {
        if (!setOnce(atomicReference, fwFClientclose11)) {
            return false;
        }
        fwFClientclose11.request(j);
        return true;
    }
}
