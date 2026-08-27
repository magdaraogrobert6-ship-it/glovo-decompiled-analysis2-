package o;

import androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public abstract class getCenterStart {
    public static final DragAndDropTargetModifierNode IconCompatParcelizer = new DragAndDropTargetModifierNode(new ComposeViewAdapter$$ExternalSyntheticLambda2(2), false, 759698998);

    public static final int serializer(int i, String str) {
        while (i > 0) {
            if (str.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final int IconCompatParcelizer(int i, String str) {
        int length = str.length();
        while (i < length) {
            if (str.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
