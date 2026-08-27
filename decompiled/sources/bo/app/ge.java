package bo.app;

import android.content.Context;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt;
import o.createFromParcel;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ge {
    public static final be k = new be();
    public final df a;
    public final z7 b;
    public ce c;
    public long d;
    public int e;
    public final ArrayList f;
    public int g;
    public final ReentrantLock h;
    public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 i;
    public final AtomicInteger j;

    public static final String b() {
        return "Shutting down SDK Debugger due to being past expiration time";
    }

    public static final String d() {
        return "Initializing SDK Debugger";
    }

    public static final String e() {
        return "SDK Debugger transitioned from disabled to enabled. Initializing SDK Debugger.";
    }

    public static final String f() {
        return "SDK Debugger transitioned from enabled to disabled. Shutting down SDK Debugger.";
    }

    public static final String h() {
        return "Debugging session has expired. Disabling SDK Debugger.";
    }

    public static final String j() {
        return "Shutting down SDK Debugger";
    }

    public final createFromParcel a() {
        Long l;
        ce ceVar = this.c;
        boolean z = ceVar.a;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (z && ceVar.c != null && (l = ceVar.b) != null && l.longValue() != 0 && this.j.get() <= 0) {
            Long l2 = this.c.b;
            if (l2 != null) {
                if (DateTimeUtils.nowInSeconds() > l2.longValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(5), 7, (Object) null);
                    i();
                    return createfromparcel;
                }
            }
            long jNowInSeconds = DateTimeUtils.nowInSeconds();
            long j = this.d;
            ce ceVar2 = this.c;
            long j2 = j + ceVar2.e;
            if (jNowInSeconds > j2 || this.g > ceVar2.d) {
                ArrayList arrayList = new ArrayList();
                ReentrantLock reentrantLock = this.h;
                reentrantLock.lock();
                try {
                    ArrayList arrayList2 = this.f;
                    int size = arrayList2.size();
                    int i = 0;
                    int i2 = 0;
                    int length = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        me meVar = (me) obj;
                        int i3 = this.e;
                        if (i3 != 0) {
                            String str = "Removed " + i3 + " logs due to buffer overflow";
                            arrayList.add(new me(str));
                            this.e = 0;
                            length += str.length();
                        }
                        int length2 = meVar.a.length() + length;
                        if (length2 <= this.c.f) {
                            arrayList.add(meVar);
                            length = length2;
                        }
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList.get(i4);
                        i4++;
                        this.f.remove((me) obj2);
                    }
                    ArrayList arrayList3 = this.f;
                    int size3 = arrayList3.size();
                    int length3 = 0;
                    while (i < size3) {
                        Object obj3 = arrayList3.get(i);
                        i++;
                        length3 += ((me) obj3).a.length();
                    }
                    this.g = length3;
                    this.d = DateTimeUtils.nowInSeconds();
                    reentrantLock.unlock();
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.i;
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
                    }
                    this.i = null;
                    if (!arrayList.isEmpty()) {
                        this.j.incrementAndGet();
                        this.b.b(new oe(arrayList), oe.class);
                        return createfromparcel;
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } else if (this.i == null) {
                this.i = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, new Long(TimeUnit.SECONDS.toMillis(j2 - DateTimeUtils.nowInSeconds())), null, new de(this, null), 2, null);
                return createfromparcel;
            }
        }
        return createfromparcel;
    }

    public final boolean g() {
        this.c.a = this.a.O();
        ce ceVar = this.c;
        if (ceVar.a) {
            ceVar.c = this.a.A();
            this.c.d = this.a.C();
            this.c.e = this.a.D();
            this.c.f = this.a.E();
            this.c.b = Long.valueOf(this.a.B());
        }
        Long l = this.c.b;
        if (l != null) {
            if (DateTimeUtils.nowInSeconds() > l.longValue()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(12), 7, (Object) null);
                this.c = new ce();
            }
        }
        return this.c.a;
    }

    public ge(df dfVar, z7 z7Var, Context context) {
        dfVar.getClass();
        z7Var.getClass();
        context.getClass();
        this.a = dfVar;
        this.b = z7Var;
        this.c = new ce();
        this.d = DateTimeUtils.nowInSeconds();
        this.f = new ArrayList();
        this.h = new ReentrantLock();
        final int i = 0;
        this.j = new AtomicInteger(0);
        if (g()) {
            c();
        }
        z7Var.c(id.class, new IEventSubscriber(this) { // from class: bo.app.ge$$ExternalSyntheticLambda0
            public final /* synthetic */ ge f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                ge geVar = this.f$0;
                if (i2 != 0) {
                    ge.a(geVar, (he) obj);
                } else {
                    ge.a(geVar, (id) obj);
                }
            }
        });
        final int i2 = 1;
        z7Var.c(he.class, new IEventSubscriber(this) { // from class: bo.app.ge$$ExternalSyntheticLambda0
            public final /* synthetic */ ge f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i3 = i2;
                ge geVar = this.f$0;
                if (i3 != 0) {
                    ge.a(geVar, (he) obj);
                } else {
                    ge.a(geVar, (id) obj);
                }
            }
        });
    }

    public final void c() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(3), 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(new ee(this));
        this.b.b(new ke(), ke.class);
    }

    public final void i() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(4), 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(null);
        this.c = new ce();
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.f.clear();
            this.g = 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(he heVar) {
        return "Updating SDK Debugger config with " + heVar.a;
    }

    public static final void a(ge geVar, id idVar) {
        idVar.getClass();
        if (idVar.a instanceof ne) {
            geVar.j.decrementAndGet();
            BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new ae(geVar, null), 3);
        }
    }

    public static final String a(ce ceVar) {
        return "updating expiration time to " + ceVar.b;
    }

    public static final void a(ge geVar, he heVar) {
        heVar.getClass();
        ce ceVar = geVar.c;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) geVar, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(heVar, 1, ceVar), 7, (Object) null);
        if (heVar.a.b == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) geVar, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(12, ceVar), 7, (Object) null);
            heVar.a.b = ceVar.b;
        }
        ce ceVar2 = heVar.a;
        if (ceVar2.c == null) {
            ceVar2.c = ceVar.c;
        }
        geVar.c = ceVar2;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) geVar, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(13, heVar), 6, (Object) null);
        geVar.a.a(heVar.a);
        boolean z = ceVar.a;
        if (!z && geVar.c.a) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) geVar, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(6), 6, (Object) null);
            geVar.c();
        } else {
            if (!z || geVar.c.a) {
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) geVar, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(2), 6, (Object) null);
            geVar.i();
        }
    }

    public final void a(String str, BrazeLogger.Priority priority, String str2, Throwable th) {
        Object obj;
        str.getClass();
        priority.getClass();
        str2.getClass();
        if (!this.c.a || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) Constants.LOG_TAG_PREFIX, false)) {
            return;
        }
        String str3 = "";
        if (th == null) {
            obj = th;
            obj = "";
        }
        obj = th;
        for (String str4 : hideCurrentlyDisplayingInAppMessage.serializer(priority + " " + str + ": " + str2 + " " + obj, new String[]{"\n"}, 6)) {
            if (str4.length() + str3.length() > this.c.f) {
                a(priority + ": " + ((Object) str3));
                str3 = str4;
            } else {
                str3 = ((Object) str3) + "\n" + str4;
            }
        }
        if (str3.length() > 0) {
            a(str3);
        }
        BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new fe(this, null), 3);
    }

    public final void a(String str) {
        me meVar = new me(str);
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.f.add(meVar);
            int length = this.g + meVar.a.length();
            this.g = length;
            if (length > 1048576) {
                while (this.g > 838860) {
                    this.g -= ((me) this.f.remove(0)).a.length();
                    this.e++;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(he heVar, ce ceVar) {
        return "Received SdkDebuggerConfigUpdateEvent. Updating SDK Debugger config with " + heVar.a + ".\nOld config " + ceVar;
    }
}
