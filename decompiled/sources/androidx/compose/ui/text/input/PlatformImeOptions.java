package androidx.compose.ui.text.input;

import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformImeOptions {
    public static final int $stable = 0;
    private final String privateImeOptions;

    public final String getPrivateImeOptions() {
        return this.privateImeOptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformImeOptions)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.privateImeOptions, ((PlatformImeOptions) obj).privateImeOptions}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        String str = this.privateImeOptions;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("PlatformImeOptions(privateImeOptions="), this.privateImeOptions, ')');
    }

    public /* synthetic */ PlatformImeOptions(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public PlatformImeOptions(String str) {
        this.privateImeOptions = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformImeOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
