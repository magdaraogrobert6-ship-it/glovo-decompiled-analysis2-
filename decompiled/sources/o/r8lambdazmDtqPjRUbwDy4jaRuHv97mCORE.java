package o;

import android.os.Debug;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdazmDtqPjRUbwDy4jaRuHv97mCORE {
    private boolean IconCompatParcelizer;
    private final Runnable MediaDescriptionCompat = new configureFromServerConfiglambda0(0, this);
    private final HashMap<r8lambdayNnfP9OWdJ6S3Hy631x_brBzgQA, clearandroid_sdk_base_release> RemoteActionCompatParcelizer = new HashMap<>();
    private final clearAllData read;
    private final configureFromServerConfiglambda1 serializer;
    private boolean write;

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer() {
        synchronized (this) {
            boolean z = this.write;
            this.serializer.getClass();
            boolean zIsDebuggerConnected = Debug.isDebuggerConnected();
            this.write = zIsDebuggerConnected;
            if (z && !zIsDebuggerConnected) {
                for (Map.Entry<r8lambdayNnfP9OWdJ6S3Hy631x_brBzgQA, clearandroid_sdk_base_release> entry : this.RemoteActionCompatParcelizer.entrySet()) {
                    entry.getValue().RemoteActionCompatParcelizer(new configureFromServerConfiglambda0(1, entry.getKey()));
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer(r8lambdayNnfP9OWdJ6S3Hy631x_brBzgQA r8lambdaynnfp9owdj6s3hy631x_brbzgqa) {
        if (this.serializer.read()) {
            synchronized (this) {
                if (this.RemoteActionCompatParcelizer.remove(r8lambdaynnfp9owdj6s3hy631x_brbzgqa) != null && this.RemoteActionCompatParcelizer.isEmpty()) {
                    synchronized (this) {
                        if (this.IconCompatParcelizer) {
                            this.write = false;
                            this.IconCompatParcelizer = false;
                            this.read.IconCompatParcelizer(this.MediaDescriptionCompat);
                        }
                    }
                }
            }
        }
    }

    public final void write(r8lambdayNnfP9OWdJ6S3Hy631x_brBzgQA r8lambdaynnfp9owdj6s3hy631x_brbzgqa, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        int i = 1;
        if (!this.serializer.read()) {
            clearandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(new configureFromServerConfiglambda0(i, r8lambdaynnfp9owdj6s3hy631x_brbzgqa));
            return;
        }
        synchronized (this) {
            this.RemoteActionCompatParcelizer.put(r8lambdaynnfp9owdj6s3hy631x_brbzgqa, clearandroid_sdk_base_releaseVar);
            if (!this.write) {
                clearandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(new configureFromServerConfiglambda0(i, r8lambdaynnfp9owdj6s3hy631x_brbzgqa));
            }
        }
        synchronized (this) {
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                this.read.serializer(this.MediaDescriptionCompat, 1000L);
            }
        }
    }

    public r8lambdazmDtqPjRUbwDy4jaRuHv97mCORE(configureFromServerConfiglambda1 configurefromserverconfiglambda1, clearAllData clearalldata) {
        this.serializer = configurefromserverconfiglambda1;
        this.read = clearalldata;
    }

    public final boolean read() {
        if (!this.serializer.read()) {
            return false;
        }
        IconCompatParcelizer();
        return this.write;
    }
}
