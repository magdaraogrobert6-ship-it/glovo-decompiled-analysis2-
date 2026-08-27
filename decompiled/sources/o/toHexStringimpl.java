package o;

import android.os.Build;
import android.webkit.WebSettings;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import okio.Options;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class toHexStringimpl {
    public static getExponentimpl IconCompatParcelizer(WebSettings webSettings) {
        try {
            Object[] objArr = {WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) getPositiveInfinityslo4al4.RemoteActionCompatParcelizer.read).convertSettings(webSettings)};
            Object obj = Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1514248696, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), objArr, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1514248694);
            return new getExponentimpl(2, (WebSettingsBoundaryInterface) obj);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e;
            }
            SentryLogcatAdapter.read("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
            return new getMaxValueslo4al4(2, null);
        }
    }
}
