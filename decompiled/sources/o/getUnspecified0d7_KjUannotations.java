package o;

import com.huawei.location.nlp.scan.FB;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class getUnspecified0d7_KjUannotations {
    public final Map IconCompatParcelizer;
    public final Set RemoteActionCompatParcelizer;
    public final Set serializer;
    public final String write;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + IconCompatParcelizer.RemoteActionCompatParcelizer(this.write.hashCode() * 31, this.IconCompatParcelizer, 31);
    }

    public getUnspecified0d7_KjUannotations(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.write = str;
        this.IconCompatParcelizer = map;
        this.RemoteActionCompatParcelizer = abstractSet;
        this.serializer = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUnspecified0d7_KjUannotations)) {
            return false;
        }
        getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations = (getUnspecified0d7_KjUannotations) obj;
        if (!this.write.equals(getunspecified0d7_kjuannotations.write) || !this.IconCompatParcelizer.equals(getunspecified0d7_kjuannotations.IconCompatParcelizer)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getunspecified0d7_kjuannotations.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Set set2 = this.serializer;
        if (set2 == null || (set = getunspecified0d7_kjuannotations.serializer) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final String toString() {
        Collection collectionSerializer;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.write);
        sb.append("',\n            |    columns = {");
        sb.append(hsvJlNiLsgdefault.IconCompatParcelizer(onContentCardDismissed.serializer(this.IconCompatParcelizer.values(), new FB(3))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(hsvJlNiLsgdefault.IconCompatParcelizer(this.RemoteActionCompatParcelizer));
        sb.append("\n            |    indices = {");
        Set set = this.serializer;
        if (set != null) {
            collectionSerializer = onContentCardDismissed.serializer(set, new FB(4));
        } else {
            collectionSerializer = instance_delegatelambda0.write;
        }
        sb.append(hsvJlNiLsgdefault.IconCompatParcelizer(collectionSerializer));
        sb.append("\n            |}\n        ");
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString());
    }

    public static final getUnspecified0d7_KjUannotations serializer(UncheckedColor uncheckedColor, String str) {
        uncheckedColor.getClass();
        return getBlue0d7_KjU.write(new C0172getimpl(uncheckedColor), str);
    }
}
