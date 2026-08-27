package o;

import android.os.Build;
import android.widget.EdgeEffect;
import bo.app.n$$ExternalSyntheticLambda0;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class PagerWrapperFlingBehavior {
    public static final androidx.compose.foundation.ScrollState read(int i, getBirthDateFull getbirthdatefull, int i2) {
        Object[] objArr = new Object[0];
        boolean z = (((i & 14) ^ 6) > 4 && ((getPostalCode) getbirthdatefull).read(0)) || (i & 6) == 4;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new n$$ExternalSyntheticLambda0(0, 1);
            getpostalcode.write(objComponentActivity);
        }
        return (androidx.compose.foundation.ScrollState) getEventType.RemoteActionCompatParcelizer(objArr, androidx.compose.foundation.ScrollState.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 0);
    }

    public static androidx.compose.ui.Modifier serializer(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState) {
        return serializer(modifier, scrollState, true, false);
    }

    public static androidx.compose.ui.Modifier serializer(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, boolean z2) {
        SelectionHandleIcon selectionHandleIcon = z2 ? SelectionHandleIcon.Vertical : SelectionHandleIcon.Horizontal;
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = scrollState.MediaBrowserCompatMediaItem;
        float f = androidx.compose.foundation.ClipScrollableContainerKt.read;
        return modifier.then(selectionHandleIcon == SelectionHandleIcon.Vertical ? androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.Companion, androidx.compose.foundation.VerticalScrollableClipShape.serializer) : androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.Companion, androidx.compose.foundation.HorizontalScrollableClipShape.serializer)).then(new AnnotatedStringResolveInlineContentKt(null, null, null, selectionHandleIcon, scrollState, mutableInteractionSourceImpl, z, true)).then(new androidx.compose.foundation.ScrollingLayoutElement(scrollState, z2));
    }

    public static float RemoteActionCompatParcelizer(EdgeEffect edgeEffect, float f, float f2, androidx.compose.ui.unit.Density density) {
        float f3 = LazyLayoutItemAnimator.serializer;
        double density2 = density.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) LazyLayoutItemAnimator.serializer) * density2;
        float fExp = (float) (Math.exp((LazyLayoutItemAnimator.RemoteActionCompatParcelizer / LazyLayoutItemAnimator.read) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iWrite = MathKt.write(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iWrite);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iWrite);
        }
        return f;
    }

    public static androidx.compose.ui.Modifier IconCompatParcelizer(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return serializer(modifier, scrollState, z, true);
    }
}
