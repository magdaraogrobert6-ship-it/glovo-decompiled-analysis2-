package o;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class setStackedBackground {
    public static boolean RemoteActionCompatParcelizer(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }

    public static void read(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static int write(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void write(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }
}
