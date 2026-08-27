package com.incognia.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.regex.Pattern;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.isCurrentlyDisplayingInAppMessage;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class Tj {
    public static final long A1 = 10000;
    public final Context BGx;
    public final mAX HQ;
    public w mbG;
    public static final Uri q = Uri.parse((String) W4i.SXr.MediaSessionCompatResultReceiverWrapper());
    public static final String fZl = (String) W4i.Nt.MediaSessionCompatResultReceiverWrapper();
    public final onViewDetachedFromWindowlambda1 N = new isAdapterPositionOnScreen(new hJ(this));
    public final onViewDetachedFromWindowlambda1 x = new isAdapterPositionOnScreen(new WV(this));
    public final onViewDetachedFromWindowlambda1 hIl = new isAdapterPositionOnScreen(new SM(this));
    public final onViewDetachedFromWindowlambda1 hs = new isAdapterPositionOnScreen(new h6(this));
    public final onViewDetachedFromWindowlambda1 VV3 = new isAdapterPositionOnScreen(new Zdj(this));

    public final String mbG() {
        Object isitemdismissable;
        try {
            Cursor cursorQuery = this.BGx.getContentResolver().query(q, null, null, new String[]{fZl}, null);
            if (cursorQuery != null) {
                try {
                    isitemdismissable = (!cursorQuery.moveToFirst() || cursorQuery.getColumnCount() <= 1) ? null : cursorQuery.getString(1);
                    cursorQuery.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorQuery, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            } else {
                isitemdismissable = null;
            }
        } catch (Throwable th3) {
            isitemdismissable = new isItemDismissable(th3);
        }
        return (String) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
    }

    public final void BGx(BlY blY) {
        if (!((Boolean) this.hIl.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
            blY.invoke(null);
            return;
        }
        Context context = uF.BGx;
        if (context == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Using SDK context before initialization");
        } else {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new PerseusInitializerImpl$$ExternalSyntheticLambda0(3, new t4x(blY))).addOnFailureListener(new PerseusInitializerImpl$$ExternalSyntheticLambda0(4, blY));
        }
    }

    public final w HQ() {
        if (!((Boolean) this.x.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
            return null;
        }
        String str = XUh.fZl;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[Nn]exus.*5[xX]");
            patternCompile.getClass();
            if (patternCompile.matcher(str).matches()) {
                return null;
            }
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.BGx);
            return new w(advertisingIdInfo.getId(), Boolean.valueOf(!advertisingIdInfo.isLimitAdTrackingEnabled()));
        } catch (Throwable th) {
            if (!IU.BGx.get()) {
                return null;
            }
            Log.w("Incognia", isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("GooglePlayServices access error: \n                        |Unable to obtain AdvertisingIdClient.getAdvertisingIdInfo(): \n                        |" + th.getMessage()));
            return null;
        }
    }

    public Tj(Context context, KWh kWh) {
        this.BGx = context;
        this.HQ = new mAX(kWh, A1);
    }

    public static final boolean BGx(Tj tj, Class... clsArr) {
        tj.getClass();
        if (hideCurrentlyDisplayingInAppMessage.read((CharSequence) "com.google.android.gms.location.FusedLocationProviderClient").toString().length() == 0 || hideCurrentlyDisplayingInAppMessage.read((CharSequence) "getCurrentLocation").toString().length() == 0) {
            return false;
        }
        try {
            FusedLocationProviderClient.class.getMethod("getCurrentLocation", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public static final boolean BGx(Tj tj, String str) {
        tj.getClass();
        if (hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString().length() == 0) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final Integer BGx() {
        Integer num;
        synchronized (this) {
            if (this.HQ.BGx()) {
                this.HQ.BGx(Integer.valueOf(((Boolean) this.N.MediaSessionCompatResultReceiverWrapper()).booleanValue() ? GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE : -1));
            }
            num = (Integer) this.HQ.N;
        }
        return num;
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Exception exc) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(null);
    }
}
