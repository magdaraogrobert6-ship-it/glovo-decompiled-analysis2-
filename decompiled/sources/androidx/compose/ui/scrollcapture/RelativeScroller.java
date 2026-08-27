package androidx.compose.ui.scrollcapture;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class RelativeScroller {
    private float scrollAmount;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 scrollBy;
    private final int viewportSize;

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeScroller.this.scrollBy(0.0f, this);
        }
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final void reset() {
        this.scrollAmount = 0.0f;
    }

    public final int mapOffsetToViewport(int i) {
        return RangesKt.RemoteActionCompatParcelizer(i - MathKt.write(this.scrollAmount), 0, this.viewportSize);
    }

    public RelativeScroller(int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.viewportSize = i;
        this.scrollBy = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    public final Object scrollTo(float f, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        Object objScrollBy = scrollBy(f - this.scrollAmount, shortNewsContentCardView);
        return objScrollBy == CoroutineSingletons.COROUTINE_SUSPENDED ? objScrollBy : createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object scrollBy(float f, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object objInvoke = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.scrollBy;
            Float f2 = new Float(f);
            anonymousClass1.label = 1;
            objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(f2, anonymousClass1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        }
        this.scrollAmount += ((Number) objInvoke).floatValue();
        return createFromParcel.INSTANCE;
    }

    public final Object scrollRangeToCenter(int i, int i2, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        if (i <= i2) {
            int i3 = i2 - i;
            int i4 = this.viewportSize;
            if (i3 <= i4) {
                float f = i;
                float f2 = this.scrollAmount;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                if (f >= f2 && i2 <= f2 + i4) {
                    return createfromparcel;
                }
                Object objScrollTo = scrollTo(((i3 / 2) + i) - (i4 / 2), shortNewsContentCardView);
                return objScrollTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objScrollTo : createfromparcel;
            }
            DrawableTransformation.write(this.viewportSize, ff$$ExternalSyntheticOutline0.m(i3, "Expected range (", ") to be ≤ viewportSize="));
            return null;
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(i, "Expected min=", i2, " ≤ max="));
        return null;
    }
}
