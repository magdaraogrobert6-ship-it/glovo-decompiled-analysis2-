package com.huawei.wisesecurity.kfs.validation.metadata;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import o.ProgressBarRangeInfoCompanion;
import o.accessgetSwitchcp;

/* JADX INFO: loaded from: classes2.dex */
public final class BeanMetaData {
    public final String serializer;
    public final ArrayList write = new ArrayList();

    public final void serializer(Class cls) {
        if (cls == null) {
            return;
        }
        serializer(cls.getSuperclass());
        for (Field field : cls.getDeclaredFields()) {
            FieldMetaData fieldMetaData = new FieldMetaData(this.serializer, field);
            if (fieldMetaData.serializer.size() > 0 || fieldMetaData.read != null) {
                this.write.add(fieldMetaData);
            }
        }
    }

    public final void write(Object obj) throws KfsValidationException {
        if (obj == null) {
            return;
        }
        for (FieldMetaData fieldMetaData : this.write) {
            ArrayList arrayList = fieldMetaData.serializer;
            BeanMetaData beanMetaData = fieldMetaData.read;
            if (arrayList.size() > 0 || beanMetaData != null) {
                try {
                    Object obj2 = fieldMetaData.RemoteActionCompatParcelizer.get(obj);
                    Iterator it = fieldMetaData.serializer.iterator();
                    while (it.hasNext()) {
                        ((ProgressBarRangeInfoCompanion) it.next()).getClass();
                    }
                    if (beanMetaData != null) {
                        beanMetaData.write(obj2);
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("field validate failed:");
                    sbIconCompatParcelizer.append(e.getMessage());
                    throw new KfsValidationException(sbIconCompatParcelizer.toString());
                }
            }
        }
    }

    public BeanMetaData(Class cls, String str) {
        String simpleName;
        if (str != null) {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, ".");
            sbM.append(cls.getSimpleName());
            simpleName = sbM.toString();
        } else {
            simpleName = cls.getSimpleName();
        }
        this.serializer = simpleName;
        serializer(cls);
    }
}
