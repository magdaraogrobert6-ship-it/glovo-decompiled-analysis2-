package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.huawei.riemann.location.common.utils.Constant;
import io.grpc.SynchronizationContext$1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class accessgetNotificationcp implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ int serializer = 0;
    public final /* synthetic */ Parcelable write;

    public accessgetNotificationcp(setViewportBounds setviewportbounds, zzr zzrVar, boolean z, zzah zzahVar) {
        this.write = zzrVar;
        this.read = z;
        this.IconCompatParcelizer = zzahVar;
        Objects.requireNonNull(setviewportbounds);
        this.RemoteActionCompatParcelizer = setviewportbounds;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executorUnconfigurableExecutorService;
        int iIntValue;
        int i;
        if (this.serializer != 0) {
            setViewportBounds setviewportbounds = (setViewportBounds) this.RemoteActionCompatParcelizer;
            isComplete iscomplete = setviewportbounds.write;
            if (iscomplete != null) {
                setviewportbounds.RemoteActionCompatParcelizer(iscomplete, this.read ? null : (zzah) this.IconCompatParcelizer, (zzr) this.write);
                setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                return;
            } else {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Discarding data. Failed to send conditional user property to service");
                return;
            }
        }
        Intent intent = (Intent) this.write;
        Context context = (Context) this.IconCompatParcelizer;
        boolean z = this.read;
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.RemoteActionCompatParcelizer;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = FirebaseInstanceIdReceiver.read(intent2);
            } else if (intent.getExtras() == null) {
                i = Constant.ERROR_UNKNOWN;
            } else {
                CloudMessage cloudMessage = new CloudMessage(intent);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (FirebaseInstanceIdReceiver.class) {
                    SoftReference softReference = FirebaseInstanceIdReceiver.RemoteActionCompatParcelizer;
                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                    if (executorUnconfigurableExecutorService == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new accessgetTvInputHdmi1cp("pscm-ack-executor"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                        FirebaseInstanceIdReceiver.RemoteActionCompatParcelizer = new SoftReference(executorUnconfigurableExecutorService);
                    }
                }
                executorUnconfigurableExecutorService.execute(new SynchronizationContext$1(context, cloudMessage, countDownLatch, 2));
                try {
                    iIntValue = ((Integer) LazyKt__LazyJVMKt.read(new calculateRecommendedTimeoutMillisdefault(context).write(intent))).intValue();
                } catch (InterruptedException | ExecutionException e) {
                    SentryLogcatAdapter.read("FirebaseMessaging", "Failed to send message to service.", e);
                    iIntValue = Constant.ERROR_UNKNOWN;
                }
                try {
                    if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        SentryLogcatAdapter.IconCompatParcelizer("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e2) {
                    SentryLogcatAdapter.IconCompatParcelizer("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                }
                i = iIntValue;
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(i);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    public /* synthetic */ accessgetNotificationcp(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.write = intent;
        this.IconCompatParcelizer = context;
        this.read = z;
        this.RemoteActionCompatParcelizer = pendingResult;
    }
}
