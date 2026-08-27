package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNode$setScrollSemanticsActions$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ ScrollableNode read;
    public int serializer;
    public final /* synthetic */ float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$1$1(ScrollableNode scrollableNode, float f, float f2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = scrollableNode;
        this.RemoteActionCompatParcelizer = f;
        this.write = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new ScrollableNode$setScrollSemanticsActions$1$1(this.read, this.RemoteActionCompatParcelizer, this.write, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$setScrollSemanticsActions$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.serializer;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ScrollingLogic scrollingLogic = this.read.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(this.RemoteActionCompatParcelizer)) << 32) | (((long) Float.floatToRawIntBits(this.write)) & 4294967295L));
            this.serializer = 1;
            if (ScrollableKt.m53access$semanticsScrollByd4ec7I(scrollingLogic, jM469constructorimpl, this) == coroutineSingletons) {
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
