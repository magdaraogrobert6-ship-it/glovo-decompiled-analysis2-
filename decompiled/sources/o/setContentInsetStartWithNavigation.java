package o;

import android.graphics.RectF;
import android.media.ImageWriter;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class setContentInsetStartWithNavigation implements getSurfaceClass {
    public ByteBuffer ComponentActivity;
    public volatile boolean IconCompatParcelizer;
    public volatile boolean MediaDescriptionCompat;
    public volatile int MediaMetadataCompat;
    public ByteBuffer MediaSessionCompatResultReceiverWrapper;
    public volatile int MediaSessionCompatToken;
    public setContentInsetEndWithActions ParcelableVolumeInfo;
    public AuthPromptFailureException PlaybackStateCompat;
    public ImageWriter PlaybackStateCompatCustomAction;
    public ByteBuffer RemoteActionCompatParcelizer;
    public ByteBuffer ResultReceiver;
    public Executor r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public ByteBuffer r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public ByteBuffer read;
    public volatile int RatingCompat = 1;
    public android.graphics.Rect MediaBrowserCompatMediaItem = new android.graphics.Rect();
    public android.graphics.Rect r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new android.graphics.Rect();
    public android.graphics.Matrix MediaSessionCompatQueueItem = new android.graphics.Matrix();
    public android.graphics.Matrix r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new android.graphics.Matrix();
    public final Object serializer = new Object();
    public boolean write = true;

    public abstract getInflatedId IconCompatParcelizer(getDefaultImageFormat getdefaultimageformat);

    public abstract void RemoteActionCompatParcelizer();

    public abstract void serializer(getInflatedId getinflatedid);

    public final void IconCompatParcelizer(android.graphics.Rect rect) {
        synchronized (this.serializer) {
            this.MediaBrowserCompatMediaItem = rect;
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new android.graphics.Rect(this.MediaBrowserCompatMediaItem);
        }
    }

    public final void read(android.graphics.Matrix matrix) {
        synchronized (this.serializer) {
            this.MediaSessionCompatQueueItem = matrix;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new android.graphics.Matrix(this.MediaSessionCompatQueueItem);
        }
    }

    public final void read(Executor executor, setContentInsetEndWithActions setcontentinsetendwithactions) {
        if (setcontentinsetendwithactions == null) {
            RemoteActionCompatParcelizer();
        }
        synchronized (this.serializer) {
            this.ParcelableVolumeInfo = setcontentinsetendwithactions;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = executor;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    public final DrawModifierNodeKt RemoteActionCompatParcelizer(final getInflatedId getinflatedid) {
        Executor executor;
        final setContentInsetEndWithActions setcontentinsetendwithactions;
        boolean z;
        AuthPromptFailureException authPromptFailureException;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        getCameraXConfig getcameraxconfigSerializer;
        int i = this.MediaDescriptionCompat ? this.MediaSessionCompatToken : 0;
        synchronized (this.serializer) {
            executor = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            setcontentinsetendwithactions = this.ParcelableVolumeInfo;
            z = this.MediaDescriptionCompat && i != this.MediaMetadataCompat;
            if (z) {
                serializer(getinflatedid, i);
            }
            if (this.MediaDescriptionCompat || this.RatingCompat == 3) {
                read(getinflatedid);
            }
            authPromptFailureException = this.PlaybackStateCompat;
            imageWriter = this.PlaybackStateCompatCustomAction;
            byteBuffer = this.MediaSessionCompatResultReceiverWrapper;
            byteBuffer2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            byteBuffer3 = this.ComponentActivity;
            byteBuffer4 = this.ResultReceiver;
            byteBuffer5 = this.read;
            byteBuffer6 = this.RemoteActionCompatParcelizer;
        }
        if (setcontentinsetendwithactions != null && executor != null && this.write) {
            int i2 = this.RatingCompat;
            if (authPromptFailureException != null) {
                if (i2 == 2) {
                    getcameraxconfigSerializer = androidx.camera.core.ImageProcessingUtil.read(getinflatedid, authPromptFailureException, byteBuffer, i, this.IconCompatParcelizer);
                } else if (this.RatingCompat != 1) {
                    getcameraxconfigSerializer = null;
                } else {
                    if (this.IconCompatParcelizer) {
                        androidx.camera.core.ImageProcessingUtil.serializer(getinflatedid);
                    }
                    if (imageWriter == null || byteBuffer2 == null || byteBuffer3 == null || byteBuffer4 == null) {
                        getcameraxconfigSerializer = null;
                    } else {
                        getcameraxconfigSerializer = androidx.camera.core.ImageProcessingUtil.IconCompatParcelizer(getinflatedid, authPromptFailureException, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
            } else if (i2 != 3) {
                getcameraxconfigSerializer = null;
            } else {
                if (this.IconCompatParcelizer) {
                    androidx.camera.core.ImageProcessingUtil.serializer(getinflatedid);
                }
                if (byteBuffer2 == null || byteBuffer3 == null || byteBuffer4 == null || byteBuffer5 == null || byteBuffer6 == null) {
                    getcameraxconfigSerializer = null;
                } else {
                    getcameraxconfigSerializer = androidx.camera.core.ImageProcessingUtil.serializer(getinflatedid, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                }
            }
            boolean z2 = getcameraxconfigSerializer == null;
            final getInflatedId getinflatedid2 = z2 ? getinflatedid : getcameraxconfigSerializer;
            final android.graphics.Rect rect = new android.graphics.Rect();
            final android.graphics.Matrix matrix = new android.graphics.Matrix();
            synchronized (this.serializer) {
                if (z && !z2) {
                    RemoteActionCompatParcelizer(getinflatedid.RatingCompat(), getinflatedid.serializer(), getinflatedid2.RatingCompat(), getinflatedid2.serializer());
                    this.MediaMetadataCompat = i;
                    rect.set(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    matrix.set(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                } else {
                    this.MediaMetadataCompat = i;
                    rect.set(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    matrix.set(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                }
                throw th;
            }
            final onDrawWithContent ondrawwithcontent = new onDrawWithContent();
            ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
            onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
            ondrawwithcontent.read = ondrawbehind;
            ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
            try {
                executor.execute(new Runnable() { // from class: o.setLogoDescription
                    @Override // java.lang.Runnable
                    public final void run() {
                        setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.RemoteActionCompatParcelizer;
                        getInflatedId getinflatedid3 = getinflatedid;
                        android.graphics.Matrix matrix2 = matrix;
                        getInflatedId getinflatedid4 = getinflatedid2;
                        android.graphics.Rect rect2 = rect;
                        setContentInsetEndWithActions setcontentinsetendwithactions2 = setcontentinsetendwithactions;
                        onDrawWithContent ondrawwithcontent2 = ondrawwithcontent;
                        if (!setcontentinsetstartwithnavigation.write) {
                            ondrawwithcontent2.serializer(new androidx.core.os.OperationCanceledException("ImageAnalysis is detached"));
                            return;
                        }
                        FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2 = new FeatureCombinationQueryImplExternalSyntheticLambda2(getinflatedid4, null, new getCollapseIcon(getinflatedid3.read().IconCompatParcelizer(), getinflatedid3.read().serializer(), setcontentinsetstartwithnavigation.MediaDescriptionCompat ? 0 : setcontentinsetstartwithnavigation.MediaSessionCompatToken, matrix2, getinflatedid3.read().RemoteActionCompatParcelizer()));
                        if (!rect2.isEmpty()) {
                            featureCombinationQueryImplExternalSyntheticLambda2.read(rect2);
                        }
                        setcontentinsetendwithactions2.serializer(featureCombinationQueryImplExternalSyntheticLambda2);
                        ondrawwithcontent2.RemoteActionCompatParcelizer(null);
                    }
                });
                ondrawwithcontent.RemoteActionCompatParcelizer = "analyzeImage";
                return ondrawbehind;
            } catch (Exception e) {
                ondrawbehind.write(e);
                return ondrawbehind;
            }
        }
        return new EncoderImplMediaCodecCallback(0, new androidx.core.os.OperationCanceledException("No analyzer or executor currently set."));
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        int i5 = this.MediaSessionCompatToken;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer;
            android.graphics.Matrix.ScaleToFit scaleToFit = android.graphics.Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.MediaBrowserCompatMediaItem);
        matrix.mapRect(rectF4);
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF4.round(rect);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = rect;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setConcat(this.MediaSessionCompatQueueItem, matrix);
    }

    public final void serializer(getInflatedId getinflatedid, int i) {
        AuthPromptFailureException authPromptFailureException = this.PlaybackStateCompat;
        if (authPromptFailureException == null) {
            return;
        }
        authPromptFailureException.MediaSessionCompatQueueItem();
        int iRatingCompat = getinflatedid.RatingCompat();
        int iSerializer = getinflatedid.serializer();
        int iMediaBrowserCompatMediaItem = this.PlaybackStateCompat.MediaBrowserCompatMediaItem();
        int iMediaMetadataCompat = this.PlaybackStateCompat.MediaMetadataCompat();
        boolean z = i == 90 || i == 270;
        int i2 = z ? iSerializer : iRatingCompat;
        if (!z) {
            iRatingCompat = iSerializer;
        }
        this.PlaybackStateCompat = new AuthPromptFailureException(r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA.IconCompatParcelizer(i2, iRatingCompat, iMediaBrowserCompatMediaItem, iMediaMetadataCompat));
        if (this.RatingCompat == 1) {
            ImageWriter imageWriter = this.PlaybackStateCompatCustomAction;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.PlaybackStateCompatCustomAction = ImageWriter.newInstance(this.PlaybackStateCompat.RatingCompat(), this.PlaybackStateCompat.MediaMetadataCompat());
        }
    }

    @Override // o.getSurfaceClass
    public final void RemoteActionCompatParcelizer(getDefaultImageFormat getdefaultimageformat) {
        try {
            getInflatedId getinflatedidIconCompatParcelizer = IconCompatParcelizer(getdefaultimageformat);
            if (getinflatedidIconCompatParcelizer != null) {
                serializer(getinflatedidIconCompatParcelizer);
            }
        } catch (IllegalStateException e) {
            setInflatedId.read("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public final void read(getInflatedId getinflatedid) {
        if (this.RatingCompat != 1 && this.RatingCompat != 3) {
            if (this.RatingCompat == 2 && this.MediaSessionCompatResultReceiverWrapper == null) {
                this.MediaSessionCompatResultReceiverWrapper = ByteBuffer.allocateDirect(getinflatedid.serializer() * getinflatedid.RatingCompat() * 4);
                return;
            }
            return;
        }
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = ByteBuffer.allocateDirect(getinflatedid.serializer() * getinflatedid.RatingCompat());
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.position(0);
        if (this.ComponentActivity == null) {
            this.ComponentActivity = ByteBuffer.allocateDirect((getinflatedid.serializer() * getinflatedid.RatingCompat()) / 4);
        }
        this.ComponentActivity.position(0);
        if (this.ResultReceiver == null) {
            this.ResultReceiver = ByteBuffer.allocateDirect((getinflatedid.serializer() * getinflatedid.RatingCompat()) / 4);
        }
        this.ResultReceiver.position(0);
        if (this.RatingCompat == 3) {
            if (this.read == null) {
                this.read = ByteBuffer.allocateDirect(getinflatedid.serializer() * getinflatedid.RatingCompat());
            }
            this.read.position(0);
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = ByteBuffer.allocateDirect((getinflatedid.serializer() * getinflatedid.RatingCompat()) / 2);
            }
            this.RemoteActionCompatParcelizer.position(0);
        }
    }
}
