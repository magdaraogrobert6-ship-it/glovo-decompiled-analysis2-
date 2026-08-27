package o;

import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class setDelegateui {
    public final Object IconCompatParcelizer;
    public final Object serializer;
    public final Object write;

    public setDelegateui(Object obj, Object obj2, Object obj3) {
        this.write = obj;
        this.IconCompatParcelizer = obj2;
        this.serializer = obj3;
    }

    public final IllegalArgumentException RemoteActionCompatParcelizer() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.write;
        sb.append(obj);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(this.IconCompatParcelizer);
        sb.append(" and ");
        sb.append(obj);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(this.serializer);
        return new IllegalArgumentException(sb.toString());
    }
}
