package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
final class isUninstallTrackingPushlambda0 extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ logBaiduNotificationClicklambda0 write;

    public isUninstallTrackingPushlambda0(logBaiduNotificationClicklambda0 logbaidunotificationclicklambda0) {
        this.write = logbaidunotificationclicklambda0;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        logBaiduNotificationClicklambda0 logbaidunotificationclicklambda0 = this.write;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = logbaidunotificationclicklambda0.RemoteActionCompatParcelizer;
        long j = logbaidunotificationclicklambda0.read;
        String str = logbaidunotificationclicklambda0.IconCompatParcelizer;
        byte b = logbaidunotificationclicklambda0.write;
        setsoundifpresentandsupportedlambda1.getClass();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer = Long.valueOf(j);
        iOParser$Decoder.read = Byte.valueOf(b);
        IBrazeDeeplinkHandlerIntentFlagPurpose iBrazeDeeplinkHandlerIntentFlagPurposeMediaMetadataCompat = iOParser$Decoder.MediaMetadataCompat();
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 3);
        r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = iBrazeDeeplinkHandlerIntentFlagPurposeMediaMetadataCompat;
        IBrazeEndpointProvider iBrazeEndpointProvider = r8lambdadeozq815xuuwmllyyvm_qv79qy.read();
        NetworkBody networkBody = new NetworkBody(22);
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'offthegrid_id' cannot be null");
            return null;
        }
        networkBody.IconCompatParcelizer = str;
        networkBody.RemoteActionCompatParcelizer = iBrazeEndpointProvider;
        return new Pair(setsoundifpresentandsupportedlambda1.write(networkBody.IconCompatParcelizer(), Long.valueOf(j)), null);
    }
}
