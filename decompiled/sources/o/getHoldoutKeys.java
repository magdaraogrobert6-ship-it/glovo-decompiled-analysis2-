package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class getHoldoutKeys implements InvocationHandler {
    public final /* synthetic */ Class RemoteActionCompatParcelizer;
    public final /* synthetic */ getHoldoutVariation read;
    public final Object[] write = new Object[0];

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        startCoroutineTimer startcoroutinetimerIconCompatParcelizer;
        startCoroutineTimer startcoroutinetimer;
        Class cls = this.RemoteActionCompatParcelizer;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.write;
        }
        getChangeVersionControl getchangeversioncontrol = ProtoErrorMsgCompanion.write;
        if (getchangeversioncontrol.write(method)) {
            return getchangeversioncontrol.write(method, cls, obj, objArr);
        }
        getHoldoutVariation getholdoutvariation = this.read;
        while (true) {
            Object objPutIfAbsent = getholdoutvariation.MediaMetadataCompat.get(method);
            if (!(objPutIfAbsent instanceof startCoroutineTimer)) {
                if (objPutIfAbsent == null) {
                    Object obj2 = new Object();
                    synchronized (obj2) {
                        objPutIfAbsent = getholdoutvariation.MediaMetadataCompat.putIfAbsent(method, obj2);
                        if (objPutIfAbsent == null) {
                            try {
                                startcoroutinetimerIconCompatParcelizer = startCoroutineTimer.IconCompatParcelizer(getholdoutvariation, cls, method);
                                getholdoutvariation.MediaMetadataCompat.put(method, startcoroutinetimerIconCompatParcelizer);
                            } catch (Throwable th) {
                                getholdoutvariation.MediaMetadataCompat.remove(method);
                                throw th;
                            }
                        }
                    }
                }
                synchronized (objPutIfAbsent) {
                    Object obj3 = getholdoutvariation.MediaMetadataCompat.get(method);
                    if (obj3 != null) {
                        startcoroutinetimer = (startCoroutineTimer) obj3;
                    }
                }
                break;
            }
            startcoroutinetimerIconCompatParcelizer = (startCoroutineTimer) objPutIfAbsent;
            startcoroutinetimer = startcoroutinetimerIconCompatParcelizer;
        }
        return startcoroutinetimer.adapt(new writeSelffwf_client_release(startcoroutinetimer.write, obj, objArr, startcoroutinetimer.IconCompatParcelizer, startcoroutinetimer.RemoteActionCompatParcelizer), objArr);
    }

    public getHoldoutKeys(getHoldoutVariation getholdoutvariation, Class cls) {
        this.read = getholdoutvariation;
        this.RemoteActionCompatParcelizer = cls;
    }
}
