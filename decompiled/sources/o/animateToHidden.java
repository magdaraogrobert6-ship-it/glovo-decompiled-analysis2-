package o;

import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class animateToHidden {
    public final onRemeasuredozmzZPI IconCompatParcelizer;
    public final AlphaKt serializer;
    public final CircularProgressIndicatorTokens write;

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer(Object obj, int i, Object obj2) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.IconCompatParcelizer;
        consumeAvailableOffsetMKHz9U consumeavailableoffsetmkhz9u = (consumeAvailableOffsetMKHz9U) onremeasuredozmzzpi.MediaBrowserCompatMediaItem(obj);
        int i2 = 3;
        if (consumeavailableoffsetmkhz9u != null && consumeavailableoffsetmkhz9u.read == i) {
            Object[] objArr = {consumeavailableoffsetmkhz9u.IconCompatParcelizer, obj2};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = consumeavailableoffsetmkhz9u.write;
                if (dragAndDropTargetModifierNode != null) {
                    return dragAndDropTargetModifierNode;
                }
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode2 = new DragAndDropTargetModifierNode(new GapComposerKt$$ExternalSyntheticLambda0(consumeavailableoffsetmkhz9u.RemoteActionCompatParcelizer, i2, consumeavailableoffsetmkhz9u), true, 818252804);
                consumeavailableoffsetmkhz9u.write = dragAndDropTargetModifierNode2;
                return dragAndDropTargetModifierNode2;
            }
        }
        consumeAvailableOffsetMKHz9U consumeavailableoffsetmkhz9u2 = new consumeAvailableOffsetMKHz9U(this, i, obj, obj2);
        onremeasuredozmzzpi.write(obj, consumeavailableoffsetmkhz9u2);
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode3 = consumeavailableoffsetmkhz9u2.write;
        if (dragAndDropTargetModifierNode3 != null) {
            return dragAndDropTargetModifierNode3;
        }
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode4 = new DragAndDropTargetModifierNode(new GapComposerKt$$ExternalSyntheticLambda0(this, i2, consumeavailableoffsetmkhz9u2), true, 818252804);
        consumeavailableoffsetmkhz9u2.write = dragAndDropTargetModifierNode4;
        return dragAndDropTargetModifierNode4;
    }

    public animateToHidden(AlphaKt alphaKt, CircularProgressIndicatorTokens circularProgressIndicatorTokens) {
        this.serializer = alphaKt;
        this.write = circularProgressIndicatorTokens;
        long[] jArr = detectDragGestures.write;
        this.IconCompatParcelizer = new onRemeasuredozmzZPI();
    }

    public final Object write(Object obj) {
        if (obj == null) {
            return null;
        }
        consumeAvailableOffsetMKHz9U consumeavailableoffsetmkhz9u = (consumeAvailableOffsetMKHz9U) this.IconCompatParcelizer.MediaBrowserCompatMediaItem(obj);
        if (consumeavailableoffsetmkhz9u != null) {
            return consumeavailableoffsetmkhz9u.IconCompatParcelizer;
        }
        onRelease onrelease = (onRelease) this.write.invoke();
        int iSerializer = onrelease.serializer(obj);
        if (iSerializer != -1) {
            return onrelease.serializer(iSerializer);
        }
        return null;
    }
}
