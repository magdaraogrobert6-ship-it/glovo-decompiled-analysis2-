package androidx.compose.ui.tooling;

import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import o.DragAndDropTargetModifierNode;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getPostalCode;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$ComposeViewAdapter_androidKt {
    public static final ComposableSingletons$ComposeViewAdapter_androidKt INSTANCE = new ComposableSingletons$ComposeViewAdapter_androidKt();

    /* JADX INFO: renamed from: lambda$-1163195098, reason: not valid java name */
    private static r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 f1lambda$1163195098 = new DragAndDropTargetModifierNode(new ScrollState$$ExternalSyntheticLambda3(21), false, -1163195098);
    private static r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 lambda$2086912010 = new DragAndDropTargetModifierNode(new ScrollState$$ExternalSyntheticLambda3(22), false, 2086912010);

    /* JADX INFO: renamed from: getLambda$-1163195098$ui_tooling, reason: not valid java name */
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 m3573getLambda$1163195098$ui_tooling() {
        return f1lambda$1163195098;
    }

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getLambda$2086912010$ui_tooling() {
        return lambda$2086912010;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel lambda_2086912010$lambda$0(getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(i & 1, (i & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel lambda__1163195098$lambda$0(getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(i & 1, (i & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
