package com.google.android.gms.common;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.tasks.Task;
import com.huawei.hmf.tasks.a.j;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.FocusListener;
import o.Placeable;
import o.accessgetNumPad7cp;
import o.accessgetNumPadAddcp;
import o.accessgetNumPadLeftParenthesiscp;
import o.accessgetOcp;
import o.accessgetPcp;
import o.accessgetProgramRedcp;
import o.accessgetShiftLeftcp;
import o.accessgetSoftLeftcp;
import o.accessgetSoftRightcp;
import o.accessgetStem2cp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvNetworkcp;
import o.accessgetTvPowercp;
import o.getAvReceiverPowerEK5gGoQ;
import o.getBackEK5gGoQ;
import o.getEnterdhqQ8s;
import o.getExitdhqQ8s;
import o.isAppSetIdReadingEnabled;
import o.onBackPressed;
import o.setNativeShader;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private accessgetSoftLeftcp zad;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public int getClientVersion(Context context) {
        return GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    public final boolean isUserResolvableError(int i) {
        int i2 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public final boolean zaj(int i) {
        if (i == 9) {
            return true;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public Task checkApiAvailability(Executor executor, accessgetNumPadAddcp accessgetnumpadaddcp, accessgetNumPadAddcp... accessgetnumpadaddcpArr) {
        GoogleApiManager googleApiManager;
        accessgetSystemNavigationDowncp.serializer(accessgetnumpadaddcp, "Requested API must not be null.");
        for (accessgetNumPadAddcp accessgetnumpadaddcp2 : accessgetnumpadaddcpArr) {
            accessgetSystemNavigationDowncp.serializer(accessgetnumpadaddcp2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(accessgetnumpadaddcpArr.length + 1);
        arrayList.add(accessgetnumpadaddcp);
        arrayList.addAll(Arrays.asList(accessgetnumpadaddcpArr));
        synchronized (GoogleApiManager.write) {
            accessgetSystemNavigationDowncp.serializer(GoogleApiManager.serializer, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = GoogleApiManager.serializer;
        }
        googleApiManager.getClass();
        accessgetProgramRedcp accessgetprogramredcp = new accessgetProgramRedcp(arrayList);
        getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(2, accessgetprogramredcp));
        return accessgetprogramredcp.serializer().onSuccessTask(executor, j.serializer);
    }

    public Dialog getErrorDialog(Fragment fragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i, accessgetStem2cp.read(fragment, getErrorResolutionIntent(fragment.requireContext(), i, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), i2), onCancelListener, null);
    }

    public final String getErrorString(int i) {
        int i2 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return ConnectionResult.read(i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public Task makeGooglePlayServicesAvailable(Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("makeGooglePlayServicesAvailable must be called from the main thread");
            return null;
        }
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (iIsGooglePlayServicesAvailable == 0) {
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        zabw zabwVarSerializer = zabw.serializer(activity);
        zabwVarSerializer.serializer(new ConnectionResult(iIsGooglePlayServicesAvailable, null, null), 0);
        return zabwVarSerializer.MediaMetadataCompat();
    }

    @TargetApi
    public void setDefaultNotificationChannelId(Context context, String str) {
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(systemService);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(((NotificationManager) systemService).getNotificationChannel(str));
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(Activity activity, int i, onBackPressed onbackpressed, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i, null, onCancelListener, new accessgetTvNetworkcp(this, activity, i, onbackpressed));
        if (dialogZaa == null) {
            return false;
        }
        zah(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zab(Activity activity, accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i, accessgetStem2cp.serializer(getErrorResolutionIntent(activity, i, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), accessgetnumpadleftparenthesiscp), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zah(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final void zai(Context context) {
        new accessgetTvPowercp(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        PendingIntent pendingIntent;
        int i = connectionResult.IconCompatParcelizer;
        return (i == 0 || (pendingIntent = connectionResult.serializer) == null) ? getErrorResolutionPendingIntent(context, i, 0) : pendingIntent;
    }

    public final accessgetPcp zag(Context context, accessgetOcp accessgetocp) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        accessgetPcp accessgetpcp = new accessgetPcp(accessgetocp);
        FocusListener.read(context, accessgetpcp, intentFilter, null, 2);
        accessgetpcp.IconCompatParcelizer(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return accessgetpcp;
        }
        accessgetocp.serializer();
        accessgetpcp.RemoteActionCompatParcelizer();
        return null;
    }

    public final void zah(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.read(dialog, onCancelListener).RemoteActionCompatParcelizer(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.write(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zac(context, new ConnectionResult(1, connectionResult.IconCompatParcelizer, getErrorResolutionPendingIntent(context, connectionResult), connectionResult.read, connectionResult.MediaBrowserCompatMediaItem), null);
    }

    public final Dialog zaa(Context context, int i, accessgetStem2cp accessgetstem2cp, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(accessgetSoftRightcp.read(context, i));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strSerializer = accessgetSoftRightcp.serializer(context, i);
        DialogInterface.OnClickListener onClickListener2 = accessgetstem2cp;
        if (strSerializer != null) {
            if (accessgetstem2cp == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strSerializer, onClickListener2);
        }
        String strWrite = accessgetSoftRightcp.write(context, i);
        if (strWrite != null) {
            builder2.setTitle(strWrite);
        }
        SentryLogcatAdapter.write("GoogleApiAvailability", c8$$ExternalSyntheticOutline0.m(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder2.create();
    }

    public final void zac(Context context, ConnectionResult connectionResult, String str) {
        String str2;
        int i;
        int i2 = connectionResult.IconCompatParcelizer;
        SentryLogcatAdapter.write("GoogleApiAvailability", d$$ExternalSyntheticOutline0.m(i2, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            zai(context);
            return;
        }
        PendingIntent pendingIntent = connectionResult.serializer;
        if (pendingIntent == null) {
            if (i2 == 6) {
                SentryLogcatAdapter.IconCompatParcelizer("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strIconCompatParcelizer = accessgetSoftRightcp.IconCompatParcelizer(context, i2);
        String strRemoteActionCompatParcelizer = accessgetSoftRightcp.RemoteActionCompatParcelizer(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        getEnterdhqQ8s getenterdhqq8s = new getEnterdhqQ8s(context);
        getenterdhqq8s.RemoteActionCompatParcelizer();
        getenterdhqq8s.write(true);
        getenterdhqq8s.read(strIconCompatParcelizer);
        getExitdhqQ8s getexitdhqq8s = new getExitdhqQ8s();
        getexitdhqq8s.write(strRemoteActionCompatParcelizer);
        getenterdhqq8s.RemoteActionCompatParcelizer(getexitdhqq8s);
        PackageManager packageManager = context.getPackageManager();
        if (DefaultContentCardsUpdateHandlerCompanionCREATOR1.write == null) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.write = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = DefaultContentCardsUpdateHandlerCompanionCREATOR1.write.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            getenterdhqq8s.IconCompatParcelizer(i3);
            getenterdhqq8s.read();
            if (DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(context)) {
                getenterdhqq8s.RemoteActionCompatParcelizer(2131230912, resources.getString(com.logistics.rider.glovo.R.string.common_open_on_phone), pendingIntent);
            } else {
                getenterdhqq8s.serializer(pendingIntent);
            }
        } else {
            getenterdhqq8s.IconCompatParcelizer(R.drawable.stat_sys_warning);
            getenterdhqq8s.serializer(resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_notification_ticker));
            getenterdhqq8s.serializer(System.currentTimeMillis());
            getenterdhqq8s.serializer(pendingIntent);
            getenterdhqq8s.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer);
        }
        synchronized (zaa) {
            str2 = this.zac;
        }
        if (str2 == null) {
            str2 = "com.google.android.gms.availability";
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.logistics.rider.glovo.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        getenterdhqq8s.IconCompatParcelizer(str2);
        Notification notificationWrite = getenterdhqq8s.write();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            GooglePlayServicesUtilLight.write.set(false);
            i = 10436;
        } else {
            i = 39789;
        }
        notificationManager.notify(i, notificationWrite);
        zae(context, connectionResult, false);
    }

    public final Dialog zaf(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(accessgetSoftRightcp.read(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zah(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public final boolean zad(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent;
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        if (((Boolean) setNativeShader.read(2109582589, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{context}, iSerializer, isAppSetIdReadingEnabled.serializer(), -2109582586)).booleanValue() || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zac(context, new ConnectionResult(1, connectionResult.IconCompatParcelizer, getAvReceiverPowerEK5gGoQ.serializer(getAvReceiverPowerEK5gGoQ.RemoteActionCompatParcelizer | 134217728, context, GoogleApiActivity.write(context, errorResolutionPendingIntent, i, true)), connectionResult.read, connectionResult.MediaBrowserCompatMediaItem), null);
        return true;
    }

    public final void zae(Context context, ConnectionResult connectionResult, boolean z) {
        Integer num = connectionResult.MediaBrowserCompatMediaItem;
        int iIntValue = num == null ? -1 : num.intValue();
        zab zabVar = new zab(iIntValue, connectionResult.IconCompatParcelizer, System.currentTimeMillis(), context.getPackageName(), z);
        if (this.zad == null) {
            this.zad = new accessgetShiftLeftcp(context);
        }
        ((accessgetShiftLeftcp) this.zad).RemoteActionCompatParcelizer(zabVar);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, null);
    }

    public void showErrorNotification(Context context, int i) {
        zac(context, new ConnectionResult(i, getErrorResolutionPendingIntent(context, i, 0, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID), null), null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zah(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, accessgetStem2cp.serializer(activity, getErrorResolutionIntent(activity, i, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), i2), onCancelListener, null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(Fragment fragment, int i, int i2) {
        return getErrorDialog(fragment, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public Task checkApiAvailability(accessgetNumPadAddcp accessgetnumpadaddcp, accessgetNumPadAddcp... accessgetnumpadaddcpArr) {
        return checkApiAvailability(Placeable.RemoteActionCompatParcelizer, accessgetnumpadaddcp, accessgetnumpadaddcpArr);
    }

    public Task checkApiAvailability(accessgetNumPad7cp accessgetnumpad7cp, accessgetNumPad7cp... accessgetnumpad7cpArr) {
        return checkApiAvailability(Placeable.RemoteActionCompatParcelizer, accessgetnumpad7cp, accessgetnumpad7cpArr);
    }
}
