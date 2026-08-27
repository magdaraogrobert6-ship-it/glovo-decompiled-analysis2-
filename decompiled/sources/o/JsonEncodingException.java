package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class JsonEncodingException extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public static final JsonEncodingException IconCompatParcelizer = new JsonEncodingException(3, SharedPreferences.class, "getString", "getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 0);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = serializer + 65;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = write + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        sharedPreferences.getClass();
        String string = sharedPreferences.getString((String) obj2, (String) obj3);
        int i4 = write + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return string;
    }

    public JsonEncodingException(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
