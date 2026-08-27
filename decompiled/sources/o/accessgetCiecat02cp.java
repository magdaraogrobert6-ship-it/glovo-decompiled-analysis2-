package o;

import android.graphics.PointF;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetCiecat02cp extends getTextureCoordinates {
    public final /* synthetic */ int MediaDescriptionCompat;
    public final Object MediaSessionCompatQueueItem;

    @Override // o.getColors
    public final Object RemoteActionCompatParcelizer(Lab lab, float f) {
        Object obj;
        int i = this.MediaDescriptionCompat;
        Object obj2 = this.MediaSessionCompatQueueItem;
        if (i == 0) {
            return IconCompatParcelizer(lab, f, f);
        }
        if (i != 1) {
            LabCompanion labCompanion = (LabCompanion) obj2;
            Object obj3 = lab.MediaSessionCompatToken;
            if (obj3 == null || (obj = lab.RatingCompat) == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing values for keyframe.");
                return null;
            }
            LabCompanion labCompanion2 = (LabCompanion) obj3;
            LabCompanion labCompanion3 = (LabCompanion) obj;
            float fSerializer = getD50.serializer(labCompanion2.read, labCompanion3.read, f);
            float fSerializer2 = getD50.serializer(labCompanion2.serializer, labCompanion3.serializer, f);
            labCompanion.read = fSerializer;
            labCompanion.serializer = fSerializer2;
            return labCompanion;
        }
        absResponse absresponse = (absResponse) obj2;
        absResponse absresponse2 = (absResponse) lab.MediaSessionCompatToken;
        absResponse absresponse3 = (absResponse) lab.RatingCompat;
        int[] iArr = absresponse.write;
        float[] fArr = absresponse.RemoteActionCompatParcelizer;
        boolean zEquals = absresponse2.equals(absresponse3);
        int[] iArr2 = absresponse2.write;
        if (zEquals || f <= 0.0f) {
            absresponse.RemoteActionCompatParcelizer(absresponse2);
        } else if (f >= 1.0f) {
            absresponse.RemoteActionCompatParcelizer(absresponse3);
        } else {
            int length = iArr2.length;
            int[] iArr3 = absresponse3.write;
            if (length != iArr3.length) {
                StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                sb.append(iArr2.length);
                sb.append(" vs ");
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(iArr3.length, ")", sb));
                return null;
            }
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                fArr[i2] = getD50.serializer(absresponse2.RemoteActionCompatParcelizer[i2], absresponse3.RemoteActionCompatParcelizer[i2], f);
                iArr[i2] = Illuminant.serializer(f, iArr2[i2], iArr3[i2]);
            }
            for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                fArr[length2] = fArr[iArr2.length - 1];
                iArr[length2] = iArr[iArr2.length - 1];
            }
        }
        return absresponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetCiecat02cp(List list, int i) {
        super(list);
        this.MediaDescriptionCompat = i;
        if (i != 1) {
            if (i != 2) {
                this.MediaSessionCompatQueueItem = new PointF();
                return;
            } else {
                super(list);
                this.MediaSessionCompatQueueItem = new LabCompanion(1.0f, 1.0f);
                return;
            }
        }
        super(list);
        int iMax = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            absResponse absresponse = (absResponse) ((Lab) list.get(i2)).MediaSessionCompatToken;
            if (absresponse != null) {
                iMax = Math.max(iMax, absresponse.write.length);
            }
        }
        this.MediaSessionCompatQueueItem = new absResponse(new float[iMax], new int[iMax]);
    }

    @Override // o.getColors
    public /* bridge */ /* synthetic */ Object IconCompatParcelizer(Lab lab, float f, float f2, float f3) {
        return this.MediaDescriptionCompat != 0 ? super.IconCompatParcelizer(lab, f, f2, f3) : IconCompatParcelizer(lab, f2, f3);
    }

    public PointF IconCompatParcelizer(Lab lab, float f, float f2) {
        Object obj;
        PointF pointF = (PointF) this.MediaSessionCompatQueueItem;
        Object obj2 = lab.MediaSessionCompatToken;
        if (obj2 != null && (obj = lab.RatingCompat) != null) {
            PointF pointF2 = (PointF) obj2;
            PointF pointF3 = (PointF) obj;
            float f3 = pointF2.x;
            float fM = c8$$ExternalSyntheticOutline0.m(pointF3.x, f3, f, f3);
            float f4 = pointF2.y;
            pointF.set(fM, c8$$ExternalSyntheticOutline0.m(pointF3.y, f4, f2, f4));
            return pointF;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing values for keyframe.");
        return null;
    }
}
