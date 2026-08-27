package coil3.compose.internal;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;

/* JADX INFO: loaded from: classes.dex */
public final class SubcomposeContentPainterNode extends AbstractContentPainterNode {
    private Painter painter;

    public final void IconCompatParcelizer(Painter painter) {
        this.painter = painter;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode
    public final Painter write() {
        return this.painter;
    }

    public SubcomposeContentPainterNode(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, String str) {
        super(alignment, contentScale, f, colorFilter, z, str, null);
        this.painter = painter;
    }
}
