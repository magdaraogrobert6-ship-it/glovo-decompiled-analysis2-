package o;

/* JADX INFO: loaded from: classes.dex */
public final class flush extends isEnabledannotations {
    public static final flush write = new flush(0, 2, 1);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = (AndroidContentCaptureManagercurrentSemanticsNodes1) accessgetdraganddropmanager.serializer(0);
        Object objSerializer = accessgetdraganddropmanager.serializer(1);
        if (objSerializer instanceof createFromAutofillValue) {
            createFromAutofillValue createfromautofillvalue = (createFromAutofillValue) objSerializer;
            ((onCreateVirtualViewTranslationRequests) firstdescendantornull.read).IconCompatParcelizer(createfromautofillvalue);
            ((relocationOffsetfbGrOKE) firstdescendantornull.MediaSessionCompatQueueItem).serializer(createfromautofillvalue);
        }
        if (gettype.MediaSessionCompatResultReceiverWrapper != 0) {
            getCreditCardExpirationDay.read("Can only append a slot if not current inserting");
        }
        int i = gettype.MediaDescriptionCompat;
        int i2 = gettype.MediaMetadataCompat;
        int iRemoteActionCompatParcelizer = gettype.RemoteActionCompatParcelizer(androidContentCaptureManagercurrentSemanticsNodes1);
        int i3 = gettype.read(gettype.PlaybackStateCompatCustomAction, gettype.MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer + 1));
        gettype.MediaDescriptionCompat = i3;
        gettype.MediaMetadataCompat = i3;
        gettype.read(1, iRemoteActionCompatParcelizer);
        if (i >= i3) {
            i++;
            i2++;
        }
        gettype.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[i3] = objSerializer;
        gettype.MediaDescriptionCompat = i;
        gettype.MediaMetadataCompat = i2;
    }

    public flush(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
