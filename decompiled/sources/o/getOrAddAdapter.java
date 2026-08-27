package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getOrAddAdapter {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[com.google.firebase.inappmessaging.model.MessageType.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[com.google.firebase.inappmessaging.model.MessageType.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[com.google.firebase.inappmessaging.model.MessageType.MODAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[com.google.firebase.inappmessaging.model.MessageType.BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[com.google.firebase.inappmessaging.model.MessageType.IMAGE_ONLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
