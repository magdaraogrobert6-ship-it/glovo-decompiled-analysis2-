package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huawei.location.logic.zp;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class setOnCutRequested implements Handler.Callback {
    public final /* synthetic */ zp RemoteActionCompatParcelizer;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Serializable serializable;
        zp zpVar = this.RemoteActionCompatParcelizer;
        Handler handler = (Handler) zpVar.IconCompatParcelizer;
        WindowInfoImplCompanion.serializer(message.what, "MaxWaitTimeManager", new StringBuilder("handleMessage msg what:"));
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) zpVar.serializer;
        if (concurrentHashMap == null) {
            return false;
        }
        int i = message.what;
        Object obj = message.obj;
        if (i == 2147483636) {
            if (!(obj instanceof com.huawei.location.callback.d2)) {
                return false;
            }
            com.huawei.location.callback.d2 d2Var = (com.huawei.location.callback.d2) obj;
            getOnCutRequested getoncutrequested = (getOnCutRequested) concurrentHashMap.get(d2Var);
            if (getoncutrequested == null) {
                WrappedCompositionsetContent1211.read("MaxWaitTimeManager", "updateLocations failed , no find bean");
                return true;
            }
            Bundle data = message.getData();
            if (data != null) {
                try {
                    serializable = data.getSerializable("TAG_BEAN");
                } catch (Throwable th) {
                    SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("getSerializable exception: "), th);
                    serializable = null;
                }
                if (serializable instanceof getOnCutRequested) {
                    List list = ((getOnCutRequested) serializable).IconCompatParcelizer;
                    List list2 = getoncutrequested.IconCompatParcelizer;
                    if (list2 == null) {
                        getoncutrequested.IconCompatParcelizer = list;
                    } else {
                        list2.addAll(list);
                    }
                    ((ConcurrentHashMap) zpVar.serializer).put(d2Var, getoncutrequested);
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "updateLocations success");
                }
            }
            return true;
        }
        if (i == 2147483637) {
            if (!(obj instanceof com.huawei.location.callback.d2)) {
                return false;
            }
            com.huawei.location.callback.d2 d2Var2 = (com.huawei.location.callback.d2) obj;
            getOnCutRequested getoncutrequested2 = (getOnCutRequested) concurrentHashMap.get(d2Var2);
            if (getoncutrequested2 == null) {
                return false;
            }
            handler.removeMessages(getoncutrequested2.read);
            zpVar.serializer(d2Var2, getoncutrequested2);
            ((ConcurrentHashMap) zpVar.serializer).remove(d2Var2);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "removeMaxWaitTimeQueue success");
            return false;
        }
        if (!(obj instanceof com.huawei.location.callback.d2)) {
            return false;
        }
        com.huawei.location.callback.d2 d2Var3 = (com.huawei.location.callback.d2) obj;
        getOnCutRequested getoncutrequested3 = (getOnCutRequested) concurrentHashMap.get(d2Var3);
        if (getoncutrequested3 == null) {
            return false;
        }
        zpVar.serializer(d2Var3, getoncutrequested3);
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = getoncutrequested3.read;
        messageObtainMessage.obj = d2Var3;
        handler.sendMessageDelayed(messageObtainMessage, getoncutrequested3.write);
        return false;
    }

    public setOnCutRequested(zp zpVar) {
        this.RemoteActionCompatParcelizer = zpVar;
    }
}
