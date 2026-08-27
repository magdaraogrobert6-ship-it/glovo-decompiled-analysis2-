package org.bouncycastle.asn1;

import com.huawei.location.logic.zp;
import java.io.IOException;
import o.PhoneCallType;
import o.logErrordefault;
import o.provideRequest;

/* JADX INFO: loaded from: classes4.dex */
public class BERTaggedObjectParser implements logErrordefault, PhoneCallType {
    public final int IconCompatParcelizer;
    public final zp read;
    public final int serializer;

    public provideRequest write() {
        return this.read.read(this.serializer, this.IconCompatParcelizer);
    }

    public BERTaggedObjectParser(int i, int i2, zp zpVar) {
        this.serializer = i;
        this.IconCompatParcelizer = i2;
        this.read = zpVar;
    }

    @Override // o.logErrordefault
    public final provideRequest RatingCompat() {
        try {
            return write();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
