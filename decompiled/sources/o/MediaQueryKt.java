package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class MediaQueryKt {
    public final androidx.compose.ui.text.AnnotatedString RemoteActionCompatParcelizer;
    public androidx.compose.ui.text.AnnotatedString write;
    public boolean serializer = false;
    public androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache read = null;

    public final void IconCompatParcelizer(androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache) {
        this.read = multiParagraphLayoutCache;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.serializer = z;
    }

    public final boolean IconCompatParcelizer() {
        return this.serializer;
    }

    public final androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final androidx.compose.ui.text.AnnotatedString read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final androidx.compose.ui.text.AnnotatedString serializer() {
        return this.write;
    }

    public final void write(androidx.compose.ui.text.AnnotatedString annotatedString) {
        this.write = annotatedString;
    }

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m((this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31)) * 31, 31, this.serializer);
        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache = this.read;
        return iM + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
    }

    public MediaQueryKt(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.AnnotatedString annotatedString2) {
        this.RemoteActionCompatParcelizer = annotatedString;
        this.write = annotatedString2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueryKt)) {
            return false;
        }
        MediaQueryKt mediaQueryKt = (MediaQueryKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, mediaQueryKt.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, mediaQueryKt.write}, getCieXyz.write())).booleanValue() || this.serializer != mediaQueryKt.serializer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, mediaQueryKt.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.RemoteActionCompatParcelizer) + ", substitution=" + ((Object) this.write) + ", isShowingSubstitution=" + this.serializer + ", layoutCache=" + this.read + ')';
    }
}
