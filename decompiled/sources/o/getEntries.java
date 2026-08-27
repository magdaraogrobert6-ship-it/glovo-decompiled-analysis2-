package o;

import android.util.Range;
import com.sentiance.okhttp3.u$a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class getEntries implements FocusMeteringAction {
    public final FocusMeteringAction write;

    @Override // o.FocusMeteringAction
    public boolean ComponentActivity() {
        return this.write.ComponentActivity();
    }

    @Override // o.FocusMeteringAction
    public final Object IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // o.FocusMeteringAction
    public final int MediaBrowserCompatMediaItem() {
        return this.write.MediaBrowserCompatMediaItem();
    }

    @Override // o.FocusMeteringAction
    public int MediaDescriptionCompat() {
        return this.write.MediaDescriptionCompat();
    }

    @Override // o.FocusMeteringAction
    public final shutdown MediaMetadataCompat() {
        return this.write.MediaMetadataCompat();
    }

    @Override // o.FocusMeteringAction
    public final android.graphics.Rect MediaSessionCompatQueueItem() {
        return this.write.MediaSessionCompatQueueItem();
    }

    @Override // o.FocusMeteringAction
    public final List MediaSessionCompatResultReceiverWrapper() {
        return this.write.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.FocusMeteringAction
    public final Set MediaSessionCompatToken() {
        return this.write.MediaSessionCompatToken();
    }

    @Override // o.FocusMeteringAction
    public final PreviewGreenTintQuirk ParcelableVolumeInfo() {
        return this.write.ParcelableVolumeInfo();
    }

    @Override // o.FocusMeteringAction
    public final Set PlaybackStateCompat() {
        return this.write.PlaybackStateCompat();
    }

    @Override // o.FocusMeteringAction
    public accessunregisterComponentCallback PlaybackStateCompatCustomAction() {
        return this.write.PlaybackStateCompatCustomAction();
    }

    @Override // o.FocusMeteringAction
    public final String RatingCompat() {
        return this.write.RatingCompat();
    }

    @Override // o.FocusMeteringAction
    public final List RemoteActionCompatParcelizer(Range range) {
        return this.write.RemoteActionCompatParcelizer(range);
    }

    @Override // o.FocusMeteringAction
    public final Set RemoteActionCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // o.FocusMeteringAction
    public final void RemoteActionCompatParcelizer(StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk) {
        this.write.RemoteActionCompatParcelizer(stillCaptureFlashStopRepeatingQuirk);
    }

    @Override // o.FocusMeteringAction
    public accessunregisterComponentCallback ResultReceiver() {
        return this.write.ResultReceiver();
    }

    @Override // o.FocusMeteringAction
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return this.write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    @Override // o.FocusMeteringAction
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return this.write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
    }

    @Override // o.FocusMeteringAction
    public FocusMeteringAction r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return this.write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
    }

    @Override // o.FocusMeteringAction
    public String read() {
        return this.write.read();
    }

    @Override // o.FocusMeteringAction
    public final u$a serializer() {
        return this.write.serializer();
    }

    @Override // o.FocusMeteringAction
    public final List serializer(int i) {
        return this.write.serializer(i);
    }

    @Override // o.FocusMeteringAction
    public final void serializer(androidx.transition.TransitionValuesMaps transitionValuesMaps) {
        this.write.serializer(transitionValuesMaps);
    }

    @Override // o.FocusMeteringAction
    public final void serializer(Executor executor, AbstractClickableNodeonPointerEvent1 abstractClickableNodeonPointerEvent1) {
        this.write.serializer(executor, abstractClickableNodeonPointerEvent1);
    }

    @Override // o.FocusMeteringAction
    public final accessunregisterComponentCallback write() {
        return this.write.write();
    }

    public getEntries(FocusMeteringAction focusMeteringAction) {
        this.write = focusMeteringAction;
    }

    @Override // o.FocusMeteringAction
    public int RemoteActionCompatParcelizer(int i) {
        return this.write.RemoteActionCompatParcelizer(i);
    }
}
