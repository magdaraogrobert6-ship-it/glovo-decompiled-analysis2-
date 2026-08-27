package o;

import com.deliveryhero.perseus.logging.StandardLogger$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeviceInfo {
    private static int IconCompatParcelizer = 1;
    public static final DragAndDropTargetModifierNode RemoteActionCompatParcelizer = new DragAndDropTargetModifierNode(new StandardLogger$$ExternalSyntheticLambda1(20), false, 569349162);
    private static int serializer;

    static {
        int i = IconCompatParcelizer + 63;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
