package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class OF {
    public final String BGx = BGx((String) W4i.Kyg.MediaSessionCompatResultReceiverWrapper());
    public final String mbG = BGx((String) W4i.dWb.MediaSessionCompatResultReceiverWrapper());
    public final String HQ = BGx((String) W4i.OwY.MediaSessionCompatResultReceiverWrapper());
    public final String N = BGx((String) W4i.R.MediaSessionCompatResultReceiverWrapper());
    public final String x = BGx((String) W4i.H5.MediaSessionCompatResultReceiverWrapper());
    public final String hIl = BGx((String) W4i.bBS.MediaSessionCompatResultReceiverWrapper());
    public final String hs = BGx((String) W4i.J5C.MediaSessionCompatResultReceiverWrapper());
    public final String VV3 = BGx((String) W4i.uw.MediaSessionCompatResultReceiverWrapper());
    public final String A1 = BGx((String) W4i.Kj.MediaSessionCompatResultReceiverWrapper());
    public final String q = BGx((String) W4i.DSt.MediaSessionCompatResultReceiverWrapper());
    public final String fZl = BGx((String) W4i.Es.MediaSessionCompatResultReceiverWrapper());

    public static String BGx(String str) {
        try {
            return (String) Class.forName((String) W4i.ee.MediaSessionCompatResultReceiverWrapper()).getField(str).get(null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
