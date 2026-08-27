package com.incognia;

import android.app.Application;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.incognia.internal.Cif;
import com.incognia.internal.Cv;
import com.incognia.internal.E79;
import com.incognia.internal.F8J;
import com.incognia.internal.HxI;
import com.incognia.internal.IU;
import com.incognia.internal.IfX;
import com.incognia.internal.JuE;
import com.incognia.internal.Rdy;
import com.incognia.internal.UsU;
import com.incognia.internal.VCN;
import com.incognia.internal.d6;
import com.incognia.internal.i01;
import com.incognia.internal.myP;
import com.incognia.internal.p7k;
import com.incognia.internal.qaa;
import com.incognia.internal.wN;
import com.incognia.internal.wVO;
import com.incognia.internal.weG;
import com.incognia.internal.wx;
import com.incognia.internal.xjk;
import java.util.LinkedHashMap;
import java.util.List;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class Incognia {
    private static final String ASYNC_TOKEN_CLIENT_SIDE_NAME = "async_request_token_client";
    private static final String ASYNC_TOKEN_GENERATION_NAME = "async_request_token_generation";
    private static final long DEFAULT_TIMEOUT = 5000;
    public static final Incognia INSTANCE = new Incognia();

    private Incognia() {
    }

    public static final void clearAccountId() {
        INSTANCE.runAndMeasureTime("clearAccountId", Cv.BGx);
    }

    @onItemDismisslambda0
    public static final void disable(Application application) {
        if (IU.BGx.get()) {
            Log.w("Incognia", "disable is deprecated and won't have any effect.");
        }
    }

    @onItemDismisslambda0
    public static final void notifyAppInForeground() {
        if (IU.BGx.get()) {
            Log.w("Incognia", "notifyAppInForeground is deprecated and won't have any effect.");
        }
    }

    private final <T> T runAndMeasureTime(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        UsU usU = E79.BGx;
        Thread threadCurrentThread = Thread.currentThread();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CrashHianalyticsData.THREAD_NAME, threadCurrentThread.getName());
        linkedHashMap.put(RemoteMessageConst.Notification.PRIORITY, String.valueOf(threadCurrentThread.getPriority()));
        int iBGx = E79.BGx(str, linkedHashMap);
        try {
            return (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } finally {
            UsU usU2 = E79.BGx;
            E79.HQ(iBGx);
            runOnIncogniaThreadIfInitialized$default(this, null, new HxI(str), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnIncogniaThreadIfInitialized(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        runOnIncogniaThread(new Rdy(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnMainThread(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        new UsU(weG.BGx, true).BGx(new Incognia$$ExternalSyntheticLambda0(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public static final void generateRequestToken(Long l, Callback<String> callback) {
        INSTANCE.runAndMeasureTime("generateRequestToken", new p7k(l, E79.BGx(ASYNC_TOKEN_CLIENT_SIDE_NAME, null), callback));
    }

    public static final void generateRequestTokenWithStatus(Long l, Callback<RequestTokenWithStatus> callback) {
        INSTANCE.runAndMeasureTime("generateRequestTokenWithStatus", new myP(l, E79.BGx(ASYNC_TOKEN_CLIENT_SIDE_NAME, null), callback));
    }

    public static final String generateRequestTokenSync(long j) {
        return (String) INSTANCE.runAndMeasureTime("generateRequestTokenSync", new wN(j));
    }

    public static final RequestTokenWithStatus generateRequestTokenWithStatusSync(long j) {
        return (RequestTokenWithStatus) INSTANCE.runAndMeasureTime("generateRequestTokenWithStatusSync", new Cif(j));
    }

    public static final void init(Application application, IncogniaOptions incogniaOptions) {
        INSTANCE.runAndMeasureTime("init", new xjk(application, incogniaOptions));
    }

    public static final void reportBusinessUnitId(String str) {
        INSTANCE.runAndMeasureTime("reportBusinessUnitId", new qaa(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnIncogniaThread(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        UsU usU = JuE.BGx;
        JuE.BGx(new wx(r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public static final void sendCustomEvent(CustomEvent customEvent) {
        sendCustomEvent(customEvent.getAccountId(), customEvent.getExternalId(), customEvent.getAddress(), customEvent.getTag(), customEvent.getProperties(), customEvent.getStatus());
    }

    public static final void sendLoginEvent(LoginEvent loginEvent) {
        sendLoginEvent(loginEvent.getAccountId(), loginEvent.getExternalId(), loginEvent.getLocation(), loginEvent.getStatus(), loginEvent.getTag(), loginEvent.getProperties());
    }

    public static final void sendOnboardingEvent(OnboardingEvent onboardingEvent) {
        sendOnboardingEvent(onboardingEvent.getAccountId(), onboardingEvent.getExternalId(), onboardingEvent.getAddress(), onboardingEvent.getTag(), onboardingEvent.getProperties(), onboardingEvent.getStatus());
    }

    public static final void sendPaymentEvent(PaymentEvent paymentEvent) {
        sendPaymentEvent(paymentEvent.getAccountId(), paymentEvent.getExternalId(), paymentEvent.getLocation(), paymentEvent.getAddresses(), paymentEvent.getPaymentValue(), paymentEvent.getPaymentCoupon(), paymentEvent.getPaymentMethods(), paymentEvent.getStoreId(), paymentEvent.getTag(), paymentEvent.getProperties(), paymentEvent.getStatus());
    }

    public static final void setAccountId(String str) {
        INSTANCE.runAndMeasureTime("setAccountId", new i01(str));
    }

    public static final void setLocationEnabled(boolean z) {
        INSTANCE.runAndMeasureTime("setLocationEnabled", new VCN(z));
    }

    public static /* synthetic */ void generateRequestToken$default(Long l, Callback callback, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        generateRequestToken(l, callback);
    }

    public static /* synthetic */ void generateRequestTokenWithStatus$default(Long l, Callback callback, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        generateRequestTokenWithStatus(l, callback);
    }

    public static /* synthetic */ void init$default(Application application, IncogniaOptions incogniaOptions, int i, Object obj) {
        if ((i & 2) != 0) {
            incogniaOptions = null;
        }
        init(application, incogniaOptions);
    }

    public static /* synthetic */ void runOnIncogniaThreadIfInitialized$default(Incognia incognia, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        incognia.runOnIncogniaThreadIfInitialized(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static /* synthetic */ String generateRequestTokenSync$default(long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 5000;
        }
        return generateRequestTokenSync(j);
    }

    public static /* synthetic */ RequestTokenWithStatus generateRequestTokenWithStatusSync$default(long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 5000;
        }
        return generateRequestTokenWithStatusSync(j);
    }

    public static final void init(Application application) {
        init$default(application, null, 2, null);
    }

    public static final String generateRequestTokenSync() {
        return generateRequestTokenSync$default(0L, 1, null);
    }

    public static final RequestTokenWithStatus generateRequestTokenWithStatusSync() {
        return generateRequestTokenWithStatusSync$default(0L, 1, null);
    }

    public static final void generateRequestToken(Callback<String> callback) {
        generateRequestToken$default(null, callback, 1, null);
    }

    public static final void generateRequestTokenWithStatus(Callback<RequestTokenWithStatus> callback) {
        generateRequestTokenWithStatus$default(null, callback, 1, null);
    }

    public static /* synthetic */ void sendLoginEvent$default(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            eventLocation = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            eventProperties = null;
        }
        sendLoginEvent(str, str2, eventLocation, str3, str4, eventProperties);
    }

    public static final void sendCustomEvent(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        INSTANCE.runAndMeasureTime("sendCustomEvent", new IfX(str, str2, eventAddress, str3, eventProperties, str4));
    }

    public static final void sendLoginEvent(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties) {
        INSTANCE.runAndMeasureTime("sendLoginEvent", new wVO(str, str2, eventLocation, str3, str4, eventProperties));
    }

    public static final void sendOnboardingEvent(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        INSTANCE.runAndMeasureTime("sendOnboardingEvent", new d6(str, str2, eventAddress, str3, eventProperties, str4));
    }

    public static /* synthetic */ void sendCustomEvent$default(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            eventAddress = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            eventProperties = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        sendCustomEvent(str, str2, eventAddress, str3, eventProperties, str4);
    }

    public static /* synthetic */ void sendOnboardingEvent$default(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            eventAddress = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            eventProperties = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        sendOnboardingEvent(str, str2, eventAddress, str3, eventProperties, str4);
    }

    public static final void sendPaymentEvent(String str, String str2, EventLocation eventLocation, List<PaymentAddress> list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List<PaymentMethod> list2, String str3, String str4, EventProperties eventProperties, String str5) {
        INSTANCE.runAndMeasureTime("sendPaymentEvent", new F8J(str, str2, eventLocation, list2, paymentValue, paymentCoupon, list, str3, str4, eventProperties, str5));
    }

    public static /* synthetic */ void sendPaymentEvent$default(String str, String str2, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str3, String str4, EventProperties eventProperties, String str5, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            eventLocation = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            paymentValue = null;
        }
        if ((i & 32) != 0) {
            paymentCoupon = null;
        }
        if ((i & 64) != 0) {
            list2 = null;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            str3 = null;
        }
        if ((i & Fields.RotationX) != 0) {
            str4 = null;
        }
        if ((i & Fields.RotationY) != 0) {
            eventProperties = null;
        }
        if ((i & Fields.RotationZ) != 0) {
            str5 = null;
        }
        sendPaymentEvent(str, str2, eventLocation, list, paymentValue, paymentCoupon, list2, str3, str4, eventProperties, str5);
    }
}
