package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
final class isBrazePushMessage extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ handlePushStoryPageClickedlambda1 RemoteActionCompatParcelizer;

    public isBrazePushMessage(handlePushStoryPageClickedlambda1 handlepushstorypageclickedlambda1) {
        this.RemoteActionCompatParcelizer = handlepushstorypageclickedlambda1;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        handlePushStoryPageClickedlambda1 handlepushstorypageclickedlambda1 = this.RemoteActionCompatParcelizer;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = handlepushstorypageclickedlambda1.IconCompatParcelizer;
        long j = handlepushstorypageclickedlambda1.serializer;
        String str = handlepushstorypageclickedlambda1.RemoteActionCompatParcelizer;
        setsoundifpresentandsupportedlambda1.getClass();
        BrazeCompanionExternalSyntheticLambda8 brazeCompanionExternalSyntheticLambda8 = new BrazeCompanionExternalSyntheticLambda8();
        brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer = Long.valueOf(j);
        createUriActionFromUrlString createuriactionfromurlstring = new createUriActionFromUrlString(brazeCompanionExternalSyntheticLambda8);
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 3);
        r8lambdadeozq815xuuwmllyyvm_qv79qy.write = createuriactionfromurlstring;
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
