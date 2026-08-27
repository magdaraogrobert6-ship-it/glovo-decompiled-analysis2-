package o;

import android.graphics.Bitmap;
import androidx.cardview.widget.CardView$1;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class TransferParametersKt {
    public static final Bitmap.Config[] IconCompatParcelizer;
    public static final Bitmap.Config[] RemoteActionCompatParcelizer;
    public static final Bitmap.Config[] read;
    public static final Bitmap.Config[] serializer;
    public static final Bitmap.Config[] write;
    public final isHLGishui_graphics MediaBrowserCompatMediaItem = new isHLGishui_graphics(1);
    public final CardView$1 MediaSessionCompatQueueItem = new CardView$1(14);
    public final HashMap MediaDescriptionCompat = new HashMap();

    public final Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iSerializer = Fill.serializer(config) * i * i2;
        isHLGishui_graphics ishlgishui_graphics = this.MediaBrowserCompatMediaItem;
        isPQishui_graphics ispqishui_graphicsRemoteActionCompatParcelizer = (isPQishui_graphics) ((ArrayDeque) ishlgishui_graphics.IconCompatParcelizer).poll();
        if (ispqishui_graphicsRemoteActionCompatParcelizer == null) {
            ispqishui_graphicsRemoteActionCompatParcelizer = ishlgishui_graphics.RemoteActionCompatParcelizer();
        }
        isSpecialG isspecialg = (isSpecialG) ispqishui_graphicsRemoteActionCompatParcelizer;
        isspecialg.RemoteActionCompatParcelizer(iSerializer, config);
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = IconCompatParcelizer;
        } else {
            int i3 = accessisSpecialG.RemoteActionCompatParcelizer[config.ordinal()];
            if (i3 == 1) {
                configArr = RemoteActionCompatParcelizer;
            } else if (i3 == 2) {
                configArr = serializer;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : read;
            } else {
                configArr = write;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) IconCompatParcelizer(config2).ceilingKey(Integer.valueOf(iSerializer));
            if (num != null && num.intValue() <= iSerializer * 8) {
                if (num.intValue() == iSerializer && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                ishlgishui_graphics.RemoteActionCompatParcelizer(isspecialg);
                int iIntValue = num.intValue();
                isPQishui_graphics ispqishui_graphicsRemoteActionCompatParcelizer2 = (isPQishui_graphics) ((ArrayDeque) ishlgishui_graphics.IconCompatParcelizer).poll();
                if (ispqishui_graphicsRemoteActionCompatParcelizer2 == null) {
                    ispqishui_graphicsRemoteActionCompatParcelizer2 = ishlgishui_graphics.RemoteActionCompatParcelizer();
                }
                isspecialg = (isSpecialG) ispqishui_graphicsRemoteActionCompatParcelizer2;
                isspecialg.RemoteActionCompatParcelizer(iIntValue, config2);
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.MediaSessionCompatQueueItem.IconCompatParcelizer(isspecialg);
        if (bitmap != null) {
            RemoteActionCompatParcelizer(Integer.valueOf(isspecialg.write), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap IconCompatParcelizer(Bitmap.Config config) {
        HashMap map = this.MediaDescriptionCompat;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final String toString() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("SizeConfigStrategy{groupedMap=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", sortedSizes=(");
        HashMap map = this.MediaDescriptionCompat;
        for (Map.Entry entry : map.entrySet()) {
            sbM.append(entry.getKey());
            sbM.append('[');
            sbM.append(entry.getValue());
            sbM.append("], ");
        }
        if (!map.isEmpty()) {
            sbM.replace(sbM.length() - 2, sbM.length(), "");
        }
        sbM.append(")}");
        return sbM.toString();
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        RemoteActionCompatParcelizer = configArr;
        IconCompatParcelizer = configArr;
        serializer = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        write = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        read = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String serializer(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void RemoteActionCompatParcelizer(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapIconCompatParcelizer = IconCompatParcelizer(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapIconCompatParcelizer.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapIconCompatParcelizer.remove(num);
                return;
            } else {
                navigableMapIconCompatParcelizer.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strSerializer = serializer(Fill.RemoteActionCompatParcelizer(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strSerializer);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    public final void read(Bitmap bitmap) {
        int iRemoteActionCompatParcelizer = Fill.RemoteActionCompatParcelizer(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        isHLGishui_graphics ishlgishui_graphics = this.MediaBrowserCompatMediaItem;
        isPQishui_graphics ispqishui_graphicsRemoteActionCompatParcelizer = (isPQishui_graphics) ((ArrayDeque) ishlgishui_graphics.IconCompatParcelizer).poll();
        if (ispqishui_graphicsRemoteActionCompatParcelizer == null) {
            ispqishui_graphicsRemoteActionCompatParcelizer = ishlgishui_graphics.RemoteActionCompatParcelizer();
        }
        isSpecialG isspecialg = (isSpecialG) ispqishui_graphicsRemoteActionCompatParcelizer;
        isspecialg.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, config);
        this.MediaSessionCompatQueueItem.read(isspecialg, bitmap);
        NavigableMap navigableMapIconCompatParcelizer = IconCompatParcelizer(bitmap.getConfig());
        Integer num = (Integer) navigableMapIconCompatParcelizer.get(Integer.valueOf(isspecialg.write));
        navigableMapIconCompatParcelizer.put(Integer.valueOf(isspecialg.write), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }
}
