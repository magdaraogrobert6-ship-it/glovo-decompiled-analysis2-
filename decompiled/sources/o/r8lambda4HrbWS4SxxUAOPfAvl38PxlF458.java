package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.internal.SharedResourcePool;
import io.sentry.MovePreviousSession;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda4HrbWS4SxxUAOPfAvl38PxlF458 implements r8lambdaHkGMN1DBBsM36C0FCyucxC4Jw {
    public final boolean IconCompatParcelizer;
    public final getCACHE_SUFFIX_PREFERENCES_FILEannotations MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final SSLSocketFactory MediaSessionCompatResultReceiverWrapper;
    public final ScheduledExecutorService MediaSessionCompatToken;
    public final SharedResourcePool ParcelableVolumeInfo;
    public final WebContentUtils PlaybackStateCompat;
    public final long RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public final r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY read;
    public final SharedResourcePool serializer;
    public final Executor write;

    public r8lambda4HrbWS4SxxUAOPfAvl38PxlF458(SharedResourcePool sharedResourcePool, SharedResourcePool sharedResourcePool2, SSLSocketFactory sSLSocketFactory, r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY r8lambdayjdq0ic3o_lbr72bnjjtmnwny, int i, boolean z, long j, long j2, int i2, int i3, WebContentUtils webContentUtils) {
        this.serializer = sharedResourcePool;
        this.write = (Executor) JavascriptInterfaceBase.IconCompatParcelizer((BrazeWebViewClientsetWebViewClientStateListener11) sharedResourcePool.IconCompatParcelizer);
        this.ParcelableVolumeInfo = sharedResourcePool2;
        this.MediaSessionCompatToken = (ScheduledExecutorService) JavascriptInterfaceBase.IconCompatParcelizer((BrazeWebViewClientsetWebViewClientStateListener11) sharedResourcePool2.IconCompatParcelizer);
        this.MediaSessionCompatResultReceiverWrapper = sSLSocketFactory;
        this.read = r8lambdayjdq0ic3o_lbr72bnjjtmnwny;
        this.MediaDescriptionCompat = i;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompatMediaItem = new getCACHE_SUFFIX_PREFERENCES_FILEannotations(j);
        this.RatingCompat = j2;
        this.MediaMetadataCompat = i2;
        this.MediaSessionCompatQueueItem = i3;
        TextStreamsKt.serializer(webContentUtils, "transportTracerFactory");
        this.PlaybackStateCompat = webContentUtils;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
        JavascriptInterfaceBase.IconCompatParcelizer((BrazeWebViewClientsetWebViewClientStateListener11) this.serializer.IconCompatParcelizer, this.write);
        JavascriptInterfaceBase.IconCompatParcelizer((BrazeWebViewClientsetWebViewClientStateListener11) this.ParcelableVolumeInfo.IconCompatParcelizer, this.MediaSessionCompatToken);
    }

    @Override // o.r8lambdaHkGMN1DBBsM36C0FCyucxC4Jw
    public final ensureBrazeFieldLength read(SocketAddress socketAddress, r8lambdaWCoIxPseFbjgKhwxhF2IWx2YMhw r8lambdawcoixpsefbjgkhwxhf2iwx2ymhw, getLocalHtmlUrlFromRemoteUrllambda0 getlocalhtmlurlfromremoteurllambda0) {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("The transport factory is closed.");
            return null;
        }
        getCACHE_SUFFIX_PREFERENCES_FILEannotations getcache_suffix_preferences_fileannotations = this.MediaBrowserCompatMediaItem;
        long j = getcache_suffix_preferences_fileannotations.read.get();
        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu = new r8lambda1DLeNeBWPKsDsvf_XikspXtDEU(this, (InetSocketAddress) socketAddress, r8lambdawcoixpsefbjgkhwxhf2iwx2ymhw.RemoteActionCompatParcelizer, r8lambdawcoixpsefbjgkhwxhf2iwx2ymhw.serializer, r8lambdawcoixpsefbjgkhwxhf2iwx2ymhw.write, new MovePreviousSession(20, new getCacheFileSuffixlambda0(getcache_suffix_preferences_fileannotations, j)));
        if (this.IconCompatParcelizer) {
            r8lambda1dlenebwpksdsvf_xikspxtdeu.MediaSessionCompatQueueItem = true;
            r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = j;
            r8lambda1dlenebwpksdsvf_xikspxtdeu.ComponentActivity = this.RatingCompat;
        }
        return r8lambda1dlenebwpksdsvf_xikspxtdeu;
    }
}
