package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeDragShadowBuilder extends isEnabledannotations {
    public static final ComposeDragShadowBuilder IconCompatParcelizer = new ComposeDragShadowBuilder(0, 1, 1);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        getHandleruiannotations gethandleruiannotations = (getHandleruiannotations) accessgetdraganddropmanager.serializer(0);
        onRemeasuredozmzZPI onremeasuredozmzzpi = (onRemeasuredozmzZPI) firstdescendantornull.MediaMetadataCompat;
        DragAndDropNodeKt dragAndDropNodeKt = onremeasuredozmzzpi != null ? (DragAndDropNodeKt) onremeasuredozmzzpi.MediaBrowserCompatMediaItem(gethandleruiannotations) : null;
        if (dragAndDropNodeKt != null) {
            ArrayList arrayList = (ArrayList) firstdescendantornull.IconCompatParcelizer;
            if (arrayList == null) {
                arrayList = new ArrayList();
                firstdescendantornull.IconCompatParcelizer = arrayList;
            }
            arrayList.add((onCreateVirtualViewTranslationRequests) firstdescendantornull.read);
            firstdescendantornull.read = dragAndDropNodeKt.RemoteActionCompatParcelizer;
        }
    }

    public ComposeDragShadowBuilder(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
