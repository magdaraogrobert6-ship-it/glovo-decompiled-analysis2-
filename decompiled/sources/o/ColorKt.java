package o;

import android.os.Bundle;
import com.roadrunner.web.presentation.hiring.RiderHiringWebViewFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class ColorKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static RiderHiringWebViewFragment read(String str, r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs r8lambdagcpcuhbei3f7gmv4pjjfd18owys) {
        int i = 2 % 2;
        str.getClass();
        r8lambdagcpcuhbei3f7gmv4pjjfd18owys.getClass();
        RiderHiringWebViewFragment riderHiringWebViewFragment = new RiderHiringWebViewFragment();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("url", str), new onViewAttachedToWindowlambda0(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, ""), new onViewAttachedToWindowlambda0("analytics_name", null), new onViewAttachedToWindowlambda0("back_nav", r8lambdagcpcuhbei3f7gmv4pjjfd18owys.name())};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        riderHiringWebViewFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        int i2 = IconCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return riderHiringWebViewFragment;
    }

    public static void write(getComponents8_81llA getcomponents8_81lla, Object[] objArr) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = IconCompatParcelizer + 41;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i5;
            int i6 = i4 % 2;
            Object obj = objArr[i3];
            i3++;
            if (obj == null) {
                getcomponents8_81lla.serializer(i3);
            } else if (obj instanceof byte[]) {
                int i7 = i5 + 39;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                getcomponents8_81lla.IconCompatParcelizer(i3, (byte[]) obj);
            } else if (obj instanceof Float) {
                int i9 = i5 + 53;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getcomponents8_81lla.write(((Number) obj).floatValue(), i3);
            } else if (obj instanceof Double) {
                int i11 = i5 + 9;
                IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getcomponents8_81lla.write(((Number) obj).doubleValue(), i3);
                int i13 = read + 65;
                IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else if (obj instanceof Long) {
                getcomponents8_81lla.IconCompatParcelizer(i3, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                getcomponents8_81lla.IconCompatParcelizer(i3, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                getcomponents8_81lla.IconCompatParcelizer(i3, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                getcomponents8_81lla.IconCompatParcelizer(i3, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                getcomponents8_81lla.serializer(i3, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i3 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                long j = 0;
                if (!(!((Boolean) obj).booleanValue())) {
                    int i15 = read + 73;
                    IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i15 % 2 != 0) {
                        j = 1;
                    }
                }
                getcomponents8_81lla.IconCompatParcelizer(i3, j);
            }
        }
    }
}
