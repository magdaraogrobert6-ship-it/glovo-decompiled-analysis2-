package o;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.lite.common.adapter.LocationTrackerAdapter;
import com.huawei.location.lite.common.report.ReportBuilder;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionInfo_androidKttoAccessibilityCollectionItemInfo1 {
    public static final byte[] IconCompatParcelizer = new byte[0];
    public static volatile CollectionInfo_androidKttoAccessibilityCollectionItemInfo1 RemoteActionCompatParcelizer;
    public final toAutofillIdCompat MediaDescriptionCompat;
    public final AtomicBoolean write = new AtomicBoolean(false);
    public final HashMap read = new HashMap(16, 0.85f);
    public final HashMap serializer = new HashMap(16, 0.85f);
    public volatile boolean RatingCompat = false;

    public final void RemoteActionCompatParcelizer(int i, String str, LinkedHashMap linkedHashMap) {
        synchronized (this) {
            if (LocationTrackerAdapter.isLocationTrackerEnable()) {
                String[] strArr = onActionItemClicked.RemoteActionCompatParcelizer;
                if (TextUtils.equals(SystemPropertiesUtil.get("ro.vendor.market.type", ""), "KidWatch")) {
                    WrappedCompositionsetContent1211.write("LocationTracker", "not support device,not event");
                    return;
                }
                if (IconCompatParcelizer(i, str, linkedHashMap)) {
                    return;
                }
                if (!HmsHiAnalyticsUtils.getInitFlag()) {
                    WrappedCompositionsetContent1211.read();
                } else {
                    WrappedCompositionsetContent1211.read();
                    HmsHiAnalyticsUtils.onEvent(i, str, (LinkedHashMap<String, String>) linkedHashMap);
                }
            }
        }
    }

    public final void write(HashMap map) {
        synchronized (map) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (TextUtils.isEmpty((CharSequence) entry.getKey())) {
                        WrappedCompositionsetContent1211.read("LocationTracker", "mapEntry.getKey() == null");
                    } else {
                        String str = (String) entry.getKey();
                        if (!TextUtils.isEmpty(str)) {
                            str = str.split("\\|")[1];
                        }
                        int i = Integer.parseInt(str);
                        String str2 = (String) entry.getKey();
                        if (!TextUtils.isEmpty(str2)) {
                            str2 = str2.split("\\|")[0];
                        }
                        RemoteActionCompatParcelizer(i, str2, (LinkedHashMap) entry.getValue());
                    }
                }
                map.clear();
            }
        }
    }

    public final boolean IconCompatParcelizer(int i, String str, LinkedHashMap linkedHashMap) {
        if (this.write.get()) {
            return false;
        }
        WrappedCompositionsetContent1211.read();
        if (i == 0) {
            synchronized (this.serializer) {
                if (this.serializer.size() > 100) {
                    this.serializer.clear();
                    WrappedCompositionsetContent1211.read();
                }
                this.serializer.put(IconCompatParcelizer(i, str), linkedHashMap);
            }
        } else if (1 == i) {
            synchronized (this.read) {
                if (this.read.size() > 100) {
                    this.read.clear();
                    WrappedCompositionsetContent1211.read();
                }
                this.read.put(IconCompatParcelizer(i, str), linkedHashMap);
            }
        } else {
            WrappedCompositionsetContent1211.read();
        }
        if (this.write.get()) {
            return true;
        }
        this.MediaDescriptionCompat.sendEmptyMessage(2);
        return true;
    }

    public static CollectionInfo_androidKttoAccessibilityCollectionItemInfo1 write() {
        if (RemoteActionCompatParcelizer == null) {
            synchronized (IconCompatParcelizer) {
                if (RemoteActionCompatParcelizer == null) {
                    RemoteActionCompatParcelizer = new CollectionInfo_androidKttoAccessibilityCollectionItemInfo1();
                }
            }
        }
        return RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(ReportBuilder reportBuilder) {
        RemoteActionCompatParcelizer(0, reportBuilder.getEventId(), reportBuilder.build());
    }

    public final void read(ReportBuilder reportBuilder) {
        toAutofillIdCompat toautofillidcompat;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationTracker", "onMaintEvent:" + reportBuilder.build().toString());
        RemoteActionCompatParcelizer(1, reportBuilder.getEventId(), reportBuilder.build());
        if (this.RatingCompat || (toautofillidcompat = this.MediaDescriptionCompat) == null) {
            return;
        }
        toautofillidcompat.sendEmptyMessageDelayed(1, 3600000L);
        this.RatingCompat = true;
    }

    public CollectionInfo_androidKttoAccessibilityCollectionItemInfo1() {
        HandlerThread handlerThread = new HandlerThread("Location-Full-LocationTracker");
        handlerThread.start();
        this.MediaDescriptionCompat = new toAutofillIdCompat(this, handlerThread.getLooper(), 4);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationTracker", "LocationTracker init");
    }

    public static void read() {
        if (LocationTrackerAdapter.isLocationTrackerEnable()) {
            String[] strArr = onActionItemClicked.RemoteActionCompatParcelizer;
            if (TextUtils.equals(SystemPropertiesUtil.get("ro.vendor.market.type", ""), "KidWatch")) {
                WrappedCompositionsetContent1211.write("LocationTracker", "not support device,not onReport");
            } else if (HmsHiAnalyticsUtils.getInitFlag()) {
                WrappedCompositionsetContent1211.read();
                HmsHiAnalyticsUtils.onReport();
            }
        }
    }

    public static String IconCompatParcelizer(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + UUID.randomUUID().toString();
    }
}
