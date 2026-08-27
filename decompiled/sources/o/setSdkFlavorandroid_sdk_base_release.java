package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setSdkFlavorandroid_sdk_base_release {
    public static final setShouldAddStatusBarPaddingToInAppMessages Companion = new setShouldAddStatusBarPaddingToInAppMessages();
    public static final setGraphicModalMaxWidthDp[] e = {null, null, new setWasCloseMessageCalled(setPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release.write, 0), null};
    public final setLargeNotificationIconNameandroid_sdk_base_release a;
    public final String b;
    public final List c;
    public final setSdkFlavor d;

    public final int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.c, af$$ExternalSyntheticOutline0.m(this.a.hashCode() * 31, 31, this.b), 31);
        setSdkFlavor setsdkflavor = this.d;
        return iM + (setsdkflavor == null ? 0 : setsdkflavor.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSdkFlavorandroid_sdk_base_release)) {
            return false;
        }
        setSdkFlavorandroid_sdk_base_release setsdkflavorandroid_sdk_base_release = (setSdkFlavorandroid_sdk_base_release) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, setsdkflavorandroid_sdk_base_release.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, setsdkflavorandroid_sdk_base_release.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, setsdkflavorandroid_sdk_base_release.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, setsdkflavorandroid_sdk_base_release.d}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Venue(centroid=" + this.a + ", name=" + this.b + ", osmTags=" + this.c + ", polygon=" + this.d + ')';
    }

    public setSdkFlavorandroid_sdk_base_release(int i, setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release, String str, List list, setSdkFlavor setsdkflavor) {
        if (15 == (i & 15)) {
            this.a = setlargenotificationiconnameandroid_sdk_base_release;
            this.b = str;
            this.c = list;
            this.d = setsdkflavor;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, setSessionStartBasedTimeoutEnabledandroid_sdk_base_release.IconCompatParcelizer);
        throw null;
    }

    public setSdkFlavorandroid_sdk_base_release(setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release, String str, List list, setSdkFlavor setsdkflavor) {
        setlargenotificationiconnameandroid_sdk_base_release.getClass();
        list.getClass();
        this.a = setlargenotificationiconnameandroid_sdk_base_release;
        this.b = str;
        this.c = list;
        this.d = setsdkflavor;
    }
}
