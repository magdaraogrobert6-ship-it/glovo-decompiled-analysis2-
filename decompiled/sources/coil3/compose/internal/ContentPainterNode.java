package coil3.compose.internal;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver;
import o.getContentViewGroupParentLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ContentPainterNode extends AbstractContentPainterNode {
    public final AsyncImagePainter RatingCompat;

    @Override // coil3.compose.internal.AbstractContentPainterNode
    public final Painter write() {
        return this.RatingCompat;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.RatingCompat.onForgotten();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        this.RatingCompat.write(null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getContentViewGroupParentLayout coroutineScope = getCoroutineScope();
        AsyncImagePainter asyncImagePainter = this.RatingCompat;
        asyncImagePainter.PlaybackStateCompat = coroutineScope;
        asyncImagePainter.onRemembered();
    }

    public ContentPainterNode(AsyncImagePainter asyncImagePainter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, String str, ConstraintsSizeResolver constraintsSizeResolver) {
        super(alignment, contentScale, f, colorFilter, z, str, constraintsSizeResolver);
        this.RatingCompat = asyncImagePainter;
    }
}
