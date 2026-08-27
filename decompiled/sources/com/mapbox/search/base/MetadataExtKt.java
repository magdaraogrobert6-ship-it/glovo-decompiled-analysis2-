package com.mapbox.search.base;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.search.base.logger.LogKt;
import com.mapbox.search.common.metadata.WeekDay;
import com.mapbox.search.common.metadata.WeekTimestamp;
import com.mapbox.search.internal.bindgen.OpenMode;
import java.io.InputStream;
import o.RelativeScrollerscrollBy1;
import o.ScrollCapture;
import o.getScrollAmount;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.scrollTo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MetadataExtKt {
    public static volatile getScrollAmount b;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenMode.values().length];
            try {
                iArr[OpenMode.ALWAYS_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenMode.TEMPORARILY_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenMode.PERMANENTLY_CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpenMode.SCHEDULED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final WeekDay weekDayFromCore(final byte b2) {
        WeekDay weekDay;
        WeekDay[] weekDayArrValues = WeekDay.values();
        int length = weekDayArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                weekDay = null;
                break;
            }
            weekDay = weekDayArrValues[i];
            if (weekDay.getInternalRawCode() == b2) {
                break;
            }
            i++;
        }
        AssertionsKt.assertDebug(weekDay != null, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.search.base.MetadataExtKt.weekDayFromCore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return af$$ExternalSyntheticOutline0.m(b2, ") from Core SDK.", new StringBuilder("Unknown day code (="));
            }
        });
        return weekDay;
    }

    public static getScrollAmount read(Context context) {
        System.currentTimeMillis();
        InputStream inputStreamOpen = null;
        if (context == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("context is null");
            return null;
        }
        if (RelativeScrollerscrollBy1.write == null) {
            RelativeScrollerscrollBy1.write = context.getApplicationContext();
        }
        if (b == null) {
            synchronized (MetadataExtKt.class) {
                if (b == null) {
                    try {
                        inputStreamOpen = ScrollCapture.write(context);
                    } catch (RuntimeException unused) {
                        scrollTo.read("SecureX509SingleInstance", "get files bks error");
                    }
                    if (inputStreamOpen == null) {
                        scrollTo.write("SecureX509SingleInstance");
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        scrollTo.write("SecureX509SingleInstance");
                    }
                    b = new getScrollAmount(inputStreamOpen);
                }
            }
        }
        System.currentTimeMillis();
        return b;
    }

    public static final WeekTimestamp createWeekTimestamp(WeekDay weekDay, final int i, final int i2) {
        if (i < 0 || i >= 25) {
            new IllegalStateException("Hour should be specified in [0..24] range.", null);
            LogKt.logw$default("Hour should be specified in [0..24] range.");
            return null;
        }
        if (i2 < 0 || i2 >= 60) {
            new IllegalStateException("Minute should be specified in [0..60) range.", null);
            LogKt.logw$default("Minute should be specified in [0..60) range.");
            return null;
        }
        long j = (i * 60) + i2;
        if (0 <= j && j <= 1440) {
            return new WeekTimestamp(weekDay, i, i2);
        }
        AssertionsKt.failDebug$default(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.search.base.MetadataExtKt.createWeekTimestamp.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("There can't be ");
                sb.append(i);
                sb.append(" hours and ");
                return af$$ExternalSyntheticOutline0.m(i2, " minutes in the day.", sb);
            }
        });
        return null;
    }
}
