package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class DragGestureNode extends Lambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    public static final DragGestureNode RemoteActionCompatParcelizer = new DragGestureNode(4);

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj4).booleanValue();
        obj.getClass();
        obj2.getClass();
        return createFromParcel.INSTANCE;
    }

    public DragGestureNode(int i) {
        super(i);
    }
}
