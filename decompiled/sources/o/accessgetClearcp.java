package o;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetClearcp extends androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public accessgetClearcp(Context context, int i) {
        if (i != 1) {
            context.getClass();
            MeasurementManager measurementManager = MeasurementManager.get(context);
            measurementManager.getClass();
            super(measurementManager);
            return;
        }
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
        systemService.getClass();
        super((MeasurementManager) systemService);
    }
}
