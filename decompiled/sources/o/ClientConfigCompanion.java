package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.logic.zp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.DLExternal;

/* JADX INFO: loaded from: classes4.dex */
public final class ClientConfigCompanion implements logErrordefault, PhoneCallType {
    public zp serializer;
    public final /* synthetic */ int write;

    public ClientConfigCompanion(zp zpVar) {
        this.write = 3;
        this.serializer = zpVar;
    }

    public static DLExternal write(zp zpVar) throws ASN1Exception {
        try {
            DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(zpVar.RemoteActionCompatParcelizer(), 0);
            deliveryInfoCompanion.serializer = -1;
            return new DLExternal(deliveryInfoCompanion);
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e, e.getMessage());
        }
    }

    @Override // o.PhoneCallType
    public final provideRequest write() {
        int i = this.write;
        if (i == 0) {
            return DialogUtilsExternalSyntheticLambda0.serializer(this.serializer.RemoteActionCompatParcelizer());
        }
        if (i == 1) {
            return new getMoshiConverter(this.serializer.RemoteActionCompatParcelizer());
        }
        if (i != 2) {
            return i != 3 ? DialogUtilsExternalSyntheticLambda0.write(this.serializer.RemoteActionCompatParcelizer()) : write(this.serializer);
        }
        return new RetrofitBuilderKtcallAdapter2(this.serializer.RemoteActionCompatParcelizer());
    }

    @Override // o.logErrordefault
    public final provideRequest RatingCompat() {
        int i = this.write;
        if (i == 0) {
            try {
                return write();
            } catch (IOException e) {
                throw new ASN1ParsingException(e.getMessage(), e);
            }
        }
        if (i == 1) {
            try {
                return new getMoshiConverter(this.serializer.RemoteActionCompatParcelizer());
            } catch (IOException e2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(e2.getMessage());
                return null;
            }
        }
        if (i == 2) {
            try {
                return new RetrofitBuilderKtcallAdapter2(this.serializer.RemoteActionCompatParcelizer());
            } catch (IOException e3) {
                throw new ASN1ParsingException(e3.getMessage(), e3);
            }
        }
        if (i != 3) {
            try {
                return write();
            } catch (IOException e4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(e4.getMessage());
                return null;
            }
        }
        try {
            return write(this.serializer);
        } catch (IOException e5) {
            throw new ASN1ParsingException("unable to get DER object", e5);
        } catch (IllegalArgumentException e6) {
            throw new ASN1ParsingException("unable to get DER object", e6);
        }
    }

    public /* synthetic */ ClientConfigCompanion(int i) {
        this.write = i;
    }
}
