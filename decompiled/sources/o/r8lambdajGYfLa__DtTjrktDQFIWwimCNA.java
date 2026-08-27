package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdajGYfLa__DtTjrktDQFIWwimCNA extends r8lambdaNGtmLVJzMfxJG0dVSGRl8fYF5wE {
    public final ArrayList IconCompatParcelizer;
    public final setLargeNotificationIconNameandroid_sdk_base_release serializer;

    public final int hashCode() {
        return this.serializer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public r8lambdajGYfLa__DtTjrktDQFIWwimCNA(ArrayList arrayList, setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release) {
        this.IconCompatParcelizer = arrayList;
        this.serializer = setlargenotificationiconnameandroid_sdk_base_release;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdajGYfLa__DtTjrktDQFIWwimCNA) {
            r8lambdajGYfLa__DtTjrktDQFIWwimCNA r8lambdajgyfla__dttjrktdqfiwwimcna = (r8lambdajGYfLa__DtTjrktDQFIWwimCNA) obj;
            return this.IconCompatParcelizer.equals(r8lambdajgyfla__dttjrktdqfiwwimcna.IconCompatParcelizer) && this.serializer == r8lambdajgyfla__dttjrktdqfiwwimcna.serializer;
        }
        return false;
    }

    public final String toString() {
        return "Success(clusterLabels=" + this.IconCompatParcelizer + ", newCentroid=" + this.serializer + ')';
    }
}
