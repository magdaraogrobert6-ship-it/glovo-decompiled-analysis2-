package o;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdayLhLVWHiWt8zzmWjqiTGBD6PCw0 {
    public static final String[] IconCompatParcelizer = new String[0];
    public static final Charset serializer = Charset.forName(com.adjust.sdk.Constants.ENCODING);

    public static Object[] read(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            for (Object obj2 : objArr2) {
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) String.class, arrayList.size()));
    }
}
