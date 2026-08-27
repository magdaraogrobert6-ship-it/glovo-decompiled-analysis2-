package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release {
    public final InetSocketAddress RemoteActionCompatParcelizer;
    public final setSmallNotificationIcon read;
    public final Proxy write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return this.RemoteActionCompatParcelizer.hashCode() + ((this.write.hashCode() + ((iHashCode + 527) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release)) {
            return false;
        }
        setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = (setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release) obj;
        return settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read.equals(this.read) && settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.write.equals(this.write) && settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.RemoteActionCompatParcelizer.equals(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "Route{" + this.RemoteActionCompatParcelizer + "}";
    }

    public setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release(setSmallNotificationIcon setsmallnotificationicon, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (setsmallnotificationicon == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("address == null");
            throw null;
        }
        if (inetSocketAddress == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("inetSocketAddress == null");
            throw null;
        }
        this.read = setsmallnotificationicon;
        this.write = proxy;
        this.RemoteActionCompatParcelizer = inetSocketAddress;
    }
}
