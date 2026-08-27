package o;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class getTriangleFanc2xauaI implements TransformOriginCompanion, transformQ8lPUPs, obtainMatrix, encodeColorList {
    public final ExtendedSrgblambda0 IconCompatParcelizer;
    public final AdaptationCompanion MediaBrowserCompatMediaItem;
    public final getTransformui_graphics RatingCompat;
    public final getTransformui_graphics RemoteActionCompatParcelizer;
    public final boolean read;
    public accessgetCentercp serializer;
    public final accessgetMirrorcp write;
    public final android.graphics.Matrix MediaSessionCompatQueueItem = new android.graphics.Matrix();
    public final android.graphics.Path MediaMetadataCompat = new android.graphics.Path();

    @Override // o.TransformOriginCompanion
    public final void RemoteActionCompatParcelizer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
        float fFloatValue = ((Float) this.RemoteActionCompatParcelizer.IconCompatParcelizer()).floatValue();
        float fFloatValue2 = ((Float) this.RatingCompat.IconCompatParcelizer()).floatValue();
        AdaptationCompanion adaptationCompanion = this.MediaBrowserCompatMediaItem;
        float fFloatValue3 = ((Float) adaptationCompanion.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.IconCompatParcelizer()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) adaptationCompanion.MediaDescriptionCompat.IconCompatParcelizer()).floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            android.graphics.Matrix matrix2 = this.MediaSessionCompatQueueItem;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(adaptationCompanion.serializer(f + fFloatValue2));
            this.serializer.RemoteActionCompatParcelizer(canvas, matrix2, (int) (getD50.serializer(fFloatValue3, fFloatValue4, f / fFloatValue) * i), geta);
        }
    }

    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
        this.serializer.RemoteActionCompatParcelizer(list, list2);
    }

    @Override // o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.serializer.read(rectF, matrix, z);
    }

    @Override // o.encodeColorList
    public final void serializer() {
        this.write.invalidateSelf();
    }

    @Override // o.transformQ8lPUPs
    public final android.graphics.Path write() {
        android.graphics.Path pathWrite = this.serializer.write();
        android.graphics.Path path = this.MediaMetadataCompat;
        path.reset();
        float fFloatValue = ((Float) this.RemoteActionCompatParcelizer.IconCompatParcelizer()).floatValue();
        float fFloatValue2 = ((Float) this.RatingCompat.IconCompatParcelizer()).floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            android.graphics.Matrix matrixSerializer = this.MediaBrowserCompatMediaItem.serializer(i + fFloatValue2);
            android.graphics.Matrix matrix = this.MediaSessionCompatQueueItem;
            matrix.set(matrixSerializer);
            path.addPath(pathWrite, matrix);
        }
    }

    public getTriangleFanc2xauaI(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, response responseVar) {
        this.write = accessgetmirrorcp;
        this.IconCompatParcelizer = extendedSrgblambda0;
        this.read = responseVar.write;
        getTransformui_graphics gettransformui_graphicsWrite = responseVar.read.write();
        this.RemoteActionCompatParcelizer = gettransformui_graphicsWrite;
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
        gettransformui_graphicsWrite.write(this);
        getTransformui_graphics gettransformui_graphicsWrite2 = ((toXyz) responseVar.serializer).write();
        this.RatingCompat = gettransformui_graphicsWrite2;
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite2);
        gettransformui_graphicsWrite2.write(this);
        ColorSpaceKt colorSpaceKt = (ColorSpaceKt) responseVar.IconCompatParcelizer;
        colorSpaceKt.getClass();
        AdaptationCompanion adaptationCompanion = new AdaptationCompanion(colorSpaceKt);
        this.MediaBrowserCompatMediaItem = adaptationCompanion;
        adaptationCompanion.read(extendedSrgblambda0);
        adaptationCompanion.RemoteActionCompatParcelizer(this);
    }

    @Override // o.obtainMatrix
    public final void read(ListIterator listIterator) {
        if (this.serializer != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((getPackedValueannotations) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.serializer = new accessgetCentercp(this.write, this.IconCompatParcelizer, this.read, arrayList, null);
    }
}
