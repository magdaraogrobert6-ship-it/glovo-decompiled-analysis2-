package o;

import java.net.SocketAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class getMD5_HASH_OF_THE_STRING_NULLannotations implements r8lambdaHkGMN1DBBsM36C0FCyucxC4Jw {
    public final r8lambda4HrbWS4SxxUAOPfAvl38PxlF458 RemoteActionCompatParcelizer;
    public final shouldSkip serializer;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.close();
    }

    @Override // o.r8lambdaHkGMN1DBBsM36C0FCyucxC4Jw
    public final ensureBrazeFieldLength read(SocketAddress socketAddress, r8lambdaWCoIxPseFbjgKhwxhF2IWx2YMhw r8lambdawcoixpsefbjgkhwxhf2iwx2ymhw, getLocalHtmlUrlFromRemoteUrllambda0 getlocalhtmlurlfromremoteurllambda0) {
        return new getCacheMapKey(this, this.RemoteActionCompatParcelizer.read(socketAddress, r8lambdawcoixpsefbjgkhwxhf2iwx2ymhw, getlocalhtmlurlfromremoteurllambda0), r8lambdawcoixpsefbjgkhwxhf2iwx2ymhw.RemoteActionCompatParcelizer);
    }

    public getMD5_HASH_OF_THE_STRING_NULLannotations(r8lambda4HrbWS4SxxUAOPfAvl38PxlF458 r8lambda4hrbws4sxxuaopfavl38pxlf458, shouldSkip shouldskip) {
        this.RemoteActionCompatParcelizer = r8lambda4hrbws4sxxuaopfavl38pxlf458;
        this.serializer = shouldskip;
    }
}
