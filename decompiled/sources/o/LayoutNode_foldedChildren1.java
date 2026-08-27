package o;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNode_foldedChildren1 {
    public static final LayoutNodecalculateSemanticsConfiguration1 serializer = new LayoutNodecalculateSemanticsConfiguration1(0);
    public final Object RemoteActionCompatParcelizer;

    public void IconCompatParcelizer(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.write(i, 0);
        setsemanticsinvalidatedui.MediaDescriptionCompat(i2);
    }

    public void IconCompatParcelizer(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        ((setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer).write(i, (j << 1) ^ (j >> 63));
    }

    public void IconCompatParcelizer(int i, Object obj, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setInteropViewFactoryHolderui setinteropviewfactoryholderui = (setInteropViewFactoryHolderui) obj;
        setsemanticsinvalidatedui.write(i, 2);
        setsemanticsinvalidatedui.RatingCompat(setinteropviewfactoryholderui.write(getcoordinatesaccessedduringplacement));
        getcoordinatesaccessedduringplacement.RemoteActionCompatParcelizer(setinteropviewfactoryholderui, setsemanticsinvalidatedui.MediaMetadataCompat);
    }

    public void MediaMetadataCompat(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.write(i, 0);
        setsemanticsinvalidatedui.RatingCompat(i2);
    }

    public void RemoteActionCompatParcelizer(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        ((setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer).IconCompatParcelizer(i, i2);
    }

    public void RemoteActionCompatParcelizer(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        ((setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer).serializer(i, j);
    }

    public void RemoteActionCompatParcelizer(int i, setOnAttachui setonattachui) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.write(i, 2);
        setsemanticsinvalidatedui.RatingCompat(setonattachui.IconCompatParcelizer());
        setOnDetachui setondetachui = (setOnDetachui) setonattachui;
        setsemanticsinvalidatedui.read(setondetachui.RatingCompat, setondetachui.write(), setondetachui.IconCompatParcelizer());
    }

    public void read(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.write(i, 0);
        setsemanticsinvalidatedui.RatingCompat((i2 >> 31) ^ (i2 << 1));
    }

    public void read(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        ((setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer).serializer(i, j);
    }

    public void read(int i, Object obj, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.write(i, 3);
        getcoordinatesaccessedduringplacement.RemoteActionCompatParcelizer((setInteropViewFactoryHolderui) obj, setsemanticsinvalidatedui.MediaMetadataCompat);
        setsemanticsinvalidatedui.write(i, 4);
    }

    public void serializer(float f, int i) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.getClass();
        setsemanticsinvalidatedui.IconCompatParcelizer(i, Float.floatToRawIntBits(f));
    }

    public void serializer(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        ((setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer).IconCompatParcelizer(i, i2);
    }

    public void serializer(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        ((setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer).write(i, j);
    }

    public void write(double d, int i) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.getClass();
        setsemanticsinvalidatedui.serializer(i, Double.doubleToRawLongBits(d));
    }

    public void write(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.write(i, 0);
        setsemanticsinvalidatedui.MediaDescriptionCompat(i2);
    }

    public void write(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        ((setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer).write(i, j);
    }

    public void write(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.write(i, 0);
        setsemanticsinvalidatedui.read(z ? (byte) 1 : (byte) 0);
    }

    public LayoutNode_foldedChildren1() {
        getCanvasDrawScope getcanvasdrawscope;
        try {
            getcanvasdrawscope = (getCanvasDrawScope) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            getcanvasdrawscope = serializer;
        }
        getCanvasDrawScope[] getcanvasdrawscopeArr = {LayoutNodecalculateSemanticsConfiguration1.read, getcanvasdrawscope};
        LayoutNodeDrawScoperecord1 layoutNodeDrawScoperecord1 = new LayoutNodeDrawScoperecord1();
        layoutNodeDrawScoperecord1.IconCompatParcelizer = getcanvasdrawscopeArr;
        Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
        this.RemoteActionCompatParcelizer = layoutNodeDrawScoperecord1;
    }

    public LayoutNode_foldedChildren1(setSemanticsInvalidatedui setsemanticsinvalidatedui) {
        getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(setsemanticsinvalidatedui, "output");
        this.RemoteActionCompatParcelizer = setsemanticsinvalidatedui;
        setsemanticsinvalidatedui.MediaMetadataCompat = this;
    }
}
