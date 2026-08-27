package o;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PrimaryTextActionModeCallback {
    public static AtomicBoolean IconCompatParcelizer;
    public static AtomicBoolean RemoteActionCompatParcelizer;
    public static AtomicInteger read;
    public static AtomicInteger serializer;
    public static AtomicBoolean write;

    /* JADX WARN: Code duplicated, block: B:37:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static int IconCompatParcelizer() {
        String str;
        String str2;
        AtomicInteger atomicInteger = read;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        int iIntValue = 0;
        try {
            try {
                Class<?> cls = Class.forName(EmuiUtil.BUILDEX_VERSION);
                Field field = cls.getField(EmuiUtil.EMUI_SDK_INT);
                AccessibleObject.setAccessible(new Field[]{field}, true);
                Object obj = field.get(cls);
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            } catch (ClassCastException unused) {
                str = "getVersionCodeFromHonorBuild ClassCastException";
                WrappedCompositionsetContent1211.read("ROMUtil", str);
                WrappedCompositionsetContent1211.read("ROMUtil", "getVersionCodeFromBuild ClassNotFoundException");
            } catch (ClassNotFoundException unused2) {
                str = "getVersionCodeFromHonorBuild ClassNotFoundException";
                WrappedCompositionsetContent1211.read("ROMUtil", str);
                WrappedCompositionsetContent1211.read("ROMUtil", "getVersionCodeFromBuild ClassNotFoundException");
            } catch (IllegalAccessException unused3) {
                str = "getVersionCodeFromHonorBuild IllegalAccessException";
                WrappedCompositionsetContent1211.read("ROMUtil", str);
                WrappedCompositionsetContent1211.read("ROMUtil", "getVersionCodeFromBuild ClassNotFoundException");
            } catch (NoSuchFieldException unused4) {
                str = "getVersionCodeFromHonorBuild NoSuchFieldException";
                WrappedCompositionsetContent1211.read("ROMUtil", str);
                WrappedCompositionsetContent1211.read("ROMUtil", "getVersionCodeFromBuild ClassNotFoundException");
            } catch (Exception unused5) {
                str = "getVersionCodeFromHonorBuild unknown exception";
                WrappedCompositionsetContent1211.read("ROMUtil", str);
                WrappedCompositionsetContent1211.read("ROMUtil", "getVersionCodeFromBuild ClassNotFoundException");
            }
        } catch (ClassCastException unused6) {
            str2 = "getVersionCodeFromBuild ClassCastException";
            WrappedCompositionsetContent1211.read("ROMUtil", str2);
        } catch (ClassNotFoundException unused7) {
            Class<?> cls2 = Class.forName("com.hihonor.android.os.Build$VERSION");
            Field field2 = cls2.getField(EmuiUtil.EMUI_SDK_INT);
            AccessibleObject.setAccessible(new Field[]{field2}, true);
            Object obj2 = field2.get(cls2);
            if (obj2 != null && (obj2 instanceof Integer)) {
                iIntValue = ((Integer) obj2).intValue();
            }
            WrappedCompositionsetContent1211.read("ROMUtil", "getVersionCodeFromBuild ClassNotFoundException");
            if (iIntValue <= 0) {
                try {
                    iIntValue = Integer.parseInt(SystemPropertiesUtil.get("ro.build.hw_emui_api_level", "0"));
                } catch (NumberFormatException unused8) {
                    WrappedCompositionsetContent1211.read("ROMUtil", "NumberFormatException: get hw_emui_api_level failed");
                }
            }
            WrappedCompositionsetContent1211.read();
            AtomicInteger atomicInteger2 = new AtomicInteger(iIntValue);
            read = atomicInteger2;
            return atomicInteger2.get();
        } catch (IllegalAccessException unused9) {
            str2 = "getVersionCodeFromBuild IllegalAccessException";
            WrappedCompositionsetContent1211.read("ROMUtil", str2);
        } catch (NoSuchFieldException unused10) {
            str2 = "getVersionCodeFromBuild NoSuchFieldException";
            WrappedCompositionsetContent1211.read("ROMUtil", str2);
        } catch (Exception unused11) {
            str2 = "getVersionCodeFromBuild unknown exception";
            WrappedCompositionsetContent1211.read("ROMUtil", str2);
        }
        if (iIntValue <= 0) {
            iIntValue = Integer.parseInt(SystemPropertiesUtil.get("ro.build.hw_emui_api_level", "0"));
        }
        WrappedCompositionsetContent1211.read();
        AtomicInteger atomicInteger3 = new AtomicInteger(iIntValue);
        read = atomicInteger3;
        return atomicInteger3.get();
    }

    public static boolean RemoteActionCompatParcelizer() {
        AtomicBoolean atomicBoolean = IconCompatParcelizer;
        if (atomicBoolean != null) {
            atomicBoolean.get();
        }
        String str = SystemPropertiesUtil.get("ro.com.google.gmsversion", "");
        WrappedCompositionsetContent1211.read();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(!TextUtils.isEmpty(str));
        IconCompatParcelizer = atomicBoolean2;
        return atomicBoolean2.get();
    }

    public static boolean read() {
        AtomicBoolean atomicBoolean = write;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        if (TextUtils.isEmpty(SystemPropertiesUtil.write)) {
            SystemPropertiesUtil.write = SystemPropertiesUtil.get("ro.product.locale.region", "");
        }
        boolean zEqualsIgnoreCase = "CN".equalsIgnoreCase(SystemPropertiesUtil.write);
        WrappedCompositionsetContent1211.read();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(zEqualsIgnoreCase);
        write = atomicBoolean2;
        return atomicBoolean2.get();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    public static int serializer() {
        int i;
        AtomicInteger atomicInteger = serializer;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        String str = Build.MANUFACTURER;
        int iIconCompatParcelizer = IconCompatParcelizer();
        str.getClass();
        if (str.equals(SystemUtils.PRODUCT_HONOR)) {
            if (iIconCompatParcelizer > 0 && iIconCompatParcelizer <= 25) {
                i = 1;
            } else if (iIconCompatParcelizer == 26 || iIconCompatParcelizer >= 29) {
                i = 2;
            } else {
                i = -1;
            }
        } else if (str.equals(SystemUtils.PRODUCT_HUAWEI)) {
            if (iIconCompatParcelizer >= 27) {
                i = 3;
            } else if (iIconCompatParcelizer > 0) {
                i = 1;
            } else {
                i = -1;
            }
        } else if (iIconCompatParcelizer < 27) {
            i = -1;
        } else {
            i = TextUtils.equals(SystemPropertiesUtil.get("hw_sc.product.useBrandCust", ""), "true") ? 4 : 5;
        }
        WrappedCompositionsetContent1211.read();
        AtomicInteger atomicInteger2 = new AtomicInteger(i);
        serializer = atomicInteger2;
        return atomicInteger2.get();
    }

    public static boolean write() {
        AtomicBoolean atomicBoolean = RemoteActionCompatParcelizer;
        if (atomicBoolean != null) {
            atomicBoolean.get();
            WrappedCompositionsetContent1211.read();
            return RemoteActionCompatParcelizer.get();
        }
        boolean z = serializer() != -1;
        WrappedCompositionsetContent1211.read();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(z);
        RemoteActionCompatParcelizer = atomicBoolean2;
        return atomicBoolean2.get();
    }
}
