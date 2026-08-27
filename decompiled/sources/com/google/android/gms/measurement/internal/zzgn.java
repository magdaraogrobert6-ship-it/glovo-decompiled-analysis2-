package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.MeasureScopelayout1;
import o.Measured;
import o.accessgetSystemNavigationDowncp;
import o.getMeasuredHeight;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgn {
    public final Extras$Key read;
    public static final AtomicReference write = new AtomicReference();
    public static final AtomicReference RemoteActionCompatParcelizer = new AtomicReference();
    public static final AtomicReference serializer = new AtomicReference();

    public final String IconCompatParcelizer(zzbg zzbgVar) {
        String string;
        Extras$Key extras$Key = this.read;
        if (!extras$Key.MediaBrowserCompatMediaItem()) {
            return zzbgVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbgVar.write);
        sb.append(",name=");
        sb.append(write(zzbgVar.IconCompatParcelizer));
        sb.append(",params=");
        zzbe zzbeVar = zzbgVar.read;
        if (zzbeVar == null) {
            string = null;
        } else {
            string = !extras$Key.MediaBrowserCompatMediaItem() ? zzbeVar.read.toString() : read(zzbeVar.write());
        }
        sb.append(string);
        return sb.toString();
    }

    public zzgn(Extras$Key extras$Key) {
        this.read = extras$Key;
    }

    public static final String serializer(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(atomicReference);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String IconCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        if (!this.read.MediaBrowserCompatMediaItem()) {
            return str;
        }
        return serializer(str, getMeasuredHeight.RemoteActionCompatParcelizer, getMeasuredHeight.serializer, RemoteActionCompatParcelizer);
    }

    public final String IconCompatParcelizer(Object[] objArr) {
        String strValueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                strValueOf = read((Bundle) obj);
            } else {
                strValueOf = String.valueOf(obj);
            }
            if (strValueOf != null) {
                if (sbM.length() != 1) {
                    sbM.append(", ");
                }
                sbM.append(strValueOf);
            }
        }
        sbM.append("]");
        return sbM.toString();
    }

    public final String RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        if (!this.read.MediaBrowserCompatMediaItem()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return ff$$ExternalSyntheticOutline0.m("experiment_id(", str, ")");
        }
        return serializer(str, MeasureScopelayout1.RemoteActionCompatParcelizer, MeasureScopelayout1.write, serializer);
    }

    public final String read(Bundle bundle) {
        String strValueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.read.MediaBrowserCompatMediaItem()) {
            return bundle.toString();
        }
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM.length() != 8) {
                sbM.append(", ");
            }
            sbM.append(IconCompatParcelizer(str));
            sbM.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strValueOf = IconCompatParcelizer(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strValueOf = IconCompatParcelizer((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                strValueOf = IconCompatParcelizer(((ArrayList) obj).toArray());
            } else {
                strValueOf = String.valueOf(obj);
            }
            sbM.append(strValueOf);
        }
        sbM.append("}]");
        return sbM.toString();
    }

    public final String write(String str) {
        if (str == null) {
            return null;
        }
        if (!this.read.MediaBrowserCompatMediaItem()) {
            return str;
        }
        return serializer(str, Measured.RemoteActionCompatParcelizer, Measured.IconCompatParcelizer, write);
    }
}
