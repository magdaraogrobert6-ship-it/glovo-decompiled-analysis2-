package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKtSimpleLayout11;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ long IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ScrollingLogic read;
    public final /* synthetic */ cancelPendingWebViewPauselambda0 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = scrollingLogic;
        this.IconCompatParcelizer = j;
        this.serializer = cancelpendingwebviewpauselambda0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.read, this.IconCompatParcelizer, this.serializer, shortNewsContentCardView);
        scrollableKt$semanticsScrollBy$2.RemoteActionCompatParcelizer = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableKt$semanticsScrollBy$2) create((SimpleLayoutKtSimpleLayout11) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.write;
        int i2 = 1;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SimpleLayoutKtSimpleLayout11 simpleLayoutKtSimpleLayout11 = (SimpleLayoutKtSimpleLayout11) this.RemoteActionCompatParcelizer;
            long j = this.IconCompatParcelizer;
            ScrollingLogic scrollingLogic = this.read;
            float fM58toFloatk4lQ0M = scrollingLogic.m58toFloatk4lQ0M(j);
            NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0 navHostKt$NavHost$29$1$$ExternalSyntheticLambda0 = new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(this.serializer, scrollingLogic, simpleLayoutKtSimpleLayout11, i2);
            this.write = 1;
            if (SuspendAnimationKt.serializer(0.0f, fM58toFloatk4lQ0M, null, navHostKt$NavHost$29$1$$ExternalSyntheticLambda0, this, 12) == coroutineSingletons) {
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
