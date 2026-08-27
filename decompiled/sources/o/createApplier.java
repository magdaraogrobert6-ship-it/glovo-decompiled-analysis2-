package o;

import android.os.Bundle;
import com.google.gson.Gson;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.lite.common.report.ReportBuilder;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public abstract class createApplier {
    public static int serializer;
    public static final byte[] write = new byte[0];
    public static byte[] RemoteActionCompatParcelizer = new byte[androidx.compose.ui.graphics.Fields.CameraDistance];

    public static void RemoteActionCompatParcelizer(String str, byte[] bArr) {
        if (bArr.length + serializer + 1 > 2048) {
            ReportBuilder reportBuilder = new ReportBuilder();
            reportBuilder.setTag(str);
            String str2 = "";
            int i = serializer;
            if (i > 0) {
                try {
                    byte[] bArr2 = RemoteActionCompatParcelizer;
                    int i2 = i + 1;
                    if (i2 > 2048) {
                        i2 = 2048;
                    }
                    str2 = new String(bArr2, 0, i2, com.adjust.sdk.Constants.ENCODING);
                } catch (UnsupportedEncodingException unused) {
                    WrappedCompositionsetContent1211.write("LogCache", "toString() UnsupportedEncodingException");
                }
            }
            reportBuilder.setErrorMessage(str2);
            if (Integer.parseInt("100") == 200 || Integer.parseInt("100") == 300) {
                new Gson().toJson(reportBuilder);
                new Bundle().putString("report_type", "event");
                toAccessibilityCollectionInfo.write.MediaDescriptionCompat();
            } else {
                CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().RemoteActionCompatParcelizer(1, "Location_errorLogReport", reportBuilder.build());
            }
            synchronized (write) {
                RemoteActionCompatParcelizer = new byte[androidx.compose.ui.graphics.Fields.CameraDistance];
                serializer = 0;
            }
        }
        synchronized (write) {
            for (byte b : bArr) {
                int i3 = serializer;
                if (i3 >= 0 && i3 < 2048) {
                    RemoteActionCompatParcelizer[i3] = b;
                    serializer = i3 + 1;
                }
            }
        }
    }

    public static byte[] IconCompatParcelizer(String str, String str2) {
        byte[] bArr = new byte[0];
        try {
            return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2 + "\r\n").getBytes(com.adjust.sdk.Constants.ENCODING);
        } catch (UnsupportedEncodingException unused) {
            WrappedCompositionsetContent1211.write("LogCache", "putStr() UnsupportedEncodingException");
            return bArr;
        }
    }
}
