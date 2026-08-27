package o;

import io.socket.emitter.Emitter;

/* JADX INFO: loaded from: classes4.dex */
public final class createRecomposer extends Emitter {
    public static volatile createRecomposer IconCompatParcelizer;
    public static volatile createRecomposer serializer;
    public final /* synthetic */ int read;
    public static final byte[] write = new byte[0];
    public static final byte[] RemoteActionCompatParcelizer = new byte[0];

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ createRecomposer(int i) {
        super(3);
        this.read = i;
    }

    public static createRecomposer read() {
        if (IconCompatParcelizer == null) {
            synchronized (write) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new createRecomposer(0);
                }
            }
        }
        return IconCompatParcelizer;
    }

    public static createRecomposer write() {
        if (serializer == null) {
            synchronized (RemoteActionCompatParcelizer) {
                if (serializer == null) {
                    serializer = new createRecomposer(1);
                }
            }
        }
        return serializer;
    }

    @Override // io.socket.emitter.Emitter
    public final String i_() {
        return this.read != 0 ? "ARCallbackManager" : "ATCallBackManager";
    }
}
