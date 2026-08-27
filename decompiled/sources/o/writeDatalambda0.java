package o;

import com.sentiance.sdk.threading.executors.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class writeDatalambda0 implements Runnable {
    final /* synthetic */ clearData IconCompatParcelizer;
    final /* synthetic */ readIntlambda0 serializer;
    final /* synthetic */ Executors write;

    @Override // java.lang.Runnable
    public final void run() {
        this.serializer.RemoteActionCompatParcelizer().run();
        Executors executors = this.write;
        executors.serializer();
        clearData cleardata = this.IconCompatParcelizer;
        if (cleardata.read()) {
            Executors.read(executors, cleardata);
        }
    }

    public writeDatalambda0(Executors executors, readIntlambda0 readintlambda0, clearData cleardata) {
        this.write = executors;
        this.serializer = readintlambda0;
        this.IconCompatParcelizer = cleardata;
    }
}
