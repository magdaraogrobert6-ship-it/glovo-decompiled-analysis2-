package o;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class getBrazeActionVersionAndJsonlambda1 {
    public final Pattern read;
    public final String serializer;

    public final String IconCompatParcelizer() {
        return this.serializer;
    }

    public final int hashCode() {
        return Objects.hash(this.serializer);
    }

    public getBrazeActionVersionAndJsonlambda1(String str) {
        Pattern patternCompile;
        this.serializer = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.read = patternCompile;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getBrazeActionVersionAndJsonlambda1.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.serializer, ((getBrazeActionVersionAndJsonlambda1) obj).serializer);
    }

    public final boolean RemoteActionCompatParcelizer(String str) {
        Pattern pattern = this.read;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }
}
