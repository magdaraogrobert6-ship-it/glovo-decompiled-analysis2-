package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getVisibilityRampUpAnimationDurationMillis implements Runnable {
    public final /* synthetic */ setBrightness serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getVisibilityRampUpAnimationDurationMillis(setBrightness setbrightness, int i) {
        this.write = i;
        this.serializer = setbrightness;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        setBrightness setbrightness = this.serializer;
        if (i != 0) {
            removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new getVisibilityRampUpAnimationDurationMillis(setbrightness, 0));
        } else {
            if (setbrightness.RemoteActionCompatParcelizer) {
                return;
            }
            setbrightness.serializer();
        }
    }
}
