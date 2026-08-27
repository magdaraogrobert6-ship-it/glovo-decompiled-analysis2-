package o;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetNodeToNodeStatep {
    public static void IconCompatParcelizer(toAccessibilityCollectionItemInfo toaccessibilitycollectioniteminfo) {
        if (toaccessibilitycollectioniteminfo == null) {
            Log.e("LogWriteApi", "logWriteParam is null stop init LogWriteManager");
            return;
        }
        Wrapper_androidKtsetContent1 wrapper_androidKtsetContent1 = Wrapper_androidKtsetContent1.RemoteActionCompatParcelizer;
        wrapper_androidKtsetContent1.getClass();
        synchronized (Wrapper_androidKtsetContent1.write) {
            if (!wrapper_androidKtsetContent1.MediaMetadataCompat) {
                if (TextUtils.isEmpty(toaccessibilitycollectioniteminfo.serializer)) {
                    return;
                }
                wrapper_androidKtsetContent1.MediaBrowserCompatMediaItem = toaccessibilitycollectioniteminfo.serializer;
                wrapper_androidKtsetContent1.MediaSessionCompatQueueItem = toaccessibilitycollectioniteminfo.IconCompatParcelizer;
                wrapper_androidKtsetContent1.read = toaccessibilitycollectioniteminfo.write;
                wrapper_androidKtsetContent1.IconCompatParcelizer = toaccessibilitycollectioniteminfo.RemoteActionCompatParcelizer;
                r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy = new r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY();
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = new ConcurrentHashMap();
                r8lambdacyuxafptvn7drfel1dgtevxcy.IconCompatParcelizer = null;
                wrapper_androidKtsetContent1.RatingCompat = r8lambdacyuxafptvn7drfel1dgtevxcy;
                isLazyCollection islazycollection = wrapper_androidKtsetContent1.PlaybackStateCompat;
                try {
                    if (!wrapper_androidKtsetContent1.MediaDescriptionCompat) {
                        wrapper_androidKtsetContent1.MediaDescriptionCompat = true;
                        islazycollection.setName("LogWriteThread");
                        islazycollection.start();
                    }
                } catch (IllegalThreadStateException | Exception unused) {
                    wrapper_androidKtsetContent1.MediaDescriptionCompat = false;
                    wrapper_androidKtsetContent1.MediaMetadataCompat = false;
                }
                wrapper_androidKtsetContent1.MediaMetadataCompat = true;
            }
        }
    }

    public static void read(String str, String str2) {
        if (r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.write) {
            int iMyPid = Process.myPid();
            int iMyTid = Process.myTid();
            Wrapper_androidKtsetContent1 wrapper_androidKtsetContent1 = Wrapper_androidKtsetContent1.RemoteActionCompatParcelizer;
            wrapper_androidKtsetContent1.serializer.offer(new Wrapper_androidKt("I", IconCompatParcelizer(iMyPid, iMyTid, str), str2));
        }
    }

    public static void serializer(String str, String str2) {
        if (r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.write) {
            int iMyPid = Process.myPid();
            int iMyTid = Process.myTid();
            Wrapper_androidKtsetContent1 wrapper_androidKtsetContent1 = Wrapper_androidKtsetContent1.RemoteActionCompatParcelizer;
            wrapper_androidKtsetContent1.serializer.offer(new Wrapper_androidKt("E", IconCompatParcelizer(iMyPid, iMyTid, str), str2));
        }
    }

    public static String IconCompatParcelizer(int i, int i2, String str) {
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i, i2, "(", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, ")");
        sbM.append(str);
        return sbM.toString();
    }
}
