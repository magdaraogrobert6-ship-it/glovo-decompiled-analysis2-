package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cancelAutofillForNode implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getTextValue read;
    public final /* synthetic */ cancelPendingWebViewPauselambda0 serializer;

    public /* synthetic */ cancelAutofillForNode(getTextValue gettextvalue, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, int i) {
        this.IconCompatParcelizer = i;
        this.read = gettextvalue;
        this.serializer = cancelpendingwebviewpauselambda0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = this.serializer;
        getTextValue gettextvalue = this.read;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        if (i != 0) {
            androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState = gettextvalue.serializer;
            ((getContentCaptureSessionui) ((populate) anchoredDraggableState.PlaybackStateCompatCustomAction)).IconCompatParcelizer(fFloatValue);
            ((getContentCaptureSessionui) ((populate) anchoredDraggableState.RatingCompat)).IconCompatParcelizer(fFloatValue2);
            cancelpendingwebviewpauselambda0.write = fFloatValue;
            return createfromparcel;
        }
        androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState2 = gettextvalue.serializer;
        ((getContentCaptureSessionui) ((populate) anchoredDraggableState2.PlaybackStateCompatCustomAction)).IconCompatParcelizer(fFloatValue);
        ((getContentCaptureSessionui) ((populate) anchoredDraggableState2.RatingCompat)).IconCompatParcelizer(fFloatValue2);
        cancelpendingwebviewpauselambda0.write = fFloatValue;
        return createfromparcel;
    }
}
