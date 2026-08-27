package o;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.gson.Gson;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.location.lite.common.report.ReportBuilder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class resolveResourcePath {
    public final /* synthetic */ int IconCompatParcelizer;
    public ReportBuilder write;

    public /* synthetic */ resolveResourcePath(int i) {
        this.IconCompatParcelizer = i;
    }

    public void write(String str) {
        ReportBuilder reportBuilder = this.write;
        reportBuilder.setResult(str);
        reportBuilder.setCostTime();
        CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().read(reportBuilder);
        CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().IconCompatParcelizer(reportBuilder);
        reportBuilder.setCallTime();
    }

    public void serializer(WrappedCompositionsetContent12 wrappedCompositionsetContent12, String str, String str2) {
        String str3;
        com.airbnb.lottie.PerformanceTracker performanceTracker = wrappedCompositionsetContent12.write;
        if (TextUtils.equals("0", performanceTracker.read("NeedReport"))) {
            WrappedCompositionsetContent1211.write("HttpReportHelper", "this request not need report");
            return;
        }
        if (this.write == null) {
            this.write = new ReportBuilder();
        }
        this.write.setApiName("Location_serverApi");
        this.write.setTransactionID(performanceTracker.read("X-Request-ID"));
        String strSubstring = wrappedCompositionsetContent12.RatingCompat;
        int length = strSubstring.length();
        ReportBuilder reportBuilder = this.write;
        if (length > 60) {
            strSubstring = strSubstring.substring(0, 60);
        }
        reportBuilder.setRequestUrl(strSubstring);
        int i = MenuItemOptionWhenMappings.RemoteActionCompatParcelizer;
        if (str != null && !str.isEmpty()) {
            this.write.setErrorCode(str);
        }
        if (str2 != null && !str2.isEmpty()) {
            this.write.setErrorMessage(str2);
        }
        if (!TextUtils.equals(str, String.valueOf(200)) && TextUtils.isEmpty(this.write.getMcc())) {
            ReportBuilder reportBuilder2 = this.write;
            String str4 = wrappedCompositionsetContent12.read;
            if (!TextUtils.isEmpty(str4)) {
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("-drcn", "DR1");
                arrayMap.put("locationtest.", "DR1");
                arrayMap.put("-dra", "DR2");
                arrayMap.put("locationtestSingapore.", "DR2");
                arrayMap.put("-dre", "DR3");
                arrayMap.put("locationtestEurope.", "DR3");
                arrayMap.put("-drru", "DR4");
                arrayMap.put("locationtestRussia.", "DR4");
                Iterator it = arrayMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str3 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                        break;
                    }
                    String str5 = (String) it.next();
                    if (str4.contains(str5)) {
                        str3 = (String) arrayMap.get(str5);
                        break;
                    }
                }
            } else {
                str3 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
            }
            reportBuilder2.setMCC(str3);
        }
        if (TextUtils.equals(wrappedCompositionsetContent12.RatingCompat, "/networklocation/v1/onlineLocation") && !TextUtils.equals(str, String.valueOf(200))) {
            String str6 = performanceTracker.read("X-CP-Info");
            if (!TextUtils.isEmpty(str6)) {
                this.write.setExtParam("X-CP-Info", str6);
            }
        }
        this.write.setCostTime();
        try {
            if (Integer.parseInt("100") == 100) {
                CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().read(this.write);
                CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().IconCompatParcelizer(this.write);
            } else {
                new Gson().toJson(this.write);
                new Bundle().putString("report_type", "server_report");
                toAccessibilityCollectionInfo.write.MediaDescriptionCompat();
            }
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("HttpReportHelper", "reportHttpResult exception");
        }
    }

    public void IconCompatParcelizer(String str) {
        if (this.IconCompatParcelizer != 0) {
            ReportBuilder reportBuilder = this.write;
            reportBuilder.setErrorCode(str);
            reportBuilder.setCostTime();
            CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().read(reportBuilder);
            CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().IconCompatParcelizer(reportBuilder);
            return;
        }
        ReportBuilder reportBuilder2 = this.write;
        reportBuilder2.setErrorCode(str);
        reportBuilder2.setCostTime();
        CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().read(reportBuilder2);
        CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().IconCompatParcelizer(reportBuilder2);
    }
}
