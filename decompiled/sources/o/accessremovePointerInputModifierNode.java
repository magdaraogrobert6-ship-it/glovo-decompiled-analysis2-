package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class accessremovePointerInputModifierNode {
    public final Object IconCompatParcelizer;
    public final Object serializer;
    public final Object write;

    public final IllegalArgumentException write() {
        Object obj = this.serializer;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.write);
        return new IllegalArgumentException(d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Multiple entries with same key: ", strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2, " and "), String.valueOf(obj), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.IconCompatParcelizer)));
    }

    public accessremovePointerInputModifierNode(Object obj, Object obj2, Object obj3) {
        this.serializer = obj;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
    }
}
