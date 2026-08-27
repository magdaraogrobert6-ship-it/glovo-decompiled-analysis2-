package o;

import com.roadrunner.appperformance.performance.AppPerformanceAttributesValueProviderImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getSemanticsNode implements getColorIntegerOrNulllambda0 {
    public static final getSemanticsNode IconCompatParcelizer = new getSemanticsNode();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = serializer + 35;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        AppPerformanceAttributesValueProviderImpl appPerformanceAttributesValueProviderImpl = new AppPerformanceAttributesValueProviderImpl();
        int i2 = RemoteActionCompatParcelizer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return appPerformanceAttributesValueProviderImpl;
        }
        throw null;
    }
}
