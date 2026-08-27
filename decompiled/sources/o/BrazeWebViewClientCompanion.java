package o;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeWebViewClientCompanion extends isValidPushStoryClickInputlambda1 {
    @Override // o.isValidPushStoryClickInputlambda1
    public final boolean read(parsePropertiesFromQueryBundle parsepropertiesfromquerybundle) {
        synchronized (parsepropertiesfromquerybundle) {
            if (parsepropertiesfromquerybundle.IconCompatParcelizer != 0) {
                return false;
            }
            parsepropertiesfromquerybundle.IconCompatParcelizer = -1;
            return true;
        }
    }

    @Override // o.isValidPushStoryClickInputlambda1
    public final void serializer(parsePropertiesFromQueryBundle parsepropertiesfromquerybundle) {
        synchronized (parsepropertiesfromquerybundle) {
            parsepropertiesfromquerybundle.IconCompatParcelizer = 0;
        }
    }
}
