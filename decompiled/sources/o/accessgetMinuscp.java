package o;

import com.deliveryhero.fwf_http.ConstantKt;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetMinuscp implements Runnable {
    public static final accessgetTvDataServicecp IconCompatParcelizer = new accessgetTvDataServicecp("RevokeAccessOperation", new String[0]);
    public final String RemoteActionCompatParcelizer;
    public final accessgetNumPadMultiplycp serializer;

    @Override // java.lang.Runnable
    public final void run() {
        accessgetTvDataServicecp accessgettvdataservicecp = IconCompatParcelizer;
        Status status = Status.read;
        try {
            String str = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            httpURLConnection.setRequestProperty(ConstantKt.CONTENT_TYPE_HEADER, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.IconCompatParcelizer;
            } else {
                SentryLogcatAdapter.serializer(accessgettvdataservicecp.RemoteActionCompatParcelizer, accessgettvdataservicecp.read.concat("Unable to revoke access!"));
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            String string = sb2.toString();
            if (accessgettvdataservicecp.IconCompatParcelizer <= 3) {
                accessgettvdataservicecp.read.concat(string);
            }
        } catch (IOException e) {
            SentryLogcatAdapter.serializer(accessgettvdataservicecp.RemoteActionCompatParcelizer, accessgettvdataservicecp.read.concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            SentryLogcatAdapter.serializer(accessgettvdataservicecp.RemoteActionCompatParcelizer, accessgettvdataservicecp.read.concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.serializer.write((accessgetNumPadCommacp) status);
    }

    public accessgetMinuscp(String str) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.RemoteActionCompatParcelizer = str;
        this.serializer = new accessgetNumPadMultiplycp(null);
    }
}
