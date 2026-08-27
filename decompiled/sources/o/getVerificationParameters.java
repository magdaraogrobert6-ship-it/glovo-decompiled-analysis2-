package o;

import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getVerificationParameters {
    public final isStateSaved IconCompatParcelizer;
    public final getAdRevenueParameters RemoteActionCompatParcelizer;
    public final buildMeasurementConsentPackage read;
    public final buildGdprPackage serializer;
    public final GetRiderStatusImpl write;

    public getVerificationParameters(getAdRevenueParameters getadrevenueparameters, isStateSaved isstatesaved, GetRiderStatusImpl getRiderStatusImpl, buildMeasurementConsentPackage buildmeasurementconsentpackage, buildGdprPackage buildgdprpackage) {
        this.RemoteActionCompatParcelizer = getadrevenueparameters;
        this.IconCompatParcelizer = isstatesaved;
        this.write = getRiderStatusImpl;
        this.read = buildmeasurementconsentpackage;
        this.serializer = buildgdprpackage;
    }
}
