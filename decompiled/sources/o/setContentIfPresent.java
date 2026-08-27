package o;

import android.os.Process;
import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TransportMode;
import io.socket.parser.IOParser$Decoder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setContentIfPresent extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    public static int RemoteActionCompatParcelizer;
    public static int serializer;
    final /* synthetic */ setAccentColorIfPresentAndSupportedlambda10 read;

    public setContentIfPresent(setAccentColorIfPresentAndSupportedlambda10 setaccentcolorifpresentandsupportedlambda10) {
        this.read = setaccentcolorifpresentandsupportedlambda10;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        setAccentColorIfPresentAndSupportedlambda10 setaccentcolorifpresentandsupportedlambda10 = this.read;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = setaccentcolorifpresentandsupportedlambda10.read;
        long j = setaccentcolorifpresentandsupportedlambda10.write;
        DetectionTrigger detectionTrigger = setaccentcolorifpresentandsupportedlambda10.serializer;
        String str = setaccentcolorifpresentandsupportedlambda10.IconCompatParcelizer;
        Map map = setaccentcolorifpresentandsupportedlambda10.RemoteActionCompatParcelizer;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda2 = setaccentcolorifpresentandsupportedlambda10.read;
        Byte b = setaccentcolorifpresentandsupportedlambda10.MediaSessionCompatQueueItem;
        setsoundifpresentandsupportedlambda2.getClass();
        TransportMode transportModeWrite = setSoundIfPresentAndSupportedlambda1.write(b);
        setsoundifpresentandsupportedlambda1.getClass();
        O$b o$b = new O$b();
        o$b.write = Long.valueOf(j);
        if (detectionTrigger == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'trip_open_trigger' cannot be null");
            return null;
        }
        o$b.RemoteActionCompatParcelizer = detectionTrigger;
        o$b.IconCompatParcelizer = Byte.valueOf(detectionTrigger == DetectionTrigger.EXTERNAL ? (byte) 2 : (byte) 1);
        o$b.serializer = transportModeWrite;
        o$b.read = map;
        r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 r8lambdasscpazklpwhzf7qziwqx9zu4wp4MediaDescriptionCompat = o$b.MediaDescriptionCompat();
        r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
        r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = r8lambdasscpazklpwhzf7qziwqx9zu4wp4MediaDescriptionCompat;
        setContentCardsUnreadVisualIndicatorEnabled setcontentcardsunreadvisualindicatorenabledRatingCompat = r8lambdayc78smgbbb6fudfjq0u5z3_ls.RatingCompat();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer(str);
        iOParser$Decoder.read = setcontentcardsunreadvisualindicatorenabledRatingCompat;
        return new Pair(setsoundifpresentandsupportedlambda1.write(iOParser$Decoder.MediaDescriptionCompat(), Long.valueOf(j)), new setCategoryIfPresentAndSupportedlambda1(setaccentcolorifpresentandsupportedlambda10.write, setaccentcolorifpresentandsupportedlambda10.IconCompatParcelizer));
    }

    public static int read() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 7653665;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        serializer = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
