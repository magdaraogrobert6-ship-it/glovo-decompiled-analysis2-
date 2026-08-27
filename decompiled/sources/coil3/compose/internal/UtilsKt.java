package coil3.compose.internal;

import android.content.Context;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.ConstraintsSizeResolver;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.math.MathKt;
import o.AndroidContentCaptureManager;
import o.LinearGradientShaderVjE6UOU;
import o.PathFillType;
import o.PathGeometryKt;
import o.ShaderKt;
import o.SimpleGraphicsLayerModifierlayerBlock1;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.removeNodeAtDepth;
import o.setTransformQ8lPUPs;
import o.supportsColorMatrixQuery;

/* JADX INFO: loaded from: classes.dex */
public abstract class UtilsKt {
    public static final long RemoteActionCompatParcelizer = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);
    public static final /* synthetic */ int write = 0;

    public static final void RemoteActionCompatParcelizer(ShaderKt shaderKt) {
        Object obj = shaderKt.write;
        if (obj instanceof setTransformQ8lPUPs) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof ImageBitmap) {
            RemoteActionCompatParcelizer("ImageBitmap");
            throw null;
        }
        if (obj instanceof ImageVector) {
            RemoteActionCompatParcelizer("ImageVector");
            throw null;
        }
        if (obj instanceof Painter) {
            RemoteActionCompatParcelizer("Painter");
            throw null;
        }
        if (shaderKt.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("request.target must be null.");
            return;
        }
        Object[] objArr = {shaderKt, LinearGradientShaderVjE6UOU.write};
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        if (((supportsColorMatrixQuery) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr)) == null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("request.lifecycle must be null.");
    }

    public static final SimpleGraphicsLayerModifierlayerBlock1 serializer(ContentScale contentScale, getBirthDateFull getbirthdatefull) {
        Object obj;
        Object obj2;
        Object[] objArr = {contentScale, ContentScale.Companion.getNone()};
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        boolean zWrite = getpostalcode.write(zBooleanValue);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (zWrite || objComponentActivity == getCreditCardExpirationMonth.write) {
            if (zBooleanValue) {
                obj = SimpleGraphicsLayerModifierlayerBlock1.serializer;
            } else {
                ConstraintsSizeResolver constraintsSizeResolver = new ConstraintsSizeResolver();
                constraintsSizeResolver.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer;
                constraintsSizeResolver.write = new ArrayList();
                obj = constraintsSizeResolver;
            }
            Object obj3 = obj;
            getpostalcode.write(obj3);
            obj2 = obj3;
        }
        obj2 = objComponentActivity;
        return (SimpleGraphicsLayerModifierlayerBlock1) obj2;
    }

    public static final PathFillType RemoteActionCompatParcelizer(getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!((Boolean) getpostalcode.write((getNewPassword) InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            getpostalcode.serializer(2019088453);
            getpostalcode.IconCompatParcelizer(false);
            return null;
        }
        getpostalcode.serializer(2019030948);
        PathFillType pathFillType = (PathFillType) getpostalcode.write((getNewPassword) PathGeometryKt.serializer());
        getpostalcode.IconCompatParcelizer(false);
        return pathFillType;
    }

    public static void RemoteActionCompatParcelizer(String str) {
        throw new IllegalArgumentException(af$$ExternalSyntheticOutline0.m("Unsupported type: ", str, ". ", ff$$ExternalSyntheticOutline0.m("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final ShaderKt IconCompatParcelizer(Object obj, ContentScale contentScale, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.serializer(-329318062);
        boolean z = obj instanceof ShaderKt;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (!z) {
            getpostalcode.serializer(-1008595950);
            Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock1Serializer = serializer(contentScale, getpostalcode);
            boolean z2 = getpostalcode.read(context);
            boolean z3 = getpostalcode.read(obj);
            boolean z4 = getpostalcode.read(simpleGraphicsLayerModifierlayerBlock1Serializer);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z2 | z3 | z4) || objComponentActivity == androidContentCaptureManager) {
                setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs(context);
                settransformq8lpups.IconCompatParcelizer = obj;
                settransformq8lpups.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = simpleGraphicsLayerModifierlayerBlock1Serializer;
                objComponentActivity = settransformq8lpups.IconCompatParcelizer();
                getpostalcode.write(objComponentActivity);
            }
            ShaderKt shaderKt = (ShaderKt) objComponentActivity;
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(false);
            return shaderKt;
        }
        getpostalcode.serializer(-1008942344);
        ShaderKt shaderKt2 = (ShaderKt) obj;
        if (shaderKt2.serializer.RatingCompat != null) {
            getpostalcode.serializer(-1008902292);
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(false);
            return shaderKt2;
        }
        getpostalcode.serializer(-1008854118);
        SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock1Serializer2 = serializer(contentScale, getpostalcode);
        boolean z5 = getpostalcode.read(obj);
        boolean z6 = getpostalcode.read(simpleGraphicsLayerModifierlayerBlock1Serializer2);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if ((z5 | z6) || objComponentActivity2 == androidContentCaptureManager) {
            setTransformQ8lPUPs settransformq8lpupsWrite = ShaderKt.write(shaderKt2);
            settransformq8lpupsWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = simpleGraphicsLayerModifierlayerBlock1Serializer2;
            objComponentActivity2 = settransformq8lpupsWrite.IconCompatParcelizer();
            getpostalcode.write(objComponentActivity2);
        }
        ShaderKt shaderKt3 = (ShaderKt) objComponentActivity2;
        af$$ExternalSyntheticOutline0.m(getpostalcode, false, false, false);
        return shaderKt3;
    }

    public static final ShaderKt RemoteActionCompatParcelizer(Object obj, getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.serializer(1319639034);
        if (obj instanceof ShaderKt) {
            getpostalcode.serializer(1530875884);
            ShaderKt shaderKt = (ShaderKt) obj;
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(false);
            return shaderKt;
        }
        getpostalcode.serializer(1530915130);
        Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
        boolean z = getpostalcode.read(context);
        boolean z2 = getpostalcode.read(obj);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if ((z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
            setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs(context);
            settransformq8lpups.IconCompatParcelizer = obj;
            objComponentActivity = settransformq8lpups.IconCompatParcelizer();
            getpostalcode.write(objComponentActivity);
        }
        ShaderKt shaderKt2 = (ShaderKt) objComponentActivity;
        getpostalcode.IconCompatParcelizer(false);
        getpostalcode.IconCompatParcelizer(false);
        return shaderKt2;
    }

    /* JADX INFO: renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m3985toIntSizeuvyYCjk(long j) {
        return IntSize.m3839constructorimpl((((long) MathKt.write(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) MathKt.write(Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }
}
