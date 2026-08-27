package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class addRulerReader {
    public static final accessgetApproachSetp IconCompatParcelizer;
    public static final accessgetApproachSetp MediaBrowserCompatMediaItem;
    public static final undelegateUnprotectedui RemoteActionCompatParcelizer = undelegateUnprotectedui.RemoteActionCompatParcelizer("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final accessgetApproachSetp read;
    public static final accessgetApproachSetp serializer;
    public static final accessgetApproachSetp write;

    public static boolean IconCompatParcelizer(String str) {
        return !IconCompatParcelizer.contains(str);
    }

    public static boolean IconCompatParcelizer(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (IconCompatParcelizer(str) && bundle != null) {
            accessgetApproachSetp accessgetapproachsetp = read;
            int i = accessgetapproachsetp.serializer;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) accessgetapproachsetp.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }

    public static boolean read(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!serializer.contains(str2)) {
            accessgetApproachSetp accessgetapproachsetp = MediaBrowserCompatMediaItem;
            int i = accessgetapproachsetp.serializer;
            int i2 = 0;
            while (i2 < i) {
                boolean zMatches = str2.matches((String) accessgetapproachsetp.get(i2));
                i2++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean serializer(Bundle bundle, String str) {
        if (!write.contains(str)) {
            if (bundle == null) {
                return true;
            }
            accessgetApproachSetp accessgetapproachsetp = read;
            int i = accessgetapproachsetp.serializer;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) accessgetapproachsetp.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    static {
        DepthSortedSet depthSortedSet = delegateUnprotectedui.write;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        coil3.util.ContextsKt.serializer(7, objArr);
        write = delegateUnprotectedui.IconCompatParcelizer(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        coil3.util.ContextsKt.serializer(3, objArr2);
        IconCompatParcelizer = delegateUnprotectedui.IconCompatParcelizer(3, objArr2);
        Object[] objArr3 = {"_r", "_dbg"};
        coil3.util.ContextsKt.serializer(2, objArr3);
        read = delegateUnprotectedui.IconCompatParcelizer(2, objArr3);
        JsonUtilsc jsonUtilsc = new JsonUtilsc();
        jsonUtilsc.write((Object[]) MeasureScopelayout1.write);
        jsonUtilsc.write((Object[]) MeasureScopelayout1.RemoteActionCompatParcelizer);
        jsonUtilsc.serializer = true;
        serializer = delegateUnprotectedui.IconCompatParcelizer(jsonUtilsc.read, (Object[]) jsonUtilsc.RemoteActionCompatParcelizer);
        Object[] objArr4 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        coil3.util.ContextsKt.serializer(2, objArr4);
        MediaBrowserCompatMediaItem = delegateUnprotectedui.IconCompatParcelizer(2, objArr4);
    }
}
