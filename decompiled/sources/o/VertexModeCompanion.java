package o;

import android.graphics.PointF;
import android.graphics.RectF;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class VertexModeCompanion implements encodeColorList, transformQ8lPUPs {
    public final accessgetMirrorcp IconCompatParcelizer;
    public final getColors MediaBrowserCompatMediaItem;
    public final getColors RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final getTransformui_graphics read;
    public boolean serializer;
    public final android.graphics.Path write = new android.graphics.Path();
    public final RectF MediaMetadataCompat = new RectF();
    public final u$a MediaDescriptionCompat = new u$a(2);
    public getColors MediaSessionCompatQueueItem = null;

    @Override // o.encodeColorList
    public final void serializer() {
        this.serializer = false;
        this.IconCompatParcelizer.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0032 A[SYNTHETIC] */
    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) arrayList.get(i);
            if (getpackedvalueannotations instanceof encodePointList) {
                encodePointList encodepointlist = (encodePointList) getpackedvalueannotations;
                if (encodepointlist.RatingCompat == Bt2020Pqlambda0.SIMULTANEOUSLY) {
                    this.MediaDescriptionCompat.IconCompatParcelizer.add(encodepointlist);
                    encodepointlist.serializer(this);
                } else if (getpackedvalueannotations instanceof accessgetTrianglescp) {
                    this.MediaSessionCompatQueueItem = ((accessgetTrianglescp) getpackedvalueannotations).write;
                }
            } else if (getpackedvalueannotations instanceof accessgetTrianglescp) {
                this.MediaSessionCompatQueueItem = ((accessgetTrianglescp) getpackedvalueannotations).write;
            }
            i++;
        }
    }

    @Override // o.transformQ8lPUPs
    public final android.graphics.Path write() {
        getColors getcolors;
        boolean z = this.serializer;
        android.graphics.Path path = this.write;
        if (z) {
            return path;
        }
        path.reset();
        if (this.RemoteActionCompatParcelizer) {
            this.serializer = true;
            return path;
        }
        PointF pointF = (PointF) this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        getTransformui_graphics gettransformui_graphics = this.read;
        float fWrite = gettransformui_graphics == null ? 0.0f : gettransformui_graphics.write();
        if (fWrite == 0.0f && (getcolors = this.MediaSessionCompatQueueItem) != null) {
            fWrite = Math.min(((Float) getcolors.IconCompatParcelizer()).floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fWrite > fMin) {
            fWrite = fMin;
        }
        PointF pointF2 = (PointF) this.RatingCompat.IconCompatParcelizer();
        path.moveTo(pointF2.x + f, (pointF2.y - f2) + fWrite);
        path.lineTo(pointF2.x + f, (pointF2.y + f2) - fWrite);
        RectF rectF = this.MediaMetadataCompat;
        if (fWrite > 0.0f) {
            float f3 = pointF2.x + f;
            float f4 = fWrite * 2.0f;
            float f5 = pointF2.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f) + fWrite, pointF2.y + f2);
        if (fWrite > 0.0f) {
            float f6 = pointF2.x - f;
            float f7 = pointF2.y + f2;
            float f8 = fWrite * 2.0f;
            rectF.set(f6, f7 - f8, f8 + f6, f7);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f, (pointF2.y - f2) + fWrite);
        if (fWrite > 0.0f) {
            float f9 = pointF2.x - f;
            float f10 = pointF2.y - f2;
            float f11 = fWrite * 2.0f;
            rectF.set(f9, f10, f9 + f11, f11 + f10);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f) - fWrite, pointF2.y - f2);
        if (fWrite > 0.0f) {
            float f12 = pointF2.x + f;
            float f13 = fWrite * 2.0f;
            float f14 = pointF2.y - f2;
            rectF.set(f12 - f13, f14, f12, f13 + f14);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.MediaDescriptionCompat.serializer(path);
        this.serializer = true;
        return path;
    }

    public VertexModeCompanion(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, response responseVar) {
        this.RemoteActionCompatParcelizer = responseVar.write;
        this.IconCompatParcelizer = accessgetmirrorcp;
        getColors getcolorsWrite = responseVar.serializer.write();
        this.RatingCompat = getcolorsWrite;
        getColors getcolorsWrite2 = ((absRcpResponse) responseVar.IconCompatParcelizer).write();
        this.MediaBrowserCompatMediaItem = getcolorsWrite2;
        getTransformui_graphics gettransformui_graphicsWrite = responseVar.read.write();
        this.read = gettransformui_graphicsWrite;
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite2);
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
        getcolorsWrite.write(this);
        getcolorsWrite2.write(this);
        gettransformui_graphicsWrite.write(this);
    }
}
