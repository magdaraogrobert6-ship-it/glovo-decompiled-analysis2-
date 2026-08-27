package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class isEnabledannotations {
    public final int read;
    public final int serializer;

    public AndroidContentCaptureManagercurrentSemanticsNodes1 write(accessgetDragAndDropManager accessgetdraganddropmanager) {
        return null;
    }

    public abstract void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm);

    public final String toString() {
        String strIconCompatParcelizer = displayInAppMessagelambda1.serializer(getClass()).IconCompatParcelizer();
        return strIconCompatParcelizer == null ? "" : strIconCompatParcelizer;
    }

    public /* synthetic */ isEnabledannotations(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public isEnabledannotations(int i, int i2) {
        this.serializer = i;
        this.read = i2;
    }
}
