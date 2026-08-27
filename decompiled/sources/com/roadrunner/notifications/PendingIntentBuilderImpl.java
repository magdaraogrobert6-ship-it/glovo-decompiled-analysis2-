package com.roadrunner.notifications;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.push.event.PushDeepLink;
import o.AwaitFirstLayoutModifier;
import o.BrazeExternalSyntheticLambda5;
import o.DrawableTransformation;
import o.checkAdjustAdRevenue;
import o.checkForInstallReferrerInfo;
import o.createDeeplinkIntentI;
import o.deleteAttribution;
import o.deleteGlobalCallbackParameters;
import o.disableThirdPartySharingForCoppaEnabledI;
import o.enclosingTransactionruntime;
import o.foregroundTimerFiredI;
import o.getActionViewIntentlambda0;
import o.getCieXyz;
import o.q4ExternalSyntheticLambda9;
import o.q7;
import o.r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ;
import o.re;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class PendingIntentBuilderImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ RemoteActionCompatParcelizer;
    public final q4ExternalSyntheticLambda9 read;
    public final enclosingTransactionruntime serializer;
    public final Application write;

    public PendingIntentBuilderImpl(q4ExternalSyntheticLambda9 q4externalsyntheticlambda9, r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ r8lambda8mkyolzlh_k8e1g4buhcvycf8wq, enclosingTransactionruntime enclosingtransactionruntime, Application application, BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5) {
        this.read = q4externalsyntheticlambda9;
        this.RemoteActionCompatParcelizer = r8lambda8mkyolzlh_k8e1g4buhcvycf8wq;
        this.serializer = enclosingtransactionruntime;
        this.write = application;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    public final PendingIntent IconCompatParcelizer(checkAdjustAdRevenue checkadjustadrevenue, boolean z) {
        String str;
        String str2;
        checkForInstallReferrerInfo checkforinstallreferrerinfo;
        String str3;
        Intent intent;
        String str4;
        PushDeepLink pushDeepLink;
        String str5;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        checkadjustadrevenue.getClass();
        AwaitFirstLayoutModifier awaitFirstLayoutModifier = checkadjustadrevenue.IconCompatParcelizer;
        deleteGlobalCallbackParameters deleteglobalcallbackparameters = checkadjustadrevenue.RemoteActionCompatParcelizer;
        createDeeplinkIntentI createdeeplinkintenti = deleteglobalcallbackparameters.RemoteActionCompatParcelizer;
        int i4 = deleteglobalcallbackparameters.write;
        int i5 = re.IconCompatParcelizer[createdeeplinkintenti.ordinal()];
        Application application = this.write;
        boolean z2 = false;
        q7Var = null;
        q7 q7Var = null;
        PushAnalyticsData pushAnalyticsData = null;
        if (i5 != 1) {
            q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = this.read;
            if (i5 == 2) {
                deleteAttribution deleteattribution = awaitFirstLayoutModifier instanceof deleteAttribution ? (deleteAttribution) awaitFirstLayoutModifier : null;
                if (deleteattribution != null && (str5 = deleteattribution.RemoteActionCompatParcelizer) != null) {
                    q7Var = new q7(str5);
                }
                Context applicationContext = application.getApplicationContext();
                applicationContext.getClass();
                Intent intentWrite = q4ExternalSyntheticLambda9.write(q4externalsyntheticlambda9, applicationContext, q7Var, false, 8);
                Context applicationContext2 = application.getApplicationContext();
                applicationContext2.getClass();
                return BrazeExternalSyntheticLambda5.serializer(i4, applicationContext2, intentWrite);
            }
            if (i5 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i6 = IconCompatParcelizer + 89;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Context applicationContext3 = application.getApplicationContext();
            applicationContext3.getClass();
            Intent intentWrite2 = q4ExternalSyntheticLambda9.write(q4externalsyntheticlambda9, applicationContext3, null, true, 12);
            Context applicationContext4 = application.getApplicationContext();
            applicationContext4.getClass();
            return BrazeExternalSyntheticLambda5.serializer(i4, applicationContext4, intentWrite2);
        }
        if (z) {
            String str6 = deleteglobalcallbackparameters.read;
            str2 = deleteglobalcallbackparameters.serializer;
            str = str6;
        } else {
            str = null;
            str2 = null;
        }
        boolean z3 = awaitFirstLayoutModifier instanceof checkForInstallReferrerInfo;
        if (z3) {
            int i8 = IconCompatParcelizer + 27;
            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                throw null;
            }
            checkforinstallreferrerinfo = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
        } else {
            checkforinstallreferrerinfo = null;
        }
        Context applicationContext5 = application.getApplicationContext();
        if (disableThirdPartySharingForCoppaEnabledI.RemoteActionCompatParcelizer(awaitFirstLayoutModifier)) {
            if (checkforinstallreferrerinfo != null) {
                int i9 = MediaMetadataCompat + 39;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                pushDeepLink = checkforinstallreferrerinfo.read;
            } else {
                pushDeepLink = null;
            }
            if (pushDeepLink == null) {
                DrawableTransformation.serializer(checkadjustadrevenue, "Deep link is required for deep link push : ");
                int i11 = IconCompatParcelizer + 5;
                MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i12 = 22 / 0;
                }
                return null;
            }
            applicationContext5.getClass();
            String str7 = pushDeepLink.RemoteActionCompatParcelizer;
            if (checkforinstallreferrerinfo != null) {
                int i13 = MediaMetadataCompat + 39;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    pushAnalyticsData = checkforinstallreferrerinfo.write;
                    int i14 = 26 / 0;
                } else {
                    pushAnalyticsData = checkforinstallreferrerinfo.write;
                }
            }
            intent = ((Parser.Pair) this.RemoteActionCompatParcelizer).read(applicationContext5, str7, Integer.valueOf(i4), pushAnalyticsData);
        } else {
            applicationContext5.getClass();
            if (checkforinstallreferrerinfo != null) {
                int i15 = MediaMetadataCompat + 25;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    String str8 = checkforinstallreferrerinfo.serializer;
                    throw null;
                }
                str3 = checkforinstallreferrerinfo.serializer;
            } else {
                str3 = null;
            }
            if (disableThirdPartySharingForCoppaEnabledI.write(awaitFirstLayoutModifier)) {
                z2 = true;
            } else if (z3) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((checkForInstallReferrerInfo) awaitFirstLayoutModifier).serializer, foregroundTimerFiredI.DELIVERY_STATUS_CHANGED.getValue()}, getCieXyz.write())).booleanValue()) {
                    z2 = true;
                }
            }
            intent = ((getActionViewIntentlambda0) this.serializer).read(applicationContext5, str, str2, str3, Boolean.valueOf(z2), (checkforinstallreferrerinfo == null || (str4 = checkforinstallreferrerinfo.serializer) == null || !disableThirdPartySharingForCoppaEnabledI.RemoteActionCompatParcelizer(str4)) ? null : checkforinstallreferrerinfo != null ? checkforinstallreferrerinfo.IconCompatParcelizer : null, checkforinstallreferrerinfo != null ? checkforinstallreferrerinfo.MediaSessionCompatQueueItem : null, checkforinstallreferrerinfo != null ? checkforinstallreferrerinfo.write : null, checkadjustadrevenue.serializer.name());
        }
        return BrazeExternalSyntheticLambda5.serializer(i4, applicationContext5, intent);
    }
}
