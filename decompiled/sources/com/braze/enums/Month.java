package com.braze.enums;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import coil3.util.UtilsKt;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public enum Month {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);

    private final int value;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    public static final Companion Companion = new Companion(null);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public static final Month getMonth(int i) {
        return Companion.getMonth(i);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getMonth$lambda$1$0(int i) {
            return d$$ExternalSyntheticOutline0.m(i, "No month with value ", ", value must be in (0,11)");
        }

        public final Month getMonth(int i) {
            Object next;
            Iterator<E> it = Month.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Month) next).getValue() != i);
            Month month = (Month) next;
            if (month != null) {
                return month;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 7), 6, (Object) null);
            return null;
        }
    }

    Month(int i) {
        this.value = i;
    }
}
