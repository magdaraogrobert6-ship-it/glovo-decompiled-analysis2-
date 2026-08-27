package o;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdazGX_cwmssx6gbv23LNiFOXQ57p4 implements Runnable {
    final /* synthetic */ String IconCompatParcelizer;
    final /* synthetic */ int RemoteActionCompatParcelizer;
    final /* synthetic */ handleAdmRegistrationEventIfEnabledlambda1 write;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.write.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem) {
            if (this.IconCompatParcelizer != null && (this.RemoteActionCompatParcelizer & 4095) == 256) {
                File file = new File(this.write.serializer, this.IconCompatParcelizer);
                this.write.RemoteActionCompatParcelizer.write.IconCompatParcelizer("Observing new file %s. Initial size is %,d bytes", accesshandlePush.IconCompatParcelizer(file), Long.valueOf(file.length()));
                handleAdmRegistrationEventIfEnabledlambda1 handleadmregistrationeventifenabledlambda1 = this.write;
                handleAdmRegistrationIntentlambda2 handleadmregistrationintentlambda2 = new handleAdmRegistrationIntentlambda2(handleadmregistrationeventifenabledlambda1.RemoteActionCompatParcelizer, file, handleadmregistrationeventifenabledlambda1);
                synchronized (this.write.write) {
                    this.write.write.add(handleadmregistrationintentlambda2);
                }
                handleadmregistrationintentlambda2.startWatching();
            }
            handleAdmRegistrationEventIfEnabledlambda1 handleadmregistrationeventifenabledlambda2 = this.write;
            accesshandlePush.RemoteActionCompatParcelizer(handleadmregistrationeventifenabledlambda2.RemoteActionCompatParcelizer, handleadmregistrationeventifenabledlambda2.serializer);
        }
    }

    public r8lambdazGX_cwmssx6gbv23LNiFOXQ57p4(handleAdmRegistrationEventIfEnabledlambda1 handleadmregistrationeventifenabledlambda1, String str, int i) {
        this.write = handleadmregistrationeventifenabledlambda1;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = i;
    }
}
