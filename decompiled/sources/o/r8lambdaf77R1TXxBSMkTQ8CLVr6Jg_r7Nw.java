package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw IconCompatParcelizer;
    public static final r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw RemoteActionCompatParcelizer;
    public static final r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw read;
    public static final r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw serializer;
    public static final r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw write;
    public final /* synthetic */ int MediaDescriptionCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw(int i, int i2) {
        super(i);
        this.MediaDescriptionCompat = i2;
    }

    static {
        int i = 0;
        RemoteActionCompatParcelizer = new r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw(i, 1);
        read = new r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw(i, 2);
        IconCompatParcelizer = new r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw(i, 3);
        write = new r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw(i, 4);
        serializer = new r8lambdaf77R1TXxBSMkTQ8CLVr6Jg_r7Nw(i, i);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws NoSuchFieldException {
        int i = this.MediaDescriptionCompat;
        if (i == 0) {
            Class cls = (Class) r8lambdaBpeNKPa9u190VfNoWTWc7zYsu4.write.MediaSessionCompatResultReceiverWrapper();
            if (cls == null) {
                return null;
            }
            try {
                Field declaredField = cls.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls.toString();
                return null;
            }
        }
        if (i == 1) {
            onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = r8lambdaiX7krjhLPWSXoXvd8cgdmEPVXyc.serializer;
            Class cls2 = (Class) r8lambdaiX7krjhLPWSXoXvd8cgdmEPVXyc.serializer.MediaSessionCompatResultReceiverWrapper();
            if (cls2 == null) {
                return null;
            }
            Field declaredField2 = cls2.getDeclaredField("mViews");
            declaredField2.setAccessible(true);
            return declaredField2;
        }
        if (i == 2) {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable th) {
                SentryLogcatAdapter.IconCompatParcelizer("WindowManagerSpy", th);
                return null;
            }
        }
        if (i != 3) {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable unused2) {
                return null;
            }
        }
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda2 = r8lambdaiX7krjhLPWSXoXvd8cgdmEPVXyc.serializer;
        Class cls3 = (Class) r8lambdaiX7krjhLPWSXoXvd8cgdmEPVXyc.serializer.MediaSessionCompatResultReceiverWrapper();
        if (cls3 != null) {
            return cls3.getMethod("getInstance", null).invoke(null, null);
        }
        return null;
    }
}
