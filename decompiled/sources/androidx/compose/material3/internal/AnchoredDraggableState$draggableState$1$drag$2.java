package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accessgetGreencp;
import o.booleanValue;
import o.createFromParcel;
import o.isInvalidIndex;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1$drag$2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RatingCompat = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ isInvalidIndex serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(accessgetGreencp accessgetgreencp, RealImageLoader.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.IconCompatParcelizer = accessgetgreencp;
        this.serializer = anonymousClass2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = RatingCompat + 121;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        isInvalidIndex isinvalidindex = this.serializer;
        if (i3 == 0) {
            return new AnchoredDraggableState$draggableState$1$drag$2((accessgetGreencp) this.IconCompatParcelizer, (RealImageLoader.AnonymousClass2) isinvalidindex, (ShortNewsContentCardView) obj3).invokeSuspend(createfromparcel2);
        }
        ((Offset) obj2).m487unboximpl();
        AnchoredDraggableState$draggableState$1$drag$2 anchoredDraggableState$draggableState$1$drag$2 = new AnchoredDraggableState$draggableState$1$drag$2((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, (ShortNewsContentCardView) obj3);
        anchoredDraggableState$draggableState$1$drag$2.IconCompatParcelizer = (PressGestureScopeImpl) obj;
        Object objInvokeSuspend = anchoredDraggableState$draggableState$1$drag$2.invokeSuspend(createfromparcel2);
        int i4 = RatingCompat + 121;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        isInvalidIndex isinvalidindex = this.serializer;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                booleanValue booleanvalue = (booleanValue) ((accessgetGreencp) this.IconCompatParcelizer).IconCompatParcelizer;
                this.write = 1;
                return ((RealImageLoader.AnonymousClass2) isinvalidindex).invoke(booleanvalue, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = RatingCompat + 9;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        PressGestureScopeImpl pressGestureScopeImpl = (PressGestureScopeImpl) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.write;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = null;
            this.write = 1;
            if (pressGestureScopeImpl.awaitRelease(this) == coroutineSingletons2) {
                int i7 = RatingCompat + 85;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons2;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null) {
            return createfromparcel;
        }
        int i9 = RatingCompat + 83;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return createfromparcel;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        int i10 = 57 / 0;
        return createfromparcel;
    }
}
