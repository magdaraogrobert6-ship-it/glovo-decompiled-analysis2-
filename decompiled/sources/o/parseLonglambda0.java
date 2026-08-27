package o;

import android.content.Context;
import android.util.Log;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.sentiance.sdk.logging.LogFilePurpose;

/* JADX INFO: loaded from: classes3.dex */
public class parseLonglambda0 {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private boolean read = true;
    private final parseStringlambda0 serializer;
    private final String write;

    private static String read(String str, Object... objArr) {
        try {
            return String.format(java.util.Locale.ENGLISH, str, objArr);
        } catch (Exception unused) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str);
            int i = 0;
            while (objArr != null && i < objArr.length) {
                if (i == 0) {
                    sbM.append(" (");
                }
                sbM.append(objArr[i].toString());
                if (i < objArr.length - 1) {
                    sbM.append(", ");
                }
                i++;
            }
            if (i > 0) {
                sbM.append(")");
            }
            return sbM.toString();
        }
    }

    public parseLonglambda0(Context context, String str, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0 r8lambdabeyxiieovxeplp1oh2wlzr3abd0) {
        this.serializer = new parseStringlambda0(context, LogFilePurpose.LOGCAT.getFileName(), r8lambdabeyxiieovxeplp1oh2wlzr3abd0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni);
        this.write = str;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final void IconCompatParcelizer(Exception exc, String str, Object... objArr) {
        IconCompatParcelizer(read(str, objArr), exc);
    }

    public final void serializer(String str, Object... objArr) {
        write(read(str, objArr));
    }

    public final void write(String str, Object... objArr) {
        write(read(str, objArr));
    }

    private void write(String str) {
        if (this.read) {
            StringBuilder sb = new StringBuilder();
            this.RemoteActionCompatParcelizer.getClass();
            sb.append(com.sentiance.sdk.util.x.c(System.currentTimeMillis()));
            sb.append(" ");
            sb.append(this.write);
            sb.append(": ");
            sb.append(str);
            this.serializer.read(sb.toString());
        }
    }

    public final void write() {
        this.read = true;
    }

    public final void RemoteActionCompatParcelizer(String str, Object... objArr) {
        write(read(str, objArr));
    }

    public final void read() {
        this.read = false;
    }

    public final void IconCompatParcelizer(String str, Object... objArr) {
        write(read(str, objArr));
    }

    public final void IconCompatParcelizer(boolean z, Throwable th, String str, Object... objArr) {
        String str2 = read(str, objArr);
        IconCompatParcelizer(str2, th);
        if (z) {
            Log.e("Sentiance", str2, th);
        }
    }

    private void IconCompatParcelizer(String str, Throwable th) {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, "\n");
        sbM.append(th.getMessage());
        StringBuilder sbM2 = af$$ExternalSyntheticOutline0.m(sbM.toString(), "\n");
        sbM2.append(Log.getStackTraceString(th));
        write(sbM2.toString());
    }
}
