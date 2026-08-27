package androidx.compose.ui.tooling;

import androidx.compose.material3.TextKt;
import o.DragAndDropTargetModifierNode;
import o.copyejIjP34;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getPostalCode;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$PreviewActivity_androidKt {
    public static final ComposableSingletons$PreviewActivity_androidKt INSTANCE = new ComposableSingletons$PreviewActivity_androidKt();
    private static r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY lambda$558638247 = new DragAndDropTargetModifierNode(new ComposeViewAdapter$$ExternalSyntheticLambda2(5), false, 558638247);

    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY getLambda$558638247$ui_tooling() {
        return lambda$558638247;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel lambda_558638247$lambda$0(copyejIjP34 copyejijp34, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 17) != 16)) {
            TextKt.serializer(null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, getpostalcode, 6, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
