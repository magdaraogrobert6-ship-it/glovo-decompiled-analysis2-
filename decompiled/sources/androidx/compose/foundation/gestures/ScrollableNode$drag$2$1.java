package androidx.compose.foundation.gestures;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKtSimpleLayout11;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.waitForFirstLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNode$drag$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ScrollingLogic read;
    public final /* synthetic */ DragGestureNode$startListeningForEvents$1 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, ScrollingLogic scrollingLogic, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = dragGestureNode$startListeningForEvents$1;
        this.read = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.serializer, this.read, shortNewsContentCardView);
        scrollableNode$drag$2$1.RemoteActionCompatParcelizer = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$drag$2$1) create((SimpleLayoutKtSimpleLayout11) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.write;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            waitForFirstLayout waitforfirstlayout = new waitForFirstLayout((SimpleLayoutKtSimpleLayout11) this.RemoteActionCompatParcelizer, 13, this.read);
            this.write = 1;
            if (this.serializer.invoke(waitforfirstlayout, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
