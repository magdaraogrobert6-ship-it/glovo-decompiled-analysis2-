package o;

import androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ObserverModifierNodeKt implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;

    public /* synthetic */ ObserverModifierNodeKt(int i) {
        this.read = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        if (i == 0) {
            List list = (List) obj;
            list.getClass();
            if (list.size() == 1) {
                return new MonotonicFrameClockKt$withFrameMillis$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), 6);
            }
            getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
            throw null;
        }
        if (i == 1) {
            List list2 = (List) obj;
            list2.getClass();
            if (list2.size() == 1) {
                return new MonotonicFrameClockKt$withFrameMillis$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list2.get(0), 7);
            }
            getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list2.size()));
            throw null;
        }
        int i2 = 3;
        int i3 = 2;
        if (i != 2) {
            List list3 = (List) obj;
            list3.getClass();
            if (list3.size() == 3) {
                return new getSoftKeyboardKeyInputOLwlOKwannotations((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list3.get(0), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list3.get(1), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list3.get(2), i2);
            }
            getRectManager.write("Function should have exactly 3 params, but %d were given.", Integer.valueOf(list3.size()));
            throw null;
        }
        List list4 = (List) obj;
        list4.getClass();
        if (list4.size() == 3) {
            return new getSoftKeyboardKeyInputOLwlOKwannotations((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list4.get(0), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list4.get(1), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list4.get(2), i3);
        }
        getRectManager.write("Function should have exactly 3 params, but %d were given.", Integer.valueOf(list4.size()));
        throw null;
    }
}
