package bo.app;

import com.braze.support.BrazeLogger;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class c8 {
    public final b8 a;
    public boolean b;

    public c8(b8 b8Var) {
        b8Var.getClass();
        this.a = b8Var;
    }

    public final void a(z7 z7Var) {
        z7Var.getClass();
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(0), 6, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(1), 7, (Object) null);
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.a.c());
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda3(listPlaybackStateCompat, 0), 6, (Object) null);
        z7Var.b(new u5(t5.ADD_BRAZE_EVENTS, listPlaybackStateCompat, null, null, 12), u5.class);
    }

    public static final String b(g9 g9Var) {
        return "Storage manager is closed. Not adding event: " + g9Var;
    }

    public static final String b() {
        return "Started offline event recovery task.";
    }

    public final void a(LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda5(linkedHashSet, 0), 6, (Object) null);
        } else {
            this.a.a(linkedHashSet);
        }
    }

    public static final String a(Set set) {
        return "Storage manager is closed. Not deleting events: " + set;
    }

    public final void a(g9 g9Var) {
        g9Var.getClass();
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda4(g9Var, 0), 6, (Object) null);
        } else {
            this.a.a(g9Var);
        }
    }

    public static final String a() {
        return "Storage manager is closed. Not starting offline recovery.";
    }

    public static final String a(List list) {
        return c8$$ExternalSyntheticOutline0.m("Adding events to dispatch from storage: ", list);
    }
}
