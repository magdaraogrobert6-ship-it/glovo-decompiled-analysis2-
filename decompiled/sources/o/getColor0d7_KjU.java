package o;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public final class getColor0d7_KjU extends getBrush {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public int write;

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

    public getColor0d7_KjU(long j, getFontScale getfontscale, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(j, getfontscale);
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = 1;
    }

    @Override // o.getBrush
    public final void IconCompatParcelizer() {
        this.write++;
    }

    @Override // o.getBrush
    public final void RemoteActionCompatParcelizer() {
        int i = this.write - 1;
        this.write = i;
        if (i == 0) {
            MediaSessionCompatResultReceiverWrapper();
        }
    }

    @Override // o.getBrush
    public final void serializer() {
        if (this.MediaSessionCompatToken) {
            return;
        }
        RemoteActionCompatParcelizer();
        this.MediaSessionCompatToken = true;
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            ComponentActivity();
        }
    }

    @Override // o.getBrush
    public final getBrush read(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        getOffsetF1C5BW0.read(this);
        return new getAlpha(this.ResultReceiver, this.PlaybackStateCompat, getOffsetF1C5BW0.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this.read, true), this);
    }

    @Override // o.getBrush
    public final void IconCompatParcelizer(blur1fqSgw blur1fqsgw) {
        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = getOffsetF1C5BW0.RemoteActionCompatParcelizer;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }
}
