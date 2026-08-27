package androidx.room.coroutines;

import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.BrazeContentCardsManager;
import o.getAlphaimpl;
import o.getInAppMessageAnimationFactory;
import o.getInAppMessageManagerListener;
import o.getQueryParameterslambda2;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.tintxETnrds;

/* JADX INFO: loaded from: classes.dex */
public final class Pool {
    public final BrazeContentCardsManager IconCompatParcelizer;
    public final ReentrantLock MediaDescriptionCompat = new ReentrantLock();
    public int MediaMetadataCompat;
    public boolean RatingCompat;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final ConnectionWithLock[] read;
    public final getInAppMessageManagerListener serializer;
    public final int write;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object acquire(ContinuationImpl continuationImpl) {
        getAlphaimpl getalphaimpl;
        BrazeContentCardsManager brazeContentCardsManager = this.IconCompatParcelizer;
        if (continuationImpl instanceof getAlphaimpl) {
            getalphaimpl = (getAlphaimpl) continuationImpl;
            int i = getalphaimpl.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getalphaimpl.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getalphaimpl = new getAlphaimpl(this, continuationImpl);
            }
        } else {
            getalphaimpl = new getAlphaimpl(this, continuationImpl);
        }
        Object obj = getalphaimpl.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getalphaimpl.IconCompatParcelizer;
        getInAppMessageManagerListener getinappmessagemanagerlistener = this.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getalphaimpl.IconCompatParcelizer = 1;
            if (getinappmessagemanagerlistener.acquire(getalphaimpl) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            ReentrantLock reentrantLock = this.MediaDescriptionCompat;
            reentrantLock.lock();
            try {
                if (this.RatingCompat) {
                    SQLite.read(21, "Connection pool is closed");
                    throw null;
                }
                if (brazeContentCardsManager.isEmpty() && this.MediaMetadataCompat < this.write) {
                    ConnectionWithLock connectionWithLock = new ConnectionWithLock((tintxETnrds) this.RemoteActionCompatParcelizer.invoke());
                    ConnectionWithLock[] connectionWithLockArr = this.read;
                    int i3 = this.MediaMetadataCompat;
                    this.MediaMetadataCompat = i3 + 1;
                    connectionWithLockArr[i3] = connectionWithLock;
                    brazeContentCardsManager.addLast(connectionWithLock);
                }
                ConnectionWithLock connectionWithLock2 = (ConnectionWithLock) brazeContentCardsManager.removeLast();
                reentrantLock.unlock();
                return connectionWithLock2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            getinappmessagemanagerlistener.IconCompatParcelizer();
            throw th2;
        }
    }

