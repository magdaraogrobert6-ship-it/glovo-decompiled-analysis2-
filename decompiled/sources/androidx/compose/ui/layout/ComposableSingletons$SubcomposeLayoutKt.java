package androidx.compose.ui.layout;

import o.DragAndDropTargetModifierNode;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getPostalCode;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$SubcomposeLayoutKt {
    public static final ComposableSingletons$SubcomposeLayoutKt INSTANCE = new ComposableSingletons$SubcomposeLayoutKt();
    private static r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 lambda$641200809 = new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt$lambda$641200809$1
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
    }, false, 641200809);

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getLambda$641200809$ui() {
        return lambda$641200809;
    }
}
