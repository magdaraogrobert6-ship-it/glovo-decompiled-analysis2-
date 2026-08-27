package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public enum r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");

    private final String protocol;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    public static final r8lambdaeJDZC99MOl4wzfEFuvoOvbnPGk8 Companion = new r8lambdaeJDZC99MOl4wzfEFuvoOvbnPGk8();

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }

    public static final r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc get(String str) throws IOException {
        Companion.getClass();
        return r8lambdaeJDZC99MOl4wzfEFuvoOvbnPGk8.read(str);
    }

    r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc(String str) {
        this.protocol = str;
    }
}
