package o;

import android.os.FileObserver;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class handleAdmRegistrationEventIfEnabledlambda1 extends FileObserver {
    final /* synthetic */ accesshandlePush RemoteActionCompatParcelizer;
    private final File serializer;
    private final ArrayList write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleAdmRegistrationEventIfEnabledlambda1(accesshandlePush accesshandlepush, File file) {
        super(file.getAbsolutePath(), 4042);
        this.RemoteActionCompatParcelizer = accesshandlepush;
        this.serializer = file;
        this.write = new ArrayList();
    }

    public static void write(handleAdmRegistrationEventIfEnabledlambda1 handleadmregistrationeventifenabledlambda1, handleAdmRegistrationIntentlambda2 handleadmregistrationintentlambda2) {
        accesshandlePush.RemoteActionCompatParcelizer(handleadmregistrationeventifenabledlambda1.RemoteActionCompatParcelizer, handleadmregistrationeventifenabledlambda1.serializer);
        handleadmregistrationintentlambda2.stopWatching();
        synchronized (handleadmregistrationeventifenabledlambda1.write) {
            handleadmregistrationeventifenabledlambda1.write.remove(handleadmregistrationintentlambda2);
        }
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        this.RemoteActionCompatParcelizer.serializer.RemoteActionCompatParcelizer(new r8lambdazGX_cwmssx6gbv23LNiFOXQ57p4(this, str, i), "DiskQuotaMonitor");
    }

    @Override // android.os.FileObserver
    public final void stopWatching() {
        super.stopWatching();
        synchronized (this.write) {
            Iterator it = this.write.iterator();
            while (it.hasNext()) {
                ((handleAdmRegistrationIntentlambda2) it.next()).stopWatching();
            }
        }
    }
}
