package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class percentRouteTraveledFormatter extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public static final percentRouteTraveledFormatter IconCompatParcelizer = new percentRouteTraveledFormatter(3, SharedPreferences.class, "getFloat", "getFloat(Ljava/lang/String;F)F", 0);
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = read + 103;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = write + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        float fFloatValue = ((Number) obj3).floatValue();
        sharedPreferences.getClass();
        Float fValueOf = Float.valueOf(sharedPreferences.getFloat((String) obj2, fFloatValue));
        int i4 = write + 69;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fValueOf;
    }

    public percentRouteTraveledFormatter(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
