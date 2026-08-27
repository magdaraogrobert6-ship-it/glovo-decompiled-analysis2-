package o;

import com.google.firebase.inappmessaging.MessagesProto$Content;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class setViewCompositionStrategy {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[MessagesProto$Content.read.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[MessagesProto$Content.read.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[MessagesProto$Content.read.IMAGE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[MessagesProto$Content.read.MODAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            RemoteActionCompatParcelizer[MessagesProto$Content.read.CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
