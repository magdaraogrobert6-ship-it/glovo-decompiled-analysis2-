package androidx.work.impl;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.ShortNewsContentCardView;
import o.accessgetF16cp;
import o.createFromParcel;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.setRotationX;

/* JADX INFO: loaded from: classes.dex */
public final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    public /* synthetic */ Throwable IconCompatParcelizer;
    public int serializer;
    public /* synthetic */ long write;

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 = new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(4, (ShortNewsContentCardView) obj4);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.IconCompatParcelizer = (Throwable) obj2;
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.write = jLongValue;
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.serializer;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Throwable th = this.IconCompatParcelizer;
            long j = this.write;
            setRotationX.read().IconCompatParcelizer(accessgetF16cp.write, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, accessgetF16cp.RemoteActionCompatParcelizer);
            this.serializer = 1;
            if (DelayKt.delay(jMin, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return Boolean.TRUE;
    }

    public UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
    }
}
