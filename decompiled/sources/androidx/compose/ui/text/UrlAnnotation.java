package androidx.compose.ui.text;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalTextApi
@onItemDismisslambda0
public final class UrlAnnotation implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final String url;

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public UrlAnnotation(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlAnnotation)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, ((UrlAnnotation) obj).url}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("UrlAnnotation(url="), this.url, ')');
    }
}
