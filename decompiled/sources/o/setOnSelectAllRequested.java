package o;

import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.location.logic.zp;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setOnSelectAllRequested {
    public static final zp serializer;

    static {
        zp zpVar = new zp(0);
        zpVar.write = 0;
        zpVar.serializer = new ConcurrentHashMap();
        HandlerThread handlerThread = new HandlerThread("MaxWaitTimeManager");
        handlerThread.start();
        zpVar.IconCompatParcelizer = new Handler(handlerThread.getLooper(), new setOnCutRequested(zpVar));
        serializer = zpVar;
    }
}
