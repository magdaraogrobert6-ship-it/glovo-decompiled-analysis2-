package o;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class registerTargetInterest extends isEnabledannotations {
    public static final registerTargetInterest IconCompatParcelizer = new registerTargetInterest(0, 1, 1);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        getHandleruiannotations gethandleruiannotations = (getHandleruiannotations) accessgetdraganddropmanager.serializer(0);
        Set set = (Set) firstdescendantornull.serializer;
        if (set == null) {
            return;
        }
        DragAndDropNodeKt dragAndDropNodeKt = new DragAndDropNodeKt(set);
        onRemeasuredozmzZPI onremeasuredozmzzpi = (onRemeasuredozmzZPI) firstdescendantornull.MediaMetadataCompat;
        if (onremeasuredozmzzpi == null) {
            long[] jArr = detectDragGestures.write;
            onremeasuredozmzzpi = new onRemeasuredozmzZPI();
            firstdescendantornull.MediaMetadataCompat = onremeasuredozmzzpi;
        }
        onremeasuredozmzzpi.write(gethandleruiannotations, dragAndDropNodeKt);
        ((onCreateVirtualViewTranslationRequests) firstdescendantornull.read).IconCompatParcelizer(new createFromAutofillValue(dragAndDropNodeKt, -1));
    }

    public registerTargetInterest(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
