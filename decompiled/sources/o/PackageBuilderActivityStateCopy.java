package o;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageBuilderActivityStateCopy implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    public static final PackageBuilderActivityStateCopy read = new PackageBuilderActivityStateCopy();
    private static int serializer;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 61;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        buildThirdPartySharingPackage buildthirdpartysharingpackage = new buildThirdPartySharingPackage();
        int i2 = IconCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return buildthirdpartysharingpackage;
    }
}
