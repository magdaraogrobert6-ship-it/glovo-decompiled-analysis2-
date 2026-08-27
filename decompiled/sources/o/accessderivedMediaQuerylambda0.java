package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class accessderivedMediaQuerylambda0 {
    public String RemoteActionCompatParcelizer;
    public final String write;
    public boolean read = false;
    public androidx.compose.foundation.text.modifiers.ParagraphLayoutCache IconCompatParcelizer = null;

    public final void IconCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final void RemoteActionCompatParcelizer(androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCache) {
        this.IconCompatParcelizer = paragraphLayoutCache;
    }

    public final void read(boolean z) {
        this.read = z;
    }

    public final boolean read() {
        return this.read;
    }

    public final androidx.compose.foundation.text.modifiers.ParagraphLayoutCache serializer() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.read);
        androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCache = this.IconCompatParcelizer;
        return iM + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
    }

    public accessderivedMediaQuerylambda0(String str, String str2) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessderivedMediaQuerylambda0)) {
            return false;
        }
        accessderivedMediaQuerylambda0 accessderivedmediaquerylambda0 = (accessderivedMediaQuerylambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, accessderivedmediaquerylambda0.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, accessderivedmediaquerylambda0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || this.read != accessderivedmediaquerylambda0.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, accessderivedmediaquerylambda0.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isShowingSubstitution=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.read, ')');
    }
}
