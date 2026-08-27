package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidContentCaptureManagersendContentCaptureAppearEvents1 implements BlurredEdgeTreatmentCompanion, Iterable, displayInAppMessagelambda121 {
    public int IconCompatParcelizer;
    public HashMap MediaBrowserCompatMediaItem;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public boolean PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public animateToWithDecay write;
    public int[] RemoteActionCompatParcelizer = new int[0];
    public Object[] MediaDescriptionCompat = new Object[0];
    public final Object serializer = new Object();
    public ArrayList read = new ArrayList();

    @Override // o.BlurredEdgeTreatmentCompanion
    public final Iterable write() {
        return this;
    }

    public final void read() {
        this.MediaBrowserCompatMediaItem = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new component3(this, 0, this.IconCompatParcelizer);
    }

    public final component4 serializer() {
        if (this.PlaybackStateCompatCustomAction) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot read while a writer is pending");
            return null;
        }
        this.RatingCompat++;
        return new component4(this);
    }

    public final AndroidContentCaptureManagerViewTranslationHelperMethodsExternalSyntheticLambda1 read(int i) {
        int i2;
        ArrayList arrayList;
        int iWrite;
        HashMap map = this.MediaBrowserCompatMediaItem;
        if (map != null) {
            if (this.PlaybackStateCompatCustomAction) {
                getCreditCardExpirationDay.read("use active SlotWriter to crate an anchor for location instead");
            }
            AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = (i < 0 || i >= (i2 = this.IconCompatParcelizer) || (iWrite = AbstractC0170getTimestamp.write((arrayList = this.read), i, i2)) < 0) ? null : (AndroidContentCaptureManagercurrentSemanticsNodes1) arrayList.get(iWrite);
            if (androidContentCaptureManagercurrentSemanticsNodes1 != null) {
                return (AndroidContentCaptureManagerViewTranslationHelperMethodsExternalSyntheticLambda1) map.get(androidContentCaptureManagercurrentSemanticsNodes1);
            }
        }
        return null;
    }

    public final int RemoteActionCompatParcelizer(AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1) {
        if (this.PlaybackStateCompatCustomAction) {
            getCreditCardExpirationDay.read("Use active SlotWriter to determine anchor location instead");
        }
        if (!androidContentCaptureManagercurrentSemanticsNodes1.serializer()) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("Anchor refers to a group that was removed");
        }
        return androidContentCaptureManagercurrentSemanticsNodes1.IconCompatParcelizer;
    }

    public final getType RemoteActionCompatParcelizer() {
        if (this.PlaybackStateCompatCustomAction) {
            getCreditCardExpirationDay.read("Cannot start a writer when another writer is pending");
        }
        if (this.RatingCompat > 0) {
            getCreditCardExpirationDay.read("Cannot start a writer when a reader is pending");
        }
        this.PlaybackStateCompatCustomAction = true;
        this.MediaMetadataCompat++;
        return new getType(this);
    }

    public final boolean write(AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1) {
        int iWrite;
        if (!androidContentCaptureManagercurrentSemanticsNodes1.serializer() || (iWrite = AbstractC0170getTimestamp.write(this.read, androidContentCaptureManagercurrentSemanticsNodes1.IconCompatParcelizer, this.IconCompatParcelizer)) < 0) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read.get(iWrite), androidContentCaptureManagercurrentSemanticsNodes1}, getCieXyz.write())).booleanValue();
    }
}
