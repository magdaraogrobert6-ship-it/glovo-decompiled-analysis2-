package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.huawei.riemann.location.common.utils.Constant;
import io.sentry.SentryEnvelopeItem;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BannerViewattachStateListener1 implements Callable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ BannerViewattachStateListener1(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        int i2 = this.IconCompatParcelizer;
        if (i2 == 0) {
            BaseBrazeActionStep baseBrazeActionStep = (BaseBrazeActionStep) this.RemoteActionCompatParcelizer;
            r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I r8lambdapr0zohngrdffbcgpp9owzbum0i = (r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I) this.write;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, SentryEnvelopeItem.serializer));
                try {
                    baseBrazeActionStep.serializer(bufferedWriter, r8lambdapr0zohngrdffbcgpp9owzbum0i);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (i2 == 1) {
            return getBevelLxFBmk8.serializer(Okio.RemoteActionCompatParcelizer(new ByteArrayInputStream(((String) this.RemoteActionCompatParcelizer).getBytes())), (String) this.write);
        }
        if (i2 != 2) {
            BaseBrazeActionStep baseBrazeActionStep2 = (BaseBrazeActionStep) this.RemoteActionCompatParcelizer;
            r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8 r8lambdaezx9vf3n2mjvwrdqvqgqjgg8 = (r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8) this.write;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, SentryEnvelopeItem.serializer));
                try {
                    baseBrazeActionStep2.serializer(bufferedWriter2, r8lambdaezx9vf3n2mjvwrdqvqgqjgg8);
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    bufferedWriter2.close();
                    byteArrayOutputStream2.close();
                    return byteArray2;
                } catch (Throwable th5) {
                    try {
                        bufferedWriter2.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        }
        Context context = (Context) this.RemoteActionCompatParcelizer;
        Intent intent = (Intent) this.write;
        androidx.transition.TransitionValuesMaps transitionValuesMaps = androidx.transition.TransitionValuesMaps.read();
        transitionValuesMaps.getClass();
        Log.isLoggable("FirebaseMessaging", 3);
        ((ArrayDeque) transitionValuesMaps.RatingCompat).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (transitionValuesMaps) {
            str = (String) transitionValuesMaps.MediaBrowserCompatMediaItem;
            if (str == null) {
                ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                    SentryLogcatAdapter.serializer("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                    SentryLogcatAdapter.serializer("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                } else {
                    if (str2.startsWith(".")) {
                        transitionValuesMaps.MediaBrowserCompatMediaItem = context.getPackageName() + serviceInfo.name;
                    } else {
                        transitionValuesMaps.MediaBrowserCompatMediaItem = serviceInfo.name;
                    }
                    str = (String) transitionValuesMaps.MediaBrowserCompatMediaItem;
                }
                str = null;
            }
        }
        if (str != null) {
            Log.isLoggable("FirebaseMessaging", 3);
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if ((transitionValuesMaps.IconCompatParcelizer(context) ? accessfindNextNonChildView.IconCompatParcelizer(context, intent2) : context.startService(intent2)) == null) {
                SentryLogcatAdapter.serializer("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i = 404;
            } else {
                i = -1;
            }
        } catch (IllegalStateException e) {
            SentryLogcatAdapter.serializer("FirebaseMessaging", "Failed to start service while in background: " + e);
            i = Constant.ERROR_ALGO_NOT_START;
        } catch (SecurityException e2) {
            SentryLogcatAdapter.read("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            i = Constant.ERROR_ALGO_NULL_RESULT;
        }
        return Integer.valueOf(i);
    }
}
