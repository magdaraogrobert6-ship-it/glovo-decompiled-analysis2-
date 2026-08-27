package com.qualtrics.digital.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class WebViewUtils {
    public static final WebViewUtils INSTANCE = new WebViewUtils();
    private static final Pattern BROWSER_URI_SCHEMA = Pattern.compile("(?i)((?:http|https|file):\\/\\/|(?:inline|data|about|chrome|javascript):)(.*)");

    private WebViewUtils() {
    }

    private final boolean isNullOrGenericHandler(IntentFilter intentFilter) {
        if (intentFilter != null) {
            return intentFilter.countDataAuthorities() == 0 && intentFilter.countDataPaths() == 0;
        }
        return true;
    }

    public final Intent createBrowsingIntent(Context context, String str) throws ActivityNotFoundException, URISyntaxException, SecurityException {
        context.getClass();
        str.getClass();
        Intent uri = Intent.parseUri(str, 1);
        if (BROWSER_URI_SCHEMA.matcher(str).matches()) {
            uri.getClass();
            if (!isSpecializedHandlerAvailable(context, uri)) {
                return null;
            }
        }
        uri.addCategory("android.intent.category.BROWSABLE");
        uri.setComponent(null);
        Intent selector = uri.getSelector();
        if (selector != null) {
            selector.addCategory("android.intent.category.BROWSABLE");
            selector.setComponent(null);
        }
        uri.putExtra("com.android.browser.application_id", context.getPackageName());
        uri.addFlags(1476395008);
        return uri;
    }

    private final boolean isSpecializedHandlerAvailable(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            if (!isNullOrGenericHandler(it.next().filter)) {
                return true;
            }
        }
        return false;
    }
}
