package io.sentry.android.core.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.TuplesKt;
import o.UriActionExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class RatingCompat {
    public static final RatingCompat read = new RatingCompat();
    public final io.sentry.util.RemoteActionCompatParcelizer write = new io.sentry.util.RemoteActionCompatParcelizer();
    public final ArrayList serializer = new ArrayList();

    public final ArrayList IconCompatParcelizer() {
        ArrayList arrayList = this.serializer;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
        try {
            if (!arrayList.isEmpty()) {
                uriActionExternalSyntheticLambda4Serializer.close();
                return arrayList;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                uriActionExternalSyntheticLambda4Serializer.close();
                return arrayList2;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strRemoteActionCompatParcelizer = TuplesKt.RemoteActionCompatParcelizer(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strRemoteActionCompatParcelizer != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(strRemoteActionCompatParcelizer.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
