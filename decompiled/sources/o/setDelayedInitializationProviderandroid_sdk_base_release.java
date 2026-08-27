package o;

import com.sentiance.okhttp3.u$a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setDelayedInitializationProviderandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final getSdkEnablementProviderandroid_sdk_base_release serializer = new getSdkEnablementProviderandroid_sdk_base_release(13);
    public final List write;

    public final int hashCode() {
        return (this.write.hashCode() ^ 16777619) * (-2128831035);
    }

    public setDelayedInitializationProviderandroid_sdk_base_release(u$a u_a) {
        this.write = Collections.unmodifiableList(u_a.IconCompatParcelizer);
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read(new StringBuilder("HardEvents{hard_events="), this.write, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setDelayedInitializationProviderandroid_sdk_base_release)) {
            return false;
        }
        Object obj2 = ((setDelayedInitializationProviderandroid_sdk_base_release) obj).write;
        List list = this.write;
        return list == obj2 || list.equals(obj2);
    }
}
