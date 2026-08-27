package o;

import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class getListener extends getViewedannotations<r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI> {
    final /* synthetic */ getOpenUriInWebViewannotations serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getListener(getOpenUriInWebViewannotations getopenuriinwebviewannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(getopenuriinwebviewannotations, readandroid_sdk_base_releaseVar);
        this.serializer = getopenuriinwebviewannotations;
    }

    @Override // o.getViewedannotations
    public final List<getImageStyle> serializer(getLongitudeannotations<r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI> getlongitudeannotations) {
        isDismissed isdismissed = this.serializer.ParcelableVolumeInfo;
        long jWrite = getlongitudeannotations.write();
        short sShortValue = getlongitudeannotations.read().write.shortValue();
        r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI r8lambdarsln0n_71nx5fiy5yo7knsgyi = getlongitudeannotations.read();
        String id = r8lambdarsln0n_71nx5fiy5yo7knsgyi.serializer;
        if (id == null) {
            String[] availableIDs = TimeZone.getAvailableIDs((int) TimeUnit.MINUTES.toMillis(r8lambdarsln0n_71nx5fiy5yo7knsgyi.write.shortValue()));
            id = (availableIDs == null || availableIDs.length <= 0) ? TimeZone.getDefault().getID() : availableIDs[0];
        }
        return isdismissed.write(jWrite, sShortValue, id);
    }
}
