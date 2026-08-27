package o;

import io.grpc.LoadBalancer$Helper;
import io.sentry.SentryUUID;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageViewWrappercreateAnimationListener2 extends r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU {
    public final ShortNewsContentCardView read;

    public DefaultInAppMessageViewWrappercreateAnimationListener2(TextAnnouncementContentCardView textAnnouncementContentCardView, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        super(textAnnouncementContentCardView, true, false);
        this.read = LoadBalancer$Helper.createCoroutineUnintercepted(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void K_() {
        try {
            DispatchedContinuationKt.serializer(createFromParcel.INSTANCE, LoadBalancer$Helper.intercepted(this.read));
        } catch (Throwable th) {
            SentryUUID.IconCompatParcelizer(th, this);
            throw null;
        }
    }
}
