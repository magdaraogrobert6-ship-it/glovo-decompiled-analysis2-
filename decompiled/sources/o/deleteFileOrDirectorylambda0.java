package o;

import com.sentiance.semantic_time.StationaryLabel;

/* JADX INFO: loaded from: classes4.dex */
public final class deleteFileOrDirectorylambda0 {
    public final setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release IconCompatParcelizer;
    public final setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release RemoteActionCompatParcelizer;
    public final InAppMessageManagerBaseExternalSyntheticLambda1 read;
    public final StationaryLabel serializer;

    public deleteFileOrDirectorylambda0(deleteFileOrDirectory deletefileordirectory, InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda1) {
        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release = deletefileordirectory.read;
        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2 = deletefileordirectory.IconCompatParcelizer;
        StationaryLabel stationaryLabel = deletefileordirectory.write;
        setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release.getClass();
        setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2.getClass();
        stationaryLabel.getClass();
        this.RemoteActionCompatParcelizer = setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release;
        this.IconCompatParcelizer = setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2;
        this.serializer = stationaryLabel;
        this.read = inAppMessageManagerBaseExternalSyntheticLambda1;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.value.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.value.hashCode();
        return this.read.value.hashCode() + ((this.serializer.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deleteFileOrDirectorylambda0)) {
            return false;
        }
        deleteFileOrDirectorylambda0 deletefileordirectorylambda0 = (deleteFileOrDirectorylambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, deletefileordirectorylambda0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, deletefileordirectorylambda0.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.serializer == deletefileordirectorylambda0.serializer && this.read.equals(deletefileordirectorylambda0.read);
    }

    public final String toString() {
        return "LabeledStationaryWithDate(start=" + this.RemoteActionCompatParcelizer + ", stop=" + this.IconCompatParcelizer + ", label=" + this.serializer + ", date=" + this.read + ')';
    }
}
