package o;

import com.deliveryhero.perseus.logging.StandardLogger$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class loadReflectionField {
    public static final DragAndDropTargetModifierNode IconCompatParcelizer = new DragAndDropTargetModifierNode(new StandardLogger$$ExternalSyntheticLambda1(10), false, 439206695);
    private static int read = 0;
    private static int write = 1;

    static {
        int i = write + 33;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
