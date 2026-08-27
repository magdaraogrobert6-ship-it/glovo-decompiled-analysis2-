package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt;
import o.createInAppMessageEventSubscriber;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w6 {
    public static final String c = BrazeLogger.getBrazeLogTag((Class<?>) w6.class);
    public static final ensureSubscribedToInAppMessageEventslambda7 d = new ensureSubscribedToInAppMessageEventslambda7(200, 299, 1);
    public static final ensureSubscribedToInAppMessageEventslambda7 e = new ensureSubscribedToInAppMessageEventslambda7(400, 499, 1);
    public static final ensureSubscribedToInAppMessageEventslambda7 f = new ensureSubscribedToInAppMessageEventslambda7(Constant.ERROR_UNKNOWN, 599, 1);
    public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:27:0x011d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0123  */
    /* JADX WARN: Code duplicated, block: B:30:0x014b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(o.getContentViewGroupParentLayout r26, o.onBackCancelledlambda3 r27, bo.app.l6 r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.w6.a(o.getContentViewGroupParentLayout, o.onBackCancelledlambda3, bo.app.l6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(5), 7, (Object) null);
        this.b.set(true);
    }

    public static final String d(w6 w6Var) {
        return "Started stream job " + w6Var.a;
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(25, this), 7, (Object) null);
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.a;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.a = null;
        this.b.set(false);
    }

    public static final String d(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Got call to startStream() for url ", str);
    }

    public static final String d() {
        return "Marking stream as active after observing CONNECTION_IS_READY message";
    }

    public static final String c(w6 w6Var) {
        return "Not restarting stream since " + w6Var.a + " is still active.";
    }

    public static final String c(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse data line:\n", str);
    }

    public static final String b(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return m1$$ExternalSyntheticOutline0.m(createinappmessageeventsubscriber.IconCompatParcelizer, "Recorded data type: ");
    }

    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Got un-actionable stream line:\n", str);
    }

    public static final String b(w6 w6Var) {
        return "Got call to endStreamAndJoin(). Stream job: " + w6Var.a;
    }

    public static final String b(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Not handling event: '", str, "' and data: '", str2, "'");
    }

    public final void a(String str, l6 l6Var, m6 m6Var, n6 n6Var, boolean z) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0;
        str.getClass();
        l6Var.getClass();
        m6Var.getClass();
        n6Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 17), 7, (Object) null);
        if (z && (setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.a) != null && setallviewgroupchildrenasnonaccessibilityimportantlambda0.I_()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w6$$ExternalSyntheticLambda0(this, 1), 7, (Object) null);
            return;
        }
        BuildersKt.write(new t6(this, null));
        this.b.set(false);
        this.a = BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new v6(n6Var, m6Var, this, l6Var, str, null), 3);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w6$$ExternalSyntheticLambda0(this, 2), 7, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(50, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof bo.app.q6
            if (r0 == 0) goto L13
            r0 = r15
            bo.app.q6 r0 = (bo.app.q6) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            bo.app.q6 r0 = new bo.app.q6
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.a
            o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 r0 = (o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            goto L75
        L2f:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r15)
            return r5
        L35:
            int r2 = r0.b
            java.lang.Object r4 = r0.a
            o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 r4 = (o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) r4
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            goto L66
        L3f:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r7 = bo.app.w6.c
            r8 = 0
            r9 = 0
            r10 = 0
            bo.app.w6$$ExternalSyntheticLambda0 r11 = new bo.app.w6$$ExternalSyntheticLambda0
            r2 = 0
            r11.<init>(r14, r2)
            r12 = 14
            r13 = 0
            com.braze.support.BrazeLogger.brazelog$default(r6, r7, r8, r9, r10, r11, r12, r13)
            o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 r15 = r14.a
            if (r15 == 0) goto L75
            r0.a = r5
            r0.b = r2
            r0.e = r4
            java.lang.Object r15 = kotlinx.coroutines.JobKt.cancelAndJoin(r15, r0)
            if (r15 != r1) goto L66
            goto L74
        L66:
            r0.a = r5
            r0.b = r2
            r0.e = r3
            r2 = 50
            java.lang.Object r15 = kotlinx.coroutines.DelayKt.delay(r2, r0)
            if (r15 != r1) goto L75
        L74:
            return r1
        L75:
            r14.a = r5
            o.createFromParcel r15 = o.createFromParcel.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.w6.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final String a(w6 w6Var) {
        return "Got call to endStream(). Stream job: " + w6Var.a;
    }

    public static final String a() {
        return "Waiting to consume new line";
    }

    public static final String a(String str) {
        return ff$$ExternalSyntheticOutline0.m("Received new line: '", str, "'");
    }

    public static final String a(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return m1$$ExternalSyntheticOutline0.m(createinappmessageeventsubscriber.IconCompatParcelizer, "Recorded event type: ");
    }

    public static final String a(createInAppMessageEventSubscriber createinappmessageeventsubscriber, createInAppMessageEventSubscriber createinappmessageeventsubscriber2) {
        return "Handling full event on blank line. lastEventType: '" + createinappmessageeventsubscriber.IconCompatParcelizer + "' \ndata: '" + createinappmessageeventsubscriber2.IconCompatParcelizer + "'";
    }

    public static void a(String str, String str2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        str2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str3 = c;
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t1$$ExternalSyntheticLambda1(str, str2, 1), 14, (Object) null);
        if (str.equals(RemoteMessageConst.MessageBody.MSG)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new eh$$ExternalSyntheticLambda0(jSONObject, 5), 14, (Object) null);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(q9.a.a(jSONObject));
                return;
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, c, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str2, 16), 8, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t1$$ExternalSyntheticLambda1(str, str2, 2), 14, (Object) null);
    }

    public static final String a(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Got event '", str, "' and data: '", str2, "'");
    }

    public static final String a(JSONObject jSONObject) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Parsed dust message json to:\n", JsonUtils.getPrettyPrintedString(jSONObject));
    }
}
