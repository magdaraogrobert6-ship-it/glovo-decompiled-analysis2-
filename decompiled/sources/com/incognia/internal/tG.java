package com.incognia.internal;

import android.content.Context;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import com.huawei.location.router.dispatch.IDispatchExceptionListener;
import java.util.Map;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class tG {
    public final Context BGx;
    public final onViewDetachedFromWindowlambda1 HQ = new isAdapterPositionOnScreen(new MPs(this));
    public final Ur9 mbG;

    public tG(Context context, Ur9 ur9) {
        this.BGx = context;
        this.mbG = ur9;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x012c  */
    public final QUy BGx() {
        HealthStats healthStatsTakeMyUidSnapshot;
        HealthStats healthStats;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        Long lValueOf6;
        Long lValueOf7;
        Long lValueOf8;
        Long lValueOf9;
        Long lValueOf10;
        Long lValueOf11;
        Long lValueOf12;
        try {
            SystemHealthManager systemHealthManager = (SystemHealthManager) this.HQ.MediaSessionCompatResultReceiverWrapper();
            healthStatsTakeMyUidSnapshot = systemHealthManager != null ? systemHealthManager.takeMyUidSnapshot() : null;
        } catch (Exception unused) {
        }
        if (healthStatsTakeMyUidSnapshot != null) {
            try {
                Map<String, HealthStats> stats = healthStatsTakeMyUidSnapshot.getStats(10014);
                if (stats != null) {
                    this.mbG.getClass();
                    healthStats = stats.get(Ur9.HQ());
                } else {
                    healthStats = null;
                }
            } catch (Exception unused2) {
            }
        } else {
            healthStats = null;
        }
        if (healthStats != null) {
            try {
                long measurement = healthStats.getMeasurement(30005);
                if (healthStats.hasMeasurement(30005)) {
                    lValueOf = Long.valueOf(measurement);
                } else {
                    lValueOf = null;
                }
            } catch (Exception unused3) {
                return null;
            }
        } else {
            lValueOf = null;
        }
        if (healthStats != null) {
            long measurement2 = healthStats.getMeasurement(30004);
            if (healthStats.hasMeasurement(30004)) {
                lValueOf2 = Long.valueOf(measurement2);
            } else {
                lValueOf2 = null;
            }
        } else {
            lValueOf2 = null;
        }
        if (healthStats != null) {
            long measurement3 = healthStats.getMeasurement(30006);
            if (healthStats.hasMeasurement(30006)) {
                lValueOf3 = Long.valueOf(measurement3);
            } else {
                lValueOf3 = null;
            }
        } else {
            lValueOf3 = null;
        }
        if (healthStats != null) {
            long measurement4 = healthStats.getMeasurement(30003);
            if (healthStats.hasMeasurement(30003)) {
                lValueOf4 = Long.valueOf(measurement4);
            } else {
                lValueOf4 = null;
            }
        } else {
            lValueOf4 = null;
        }
        if (healthStats != null) {
            long measurement5 = healthStats.getMeasurement(30002);
            if (healthStats.hasMeasurement(30002)) {
                lValueOf5 = Long.valueOf(measurement5);
            } else {
                lValueOf5 = null;
            }
        } else {
            lValueOf5 = null;
        }
        if (healthStats != null) {
            long measurement6 = healthStats.getMeasurement(30001);
            if (healthStats.hasMeasurement(30001)) {
                lValueOf6 = Long.valueOf(measurement6);
            } else {
                lValueOf6 = null;
            }
        } else {
            lValueOf6 = null;
        }
        if (healthStatsTakeMyUidSnapshot != null) {
            long measurement7 = healthStatsTakeMyUidSnapshot.getMeasurement(IDispatchExceptionListener.API_NOT_EXIST);
            if (healthStatsTakeMyUidSnapshot.hasMeasurement(IDispatchExceptionListener.API_NOT_EXIST)) {
                lValueOf7 = Long.valueOf(measurement7);
            } else {
                lValueOf7 = null;
            }
        } else {
            lValueOf7 = null;
        }
        if (healthStatsTakeMyUidSnapshot != null) {
            long measurement8 = healthStatsTakeMyUidSnapshot.getMeasurement(IDispatchExceptionListener.OTHER_ERROR);
            if (healthStatsTakeMyUidSnapshot.hasMeasurement(IDispatchExceptionListener.OTHER_ERROR)) {
                lValueOf8 = Long.valueOf(measurement8);
            } else {
                lValueOf8 = null;
            }
        } else {
            lValueOf8 = null;
        }
        if (healthStatsTakeMyUidSnapshot != null) {
            long measurement9 = healthStatsTakeMyUidSnapshot.getMeasurement(10063);
            if (healthStatsTakeMyUidSnapshot.hasMeasurement(10063)) {
                lValueOf9 = Long.valueOf(measurement9);
            } else {
                lValueOf9 = null;
            }
        } else {
            lValueOf9 = null;
        }
        if (healthStatsTakeMyUidSnapshot != null) {
            long measurement10 = healthStatsTakeMyUidSnapshot.getMeasurement(IDispatchExceptionListener.API_TASK_EMPTY);
            if (healthStatsTakeMyUidSnapshot.hasMeasurement(IDispatchExceptionListener.API_TASK_EMPTY)) {
                lValueOf10 = Long.valueOf(measurement10);
            } else {
                lValueOf10 = null;
            }
        } else {
            lValueOf10 = null;
        }
        if (healthStatsTakeMyUidSnapshot != null) {
            long measurement11 = healthStatsTakeMyUidSnapshot.getMeasurement(10004);
            if (healthStatsTakeMyUidSnapshot.hasMeasurement(10004)) {
                lValueOf11 = Long.valueOf(measurement11);
            } else {
                lValueOf11 = null;
            }
        } else {
            lValueOf11 = null;
        }
        if (healthStatsTakeMyUidSnapshot != null) {
            long measurement12 = healthStatsTakeMyUidSnapshot.getMeasurement(10062);
            if (healthStatsTakeMyUidSnapshot.hasMeasurement(10062)) {
                lValueOf12 = Long.valueOf(measurement12);
            } else {
                lValueOf12 = null;
            }
        } else {
            lValueOf12 = null;
        }
        return new QUy(lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, lValueOf7, lValueOf8, lValueOf9, lValueOf10, lValueOf11, lValueOf12);
    }
}
