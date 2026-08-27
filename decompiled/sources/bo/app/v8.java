package bo.app;

import android.content.Context;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import o.isAdapterPositionOnScreen;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class v8 {
    public final Context a;
    public final x9 b;
    public final onViewDetachedFromWindowlambda1 c;
    public final onViewDetachedFromWindowlambda1 d;

    public static final boolean d() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.messaging.FirebaseMessaging", "getToken", new Class[0]);
    }

    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Automatically obtained Firebase Cloud Messaging push token: ", str);
    }

    public static final String e() {
        return "Failed to register for Firebase Cloud Messaging";
    }

    public static final String f() {
        return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String g() {
        return "Could not call 'getInstance' method. Not registering for Firebase Cloud Messaging.";
    }

    public static final String h() {
        return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
    }

    public static final String i() {
        return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
    }

    public static final String j() {
        return "Could not invoke 'getToken()' Not registering for Firebase Cloud Messaging.";
    }

    public static final String k() {
        return "Failed to get push token via instance id";
    }

    public final void c(String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 27), 6, (Object) null);
        try {
            Method methodQuietly = ReflectionUtils.getMethodQuietly("com.google.firebase.iid.FirebaseInstanceId", "getInstance", (Class<?>[]) new Class[0]);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(18), 7, (Object) null);
                return;
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0InvokeMethodQuietly = ReflectionUtils.invokeMethodQuietly(null, methodQuietly, new Object[0]);
            if (!((Boolean) onviewattachedtowindowlambda0InvokeMethodQuietly.serializer).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(19), 7, (Object) null);
                return;
            }
            Object obj = onviewattachedtowindowlambda0InvokeMethodQuietly.write;
            if (obj == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(20), 7, (Object) null);
                return;
            }
            Method methodQuietly2 = ReflectionUtils.getMethodQuietly(obj.getClass(), "getToken", (Class<?>[]) new Class[]{String.class, String.class});
            if (methodQuietly2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(21), 7, (Object) null);
                return;
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0InvokeMethodQuietly2 = ReflectionUtils.invokeMethodQuietly(obj, methodQuietly2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (!((Boolean) onviewattachedtowindowlambda0InvokeMethodQuietly2.serializer).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(22), 7, (Object) null);
                return;
            }
            Object obj2 = onviewattachedtowindowlambda0InvokeMethodQuietly2.write;
            if (obj2 instanceof String) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o7$$ExternalSyntheticLambda2(1, obj2), 6, (Object) null);
                ((cd) this.b).a((String) obj2);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(23), 4, (Object) null);
        }
    }

    public v8(Context context, x9 x9Var) {
        context.getClass();
        x9Var.getClass();
        this.a = context;
        this.b = x9Var;
        this.c = new isAdapterPositionOnScreen(new s8$$ExternalSyntheticLambda0(16));
        this.d = new isAdapterPositionOnScreen(new s8$$ExternalSyntheticLambda0(17));
    }

    public final void a(String str) {
        str.getClass();
        try {
            if (((Boolean) this.d.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new StreamSharing$$ExternalSyntheticLambda0(20, this));
            } else if (((Boolean) this.c.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                c(str);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(14), 4, (Object) null);
        }
    }

    public static final String b() {
        return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
    }

    public static final String d(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Registering for Firebase Cloud Messaging token using sender id: ", str);
    }

    public static final void a(v8 v8Var, Task task) {
        task.getClass();
        if (!task.isSuccessful()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) v8Var, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(23, task), 6, (Object) null);
            return;
        }
        String str = (String) task.getResult();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) v8Var, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 26), 6, (Object) null);
        ((cd) v8Var.b).a(str);
    }

    public static final String a(Task task) {
        return "Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception " + task.getException();
    }

    public final boolean a() {
        if (com.braze.support.g.b(this.a)) {
            return ((Boolean) this.d.MediaSessionCompatResultReceiverWrapper()).booleanValue() || ((Boolean) this.c.MediaSessionCompatResultReceiverWrapper()).booleanValue();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(15), 6, (Object) null);
        return false;
    }

    public static final String a(Object obj) {
        return m1$$ExternalSyntheticOutline0.m(obj, "Automatically obtained Firebase Cloud Messaging token: ");
    }

    public static final boolean c() {
        return ReflectionUtils.doesMethodExist("com.google.firebase.iid.FirebaseInstanceId", "getToken", String.class, String.class);
    }
}
