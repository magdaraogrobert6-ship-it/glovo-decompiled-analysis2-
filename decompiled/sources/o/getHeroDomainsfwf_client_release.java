package o;

import java.io.InputStream;
import org.tukaani.xz.SimpleInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getHeroDomainsfwf_client_release extends getOfflineModefwf_client_release {
    public final /* synthetic */ int serializer;

    public /* synthetic */ getHeroDomainsfwf_client_release(int i) {
        this.serializer = i;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }

    @Override // o.getOfflineModefwf_client_release
    public final InputStream write(InputStream inputStream, getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release) {
        int i = this.serializer;
        if (i == 0) {
            getVariationsdefault getvariationsdefault = new getVariationsdefault(0);
            getvariationsdefault.read = 8;
            return new SimpleInputStream(inputStream, getvariationsdefault);
        }
        if (i == 1) {
            getVariationsdefault getvariationsdefault2 = new getVariationsdefault(2);
            getvariationsdefault2.read = 4;
            return new SimpleInputStream(inputStream, getvariationsdefault2);
        }
        if (i == 2) {
            getVariationsdefault getvariationsdefault3 = new getVariationsdefault(1);
            getvariationsdefault3.read = 0;
            return new SimpleInputStream(inputStream, getvariationsdefault3);
        }
        if (i == 3) {
            getVariationsdefault getvariationsdefault4 = new getVariationsdefault(3);
            getvariationsdefault4.read = 0;
            return new SimpleInputStream(inputStream, getvariationsdefault4);
        }
        if (i == 4) {
            getVariationsdefault getvariationsdefault5 = new getVariationsdefault(4);
            getvariationsdefault5.read = 0;
            return new SimpleInputStream(inputStream, getvariationsdefault5);
        }
        getVariation getvariation = new getVariation();
        getvariation.IconCompatParcelizer = 0;
        getvariation.write = 5;
        return new SimpleInputStream(inputStream, getvariation);
    }
}
