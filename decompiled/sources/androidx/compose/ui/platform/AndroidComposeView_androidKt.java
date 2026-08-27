package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.text.input.PlatformTextInputService;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static final int maskForNonWindowMetricsChanges = 1342235263;
    private static r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM platformTextInputServiceInterceptor = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean diffForWindowMetricsChanged(Configuration configuration, Configuration configuration2) {
        return (configuration.diff(configuration2) & (-1342235264)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionWrapper getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    public static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    public static final void setPlatformTextInputServiceInterceptor(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        platformTextInputServiceInterceptor = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m2690dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        float f = fArr[i3];
        float f2 = fArr2[i2];
        float f3 = fArr[i3 + 1];
        float f4 = fArr2[i2 + 4];
        return (fArr[i3 + 3] * fArr2[i2 + 12]) + (fArr[i3 + 2] * fArr2[i2 + 8]) + (f3 * f4) + (f * f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m2691preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM2690dotp89u6pk = m2690dotp89u6pk(fArr2, 0, fArr, 0);
        float fM2690dotp89u6pk2 = m2690dotp89u6pk(fArr2, 0, fArr, 1);
        float fM2690dotp89u6pk3 = m2690dotp89u6pk(fArr2, 0, fArr, 2);
        float fM2690dotp89u6pk4 = m2690dotp89u6pk(fArr2, 0, fArr, 3);
        float fM2690dotp89u6pk5 = m2690dotp89u6pk(fArr2, 1, fArr, 0);
        float fM2690dotp89u6pk6 = m2690dotp89u6pk(fArr2, 1, fArr, 1);
        float fM2690dotp89u6pk7 = m2690dotp89u6pk(fArr2, 1, fArr, 2);
        float fM2690dotp89u6pk8 = m2690dotp89u6pk(fArr2, 1, fArr, 3);
        float fM2690dotp89u6pk9 = m2690dotp89u6pk(fArr2, 2, fArr, 0);
        float fM2690dotp89u6pk10 = m2690dotp89u6pk(fArr2, 2, fArr, 1);
        float fM2690dotp89u6pk11 = m2690dotp89u6pk(fArr2, 2, fArr, 2);
        float fM2690dotp89u6pk12 = m2690dotp89u6pk(fArr2, 2, fArr, 3);
        float fM2690dotp89u6pk13 = m2690dotp89u6pk(fArr2, 3, fArr, 0);
        float fM2690dotp89u6pk14 = m2690dotp89u6pk(fArr2, 3, fArr, 1);
        float fM2690dotp89u6pk15 = m2690dotp89u6pk(fArr2, 3, fArr, 2);
        float fM2690dotp89u6pk16 = m2690dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM2690dotp89u6pk;
        fArr[1] = fM2690dotp89u6pk2;
        fArr[2] = fM2690dotp89u6pk3;
        fArr[3] = fM2690dotp89u6pk4;
        fArr[4] = fM2690dotp89u6pk5;
        fArr[5] = fM2690dotp89u6pk6;
        fArr[6] = fM2690dotp89u6pk7;
        fArr[7] = fM2690dotp89u6pk8;
        fArr[8] = fM2690dotp89u6pk9;
        fArr[9] = fM2690dotp89u6pk10;
        fArr[10] = fM2690dotp89u6pk11;
        fArr[11] = fM2690dotp89u6pk12;
        fArr[12] = fM2690dotp89u6pk13;
        fArr[13] = fM2690dotp89u6pk14;
        fArr[14] = fM2690dotp89u6pk15;
        fArr[15] = fM2690dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{view2, view}, iWrite3)).booleanValue()) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m2692preTranslatecG2Xzmc(float[] fArr, float f, float f2, float[] fArr2) {
        Matrix.m978resetimpl(fArr2);
        Matrix.m991translateimpl$default(fArr2, f, f2, 0.0f, 4, null);
        m2691preTransformJiSxe2E(fArr, fArr2);
    }
}
