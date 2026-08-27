package o;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropManager extends isEnabledannotations {
    public static final DragAndDropManager IconCompatParcelizer;
    public static final DragAndDropManager MediaSessionCompatQueueItem;
    public static final DragAndDropManager RemoteActionCompatParcelizer;
    public static final DragAndDropManager write;
    public final /* synthetic */ int MediaMetadataCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DragAndDropManager(int i, int i2, int i3) {
        super(i, i2);
        this.MediaMetadataCompat = i3;
    }

    static {
        int i = 1;
        int i2 = 2;
        write = new DragAndDropManager(i, i2, i);
        IconCompatParcelizer = new DragAndDropManager(i, i, i2);
        MediaSessionCompatQueueItem = new DragAndDropManager(i, i2, 3);
        RemoteActionCompatParcelizer = new DragAndDropManager(i, i, 0);
    }

    @Override // o.isEnabledannotations
    public AndroidContentCaptureManagercurrentSemanticsNodes1 write(accessgetDragAndDropManager accessgetdraganddropmanager) {
        int i = this.MediaMetadataCompat;
        if (i != 1) {
            return i != 2 ? super.write(accessgetdraganddropmanager) : (AndroidContentCaptureManagercurrentSemanticsNodes1) accessgetdraganddropmanager.serializer(0);
        }
        return (AndroidContentCaptureManagercurrentSemanticsNodes1) accessgetdraganddropmanager.serializer(1);
    }

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            Object objSerializer = accessgetdraganddropmanager.serializer(0);
            int i2 = accessgetdraganddropmanager.read(0);
            if (objSerializer instanceof createFromAutofillValue) {
                createFromAutofillValue createfromautofillvalue = (createFromAutofillValue) objSerializer;
                ((onCreateVirtualViewTranslationRequests) firstdescendantornull.read).IconCompatParcelizer(createfromautofillvalue);
                ((relocationOffsetfbGrOKE) firstdescendantornull.MediaSessionCompatQueueItem).serializer(createfromautofillvalue);
            }
            Object objRemoteActionCompatParcelizer = gettype.RemoteActionCompatParcelizer(gettype.IconCompatParcelizer, i2, objSerializer);
            if (objRemoteActionCompatParcelizer instanceof createFromAutofillValue) {
                firstdescendantornull.serializer((createFromAutofillValue) objRemoteActionCompatParcelizer);
                return;
            } else {
                if (objRemoteActionCompatParcelizer instanceof getHandleruiannotations) {
                    ((getHandleruiannotations) objRemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            Object objInvoke = ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessgetdraganddropmanager.serializer(0)).invoke();
            AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = (AndroidContentCaptureManagercurrentSemanticsNodes1) accessgetdraganddropmanager.serializer(1);
            int i3 = accessgetdraganddropmanager.read(0);
            androidContentCaptureManagercurrentSemanticsNodes1.getClass();
            gettype.write(gettype.RemoteActionCompatParcelizer(androidContentCaptureManagercurrentSemanticsNodes1), objInvoke);
            getaddresscountry.insertTopDown(i3, objInvoke);
            getaddresscountry.down(objInvoke);
            return;
        }
        if (i == 2) {
            AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes2 = (AndroidContentCaptureManagercurrentSemanticsNodes1) accessgetdraganddropmanager.serializer(0);
            int i4 = accessgetdraganddropmanager.read(0);
            getaddresscountry.up();
            androidContentCaptureManagercurrentSemanticsNodes2.getClass();
            getaddresscountry.insertBottomUp(i4, gettype.ParcelableVolumeInfo(gettype.RemoteActionCompatParcelizer(androidContentCaptureManagercurrentSemanticsNodes2)));
            return;
        }
        Object objSerializer2 = accessgetdraganddropmanager.serializer(0);
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes3 = (AndroidContentCaptureManagercurrentSemanticsNodes1) accessgetdraganddropmanager.serializer(1);
        int i5 = accessgetdraganddropmanager.read(0);
        if (objSerializer2 instanceof createFromAutofillValue) {
            createFromAutofillValue createfromautofillvalue2 = (createFromAutofillValue) objSerializer2;
            ((onCreateVirtualViewTranslationRequests) firstdescendantornull.read).IconCompatParcelizer(createfromautofillvalue2);
            ((relocationOffsetfbGrOKE) firstdescendantornull.MediaSessionCompatQueueItem).serializer(createfromautofillvalue2);
        }
        Object objRemoteActionCompatParcelizer2 = gettype.RemoteActionCompatParcelizer(gettype.RemoteActionCompatParcelizer(androidContentCaptureManagercurrentSemanticsNodes3), i5, objSerializer2);
        if (objRemoteActionCompatParcelizer2 instanceof createFromAutofillValue) {
            firstdescendantornull.serializer((createFromAutofillValue) objRemoteActionCompatParcelizer2);
        } else if (objRemoteActionCompatParcelizer2 instanceof getHandleruiannotations) {
            ((getHandleruiannotations) objRemoteActionCompatParcelizer2).RemoteActionCompatParcelizer();
        }
    }
}
