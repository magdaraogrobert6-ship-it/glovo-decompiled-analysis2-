package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.MeasuredSizeAwareModifierNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import o.CommonDecorationBox;
import o.SelectionHandleIcon;
import o.TextDelegateKt;
import o.TextFieldDelegateKt;
import o.TriStateCheckbox;
import o.ceilToIntPx;
import o.getStringId9Hzcbyc;
import o.isMouseOrTouchPad;
import o.onCreateVirtualViewTranslationRequests;
import o.removeNodeAtDepth;
import o.resolvedString;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, MeasuredSizeAwareModifierNode {
    public boolean IconCompatParcelizer;
    public final ScrollingLogic MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final isMouseOrTouchPad RemoteActionCompatParcelizer;
    public SelectionHandleIcon read;
    public getStringId9Hzcbyc serializer;
    public final CommonDecorationBox write = new CommonDecorationBox(1);
    public long MediaBrowserCompatMediaItem = ContentInViewNodeKt.read;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final long serializer() {
        long j = this.MediaBrowserCompatMediaItem;
        return IntSize.m3842equalsimpl0(j, ContentInViewNodeKt.read) ? IntSize.Companion.m3849getZeroYbymL2g() : j;
    }

    public ContentInViewNode(SelectionHandleIcon selectionHandleIcon, ScrollingLogic scrollingLogic, boolean z, getStringId9Hzcbyc getstringid9hzcbyc, isMouseOrTouchPad ismouseortouchpad) {
        this.read = selectionHandleIcon;
        this.MediaDescriptionCompat = scrollingLogic;
        this.MediaSessionCompatQueueItem = z;
        this.serializer = getstringid9hzcbyc;
        this.RemoteActionCompatParcelizer = ismouseortouchpad;
    }

    /* JADX INFO: renamed from: access$calculateScrollDelta-I_oMVgE, reason: not valid java name */
    public static final float m26access$calculateScrollDeltaI_oMVgE(ContentInViewNode contentInViewNode, getStringId9Hzcbyc getstringid9hzcbyc, long j) {
        Rect rect;
        int iCompare;
        long j2 = contentInViewNode.MediaBrowserCompatMediaItem;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = contentInViewNode.write.read;
        int i = oncreatevirtualviewtranslationrequests.read - 1;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i2 = 2;
        int i3 = 1;
        if (i < objArr.length) {
            rect = null;
            while (i >= 0) {
                Rect rect2 = (Rect) ((TextFieldDelegateKt) objArr[i]).read.invoke();
                if (rect2 != null) {
                    long jM510getSizeNHjbRc = rect2.m510getSizeNHjbRc();
                    long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(contentInViewNode.serializer());
                    int i4 = ceilToIntPx.RemoteActionCompatParcelizer[contentInViewNode.read.ordinal()];
                    if (i4 == i3) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM510getSizeNHjbRc & 4294967295L)), Float.intBitsToFloat((int) (jM3856toSizeozmzZPI & 4294967295L)));
                    } else if (i4 == i2) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM510getSizeNHjbRc >> 32)), Float.intBitsToFloat((int) (jM3856toSizeozmzZPI >> 32)));
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return 0.0f;
                    }
                    if (iCompare > 0) {
                        if (rect != null) {
                            break;
                        }
                        rect = rect2;
                        break;
                    }
                    rect = rect2;
                }
                i--;
                i2 = 2;
                i3 = 1;
            }
        } else {
            rect = null;
        }
        if (rect == null) {
            Rect rect3 = contentInViewNode.MediaMetadataCompat ? (Rect) contentInViewNode.RemoteActionCompatParcelizer.invoke() : null;
            if (rect3 == null) {
                return 0.0f;
            }
            rect = rect3;
        }
        long jM3856toSizeozmzZPI2 = IntSizeKt.m3856toSizeozmzZPI(j2);
        int i5 = ceilToIntPx.RemoteActionCompatParcelizer[contentInViewNode.read.ordinal()];
        if (i5 == 1) {
            return getstringid9hzcbyc.serializer(rect.getTop() - IntOffset.m3802getYimpl(j), rect.getBottom() - rect.getTop(), Float.intBitsToFloat((int) (jM3856toSizeozmzZPI2 & 4294967295L)));
        }
        if (i5 == 2) {
            return getstringid9hzcbyc.serializer(rect.getLeft() - IntOffset.m3801getXimpl(j), rect.getRight() - rect.getLeft(), Float.intBitsToFloat((int) (jM3856toSizeozmzZPI2 >> 32)));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return 0.0f;
    }

    /* JADX INFO: renamed from: isMaxVisible--EQwtKw$default, reason: not valid java name */
    public static boolean m27isMaxVisibleEQwtKw$default(ContentInViewNode contentInViewNode, Rect rect, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = contentInViewNode.serializer();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = IntOffset.Companion.m3812getZeronOccac();
        }
        long jM29relocationOffsetfbGrOKE = contentInViewNode.m29relocationOffsetfbGrOKE(rect, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM29relocationOffsetfbGrOKE >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM29relocationOffsetfbGrOKE & 4294967295L))) <= 0.5f;
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public final void mo28onRemeasuredozmzZPI(long j) {
        int iSerializer;
        long jM3812getZeronOccac;
        long jSerializer = serializer();
        this.MediaBrowserCompatMediaItem = j;
        int i = ceilToIntPx.RemoteActionCompatParcelizer[this.read.ordinal()];
        if (i == 1) {
            iSerializer = removeNodeAtDepth.serializer((int) (j & 4294967295L), (int) (jSerializer & 4294967295L));
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            iSerializer = removeNodeAtDepth.serializer((int) (j >> 32), (int) (jSerializer >> 32));
        }
        if (iSerializer >= 0) {
            return;
        }
        if (this.MediaSessionCompatQueueItem) {
            jM3812getZeronOccac = IntOffset.Companion.m3812getZeronOccac();
        } else {
            jM3812getZeronOccac = this.read == SelectionHandleIcon.Vertical ? IntOffset.m3795constructorimpl(((long) (((int) (jSerializer & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L) : IntOffset.m3795constructorimpl(((long) (((int) (jSerializer >> 32)) - ((int) (j >> 32)))) << 32);
        }
        long j2 = jM3812getZeronOccac;
        Rect rect = (Rect) this.RemoteActionCompatParcelizer.invoke();
        if (rect == null || this.IconCompatParcelizer || this.MediaMetadataCompat || !m27isMaxVisibleEQwtKw$default(this, rect, jSerializer, 0L, 2) || m27isMaxVisibleEQwtKw$default(this, rect, 0L, j2, 1)) {
            return;
        }
        this.MediaMetadataCompat = true;
        read(j2);
    }

    public final void read(long j) {
        getStringId9Hzcbyc getstringid9hzcbyc = this.serializer;
        if (getstringid9hzcbyc == null) {
            getstringid9hzcbyc = (getStringId9Hzcbyc) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextDelegateKt.write);
        }
        getStringId9Hzcbyc getstringid9hzcbyc2 = getstringid9hzcbyc;
        if (this.IconCompatParcelizer) {
            TriStateCheckbox.RemoteActionCompatParcelizer("launchAnimation called when previous animation was running");
        }
        getStringId9Hzcbyc getstringid9hzcbyc3 = this.serializer;
        if (getstringid9hzcbyc3 == null) {
            getstringid9hzcbyc3 = (getStringId9Hzcbyc) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextDelegateKt.write);
        }
        getstringid9hzcbyc3.getClass();
        getStringId9Hzcbyc.write.getClass();
        BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new DefaultLocationProvider.AnonymousClass1(this, new UpdatableAnimationState(resolvedString.RemoteActionCompatParcelizer), getstringid9hzcbyc2, j, null), 1);
    }

    /* JADX INFO: renamed from: relocationOffset-fbGrOKE, reason: not valid java name */
    public final long m29relocationOffsetfbGrOKE(Rect rect, long j, long j2) {
        long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(j);
        int i = ceilToIntPx.RemoteActionCompatParcelizer[this.read.ordinal()];
        if (i == 1) {
            getStringId9Hzcbyc getstringid9hzcbyc = this.serializer;
            if (getstringid9hzcbyc == null) {
                getstringid9hzcbyc = (getStringId9Hzcbyc) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextDelegateKt.write);
            }
            return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(getstringid9hzcbyc.serializer(rect.getTop() - IntOffset.m3802getYimpl(j2), rect.getBottom() - rect.getTop(), Float.intBitsToFloat((int) (jM3856toSizeozmzZPI & 4294967295L))))) & 4294967295L));
        }
        if (i != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return 0L;
        }
        getStringId9Hzcbyc getstringid9hzcbyc2 = this.serializer;
        if (getstringid9hzcbyc2 == null) {
            getstringid9hzcbyc2 = (getStringId9Hzcbyc) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextDelegateKt.write);
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(getstringid9hzcbyc2.serializer(rect.getLeft() - IntOffset.m3801getXimpl(j2), rect.getRight() - rect.getLeft(), Float.intBitsToFloat((int) (jM3856toSizeozmzZPI >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }
}
