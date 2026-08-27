package o;

/* JADX INFO: loaded from: classes2.dex */
public final class GraphicsLayerImplCompanion implements drawLayer, applyClip {
    public final /* synthetic */ drawLayer IconCompatParcelizer;
    public final /* synthetic */ applyClip write;

    @Override // o.applyClip
    public final getAnyChangeConsumedimpl RemoteActionCompatParcelizer(String str) {
        return this.write.RemoteActionCompatParcelizer(str);
    }

    @Override // o.drawLayer
    public final Object cacheGalleryImage(String str, ShortNewsContentCardView shortNewsContentCardView) {
        return this.IconCompatParcelizer.cacheGalleryImage(str, shortNewsContentCardView);
    }

    public GraphicsLayerImplCompanion(drawLayer drawlayer, applyClip applyclip) {
        this.IconCompatParcelizer = drawlayer;
        this.write = applyclip;
    }
}
