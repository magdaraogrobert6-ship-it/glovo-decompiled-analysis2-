package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.Optional;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "RequiredEventsCache", memCacheName = "RequiredEventsCache")
public class setSummaryTextIfPresentAndSupported {
    private final getVerticalAccuracy IconCompatParcelizer;
    private final parseLonglambda0 read;
    private final migratePushDeliveryEventsToJsonlambda10 write;

    private String IconCompatParcelizer(Class cls, Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> cls2) {
        synchronized (this) {
            this.IconCompatParcelizer.getClass();
            Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(cls2);
            if (optionalIconCompatParcelizer.read()) {
                return null;
            }
            return cls.getName() + "//" + String.valueOf(((Integer) optionalIconCompatParcelizer.write()).intValue());
        }
    }

    public final HashMap read() {
        HashMap map;
        synchronized (this) {
            map = new HashMap();
            for (String str : this.write.IconCompatParcelizer()) {
                try {
                    int i = Integer.parseInt(str.substring(str.lastIndexOf("//") + 2));
                    this.IconCompatParcelizer.getClass();
                    Class clsWrite = getVerticalAccuracy.write(i);
                    Long l = (Long) this.write.RemoteActionCompatParcelizer(str);
                    if (clsWrite != null && l != null) {
                        if (!map.containsKey(clsWrite)) {
                            map.put(clsWrite, l);
                        } else if (l.longValue() < ((Long) map.get(clsWrite)).longValue()) {
                            map.put(clsWrite, l);
                        }
                    }
                } catch (NumberFormatException e) {
                    this.read.IconCompatParcelizer(false, e, "Cannot parse event type from key: " + str, new Object[0]);
                }
            }
        }
        return map;
    }

    public setSummaryTextIfPresentAndSupported(migratePushDeliveryEventsToJsonlambda10 migratepushdeliveryeventstojsonlambda10, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0) {
        this.write = migratepushdeliveryeventstojsonlambda10;
        this.IconCompatParcelizer = getverticalaccuracy;
        this.read = parselonglambda0;
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.write.RemoteActionCompatParcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer(Class cls, Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> cls2, long j) {
        synchronized (this) {
            if (cls2 == null) {
                return;
            }
            String strIconCompatParcelizer = IconCompatParcelizer(cls, cls2);
            if (strIconCompatParcelizer == null) {
                return;
            }
            this.write.read(strIconCompatParcelizer, Long.valueOf(j));
        }
    }
}
