package o;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.WeakHashMap;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusListener {
    public static String serializer(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (BrazeSdkAuthenticationErrorEvent.serializer(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (BrazeSdkAuthenticationErrorEvent.serializer(context, str) == 0) {
                return str;
            }
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(ff$$ExternalSyntheticOutline0.m("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    public static void serializer(Context context, boolean z, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        try {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                SentryLogcatAdapter.serializer("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            SharedPreferences.Editor editorEdit = TuplesKt.read(context).edit();
            editorEdit.putBoolean("proxy_notification_initialized", true);
            editorEdit.apply();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            parentDataModifierDefaultImpls.write(null);
        }
    }

    public static int write(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return context.checkPermission(str, Process.myPid(), Process.myUid());
            }
            return androidx.core.app.NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("permission must be non-null");
        return 0;
    }

    public static ColorStateList write(Context context, int i) {
        ColorStateList colorStateListSerializer;
        ColorStateList colorStateList;
        setNext setnext;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        setDown setdown = new setDown(resources, theme);
        synchronized (setLeft.write) {
            SparseArray sparseArray = (SparseArray) setLeft.serializer.get(setdown);
            colorStateListSerializer = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (setnext = (setNext) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!setnext.write.equals(resources.getConfiguration()) || (!(theme == null && setnext.read == 0) && (theme == null || setnext.read != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = setnext.RemoteActionCompatParcelizer;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = setLeft.read;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListSerializer = getDown.serializer(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                SentryLogcatAdapter.write("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListSerializer == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (setLeft.write) {
            WeakHashMap weakHashMap = setLeft.serializer;
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(setdown);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(setdown, sparseArray2);
            }
            sparseArray2.append(i, new setNext(colorStateListSerializer, setdown.IconCompatParcelizer.getConfiguration(), theme));
        }
        return colorStateListSerializer;
    }

    public static void RemoteActionCompatParcelizer(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (TuplesKt.read(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), androidx.compose.ui.graphics.Fields.SpotShadowColor)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            new f$$ExternalSyntheticLambda1(context, z, new ParentDataModifierDefaultImpls(), 2).run();
        } else {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
    }

    public static boolean write(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        }
        SentryLogcatAdapter.serializer("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
        return false;
    }

    public static Intent read(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i2 != 0 && (i & 4) != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, null, i);
        }
        return downloadFileToPathlambda3.write(context, broadcastReceiver, intentFilter, str, i);
    }
}
