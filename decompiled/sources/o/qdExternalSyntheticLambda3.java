package o;

/* JADX INFO: loaded from: classes3.dex */
public final class qdExternalSyntheticLambda3 implements getColorIntegerOrNulllambda0 {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final qdExternalSyntheticLambda3 read = new qdExternalSyntheticLambda3(1);
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ qdExternalSyntheticLambda3(int i) {
        this.IconCompatParcelizer = i;
    }

    static {
        int i = write + 117;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        Object obj = null;
        if (this.IconCompatParcelizer != 0) {
            q5 q5Var = new q5(displayInAppMessagelambda1.serializer(coil3.UriKt.class), displayInAppMessagelambda1.serializer(r9.class));
            int i2 = MediaDescriptionCompat + 63;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return q5Var;
            }
            obj.hashCode();
            throw null;
        }
        DraggableNode draggableNode = new DraggableNode(new qf());
        int i3 = RemoteActionCompatParcelizer + 65;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return draggableNode;
        }
        obj.hashCode();
        throw null;
    }
}
