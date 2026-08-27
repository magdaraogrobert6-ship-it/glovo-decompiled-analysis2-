package o;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class getShouldUseDispatchDraw {
    public static final getShouldUseDispatchDraw write = new getShouldUseDispatchDraw();
    public final ThreadPoolExecutor IconCompatParcelizer;
    public final accessgetSubCompositionViewjd read;

    public getShouldUseDispatchDraw() {
        ViewLayerCompaniongetMatrix1 viewLayerCompaniongetMatrix1 = ViewLayerCompaniongetMatrix1.write;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(ViewLayerCompaniongetMatrix1.IconCompatParcelizer, ViewLayerCompaniongetMatrix1.read, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.IconCompatParcelizer = threadPoolExecutor;
        this.read = ViewLayerCompaniongetMatrix1.write.RemoteActionCompatParcelizer;
    }
}
