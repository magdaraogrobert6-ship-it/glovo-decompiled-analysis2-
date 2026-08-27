package o;

import com.deliveryhero.perseus.RemoteFunctionKt$onRemoteFunction$1;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ImageVectorBuilder {
    public static final int write(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] write(Object[] objArr, int i, int i2, r8lambdazCa9f5hibLISCeY3u5lKyCauzY r8lambdazca9f5hibliscey3u5lkycauzy) {
        Object[] objArr2 = new Object[objArr.length - 1];
        onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, objArr2);
        onContentCardClicked.write(i, i + 2, i2, objArr, objArr2);
        objArr2[i2 - 2] = r8lambdazca9f5hibliscey3u5lkycauzy;
        onContentCardClicked.write(i2 - 1, i2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] IconCompatParcelizer(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, objArr2);
        onContentCardClicked.write(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void RemoteActionCompatParcelizer(Map map) {
        String string;
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(key, string);
        }
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer), null, null, new RemoteFunctionKt$onRemoteFunction$1(linkedHashMap, (ShortNewsContentCardView) null, 0), 3);
    }

    public static final Object[] read(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        onContentCardClicked.write(i + 2, i + 1, objArr.length, objArrCopyOf, objArrCopyOf);
        onContentCardClicked.write(i2 + 2, i2, i, objArrCopyOf, objArrCopyOf);
        objArrCopyOf[i2] = obj;
        objArrCopyOf[i2 + 1] = obj2;
        return objArrCopyOf;
    }

    public static final Object[] write(int i, Object obj, Object obj2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length + 2];
        onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, objArr2);
        onContentCardClicked.write(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] write(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, objArr2);
        onContentCardClicked.write(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }
}
