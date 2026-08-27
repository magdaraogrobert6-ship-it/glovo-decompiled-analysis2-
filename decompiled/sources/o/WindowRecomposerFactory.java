package o;

import android.location.Location;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowRecomposerFactory {
    public static volatile WindowRecomposerFactory IconCompatParcelizer;
    public static final byte[] RemoteActionCompatParcelizer = new byte[0];
    public ConcurrentHashMap read;
    public Location serializer;

    public final void write(getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui) {
        ConcurrentHashMap concurrentHashMap = this.read;
        com.huawei.location.callback.d2 d2Var = getglobalkeyboardmodifiersui.IconCompatParcelizer;
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = getglobalkeyboardmodifiersui.write;
        if (d2Var == null) {
            return;
        }
        concurrentHashMap.put(requestLocationUpdatesRequest.getUuid(), getglobalkeyboardmodifiersui);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RequestRecordCache", "add requestCache end, uuid is " + requestLocationUpdatesRequest.getUuid() + "," + concurrentHashMap.size());
    }

    public static WindowRecomposerFactory read() {
        if (IconCompatParcelizer == null) {
            synchronized (RemoteActionCompatParcelizer) {
                if (IconCompatParcelizer == null) {
                    WindowRecomposerFactory windowRecomposerFactory = new WindowRecomposerFactory();
                    windowRecomposerFactory.read = new ConcurrentHashMap(11);
                    IconCompatParcelizer = windowRecomposerFactory;
                }
            }
        }
        return IconCompatParcelizer;
    }

    public final boolean read(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.read.containsKey(str);
    }
}
