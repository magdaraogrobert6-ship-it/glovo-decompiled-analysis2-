package o;

/* JADX INFO: loaded from: classes.dex */
public final class ContentCaptureSessionWrapper extends isEnabledannotations {
    public static final ContentCaptureSessionWrapper write = new ContentCaptureSessionWrapper(0, 2, 1);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        accesscontainsUv8p0NA accesscontainsuv8p0na = (accesscontainsUv8p0NA) accessgetdraganddropmanager.serializer(1);
        boolean z = false;
        int i = accesscontainsuv8p0na != null ? accesscontainsuv8p0na.serializer : 0;
        ContentCaptureManager contentCaptureManager = (ContentCaptureManager) accessgetdraganddropmanager.serializer(0);
        if (i > 0) {
            getaddresscountry = new ImageResources_androidKt(getaddresscountry, i);
        }
        contentCaptureManager.serializer(getaddresscountry, gettype, firstdescendantornull, drag12sf9dm != null ? new colorResource(drag12sf9dm, gettype, z, 9) : null);
    }

    public ContentCaptureSessionWrapper(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
