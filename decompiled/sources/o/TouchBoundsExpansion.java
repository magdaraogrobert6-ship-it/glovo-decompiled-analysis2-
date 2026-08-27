package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class TouchBoundsExpansion {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[com.google.firebase.inappmessaging.model.MessageType.values().length];
        serializer = iArr;
        try {
            iArr[com.google.firebase.inappmessaging.model.MessageType.MODAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[com.google.firebase.inappmessaging.model.MessageType.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[com.google.firebase.inappmessaging.model.MessageType.IMAGE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            serializer[com.google.firebase.inappmessaging.model.MessageType.BANNER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
