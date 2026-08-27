package io.sentry.android.replay;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class accessensureViewModelStore extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final accessensureViewModelStore IconCompatParcelizer;
    public static final accessensureViewModelStore RemoteActionCompatParcelizer;
    public static final accessensureViewModelStore read;
    public static final accessensureViewModelStore serializer;
    public static final accessensureViewModelStore write;
    public final /* synthetic */ int MediaMetadataCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ accessensureViewModelStore(int i, int i2) {
        super(i);
        this.MediaMetadataCompat = i2;
    }

    static {
        int i = 0;
        RemoteActionCompatParcelizer = new accessensureViewModelStore(i, 1);
        write = new accessensureViewModelStore(i, 2);
        serializer = new accessensureViewModelStore(i, 3);
        read = new accessensureViewModelStore(i, 4);
        IconCompatParcelizer = new accessensureViewModelStore(i, i);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws NoSuchFieldException {
        Method method;
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            Class cls = (Class) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write.MediaSessionCompatResultReceiverWrapper();
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
            onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read;
            Class cls2 = (Class) r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read.MediaSessionCompatResultReceiverWrapper();
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
                Log.w("WindowManagerSpy", th);
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
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read;
        Class cls3 = (Class) r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read.MediaSessionCompatResultReceiverWrapper();
        if (cls3 == null || (method = cls3.getMethod("getInstance", null)) == null) {
            return null;
        }
        return method.invoke(null, null);
    }
}
