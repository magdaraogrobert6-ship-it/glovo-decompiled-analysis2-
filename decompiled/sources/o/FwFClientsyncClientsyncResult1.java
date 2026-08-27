package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFClientsyncClientsyncResult1 implements AutoCloseable {
    public FwFClientsyncClient1 IconCompatParcelizer;

    public FwFClientsyncClientsyncResult1(File file, FwFClientstartUpdater1 fwFClientstartUpdater1) {
        this.IconCompatParcelizer = new FwFClientsyncClient1(file.getAbsolutePath(), fwFClientstartUpdater1);
        RemoteActionCompatParcelizer();
        this.IconCompatParcelizer.write();
    }

    public final int IconCompatParcelizer() {
        RemoteActionCompatParcelizer();
        return this.IconCompatParcelizer.IconCompatParcelizer.length;
    }

    public final FwFClientupdateFeatures1 IconCompatParcelizer(int i) {
        RemoteActionCompatParcelizer();
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(i);
    }

    public final FwFClientupdateFeatures1 RemoteActionCompatParcelizer(int i) {
        RemoteActionCompatParcelizer();
        return this.IconCompatParcelizer.serializer(i);
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public final void read(Object[] objArr, Map map) {
        RemoteActionCompatParcelizer();
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(objArr, map);
    }

    public final int serializer() {
        RemoteActionCompatParcelizer();
        return this.IconCompatParcelizer.MediaSessionCompatQueueItem.length;
    }

    public final void serializer(int[] iArr, int i) {
        RemoteActionCompatParcelizer();
        this.IconCompatParcelizer.read(iArr, i);
    }

    public final void write() {
        RemoteActionCompatParcelizer();
        this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        FwFClientsyncClient1 fwFClientsyncClient1 = this.IconCompatParcelizer;
        if (fwFClientsyncClient1 != null) {
            fwFClientsyncClient1.close();
            this.IconCompatParcelizer = null;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Internal error: The Interpreter has already been closed.");
    }
}
