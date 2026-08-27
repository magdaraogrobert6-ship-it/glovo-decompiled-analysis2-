package o;

import android.net.Uri;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getCalendarEK5gGoQ {
    public static getCalendarEK5gGoQ read;
    public volatile String IconCompatParcelizer;
    public volatile int serializer;
    public volatile String write;

    public static getCalendarEK5gGoQ IconCompatParcelizer() {
        getCalendarEK5gGoQ getcalendarek5ggoq;
        synchronized (getCalendarEK5gGoQ.class) {
            if (read == null) {
                getCalendarEK5gGoQ getcalendarek5ggoq2 = new getCalendarEK5gGoQ();
                getcalendarek5ggoq2.serializer = 1;
                getcalendarek5ggoq2.IconCompatParcelizer = null;
                getcalendarek5ggoq2.write = null;
                read = getcalendarek5ggoq2;
            }
            getcalendarek5ggoq = read;
        }
        return getcalendarek5ggoq;
    }

    public final boolean read(Uri uri, String str) {
        synchronized (this) {
            try {
                String strDecode = URLDecoder.decode(uri.toString(), com.adjust.sdk.Constants.ENCODING);
                if (!strDecode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+")) {
                    getButtonThumbLeftEK5gGoQ.serializer("Bad preview url: ".concat(strDecode));
                    return false;
                }
                String queryParameter = uri.getQueryParameter("id");
                String queryParameter2 = uri.getQueryParameter("gtm_auth");
                String queryParameter3 = uri.getQueryParameter("gtm_preview");
                if (!str.equals(queryParameter)) {
                    getButtonThumbLeftEK5gGoQ.serializer("Preview fails (container doesn't match the container specified by the asset)");
                    return false;
                }
                if (queryParameter == null || queryParameter.length() <= 0) {
                    getButtonThumbLeftEK5gGoQ.serializer("Bad preview url: ".concat(strDecode));
                    return false;
                }
                if (queryParameter3 != null && queryParameter3.length() == 0) {
                    if (queryParameter.equals(this.write) && this.serializer != 1) {
                        "Exit preview mode for container: ".concat(String.valueOf(this.write));
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        this.serializer = 1;
                        this.write = null;
                        this.IconCompatParcelizer = null;
                    }
                    getButtonThumbLeftEK5gGoQ.serializer("Error in exiting preview mode. The container is not in preview.");
                    return false;
                }
                if (queryParameter3 == null || queryParameter3.length() <= 0 || queryParameter2 == null || queryParameter2.length() <= 0) {
                    getButtonThumbLeftEK5gGoQ.serializer("Bad preview url: ".concat(strDecode));
                    return false;
                }
                this.serializer = 2;
                this.IconCompatParcelizer = uri.getQuery();
                this.write = queryParameter;
                return true;
            } catch (UnsupportedEncodingException e) {
                getButtonThumbLeftEK5gGoQ.serializer("Error decoding the preview url: ".concat(e.toString()));
                return false;
            }
        }
    }
}
