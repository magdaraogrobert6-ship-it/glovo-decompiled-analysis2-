package o;

import android.graphics.BlurMaskFilter;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TransformOriginKt implements TransformOriginCompanion, encodeColorList {
    public final accessgetCiecat02cp IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final accessgetCiecat02cp MediaDescriptionCompat;
    public final getTransformui_graphics MediaSessionCompatQueueItem;
    public final android.graphics.Path MediaSessionCompatResultReceiverWrapper;
    public final accessgetCiecat02cp MediaSessionCompatToken;
    public final ArrayList ParcelableVolumeInfo;
    public final copyzey9I6wdefault PlaybackStateCompatCustomAction;
    public final accessgetMirrorcp RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final mul3x3 ResultReceiver;
    public final RectF read;
    public float serializer;
    public final getTransformui_graphics write;
    public final ContextMenuSpec MediaMetadataCompat = new ContextMenuSpec((Object) null);
    public final ContextMenuSpec PlaybackStateCompat = new ContextMenuSpec((Object) null);

    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) list2.get(i);
            if (getpackedvalueannotations instanceof transformQ8lPUPs) {
                this.ParcelableVolumeInfo.add((transformQ8lPUPs) getpackedvalueannotations);
            }
        }
    }

    public final int IconCompatParcelizer() {
        float f = this.MediaSessionCompatToken.MediaBrowserCompatMediaItem;
        float f2 = this.RemoteActionCompatParcelizer;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.MediaDescriptionCompat.MediaBrowserCompatMediaItem * f2);
        int iRound3 = Math.round(this.IconCompatParcelizer.MediaBrowserCompatMediaItem * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        android.graphics.Path path = this.MediaSessionCompatResultReceiverWrapper;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.ParcelableVolumeInfo;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            path.addPath(((transformQ8lPUPs) arrayList.get(i)).write(), matrix);
            i++;
        }
    }

    @Override // o.encodeColorList
    public final void serializer() {
        this.RatingCompat.invalidateSelf();
    }

    public TransformOriginKt(accessgetMirrorcp accessgetmirrorcp, StrokeJoinCompanion strokeJoinCompanion, ExtendedSrgblambda0 extendedSrgblambda0, adapt adaptVar) {
        android.graphics.Path path = new android.graphics.Path();
        this.MediaSessionCompatResultReceiverWrapper = path;
        this.PlaybackStateCompatCustomAction = new copyzey9I6wdefault(1, 0);
        this.read = new RectF();
        this.ParcelableVolumeInfo = new ArrayList();
        this.serializer = 0.0f;
        this.MediaBrowserCompatMediaItem = adaptVar.write;
        this.RatingCompat = accessgetmirrorcp;
        this.ResultReceiver = adaptVar.read;
        path.setFillType(adaptVar.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = (int) (strokeJoinCompanion.RemoteActionCompatParcelizer() / 32.0f);
        getColors getcolorsWrite = adaptVar.serializer.write();
        this.IconCompatParcelizer = (accessgetCiecat02cp) getcolorsWrite;
        getcolorsWrite.write(this);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite);
        getColors getcolorsWrite2 = adaptVar.RatingCompat.write();
        this.MediaSessionCompatQueueItem = (getTransformui_graphics) getcolorsWrite2;
        getcolorsWrite2.write(this);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite2);
        getColors getcolorsWrite3 = adaptVar.MediaSessionCompatQueueItem.write();
        this.MediaSessionCompatToken = (accessgetCiecat02cp) getcolorsWrite3;
        getcolorsWrite3.write(this);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite3);
        getColors getcolorsWrite4 = adaptVar.RemoteActionCompatParcelizer.write();
        this.MediaDescriptionCompat = (accessgetCiecat02cp) getcolorsWrite4;
        getcolorsWrite4.write(this);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite4);
        if (extendedSrgblambda0.write() != null) {
            getTransformui_graphics gettransformui_graphicsWrite = ((toXyz) extendedSrgblambda0.write().read).write();
            this.write = gettransformui_graphicsWrite;
            gettransformui_graphicsWrite.write(this);
            extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
        }
    }

    @Override // o.TransformOriginCompanion
    public final void RemoteActionCompatParcelizer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
        Shader radialGradient;
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        android.graphics.Path path = this.MediaSessionCompatResultReceiverWrapper;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.ParcelableVolumeInfo;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((transformQ8lPUPs) arrayList.get(i2)).write(), matrix);
            i2++;
        }
        path.computeBounds(this.read, false);
        mul3x3 mul3x3Var = this.ResultReceiver;
        mul3x3 mul3x3Var2 = mul3x3.LINEAR;
        accessgetCiecat02cp accessgetciecat02cp = this.IconCompatParcelizer;
        accessgetCiecat02cp accessgetciecat02cp2 = this.MediaDescriptionCompat;
        accessgetCiecat02cp accessgetciecat02cp3 = this.MediaSessionCompatToken;
        if (mul3x3Var == mul3x3Var2) {
            long jIconCompatParcelizer = IconCompatParcelizer();
            ContextMenuSpec contextMenuSpec = this.MediaMetadataCompat;
            radialGradient = (android.graphics.LinearGradient) contextMenuSpec.write(jIconCompatParcelizer);
            if (radialGradient == null) {
                PointF pointF = (PointF) accessgetciecat02cp3.IconCompatParcelizer();
                PointF pointF2 = (PointF) accessgetciecat02cp2.IconCompatParcelizer();
                absResponse absresponse = (absResponse) accessgetciecat02cp.IconCompatParcelizer();
                int[] iArr = absresponse.write;
                float[] fArr = absresponse.RemoteActionCompatParcelizer;
                if (iArr.length < 2) {
                    int i3 = iArr[0];
                    iArr = new int[]{i3, i3};
                    fArr = new float[]{0.0f, 1.0f};
                }
                radialGradient = new android.graphics.LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr, fArr, Shader.TileMode.CLAMP);
                contextMenuSpec.read(jIconCompatParcelizer, radialGradient);
            }
        } else {
            long jIconCompatParcelizer2 = IconCompatParcelizer();
            ContextMenuSpec contextMenuSpec2 = this.PlaybackStateCompat;
            radialGradient = (android.graphics.RadialGradient) contextMenuSpec2.write(jIconCompatParcelizer2);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) accessgetciecat02cp3.IconCompatParcelizer();
                PointF pointF4 = (PointF) accessgetciecat02cp2.IconCompatParcelizer();
                absResponse absresponse2 = (absResponse) accessgetciecat02cp.IconCompatParcelizer();
                int[] iArr2 = absresponse2.write;
                float[] fArr2 = absresponse2.RemoteActionCompatParcelizer;
                if (iArr2.length < 2) {
                    int i4 = iArr2[0];
                    iArr2 = new int[]{i4, i4};
                    fArr2 = new float[]{0.0f, 1.0f};
                }
                float[] fArr3 = fArr2;
                int[] iArr3 = iArr2;
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new android.graphics.RadialGradient(f, f2, fHypot, iArr3, fArr3, Shader.TileMode.CLAMP);
                contextMenuSpec2.read(jIconCompatParcelizer2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        copyzey9I6wdefault copyzey9i6wdefault = this.PlaybackStateCompatCustomAction;
        copyzey9i6wdefault.setShader(radialGradient);
        getTransformui_graphics gettransformui_graphics = this.write;
        if (gettransformui_graphics != null) {
            float fFloatValue = ((Float) gettransformui_graphics.IconCompatParcelizer()).floatValue();
            if (fFloatValue == 0.0f) {
                copyzey9i6wdefault.setMaskFilter(null);
            } else if (fFloatValue != this.serializer) {
                copyzey9i6wdefault.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.serializer = fFloatValue;
        }
        float fIntValue = ((Integer) this.MediaSessionCompatQueueItem.IconCompatParcelizer()).intValue() / 100.0f;
        copyzey9i6wdefault.setAlpha(getD50.write((int) (i * fIntValue)));
        if (geta != null) {
            geta.RemoteActionCompatParcelizer((int) (fIntValue * 255.0f), copyzey9i6wdefault);
        }
        canvas.drawPath(path, copyzey9i6wdefault);
        getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
    }
}
