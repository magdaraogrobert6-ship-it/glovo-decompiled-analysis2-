package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class sendKeyEventZmokQxo {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[com.google.firebase.inappmessaging.model.MessageType.values().length];
        write = iArr;
        try {
            iArr[com.google.firebase.inappmessaging.model.MessageType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[com.google.firebase.inappmessaging.model.MessageType.MODAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[com.google.firebase.inappmessaging.model.MessageType.IMAGE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[com.google.firebase.inappmessaging.model.MessageType.CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
