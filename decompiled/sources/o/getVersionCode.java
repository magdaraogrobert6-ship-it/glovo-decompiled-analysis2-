package o;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class getVersionCode {
    public static final ThreadPoolExecutor write;
    public boolean MediaSessionCompatQueueItem;
    public final isAutomaticGeofenceRequestsEnabled serializer = new isAutomaticGeofenceRequestsEnabled(0, this);
    public final ArrayDeque read = new ArrayDeque();
    public final setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release MediaDescriptionCompat = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(10);
    public final int IconCompatParcelizer = 5;
    public final long RemoteActionCompatParcelizer = 300000000000L;

    static {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        write = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, synchronousQueue, new r8lambdaST4AYLA9Q2b7l2QguExdjNYtig("OkHttp ConnectionPool", true));
    }

    public final int RemoteActionCompatParcelizer(r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve, long j) {
        ArrayList arrayList = r8lambdaik1pft6kfq5yrxiftoy3aewpve.MediaSessionCompatToken;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                getLoggerInitialLogLevel.RatingCompat.IconCompatParcelizer("A connection to " + r8lambdaik1pft6kfq5yrxiftoy3aewpve.write.read.RemoteActionCompatParcelizer + " was leaked. Did you forget to close a response body?", ((r8lambda_rBBbfSaSmW9ZaqWlktZwFDxzPQ) reference).RemoteActionCompatParcelizer);
                arrayList.remove(i);
                r8lambdaik1pft6kfq5yrxiftoy3aewpve.RatingCompat = true;
                if (arrayList.isEmpty()) {
                    r8lambdaik1pft6kfq5yrxiftoy3aewpve.PlaybackStateCompat = j - this.RemoteActionCompatParcelizer;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
