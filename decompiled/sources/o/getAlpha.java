package o;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public final class getAlpha extends getBrush {
    public final getBrush IconCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;

    @Override // o.getBrush
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem() {
        return this.read;
    }

    @Override // o.getBrush
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM ParcelableVolumeInfo() {
        return null;
    }

    @Override // o.getBrush
    public final boolean PlaybackStateCompat() {
        return true;
    }

    @Override // o.getBrush
    public final void read() {
    }

    @Override // o.getBrush
    public final getBrush read(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new getAlpha(this.ResultReceiver, this.PlaybackStateCompat, getOffsetF1C5BW0.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this.read, true), this.IconCompatParcelizer);
    }

    @Override // o.getBrush
    public final void serializer() {
        getBrush getbrush = this.IconCompatParcelizer;
        if (this.MediaSessionCompatToken) {
            return;
        }
        if (this.ResultReceiver != getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
            MediaSessionCompatResultReceiverWrapper();
        }
        getbrush.RemoteActionCompatParcelizer();
        this.MediaSessionCompatToken = true;
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            ComponentActivity();
        }
    }

    public getAlpha(long j, getFontScale getfontscale, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBrush getbrush) {
        super(j, getfontscale);
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = getbrush;
        getbrush.IconCompatParcelizer();
    }

    @Override // o.getBrush
    public final void IconCompatParcelizer() {
        setOffsetk4lQ0M.read();
        throw null;
    }

    @Override // o.getBrush
    public final void RemoteActionCompatParcelizer() {
        setOffsetk4lQ0M.read();
        throw null;
    }

    @Override // o.getBrush
    public final void IconCompatParcelizer(blur1fqSgw blur1fqsgw) {
        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = getOffsetF1C5BW0.RemoteActionCompatParcelizer;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }
}
