package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.navigator.CustomerUnavailableArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class getId implements setTextClassifier {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static CustomerUnavailableFragment read(CustomerUnavailableArgs customerUnavailableArgs) {
        int i = 2 % 2;
        customerUnavailableArgs.getClass();
        CustomerUnavailableFragment customerUnavailableFragment = new CustomerUnavailableFragment();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("customer_unavailable", customerUnavailableArgs)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        customerUnavailableFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        int i2 = RemoteActionCompatParcelizer + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return customerUnavailableFragment;
    }

    public static String[] read(Context context, Bundle bundle, String str) {
        int i = 2 % 2;
        int i2 = write + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            bundle.containsKey(str);
            obj.hashCode();
            throw null;
        }
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i3 = bundle.getInt(str, -1);
        if (i3 != -1) {
            try {
                return context.getResources().getStringArray(i3);
            } catch (Resources.NotFoundException e) {
                setInflatedId.RemoteActionCompatParcelizer("QuirkSettingsLoader", "Quirk class names resource not found: " + i3, e);
                return new String[0];
            }
        }
        setInflatedId.read("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
        String[] strArr = new String[0];
        int i4 = RemoteActionCompatParcelizer + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strArr;
        }
        obj.hashCode();
        throw null;
    }

    public static getRelatedFixedSize serializer(Context context, Bundle bundle) {
        int i = 2 % 2;
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArr = read(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArr2 = read(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        setInflatedId.IconCompatParcelizer(3, "QuirkSettingsLoader");
        setInflatedId.IconCompatParcelizer(3, "QuirkSettingsLoader");
        Arrays.toString(strArr);
        setInflatedId.IconCompatParcelizer(3, "QuirkSettingsLoader");
        Arrays.toString(strArr2);
        setInflatedId.IconCompatParcelizer(3, "QuirkSettingsLoader");
        getRelatedFixedSize getrelatedfixedsize = new getRelatedFixedSize(z, new HashSet(read(strArr)), new HashSet(read(strArr2)));
        int i2 = write + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getrelatedfixedsize;
        }
        throw null;
    }

    public static HashSet read(String[] strArr) {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        int length = strArr.length;
        int i2 = RemoteActionCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 5 / 4;
        }
        int i4 = 0;
        while (true) {
            Class<?> cls = null;
            if (i4 >= length) {
                break;
            }
            int i5 = RemoteActionCompatParcelizer + 89;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            String str = strArr[i4];
            try {
                Class<?> cls2 = Class.forName(str);
                if (CameraUpdateException.class.isAssignableFrom(cls2)) {
                    cls = cls2;
                } else {
                    setInflatedId.read("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
                    int i7 = write + 71;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
            } catch (ClassNotFoundException e) {
                setInflatedId.RemoteActionCompatParcelizer("QuirkSettingsLoader", "Class not found: " + str, e);
            }
            if (cls != null) {
                hashSet.add(cls);
            }
            i4++;
        }
        int i9 = write + 9;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return hashSet;
        }
        throw null;
    }
}
