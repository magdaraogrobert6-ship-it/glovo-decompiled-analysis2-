package o;

import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getCustomLocationProviderNamesandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setDefaultNotificationChannelNameandroid_sdk_base_release read = new setDefaultNotificationChannelNameandroid_sdk_base_release(1);
    public final List IconCompatParcelizer;

    public getCustomLocationProviderNamesandroid_sdk_base_release(u$a u_a) {
        ArrayList arrayList = u_a.IconCompatParcelizer;
        this.IconCompatParcelizer = arrayList == null ? null : Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read(new StringBuilder("Payload{facts="), this.IconCompatParcelizer, "}");
    }

    public final int hashCode() {
        List list = this.IconCompatParcelizer;
        return ((list == null ? 0 : list.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof getCustomLocationProviderNamesandroid_sdk_base_release)) {
            return false;
        }
        Object obj2 = ((getCustomLocationProviderNamesandroid_sdk_base_release) obj).IconCompatParcelizer;
        List list = this.IconCompatParcelizer;
        return list == obj2 || (list != null && list.equals(obj2));
    }
}
