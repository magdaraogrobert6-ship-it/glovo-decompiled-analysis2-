package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public enum r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String protocol;

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }

    public static r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E get(String str) throws IOException {
        r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E r8lambdax9cqozr3ps0lcwn_msrw5cdl8e = HTTP_1_0;
        if (str.equals(r8lambdax9cqozr3ps0lcwn_msrw5cdl8e.protocol)) {
            return r8lambdax9cqozr3ps0lcwn_msrw5cdl8e;
        }
        r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E r8lambdax9cqozr3ps0lcwn_msrw5cdl8e2 = HTTP_1_1;
        if (str.equals(r8lambdax9cqozr3ps0lcwn_msrw5cdl8e2.protocol)) {
            return r8lambdax9cqozr3ps0lcwn_msrw5cdl8e2;
        }
        r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E r8lambdax9cqozr3ps0lcwn_msrw5cdl8e3 = HTTP_2;
        if (str.equals(r8lambdax9cqozr3ps0lcwn_msrw5cdl8e3.protocol)) {
            return r8lambdax9cqozr3ps0lcwn_msrw5cdl8e3;
        }
        r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E r8lambdax9cqozr3ps0lcwn_msrw5cdl8e4 = SPDY_3;
        if (str.equals(r8lambdax9cqozr3ps0lcwn_msrw5cdl8e4.protocol)) {
            return r8lambdax9cqozr3ps0lcwn_msrw5cdl8e4;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Unexpected protocol: ".concat(str));
        return null;
    }

    r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E(String str) {
        this.protocol = str;
    }
}
