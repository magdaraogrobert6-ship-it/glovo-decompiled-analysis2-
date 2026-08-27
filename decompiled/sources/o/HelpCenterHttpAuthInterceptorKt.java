package o;

import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public enum HelpCenterHttpAuthInterceptorKt {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");

    private final String lineSeparator;

    public String getString() {
        return this.lineSeparator;
    }

    public byte[] getBytes(Charset charset) {
        return this.lineSeparator.getBytes(charset);
    }

    HelpCenterHttpAuthInterceptorKt(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.lineSeparator = str;
    }
}
