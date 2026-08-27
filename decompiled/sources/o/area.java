package o;

import android.util.Log;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class area {
    public static final boolean serializer = Log.isLoggable("Engine", 2);
    public final resizeGraphicFrameIfAppropriate IconCompatParcelizer;
    public final setRoundRectOutlineTNW_H78default MediaBrowserCompatMediaItem;
    public final generateOetflambda0 MediaDescriptionCompat;
    public final truncslo4al4 MediaMetadataCompat;
    public final ImageLoader$Builder RemoteActionCompatParcelizer;
    public final androidx.work.impl.WorkerWrapper.Builder read;
    public final WhitePoint write;

    public final void IconCompatParcelizer(eotfFunclambda0 eotffunclambda0, generateEotflambda0 generateeotflambda0) {
        ImageLoader$Builder imageLoader$Builder = this.RemoteActionCompatParcelizer;
        synchronized (imageLoader$Builder) {
            r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A r8lambdaboxpaykq1hl7y9ngvej_riduf1a = (r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A) ((HashMap) imageLoader$Builder.IconCompatParcelizer).remove(eotffunclambda0);
            if (r8lambdaboxpaykq1hl7y9ngvej_riduf1a != null) {
                r8lambdaboxpaykq1hl7y9ngvej_riduf1a.RemoteActionCompatParcelizer();
            }
        }
        if (generateeotflambda0.read()) {
        } else {
            this.MediaMetadataCompat.read(generateeotflambda0, false);
        }
    }

    public final androidx.navigation.NavArgsLazy write(accessgetPerceptualcp accessgetperceptualcp, Object obj, eotfFunclambda0 eotffunclambda0, int i, int i2, Class cls, Class cls2, RenderIntentCompanion renderIntentCompanion, accessisWideGamut accessiswidegamut, DrawStyle drawStyle, boolean z, boolean z2, getEotfFuncui_graphics geteotffuncui_graphics, boolean z3, boolean z4, com.bumptech.glide.request.SingleRequest singleRequest, accessgetSubCompositionViewjd accessgetsubcompositionviewjd) {
        long j = serializer ? Stroke.read() : 0L;
        this.MediaBrowserCompatMediaItem.getClass();
        generateEotf generateeotf = new generateEotf(obj, eotffunclambda0, i, i2, drawStyle, cls, cls2, geteotffuncui_graphics);
        synchronized (this) {
            generateEotflambda0 generateeotflambda0RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(generateeotf, z3, j);
            if (generateeotflambda0RemoteActionCompatParcelizer == null) {
                return IconCompatParcelizer(accessgetperceptualcp, obj, eotffunclambda0, i, i2, cls, cls2, renderIntentCompanion, accessiswidegamut, drawStyle, z, z2, geteotffuncui_graphics, z3, z4, singleRequest, accessgetsubcompositionviewjd, generateeotf, j);
            }
            singleRequest.write(generateeotflambda0RemoteActionCompatParcelizer, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.MEMORY_CACHE);
            return null;
        }
    }

    public area(WhitePoint whitePoint, coil3.memory.MemoryCacheService memoryCacheService, clamp clampVar, clamp clampVar2, clamp clampVar3, clamp clampVar4) {
        this.write = whitePoint;
        scale0AR0LA0default scale0ar0la0default = new scale0AR0LA0default(memoryCacheService);
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(8);
        this.RemoteActionCompatParcelizer = imageLoader$Builder;
        synchronized (this) {
            synchronized (imageLoader$Builder) {
                imageLoader$Builder.serializer = this;
            }
        }
        this.MediaBrowserCompatMediaItem = new setRoundRectOutlineTNW_H78default(6);
        this.MediaDescriptionCompat = new generateOetflambda0(0);
        this.read = new androidx.work.impl.WorkerWrapper.Builder(clampVar, clampVar2, clampVar3, clampVar4, this, this);
        this.IconCompatParcelizer = new resizeGraphicFrameIfAppropriate(scale0ar0la0default);
        this.MediaMetadataCompat = new truncslo4al4();
        whitePoint.write = this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x000e, B:10:0x001f), top: B:16:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public final void write(accessisSrgb accessissrgb, generateEotf generateeotf, generateEotflambda0 generateeotflambda0) {
        HashMap map;
        synchronized (this) {
            if (generateeotflambda0 != null) {
                if (generateeotflambda0.read()) {
                    this.RemoteActionCompatParcelizer.serializer(generateeotf, generateeotflambda0);
                }
                generateOetflambda0 generateoetflambda0 = this.MediaDescriptionCompat;
                generateoetflambda0.getClass();
                accessissrgb.getClass();
                map = generateoetflambda0.serializer;
                if (accessissrgb != map.get(generateeotf)) {
                    map.remove(generateeotf);
                }
            } else {
                generateOetflambda0 generateoetflambda1 = this.MediaDescriptionCompat;
                generateoetflambda1.getClass();
                accessissrgb.getClass();
                map = generateoetflambda1.serializer;
                if (accessissrgb != map.get(generateeotf)) {
                    map.remove(generateeotf);
                }
            }
            throw th;
        }
    }

    public static void RemoteActionCompatParcelizer(generateOetf generateoetf) {
        if (generateoetf instanceof generateEotflambda0) {
            ((generateEotflambda0) generateoetf).RatingCompat();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot release anything but an EngineResource");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final generateEotflambda0 RemoteActionCompatParcelizer(generateEotf generateeotf, boolean z, long j) {
        generateEotflambda0 generateeotflambda0;
        Object obj;
        generateEotflambda0 generateeotflambda1;
        if (z) {
            ImageLoader$Builder imageLoader$Builder = this.RemoteActionCompatParcelizer;
            synchronized (imageLoader$Builder) {
                r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A r8lambdaboxpaykq1hl7y9ngvej_riduf1a = (r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A) ((HashMap) imageLoader$Builder.IconCompatParcelizer).get(generateeotf);
                if (r8lambdaboxpaykq1hl7y9ngvej_riduf1a == null) {
                    generateeotflambda0 = null;
                } else {
                    generateeotflambda0 = (generateEotflambda0) r8lambdaboxpaykq1hl7y9ngvej_riduf1a.get();
                    if (generateeotflambda0 == null) {
                        imageLoader$Builder.RemoteActionCompatParcelizer(r8lambdaboxpaykq1hl7y9ngvej_riduf1a);
                    }
                }
            }
            if (generateeotflambda0 != null) {
                generateeotflambda0.serializer();
            }
            if (generateeotflambda0 != null) {
                if (serializer) {
                    Stroke.RemoteActionCompatParcelizer(j);
                    Objects.toString(generateeotf);
                }
                return generateeotflambda0;
            }
            WhitePoint whitePoint = this.write;
            synchronized (whitePoint) {
                EmptyCanvas emptyCanvas = (EmptyCanvas) ((LinkedHashMap) whitePoint.IconCompatParcelizer).remove(generateeotf);
                if (emptyCanvas == null) {
                    obj = null;
                } else {
                    whitePoint.RemoteActionCompatParcelizer -= (long) emptyCanvas.IconCompatParcelizer;
                    obj = emptyCanvas.RemoteActionCompatParcelizer;
                }
            }
            generateOetf generateoetf = (generateOetf) obj;
            if (generateoetf == null) {
                generateeotflambda1 = null;
            } else if (generateoetf instanceof generateEotflambda0) {
                generateeotflambda1 = (generateEotflambda0) generateoetf;
            } else {
                generateeotflambda1 = new generateEotflambda0(generateoetf, true, true, generateeotf, this);
            }
            if (generateeotflambda1 != null) {
                generateeotflambda1.serializer();
                this.RemoteActionCompatParcelizer.serializer(generateeotf, generateeotflambda1);
            }
            if (generateeotflambda1 != null) {
                if (serializer) {
                    Stroke.RemoteActionCompatParcelizer(j);
                    Objects.toString(generateeotf);
                }
                return generateeotflambda1;
            }
        }
        return null;
    }

    public final androidx.navigation.NavArgsLazy IconCompatParcelizer(accessgetPerceptualcp accessgetperceptualcp, Object obj, eotfFunclambda0 eotffunclambda0, int i, int i2, Class cls, Class cls2, RenderIntentCompanion renderIntentCompanion, accessisWideGamut accessiswidegamut, Map map, boolean z, boolean z2, getEotfFuncui_graphics geteotffuncui_graphics, boolean z3, boolean z4, com.bumptech.glide.request.SingleRequest singleRequest, Executor executor, generateEotf generateeotf, long j) {
        generateOetflambda0 generateoetflambda0 = this.MediaDescriptionCompat;
        accessisSrgb accessissrgb = (accessisSrgb) generateoetflambda0.serializer.get(generateeotf);
        boolean z5 = serializer;
        if (accessissrgb != null) {
            accessissrgb.read(singleRequest, executor);
            if (z5) {
                Stroke.RemoteActionCompatParcelizer(j);
                Objects.toString(generateeotf);
            }
            return new androidx.navigation.NavArgsLazy(this, singleRequest, accessissrgb);
        }
        accessisSrgb accessissrgb2 = (accessisSrgb) ((androidx.emoji2.text.EmojiProcessor) this.read.RemoteActionCompatParcelizer).write();
        accessissrgb2.IconCompatParcelizer(generateeotf, z3, z4);
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.IconCompatParcelizer;
        com.bumptech.glide.load.engine.DecodeJob decodeJob = (com.bumptech.glide.load.engine.DecodeJob) ((androidx.emoji2.text.EmojiProcessor) resizegraphicframeifappropriate.write).write();
        int i3 = resizegraphicframeifappropriate.serializer;
        resizegraphicframeifappropriate.serializer = i3 + 1;
        decodeJob.read(accessgetperceptualcp, obj, generateeotf, eotffunclambda0, i, i2, cls, cls2, renderIntentCompanion, accessiswidegamut, map, z, z2, geteotffuncui_graphics, accessissrgb2, i3);
        generateoetflambda0.serializer.put(generateeotf, accessissrgb2);
        accessissrgb2.read(singleRequest, executor);
        accessissrgb2.write(decodeJob);
        if (z5) {
            Stroke.RemoteActionCompatParcelizer(j);
            Objects.toString(generateeotf);
        }
        return new androidx.navigation.NavArgsLazy(this, singleRequest, accessissrgb2);
    }
}
