package fwfd.com.fwfsdk.model.dao;

import android.os.Build;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import fwfd.com.fwfsdk.FunWithFlags;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.InAppMessageModalView;
import o.ProtoFeatureMsgCompanion;
import o._get_messageWebView_lambda0;
import o._get_messageWebView_lambda1;
import o.getClassLogTag;
import o.getHoldoutVariation;
import o.getIdentifiersValidationsEnabled;
import o.getMessageHeaderTextView;
import o.getShortEdge;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;

/* JADX INFO: loaded from: classes5.dex */
public class FWFAPIClient {
    private static final String HEADER_DEBUG_MODE = "Isdebug";
    private static final String HEADER_FROM_METHOD = "fromMethod";
    private static final String HEADER_SDK_INFO = "Sdkinfo";
    protected getHoldoutVariation retrofit;

    public FWFAPIClient(final String str, List<getShortEdge> list) {
        final boolean zIsDebugMode = FunWithFlags.getInstance().isDebugMode();
        getShortEdge getshortedge = new getShortEdge() { // from class: fwfd.com.fwfsdk.model.dao.FWFAPIClient.1
            @Override // o.getShortEdge
            public _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) throws IOException {
                InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
                _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
                _get_messagewebview_lambda0.serializer("Sdkinfo", FWFAPIClient.getSDKInfo());
                _get_messagewebview_lambda0.serializer(FWFAPIClient.HEADER_FROM_METHOD, str);
                _get_messagewebview_lambda0.serializer(FWFAPIClient.HEADER_DEBUG_MODE, Boolean.toString(zIsDebugMode));
                return inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
            }
        };
        getClassLogTag getclasslogtag = new getClassLogTag(0);
        if (zIsDebugMode) {
            getclasslogtag.write(r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.BODY);
        }
        long millis = TimeUnit.SECONDS.toMillis((long) FunWithFlags.getInstance().getConnectionTimeout());
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer(millis, timeUnit);
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read(millis, timeUnit);
        ArrayList arrayList = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        arrayList.add(getshortedge);
        arrayList.add(getclasslogtag);
        Iterator<getShortEdge> it = list.iterator();
        while (it.hasNext()) {
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer(it.next());
        }
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
        String strEndpoint = endpoint();
        getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = new getIdentifiersValidationsEnabled();
        getidentifiersvalidationsenabled.write(strEndpoint);
        getidentifiersvalidationsenabled.write(ProtoFeatureMsgCompanion.IconCompatParcelizer(new Gson()));
        getidentifiersvalidationsenabled.read = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
        this.retrofit = getidentifiersvalidationsenabled.write();
    }

    private static String endpoint() {
        if (localUrl().isEmpty()) {
            return FunWithFlags.getInstance().getBaseUrl() + "/" + FunWithFlags.getInstance().getApiVersion() + "/";
        }
        return localUrl() + "/" + FunWithFlags.getInstance().getApiVersion() + "/";
    }

    private static String localUrl() {
        return FunWithFlags.getInstance().getLocalUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getSDKInfo() {
        return d$$ExternalSyntheticOutline0.m(Build.VERSION.SDK_INT, "Sdkinfo: Android API ", " FWF 8.1.0");
    }
}
