package o;

import com.sentiance.semantic_time.StationaryLabel;

/* JADX INFO: loaded from: classes4.dex */
public final class deleteFileOrDirectory {
    public final setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release IconCompatParcelizer;
    public final setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release read;
    public final StationaryLabel write;

    public final int hashCode() {
        int iHashCode = this.read.value.hashCode();
        return this.write.hashCode() + ((this.IconCompatParcelizer.value.hashCode() + (iHashCode * 31)) * 31);
    }

    public deleteFileOrDirectory(setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release, setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2, StationaryLabel stationaryLabel) {
        setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release.getClass();
        setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2.getClass();
        stationaryLabel.getClass();
        this.read = setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release;
        this.IconCompatParcelizer = setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2;
        this.write = stationaryLabel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deleteFileOrDirectory)) {
            return false;
        }
        deleteFileOrDirectory deletefileordirectory = (deleteFileOrDirectory) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, deletefileordirectory.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, deletefileordirectory.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.write == deletefileordirectory.write;
    }

    public final String toString() {
        return "LabeledStationary(start=" + this.read + ", stop=" + this.IconCompatParcelizer + ", label=" + this.write + ')';
    }
}
