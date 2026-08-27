package androidx.compose.ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntSize;
import o.component17NrFUSI;
import o.component19;
import o.copycp5nf6A;
import o.getRotationX;
import o.graphicsLayerAp8cVGQ;
import o.graphicsLayer_6ThJ44default;
import o.graphicsLayerpANQ8Wg;
import o.graphicsLayersKFY_QE;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidWindowInfo_androidKt {
    public static final DerivedSize calculateWindowSize(View view) {
        graphicsLayersKFY_QE graphicslayerskfy_qe;
        Context context = view.getContext();
        Context contextTryUnwrapContext = tryUnwrapContext(context);
        if (contextTryUnwrapContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            return DerivedSize.Companion.m2720fromDpSizeitqla9I(DpKt.m3695DpSizeYgX7TsA(Dp.m3673constructorimpl(configuration.screenWidthDp), Dp.m3673constructorimpl(configuration.screenHeightDp)), AndroidDensity_androidKt.Density(context));
        }
        component19.read.getClass();
        copycp5nf6A copycp5nf6a = copycp5nf6A.IconCompatParcelizer;
        getRotationX getrotationx = copycp5nf6A.serializer;
        getrotationx.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            graphicslayerskfy_qe = graphicsLayer_6ThJ44default.RemoteActionCompatParcelizer;
        } else {
            graphicslayerskfy_qe = i >= 30 ? graphicsLayerAp8cVGQ.RemoteActionCompatParcelizer : graphicsLayerpANQ8Wg.serializer;
        }
        component17NrFUSI component17nrfusi = graphicslayerskfy_qe.read(contextTryUnwrapContext, getrotationx.serializer);
        return DerivedSize.Companion.m2721fromPxSizeviCIZxY(IntSize.m3839constructorimpl((((long) component17nrfusi.IconCompatParcelizer().width()) << 32) | (((long) component17nrfusi.IconCompatParcelizer().height()) & 4294967295L)), AndroidDensity_androidKt.Density(contextTryUnwrapContext));
    }

    private static final Context tryUnwrapContext(Context context) {
        while (context instanceof ContextWrapper) {
            if ((context instanceof Activity) || (context instanceof InputMethodService) || (context instanceof Application)) {
                return context;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                return null;
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }
}
