package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class JsonUtf8Reader extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    public static final JsonUtf8Reader RemoteActionCompatParcelizer = new JsonUtf8Reader(3, SharedPreferences.class, "getLong", "getLong(Ljava/lang/String;J)J", 0);
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 41;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = read + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj4 = null;
        if (i2 % 2 != 0) {
            SharedPreferences sharedPreferences = (SharedPreferences) obj;
            long jLongValue = ((Number) obj3).longValue();
            sharedPreferences.getClass();
            Long.valueOf(sharedPreferences.getLong((String) obj2, jLongValue));
            obj4.hashCode();
            throw null;
        }
        SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
        long jLongValue2 = ((Number) obj3).longValue();
        sharedPreferences2.getClass();
        Long lValueOf = Long.valueOf(sharedPreferences2.getLong((String) obj2, jLongValue2));
        int i3 = read + 13;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return lValueOf;
        }
        obj4.hashCode();
        throw null;
    }

    public JsonUtf8Reader(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
