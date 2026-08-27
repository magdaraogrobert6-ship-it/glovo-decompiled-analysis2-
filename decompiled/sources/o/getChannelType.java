package o;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes4.dex */
public final class getChannelType {
    public final getChatID IconCompatParcelizer;
    public final Object read;

    public getChannelType(getChatID getchatid, final Object obj) {
        this.IconCompatParcelizer = getchatid;
        this.read = obj;
        if (obj == null || Stream.of((Object[]) ((FoodoraCodReasonCompanion) getVariantName.write.get(getchatid)).write).anyMatch(new Predicate() { // from class: o.AndroidScheduleProvider
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return ((Class) obj2).isInstance(obj);
            }
        })) {
            return;
        }
        StringBuilder sb = new StringBuilder("The ");
        sb.append(getchatid);
        getOffVariationName.serializer(sb, " method doesn't support options of type ", obj.getClass());
        throw null;
    }

    public final int hashCode() {
        getChatID getchatid = this.IconCompatParcelizer;
        if (getchatid == null) {
            return 0;
        }
        return getchatid.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getChannelType.class != obj.getClass()) {
            return false;
        }
        getChannelType getchanneltype = (getChannelType) obj;
        return Objects.equals(this.IconCompatParcelizer, getchanneltype.IconCompatParcelizer) && Objects.equals(this.read, getchanneltype.read);
    }
}
