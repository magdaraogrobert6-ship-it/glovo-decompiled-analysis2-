package com.braze.ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.Braze$$ExternalSyntheticLambda75;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.SimpleItemTouchHelperCallback;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class UriUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("UriUtils");

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isActivityRegisteredInManifest$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not find activity info for class with name: ", str);
    }

    public static final Intent getMainActivityIntent(Context context, Bundle bundle) {
        context.getClass();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        }
        if (bundle != null && launchIntentForPackage != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    public static final boolean isActivityRegisteredInManifest(Context context, String str) {
        context.getClass();
        str.getClass();
        int i = 0;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getActivityInfo(new ComponentName(context, str), PackageManager.ComponentInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getActivityInfo(new ComponentName(context, str), 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriUtils$$ExternalSyntheticLambda0(str, i), 8, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$2(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return m1$$ExternalSyntheticOutline0.m(createinappmessageeventsubscriber.IconCompatParcelizer, "Failed to map the query parameters of Uri: ");
    }

    public static /* synthetic */ Intent getMainActivityIntent$default(Context context, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return getMainActivityIntent(context, bundle);
    }

    public static final Map<String, String> getQueryParameters(Uri uri) {
        uri.getClass();
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = uri;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda75(createinappmessageeventsubscriber, 4), 12, (Object) null);
            return SimpleItemTouchHelperCallback.serializer;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (((Uri) createinappmessageeventsubscriber.IconCompatParcelizer).isOpaque()) {
                Uri uriBuild = Uri.parse("://").buildUpon().encodedQuery(encodedQuery).build();
                uriBuild.getClass();
                createinappmessageeventsubscriber.IconCompatParcelizer = uriBuild;
            }
            Set<String> queryParameterNames = ((Uri) createinappmessageeventsubscriber.IconCompatParcelizer).getQueryParameterNames();
            queryParameterNames.getClass();
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
            for (String str2 : arrayList) {
                String queryParameter = ((Uri) createinappmessageeventsubscriber.IconCompatParcelizer).getQueryParameter(str2);
                if (queryParameter != null && queryParameter.length() != 0) {
                    linkedHashMap.put(str2, queryParameter);
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda75(createinappmessageeventsubscriber, 5), 8, (Object) null);
            return linkedHashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$0(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return af$$ExternalSyntheticOutline0.m(createinappmessageeventsubscriber.IconCompatParcelizer, "Encoded query is null for Uri: ", " Returning empty map for query parameters");
    }
}
