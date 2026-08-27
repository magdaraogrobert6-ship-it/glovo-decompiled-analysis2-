package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class logRiderSafetyPermissionDenied extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final logRiderSafetyPermissionDenied write = new logRiderSafetyPermissionDenied(3, SharedPreferences.class, "getBoolean", "getBoolean(Ljava/lang/String;Z)Z", 0);

    static {
        int i = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = serializer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            SharedPreferences sharedPreferences = (SharedPreferences) obj;
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            sharedPreferences.getClass();
            return Boolean.valueOf(sharedPreferences.getBoolean((String) obj2, zBooleanValue));
        }
        SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        sharedPreferences2.getClass();
        Boolean.valueOf(sharedPreferences2.getBoolean((String) obj2, zBooleanValue2));
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }

    public logRiderSafetyPermissionDenied(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
