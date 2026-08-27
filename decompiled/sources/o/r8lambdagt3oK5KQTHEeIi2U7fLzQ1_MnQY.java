package o;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY {
    private final parseStringlambda0 IconCompatParcelizer;

    public final void serializer(long j, Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length + 1);
        arrayList.add(com.sentiance.sdk.util.x.c(j));
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            arrayList.add(obj == null ? "null" : obj.toString());
        }
        this.IconCompatParcelizer.read(r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList, ","));
    }

    public r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY(Context context, String str, r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0 r8lambdabeyxiieovxeplp1oh2wlzr3abd0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.IconCompatParcelizer = new parseStringlambda0(context, str, r8lambdabeyxiieovxeplp1oh2wlzr3abd0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni);
    }
}
