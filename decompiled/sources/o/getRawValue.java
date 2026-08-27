package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getRawValue extends FoodoraCodReasonCompanion {
    public final getHeroDomainsfwf_client_release read;

    public getRawValue(getHeroDomainsfwf_client_release getherodomainsfwf_client_release) {
        super(new Class[0]);
        this.read = getherodomainsfwf_client_release;
    }

    @Override // o.FoodoraCodReasonCompanion
    public final InputStream write(String str, InputStream inputStream, long j, FoodoraSwitchWrongException foodoraSwitchWrongException, byte[] bArr, int i) throws IOException {
        try {
            getHeroDomainsfwf_client_release getherodomainsfwf_client_release = this.read;
            getherodomainsfwf_client_release.getClass();
            return getherodomainsfwf_client_release.write(inputStream, getFeaturesExpirationTimefwf_client_release.write);
        } catch (AssertionError e) {
            throw new IOException(ff$$ExternalSyntheticOutline0.m("BCJ filter used in ", str, " needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z"), e);
        }
    }
}
