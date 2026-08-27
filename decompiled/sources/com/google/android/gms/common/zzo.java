package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import io.sentry.android.core.SentryLogcatAdapter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o.accessgetSwitchCharsetcp;
import o.accessgetSymbolcp;
import o.accessgetSystemHomecp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvSatelliteBscp;
import o.accessgetTvSatelliteCscp;
import o.accessgetTvSatellitecp;
import o.accessgetTvTerrestrialAnalogcp;
import o.accessgetTvTerrestrialDigitalcp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzo {
    public static final accessgetTvSatelliteBscp IconCompatParcelizer;
    public static volatile accessgetSymbolcp RemoteActionCompatParcelizer;
    public static final accessgetTvSatelliteBscp read;
    public static Context serializer;
    public static final Object write;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        new accessgetTvSatelliteBscp("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±".getBytes(charset), 0);
        new accessgetTvSatelliteBscp("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<".getBytes(charset), 1);
        new accessgetTvSatelliteBscp("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí".getBytes(charset), 2);
        new accessgetTvSatelliteBscp("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì".getBytes(charset), 3);
        read = new accessgetTvSatelliteBscp("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0".getBytes(charset), 4);
        IconCompatParcelizer = new accessgetTvSatelliteBscp("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0".getBytes(charset), 5);
        write = new Object();
    }

    public static accessgetTvTerrestrialDigitalcp zzf(String str, accessgetTvSatelliteCscp accessgettvsatellitecscp, boolean z, boolean z2) {
        try {
            IconCompatParcelizer();
            accessgetSystemNavigationDowncp.IconCompatParcelizer(serializer);
            try {
                return ((accessgetSystemHomecp) RemoteActionCompatParcelizer).serializer(new zzt(str, accessgettvsatellitecscp, z, z2), new ObjectWrapper(serializer.getPackageManager())) ? accessgetTvTerrestrialDigitalcp.serializer : new accessgetTvTerrestrialAnalogcp(new accessgetTvSatellitecp(z, str, accessgettvsatellitecscp));
            } catch (RemoteException e) {
                SentryLogcatAdapter.read("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return accessgetTvTerrestrialDigitalcp.read("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            SentryLogcatAdapter.read("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return accessgetTvTerrestrialDigitalcp.read("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    public static void IconCompatParcelizer() {
        if (RemoteActionCompatParcelizer != null) {
            return;
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer(serializer);
        synchronized (write) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = accessgetSwitchCharsetcp.IconCompatParcelizer(DynamiteModule.load(serializer, DynamiteModule.serializer, "com.google.android.gms.googlecertificates").RemoteActionCompatParcelizer("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
