package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableKt$NoOpOnDragStarted$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraggableKt$NoOpOnDragStarted$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.read = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = 3;
        if (i == 0) {
            ((Offset) obj2).m487unboximpl();
            new DraggableKt$NoOpOnDragStarted$1(i2, 0, (ShortNewsContentCardView) obj3).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        int i3 = 1;
        if (i == 1) {
            ((Number) obj2).floatValue();
            new DraggableKt$NoOpOnDragStarted$1(i2, i3, (ShortNewsContentCardView) obj3).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        int i4 = 2;
        if (i != 2) {
            ((Number) obj).intValue();
            new DraggableKt$NoOpOnDragStarted$1(i2, i2, (ShortNewsContentCardView) obj3).invokeSuspend(createfromparcel);
            return Boolean.FALSE;
        }
        ((Offset) obj2).m487unboximpl();
        new DraggableKt$NoOpOnDragStarted$1(i2, i4, (ShortNewsContentCardView) obj3).invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        if (i != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return Boolean.FALSE;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return createfromparcel;
    }
}
