package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.GooglePlayServicesUtil;
import io.sentry.android.core.SentryLogcatAdapter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetSoftRightcp {
    public static java.util.Locale RemoteActionCompatParcelizer;
    public static final processDragGesture serializer;
    private static byte write;

    static {
        serializer();
        serializer = new processDragGesture(0);
    }

    public static String IconCompatParcelizer(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = accessgetTvMediaContextMenucp.serializer(context).write;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String IconCompatParcelizer(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String string = read(context, str);
        if (string == null) {
            string = resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, string, str2);
    }

    public static String read(Context context, int i) {
        Resources resources = context.getResources();
        String strIconCompatParcelizer = IconCompatParcelizer(context);
        if (i == 1) {
            return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_install_text, strIconCompatParcelizer);
        }
        if (i == 2) {
            return DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(context) ? resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_wear_update_text, strIconCompatParcelizer) : resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_update_text, strIconCompatParcelizer);
        }
        if (i == 3) {
            return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_enable_text, strIconCompatParcelizer);
        }
        if (i == 4) {
            return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_signin_required_text, strIconCompatParcelizer);
        }
        if (i == 5) {
            return IconCompatParcelizer(context, "common_google_play_services_invalid_account_text", strIconCompatParcelizer);
        }
        if (i == 7) {
            return IconCompatParcelizer(context, "common_google_play_services_network_error_text", strIconCompatParcelizer);
        }
        if (i == 9) {
            return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_unsupported_text, strIconCompatParcelizer);
        }
        if (i == 20) {
            return IconCompatParcelizer(context, "common_google_play_services_restricted_profile_text", strIconCompatParcelizer);
        }
        switch (i) {
            case 16:
                return IconCompatParcelizer(context, "common_google_play_services_api_unavailable_text", strIconCompatParcelizer);
            case 17:
                return IconCompatParcelizer(context, "common_google_play_services_sign_in_failed_text", strIconCompatParcelizer);
            case 18:
                return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_updating_text, strIconCompatParcelizer);
            default:
                return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_try_again_text, strIconCompatParcelizer);
        }
    }

    public static String IconCompatParcelizer(Context context, int i) {
        String strWrite;
        if (i == 6) {
            strWrite = read(context, "common_google_play_services_resolution_required_title");
        } else {
            strWrite = write(context, i);
        }
        return strWrite == null ? context.getResources().getString(com.logistics.rider.glovo.R.string.common_google_play_services_try_again_title) : strWrite;
    }

    public static String read(Context context, String str) {
        processDragGesture processdraggesture = serializer;
        synchronized (processdraggesture) {
            java.util.Locale locale = new hasNonInteropFocusableContent(new moveFocusaToIllA(context.getResources().getConfiguration().getLocales())).read(0);
            if (!locale.equals(RemoteActionCompatParcelizer)) {
                processdraggesture.clear();
                RemoteActionCompatParcelizer = locale;
            }
            String str2 = (String) processdraggesture.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                StringBuilder sb = new StringBuilder(str.length() + 18);
                sb.append("Missing resource: ");
                sb.append(str);
                SentryLogcatAdapter.IconCompatParcelizer("GoogleApiAvailability", sb.toString());
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (string.startsWith("%('")) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                string = ((String) objArr[0]).intern();
            }
            if (!TextUtils.isEmpty(string)) {
                processdraggesture.put(str, string);
                return string;
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 20);
            sb2.append("Got empty resource: ");
            sb2.append(str);
            SentryLogcatAdapter.IconCompatParcelizer("GoogleApiAvailability", sb2.toString());
            return null;
        }
    }

    public static String RemoteActionCompatParcelizer(Context context, int i) {
        if (i != 6 && i != 19) {
            return read(context, i);
        }
        return IconCompatParcelizer(context, "common_google_play_services_resolution_required_text", IconCompatParcelizer(context));
    }

    public static String write(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_enable_title);
            case 4:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_signin_required_title);
            case 5:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return read(context, "common_google_play_services_invalid_account_title");
            case 6:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "Google Play services requires resolution.");
                return read(context, "common_google_play_services_resolution_required_title");
            case 7:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return read(context, "common_google_play_services_network_error_title");
            case 8:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_unsupported_title);
            case 10:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i);
                SentryLogcatAdapter.serializer("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "The specified account could not be signed in.");
                return read(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_updating_client_title);
            case 19:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return read(context, "common_google_play_services_resolution_required_title");
            case 20:
                SentryLogcatAdapter.serializer("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return read(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String serializer(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_install_button);
        }
        if (i != 2) {
            return i != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_enable_button);
        }
        return resources.getString(com.logistics.rider.glovo.R.string.common_google_play_services_update_button);
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ write);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    static void serializer() {
        write = (byte) -112;
    }
}
