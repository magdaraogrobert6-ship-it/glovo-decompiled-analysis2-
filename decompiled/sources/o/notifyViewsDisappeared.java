package o;

/* JADX INFO: loaded from: classes.dex */
public final class notifyViewsDisappeared extends isEnabledannotations {
    public static final notifyViewsDisappeared write = new notifyViewsDisappeared(0, 3, 1);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        colorResource colorresourceRemoteActionCompatParcelizer;
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = (AndroidContentCaptureManagersendContentCaptureAppearEvents1) accessgetdraganddropmanager.serializer(1);
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = (AndroidContentCaptureManagercurrentSemanticsNodes1) accessgetdraganddropmanager.serializer(0);
        getStructureCompat getstructurecompat = (getStructureCompat) accessgetdraganddropmanager.serializer(2);
        getType gettypeRemoteActionCompatParcelizer = androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer();
        if (drag12sf9dm != null) {
            try {
                colorresourceRemoteActionCompatParcelizer = setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(drag12sf9dm, gettype);
            } catch (Throwable th) {
                gettypeRemoteActionCompatParcelizer.read(false);
                throw th;
            }
        } else {
            colorresourceRemoteActionCompatParcelizer = null;
        }
        if (!getstructurecompat.serializer.write()) {
            getCreditCardExpirationDay.read("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        getstructurecompat.write.write(getaddresscountry, gettypeRemoteActionCompatParcelizer, firstdescendantornull, colorresourceRemoteActionCompatParcelizer);
        gettypeRemoteActionCompatParcelizer.read(true);
        gettype.read();
        androidContentCaptureManagercurrentSemanticsNodes1.getClass();
        gettype.IconCompatParcelizer(androidContentCaptureManagersendContentCaptureAppearEvents1, androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer(androidContentCaptureManagercurrentSemanticsNodes1));
        gettype.serializer();
    }

    public notifyViewsDisappeared(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
