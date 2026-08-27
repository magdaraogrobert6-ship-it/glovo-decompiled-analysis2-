package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class applyCompositingStrategyWpw9cng extends getAnyChangeConsumedimpl {
    public final Uri IconCompatParcelizer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public applyCompositingStrategyWpw9cng(Uri uri) {
        this.IconCompatParcelizer = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof applyCompositingStrategyWpw9cng) && this.IconCompatParcelizer.equals(((applyCompositingStrategyWpw9cng) obj).IconCompatParcelizer);
    }

    public final String toString() {
        return "Data(uri=" + this.IconCompatParcelizer + ')';
    }
}
