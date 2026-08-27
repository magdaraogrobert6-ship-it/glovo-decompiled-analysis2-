package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvTerrestrialAnalogcp extends accessgetTvTerrestrialDigitalcp {
    public final accessgetTvSatellitecp IconCompatParcelizer;

    public /* synthetic */ accessgetTvTerrestrialAnalogcp(accessgetTvSatellitecp accessgettvsatellitecp) {
        super(null, null, false);
        this.IconCompatParcelizer = accessgettvsatellitecp;
    }

    @Override // o.accessgetTvTerrestrialDigitalcp
    public final void IconCompatParcelizer() {
        try {
            this.IconCompatParcelizer.call();
        } catch (Exception e) {
            DrawableTransformation.read((Throwable) e);
        }
    }
}
