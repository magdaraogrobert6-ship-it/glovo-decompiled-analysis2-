package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.deliveryhero.customerchat.analytics.model.Contact;
import com.deliveryhero.customerchat.analytics.model.Product;
import com.deliveryhero.customerchat.analytics.model.User;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.applyAlpha;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.resolveLockHardwareCanvasMethod;
import o.safeSetClipToOutline;
import o.validateSizeN5eqBDc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ParcelableVolumeInfo {
    public static User IconCompatParcelizer(validateSizeN5eqBDc validatesizen5eqbdc, applyAlpha applyalpha) {
        String strName;
        String str = validatesizen5eqbdc.read;
        safeSetClipToOutline safesetcliptooutlineIconCompatParcelizer = null;
        lowerCase = null;
        String lowerCase = null;
        if (applyalpha != null) {
            applyAlpha.Companion.getClass();
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = applyalpha.userType;
            if (resolvelockhardwarecanvasmethod != null && (strName = resolvelockhardwarecanvasmethod.name()) != null) {
                lowerCase = strName.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            safesetcliptooutline.put("user_type", lowerCase);
            safesetcliptooutline.put("device_type", applyalpha.deviceType);
            safesetcliptooutline.put("device_name", applyalpha.deviceName);
            safesetcliptooutline.put("device_manufacturer", applyalpha.deviceManufacturer);
            safesetcliptooutline.put("os_version", applyalpha.osVersion);
            safesetcliptooutline.put(HianalyticsBaseData.SDK_TYPE, applyalpha.sdkType);
            safesetcliptooutline.put(HianalyticsBaseData.SDK_VERSION, applyalpha.sdkVersion);
            safesetcliptooutline.put("host_app", applyalpha.hostApp);
            safesetcliptooutline.put("app_version", applyalpha.appVersion);
            safesetcliptooutline.put("sdk_consumer_version", String.valueOf(applyalpha.sdkConsumerVersion));
            safesetcliptooutline.put("source", "native");
            safesetcliptooutlineIconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer();
        }
        return new User(str, safesetcliptooutlineIconCompatParcelizer);
    }

    public static Contact RemoteActionCompatParcelizer(validateSizeN5eqBDc validatesizen5eqbdc) {
        String str = validatesizen5eqbdc.RemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sent_from", "client");
        linkedHashMap.put("user_types", "['rider','customer']");
        return new Contact(str, linkedHashMap);
    }

    public static Product read(applyAlpha applyalpha) {
        return new Product(null, applyalpha != null ? applyalpha.sdkVersion : null, 1, null);
    }

    public static Bitmap IconCompatParcelizer(Activity activity, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        boolean z = false;
        if (activity.isFinishing() || activity.isDestroyed()) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
            HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
            handlerThread.start();
            try {
                Handler handler = new Handler(handlerThread.getLooper());
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                PixelCopy.request(window, bitmapCreateBitmap, new MediaSessionCompatResultReceiverWrapper(atomicBoolean, 0, countDownLatch), handler);
                if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS) && atomicBoolean.get()) {
                    z = true;
                }
            } catch (Throwable th) {
                try {
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Taking screenshot using PixelCopy failed.", th);
                } catch (Throwable th2) {
                    handlerThread.quit();
                    throw th2;
                }
            }
            handlerThread.quit();
            if (z) {
                return bitmapCreateBitmap;
            }
            return null;
        } catch (Throwable th3) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Taking screenshot failed.", th3);
            return null;
        }
    }

    public static byte[] write(Bitmap bitmap, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        if (bitmap.isRecycled()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                bitmap.recycle();
                if (byteArrayOutputStream.size() <= 0) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                    byteArrayOutputStream.close();
                    return null;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Compressing bitmap failed.", th3);
            return null;
        }
    }
}
