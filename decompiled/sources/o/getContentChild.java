package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getContentChild {
    public HashMap IconCompatParcelizer;

    static {
        new HashMap(new HashMap());
    }

    public final Parcelable write(String str) {
        Object obj = this.IconCompatParcelizer.get(str);
        return obj instanceof Parcelable ? (Parcelable) obj : new Parcelable() { // from class: com.huawei.location.lite.common.chain.Data$1
            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
            }
        };
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.IconCompatParcelizer;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
