package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getValidNotificationChannellambda3 {
    private final getCooldownEnterSeconds IconCompatParcelizer;
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug> RemoteActionCompatParcelizer;
    private final component4android_sdk_base_release read;
    private final initializeGeofenceslambda0 serializer;
    private final setDeleteIntent write;

    public final void serializer() {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.write();
        }
    }

    public final handleNotificationDeletedlambda1 write(r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug) {
        synchronized (this) {
            handleNotificationDeletedlambda1 handlenotificationdeletedlambda1 = null;
            if (r8lambdafjifijxjxuf3vopuwrut7txivug.equals(this.RemoteActionCompatParcelizer.read())) {
                return null;
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafjifijxjxuf3vopuwrut7txivug);
            r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug2 = this.RemoteActionCompatParcelizer.read();
            if (r8lambdafjifijxjxuf3vopuwrut7txivug2 != null) {
                setDeleteIntent setdeleteintent = this.write;
                handlenotificationdeletedlambda1 = new handleNotificationDeletedlambda1(setdeleteintent.read, r8lambdafjifijxjxuf3vopuwrut7txivug2, this.serializer);
            }
            return handlenotificationdeletedlambda1;
        }
    }

    public getValidNotificationChannellambda3(initializeGeofenceslambda0 initializegeofenceslambda0, setDeleteIntent setdeleteintent, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, long j) {
        this.serializer = initializegeofenceslambda0;
        this.write = setdeleteintent;
        this.IconCompatParcelizer = getcooldownenterseconds;
        this.read = component4android_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = new getValidNotificationChannellambda2(this, j);
    }
}
