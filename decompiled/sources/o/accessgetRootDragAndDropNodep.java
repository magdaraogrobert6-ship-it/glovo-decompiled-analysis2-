package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetRootDragAndDropNodep extends isEnabledannotations {
    public static final accessgetRootDragAndDropNodep IconCompatParcelizer = new accessgetRootDragAndDropNodep(0, 2, 1);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = (AndroidContentCaptureManagersendContentCaptureAppearEvents1) accessgetdraganddropmanager.serializer(1);
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = (AndroidContentCaptureManagercurrentSemanticsNodes1) accessgetdraganddropmanager.serializer(0);
        gettype.read();
        androidContentCaptureManagercurrentSemanticsNodes1.getClass();
        gettype.IconCompatParcelizer(androidContentCaptureManagersendContentCaptureAppearEvents1, androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer(androidContentCaptureManagercurrentSemanticsNodes1));
        gettype.serializer();
    }

    public accessgetRootDragAndDropNodep(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
