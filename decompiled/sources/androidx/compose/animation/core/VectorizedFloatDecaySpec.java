package androidx.compose.animation.core;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.voice.api.VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
import com.mapbox.navigation.voice.model.SpeechAnnouncement;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.emit;
import o.getPersonFullName;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class VectorizedFloatDecaySpec {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public float serializer;
    public final Object write;

    public VectorizedFloatDecaySpec() {
        this.write = CompositionKt.read(0);
        this.IconCompatParcelizer = CompositionKt.read(0);
        this.read = CompositionKt.read(0);
        this.serializer = 20.0f;
        this.RemoteActionCompatParcelizer = getPersonFullName.RemoteActionCompatParcelizer(0.0f);
    }

    public void donePlaying(MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        if (mediaPlayer != null) {
            int i2 = RatingCompat + 51;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            mediaPlayer.release();
        }
        this.IconCompatParcelizer = null;
        SpeechAnnouncement speechAnnouncement = (SpeechAnnouncement) this.RemoteActionCompatParcelizer;
        if (speechAnnouncement != null) {
            int i4 = MediaBrowserCompatMediaItem + 11;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.RemoteActionCompatParcelizer = null;
            MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4 = (MapboxNavigation$$ExternalSyntheticLambda4) this.read;
            if (mapboxNavigation$$ExternalSyntheticLambda4 != null) {
                mapboxNavigation$$ExternalSyntheticLambda4.onDone(speechAnnouncement);
            }
        }
        int i6 = RatingCompat + 83;
        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public VectorizedFloatDecaySpec(Context context, VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes voiceInstructionsPlayerAttributes$OreoAndLaterAttributes) {
        this.write = voiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
        this.serializer = 1.0f;
    }

    public VectorizedFloatDecaySpec(emit emitVar) {
        this.write = emitVar;
        this.serializer = emitVar.write();
    }

    public TransformGestureDetectorKtdetectTransformGestures2 IconCompatParcelizer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 27;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (((TransformGestureDetectorKtdetectTransformGestures2) this.read) == null) {
            this.read = transformGestureDetectorKtdetectTransformGestures2.RemoteActionCompatParcelizer();
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4 = (TransformGestureDetectorKtdetectTransformGestures2) this.read;
        if (transformGestureDetectorKtdetectTransformGestures4 == null) {
            removeNodeAtDepth.serializer("velocityVector");
            throw null;
        }
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures4.IconCompatParcelizer();
        int i3 = RatingCompat + 89;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = (TransformGestureDetectorKtdetectTransformGestures2) this.read;
            if (i5 >= iIconCompatParcelizer) {
                if (transformGestureDetectorKtdetectTransformGestures5 != null) {
                    return transformGestureDetectorKtdetectTransformGestures5;
                }
                removeNodeAtDepth.serializer("velocityVector");
                throw null;
            }
            int i6 = MediaBrowserCompatMediaItem + 35;
            RatingCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (transformGestureDetectorKtdetectTransformGestures5 == null) {
                removeNodeAtDepth.serializer("velocityVector");
                throw null;
            }
            emit emitVar = (emit) this.write;
            transformGestureDetectorKtdetectTransformGestures2.getClass();
            transformGestureDetectorKtdetectTransformGestures5.write(emitVar.IconCompatParcelizer(transformGestureDetectorKtdetectTransformGestures3.write(i5), j), i5);
            i5++;
        }
    }

    public TransformGestureDetectorKtdetectTransformGestures2 serializer(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3) {
        int iIconCompatParcelizer;
        int i;
        int i2 = 2 % 2;
        if (((TransformGestureDetectorKtdetectTransformGestures2) this.RemoteActionCompatParcelizer) == null) {
            int i3 = MediaBrowserCompatMediaItem + 105;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.RemoteActionCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.RemoteActionCompatParcelizer();
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4 = (TransformGestureDetectorKtdetectTransformGestures2) this.RemoteActionCompatParcelizer;
        if (transformGestureDetectorKtdetectTransformGestures4 == null) {
            removeNodeAtDepth.serializer("targetVector");
            throw null;
        }
        int i5 = MediaBrowserCompatMediaItem + 59;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures4.IconCompatParcelizer();
            i = 1;
        } else {
            iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures4.IconCompatParcelizer();
            i = 0;
        }
        while (true) {
            TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = (TransformGestureDetectorKtdetectTransformGestures2) this.RemoteActionCompatParcelizer;
            if (i >= iIconCompatParcelizer) {
                if (transformGestureDetectorKtdetectTransformGestures5 != null) {
                    return transformGestureDetectorKtdetectTransformGestures5;
                }
                removeNodeAtDepth.serializer("targetVector");
                throw null;
            }
            if (transformGestureDetectorKtdetectTransformGestures5 == null) {
                removeNodeAtDepth.serializer("targetVector");
                throw null;
            }
            int i6 = MediaBrowserCompatMediaItem + 101;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            transformGestureDetectorKtdetectTransformGestures5.write(((emit) this.write).write(transformGestureDetectorKtdetectTransformGestures2.write(i), transformGestureDetectorKtdetectTransformGestures3.write(i)), i);
            i++;
        }
    }
}
