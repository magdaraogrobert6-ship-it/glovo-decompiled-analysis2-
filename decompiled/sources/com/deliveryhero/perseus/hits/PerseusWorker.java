package com.deliveryhero.perseus.hits;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import com.deliveryhero.perseus.data.remote.api.model.HitsResponse;
import com.deliveryhero.perseus.di.HitsModule;
import com.deliveryhero.perseus.logger.PerseusLogger;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.accesssetRenderEffectjd;
import o.createFromParcel;
import o.getPathFillTypeRgk1Os;
import o.getTrimPathStart;
import o.pauseWebviewIfNecessarylambda10;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: com.deliveryhero.perseus.hits.PerseusWorker$onError$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public Throwable IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public List read;
        public /* synthetic */ Object write;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return PerseusWorker.this.onError(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.perseus.hits.PerseusWorker$triggerJob$1, reason: invalid class name and case insensitive filesystem */
    public final class C01141 extends ContinuationImpl {
        public /* synthetic */ Object serializer;
        public int write;

        public C01141(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            return PerseusWorker.this.triggerJob(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseusWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$onSuccess(PerseusWorker perseusWorker, List list, HitsResponse hitsResponse, ContinuationImpl continuationImpl) {
        getTrimPathStart gettrimpathstart;
        if (continuationImpl instanceof getTrimPathStart) {
            gettrimpathstart = (getTrimPathStart) continuationImpl;
            int i = gettrimpathstart.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                gettrimpathstart.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                gettrimpathstart = new getTrimPathStart(perseusWorker, continuationImpl);
            }
        } else {
            gettrimpathstart = new getTrimPathStart(perseusWorker, continuationImpl);
        }
        Object objPerseusWorkFinishedCallback = gettrimpathstart.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = gettrimpathstart.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusWorkFinishedCallback);
            PerseusLogger.IconCompatParcelizer(getPathFillTypeRgk1Os.RemoteActionCompatParcelizer(), "Send hit to remote: Response " + hitsResponse.getStatus());
            HitsModule hitsModule = HitsModule.RemoteActionCompatParcelizer;
            gettrimpathstart.write = list;
            gettrimpathstart.RemoteActionCompatParcelizer = 1;
            objPerseusWorkFinishedCallback = hitsModule.perseusWorkFinishedCallback(gettrimpathstart);
            if (objPerseusWorkFinishedCallback != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objPerseusWorkFinishedCallback);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = gettrimpathstart.write;
        ExtrasKt.RemoteActionCompatParcelizer(objPerseusWorkFinishedCallback);
        gettrimpathstart.write = null;
        gettrimpathstart.RemoteActionCompatParcelizer = 2;
        return ((PerseusWorkFinishedCallback) objPerseusWorkFinishedCallback).onWorkFinished(list, createfromparcel, gettrimpathstart) == coroutineSingletons ? coroutineSingletons : createfromparcel;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(ShortNewsContentCardView shortNewsContentCardView) {
        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer == null) {
            Context context = this.RemoteActionCompatParcelizer;
            context.getClass();
            pauseWebviewIfNecessarylambda10.IconCompatParcelizer = context;
        }
        DefaultPerseusConfigProvider defaultPerseusConfigProvider = DefaultPerseusConfigProvider.RemoteActionCompatParcelizer;
        return DefaultPerseusConfigProvider.RemoteActionCompatParcelizer() ? triggerJob((ContinuationImpl) shortNewsContentCardView) : new accesssetRenderEffectjd();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0106, code lost:
    
        if (((com.deliveryhero.perseus.hits.PerseusWorkFinishedCallback) r14).onWorkFinished(r12, r13, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onError(java.util.List r12, java.lang.Throwable r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.hits.PerseusWorker.onError(java.util.List, java.lang.Throwable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (onError(o.instance_delegatelambda0.write, r8, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object triggerJob(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.deliveryhero.perseus.hits.PerseusWorker.C01141
            if (r0 == 0) goto L13
            r0 = r8
            com.deliveryhero.perseus.hits.PerseusWorker$triggerJob$1 r0 = (com.deliveryhero.perseus.hits.PerseusWorker.C01141) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.write = r1
            goto L18
        L13:
            com.deliveryhero.perseus.hits.PerseusWorker$triggerJob$1 r0 = new com.deliveryhero.perseus.hits.PerseusWorker$triggerJob$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.write
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L59
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r3
        L31:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)     // Catch: java.lang.Throwable -> L4d
            goto L4a
        L35:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            kotlinx.coroutines.scheduling.DefaultIoScheduler r8 = o.updateRenderPath.MediaMetadataCompat     // Catch: java.lang.Throwable -> L4d
            androidx.datastore.core.SimpleActor$offer$2 r2 = new androidx.datastore.core.SimpleActor$offer$2     // Catch: java.lang.Throwable -> L4d
            r6 = 12
            r2.<init>(r7, r3, r6)     // Catch: java.lang.Throwable -> L4d
            r0.write = r5     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r8 != r1) goto L4a
            goto L58
        L4a:
            o.setCameraDistance r8 = (o.setCameraDistance) r8     // Catch: java.lang.Throwable -> L4d
            return r8
        L4d:
            r8 = move-exception
            r0.write = r4
            o.instance_delegatelambda0 r2 = o.instance_delegatelambda0.write
            java.lang.Object r8 = r7.onError(r2, r8, r0)
            if (r8 != r1) goto L59
        L58:
            return r1
        L59:
            o.setClip r8 = new o.setClip
            r8.<init>()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.hits.PerseusWorker.triggerJob(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
