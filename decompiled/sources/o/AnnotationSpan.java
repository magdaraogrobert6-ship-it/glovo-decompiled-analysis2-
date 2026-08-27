package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AnnotationSpan {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final SemanticsPropertiesFillableData1 serializer = new SemanticsPropertiesFillableData1(28);

    static {
        int i = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
