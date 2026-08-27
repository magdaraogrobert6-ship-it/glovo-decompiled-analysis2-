package o;

/* JADX INFO: loaded from: classes3.dex */
final class handleAdmRegistrationEventIfEnabled {
    private byte IconCompatParcelizer;
    private final Runnable read = new r8lambda9TZpBImTEtk0HAjJ1Vr5tuCi60U(1, this);
    private boolean serializer;
    final /* synthetic */ getBrazePushEventType write;

    public static void serializer(handleAdmRegistrationEventIfEnabled handleadmregistrationeventifenabled, byte b) {
        synchronized (handleadmregistrationeventifenabled) {
            handleadmregistrationeventifenabled.IconCompatParcelizer = b;
            if (!handleadmregistrationeventifenabled.serializer) {
                handleadmregistrationeventifenabled.serializer = true;
                handleadmregistrationeventifenabled.write.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(handleadmregistrationeventifenabled.read);
            }
        }
    }

    public handleAdmRegistrationEventIfEnabled(getBrazePushEventType getbrazepusheventtype) {
        this.write = getbrazepusheventtype;
    }

    public static void write(handleAdmRegistrationEventIfEnabled handleadmregistrationeventifenabled) {
        synchronized (handleadmregistrationeventifenabled) {
            handleadmregistrationeventifenabled.write.RemoteActionCompatParcelizer.IconCompatParcelizer(handleadmregistrationeventifenabled.read);
            handleadmregistrationeventifenabled.serializer = false;
        }
    }
}
