package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.location.lite.common.util.DeviceInfoUtil$DeviceType;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onActionItemClicked {
    public static volatile String IconCompatParcelizer;
    public static volatile String MediaSessionCompatQueueItem;
    public static final String[] RemoteActionCompatParcelizer = {"android.hardware.type.", "android.software."};
    public static volatile String read;
    public static final DeviceInfoUtil$DeviceType[] serializer;
    public static volatile int write;

    static {
        Arrays.asList("kidpad", "kidwatch");
        serializer = new DeviceInfoUtil$DeviceType[]{new DeviceInfoUtil$DeviceType(0, "handset", "default", null, false), new DeviceInfoUtil$DeviceType(1, "pad", "tablet", null, false), new DeviceInfoUtil$DeviceType(2, "watch", "watch", "watch", true), new DeviceInfoUtil$DeviceType(3, "kidwatch", "kidwatch", null, false), new DeviceInfoUtil$DeviceType(4, "tv", "tv", "television", true), new DeviceInfoUtil$DeviceType(4, "tv", "tv", "leanback", true), new DeviceInfoUtil$DeviceType(5, "mobiletv", "mobiletv", null, false), new DeviceInfoUtil$DeviceType(6, "glass", null, null, false), new DeviceInfoUtil$DeviceType(7, "earphone", null, null, false), new DeviceInfoUtil$DeviceType(8, "car", "car", "automotive", false)};
        write = -1;
        MediaSessionCompatQueueItem = "";
        read = "";
        IconCompatParcelizer = "";
    }

    public static int write(Context context) {
        int i;
        int i2;
        int i3;
        if (write != -1 || context == null) {
            WrappedCompositionsetContent1211.read();
            return write;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            WrappedCompositionsetContent1211.read();
            i = -1;
        } else {
            android.content.pm.FeatureInfo[] systemAvailableFeatures = new android.content.pm.FeatureInfo[0];
            try {
                systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
            } catch (RuntimeException unused) {
                WrappedCompositionsetContent1211.read();
            }
            WrappedCompositionsetContent1211.read();
            i = -1;
            for (android.content.pm.FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo != null) {
                    String str = featureInfo.name;
                    if (!TextUtils.isEmpty(str)) {
                        if (str.startsWith("com.huawei.software.features.")) {
                            i3 = 29;
                        } else if (str.startsWith("com.hihonor.software.features.")) {
                            i3 = 30;
                        } else {
                            continue;
                        }
                        String strSubstring = str.substring(i3);
                        for (DeviceInfoUtil$DeviceType deviceInfoUtil$DeviceType : serializer) {
                            if (strSubstring.equals(deviceInfoUtil$DeviceType.IconCompatParcelizer)) {
                                i = deviceInfoUtil$DeviceType.MediaBrowserCompatMediaItem;
                                if (!deviceInfoUtil$DeviceType.RatingCompat) {
                                    break;
                                }
                            }
                        }
                        if (i != -1) {
                            WrappedCompositionsetContent1211.read();
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            WrappedCompositionsetContent1211.read();
            if (i == -1) {
                i = -1;
            } else if (i == 0) {
            }
            WrappedCompositionsetContent1211.read();
            HashSet<String> hashSet = new HashSet();
            for (android.content.pm.FeatureInfo featureInfo2 : systemAvailableFeatures) {
                if (featureInfo2 != null) {
                    String str2 = featureInfo2.name;
                    String strSubstring2 = null;
                    if (!TextUtils.isEmpty(str2)) {
                        String[] strArr = RemoteActionCompatParcelizer;
                        for (int i4 = 0; i4 < 2; i4++) {
                            String str3 = strArr[i4];
                            if (str2.startsWith(str3)) {
                                strSubstring2 = str2.substring(str3.length());
                                break;
                            }
                        }
                        WrappedCompositionsetContent1211.read();
                    }
                    if (!TextUtils.isEmpty(strSubstring2)) {
                        hashSet.add(strSubstring2);
                    }
                }
            }
            hashSet.toString();
            WrappedCompositionsetContent1211.read();
            int i5 = -1;
            for (String str4 : hashSet) {
                for (DeviceInfoUtil$DeviceType deviceInfoUtil$DeviceType2 : serializer) {
                    if (str4.equals((String) deviceInfoUtil$DeviceType2.RemoteActionCompatParcelizer)) {
                        i5 = deviceInfoUtil$DeviceType2.MediaBrowserCompatMediaItem;
                        if (!deviceInfoUtil$DeviceType2.RatingCompat) {
                            break;
                        }
                    }
                }
                if (i5 != -1) {
                    break;
                }
            }
            WrappedCompositionsetContent1211.read();
            if (i5 != -1) {
                i = i5;
            } else {
                WrappedCompositionsetContent1211.read();
                if (TextUtils.isEmpty(SystemPropertiesUtil.RemoteActionCompatParcelizer)) {
                    SystemPropertiesUtil.RemoteActionCompatParcelizer = SystemPropertiesUtil.get("ro.build.characteristics", "");
                }
                String str5 = SystemPropertiesUtil.RemoteActionCompatParcelizer;
                if (TextUtils.isEmpty(str5)) {
                    i2 = -1;
                } else {
                    List listAsList = Arrays.asList(str5.split(",", 10));
                    i2 = -1;
                    for (DeviceInfoUtil$DeviceType deviceInfoUtil$DeviceType3 : serializer) {
                        if (listAsList.contains((String) deviceInfoUtil$DeviceType3.read)) {
                            i2 = deviceInfoUtil$DeviceType3.MediaBrowserCompatMediaItem;
                            if (!deviceInfoUtil$DeviceType3.RatingCompat) {
                                break;
                            }
                        }
                    }
                    if (i2 == -1) {
                        WrappedCompositionsetContent1211.read();
                    }
                }
                WrappedCompositionsetContent1211.read();
                if (i2 != -1) {
                    i = i2;
                }
            }
        }
        if (i != -1) {
            write = i;
        }
        WrappedCompositionsetContent1211.read();
        return i;
    }
}
