package o;

import io.grpc.LoadBalancer$Helper;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: loaded from: classes4.dex */
public final class canDismiss extends DeferredCoroutine {
    public final ShortNewsContentCardView IconCompatParcelizer;

    public canDismiss(TextAnnouncementContentCardView textAnnouncementContentCardView, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        super(textAnnouncementContentCardView, true, false);
        this.IconCompatParcelizer = LoadBalancer$Helper.createCoroutineUnintercepted(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void K_() {
        try {
            DispatchedContinuationKt.serializer(createFromParcel.INSTANCE, LoadBalancer$Helper.intercepted(this.IconCompatParcelizer));
        } catch (Throwable th) {
            SentryUUID.IconCompatParcelizer(th, this);
            throw null;
        }
    }
}
