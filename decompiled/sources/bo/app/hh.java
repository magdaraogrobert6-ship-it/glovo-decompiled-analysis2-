package bo.app;

import com.adjust.sdk.Constants;
import com.braze.support.BrazeLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class hh {
    public static final hh a = new hh();
    public static final wf b;

    static {
        try {
            b = new wf();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(18), 4, (Object) null);
        }
    }

    public static final String b() {
        return "Exception setting TLS socket factory on url connection.";
    }

    public final HttpURLConnection a(URL url) {
        url.getClass();
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        Object[] objArr = {url.getProtocol(), Constants.SCHEME};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            try {
                uRLConnection.getClass();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
                wf wfVar = b;
                if (wfVar == null) {
                    removeNodeAtDepth.serializer("socketFactory");
                    throw null;
                }
                httpsURLConnection.setSSLSocketFactory(wfVar);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(17), 4, (Object) null);
            }
        }
        uRLConnection.getClass();
        return (HttpURLConnection) uRLConnection;
    }

    public static final String a() {
        return "Exception initializing static TLS socket factory.";
    }
}
