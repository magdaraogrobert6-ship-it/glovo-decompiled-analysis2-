package o;

import com.google.android.gms.location.DeviceOrientationRequest;
import io.socket.client.Manager$7;
import io.socket.emitter.Emitter;
import io.socket.parser.IOParser$Decoder;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM extends Emitter {
    public static final java.util.logging.Logger serializer = java.util.logging.Logger.getLogger(r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.class.getName());
    public final long IconCompatParcelizer;
    public final r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8 MediaBrowserCompatMediaItem;
    public final IOParser$Decoder MediaDescriptionCompat;
    public contentCardsUpdatelambda0 MediaMetadataCompat;
    public final ConcurrentHashMap MediaSessionCompatQueueItem;
    public r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc MediaSessionCompatResultReceiverWrapper;
    public final r8lambdaH4El2AuEYS7SZhBdBoHhFTah6iY MediaSessionCompatToken;
    public final ArrayList ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public final handleCardClick RemoteActionCompatParcelizer;
    public final URI r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final LinkedList r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final boolean read;
    public final int write;

    public r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM(URI uri, r8lambdaH4El2AuEYS7SZhBdBoHhFTah6iY r8lambdah4el2aueys7szhbdbohhftah6iy) {
        super(0);
        this.ParcelableVolumeInfo = new ArrayList();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new LinkedList();
        this.MediaSessionCompatQueueItem = new ConcurrentHashMap();
        if (r8lambdah4el2aueys7szhbdbohhftah6iy.MediaMetadataCompat == null) {
            r8lambdah4el2aueys7szhbdbohhftah6iy.MediaMetadataCompat = "/socket.io";
        }
        if (r8lambdah4el2aueys7szhbdbohhftah6iy.PlaybackStateCompatCustomAction == null) {
            r8lambdah4el2aueys7szhbdbohhftah6iy.PlaybackStateCompatCustomAction = null;
        }
        if (r8lambdah4el2aueys7szhbdbohhftah6iy.read == null) {
            r8lambdah4el2aueys7szhbdbohhftah6iy.read = null;
        }
        this.MediaSessionCompatToken = r8lambdah4el2aueys7szhbdbohhftah6iy;
        this.read = r8lambdah4el2aueys7szhbdbohhftah6iy.serializer;
        this.write = Integer.MAX_VALUE;
        handleCardClick handlecardclick = this.RemoteActionCompatParcelizer;
        if (handlecardclick != null) {
            handlecardclick.write = 1000L;
        }
        if (handlecardclick != null) {
            handlecardclick.read = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        }
        if (handlecardclick != null) {
            handlecardclick.IconCompatParcelizer = 0.5d;
        }
        handleCardClick handlecardclick2 = new handleCardClick();
        handlecardclick2.write = 1000L;
        handlecardclick2.read = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        handlecardclick2.IconCompatParcelizer = 0.5d;
        this.RemoteActionCompatParcelizer = handlecardclick2;
        this.IconCompatParcelizer = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc.CLOSED;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = uri;
        this.RatingCompat = false;
        this.MediaBrowserCompatMediaItem = new r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8(16);
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer = null;
        this.MediaDescriptionCompat = iOParser$Decoder;
    }

    public final void write(r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ r8lambdaa1ganccjs3o2sewhmv3kuv99jq) {
        Level level = Level.FINE;
        java.util.logging.Logger logger = serializer;
        if (logger.isLoggable(level)) {
            logger.fine("writing packet " + r8lambdaa1ganccjs3o2sewhmv3kuv99jq);
        }
        if (this.RatingCompat) {
            this.ParcelableVolumeInfo.add(r8lambdaa1ganccjs3o2sewhmv3kuv99jq);
            return;
        }
        this.RatingCompat = true;
        r8lambdaprDihMTuOcOeFIKgVogJEIatYzo r8lambdaprdihmtuocoefikgvogjeiatyzo = new r8lambdaprDihMTuOcOeFIKgVogJEIatYzo(this);
        this.MediaBrowserCompatMediaItem.getClass();
        int i = r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read;
        if ((i == 2 || i == 3) && ContentCardAdapter.RemoteActionCompatParcelizer(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer)) {
            r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read = r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read == 2 ? 5 : 6;
        }
        java.util.logging.Logger logger2 = ContentCardsFragmenthandleContentCardsUpdatedEvent1.serializer;
        if (logger2.isLoggable(level)) {
            logger2.fine("encoding packet " + r8lambdaa1ganccjs3o2sewhmv3kuv99jq);
        }
        int i2 = r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read;
        if (5 != i2 && 6 != i2) {
            r8lambdaprdihmtuocoefikgvogjeiatyzo.IconCompatParcelizer(new String[]{r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8.serializer(r8lambdaa1ganccjs3o2sewhmv3kuv99jq)});
            return;
        }
        java.util.logging.Logger logger3 = ContentCardsFragmentonViewStateRestored1.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer = ContentCardsFragmentonViewStateRestored1.serializer(arrayList, r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer);
        r8lambdaa1ganccjs3o2sewhmv3kuv99jq.serializer = arrayList.size();
        byte[][] bArr = (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
        String strSerializer = r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8.serializer(r8lambdaa1ganccjs3o2sewhmv3kuv99jq);
        ArrayList arrayList2 = new ArrayList(Arrays.asList(bArr));
        arrayList2.add(0, strSerializer);
        r8lambdaprdihmtuocoefikgvogjeiatyzo.IconCompatParcelizer(arrayList2.toArray());
    }

    public final void serializer() {
        if (this.PlaybackStateCompatCustomAction || this.PlaybackStateCompat) {
            return;
        }
        handleCardClick handlecardclick = this.RemoteActionCompatParcelizer;
        int i = handlecardclick.serializer;
        int i2 = this.write;
        java.util.logging.Logger logger = serializer;
        int i3 = 0;
        if (i >= i2) {
            logger.fine("reconnect failed");
            handlecardclick.serializer = 0;
            write("reconnect_failed", new Object[0]);
            this.PlaybackStateCompatCustomAction = false;
            return;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(handlecardclick.write);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2L);
        int i4 = handlecardclick.serializer;
        handlecardclick.serializer = i4 + 1;
        BigInteger bigIntegerMultiply = bigIntegerValueOf.multiply(bigIntegerValueOf2.pow(i4));
        if (handlecardclick.IconCompatParcelizer != 0.0d) {
            double dRandom = Math.random();
            BigInteger bigInteger = BigDecimal.valueOf(dRandom).multiply(BigDecimal.valueOf(handlecardclick.IconCompatParcelizer)).multiply(new BigDecimal(bigIntegerMultiply)).toBigInteger();
            bigIntegerMultiply = (((int) Math.floor(dRandom * 10.0d)) & 1) == 0 ? bigIntegerMultiply.subtract(bigInteger) : bigIntegerMultiply.add(bigInteger);
        }
        long jLongValue = bigIntegerMultiply.min(BigInteger.valueOf(handlecardclick.read)).max(BigInteger.valueOf(handlecardclick.write)).longValue();
        logger.fine(String.format("will wait %dms before reconnect attempt", Long.valueOf(jLongValue)));
        this.PlaybackStateCompatCustomAction = true;
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new Manager$7(i3, this), jLongValue);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.add(new r8lambdalffyX2I1EXju9ZCwYII3pJGhPcs(timer, 0));
    }

    public final void write() {
        serializer.fine("cleanup");
        while (true) {
            attachSwipeHelperCallback attachswipehelpercallback = (attachSwipeHelperCallback) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.poll();
            if (attachswipehelpercallback == null) {
                break;
            } else {
                attachswipehelpercallback.IconCompatParcelizer();
            }
        }
        IOParser$Decoder iOParser$Decoder = this.MediaDescriptionCompat;
        iOParser$Decoder.read = null;
        this.ParcelableVolumeInfo.clear();
        this.RatingCompat = false;
        FormBody.Builder builder = (FormBody.Builder) iOParser$Decoder.RemoteActionCompatParcelizer;
        if (builder != null) {
            builder.RemoteActionCompatParcelizer = null;
            builder.serializer = new ArrayList();
        }
        iOParser$Decoder.read = null;
    }
}
