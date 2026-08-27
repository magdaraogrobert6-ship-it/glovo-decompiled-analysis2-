package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.common.zzb;
import java.lang.reflect.Field;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvTimerProgrammingcp;
import o.accessgetTwocp;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectWrapper extends zzb implements accessgetTwocp {
    public final Object zza;

    public ObjectWrapper(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.zza = obj;
    }

    public static Object unwrap(accessgetTwocp accessgettwocp) {
        if (accessgettwocp instanceof ObjectWrapper) {
            return ((ObjectWrapper) accessgettwocp).zza;
        }
        IBinder iBinderAsBinder = accessgettwocp.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        int i = 0;
        Field field = null;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer(field);
        if (field.isAccessible()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static accessgetTwocp asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (iInterfaceQueryLocalInterface instanceof accessgetTwocp) {
            return (accessgetTwocp) iInterfaceQueryLocalInterface;
        }
        return new accessgetTvTimerProgrammingcp(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }
}
