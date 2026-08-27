package o;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setServerTargetandroid_sdk_base_release {
    public static final double IconCompatParcelizer(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static void RemoteActionCompatParcelizer(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    public static final double IconCompatParcelizer(setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release, setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release2) {
        setlargenotificationiconnameandroid_sdk_base_release.getClass();
        setlargenotificationiconnameandroid_sdk_base_release2.getClass();
        double d = setlargenotificationiconnameandroid_sdk_base_release2.a;
        double d2 = setlargenotificationiconnameandroid_sdk_base_release.a;
        double dIconCompatParcelizer = IconCompatParcelizer(d - d2);
        double dIconCompatParcelizer2 = IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release2.b - setlargenotificationiconnameandroid_sdk_base_release.b);
        double dIconCompatParcelizer3 = IconCompatParcelizer(d2);
        double dIconCompatParcelizer4 = IconCompatParcelizer(d);
        double dPow = Math.pow(Math.sin(dIconCompatParcelizer / 2.0d), 2.0d);
        double dPow2 = Math.pow(Math.sin(dIconCompatParcelizer2 / 2.0d), 2.0d);
        double dCos = (Math.cos(dIconCompatParcelizer4) * Math.cos(dIconCompatParcelizer3) * dPow2) + dPow;
        return Math.atan2(Math.sqrt(dCos), Math.sqrt(1.0d - dCos)) * 2.0d * 6371008.8d;
    }

    public static final boolean serializer(setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release, setSdkAuthEnabledandroid_sdk_base_release setsdkauthenabledandroid_sdk_base_release, boolean z) {
        Iterator it = setsdkauthenabledandroid_sdk_base_release.a.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = ((setIsHtmlInAppMessageApplyWindowInsetsEnabled) it.next()).a;
            setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release2 = (setLargeNotificationIconNameandroid_sdk_base_release) onviewattachedtowindowlambda0.serializer;
            double d = setlargenotificationiconnameandroid_sdk_base_release2.b;
            double d2 = setlargenotificationiconnameandroid_sdk_base_release2.a;
            setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release3 = (setLargeNotificationIconNameandroid_sdk_base_release) onviewattachedtowindowlambda0.write;
            double d3 = setlargenotificationiconnameandroid_sdk_base_release3.b;
            double d4 = setlargenotificationiconnameandroid_sdk_base_release3.a;
            double d5 = setlargenotificationiconnameandroid_sdk_base_release.a;
            double d6 = setlargenotificationiconnameandroid_sdk_base_release.b;
            double d7 = d3 - d6;
            if (((d6 - d) * d4) + (d7 * d2) + ((d - d3) * d5) == 0.0d && (d - d6) * d7 <= 0.0d && (d4 - d5) * (d2 - d5) <= 0.0d) {
                return !z;
            }
            if ((d2 > d5) != (d4 > d5) && d6 < (((d5 - d2) * (d3 - d)) / (d4 - d2)) + d) {
                z2 = !z2;
            }
        }
        return z2;
    }

    public static final setLargeNotificationIconNameandroid_sdk_base_release read(setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release, double d, double d2) {
        double dIconCompatParcelizer = IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release.b);
        double dIconCompatParcelizer2 = IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release.a);
        double dIconCompatParcelizer3 = IconCompatParcelizer(d2);
        double d3 = d / 6371008.8d;
        double dSin = Math.sin(dIconCompatParcelizer2);
        double dCos = Math.cos(d3);
        double dCos2 = Math.cos(dIconCompatParcelizer2);
        double dAsin = Math.asin((Math.cos(dIconCompatParcelizer3) * Math.sin(d3) * dCos2) + (dCos * dSin));
        double dSin2 = Math.sin(dIconCompatParcelizer3);
        double dSin3 = Math.sin(d3);
        return new setLargeNotificationIconNameandroid_sdk_base_release((dAsin * 180.0d) / 3.141592653589793d, ((Math.atan2(Math.cos(dIconCompatParcelizer2) * (dSin3 * dSin2), Math.cos(d3) - (Math.sin(dAsin) * Math.sin(dIconCompatParcelizer2))) + dIconCompatParcelizer) * 180.0d) / 3.141592653589793d);
    }
}
