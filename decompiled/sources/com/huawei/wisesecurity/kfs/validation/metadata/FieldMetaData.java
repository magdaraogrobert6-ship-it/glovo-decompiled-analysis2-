package com.huawei.wisesecurity.kfs.validation.metadata;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.kfs.validation.core.ConstraintHelper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import o.ProgressBarRangeInfoCompanion;
import o.accessgetPolitecp;
import o.getRowSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldMetaData {
    public final String IconCompatParcelizer;
    public final Field RemoteActionCompatParcelizer;
    public final BeanMetaData read;
    public final ArrayList serializer = new ArrayList();

    public FieldMetaData(String str, Field field) throws KfsValidationException {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = field;
        field.setAccessible(true);
        for (Annotation annotation : field.getDeclaredAnnotations()) {
            if (((getRowSpan) annotation.annotationType().getAnnotation(getRowSpan.class)) != null) {
                if (annotation.annotationType() != accessgetPolitecp.class) {
                    ArrayList arrayList = this.serializer;
                    String str2 = this.IconCompatParcelizer + "." + this.RemoteActionCompatParcelizer.getName();
                    Class<?> type = field.getType();
                    ProgressBarRangeInfoCompanion progressBarRangeInfoCompanion = new ProgressBarRangeInfoCompanion();
                    try {
                        if (ConstraintHelper.serializer(annotation.annotationType(), type).newInstance() != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(progressBarRangeInfoCompanion);
                    } catch (IllegalAccessException | InstantiationException e) {
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("create constraint meta data for field:", str2, " failed, ");
                        sbM.append(e.getMessage());
                        throw new KfsValidationException(sbM.toString());
                    }
                } else {
                    this.read = new BeanMetaData(field.getType(), str);
                }
            }
        }
    }
}
