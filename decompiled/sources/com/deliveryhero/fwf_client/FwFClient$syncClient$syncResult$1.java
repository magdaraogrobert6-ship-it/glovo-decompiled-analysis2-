package com.deliveryhero.fwf_client;

import coil3.ExtrasKt;
import com.deliveryhero.fwf_client.model.SyncResult;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFClient$syncClient$syncResult$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    int label;
    final /* synthetic */ FwFClient this$0;

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.FwFClient$syncClient$syncResult$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int label;
        final /* synthetic */ FwFClient this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass1(this.this$0, shortNewsContentCardView);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
                goto L41
            L10:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r5)
                r5 = 0
                return r5
            L17:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
                goto L29
            L1b:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
                com.deliveryhero.fwf_client.FwFClient r5 = r4.this$0
                r4.label = r3
                java.lang.Object r5 = com.deliveryhero.fwf_client.FwFClient.access$bootstrapIfNeeded(r5, r4)
                if (r5 != r0) goto L29
                goto L40
            L29:
                com.deliveryhero.fwf_client.FwFClient r5 = r4.this$0
                com.deliveryhero.fwf_logger.ILogger r5 = r5.getLogger$fwf_client_release()
                java.lang.String r1 = "FwFClient"
                java.lang.String r3 = "FwFClient sync started"
                r5.logD(r1, r3)
                com.deliveryhero.fwf_client.FwFClient r5 = r4.this$0
                r4.label = r2
                java.lang.Object r5 = com.deliveryhero.fwf_client.FwFClient.access$updateFeatures(r5, r4)
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                com.deliveryhero.fwf_client.model.SyncResult r5 = (com.deliveryhero.fwf_client.model.SyncResult) r5
                boolean r0 = r5.getDisableUpdates$fwf_client_release()
                if (r0 != 0) goto L4e
                com.deliveryhero.fwf_client.FwFClient r0 = r4.this$0
                com.deliveryhero.fwf_client.FwFClient.access$startUpdater(r0)
            L4e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.fwf_client.FwFClient$syncClient$syncResult$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FwFClient fwFClient, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.this$0 = fwFClient;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new FwFClient$syncClient$syncResult$1(this.this$0, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 1;
        Object objWithContext = BuildersKt.withContext(defaultIoScheduler, anonymousClass1, this);
        return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FwFClient$syncClient$syncResult$1(FwFClient fwFClient, ShortNewsContentCardView<? super FwFClient$syncClient$syncResult$1> shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.this$0 = fwFClient;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        return ((FwFClient$syncClient$syncResult$1) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
