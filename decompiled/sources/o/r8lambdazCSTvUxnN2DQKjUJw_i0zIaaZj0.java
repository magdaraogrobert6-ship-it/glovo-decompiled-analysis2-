package o;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0 {
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg read;
    public final r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k serializer;
    public final Boolean write;

    static {
        Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    }

    public r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k, Boolean bool) {
        this.read = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.serializer = r8lambdayq9qbmke5in5qopvpj_kuggks_k;
        this.write = bool;
    }

    public final String write() {
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = this.serializer;
        Boolean bool = this.write;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = this.read;
        if (bool == null) {
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg + "-" + r8lambdayq9qbmke5in5qopvpj_kuggks_k;
        }
        return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg + "-" + r8lambdayq9qbmke5in5qopvpj_kuggks_k + "-" + (bool.booleanValue() ? "1" : "0");
    }
}
