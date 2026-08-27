package o;

import bo.app.d4$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public final class LazyListKtrememberLazyListMeasurePolicy11 extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.node.SemanticsModifierNode {
    public float IconCompatParcelizer;
    public androidx.compose.ui.graphics.Outline MediaBrowserCompatMediaItem;
    public long MediaMetadataCompat;
    public androidx.compose.ui.graphics.Shape MediaSessionCompatQueueItem;
    public androidx.compose.ui.graphics.Shape RatingCompat;
    public androidx.compose.ui.graphics.Brush RemoteActionCompatParcelizer;
    public androidx.compose.ui.graphics.Outline read;
    public androidx.compose.ui.unit.LayoutDirection serializer;
    public long write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean isImportantForBounds() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.RatingCompat);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0091  */
    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.RatingCompat == androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()) {
            if (!androidx.compose.ui.graphics.Color.m723equalsimpl0(this.write, androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU())) {
                androidx.compose.ui.graphics.drawscope.DrawScope.m1298drawRectnJ9OG0$default(contentDrawScope, this.write, 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
            androidx.compose.ui.graphics.Brush brush = this.RemoteActionCompatParcelizer;
            if (brush != null) {
                androidx.compose.ui.graphics.drawscope.DrawScope.m1297drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, this.IconCompatParcelizer, null, null, 0, 118, null);
            }
        } else {
            if (androidx.compose.ui.geometry.Size.m542equalsimpl0(contentDrawScope.mo1304getSizeNHjbRc(), this.MediaMetadataCompat) && contentDrawScope.getLayoutDirection() == this.serializer) {
                Object[] objArr = {this.MediaSessionCompatQueueItem, this.RatingCompat};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    outline = this.read;
                    outline.getClass();
                } else {
                    androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new d4$$ExternalSyntheticLambda2(this, 2, contentDrawScope));
                    outline = this.MediaBrowserCompatMediaItem;
                    this.MediaBrowserCompatMediaItem = null;
                }
            } else {
                androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new d4$$ExternalSyntheticLambda2(this, 2, contentDrawScope));
                outline = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = null;
            }
            this.read = outline;
            this.MediaMetadataCompat = contentDrawScope.mo1304getSizeNHjbRc();
            this.serializer = contentDrawScope.getLayoutDirection();
            this.MediaSessionCompatQueueItem = this.RatingCompat;
            outline.getClass();
            if (!androidx.compose.ui.graphics.Color.m723equalsimpl0(this.write, androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU())) {
                androidx.compose.ui.graphics.OutlineKt.m997drawOutlinewDX37Ww(contentDrawScope, outline, this.write, (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : 0);
            }
            androidx.compose.ui.graphics.Brush brush2 = this.RemoteActionCompatParcelizer;
            if (brush2 != null) {
                androidx.compose.ui.graphics.OutlineKt.m996drawOutlinehn5TExg$default(contentDrawScope, outline, brush2, this.IconCompatParcelizer, null, null, 0, 56, null);
            }
        }
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.MediaMetadataCompat = androidx.compose.ui.geometry.Size.Companion.m554getUnspecifiedNHjbRc();
        this.serializer = null;
        this.read = null;
        this.MediaSessionCompatQueueItem = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }
}
