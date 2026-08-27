package com.braze.enums;

import bo.app.d4$$ExternalSyntheticLambda6;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public enum DelayedInitializationAnalyticsBehavior {
    DROP("DROP"),
    QUEUE("QUEUE");

    private final String value;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DelayedInitializationAnalyticsBehavior fromString(String str) {
            if (str == null) {
                return DelayedInitializationAnalyticsBehavior.QUEUE;
            }
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            Iterator<E> it = DelayedInitializationAnalyticsBehavior.getEntries().iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object next = it.next();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((DelayedInitializationAnalyticsBehavior) next).getValue(), upperCase}, getCieXyz.write())).booleanValue()) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            }
            DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior = (DelayedInitializationAnalyticsBehavior) obj;
            if (delayedInitializationAnalyticsBehavior != null) {
                return delayedInitializationAnalyticsBehavior;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 20), 6, (Object) null);
            return DelayedInitializationAnalyticsBehavior.QUEUE;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String fromString$lambda$1(String str) {
            return ff$$ExternalSyntheticOutline0.m("No DelayedInitializationAnalyticsBehavior with value ", str, ". Defaulting to QUEUE");
        }
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }

    public static final DelayedInitializationAnalyticsBehavior fromString(String str) {
        return Companion.fromString(str);
    }

    DelayedInitializationAnalyticsBehavior(String str) {
        this.value = str;
    }
}
