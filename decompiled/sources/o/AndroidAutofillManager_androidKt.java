package o;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidAutofillManager_androidKt extends AndroidAutofillManageronFocusChanged21 {
    public final androidx.compose.ui.Alignment.Horizontal IconCompatParcelizer;
    public final androidx.compose.ui.Alignment.Horizontal read;

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(false);
        return this.IconCompatParcelizer.hashCode() + ((this.read.hashCode() + (iHashCode * 31)) * 31);
    }

    public AndroidAutofillManager_androidKt() {
        androidx.compose.ui.Alignment.Companion companion = androidx.compose.ui.Alignment.Companion;
        androidx.compose.ui.Alignment.Horizontal start = companion.getStart();
        androidx.compose.ui.Alignment.Horizontal start2 = companion.getStart();
        this.read = start;
        this.IconCompatParcelizer = start2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidAutofillManager_androidKt)) {
            return false;
        }
        AndroidAutofillManager_androidKt androidAutofillManager_androidKt = (AndroidAutofillManager_androidKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, androidAutofillManager_androidKt.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, androidAutofillManager_androidKt.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.read + ", expandedAlignment=" + this.IconCompatParcelizer + ')';
    }
}
