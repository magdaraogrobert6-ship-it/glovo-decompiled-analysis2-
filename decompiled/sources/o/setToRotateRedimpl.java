package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class setToRotateRedimpl {
    public static final HashMap IconCompatParcelizer = new HashMap();
    public final File RemoteActionCompatParcelizer;
    public FileChannel read;
    public final boolean serializer;
    public final Lock write;

    public final void IconCompatParcelizer(boolean z) {
        this.write.lock();
        if (z) {
            File file = this.RemoteActionCompatParcelizer;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = getPositionInRoot.write(new FileOutputStream(file), file).getChannel();
                channel.lock();
                this.read = channel;
            } catch (IOException e) {
                this.read = null;
                SentryLogcatAdapter.write("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public setToRotateRedimpl(String str, File file, boolean z) {
        Lock lock;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = IconCompatParcelizer;
        synchronized (map) {
            Object reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            lock = (Lock) reentrantLock;
        }
        this.write = lock;
    }

    public final void IconCompatParcelizer() {
        try {
            FileChannel fileChannel = this.read;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.write.unlock();
    }
}
