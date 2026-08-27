package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class containsandroid_sdk_base_release implements writeData {
    private final getDataStoreScopeandroid_sdk_base_release IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final ArrayList write;

    public final void write() {
        this.IconCompatParcelizer.removeCallbacksAndMessages(null);
    }

    public final void RemoteActionCompatParcelizer(writeData writedata) {
        synchronized (this.write) {
            this.write.add(writedata);
        }
    }

    @Override // o.writeData
    public final void handleMessage(Message message) {
        ArrayList arrayList;
        synchronized (this.write) {
            arrayList = new ArrayList(this.write);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((writeData) it.next()).handleMessage(message);
        }
    }

    public final void serializer(Runnable runnable) {
        this.IconCompatParcelizer.removeCallbacks(runnable);
    }

    public final void IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.sendEmptyMessageDelayed(6, 0L);
        }
    }

    public final void IconCompatParcelizer(int i) {
        this.IconCompatParcelizer.removeMessages(i);
    }

    public containsandroid_sdk_base_release(String str) {
        str.replace("sent:", "");
        this.RemoteActionCompatParcelizer = true;
        this.IconCompatParcelizer = new getDataStoreScopeandroid_sdk_base_release(this);
        this.write = new ArrayList();
    }

    public final void serializer() {
        this.RemoteActionCompatParcelizer = true;
    }

    public final void IconCompatParcelizer(Runnable runnable, long j) {
        if (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.postDelayed(runnable, j);
        }
    }

    public final Handler RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void serializer(Message message) {
        if (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.sendMessage(message);
        }
    }

    public final void read(int i, long j) {
        if (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.sendEmptyMessageDelayed(i, j);
        }
    }

    public final boolean write(int i) {
        return this.IconCompatParcelizer.hasMessages(i);
    }

    public final void read() {
        this.RemoteActionCompatParcelizer = false;
    }

    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        if (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.post(runnable);
        }
    }

    public containsandroid_sdk_base_release(String str, Looper looper) {
        str.replace("sent:", "");
        this.RemoteActionCompatParcelizer = true;
        this.IconCompatParcelizer = new getDataStoreScopeandroid_sdk_base_release(looper, this);
        this.write = new ArrayList();
    }
}
