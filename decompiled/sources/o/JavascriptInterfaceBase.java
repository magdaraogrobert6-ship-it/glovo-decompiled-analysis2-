package o;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class JavascriptInterfaceBase {
    public static final JavascriptInterfaceBase serializer = new JavascriptInterfaceBase(new WebContentUtils(17));
    public final WebContentUtils IconCompatParcelizer;
    public final IdentityHashMap RemoteActionCompatParcelizer = new IdentityHashMap();
    public ScheduledExecutorService read;

    public static Object IconCompatParcelizer(BrazeWebViewClientsetWebViewClientStateListener11 brazeWebViewClientsetWebViewClientStateListener11) {
        Object obj;
        JavascriptInterfaceBase javascriptInterfaceBase = serializer;
        synchronized (javascriptInterfaceBase) {
            BrazeWebViewClientsetWebViewClientStateListener1 brazeWebViewClientsetWebViewClientStateListener1 = (BrazeWebViewClientsetWebViewClientStateListener1) javascriptInterfaceBase.RemoteActionCompatParcelizer.get(brazeWebViewClientsetWebViewClientStateListener11);
            if (brazeWebViewClientsetWebViewClientStateListener1 == null) {
                brazeWebViewClientsetWebViewClientStateListener1 = new BrazeWebViewClientsetWebViewClientStateListener1(brazeWebViewClientsetWebViewClientStateListener11.RemoteActionCompatParcelizer());
                javascriptInterfaceBase.RemoteActionCompatParcelizer.put(brazeWebViewClientsetWebViewClientStateListener11, brazeWebViewClientsetWebViewClientStateListener1);
            }
            ScheduledFuture scheduledFuture = brazeWebViewClientsetWebViewClientStateListener1.write;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                brazeWebViewClientsetWebViewClientStateListener1.write = null;
            }
            brazeWebViewClientsetWebViewClientStateListener1.read++;
            obj = brazeWebViewClientsetWebViewClientStateListener1.IconCompatParcelizer;
        }
        return obj;
    }

    public static void IconCompatParcelizer(BrazeWebViewClientsetWebViewClientStateListener11 brazeWebViewClientsetWebViewClientStateListener11, Object obj) {
        JavascriptInterfaceBase javascriptInterfaceBase = serializer;
        synchronized (javascriptInterfaceBase) {
            BrazeWebViewClientsetWebViewClientStateListener1 brazeWebViewClientsetWebViewClientStateListener1 = (BrazeWebViewClientsetWebViewClientStateListener1) javascriptInterfaceBase.RemoteActionCompatParcelizer.get(brazeWebViewClientsetWebViewClientStateListener11);
            if (brazeWebViewClientsetWebViewClientStateListener1 == null) {
                throw new IllegalArgumentException("No cached instance found for " + brazeWebViewClientsetWebViewClientStateListener11);
            }
            boolean z = true;
            TextStreamsKt.read("Releasing the wrong instance", obj == brazeWebViewClientsetWebViewClientStateListener1.IconCompatParcelizer);
            TextStreamsKt.RemoteActionCompatParcelizer("Refcount has already reached zero", brazeWebViewClientsetWebViewClientStateListener1.read > 0);
            int i = brazeWebViewClientsetWebViewClientStateListener1.read - 1;
            brazeWebViewClientsetWebViewClientStateListener1.read = i;
            if (i == 0) {
                if (brazeWebViewClientsetWebViewClientStateListener1.write != null) {
                    z = false;
                }
                TextStreamsKt.RemoteActionCompatParcelizer("Destroy task already scheduled", z);
                if (javascriptInterfaceBase.read == null) {
                    javascriptInterfaceBase.IconCompatParcelizer.getClass();
                    javascriptInterfaceBase.read = Executors.newSingleThreadScheduledExecutor(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.IconCompatParcelizer("grpc-shared-destroyer-%d"));
                }
                brazeWebViewClientsetWebViewClientStateListener1.write = javascriptInterfaceBase.read.schedule(new replacePrefetchedUrlsWithLocalAssets(new ImageVectorCacheImageVectorEntry(javascriptInterfaceBase, brazeWebViewClientsetWebViewClientStateListener1, brazeWebViewClientsetWebViewClientStateListener11, obj, 16)), 1L, TimeUnit.SECONDS);
            }
        }
    }

    public JavascriptInterfaceBase(WebContentUtils webContentUtils) {
        this.IconCompatParcelizer = webContentUtils;
    }
}
