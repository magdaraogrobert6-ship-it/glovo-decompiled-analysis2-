package androidx.compose.ui.layout;

import java.util.Map;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface MeasureResult {
    Map<AlignmentLine, Integer> getAlignmentLines();

    int getHeight();

    default r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulers() {
        return null;
    }

    int getWidth();

    void placeChildren();
}
