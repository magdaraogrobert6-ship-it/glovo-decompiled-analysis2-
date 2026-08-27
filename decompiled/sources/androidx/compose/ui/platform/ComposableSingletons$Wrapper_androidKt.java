package androidx.compose.ui.platform;

import o.DragAndDropTargetModifierNode;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getPostalCode;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$Wrapper_androidKt {
    public static final ComposableSingletons$Wrapper_androidKt INSTANCE = new ComposableSingletons$Wrapper_androidKt();

    /* JADX INFO: renamed from: lambda$-1759434350, reason: not valid java name */
    private static r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 f0lambda$1759434350 = new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda$-1759434350$1
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
    }, false, -1759434350);

    /* JADX INFO: renamed from: getLambda$-1759434350$ui, reason: not valid java name */
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 m2709getLambda$1759434350$ui() {
        return f0lambda$1759434350;
    }
}
