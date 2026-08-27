package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidDragAndDropManager extends isEnabledannotations {
    public static final AndroidDragAndDropManager IconCompatParcelizer = new AndroidDragAndDropManager(0, 1, 1);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests;
        getHandleruiannotations gethandleruiannotations = (getHandleruiannotations) accessgetdraganddropmanager.serializer(0);
        onRemeasuredozmzZPI onremeasuredozmzzpi = (onRemeasuredozmzZPI) firstdescendantornull.MediaMetadataCompat;
        if (onremeasuredozmzzpi == null || ((DragAndDropNodeKt) onremeasuredozmzzpi.MediaBrowserCompatMediaItem(gethandleruiannotations)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) firstdescendantornull.IconCompatParcelizer;
        if (arrayList != null && (oncreatevirtualviewtranslationrequests = (onCreateVirtualViewTranslationRequests) arrayList.remove(arrayList.size() - 1)) != null) {
            firstdescendantornull.read = oncreatevirtualviewtranslationrequests;
        }
        onremeasuredozmzzpi.IconCompatParcelizer(gethandleruiannotations);
    }

    public AndroidDragAndDropManager(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
