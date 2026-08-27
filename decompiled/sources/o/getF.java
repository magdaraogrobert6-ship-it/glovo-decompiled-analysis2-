package o;

import android.util.Log;
import androidx.cardview.widget.CardView$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class getF {
    public int serializer;
    public final int write;
    public final CardView$1 IconCompatParcelizer = new CardView$1(14);
    public final isHLGishui_graphics read = new isHLGishui_graphics(0);
    public final HashMap RatingCompat = new HashMap();
    public final HashMap RemoteActionCompatParcelizer = new HashMap();

    public final Object IconCompatParcelizer(Class cls, int i) {
        Rgbeotf1 rgbeotf1;
        Object obj;
        int i2;
        synchronized (this) {
            Integer num = (Integer) RemoteActionCompatParcelizer(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.serializer) == 0 || this.write / i2 >= 2 || num.intValue() <= i * 8);
            isHLGishui_graphics ishlgishui_graphics = this.read;
            if (z) {
                int iIntValue = num.intValue();
                isPQishui_graphics ispqishui_graphicsRemoteActionCompatParcelizer = (isPQishui_graphics) ((ArrayDeque) ishlgishui_graphics.IconCompatParcelizer).poll();
                if (ispqishui_graphicsRemoteActionCompatParcelizer == null) {
                    ispqishui_graphicsRemoteActionCompatParcelizer = ishlgishui_graphics.RemoteActionCompatParcelizer();
                }
                rgbeotf1 = (Rgbeotf1) ispqishui_graphicsRemoteActionCompatParcelizer;
                rgbeotf1.serializer(cls, iIntValue);
            } else {
                isPQishui_graphics ispqishui_graphicsRemoteActionCompatParcelizer2 = (isPQishui_graphics) ((ArrayDeque) ishlgishui_graphics.IconCompatParcelizer).poll();
                if (ispqishui_graphicsRemoteActionCompatParcelizer2 == null) {
                    ispqishui_graphicsRemoteActionCompatParcelizer2 = ishlgishui_graphics.RemoteActionCompatParcelizer();
                }
                rgbeotf1 = (Rgbeotf1) ispqishui_graphicsRemoteActionCompatParcelizer2;
                rgbeotf1.serializer(cls, i);
            }
            obj = read(rgbeotf1, cls);
        }
        return obj;
    }

    public final void IconCompatParcelizer(Object obj) {
        synchronized (this) {
            Class<?> cls = obj.getClass();
            Rgboetf1 rgboetf1 = read(cls);
            int iSerializer = rgboetf1.serializer(obj);
            int iWrite = rgboetf1.write() * iSerializer;
            if (iWrite <= this.write / 2) {
                isHLGishui_graphics ishlgishui_graphics = this.read;
                isPQishui_graphics ispqishui_graphicsRemoteActionCompatParcelizer = (isPQishui_graphics) ((ArrayDeque) ishlgishui_graphics.IconCompatParcelizer).poll();
                if (ispqishui_graphicsRemoteActionCompatParcelizer == null) {
                    ispqishui_graphicsRemoteActionCompatParcelizer = ishlgishui_graphics.RemoteActionCompatParcelizer();
                }
                Rgbeotf1 rgbeotf1 = (Rgbeotf1) ispqishui_graphicsRemoteActionCompatParcelizer;
                rgbeotf1.serializer(cls, iSerializer);
                this.IconCompatParcelizer.read(rgbeotf1, obj);
                NavigableMap navigableMapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cls);
                Integer num = (Integer) navigableMapRemoteActionCompatParcelizer.get(Integer.valueOf(rgbeotf1.RemoteActionCompatParcelizer));
                int i = rgbeotf1.RemoteActionCompatParcelizer;
                int iIntValue = 1;
                if (num != null) {
                    iIntValue = 1 + num.intValue();
                }
                navigableMapRemoteActionCompatParcelizer.put(Integer.valueOf(i), Integer.valueOf(iIntValue));
                this.serializer += iWrite;
                RemoteActionCompatParcelizer(this.write);
            }
        }
    }

    public final NavigableMap RemoteActionCompatParcelizer(Class cls) {
        HashMap map = this.RatingCompat;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final Rgboetf1 read(Class cls) {
        Rgboetf1 rgboetf1;
        HashMap map = this.RemoteActionCompatParcelizer;
        Rgboetf1 rgboetf2 = (Rgboetf1) map.get(cls);
        if (rgboetf2 != null) {
            return rgboetf2;
        }
        if (cls.equals(int[].class)) {
            rgboetf1 = new Rgboetf1(1);
        } else {
            if (!cls.equals(byte[].class)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            rgboetf1 = new Rgboetf1(0);
        }
        map.put(cls, rgboetf1);
        return rgboetf1;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        while (this.serializer > i) {
            Object objSerializer = this.IconCompatParcelizer.serializer();
            UrlUtils.read(objSerializer);
            Rgboetf1 rgboetf1 = read(objSerializer.getClass());
            this.serializer -= rgboetf1.write() * rgboetf1.serializer(objSerializer);
            read(objSerializer.getClass(), rgboetf1.serializer(objSerializer));
            if (Log.isLoggable(rgboetf1.serializer(), 2)) {
                rgboetf1.serializer(objSerializer);
            }
        }
    }

    public final Object read(Rgbeotf1 rgbeotf1, Class cls) {
        Rgboetf1 rgboetf1 = read(cls);
        Object objIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(rgbeotf1);
        if (objIconCompatParcelizer != null) {
            this.serializer -= rgboetf1.write() * rgboetf1.serializer(objIconCompatParcelizer);
            read(cls, rgboetf1.serializer(objIconCompatParcelizer));
        }
        if (objIconCompatParcelizer != null) {
            return objIconCompatParcelizer;
        }
        Log.isLoggable(rgboetf1.serializer(), 2);
        return rgboetf1.IconCompatParcelizer(rgbeotf1.RemoteActionCompatParcelizer);
    }

    public getF(int i) {
        this.write = i;
    }

    public final void read(Class cls, int i) {
        NavigableMap navigableMapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cls);
        Integer num = (Integer) navigableMapRemoteActionCompatParcelizer.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
        if (num.intValue() == 1) {
            navigableMapRemoteActionCompatParcelizer.remove(Integer.valueOf(i));
        } else {
            navigableMapRemoteActionCompatParcelizer.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }
}
