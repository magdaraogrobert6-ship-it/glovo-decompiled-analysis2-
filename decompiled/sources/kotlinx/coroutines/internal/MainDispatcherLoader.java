package kotlinx.coroutines.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.resetAfterInAppMessageCloselambda2;

/* JADX INFO: loaded from: classes4.dex */
public final class MainDispatcherLoader {
    public static final MainCoroutineDispatcher read;

    static {
        Object obj;
        String strRemoteActionCompatParcelizer = SystemPropsKt.RemoteActionCompatParcelizer("kotlinx.coroutines.fast.service.loader");
        if (strRemoteActionCompatParcelizer != null) {
            Boolean.parseBoolean(strRemoteActionCompatParcelizer);
        }
        List list = resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.serializer(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
        if (mainDispatcherFactory != null) {
            read = mainDispatcherFactory.createDispatcher(list);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
    }
}
