package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FloatingActionButtonKt;
import o.IconButtonColors;
import o.IconKt;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onRemeasuredozmzZPI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class BoxKt {
    public static final IconButtonColors serializer;
    public static final onRemeasuredozmzZPI RemoteActionCompatParcelizer = write(true);
    public static final onRemeasuredozmzZPI IconCompatParcelizer = write(false);

    static {
        Alignment.Companion.getTopStart();
        serializer = IconButtonColors.read;
    }

    public static final MeasurePolicy read(Alignment alignment, boolean z) {
        MeasurePolicy measurePolicy = (MeasurePolicy) (z ? RemoteActionCompatParcelizer : IconCompatParcelizer).MediaBrowserCompatMediaItem(alignment);
        return measurePolicy == null ? new BoxMeasurePolicy(alignment, z) : measurePolicy;
    }

    public static final void access$placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i, int i2, Alignment alignment) {
        Alignment alignment2;
        Object parentData = measurable.getParentData();
        FloatingActionButtonKt floatingActionButtonKt = parentData instanceof FloatingActionButtonKt ? (FloatingActionButtonKt) parentData : null;
        Placeable.PlacementScope.m2280place70tqf50$default(placementScope, placeable, ((floatingActionButtonKt == null || (alignment2 = floatingActionButtonKt.read) == null) ? alignment : alignment2).mo139alignKFBX0sM(IntSize.m3839constructorimpl((((long) placeable.getWidth()) << 32) | (((long) placeable.getHeight()) & 4294967295L)), IntSize.m3839constructorimpl((((long) i) << 32) | (((long) i2) & 4294967295L)), layoutDirection), 0.0f, 2, null);
    }

    public static final onRemeasuredozmzZPI write(boolean z) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = new onRemeasuredozmzZPI(9);
        Alignment.Companion companion = Alignment.Companion;
        onremeasuredozmzzpi.write(companion.getTopStart(), new BoxMeasurePolicy(companion.getTopStart(), z));
        onremeasuredozmzzpi.write(companion.getTopCenter(), new BoxMeasurePolicy(companion.getTopCenter(), z));
        onremeasuredozmzzpi.write(companion.getTopEnd(), new BoxMeasurePolicy(companion.getTopEnd(), z));
        onremeasuredozmzzpi.write(companion.getCenterStart(), new BoxMeasurePolicy(companion.getCenterStart(), z));
        onremeasuredozmzzpi.write(companion.getCenter(), new BoxMeasurePolicy(companion.getCenter(), z));
        onremeasuredozmzzpi.write(companion.getCenterEnd(), new BoxMeasurePolicy(companion.getCenterEnd(), z));
        onremeasuredozmzzpi.write(companion.getBottomStart(), new BoxMeasurePolicy(companion.getBottomStart(), z));
        onremeasuredozmzzpi.write(companion.getBottomCenter(), new BoxMeasurePolicy(companion.getBottomCenter(), z));
        onremeasuredozmzzpi.write(companion.getBottomEnd(), new BoxMeasurePolicy(companion.getBottomEnd(), z));
        return onremeasuredozmzzpi;
    }

    public static final void Box(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-211209833);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            AndroidContentCaptureManagerCompanion.write(getpostalcode, serializer, companion.getSetMeasurePolicy());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new IconKt(modifier, i, 0);
        }
    }
}
