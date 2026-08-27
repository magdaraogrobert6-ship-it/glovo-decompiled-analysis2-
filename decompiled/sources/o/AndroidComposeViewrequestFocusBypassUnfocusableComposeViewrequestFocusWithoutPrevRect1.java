package o;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1 {
    public final addNotificationForSysPropsChangelambda0010 IconCompatParcelizer;
    public final AndroidComposeViewresendMotionEventOnLayout1 RemoteActionCompatParcelizer;
    public final getLifecycleOwner serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
    }

    public AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1(getLifecycleOwner getlifecycleowner, AndroidComposeViewresendMotionEventOnLayout1 androidComposeViewresendMotionEventOnLayout1, addNotificationForSysPropsChangelambda0010 addnotificationforsyspropschangelambda0010) {
        getlifecycleowner.getClass();
        this.serializer = getlifecycleowner;
        this.RemoteActionCompatParcelizer = androidComposeViewresendMotionEventOnLayout1;
        this.IconCompatParcelizer = addnotificationforsyspropschangelambda0010;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1)) {
            return false;
        }
        AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1 = (AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1) obj;
        return this.serializer == androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1.serializer && this.RemoteActionCompatParcelizer.equals(androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1.IconCompatParcelizer);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.serializer + ", sessionData=" + this.RemoteActionCompatParcelizer + ", applicationInfo=" + this.IconCompatParcelizer + ')';
    }
}
