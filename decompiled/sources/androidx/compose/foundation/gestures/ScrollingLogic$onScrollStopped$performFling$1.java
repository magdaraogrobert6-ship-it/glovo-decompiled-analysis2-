package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public long IconCompatParcelizer;
    public /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ ScrollingLogic read;
    public int serializer;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.read, shortNewsContentCardView);
        scrollingLogic$onScrollStopped$performFling$1.RemoteActionCompatParcelizer = ((Velocity) obj).m3920unboximpl();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(Velocity.m3902boximpl(((Velocity) obj).m3920unboximpl()), (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM1921dispatchPreFlingQWom1Mo;
        long j;
        Object objM56doFlingAnimationQWom1Mo;
        long j2;
        long j3;
        long jM3920unboximpl;
        Object objM1919dispatchPostFlingRZ2iAVY;
        long j4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.serializer;
        ScrollingLogic scrollingLogic = this.read;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            long j5 = this.RemoteActionCompatParcelizer;
            NestedScrollDispatcher nestedScrollDispatcher = scrollingLogic.read;
            this.RemoteActionCompatParcelizer = j5;
            this.serializer = 1;
            objM1921dispatchPreFlingQWom1Mo = nestedScrollDispatcher.m1921dispatchPreFlingQWom1Mo(j5, this);
            if (objM1921dispatchPreFlingQWom1Mo != coroutineSingletons) {
                j = j5;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM1921dispatchPreFlingQWom1Mo = obj;
        } else {
            if (i == 2) {
                j2 = this.IconCompatParcelizer;
                j3 = this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM56doFlingAnimationQWom1Mo = obj;
                jM3920unboximpl = ((Velocity) objM56doFlingAnimationQWom1Mo).m3920unboximpl();
                NestedScrollDispatcher nestedScrollDispatcher2 = scrollingLogic.read;
                long jM3914minusAH228Gc = Velocity.m3914minusAH228Gc(j2, jM3920unboximpl);
                this.RemoteActionCompatParcelizer = j3;
                this.IconCompatParcelizer = jM3920unboximpl;
                this.serializer = 3;
                objM1919dispatchPostFlingRZ2iAVY = nestedScrollDispatcher2.m1919dispatchPostFlingRZ2iAVY(jM3914minusAH228Gc, jM3920unboximpl, this);
                if (objM1919dispatchPostFlingRZ2iAVY != coroutineSingletons) {
                    j4 = j3;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j6 = this.IconCompatParcelizer;
            j4 = this.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            jM3920unboximpl = j6;
            objM1919dispatchPostFlingRZ2iAVY = obj;
        }
        return Velocity.m3902boximpl(Velocity.m3914minusAH228Gc(j4, Velocity.m3914minusAH228Gc(jM3920unboximpl, ((Velocity) objM1919dispatchPostFlingRZ2iAVY).m3920unboximpl())));
        long jM3914minusAH228Gc2 = Velocity.m3914minusAH228Gc(j, ((Velocity) objM1921dispatchPreFlingQWom1Mo).m3920unboximpl());
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = jM3914minusAH228Gc2;
        this.serializer = 2;
        objM56doFlingAnimationQWom1Mo = scrollingLogic.m56doFlingAnimationQWom1Mo(jM3914minusAH228Gc2, this);
        if (objM56doFlingAnimationQWom1Mo != coroutineSingletons) {
            j2 = jM3914minusAH228Gc2;
            j3 = j;
            jM3920unboximpl = ((Velocity) objM56doFlingAnimationQWom1Mo).m3920unboximpl();
            NestedScrollDispatcher nestedScrollDispatcher3 = scrollingLogic.read;
            long jM3914minusAH228Gc3 = Velocity.m3914minusAH228Gc(j2, jM3920unboximpl);
            this.RemoteActionCompatParcelizer = j3;
            this.IconCompatParcelizer = jM3920unboximpl;
            this.serializer = 3;
            objM1919dispatchPostFlingRZ2iAVY = nestedScrollDispatcher3.m1919dispatchPostFlingRZ2iAVY(jM3914minusAH228Gc3, jM3920unboximpl, this);
            if (objM1919dispatchPostFlingRZ2iAVY != coroutineSingletons) {
                j4 = j3;
                return Velocity.m3902boximpl(Velocity.m3914minusAH228Gc(j4, Velocity.m3914minusAH228Gc(jM3920unboximpl, ((Velocity) objM1919dispatchPostFlingRZ2iAVY).m3920unboximpl())));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = scrollingLogic;
    }
}
