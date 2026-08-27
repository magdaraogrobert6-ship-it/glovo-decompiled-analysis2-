package o;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambda0dEmXvKMtdJKKTV5R0Yx3HGc0w extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public static final r8lambda0dEmXvKMtdJKKTV5R0Yx3HGc0w IconCompatParcelizer = new r8lambda0dEmXvKMtdJKKTV5R0Yx3HGc0w(3, SharedPreferences.class, "getStringSet", "getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", 0);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = read + 15;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        sharedPreferences.getClass();
        Set<String> stringSet = sharedPreferences.getStringSet((String) obj2, (Set) obj3);
        int i4 = write + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stringSet;
    }

    public r8lambda0dEmXvKMtdJKKTV5R0Yx3HGc0w(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
