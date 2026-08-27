package o;

import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class drawTextJFhB2K4default {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final DragAndDropTargetModifierNode write = new DragAndDropTargetModifierNode(new ScrollState$$ExternalSyntheticLambda3(27), false, 1280034813);
    public static final DragAndDropTargetModifierNode read = new DragAndDropTargetModifierNode(new ComposeViewAdapter$$ExternalSyntheticLambda2(8), false, -1352076192);

    static {
        int i = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
