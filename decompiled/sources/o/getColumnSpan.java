package o;

import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.kfs.validation.metadata.BeanMetaData;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getColumnSpan {
    public static final ConcurrentHashMap serializer = new ConcurrentHashMap();

    public static void RemoteActionCompatParcelizer(Object obj) throws KfsValidationException {
        BeanMetaData beanMetaData;
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = serializer;
        if (concurrentHashMap.containsKey(cls)) {
            beanMetaData = (BeanMetaData) concurrentHashMap.get(cls);
        } else {
            BeanMetaData beanMetaData2 = new BeanMetaData(cls, null);
            concurrentHashMap.put(cls, beanMetaData2);
            beanMetaData = beanMetaData2;
        }
        if (beanMetaData.write.size() > 0) {
            beanMetaData.write(obj);
        }
    }
}
