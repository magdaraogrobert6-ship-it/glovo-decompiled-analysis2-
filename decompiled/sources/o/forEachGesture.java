package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class forEachGesture implements getPersonMiddleInitial {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object write;

    public forEachGesture(setPath setpath, cubicTo cubicto, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList) {
        this.RemoteActionCompatParcelizer = 3;
        this.write = setpath;
        this.IconCompatParcelizer = cubicto;
        this.read = snapshotStateList;
    }

    @Override // o.getPersonMiddleInitial
    public final void dispose() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.write;
        if (i == 0) {
            ((androidx.compose.runtime.snapshots.SnapshotStateList) obj).remove(obj3);
            ((positionChangeInternalwfG_k4k) obj2).serializer.IconCompatParcelizer(obj3);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                cubicTo cubicto = (cubicTo) obj2;
                ((setPath) obj3).serializer().IconCompatParcelizer(cubicto);
                ((androidx.compose.runtime.snapshots.SnapshotStateList) obj).remove(cubicto);
                return;
            } else {
                ((accessisRenderNodeCompatiblecp) obj).getLifecycle().read((FocusPropertiesenter1) obj3);
                isAntiAlias isantialias = (isAntiAlias) ((createInAppMessageEventSubscriber) obj2).IconCompatParcelizer;
                if (isantialias != null) {
                    isantialias.write();
                    return;
                }
                return;
            }
        }
        BlockDropShadowNode blockDropShadowNode = (BlockDropShadowNode) obj;
        obtainPainter obtainpainter = (obtainPainter) obj2;
        if (blockDropShadowNode.RemoteActionCompatParcelizer.IconCompatParcelizer(obj3) == obtainpainter) {
            Map map = blockDropShadowNode.IconCompatParcelizer;
            Map mapPerformSave = obtainpainter.performSave();
            if (mapPerformSave.isEmpty()) {
                map.remove(obj3);
            } else {
                map.put(obj3, mapPerformSave);
            }
        }
    }

    public /* synthetic */ forEachGesture(Object obj, Object obj2, Object obj3, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
    }
}
