package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class drawImaged4ec7I extends drawPath {
    public final android.graphics.PathIterator read;
    public final androidx.graphics.path.ConicConverter serializer;

    @Override // o.drawPath
    public final boolean write() {
        return this.read.hasNext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drawImaged4ec7I(android.graphics.Path path, drawImageRectHPBpro0 drawimagerecthpbpro0, float f) {
        super(path, drawimagerecthpbpro0, f);
        path.getClass();
        drawimagerecthpbpro0.getClass();
        android.graphics.PathIterator pathIterator = path.getPathIterator();
        pathIterator.getClass();
        this.read = pathIterator;
        androidx.graphics.path.ConicConverter conicConverter = new androidx.graphics.path.ConicConverter();
        conicConverter.RemoteActionCompatParcelizer = new float[130];
        this.serializer = conicConverter;
    }

    @Override // o.drawPath
    public final drawRawPointsO7TthRY RemoteActionCompatParcelizer(float[] fArr, int i) {
        drawRawPointsO7TthRY drawrawpointso7tthry;
        fArr.getClass();
        androidx.graphics.path.ConicConverter conicConverter = this.serializer;
        if (conicConverter.read < conicConverter.IconCompatParcelizer) {
            conicConverter.serializer(fArr, i);
            return drawRawPointsO7TthRY.Quadratic;
        }
        int next = this.read.next(fArr, i);
        drawRawPointsO7TthRY[] drawrawpointso7tthryArr = drawPointsO7TthRY.serializer;
        switch (next) {
            case 0:
                drawrawpointso7tthry = drawRawPointsO7TthRY.Move;
                break;
            case 1:
                drawrawpointso7tthry = drawRawPointsO7TthRY.Line;
                break;
            case 2:
                drawrawpointso7tthry = drawRawPointsO7TthRY.Quadratic;
                break;
            case 3:
                drawrawpointso7tthry = drawRawPointsO7TthRY.Conic;
                break;
            case 4:
                drawrawpointso7tthry = drawRawPointsO7TthRY.Cubic;
                break;
            case 5:
                drawrawpointso7tthry = drawRawPointsO7TthRY.Close;
                break;
            case 6:
                drawrawpointso7tthry = drawRawPointsO7TthRY.Done;
                break;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(next, "Unknown path segment type "));
                return null;
        }
        if (drawrawpointso7tthry != drawRawPointsO7TthRY.Conic || this.RemoteActionCompatParcelizer != drawImageRectHPBpro0.AsQuadratics) {
            return drawrawpointso7tthry;
        }
        conicConverter.read(fArr[i + 6], this.MediaBrowserCompatMediaItem, fArr, i);
        if (conicConverter.IconCompatParcelizer > 0) {
            conicConverter.serializer(fArr, i);
        }
        return drawRawPointsO7TthRY.Quadratic;
    }

    @Override // o.drawPath
    public final int serializer(boolean z) {
        boolean z2 = z && this.RemoteActionCompatParcelizer == drawImageRectHPBpro0.AsQuadratics;
        android.graphics.PathIterator pathIterator = this.IconCompatParcelizer.getPathIterator();
        pathIterator.getClass();
        float[] fArr = new float[8];
        int i = 0;
        while (pathIterator.hasNext()) {
            if (pathIterator.next(fArr, 0) == 3 && z2) {
                float f = fArr[6];
                float f2 = this.MediaBrowserCompatMediaItem;
                androidx.graphics.path.ConicConverter conicConverter = this.serializer;
                conicConverter.read(f, f2, fArr, 0);
                i += conicConverter.IconCompatParcelizer;
            } else {
                i++;
            }
        }
        return i;
    }
}
