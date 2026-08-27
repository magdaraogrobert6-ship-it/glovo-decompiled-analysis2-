package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import o.instance_delegatelambda0;
import o.onItemDismisslambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(instance_delegatelambda0.write);
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";
    public static final long WITH_TIMEOUT_MICRO_DELAY_MILLIS = 8;

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    @onItemDismisslambda0
    public static final /* synthetic */ SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(PointerInputEventHandler pointerInputEventHandler) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, pointerInputEventHandler);
    }

    @onItemDismisslambda0
    public static final Modifier pointerInput(Modifier modifier, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        throw new IllegalStateException(PointerInputModifierNoParamError);
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3, null));
    }
}
