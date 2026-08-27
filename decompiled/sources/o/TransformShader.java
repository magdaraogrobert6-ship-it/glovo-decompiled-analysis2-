package o;

import android.graphics.PointF;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TransformShader implements transformQ8lPUPs, encodeColorList {
    public final getColors IconCompatParcelizer;
    public final accessgetCiecat02cp MediaDescriptionCompat;
    public boolean RemoteActionCompatParcelizer;
    public final chromaticAdaptation read;
    public final accessgetMirrorcp write;
    public final android.graphics.Path serializer = new android.graphics.Path();
    public final u$a MediaMetadataCompat = new u$a(2);

    @Override // o.encodeColorList
    public final void serializer() {
        this.RemoteActionCompatParcelizer = false;
        this.write.invalidateSelf();
    }

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
                    this.MediaMetadataCompat.IconCompatParcelizer.add(encodepointlist);
                    encodepointlist.serializer(this);
                }
            }
            i++;
        }
    }

    @Override // o.transformQ8lPUPs
    public final android.graphics.Path write() {
        boolean z = this.RemoteActionCompatParcelizer;
        android.graphics.Path path = this.serializer;
        if (z) {
            return path;
        }
        path.reset();
        chromaticAdaptation chromaticadaptation = this.read;
        if (chromaticadaptation.read) {
            this.RemoteActionCompatParcelizer = true;
            return path;
        }
        PointF pointF = (PointF) this.MediaDescriptionCompat.IconCompatParcelizer();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (chromaticadaptation.write) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.IconCompatParcelizer.IconCompatParcelizer();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.MediaMetadataCompat.serializer(path);
        this.RemoteActionCompatParcelizer = true;
        return path;
    }

    public TransformShader(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, chromaticAdaptation chromaticadaptation) {
        this.write = accessgetmirrorcp;
        getColors getcolorsWrite = chromaticadaptation.RemoteActionCompatParcelizer.write();
        this.MediaDescriptionCompat = (accessgetCiecat02cp) getcolorsWrite;
        getColors getcolorsWrite2 = chromaticadaptation.IconCompatParcelizer.write();
        this.IconCompatParcelizer = getcolorsWrite2;
        this.read = chromaticadaptation;
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite2);
        getcolorsWrite.write(this);
        getcolorsWrite2.write(this);
    }
}
