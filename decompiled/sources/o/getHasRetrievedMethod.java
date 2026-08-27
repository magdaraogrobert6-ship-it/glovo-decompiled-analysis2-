package o;

import android.os.Looper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hmf.tasks.a.d$a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getHasRetrievedMethod {
    public static Object read(setShouldUseDispatchDrawui setshouldusedispatchdrawui) {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("await must not be called on the UI thread");
            return null;
        }
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = (ViewLayerUniqueDrawingIdApi29) setshouldusedispatchdrawui;
        synchronized (viewLayerUniqueDrawingIdApi29.read) {
            z = viewLayerUniqueDrawingIdApi29.write;
        }
        if (z) {
            if (setshouldusedispatchdrawui.serializer()) {
                return setshouldusedispatchdrawui.IconCompatParcelizer();
            }
            throw new ExecutionException(setshouldusedispatchdrawui.read());
        }
        ViewRootForInspector viewRootForInspector = new ViewRootForInspector();
        viewLayerUniqueDrawingIdApi29.read((resetClipBounds) new accessgetViewRootjd((Executor) getShouldUseDispatchDraw.write.read, (getOutlineProvider) viewRootForInspector));
        viewLayerUniqueDrawingIdApi29.write(viewRootForInspector);
        viewRootForInspector.read.await();
        if (setshouldusedispatchdrawui.serializer()) {
            return setshouldusedispatchdrawui.IconCompatParcelizer();
        }
        throw new ExecutionException(setshouldusedispatchdrawui.read());
    }

    public static ViewLayerUniqueDrawingIdApi29 serializer(Callable callable) {
        ThreadPoolExecutor threadPoolExecutor = getShouldUseDispatchDraw.write.IconCompatParcelizer;
        ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1 = new ViewLayerCompanionOutlineProvider1();
        try {
            threadPoolExecutor.execute(new d$a(viewLayerCompanionOutlineProvider1, callable, false, 3));
        } catch (Exception e) {
            viewLayerCompanionOutlineProvider1.read(e);
        }
        return viewLayerCompanionOutlineProvider1.RemoteActionCompatParcelizer;
    }
}
