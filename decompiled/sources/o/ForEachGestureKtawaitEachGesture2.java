package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ForEachGestureKtawaitEachGesture2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ PressGestureScopeImpl read;
    public final /* synthetic */ androidx.compose.ui.layout.Placeable write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKtawaitEachGesture2(androidx.compose.ui.layout.Placeable placeable, PressGestureScopeImpl pressGestureScopeImpl) {
        super(1);
        this.write = placeable;
        this.read = pressGestureScopeImpl;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        ((androidx.compose.ui.layout.Placeable.PlacementScope) obj).place(this.write, 0, 0, ((getContentCaptureSessionui) this.read.serializer).serializer());
        return createFromParcel.INSTANCE;
    }
}
