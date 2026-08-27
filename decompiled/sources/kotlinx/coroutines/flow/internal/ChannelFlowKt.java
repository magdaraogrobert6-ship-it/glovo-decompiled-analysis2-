package kotlinx.coroutines.flow.internal;

import io.grpc.LoadBalancer$Helper;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class ChannelFlowKt {
    public static final Object withContextUndispatched(TextAnnouncementContentCardView textAnnouncementContentCardView, Object obj, Object obj2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        Object objInvoke;
        Object objSerializer = ThreadContextKt.serializer(textAnnouncementContentCardView, obj2);
        try {
            StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(shortNewsContentCardView, textAnnouncementContentCardView);
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 == null) {
                objInvoke = LoadBalancer$Helper.wrapWithContinuationImpl(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, obj, stackFrameContinuation);
            } else {
                pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
                objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, stackFrameContinuation);
            }
            ThreadContextKt.write(textAnnouncementContentCardView, objSerializer);
            if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                shortNewsContentCardView.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            ThreadContextKt.write(textAnnouncementContentCardView, objSerializer);
            throw th;
        }
    }
}
