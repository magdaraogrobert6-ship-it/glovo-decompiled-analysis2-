package o;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Fields extends Property {
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Fields(Class cls, String str, int i) {
        super(cls, str);
        this.IconCompatParcelizer = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.IconCompatParcelizer) {
            case 0:
                return Float.valueOf(getAutoNrFUSI.IconCompatParcelizer.RemoteActionCompatParcelizer((View) obj));
            case 1:
                return Float.valueOf(((setKeyListener) obj)._init_lambda4);
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return ((View) obj).getClipBounds();
            case 8:
                return Float.valueOf(((copy8GGzs04default) obj).IconCompatParcelizer());
            case 9:
                return Float.valueOf(((times44nBxM0) obj).write);
            default:
                return Float.valueOf(((getScaleXimpl) obj).IconCompatParcelizer);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.IconCompatParcelizer) {
            case 0:
                getAutoNrFUSI.IconCompatParcelizer.IconCompatParcelizer((View) obj, ((Float) obj2).floatValue());
                break;
            case 1:
                ((setKeyListener) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 2:
                androidColorSpacelambda1 androidcolorspacelambda1 = (androidColorSpacelambda1) obj;
                PointF pointF = (PointF) obj2;
                androidcolorspacelambda1.getClass();
                androidcolorspacelambda1.write = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                androidcolorspacelambda1.serializer = iRound;
                int i = androidcolorspacelambda1.MediaMetadataCompat + 1;
                androidcolorspacelambda1.MediaMetadataCompat = i;
                if (i == androidcolorspacelambda1.RemoteActionCompatParcelizer) {
                    getAutoNrFUSI.RemoteActionCompatParcelizer(androidcolorspacelambda1.MediaDescriptionCompat, androidcolorspacelambda1.write, iRound, androidcolorspacelambda1.read, androidcolorspacelambda1.IconCompatParcelizer);
                    androidcolorspacelambda1.MediaMetadataCompat = 0;
                    androidcolorspacelambda1.RemoteActionCompatParcelizer = 0;
                }
                break;
            case 3:
                androidColorSpacelambda1 androidcolorspacelambda2 = (androidColorSpacelambda1) obj;
                PointF pointF2 = (PointF) obj2;
                androidcolorspacelambda2.getClass();
                androidcolorspacelambda2.read = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                androidcolorspacelambda2.IconCompatParcelizer = iRound2;
                int i2 = androidcolorspacelambda2.RemoteActionCompatParcelizer + 1;
                androidcolorspacelambda2.RemoteActionCompatParcelizer = i2;
                if (androidcolorspacelambda2.MediaMetadataCompat == i2) {
                    getAutoNrFUSI.RemoteActionCompatParcelizer(androidcolorspacelambda2.MediaDescriptionCompat, androidcolorspacelambda2.write, androidcolorspacelambda2.serializer, androidcolorspacelambda2.read, iRound2);
                    androidcolorspacelambda2.MediaMetadataCompat = 0;
                    androidcolorspacelambda2.RemoteActionCompatParcelizer = 0;
                }
                break;
            case 4:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                getAutoNrFUSI.RemoteActionCompatParcelizer(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 5:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                getAutoNrFUSI.RemoteActionCompatParcelizer(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 6:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                getAutoNrFUSI.RemoteActionCompatParcelizer(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 7:
                ((View) obj).setClipBounds((android.graphics.Rect) obj2);
                break;
            case 8:
                copy8GGzs04default copy8ggzs04default = (copy8GGzs04default) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                if (copy8ggzs04default.PlaybackStateCompat != fFloatValue) {
                    copy8ggzs04default.PlaybackStateCompat = fFloatValue;
                    copy8ggzs04default.invalidateSelf();
                }
                break;
            case 9:
                times44nBxM0 times44nbxm0 = (times44nBxM0) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                times44nbxm0.write = fFloatValue2;
                float[] fArr = (float[]) times44nbxm0.dataLoader;
                fArr[0] = 0.0f;
                float f = ((int) (fFloatValue2 * 333.0f)) / 667.0f;
                restore restoreVar = times44nbxm0.MediaDescriptionCompat;
                float interpolation = restoreVar.getInterpolation(f);
                fArr[2] = interpolation;
                fArr[1] = interpolation;
                float interpolation2 = restoreVar.getInterpolation(f + 0.49925038f);
                fArr[4] = interpolation2;
                fArr[3] = interpolation2;
                fArr[5] = 1.0f;
                if (times44nbxm0.MediaBrowserCompatMediaItem && interpolation2 < 1.0f) {
                    int[] iArr = (int[]) times44nbxm0.fullFileName$delegate;
                    iArr[2] = iArr[1];
                    iArr[1] = iArr[0];
                    iArr[0] = mergeRulerValues.read(times44nbxm0.read.IconCompatParcelizer[times44nbxm0.RatingCompat], ((ScaleFactorCompanion) times44nbxm0.serializer).ResultReceiver);
                    times44nbxm0.MediaBrowserCompatMediaItem = false;
                }
                ((ScaleFactorCompanion) times44nbxm0.serializer).invalidateSelf();
                break;
            default:
                getScaleXimpl getscaleximpl = (getScaleXimpl) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                getscaleximpl.IconCompatParcelizer = fFloatValue3;
                int i3 = (int) (fFloatValue3 * 1800.0f);
                for (int i4 = 0; i4 < 4; i4++) {
                    ((float[]) getscaleximpl.dataLoader)[i4] = Math.max(0.0f, Math.min(1.0f, getscaleximpl.PlaybackStateCompatCustomAction[i4].getInterpolation((i3 - getScaleXimpl.read[i4]) / getScaleXimpl.RemoteActionCompatParcelizer[i4])));
                }
                if (getscaleximpl.RatingCompat) {
                    Arrays.fill((int[]) getscaleximpl.fullFileName$delegate, mergeRulerValues.read(getscaleximpl.MediaBrowserCompatMediaItem.IconCompatParcelizer[getscaleximpl.ParcelableVolumeInfo], ((ScaleFactorCompanion) getscaleximpl.serializer).ResultReceiver));
                    getscaleximpl.RatingCompat = false;
                }
                ((ScaleFactorCompanion) getscaleximpl.serializer).invalidateSelf();
                break;
        }
    }
}
