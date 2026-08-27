package o;

/* JADX INFO: loaded from: classes.dex */
public final class obtainGraphicsLayer extends getGraphicsContext {
    public final /* synthetic */ onDrawBehind MediaSessionCompatQueueItem;

    @Override // o.getGraphicsContext
    public final String serializer() {
        onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.MediaSessionCompatQueueItem.read.get();
        if (ondrawwithcontent == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + ondrawwithcontent.RemoteActionCompatParcelizer + "]";
    }

    public obtainGraphicsLayer(onDrawBehind ondrawbehind) {
        this.MediaSessionCompatQueueItem = ondrawbehind;
    }
}
