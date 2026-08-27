package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@calculateSize(RemoteActionCompatParcelizer = "dialog")
public final class setPath extends toAndroidPathDashPathEffectStyleoQv6xUo {
    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void RemoteActionCompatParcelizer(List list, transform58bKbWc transform58bkbwc) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            serializer().RemoteActionCompatParcelizer((cubicTo) it.next());
        }
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final opN5in7k0 write() {
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = toPathSegmentType.IconCompatParcelizer;
        return new PathMeasure(this);
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void write(cubicTo cubicto, boolean z) {
        serializer().write(cubicto, z);
        int iRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) serializer().MediaBrowserCompatMediaItem.read(), cubicto);
        int i = 0;
        for (Object obj : (Iterable) serializer().MediaBrowserCompatMediaItem.read()) {
            if (i < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            cubicTo cubicto2 = (cubicTo) obj;
            if (i > iRemoteActionCompatParcelizer) {
                serializer().IconCompatParcelizer(cubicto2);
            }
            i++;
        }
    }
}
