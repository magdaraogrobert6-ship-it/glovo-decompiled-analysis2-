package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetMusiccp implements accessgetNumPad2cp {
    public static final accessgetMusiccp read;
    public final String IconCompatParcelizer;
    public final boolean serializer;

    public accessgetMusiccp(colorResource colorresource) {
        this.serializer = ((Boolean) colorresource.IconCompatParcelizer).booleanValue();
        this.IconCompatParcelizer = (String) colorresource.write;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetMusiccp)) {
            return false;
        }
        accessgetMusiccp accessgetmusiccp = (accessgetMusiccp) obj;
        return TuplesKt.write((Object) null, (Object) null) && this.serializer == accessgetmusiccp.serializer && TuplesKt.write((Object) this.IconCompatParcelizer, (Object) accessgetmusiccp.IconCompatParcelizer);
    }

    static {
        colorResource colorresource = new colorResource(21, false);
        colorresource.IconCompatParcelizer = Boolean.FALSE;
        read = new accessgetMusiccp(colorresource);
    }

    public final int hashCode() {
        boolean z = this.serializer;
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(z), this.IconCompatParcelizer});
    }
}
