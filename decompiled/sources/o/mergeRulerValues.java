package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mergeRulerValues {
    public static boolean IconCompatParcelizer(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = setPrevious.RemoteActionCompatParcelizer;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = android.graphics.Color.red(i);
        int iGreen = android.graphics.Color.green(i);
        int iBlue = android.graphics.Color.blue(i);
        if (dArr.length != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("outXyz must have a length of 3.");
            return false;
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static int RemoteActionCompatParcelizer(int i, View view) {
        Context context = view.getContext();
        TypedValue typedValue = (TypedValue) BuildersKt.IconCompatParcelizer(-1950445240, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1950445240, new Object[]{view.getContext(), Integer.valueOf(i), view.getClass().getCanonicalName()}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        int i2 = typedValue.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValue.data;
    }

    public static int read(int i, int i2) {
        return setPrevious.write(i, (android.graphics.Color.alpha(i) * i2) / 255);
    }

    public static int write(float f, int i, int i2) {
        return setPrevious.RemoteActionCompatParcelizer(setPrevious.write(i2, Math.round(android.graphics.Color.alpha(i2) * f)), i);
    }

    public static int write(Context context, int i, int i2) {
        TypedValue typedValueSerializer = BuildersKt.serializer(context, i);
        if (typedValueSerializer == null) {
            return i2;
        }
        int i3 = typedValueSerializer.resourceId;
        if (i3 != 0) {
            return context.getColor(i3);
        }
        return typedValueSerializer.data;
    }
}
