package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.internal.SharedResourcePool;
import io.sentry.JsonObjectSerializer;
import java.util.EnumSet;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class Rstyleable extends r8lambdamu6J4Yd9XJP2687am3_xsruOrj4 {
    public static final r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY RemoteActionCompatParcelizer;
    public static final long serializer;
    public static final SharedResourcePool write;
    public final setMaxUnpackedZipEntryCountandroid_sdk_base_release MediaBrowserCompatMediaItem;
    public SSLSocketFactory PlaybackStateCompatCustomAction;
    public final WebContentUtils r8lambda54BeH8ZsBru0CXI2CCSP2syNys = logPurchaseWithJSONlambda0.IconCompatParcelizer;
    public final SharedResourcePool MediaSessionCompatToken = write;
    public final SharedResourcePool ParcelableVolumeInfo = new SharedResourcePool(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
    public final r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY read = RemoteActionCompatParcelizer;
    public final Rdrawable MediaSessionCompatResultReceiverWrapper = Rdrawable.TLS;
    public long MediaSessionCompatQueueItem = Long.MAX_VALUE;
    public final long MediaDescriptionCompat = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.MediaBrowserCompatMediaItem;
    public final int MediaMetadataCompat = 65535;
    public final int RatingCompat = 4194304;
    public final int PlaybackStateCompat = Integer.MAX_VALUE;

    @Override // o.r8lambdamu6J4Yd9XJP2687am3_xsruOrj4
    public final coil3.util.UtilsKt serializer() {
        return this.MediaBrowserCompatMediaItem;
    }

    static {
        java.util.logging.Logger.getLogger(Rstyleable.class.getName());
        r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM r8lambdadub55uayvsb0x6jhq2bbhcsccgm = new r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM(r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY.read);
        r8lambdadub55uayvsb0x6jhq2bbhcsccgm.serializer(r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, r8lambdaVK6aD2NC8JG9pWqI3uwIW6aNOgI.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        r8lambdadub55uayvsb0x6jhq2bbhcsccgm.serializer(r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M.TLS_1_2);
        if (!r8lambdadub55uayvsb0x6jhq2bbhcsccgm.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no TLS extensions for cleartext connections");
            return;
        }
        r8lambdadub55uayvsb0x6jhq2bbhcsccgm.IconCompatParcelizer = true;
        RemoteActionCompatParcelizer = new r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY(r8lambdadub55uayvsb0x6jhq2bbhcsccgm);
        serializer = 86400000000000000L;
        write = new SharedResourcePool(new accessisMainThread());
        EnumSet.of(r8lambdaogATDJbiVlNnvgGDymtqsmI0doE.MTLS, r8lambdaogATDJbiVlNnvgGDymtqsmI0doE.CUSTOM_MANAGERS);
    }

    public Rstyleable(String str) {
        this.MediaBrowserCompatMediaItem = new setMaxUnpackedZipEntryCountandroid_sdk_base_release(str, new SharedResourcePool(this), new JsonObjectSerializer(8, this));
    }
}
