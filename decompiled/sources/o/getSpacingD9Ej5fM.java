package o;

/* JADX INFO: loaded from: classes.dex */
public final class getSpacingD9Ej5fM extends AspectRatioNode {
    public getSpacingD9Ej5fM() {
    }

    @Override // o.AspectRatioNode
    public final AspectRatioKt IconCompatParcelizer(Object obj) {
        return new AspectRatioKt(obj);
    }

    @Override // o.AspectRatioNode
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final AspectRatioKt read(int i, Object obj) {
        AspectRatioKt aspectRatioKt = new AspectRatioKt(obj);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(i, aspectRatioKt);
        return aspectRatioKt;
    }

    public getSpacingD9Ej5fM(int i) {
    }
}
