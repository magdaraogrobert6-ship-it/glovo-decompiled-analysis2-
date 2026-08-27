package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class setThumbDrawable {
    public final setThumbPosition read;

    public final int hashCode() {
        return this.read.RemoteActionCompatParcelizer.hashCode();
    }

    public setThumbDrawable(int i, ArrayList arrayList, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, getThumbPosition getthumbposition) {
        this.read = new setThumbPosition(i, arrayList, previewFreezeAfterHighSpeedRecordingQuirk, getthumbposition);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setThumbDrawable)) {
            return false;
        }
        return this.read.equals(((setThumbDrawable) obj).read);
    }
}
