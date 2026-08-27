package o;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropEvent extends isEnabledannotations {
    public static final DragAndDropEvent RemoteActionCompatParcelizer = new DragAndDropEvent(1, 0, 2);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        int i = accessgetdraganddropmanager.read(0);
        int i2 = gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iWrite = gettype.write(gettype.PlaybackStateCompatCustomAction, gettype.MediaBrowserCompatMediaItem(i2));
        int i3 = gettype.read(gettype.PlaybackStateCompatCustomAction, gettype.MediaBrowserCompatMediaItem(i2 + 1));
        for (int iMax = Math.max(iWrite, i3 - i); iMax < i3; iMax++) {
            Object obj = gettype.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[gettype.RemoteActionCompatParcelizer(iMax)];
            if (obj instanceof createFromAutofillValue) {
                firstdescendantornull.serializer((createFromAutofillValue) obj);
            } else if (obj instanceof getHandleruiannotations) {
                ((getHandleruiannotations) obj).RemoteActionCompatParcelizer();
            }
        }
        if (i <= 0) {
            getCreditCardExpirationDay.read("Check failed");
        }
        int i4 = gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iWrite2 = gettype.write(gettype.PlaybackStateCompatCustomAction, gettype.MediaBrowserCompatMediaItem(i4));
        int i5 = gettype.read(gettype.PlaybackStateCompatCustomAction, gettype.MediaBrowserCompatMediaItem(i4 + 1)) - i;
        if (i5 < iWrite2) {
            getCreditCardExpirationDay.read("Check failed");
        }
        gettype.write(i5, i, i4);
        int i6 = gettype.MediaDescriptionCompat;
        if (i6 >= iWrite2) {
            gettype.MediaDescriptionCompat = i6 - i;
        }
    }

    public DragAndDropEvent(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
