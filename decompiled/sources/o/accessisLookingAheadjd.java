package o;

/* JADX INFO: loaded from: classes2.dex */
public enum accessisLookingAheadjd {
    STORAGE(MeasureScope.AD_STORAGE, MeasureScope.ANALYTICS_STORAGE),
    DMA(MeasureScope.AD_USER_DATA);

    private final MeasureScope[] zzc;

    public final MeasureScope[] zza() {
        return this.zzc;
    }

    public final /* synthetic */ MeasureScope[] zzb() {
        return this.zzc;
    }

    accessisLookingAheadjd(MeasureScope... measureScopeArr) {
        this.zzc = measureScopeArr;
    }
}
