package o;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeDrawScoperecord1 implements getCanvasDrawScope {
    public getCanvasDrawScope[] IconCompatParcelizer;

    @Override // o.getCanvasDrawScope
    public final getDetachedFromParentLookaheadPlacementui IconCompatParcelizer(Class cls) {
        for (getCanvasDrawScope getcanvasdrawscope : this.IconCompatParcelizer) {
            if (getcanvasdrawscope.serializer(cls)) {
                return getcanvasdrawscope.IconCompatParcelizer(cls);
            }
        }
        IBraze$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // o.getCanvasDrawScope
    public final boolean serializer(Class cls) {
        for (getCanvasDrawScope getcanvasdrawscope : this.IconCompatParcelizer) {
            if (getcanvasdrawscope.serializer(cls)) {
                return true;
            }
        }
        return false;
    }
}
