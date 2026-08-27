package o;

/* JADX INFO: loaded from: classes.dex */
public interface obtainAndroidColorSpace {
    void IconCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0);

    default void RemoteActionCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        IconCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0);
    }

    void read();

    void serializer();

    void serializer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0);

    void write(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0);
}
