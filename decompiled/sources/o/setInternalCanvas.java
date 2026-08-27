package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class setInternalCanvas {
    public final HashMap IconCompatParcelizer = new HashMap();
    public final HashMap serializer;

    public static void read(List list, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt, Object obj) {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            getNativeCanvas getnativecanvas = (getNativeCanvas) list.get(size);
            Method method = getnativecanvas.RemoteActionCompatParcelizer;
            try {
                int i = getnativecanvas.write;
                if (i == 0) {
                    method.invoke(obj, null);
                } else if (i == 1) {
                    method.invoke(obj, accessisrendernodecompatiblecp);
                } else if (i == 2) {
                    method.invoke(obj, accessisrendernodecompatiblecp, androidColorSpace_androidKt);
                }
            } catch (IllegalAccessException e) {
                DrawableTransformation.read((Throwable) e);
                return;
            } catch (InvocationTargetException e2) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Failed to call observer method", e2.getCause());
                return;
            }
        }
    }

    public setInternalCanvas(HashMap map) {
        this.serializer = map;
        for (Map.Entry entry : map.entrySet()) {
            AndroidColorSpace_androidKt androidColorSpace_androidKt = (AndroidColorSpace_androidKt) entry.getValue();
            List arrayList = (List) this.IconCompatParcelizer.get(androidColorSpace_androidKt);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.IconCompatParcelizer.put(androidColorSpace_androidKt, arrayList);
            }
            arrayList.add((getNativeCanvas) entry.getKey());
        }
    }
}
