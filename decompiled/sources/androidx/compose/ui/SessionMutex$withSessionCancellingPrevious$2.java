package androidx.compose.ui;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 $session;
    final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, AtomicReference<SessionMutex.Session<T>> atomicReference, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super SessionMutex$withSessionCancellingPrevious$2> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$sessionInitializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.$arg0 = atomicReference;
        this.$session = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, shortNewsContentCardView);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r7, r6) == r0) goto L24;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L17
            java.lang.Object r0 = r6.L$0
            androidx.compose.ui.SessionMutex$Session r0 = (androidx.compose.ui.SessionMutex.Session) r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)     // Catch: java.lang.Throwable -> L15
            goto L6d
        L15:
            r7 = move-exception
            goto L7f
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r4
        L1d:
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.SessionMutex$Session r1 = (androidx.compose.ui.SessionMutex.Session) r1
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            goto L5b
        L25:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            java.lang.Object r7 = r6.L$0
            o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
            o.TextAnnouncementContentCardView r1 = r7.getCoroutineContext()
            o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 r1 = kotlinx.coroutines.JobKt.IconCompatParcelizer(r1)
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r5 = r6.$sessionInitializer
            java.lang.Object r7 = r5.invoke(r7)
            androidx.compose.ui.SessionMutex$Session r5 = new androidx.compose.ui.SessionMutex$Session
            r5.<init>(r1, r7)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r7 = r6.$arg0
            java.lang.Object r7 = r7.getAndSet(r5)
            androidx.compose.ui.SessionMutex$Session r7 = (androidx.compose.ui.SessionMutex.Session) r7
            if (r7 == 0) goto L5a
            o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 r7 = r7.getJob()
            if (r7 == 0) goto L5a
            r6.L$0 = r5
            r6.label = r3
            java.lang.Object r7 = kotlinx.coroutines.JobKt.cancelAndJoin(r7, r6)
            if (r7 != r0) goto L5a
            goto L6b
        L5a:
            r1 = r5
        L5b:
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r7 = r6.$session     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> L7d
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L7d
            r6.label = r2     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r3, r6)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r0) goto L6c
        L6b:
            return r0
        L6c:
            r0 = r1
        L6d:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r2 = r6.$arg0
        L6f:
            boolean r1 = r2.compareAndSet(r0, r4)
            if (r1 == 0) goto L76
            goto L7c
        L76:
            java.lang.Object r1 = r2.get()
            if (r1 == r0) goto L6f
        L7c:
            return r7
        L7d:
            r7 = move-exception
            r0 = r1
        L7f:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r1 = r6.$arg0
        L81:
            boolean r2 = r1.compareAndSet(r0, r4)
            if (r2 != 0) goto L8e
            java.lang.Object r2 = r1.get()
            if (r2 != r0) goto L8e
            goto L81
        L8e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super R> shortNewsContentCardView) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
