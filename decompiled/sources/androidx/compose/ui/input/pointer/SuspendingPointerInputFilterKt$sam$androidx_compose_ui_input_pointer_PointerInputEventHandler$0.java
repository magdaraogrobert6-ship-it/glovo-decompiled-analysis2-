package androidx.compose.ui.input.pointer;

import o.ShortNewsContentCardView;
import o.getCieXyz;
import o.isInvalidIndex;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 implements PointerInputEventHandler, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    private final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 function;

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        return this.function;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView shortNewsContentCardView) {
        return this.function.invoke(pointerInputScope, shortNewsContentCardView);
    }

    public SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.function = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
            return false;
        }
        Object[] objArr = {getFunctionDelegate(), ((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
