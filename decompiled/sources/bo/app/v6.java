package bo.app;

import androidx.room.Room;
import coil3.ExtrasKt;
import com.braze.support.BrazeLogger;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.ensureSubscribedToInAppMessageEvents;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getContentViewGroupParentLayout;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class v6 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public createInAppMessageEventSubscriber a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ n6 e;
    public final /* synthetic */ m6 f;
    public final /* synthetic */ w6 g;
    public final /* synthetic */ l6 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(n6 n6Var, m6 m6Var, w6 w6Var, l6 l6Var, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.e = n6Var;
        this.f = m6Var;
        this.g = w6Var;
        this.h = l6Var;
        this.i = str;
    }

    public static final String a(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return c8$$ExternalSyntheticOutline0.m(((HttpURLConnection) createinappmessageeventsubscriber.IconCompatParcelizer).getResponseCode(), "DUST stream response code ");
    }

    public static final String b(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return c8$$ExternalSyntheticOutline0.m(((HttpURLConnection) createinappmessageeventsubscriber.IconCompatParcelizer).getResponseCode(), "DUST stream connection failed with response code ");
    }

    public static final String c() {
        return "Stream connection job cancelled";
    }

    public static final String d() {
        return "Closing stream connection data";
    }

    public static final String e() {
        return "Stream job finished";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        v6 v6Var = new v6(this.e, this.f, this.g, this.h, this.i, shortNewsContentCardView);
        v6Var.d = obj;
        return v6Var;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((v6) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014c A[Catch: all -> 0x013f, TryCatch #5 {all -> 0x013f, blocks: (B:7:0x001d, B:30:0x00e4, B:45:0x0146, B:47:0x014c, B:49:0x017c, B:48:0x0162, B:19:0x005c), top: B:61:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0162 A[Catch: all -> 0x013f, TryCatch #5 {all -> 0x013f, blocks: (B:7:0x001d, B:30:0x00e4, B:45:0x0146, B:47:0x014c, B:49:0x017c, B:48:0x0162, B:19:0x005c), top: B:61:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x019a A[PHI: r0
  0x019a: PHI (r0v12 java.net.HttpURLConnection) = (r0v9 java.net.HttpURLConnection), (r0v20 java.net.HttpURLConnection) binds: [B:51:0x0198, B:34:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r4v2, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [o.createInAppMessageEventSubscriber] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r4;
        ?? r9;
        HttpURLConnection httpURLConnection;
        Exception exc;
        HttpURLConnection httpURLConnection2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        Object objWithContext;
        ?? r10;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r3 = this.c;
        try {
            try {
                try {
                    if (r3 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(this.i, 12), 14, (Object) null);
                        createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                        u6 u6Var = new u6(this.i, null);
                        this.d = getcontentviewgroupparentlayout;
                        this.a = createinappmessageeventsubscriber;
                        this.b = createinappmessageeventsubscriber;
                        this.c = 1;
                        objWithContext = BuildersKt.withContext(defaultIoScheduler, u6Var, this);
                        if (objWithContext != coroutineSingletons) {
                            r9 = createinappmessageeventsubscriber;
                        }
                        return coroutineSingletons;
                    }
                    if (r3 == 1) {
                        createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) this.b;
                        r4 = this.a;
                        try {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            r9 = r4;
                            objWithContext = obj;
                        } catch (Exception e) {
                            exc = e;
                            r3 = r4;
                            if (YieldKt.write(getcontentviewgroupparentlayout)) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, BrazeLogger.Priority.E, (Throwable) exc, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(28), 8, (Object) null);
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(29), 14, (Object) null);
                            }
                            this.e.invoke(null);
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(27), 14, (Object) null);
                            httpURLConnection2 = (HttpURLConnection) r3.IconCompatParcelizer;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                        } catch (Throwable th) {
                            th = th;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(27), 14, (Object) null);
                            httpURLConnection = (HttpURLConnection) r4.IconCompatParcelizer;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.g.b.set(false);
                            throw th;
                        }
                    } else {
                        if (r3 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = this.a;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        r3 = createinappmessageeventsubscriber2;
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(26), 14, (Object) null);
                    r10 = r3;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(27), 14, (Object) null);
                    httpURLConnection2 = (HttpURLConnection) r10.IconCompatParcelizer;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    this.g.b.set(false);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(0), 14, (Object) null);
                    return createFromParcel.INSTANCE;
                    objWithContext.getClass();
                    createinappmessageeventsubscriber.IconCompatParcelizer = (HttpURLConnection) objWithContext;
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str = w6.c;
                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda3(r9, 2), 14, (Object) null);
                    ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = w6.d;
                    int i = ensuresubscribedtoinappmessageeventslambda7.write;
                    int i2 = ensuresubscribedtoinappmessageeventslambda7.read;
                    int responseCode = ((HttpURLConnection) r9.IconCompatParcelizer).getResponseCode();
                    if (i <= responseCode && responseCode <= i2) {
                        this.f.invoke();
                        InputStream inputStream = ((HttpURLConnection) r9.IconCompatParcelizer).getInputStream();
                        inputStream.getClass();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, ensureSubscribedToInAppMessageEvents.write), 8192);
                        getcontentviewgroupparentlayout.getClass();
                        ProducerCoroutine producerCoroutine = Room.read(getcontentviewgroupparentlayout, 0, new s6(bufferedReader, null), 3);
                        w6 w6Var = this.g;
                        l6 l6Var = this.h;
                        this.d = getcontentviewgroupparentlayout;
                        this.a = r9;
                        this.b = null;
                        this.c = 2;
                        if (w6Var.a(getcontentviewgroupparentlayout, producerCoroutine, l6Var, this) != coroutineSingletons) {
                            r3 = r9;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(26), 14, (Object) null);
                            r10 = r3;
                        }
                        return coroutineSingletons;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda3(r9, 3), 12, (Object) null);
                    this.e.invoke(new Integer(((HttpURLConnection) r9.IconCompatParcelizer).getResponseCode()));
                    r10 = r9;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(27), 14, (Object) null);
                    httpURLConnection2 = (HttpURLConnection) r10.IconCompatParcelizer;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    r3 = r9;
                    if (YieldKt.write(getcontentviewgroupparentlayout)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, BrazeLogger.Priority.E, (Throwable) exc, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(28), 8, (Object) null);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(29), 14, (Object) null);
                    }
                    this.e.invoke(null);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(27), 14, (Object) null);
                    httpURLConnection2 = (HttpURLConnection) r3.IconCompatParcelizer;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r4 = r9;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(27), 14, (Object) null);
                    httpURLConnection = (HttpURLConnection) r4.IconCompatParcelizer;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.g.b.set(false);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                r9 = r3;
            }
            this.g.b.set(false);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(0), 14, (Object) null);
            return createFromParcel.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            r4 = r3;
        }
    }

    public static final String b() {
        return "Caught unexpected exception listening to DUST stream";
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting DUST stream to ", str);
    }

    public static final String a() {
        return "Stream job coroutine no longer active";
    }
}
