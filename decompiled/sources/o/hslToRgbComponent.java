package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hslToRgbComponent {
    public final List IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final List write;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public hslToRgbComponent(String str, boolean z, List list, List list2) {
        str.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = z;
        this.write = list;
        this.IconCompatParcelizer = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
        }
        this.IconCompatParcelizer = (List) arrayList;
    }

    public final int hashCode() {
        String str = this.read;
        return this.IconCompatParcelizer.hashCode() + c8$$ExternalSyntheticOutline0.m(this.write, (((setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.RemoteActionCompatParcelizer ? 1 : 0)) * 31, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hslToRgbComponent) {
            hslToRgbComponent hsltorgbcomponent = (hslToRgbComponent) obj;
            String str = hsltorgbcomponent.read;
            if (this.RemoteActionCompatParcelizer == hsltorgbcomponent.RemoteActionCompatParcelizer && this.write.equals(hsltorgbcomponent.write)) {
                Object[] objArr = {this.IconCompatParcelizer, hsltorgbcomponent.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    String str2 = this.read;
                    if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, "index_", false)) {
                        return setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "index_", false);
                    }
                    return str2.equals(str);
                }
            }
        }
        return false;
    }

    public final String toString() {
        return isCurrentlyDisplayingInAppMessage.serializer(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n            |Index {\n            |   name = '" + this.read + "',\n            |   unique = '" + this.RemoteActionCompatParcelizer + "',\n            |   columns = {" + hsvJlNiLsgdefault.read(this.write) + "\n            |   orders = {" + hsvJlNiLsgdefault.RemoteActionCompatParcelizer(this.IconCompatParcelizer) + "\n            |}\n        "));
    }
}
