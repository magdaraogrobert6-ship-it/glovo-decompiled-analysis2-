package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getCustomLocationProviderNames extends r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 {
    public final int IconCompatParcelizer;
    public final boolean read;
    public final int serializer;
    public final /* synthetic */ getGenericEnumSetFromStringSet write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCustomLocationProviderNames(getGenericEnumSetFromStringSet getgenericenumsetfromstringset, int i, int i2) {
        super("OkHttp %s ping %08x%08x", getgenericenumsetfromstringset.ParcelableVolumeInfo, Integer.valueOf(i), Integer.valueOf(i2));
        this.write = getgenericenumsetfromstringset;
        this.read = true;
        this.serializer = i;
        this.IconCompatParcelizer = i2;
    }

    @Override // o.r8lambda0S3kvX2wuurB_sOm2dk25CPetL8
    public final void RemoteActionCompatParcelizer() {
        getGenericEnumSetFromStringSet getgenericenumsetfromstringset = this.write;
        boolean z = this.read;
        try {
            getgenericenumsetfromstringset.write.read(this.serializer, this.IconCompatParcelizer, z);
        } catch (IOException unused) {
            getgenericenumsetfromstringset.RemoteActionCompatParcelizer();
        }
    }
}
