package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaeJDZC99MOl4wzfEFuvoOvbnPGk8 {
    public static r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc read(String str) throws IOException {
        str.getClass();
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_0;
        if (str.equals(r8lambdacwme7obcpvw4lrr1hr7xiufmyc.protocol)) {
            return r8lambdacwme7obcpvw4lrr1hr7xiufmyc;
        }
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc2 = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1;
        if (str.equals(r8lambdacwme7obcpvw4lrr1hr7xiufmyc2.protocol)) {
            return r8lambdacwme7obcpvw4lrr1hr7xiufmyc2;
        }
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc3 = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.H2_PRIOR_KNOWLEDGE;
        if (str.equals(r8lambdacwme7obcpvw4lrr1hr7xiufmyc3.protocol)) {
            return r8lambdacwme7obcpvw4lrr1hr7xiufmyc3;
        }
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc4 = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_2;
        if (str.equals(r8lambdacwme7obcpvw4lrr1hr7xiufmyc4.protocol)) {
            return r8lambdacwme7obcpvw4lrr1hr7xiufmyc4;
        }
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc5 = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.SPDY_3;
        if (str.equals(r8lambdacwme7obcpvw4lrr1hr7xiufmyc5.protocol)) {
            return r8lambdacwme7obcpvw4lrr1hr7xiufmyc5;
        }
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc6 = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.QUIC;
        if (str.equals(r8lambdacwme7obcpvw4lrr1hr7xiufmyc6.protocol)) {
            return r8lambdacwme7obcpvw4lrr1hr7xiufmyc6;
        }
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc7 = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_3;
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, r8lambdacwme7obcpvw4lrr1hr7xiufmyc7.protocol, false)) {
            return r8lambdacwme7obcpvw4lrr1hr7xiufmyc7;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Unexpected protocol: ".concat(str));
        return null;
    }
}
