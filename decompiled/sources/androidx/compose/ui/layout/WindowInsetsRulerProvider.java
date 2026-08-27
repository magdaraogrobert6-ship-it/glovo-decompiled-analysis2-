package androidx.compose.ui.layout;

import java.util.List;
import o.ContentInViewNode;
import o.DefaultScrollableState;

/* JADX INFO: loaded from: classes.dex */
public interface WindowInsetsRulerProvider {
    ContentInViewNode getCutoutRects();

    List<RectRulers> getCutoutRulers();

    InsetsListener getInsetsListener();

    DefaultScrollableState getInsetsValues();
}
