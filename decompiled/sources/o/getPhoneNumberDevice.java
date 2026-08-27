package o;

import androidx.compose.runtime.GapComposer$CompositionContextImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getPhoneNumberDevice implements updateBuffersOnDisappeared {
    public final GapComposer$CompositionContextImpl serializer;

    @Override // o.updateBuffersOnDisappeared
    public final void onRemembered() {
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onAbandoned() {
        this.serializer.MediaSessionCompatToken();
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onForgotten() {
        this.serializer.MediaSessionCompatToken();
    }

    public getPhoneNumberDevice(GapComposer$CompositionContextImpl gapComposer$CompositionContextImpl) {
        this.serializer = gapComposer$CompositionContextImpl;
    }
}
