package o;

import android.view.Surface;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import java.util.Map;
import kotlinx.coroutines.channels.ProducerCoroutine;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class snapTo implements FocusOwnerImplmodifier1 {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ snapTo(int i, Object obj) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.FocusOwnerImplmodifier1
    public final void accept(Object obj) {
        int i = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = (r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) obj2;
            getContentInsetLeft getcontentinsetleft = (getContentInsetLeft) obj;
            getcontentinsetleft.IconCompatParcelizer.hashCode();
            setInflatedId.IconCompatParcelizer(3, "VideoEncoderSession");
            Surface surface = getcontentinsetleft.IconCompatParcelizer;
            if (surface != ((Surface) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatQueueItem)) {
                surface.release();
                return;
            }
            r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatQueueItem = null;
            ((onDrawWithContent) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.ParcelableVolumeInfo).RemoteActionCompatParcelizer((androidx.camera.video.internal.encoder.EncoderImpl) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RemoteActionCompatParcelizer);
            r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer();
            return;
        }
        if (i == 1) {
            getCollapseContentDescription getcollapsecontentdescription = (getCollapseContentDescription) obj;
            for (Map.Entry entry : ((Map) obj2).entrySet()) {
                int i2 = getcollapsecontentdescription.IconCompatParcelizer - ((setMaxCardElevation) entry.getKey()).read;
                if (((setMaxCardElevation) entry.getKey()).MediaMetadataCompat) {
                    i2 = -i2;
                }
                int iRemoteActionCompatParcelizer = MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer(i2);
                setBrightness setbrightness = (setBrightness) entry.getValue();
                setbrightness.getClass();
                PrematureEndOfStreamVideoQuirk.write(new ScreenFlashView2(setbrightness, iRemoteActionCompatParcelizer, -1));
            }
            return;
        }
        if (i != 2) {
            if (i == 3) {
                ((onDrawWithContent) obj2).RemoteActionCompatParcelizer((getContentInsetLeft) obj);
                return;
            } else {
                ((ProducerCoroutine) ((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj2)).b_((component160d7_KjU) obj);
                return;
            }
        }
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = (PreviewView$1$$ExternalSyntheticLambda2) obj2;
        setInflatedId.IconCompatParcelizer(3, "SurfaceViewImpl");
        if (previewView$1$$ExternalSyntheticLambda2 != null) {
            previewView$1$$ExternalSyntheticLambda2.serializer();
        }
    }
}
