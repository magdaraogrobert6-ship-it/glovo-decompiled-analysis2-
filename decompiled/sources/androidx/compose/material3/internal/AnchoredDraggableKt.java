package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.YieldKt;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getBooleanValue;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnchoredDraggableKt {
    public static final Modifier IconCompatParcelizer(Modifier modifier, AnchoredDraggableState anchoredDraggableState, SelectionHandleIcon selectionHandleIcon, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, selectionHandleIcon));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$restartable(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        getBooleanValue getbooleanvalue;
        if (continuationImpl instanceof getBooleanValue) {
            getbooleanvalue = (getBooleanValue) continuationImpl;
            int i = getbooleanvalue.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                getbooleanvalue.read = i - Integer.MIN_VALUE;
            } else {
                getbooleanvalue = new getBooleanValue(continuationImpl);
            }
        } else {
            getbooleanvalue = new getBooleanValue(continuationImpl);
        }
        Object obj = getbooleanvalue.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getbooleanvalue.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView, 0);
                getbooleanvalue.read = 1;
                if (YieldKt.coroutineScope(anchoredDraggableKt$restartable$2, getbooleanvalue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return createFromParcel.INSTANCE;
    }
}
