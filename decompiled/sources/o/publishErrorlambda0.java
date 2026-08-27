package o;

import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class publishErrorlambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final MeasureFormat write;

    public publishErrorlambda0(MeasureFormat measureFormat) {
        this.write = measureFormat;
    }

    public final String read(double d) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        MeasureFormat measureFormat = this.write;
        if (d < 1.0d) {
            int i5 = i3 + 7;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (d > 0.0d) {
                String measures = measureFormat.formatMeasures(new Measure(Double.valueOf(d * 1000.0d), MeasureUnit.METER));
                measures.getClass();
                return measures;
            }
        }
        String measures2 = measureFormat.formatMeasures(new Measure(Double.valueOf(d), MeasureUnit.KILOMETER));
        measures2.getClass();
        int i7 = RemoteActionCompatParcelizer + 45;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return measures2;
    }
}
