package o;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class getBt2020 extends ExtendedSrgblambda0 {
    public final getD60 _init_lambda1;
    public final ArrayList _init_lambda2;
    public final RectF _init_lambda3;
    public final getPositions _init_lambda4;
    public final RectF accessensureViewModelStore;
    public final getTransformui_graphics addObserverForBackInvoker;
    public float addObserverForBackInvokerlambda0;
    public final RectF createFullyDrawnExecutor;
    public final DeltaDecoder defaultViewModelProviderFactory_delegatelambda0;
    public boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    @Override // o.ExtendedSrgblambda0
    public final void serializer(float f) {
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        this.addObserverForBackInvokerlambda0 = f;
        super.serializer(f);
        getAdobeRgb getadobergb = this.PlaybackStateCompat;
        getTransformui_graphics gettransformui_graphics = this.addObserverForBackInvoker;
        if (gettransformui_graphics != null) {
            StrokeJoinCompanion strokeJoinCompanion = this.ParcelableVolumeInfo.MediaDescriptionCompat;
            f = ((((Float) gettransformui_graphics.IconCompatParcelizer()).floatValue() * getadobergb.write.IconCompatParcelizer) - getadobergb.write.PlaybackStateCompat) / ((strokeJoinCompanion.read - strokeJoinCompanion.PlaybackStateCompat) + 0.01f);
        }
        if (gettransformui_graphics == null) {
            float f2 = getadobergb.ComponentActivity;
            StrokeJoinCompanion strokeJoinCompanion2 = getadobergb.write;
            f -= f2 / (strokeJoinCompanion2.read - strokeJoinCompanion2.PlaybackStateCompat);
        }
        if (getadobergb.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != 0.0f && !"__container".equals(getadobergb.MediaBrowserCompatMediaItem)) {
            f /= getadobergb.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        ArrayList arrayList = this._init_lambda2;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
                return;
            }
            ((ExtendedSrgblambda0) arrayList.get(size)).serializer(f);
        }
    }

    @Override // o.ExtendedSrgblambda0
    public final void read(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
        android.graphics.Canvas canvas2;
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        getPositions getpositions = this._init_lambda4;
        boolean z = false;
        boolean z2 = (geta == null && getpositions == null) ? false : true;
        accessgetMirrorcp accessgetmirrorcp = this.ParcelableVolumeInfo;
        boolean z3 = accessgetmirrorcp.PlaybackStateCompatCustomAction;
        ArrayList<ExtendedSrgblambda0> arrayList = this._init_lambda2;
        if ((z3 && arrayList.size() > 1 && i != 255) || (z2 && accessgetmirrorcp.ComponentActivity)) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (getpositions != null) {
            geta = getpositions.write(matrix, i2);
        }
        boolean z4 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        getAdobeRgb getadobergb = this.PlaybackStateCompat;
        RectF rectF = this.accessensureViewModelStore;
        if (z4 || !"__container".equals(getadobergb.MediaBrowserCompatMediaItem)) {
            rectF.set(0.0f, 0.0f, getadobergb.ParcelableVolumeInfo, getadobergb.PlaybackStateCompatCustomAction);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (ExtendedSrgblambda0 extendedSrgblambda0 : arrayList) {
                RectF rectF2 = this._init_lambda3;
                extendedSrgblambda0.read(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        getD60 getd60 = this._init_lambda1;
        if (z) {
            DeltaDecoder deltaDecoder = this.defaultViewModelProviderFactory_delegatelambda0;
            deltaDecoder.serializer = null;
            deltaDecoder.write = i;
            if (geta != null) {
                if (android.graphics.Color.alpha(geta.IconCompatParcelizer) > 0) {
                    deltaDecoder.serializer = geta;
                } else {
                    deltaDecoder.serializer = null;
                }
                geta = null;
            }
            canvas2 = getd60.read(canvas, rectF, deltaDecoder);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((ExtendedSrgblambda0) arrayList.get(size)).RemoteActionCompatParcelizer(canvas2, matrix, i2, geta);
                }
            }
        }
        if (z) {
            getd60.IconCompatParcelizer();
        }
        canvas.restore();
        getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
    }

    @Override // o.ExtendedSrgblambda0, o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        ArrayList arrayList = this._init_lambda2;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            RectF rectF2 = this.createFullyDrawnExecutor;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((ExtendedSrgblambda0) arrayList.get(size)).read(rectF2, this.write, true);
            rectF.union(rectF2);
        }
    }

    @Override // o.ExtendedSrgblambda0
    public final void read(boolean z) {
        super.read(z);
        Iterator it = this._init_lambda2.iterator();
        while (it.hasNext()) {
            ((ExtendedSrgblambda0) it.next()).read(z);
        }
    }

    public getBt2020(accessgetMirrorcp accessgetmirrorcp, getAdobeRgb getadobergb, List list, StrokeJoinCompanion strokeJoinCompanion) {
        ExtendedSrgblambda0 extendedSrgblambda0;
        ExtendedSrgblambda0 getbt2020primariesui_graphics;
        super(accessgetmirrorcp, getadobergb);
        this._init_lambda2 = new ArrayList();
        this.createFullyDrawnExecutor = new RectF();
        this.accessensureViewModelStore = new RectF();
        this._init_lambda3 = new RectF();
        this._init_lambda1 = new getD60();
        this.defaultViewModelProviderFactory_delegatelambda0 = new DeltaDecoder((byte) 0, 4);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        toXyz toxyz = getadobergb.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (toxyz != null) {
            getTransformui_graphics gettransformui_graphicsWrite = toxyz.write();
            this.addObserverForBackInvoker = gettransformui_graphicsWrite;
            RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
            gettransformui_graphicsWrite.write(this);
        } else {
            this.addObserverForBackInvoker = null;
        }
        ContextMenuSpec contextMenuSpec = new ContextMenuSpec(strokeJoinCompanion.MediaBrowserCompatMediaItem.size());
        ExtendedSrgblambda0 extendedSrgblambda1 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            getAdobeRgb getadobergb2 = (getAdobeRgb) list.get(size);
            switch (getAcescg.IconCompatParcelizer[getadobergb2.RatingCompat.ordinal()]) {
                case 1:
                    getbt2020primariesui_graphics = new getBt2020Primariesui_graphics(accessgetmirrorcp, getadobergb2, this, strokeJoinCompanion);
                    break;
                case 2:
                    getbt2020primariesui_graphics = new getBt2020(accessgetmirrorcp, getadobergb2, (List) strokeJoinCompanion.ParcelableVolumeInfo.get(getadobergb2.MediaSessionCompatToken), strokeJoinCompanion);
                    break;
                case 3:
                    getbt2020primariesui_graphics = new getBt2020HlgTransferParametersui_graphics(accessgetmirrorcp, getadobergb2);
                    break;
                case 4:
                    getbt2020primariesui_graphics = new getAces(accessgetmirrorcp, getadobergb2);
                    break;
                case 5:
                    getbt2020primariesui_graphics = new getBt709(accessgetmirrorcp, getadobergb2);
                    break;
                case 6:
                    getbt2020primariesui_graphics = new getCieLab(accessgetmirrorcp, getadobergb2);
                    break;
                default:
                    getD50Xyzui_graphics.IconCompatParcelizer("Unknown layer type " + getadobergb2.RatingCompat);
                    getbt2020primariesui_graphics = null;
                    break;
            }
            if (getbt2020primariesui_graphics != null) {
                contextMenuSpec.read(getbt2020primariesui_graphics.PlaybackStateCompat.MediaMetadataCompat, getbt2020primariesui_graphics);
                if (extendedSrgblambda1 != null) {
                    extendedSrgblambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getbt2020primariesui_graphics;
                    extendedSrgblambda1 = null;
                } else {
                    this._init_lambda2.add(0, getbt2020primariesui_graphics);
                    int i = getBt2020Hlg.read[getadobergb2.MediaSessionCompatResultReceiverWrapper.ordinal()];
                    if (i == 1 || i == 2) {
                        extendedSrgblambda1 = getbt2020primariesui_graphics;
                    }
                }
            }
        }
        for (int i2 = 0; i2 < contextMenuSpec.IconCompatParcelizer(); i2++) {
            ExtendedSrgblambda0 extendedSrgblambda2 = (ExtendedSrgblambda0) contextMenuSpec.write(contextMenuSpec.IconCompatParcelizer(i2));
            if (extendedSrgblambda2 != null && (extendedSrgblambda0 = (ExtendedSrgblambda0) contextMenuSpec.write(extendedSrgblambda2.PlaybackStateCompat.PlaybackStateCompat)) != null) {
                extendedSrgblambda2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = extendedSrgblambda0;
            }
        }
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = this.PlaybackStateCompat.RemoteActionCompatParcelizer;
        if (dropShadowEffect != null) {
            this._init_lambda4 = new getPositions(this, this, dropShadowEffect);
        }
    }
}
