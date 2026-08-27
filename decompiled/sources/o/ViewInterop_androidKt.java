package o;

import com.google.firebase.inappmessaging.MessagesProto$Content;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ViewInterop_androidKt {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[MessagesProto$Content.read.values().length];
        write = iArr;
        try {
            iArr[MessagesProto$Content.read.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[MessagesProto$Content.read.IMAGE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[MessagesProto$Content.read.MODAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[MessagesProto$Content.read.CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
