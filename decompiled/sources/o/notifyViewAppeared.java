package o;

/* JADX INFO: loaded from: classes.dex */
public final class notifyViewAppeared extends isEnabledannotations {
    public static final notifyViewAppeared RemoteActionCompatParcelizer = new notifyViewAppeared(0, 2, 1);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        int i;
        accesscontainsUv8p0NA accesscontainsuv8p0na = (accesscontainsUv8p0NA) accessgetdraganddropmanager.serializer(0);
        int iRemoteActionCompatParcelizer = gettype.RemoteActionCompatParcelizer((AndroidContentCaptureManagercurrentSemanticsNodes1) accessgetdraganddropmanager.serializer(1));
        if (gettype.IconCompatParcelizer >= iRemoteActionCompatParcelizer) {
            getCreditCardExpirationDay.read("Check failed");
        }
        setRequestDisallowInterceptTouchEvent.IconCompatParcelizer(gettype, getaddresscountry, iRemoteActionCompatParcelizer);
        int i2 = gettype.IconCompatParcelizer;
        int iSerializer = gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        while (iSerializer >= 0 && !gettype.MediaSessionCompatResultReceiverWrapper(iSerializer)) {
            iSerializer = gettype.serializer(gettype.PlaybackStateCompatCustomAction, iSerializer);
        }
        int iMediaMetadataCompat = iSerializer + 1;
        int iMediaMetadataCompat2 = 0;
        while (iMediaMetadataCompat < i2) {
            if (gettype.serializer(i2, iMediaMetadataCompat)) {
                if (gettype.MediaSessionCompatResultReceiverWrapper(iMediaMetadataCompat)) {
                    iMediaMetadataCompat2 = 0;
                }
                iMediaMetadataCompat++;
            } else {
                iMediaMetadataCompat2 += gettype.MediaSessionCompatResultReceiverWrapper(iMediaMetadataCompat) ? 1 : gettype.PlaybackStateCompatCustomAction[(gettype.MediaBrowserCompatMediaItem(iMediaMetadataCompat) * 5) + 1] & 67108863;
                iMediaMetadataCompat += gettype.MediaMetadataCompat(iMediaMetadataCompat);
            }
        }
        while (true) {
            i = gettype.IconCompatParcelizer;
            if (i >= iRemoteActionCompatParcelizer) {
                break;
            }
            if (gettype.serializer(iRemoteActionCompatParcelizer, i)) {
                int i3 = gettype.IconCompatParcelizer;
                if (i3 < gettype.read && (gettype.PlaybackStateCompatCustomAction[(gettype.MediaBrowserCompatMediaItem(i3) * 5) + 1] & 1073741824) != 0) {
                    getaddresscountry.down(gettype.ParcelableVolumeInfo(gettype.IconCompatParcelizer));
                    iMediaMetadataCompat2 = 0;
                }
                gettype.MediaBrowserCompatMediaItem();
            } else {
                iMediaMetadataCompat2 += gettype.MediaMetadataCompat();
            }
        }
        if (i != iRemoteActionCompatParcelizer) {
            getCreditCardExpirationDay.read("Check failed");
        }
        accesscontainsuv8p0na.serializer = iMediaMetadataCompat2;
    }

    public notifyViewAppeared(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