    public final void write() {
        ReentrantLock reentrantLock = this.MediaDescriptionCompat;
        reentrantLock.lock();
        try {
            this.RatingCompat = true;
            for (ConnectionWithLock connectionWithLock : this.read) {
                if (connectionWithLock != null) {
                    connectionWithLock.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void write(StringBuilder sb) {
        BrazeContentCardsManager brazeContentCardsManager = this.IconCompatParcelizer;
        ReentrantLock reentrantLock = this.MediaDescriptionCompat;
        reentrantLock.lock();
        try {
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, getQueryParameterslambda2.serializer());
            int i = brazeContentCardsManager.RemoteActionCompatParcelizer;
            for (int i2 = 0; i2 < i; i2++) {
                baseContentCardViewExternalSyntheticLambda0.add(brazeContentCardsManager.get(i2));
            }
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.write + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            getInAppMessageManagerListener getinappmessagemanagerlistener = this.serializer;
            getinappmessagemanagerlistener.getClass();
            sb2.append(Math.max(SemaphoreAndMutexImpl.IconCompatParcelizer.get(getinappmessagemanagerlistener), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + baseContentCardViewExternalSyntheticLambda0Serializer.IconCompatParcelizer() + ")[" + onContentCardDismissed.IconCompatParcelizer(baseContentCardViewExternalSyntheticLambda0Serializer, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            ConnectionWithLock[] connectionWithLockArr = this.read;
            int length = connectionWithLockArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                ConnectionWithLock connectionWithLock = connectionWithLockArr[i4];
                i3++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                sb3.append(connectionWithLock != null ? connectionWithLock.RemoteActionCompatParcelizer.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (connectionWithLock != null) {
                    connectionWithLock.dump(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Pool(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.write = i;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = new ConnectionWithLock[i];
        this.serializer = getInAppMessageAnimationFactory.serializer(i);
        this.IconCompatParcelizer = new BrazeContentCardsManager(i);
    }

    public final void RemoteActionCompatParcelizer(ConnectionWithLock connectionWithLock) {
        connectionWithLock.getClass();
        ReentrantLock reentrantLock = this.MediaDescriptionCompat;
        reentrantLock.lock();
        try {
            this.IconCompatParcelizer.addLast(connectionWithLock);
            reentrantLock.unlock();
            this.serializer.IconCompatParcelizer();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:28:0x006f, B:30:0x0073, B:32:0x0079, B:36:0x0080), top: B:42:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:28:0x006f, B:30:0x0073, B:32:0x0079, B:36:0x0080), top: B:42:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0080 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:28:0x006f, B:30:0x0073, B:32:0x0079, B:36:0x0080), top: B:42:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:24:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x0080
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: acquireWithTimeout-KLykuaI, reason: not valid java name */
    public final java.lang.Object m3952acquireWithTimeoutKLykuaI(long r9, bo.app.b$$ExternalSyntheticLambda0 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof o.getColorSpaceimpl
            if (r0 == 0) goto L13
            r0 = r12
            o.getColorSpaceimpl r0 = (o.getColorSpaceimpl) r0
            int r1 = r0.serializer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.serializer = r1
            goto L18
        L13:
            o.getColorSpaceimpl r0 = new o.getColorSpaceimpl
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.serializer
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L33
            long r9 = r0.IconCompatParcelizer
            o.createInAppMessageEventSubscriber r11 = r0.read
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r2 = r0.write
            r5 = r2
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r5 = (o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r5
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: java.lang.Throwable -> L31
            goto L60
        L31:
            r12 = move-exception
            goto L6a
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r4
        L39:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
        L3c:
            o.createInAppMessageEventSubscriber r12 = new o.createInAppMessageEventSubscriber
            r12.<init>()
            coil3.RealImageLoader$execute$2 r2 = new coil3.RealImageLoader$execute$2     // Catch: java.lang.Throwable -> L65
            r5 = 24
            r2.<init>(r12, r8, r4, r5)     // Catch: java.lang.Throwable -> L65
            r5 = r11
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r5 = (o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r5     // Catch: java.lang.Throwable -> L65
            r0.write = r5     // Catch: java.lang.Throwable -> L65
            r0.read = r12     // Catch: java.lang.Throwable -> L65
            r0.IconCompatParcelizer = r9     // Catch: java.lang.Throwable -> L65
            r0.serializer = r3     // Catch: java.lang.Throwable -> L65
            long r5 = kotlinx.coroutines.DelayKt.serializer(r9)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = kotlinx.coroutines.TimeoutKt.withTimeout(r5, r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r2 = r11
            r11 = r12
        L60:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r4
            goto L6f
        L65:
            r2 = move-exception
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
        L6a:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L6f:
            boolean r5 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L77
            r11.invoke()     // Catch: java.lang.Throwable -> L81
            goto L7e
        L77:
            if (r0 != 0) goto L80
            java.lang.Object r12 = r12.IconCompatParcelizer     // Catch: java.lang.Throwable -> L81
            if (r12 == 0) goto L7e
            return r12
        L7e:
            r0 = r2
            goto L3c
        L80:
            throw r0     // Catch: java.lang.Throwable -> L81
        L81:
            r9 = move-exception
            java.lang.Object r10 = r12.IconCompatParcelizer
            androidx.room.coroutines.ConnectionWithLock r10 = (androidx.room.coroutines.ConnectionWithLock) r10
            if (r10 == 0) goto L8b
            r8.RemoteActionCompatParcelizer(r10)
        L8b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.Pool.m3952acquireWithTimeoutKLykuaI(long, bo.app.b$$ExternalSyntheticLambda0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
