package o;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.common.api.Status;
import o.addOnPictureInPictureUiStateChangedListener;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setSyncPolicyOfflineStatuslambda10 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ Context RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ addOnPictureInPictureUiStateChangedListener write;

    public /* synthetic */ setSyncPolicyOfflineStatuslambda10(Context context, addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistener, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = context;
        this.write = addonpictureinpictureuistatechangedlistener;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.serializer;
        final addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistener = this.write;
        Context context = this.RemoteActionCompatParcelizer;
        getPersonNamePrefix getpersonnameprefix = (getPersonNamePrefix) obj;
        final int i4 = 0;
        if (i3 != 0) {
            getpersonnameprefix.getClass();
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Registering SMS broadcast receiver", new Object[0]);
            IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            final int i5 = 1;
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.roadrunner.twofa.presentation.compose.SmsBroadcastReceiverKt$SmsBroadcastReceiver$1$1$broadcast$1
                private static int IconCompatParcelizer = 1;
                private static int read;

                /* JADX WARN: Code duplicated, block: B:20:0x0064 A[PHI: r2 r10
  0x0064: PHI (r2v15 timber.log.Timber$Forest) = (r2v14 timber.log.Timber$Forest), (r2v19 timber.log.Timber$Forest) binds: [B:19:0x0062, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r10v7 android.os.Bundle) = (r10v6 android.os.Bundle), (r10v10 android.os.Bundle) binds: [B:19:0x0062, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:21:0x0069 A[PHI: r2 r10
  0x0069: PHI (r2v18 timber.log.Timber$Forest) = (r2v14 timber.log.Timber$Forest), (r2v19 timber.log.Timber$Forest) binds: [B:19:0x0062, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r10v9 android.os.Bundle) = (r10v6 android.os.Bundle), (r10v10 android.os.Bundle) binds: [B:19:0x0062, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    Object obj2;
                    String action;
                    Timber.Forest forest;
                    Bundle extras;
                    Object obj3;
                    int i6 = 2 % 2;
                    int i7 = i5;
                    addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistener2 = addonpictureinpictureuistatechangedlistener;
                    Status status = null;
                    if (i7 == 0) {
                        if (!"com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent != null ? intent.getAction() : null)) {
                            return;
                        }
                        Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                        forest2.IconCompatParcelizer("Received 2FA sms code", new Object[0]);
                        Bundle extras2 = intent.getExtras();
                        if (extras2 != null) {
                            int i8 = read + 95;
                            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 == 0) {
                                extras2.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                                throw null;
                            }
                            obj2 = extras2.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof Status) {
                            status = (Status) obj2;
                            int i9 = read + 59;
                            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                        }
                        if (status == null) {
                            return;
                        }
                        int i11 = status.MediaBrowserCompatMediaItem;
                        if (i11 != 0) {
                            if (i11 != 15) {
                                return;
                            }
                            forest2.IconCompatParcelizer("SMS consent timed out", new Object[0]);
                            return;
                        }
                        forest2.IconCompatParcelizer("SmsRetriever: Successfully received SMS", new Object[0]);
                        Intent intent2 = Build.VERSION.SDK_INT >= 33 ? (Intent) extras2.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT", Intent.class) : (Intent) extras2.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                        if (intent2 != null) {
                            try {
                                forest2.IconCompatParcelizer("Launching SMS consent intent to request user's permission to read the SMS", new Object[0]);
                                addonpictureinpictureuistatechangedlistener2.write(intent2);
                                return;
                            } catch (ActivityNotFoundException e) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to launch SMS consent intent", new Object[0]);
                                return;
                            }
                        }
                        return;
                    }
                    if (intent != null) {
                        int i12 = read + 23;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 == 0) {
                            intent.getAction();
                            throw null;
                        }
                        action = intent.getAction();
                    } else {
                        action = null;
                    }
                    if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(action)) {
                        int i13 = IconCompatParcelizer + 103;
                        read = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 != 0) {
                            forest = Timber.RemoteActionCompatParcelizer;
                            forest.IconCompatParcelizer("Received OTP sms code", new Object[0]);
                            extras = intent.getExtras();
                            if (extras != null) {
                                obj3 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                            } else {
                                obj3 = null;
                            }
                        } else {
                            forest = Timber.RemoteActionCompatParcelizer;
                            forest.IconCompatParcelizer("Received OTP sms code", new Object[0]);
                            extras = intent.getExtras();
                            if (extras != null) {
                                obj3 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                            } else {
                                obj3 = null;
                            }
                        }
                        if (obj3 instanceof Status) {
                            int i14 = IconCompatParcelizer + 11;
                            read = i14 % Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                            status = (Status) obj3;
                        }
                        if (status == null) {
                            return;
                        }
                        int i16 = status.MediaBrowserCompatMediaItem;
                        if (i16 != 0) {
                            if (i16 != 15) {
                                return;
                            }
                            forest.IconCompatParcelizer("SMS consent timed out", new Object[0]);
                            return;
                        }
                        forest.IconCompatParcelizer("SmsRetriever: Successfully received SMS", new Object[0]);
                        Intent intent3 = Build.VERSION.SDK_INT >= 33 ? (Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT", Intent.class) : (Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                        if (intent3 != null) {
                            try {
                                forest.IconCompatParcelizer("Launching SMS consent intent to request user's permission to read the SMS", new Object[0]);
                                addonpictureinpictureuistatechangedlistener2.write(intent3);
                            } catch (ActivityNotFoundException e2) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Failed to launch SMS consent intent", new Object[0]);
                            }
                        }
                    }
                }
            };
            FocusListener.read(context, broadcastReceiver, intentFilter, "com.google.android.gms.auth.api.phone.permission.SEND", 2);
            return new refreshFeatureFlagslambda10(context, 13, broadcastReceiver);
        }
        getpersonnameprefix.getClass();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Registering SMS broadcast receiver", new Object[0]);
        IntentFilter intentFilter2 = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        BroadcastReceiver broadcastReceiver2 = new BroadcastReceiver() { // from class: com.roadrunner.twofa.presentation.compose.SmsBroadcastReceiverKt$SmsBroadcastReceiver$1$1$broadcast$1
            private static int IconCompatParcelizer = 1;
            private static int read;

            /* JADX WARN: Code duplicated, block: B:20:0x0064 A[PHI: r2 r10
  0x0064: PHI (r2v15 timber.log.Timber$Forest) = (r2v14 timber.log.Timber$Forest), (r2v19 timber.log.Timber$Forest) binds: [B:19:0x0062, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r10v7 android.os.Bundle) = (r10v6 android.os.Bundle), (r10v10 android.os.Bundle) binds: [B:19:0x0062, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:21:0x0069 A[PHI: r2 r10
  0x0069: PHI (r2v18 timber.log.Timber$Forest) = (r2v14 timber.log.Timber$Forest), (r2v19 timber.log.Timber$Forest) binds: [B:19:0x0062, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r10v9 android.os.Bundle) = (r10v6 android.os.Bundle), (r10v10 android.os.Bundle) binds: [B:19:0x0062, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                Object obj2;
                String action;
                Timber.Forest forest;
                Bundle extras;
                Object obj3;
                int i6 = 2 % 2;
                int i7 = i4;
                addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistener2 = addonpictureinpictureuistatechangedlistener;
                Status status = null;
                if (i7 == 0) {
                    if (!"com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent != null ? intent.getAction() : null)) {
                        return;
                    }
                    Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                    forest2.IconCompatParcelizer("Received 2FA sms code", new Object[0]);
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        int i8 = read + 95;
                        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                            extras2.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                            throw null;
                        }
                        obj2 = extras2.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof Status) {
                        status = (Status) obj2;
                        int i9 = read + 59;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    }
                    if (status == null) {
                        return;
                    }
                    int i11 = status.MediaBrowserCompatMediaItem;
                    if (i11 != 0) {
                        if (i11 != 15) {
                            return;
                        }
                        forest2.IconCompatParcelizer("SMS consent timed out", new Object[0]);
                        return;
                    }
                    forest2.IconCompatParcelizer("SmsRetriever: Successfully received SMS", new Object[0]);
                    Intent intent2 = Build.VERSION.SDK_INT >= 33 ? (Intent) extras2.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT", Intent.class) : (Intent) extras2.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                    if (intent2 != null) {
                        try {
                            forest2.IconCompatParcelizer("Launching SMS consent intent to request user's permission to read the SMS", new Object[0]);
                            addonpictureinpictureuistatechangedlistener2.write(intent2);
                            return;
                        } catch (ActivityNotFoundException e) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to launch SMS consent intent", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
                if (intent != null) {
                    int i12 = read + 23;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        intent.getAction();
                        throw null;
                    }
                    action = intent.getAction();
                } else {
                    action = null;
                }
                if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(action)) {
                    int i13 = IconCompatParcelizer + 103;
                    read = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        forest = Timber.RemoteActionCompatParcelizer;
                        forest.IconCompatParcelizer("Received OTP sms code", new Object[0]);
                        extras = intent.getExtras();
                        if (extras != null) {
                            obj3 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        } else {
                            obj3 = null;
                        }
                    } else {
                        forest = Timber.RemoteActionCompatParcelizer;
                        forest.IconCompatParcelizer("Received OTP sms code", new Object[0]);
                        extras = intent.getExtras();
                        if (extras != null) {
                            obj3 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        } else {
                            obj3 = null;
                        }
                    }
                    if (obj3 instanceof Status) {
                        int i14 = IconCompatParcelizer + 11;
                        read = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        status = (Status) obj3;
                    }
                    if (status == null) {
                        return;
                    }
                    int i16 = status.MediaBrowserCompatMediaItem;
                    if (i16 != 0) {
                        if (i16 != 15) {
                            return;
                        }
                        forest.IconCompatParcelizer("SMS consent timed out", new Object[0]);
                        return;
                    }
                    forest.IconCompatParcelizer("SmsRetriever: Successfully received SMS", new Object[0]);
                    Intent intent3 = Build.VERSION.SDK_INT >= 33 ? (Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT", Intent.class) : (Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                    if (intent3 != null) {
                        try {
                            forest.IconCompatParcelizer("Launching SMS consent intent to request user's permission to read the SMS", new Object[0]);
                            addonpictureinpictureuistatechangedlistener2.write(intent3);
                        } catch (ActivityNotFoundException e2) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Failed to launch SMS consent intent", new Object[0]);
                        }
                    }
                }
            }
        };
        FocusListener.read(context, broadcastReceiver2, intentFilter2, "com.google.android.gms.auth.api.phone.permission.SEND", 2);
        refreshFeatureFlagslambda10 refreshfeatureflagslambda10 = new refreshFeatureFlagslambda10(context, 14, broadcastReceiver2);
        int i6 = read + 7;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return refreshfeatureflagslambda10;
        }
        throw null;
    }
}
