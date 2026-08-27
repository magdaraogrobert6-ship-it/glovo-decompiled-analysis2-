package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.ForegroundNotifier;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.util.ConnectConsumer;
import o.forceAccessibilityForTesting;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM;

/* JADX INFO: loaded from: classes4.dex */
public final class ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory implements forceAccessibilityForTesting {
    public final /* synthetic */ int read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;

    public /* synthetic */ ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory(Object obj, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.read = i;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.serializer;
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? new r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM((Application) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write(), "rate_limit_store_file") : new r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM((Application) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write(), "fiam_impressions_store_file");
            }
            return new r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM((Application) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write(), "fiam_eligible_campaigns_cache_file");
        }
        Application application = (Application) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        ForegroundNotifier foregroundNotifier = new ForegroundNotifier();
        Flowable flowableSerializer = foregroundNotifier.RemoteActionCompatParcelizer.serializer(BackpressureStrategy.BUFFER);
        int i2 = Flowable.write;
        ObjectHelper.serializer(i2, "bufferSize");
        FlowablePublish flowablePublishSerializer = FlowablePublish.serializer(flowableSerializer, i2);
        flowablePublishSerializer.serializer(new ConnectConsumer());
        application.registerActivityLifecycleCallbacks(foregroundNotifier);
        return flowablePublishSerializer;
    }
}
