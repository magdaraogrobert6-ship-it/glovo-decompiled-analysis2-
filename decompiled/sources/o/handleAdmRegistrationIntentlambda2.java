package o;

import android.os.FileObserver;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
final class handleAdmRegistrationIntentlambda2 extends FileObserver {
    final File RemoteActionCompatParcelizer;
    final /* synthetic */ accesshandlePush read;
    final handleAdmRegistrationEventIfEnabledlambda1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleAdmRegistrationIntentlambda2(accesshandlePush accesshandlepush, File file, handleAdmRegistrationEventIfEnabledlambda1 handleadmregistrationeventifenabledlambda1) {
        super(file.getAbsolutePath(), 1032);
        this.read = accesshandlepush;
        this.RemoteActionCompatParcelizer = file;
        this.write = handleadmregistrationeventifenabledlambda1;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        int i2 = i & 4095;
        if (i2 == 8 || i2 == 1024) {
            parseLonglambda0 parselonglambda0 = this.read.write;
            File file = this.RemoteActionCompatParcelizer;
            parselonglambda0.IconCompatParcelizer("File %s closed/deleted. Final size is %,d bytes", file.getName(), Long.valueOf(file.length()));
            handleAdmRegistrationEventIfEnabledlambda1.write(this.write, this);
        }
    }
}
