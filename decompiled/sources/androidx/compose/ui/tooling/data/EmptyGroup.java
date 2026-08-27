package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes.dex */
@UiToolingDataApi
final class EmptyGroup extends Group {
    public static final EmptyGroup INSTANCE = new EmptyGroup();

    /* JADX WARN: Illegal instructions before constructor call */
    private EmptyGroup() {
        IntRect emptyBox = SlotTreeKt.getEmptyBox();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        super(null, null, null, null, emptyBox, instance_delegatelambda0Var, instance_delegatelambda0Var, false, null);
    }
}
