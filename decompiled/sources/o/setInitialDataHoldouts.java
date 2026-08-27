package o;

import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class setInitialDataHoldouts implements FwFClientExtensionKtgetVariationsevalResults1 {
    public final Object IconCompatParcelizer;
    public final Cloneable write;

    @Override // o.FwFClientExtensionKtgetVariationsevalResults1
    public void onFailure(syncCustomerProfile synccustomerprofile, Throwable th) {
        ((accessgetRepeatAfterp) this.write).read.execute(new j$$ExternalSyntheticLambda1(this, (FwFClientExtensionKtgetVariationsevalResults1) this.IconCompatParcelizer, th, 15));
    }

    @Override // o.FwFClientExtensionKtgetVariationsevalResults1
    public void onResponse(syncCustomerProfile synccustomerprofile, getHoldoutVariationName getholdoutvariationname) {
        ((accessgetRepeatAfterp) this.write).read.execute(new j$$ExternalSyntheticLambda1(this, (FwFClientExtensionKtgetVariationsevalResults1) this.IconCompatParcelizer, getholdoutvariationname, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setInitialDataHoldouts(byte[] bArr, byte[] bArr2) {
        this.IconCompatParcelizer = bArr;
        this.write = bArr2;
    }

    public setInitialDataHoldouts(accessgetRepeatAfterp accessgetrepeatafterp, FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        this.write = accessgetrepeatafterp;
        this.IconCompatParcelizer = fwFClientExtensionKtgetVariationsevalResults1;
    }
}
