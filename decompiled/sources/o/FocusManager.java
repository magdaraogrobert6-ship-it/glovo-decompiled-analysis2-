package o;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusManager {
    public static io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg serializer(Context context, parseUseWebViewFromQueryBundle parseusewebviewfromquerybundle, int i, int i2) {
        context.getClass();
        float f = i2;
        float f2 = f / context.getResources().getDisplayMetrics().density;
        formatQueryBundleForLog formatquerybundleforlog = parseusewebviewfromquerybundle.MediaSessionCompatResultReceiverWrapper;
        int iWrite = MathKt.write(f2 * formatquerybundleforlog.sizeScale);
        int i3 = iWrite % 16;
        int iMax = i3 <= 8 ? Math.max(16, iWrite - i3) : iWrite + (16 - i3);
        float f3 = i;
        int iWrite2 = MathKt.write((f3 / context.getResources().getDisplayMetrics().density) * formatquerybundleforlog.sizeScale);
        int i4 = iWrite2 % 16;
        int iMax2 = i4 <= 8 ? Math.max(16, iWrite2 - i4) : iWrite2 + (16 - i4);
        int iIntValue = Integer.valueOf(iMax).intValue();
        int iIntValue2 = Integer.valueOf(iMax2).intValue();
        return new io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(iIntValue2, iIntValue, iIntValue2 / f3, iIntValue / f, parseusewebviewfromquerybundle.serializer, formatquerybundleforlog.bitRate);
    }

    public static Object serializer(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return scheduleInvalidation.IconCompatParcelizer(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }
}
