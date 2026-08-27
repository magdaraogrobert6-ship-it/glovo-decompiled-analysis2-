package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getShowDividers implements obtainShadowContext {
    public final /* synthetic */ setBaselineAligned read;

    public /* synthetic */ getShowDividers(setBaselineAligned setbaselinealigned) {
        this.read = setbaselinealigned;
    }

    public void RemoteActionCompatParcelizer() {
        setBaselineAligned setbaselinealigned = this.read;
        synchronized (setbaselinealigned.MediaSessionCompatResultReceiverWrapper) {
            if (setbaselinealigned.MediaSessionCompatToken == setHorizontalGravity.OPENED) {
                setbaselinealigned.write(setbaselinealigned.PlaybackStateCompat);
            }
        }
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        String str;
        setBaselineAligned setbaselinealigned = this.read;
        synchronized (setbaselinealigned.MediaSessionCompatResultReceiverWrapper) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("Release completer expected to be null", setbaselinealigned.MediaDescriptionCompat == null);
            setbaselinealigned.MediaDescriptionCompat = ondrawwithcontent;
            str = "Release[session=" + setbaselinealigned + "]";
        }
        return str;
    }
}
