package androidx.compose.ui.window;

import o.DragAndDropTargetModifierNode;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getPostalCode;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$AndroidDialog_androidKt {
    public static final ComposableSingletons$AndroidDialog_androidKt INSTANCE = new ComposableSingletons$AndroidDialog_androidKt();
    private static r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 lambda$210148896 = new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1
        public final void invoke(getBirthDateFull getbirthdatefull, int i) {
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(i & 1, (i & 3) != 2)) {
                return;
            }
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
            return createFromParcel.INSTANCE;
        }
    }, false, 210148896);

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getLambda$210148896$ui() {
        return lambda$210148896;
    }
}
