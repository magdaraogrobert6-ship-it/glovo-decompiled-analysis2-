package o;

import android.os.Looper;
import com.google.gson.Gson;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public abstract class onDependencyAdded {
    public static final boolean serializer;
    public static final isAdapterPositionOnScreen write;

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    static {
        boolean z;
        String property = System.getProperty("gsonTestMode");
        if (property != null) {
            z = Boolean.parseBoolean(property);
        }
        serializer = z;
        write = new isAdapterPositionOnScreen(new onAddedToParentLayer(10));
    }

    public static Gson IconCompatParcelizer() {
        if (!serializer) {
            Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Gson should not be used on the main thread. Please put this usage on a background Dispatcher", Timber.RemoteActionCompatParcelizer);
            }
        }
        Object objMediaSessionCompatResultReceiverWrapper = write.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        return (Gson) objMediaSessionCompatResultReceiverWrapper;
    }
}
