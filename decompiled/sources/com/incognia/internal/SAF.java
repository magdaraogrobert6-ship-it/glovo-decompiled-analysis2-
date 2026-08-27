package com.incognia.internal;

import android.os.Looper;
import android.util.Log;
import com.incognia.RequestTokenStatus;
import com.incognia.RequestTokenWithStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SAF {
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    public static final RequestTokenWithStatus BGx(Wea wea) {
        cKI ckiBGx;
        String strBGx;
        Object isitemdismissable;
        String str = tDt.BGx;
        try {
            ckiBGx = ((Jz) oV.mbG()).Io.BGx(wea);
        } catch (Throwable unused) {
            ckiBGx = null;
        }
        if (ckiBGx != null) {
            try {
                oV.mbG();
                long jCurrentTimeMillis = System.currentTimeMillis();
                PVI pvi = tDt.mbG;
                AtomicLong atomicLong = tDt.HQ;
                long andIncrement = atomicLong.getAndIncrement();
                pvi.getClass();
                JSONObject jSONObject = ckiBGx.BGx;
                jSONObject.put(PVI.BGx, ckiBGx.mbG.BGx);
                jSONObject.put(PVI.mbG, andIncrement);
                jSONObject.put(PVI.HQ, jCurrentTimeMillis);
                String string = jSONObject.toString();
                Ay.HQ.BGx(tDt.BGx, Long.valueOf(atomicLong.get()));
                strBGx = dDH.BGx(string, ((Jz) oV.mbG()).D, new vue(new byte[]{108, 80, 118, 78, 101, 76, 75, 104, 73, 74, 51, 65, 86, 66, 106, 99, 115, 73, 117, 80, 112, 108, 115, 110, 111, 103, 76, 71, 76, 86, 75, 98, 82, 72, 122, 51, 103, 121, 105, 50, 100, 49, 85, 61}), 1);
            } catch (Throwable unused2) {
                strBGx = null;
            }
            g4I g4i = g4I.BGx;
            int i = ckiBGx.HQ;
            Integer num = ckiBGx.N;
            Integer numValueOf = strBGx != null ? Integer.valueOf(strBGx.length()) : null;
            synchronized (g4i) {
                ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) g4I.BGx().BGx);
                arrayListIconCompatParcelizer.add(Integer.valueOf(i));
                ArrayList arrayListIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer((Collection) g4I.BGx().mbG);
                if (num != null) {
                    arrayListIconCompatParcelizer2.add(Integer.valueOf(num.intValue()));
                }
                ArrayList arrayListIconCompatParcelizer3 = onContentCardDismissed.IconCompatParcelizer((Collection) g4I.BGx().HQ);
                if (numValueOf != null) {
                    arrayListIconCompatParcelizer3.add(Integer.valueOf(numValueOf.intValue()));
                }
                Ay.BGx.BGx(g4I.mbG, new lI5(arrayListIconCompatParcelizer, arrayListIconCompatParcelizer2, arrayListIconCompatParcelizer3), FE.BGx);
                isitemdismissable = strBGx;
            }
            if (strBGx == null) {
                isitemdismissable = new isItemDismissable(new KqT());
            }
        } else {
            isitemdismissable = new isItemDismissable(new KqT());
        }
        return onItemDismiss.serializer(isitemdismissable) == null ? new RequestTokenWithStatus((String) isitemdismissable, RequestTokenStatus.SUCCESS) : new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR);
    }

    public static void BGx(String str, long j, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        try {
            if (!udr.BGx(z ? str : null)) {
                SjD sjD = (SjD) JY.BGx.get();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, l8.BGx}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, JTd.BGx}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, Qv.BGx}, getCieXyz.write())).booleanValue()) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new RequestTokenWithStatus("AZ92B1-cMXHtqzVE49Hp2UeYiSNNShBCODw0wwl62JCTPebIs-SSeBS7GzaYtlequkPKS-b1J8VzCz4UFSBkwMuNPr1yfwrifeHe2saKv6sO3HUBmth37t4AJ4rmIArTjI1ZYBHlP8614JukKE5djOQga4OrCdLOn38TIJ_aWC49XXqSaQvlFmkf92XccjQ1qZya7ow_xV9y4elxFoGVJDUtn7WAHNwm2WGi0dWDyXyz1S558qrzkykkkxyZ0CWIlIlNAo4IOxI06cvjCihlHByT-4xNr85qr3Kwz_s6SMZrGmlOLVt1TV6T8JLtpONyr62htaqInPf7M9WvtE2U6Eo4y4MDIE51lzZQM0QQV86gY3Fwhje9ZYWFmxA6SIxZ0r3jBf1MMeKcdqjccjBDf_i0jvBERsaItILWDBANhqnS9p7FuTPpvHp7cKKVPEmwCw", RequestTokenStatus.SDK_NOT_INITIALIZED));
                            return;
                        } else {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR));
                            return;
                        }
                    }
                }
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR));
                return;
            }
            IU.BGx.get();
            AtomicReference atomicReference = new AtomicReference(null);
            if (j > 0) {
                atomicReference.set(new B74(new JHE$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1)));
                new UsU(G7.BGx, true).BGx(j, (y9X) atomicReference.get());
            }
            ((Jz) oV.mbG()).OhM.BGx(new dN(new Dlm(atomicReference, r8lambdaunavo3sxub_pc9xroryotnrlvsm)));
        } catch (Throwable unused) {
            BGx((String) null);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR));
        }
    }

    public static void BGx(String str) {
        if (str == null) {
            str = "An unexpected error occurred during the request token generation.";
        }
        if (IU.BGx.get()) {
            Log.e("Incognia", "Error while generating request token. Reason: ".concat(str));
        }
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        BGx("Request token generation timed out.");
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new RequestTokenWithStatus("AQwUZ-iksTYVRW03UG4jbk9C40roF_HuD-nDIH5e1t7Hq92fcsXSskPYQzhyv6GjOuelwXcC_T5enZYy43clKa9wAOE797TWKcjUoCC5r-kceTFDOrKIwkoCs6SFb1CQdeX1LhlJoO0bV1oZBUkh0G0IjIBpEteFNWCgewy6i0HRneZXifJ5TR0nEY0z9bevxNIo_q29b3fq12_sjJpRdc1mYg3YTtMG5nBfmJrS594XpRm3s5Y_rMZj6c5sQD23uq0w2-h8mEgsudgf3bC5_-ez0LsjRe0sd1OEqO2gkTKRiy-EUhrNyunaExg20DNpwjK667Iw2eXLPzOSuSxldY5LfMVMRjU18uSME6ndD7uIsPw6Fna2nIi_pwLt-CWAZ6v1aYqAjwfSYlE0ufzEaMTluO0pb99G12RWYVh2QVtjricLdoIaKNr_7bXpa5wCrQ", RequestTokenStatus.TIMEOUT));
    }

    public static RequestTokenWithStatus BGx(String str, long j, boolean z) {
        String str2 = z ? str : null;
        try {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                if (IU.BGx.get()) {
                    Log.e("Incognia", "You must not call this method from the main thread. Consider moving it to another thread or using the corresponding asynchronous method.");
                }
                return new RequestTokenWithStatus("AQEpJH0JsVaN_UZoh3MqdSwQHDqys1kr-rTqiQT9drBV0G63-eslAD17y-w8BHxb0l0Pizwukfibel9Wl_Q3J_I7MBf48I6PfgGxVAGmtYwbtQYkg9UTmnINRJJZIVgLxCVB6dLfPQL8VQE4XHhEs6YZCouKimFDTqVU6N3gc3B0SRmU3fRo_eHoee9HXF453T5DjaeNdJ5ymqiI7lRW1HZGrdbFQFUHjxTsMt7LIyQCcppFVgr1fETK2IsFHkbX6dgp46SnFLqRxW3a2yiXAgXdx_Qtk18DJSZWIgOwa4tzmHhgmr-q7FTfzHZc4gcmRQTJXzRANenQQDootdfPEY1CHhsAGxltpFMhmTcIcwHwsNAG_uK-u3zqtt_KrnEP0ECV8yOKsA1Da5kLAG2zHuMPOSfhS2g8Ni0hRUFZVesXX6ttc7CvOoFntWlGU3e0mvUtLBSgn_-F0cEG-agLCvA", RequestTokenStatus.TOKEN_CALL_SYNC_ON_MAIN_THREAD);
            }
            if (!udr.BGx(str2)) {
                SjD sjD = (SjD) JY.BGx.get();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, l8.BGx}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, JTd.BGx}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, Qv.BGx}, getCieXyz.write())).booleanValue()) {
                            return new RequestTokenWithStatus("AZ92B1-cMXHtqzVE49Hp2UeYiSNNShBCODw0wwl62JCTPebIs-SSeBS7GzaYtlequkPKS-b1J8VzCz4UFSBkwMuNPr1yfwrifeHe2saKv6sO3HUBmth37t4AJ4rmIArTjI1ZYBHlP8614JukKE5djOQga4OrCdLOn38TIJ_aWC49XXqSaQvlFmkf92XccjQ1qZya7ow_xV9y4elxFoGVJDUtn7WAHNwm2WGi0dWDyXyz1S558qrzkykkkxyZ0CWIlIlNAo4IOxI06cvjCihlHByT-4xNr85qr3Kwz_s6SMZrGmlOLVt1TV6T8JLtpONyr62htaqInPf7M9WvtE2U6Eo4y4MDIE51lzZQM0QQV86gY3Fwhje9ZYWFmxA6SIxZ0r3jBf1MMeKcdqjccjBDf_i0jvBERsaItILWDBANhqnS9p7FuTPpvHp7cKKVPEmwCw", RequestTokenStatus.SDK_NOT_INITIALIZED);
                        }
                        return new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR);
                    }
                }
                return new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR);
            }
            IU.BGx.get();
            return BGx(j);
        } catch (Throwable unused) {
            BGx((String) null);
            return new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR);
        }
    }

    public static RequestTokenWithStatus BGx(long j) throws InterruptedException {
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((Jz) oV.mbG()).OhM.BGx(new dN(new oqk(createinappmessageeventsubscriber, countDownLatch)));
        countDownLatch.await(j, TimeUnit.MILLISECONDS);
        RequestTokenWithStatus requestTokenWithStatus = (RequestTokenWithStatus) createinappmessageeventsubscriber.IconCompatParcelizer;
        if (requestTokenWithStatus != null) {
            return requestTokenWithStatus;
        }
        BGx("Request token generation timed out.");
        return new RequestTokenWithStatus("AQwUZ-iksTYVRW03UG4jbk9C40roF_HuD-nDIH5e1t7Hq92fcsXSskPYQzhyv6GjOuelwXcC_T5enZYy43clKa9wAOE797TWKcjUoCC5r-kceTFDOrKIwkoCs6SFb1CQdeX1LhlJoO0bV1oZBUkh0G0IjIBpEteFNWCgewy6i0HRneZXifJ5TR0nEY0z9bevxNIo_q29b3fq12_sjJpRdc1mYg3YTtMG5nBfmJrS594XpRm3s5Y_rMZj6c5sQD23uq0w2-h8mEgsudgf3bC5_-ez0LsjRe0sd1OEqO2gkTKRiy-EUhrNyunaExg20DNpwjK667Iw2eXLPzOSuSxldY5LfMVMRjU18uSME6ndD7uIsPw6Fna2nIi_pwLt-CWAZ6v1aYqAjwfSYlE0ufzEaMTluO0pb99G12RWYVh2QVtjricLdoIaKNr_7bXpa5wCrQ", RequestTokenStatus.TIMEOUT);
    }
}
