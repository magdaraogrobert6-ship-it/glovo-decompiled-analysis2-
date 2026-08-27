package o;

import com.huawei.location.logic.zp;
import java.io.IOException;
import org.bouncycastle.asn1.BERTaggedObjectParser;

/* JADX INFO: loaded from: classes4.dex */
public final class updateChatConfigurationToDataStore extends BERTaggedObjectParser {
    public final boolean write;

    public updateChatConfigurationToDataStore(int i, int i2, boolean z, zp zpVar) {
        super(i, i2, zpVar);
        this.write = z;
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, o.PhoneCallType
    public final provideRequest write() throws IOException {
        boolean z = this.write;
        zp zpVar = this.read;
        int i = this.serializer;
        int i2 = this.IconCompatParcelizer;
        if (!z) {
            return new getBackendNamecustomerchat_release(4, i, i2, new UrlBuilderKt(((writeSelf) ((getcachedSerializer) zpVar.serializer)).RemoteActionCompatParcelizer(), 0), 0);
        }
        extractTokenFromHeader extracttokenfromheaderRemoteActionCompatParcelizer = zpVar.RemoteActionCompatParcelizer();
        if (extracttokenfromheaderRemoteActionCompatParcelizer.RemoteActionCompatParcelizer == 1) {
            return new getBackendNamecustomerchat_release(3, i, i2, extracttokenfromheaderRemoteActionCompatParcelizer.read(0), 0);
        }
        return new getBackendNamecustomerchat_release(4, i, i2, DialogUtilsExternalSyntheticLambda0.write(extracttokenfromheaderRemoteActionCompatParcelizer), 0);
    }
}
