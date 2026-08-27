package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class JsonReader extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final JsonReader read = new JsonReader(3, SharedPreferences.class, "getInt", "getInt(Ljava/lang/String;I)I", 0);
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 49;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = write + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            SharedPreferences sharedPreferences = (SharedPreferences) obj;
            int iIntValue = ((Number) obj3).intValue();
            sharedPreferences.getClass();
            return Integer.valueOf(sharedPreferences.getInt((String) obj2, iIntValue));
        }
        SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
        int iIntValue2 = ((Number) obj3).intValue();
        sharedPreferences2.getClass();
        Integer numValueOf = Integer.valueOf(sharedPreferences2.getInt((String) obj2, iIntValue2));
        int i3 = 43 / 0;
        return numValueOf;
    }

    public JsonReader(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
