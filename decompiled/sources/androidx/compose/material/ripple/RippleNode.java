package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.location.logic.E5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import o.AndroidAutofillType_androidKt;
import o.Button;
import o.ButtonElevationanimateElevation21;
import o.ButtonKtButton21;
import o.CheckboxKt;
import o.ContentInViewNode;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.UiMediaScopePointerPrecisionCompanion;
import o.setDetachedListenerui;
import o.setInsertedNodeAwaitingAttachForInvalidationui;
import o.setOwnerScopeui;
import o.setUpdatedNodeAwaitingAttachForInvalidationui;

/* JADX INFO: loaded from: classes.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public final boolean IconCompatParcelizer;
    public final AndroidAutofillType_androidKt MediaDescriptionCompat;
    public final float MediaSessionCompatQueueItem;
    public float PlaybackStateCompat;
    public E5 RatingCompat;
    private final ColorProducer color;
    public boolean serializer;
    public final MutableInteractionSourceImpl write;
    public long MediaMetadataCompat = Size.Companion.m555getZeroNHjbRc();
    public final ContentInViewNode MediaBrowserCompatMediaItem = new ContentInViewNode();

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public final void mo28onRemeasuredozmzZPI(long j) {
        float fMo48toPx0680j_4;
        this.serializer = true;
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        this.MediaMetadataCompat = IntSizeKt.m3856toSizeozmzZPI(j);
        float f = this.MediaSessionCompatQueueItem;
        if (Float.isNaN(f)) {
            long j2 = this.MediaMetadataCompat;
            float f2 = setInsertedNodeAwaitingAttachForInvalidationui.serializer;
            fMo48toPx0680j_4 = Offset.m475getDistanceimpl(OffsetKt.Offset(Size.m546getWidthimpl(j2), Size.m543getHeightimpl(j2))) / 2.0f;
            if (this.IconCompatParcelizer) {
                fMo48toPx0680j_4 += densityRequireDensity.mo48toPx0680j_4(setInsertedNodeAwaitingAttachForInvalidationui.serializer);
            }
        } else {
            fMo48toPx0680j_4 = densityRequireDensity.mo48toPx0680j_4(f);
        }
        this.PlaybackStateCompat = fMo48toPx0680j_4;
        ContentInViewNode contentInViewNode = this.MediaBrowserCompatMediaItem;
        Object[] objArr = contentInViewNode.read;
        int i = contentInViewNode.IconCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            handlePressInteraction((ButtonElevationanimateElevation21) objArr[i2]);
        }
        contentInViewNode.IconCompatParcelizer();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) throws Throwable {
        long j;
        contentDrawScope.drawContent();
        E5 e5 = this.RatingCompat;
        if (e5 != null) {
            float f = this.PlaybackStateCompat;
            long jMo803invoke0d7_KjU = this.color.mo803invoke0d7_KjU();
            float fFloatValue = ((Number) ((Animatable) e5.write).write()).floatValue();
            if (fFloatValue > 0.0f) {
                long jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(jMo803invoke0d7_KjU, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                if (e5.read) {
                    float fM546getWidthimpl = Size.m546getWidthimpl(contentDrawScope.mo1304getSizeNHjbRc());
                    float fM543getHeightimpl = Size.m543getHeightimpl(contentDrawScope.mo1304getSizeNHjbRc());
                    int iM711getIntersectrtfAjoo = ClipOp.Companion.m711getIntersectrtfAjoo();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo1228clipRectN_I0leg(0.0f, 0.0f, fM546getWidthimpl, fM543getHeightimpl, iM711getIntersectrtfAjoo);
                        try {
                            DrawScope.m1285drawCircleVaOC9Bg$default(contentDrawScope, jM721copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, 124, null);
                            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
                        } catch (Throwable th) {
                            th = th;
                            j = jMo1225getSizeNHjbRc;
                            c8$$ExternalSyntheticOutline0.m(drawContext, j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j = jMo1225getSizeNHjbRc;
                    }
                } else {
                    DrawScope.m1285drawCircleVaOC9Bg$default(contentDrawScope, jM721copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, 124, null);
                }
            }
        }
        setDetachedListenerui setdetachedlistenerui = (setDetachedListenerui) this;
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        setOwnerScopeui setownerscopeui = setdetachedlistenerui.RemoteActionCompatParcelizer;
        if (setownerscopeui != null) {
            long j2 = setdetachedlistenerui.MediaMetadataCompat;
            int iWrite = MathKt.write(setdetachedlistenerui.PlaybackStateCompat);
            long jMo803invoke0d7_KjU2 = setdetachedlistenerui.color.mo803invoke0d7_KjU();
            setdetachedlistenerui.MediaDescriptionCompat.invoke();
            setownerscopeui.m5155setRipplePropertiesbiQXAtU(j2, jMo803invoke0d7_KjU2, iWrite);
            setownerscopeui.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    public RippleNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, float f, UiMediaScopePointerPrecisionCompanion uiMediaScopePointerPrecisionCompanion, AndroidAutofillType_androidKt androidAutofillType_androidKt) {
        this.write = mutableInteractionSourceImpl;
        this.IconCompatParcelizer = z;
        this.MediaSessionCompatQueueItem = f;
        this.color = uiMediaScopePointerPrecisionCompanion;
        this.MediaDescriptionCompat = androidAutofillType_androidKt;
    }

    public final void handlePressInteraction(ButtonElevationanimateElevation21 buttonElevationanimateElevation21) {
        setOwnerScopeui setownerscopeui;
        setOwnerScopeui setownerscopeui2;
        if (!(buttonElevationanimateElevation21 instanceof Button)) {
            if (buttonElevationanimateElevation21 instanceof ButtonKtButton21) {
                setOwnerScopeui setownerscopeui3 = ((setDetachedListenerui) this).RemoteActionCompatParcelizer;
                if (setownerscopeui3 != null) {
                    setownerscopeui3.IconCompatParcelizer();
                    return;
                }
                return;
            }
            if (!(buttonElevationanimateElevation21 instanceof CheckboxKt) || (setownerscopeui = ((setDetachedListenerui) this).RemoteActionCompatParcelizer) == null) {
                return;
            }
            setownerscopeui.IconCompatParcelizer();
            return;
        }
        Button button = (Button) buttonElevationanimateElevation21;
        long j = this.MediaMetadataCompat;
        float f = this.PlaybackStateCompat;
        setDetachedListenerui setdetachedlistenerui = (setDetachedListenerui) this;
        setUpdatedNodeAwaitingAttachForInvalidationui setupdatednodeawaitingattachforinvalidationui = setdetachedlistenerui.read;
        if (setupdatednodeawaitingattachforinvalidationui == null) {
            Object obj = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(setdetachedlistenerui, AndroidCompositionLocals_androidKt.getLocalView());
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    setUpdatedNodeAwaitingAttachForInvalidationui setupdatednodeawaitingattachforinvalidationui2 = new setUpdatedNodeAwaitingAttachForInvalidationui(viewGroup.getContext());
                    viewGroup.addView(setupdatednodeawaitingattachforinvalidationui2);
                    setupdatednodeawaitingattachforinvalidationui = setupdatednodeawaitingattachforinvalidationui2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof setUpdatedNodeAwaitingAttachForInvalidationui) {
                        setupdatednodeawaitingattachforinvalidationui = (setUpdatedNodeAwaitingAttachForInvalidationui) childAt;
                        break;
                    }
                    i++;
                }
            }
            setdetachedlistenerui.read = setupdatednodeawaitingattachforinvalidationui;
        }
        ArrayList arrayList = setupdatednodeawaitingattachforinvalidationui.IconCompatParcelizer;
        RippleHostMap rippleHostMap = setupdatednodeawaitingattachforinvalidationui.read;
        LinkedHashMap linkedHashMap = rippleHostMap.read;
        LinkedHashMap linkedHashMap2 = rippleHostMap.read;
        LinkedHashMap linkedHashMap3 = rippleHostMap.RemoteActionCompatParcelizer;
        setOwnerScopeui setownerscopeui4 = (setOwnerScopeui) linkedHashMap.get(setdetachedlistenerui);
        if (setownerscopeui4 == null) {
            ArrayList arrayList2 = setupdatednodeawaitingattachforinvalidationui.serializer;
            arrayList2.getClass();
            setownerscopeui4 = (setOwnerScopeui) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (setownerscopeui4 == null) {
                if (setupdatednodeawaitingattachforinvalidationui.RemoteActionCompatParcelizer > SQLite.write((List) arrayList)) {
                    setownerscopeui2 = new setOwnerScopeui(setupdatednodeawaitingattachforinvalidationui.getContext());
                    setupdatednodeawaitingattachforinvalidationui.addView(setownerscopeui2);
                    arrayList.add(setownerscopeui2);
                } else {
                    setownerscopeui2 = (setOwnerScopeui) arrayList.get(setupdatednodeawaitingattachforinvalidationui.RemoteActionCompatParcelizer);
                    setDetachedListenerui setdetachedlistenerui2 = (setDetachedListenerui) linkedHashMap3.get(setownerscopeui2);
                    if (setdetachedlistenerui2 != null) {
                        setdetachedlistenerui2.RemoteActionCompatParcelizer = null;
                        DrawModifierNodeKt.invalidateDraw(setdetachedlistenerui2);
                        setOwnerScopeui setownerscopeui5 = (setOwnerScopeui) linkedHashMap2.get(setdetachedlistenerui2);
                        if (setownerscopeui5 != null) {
                        }
                        linkedHashMap2.remove(setdetachedlistenerui2);
                        setownerscopeui2.RemoteActionCompatParcelizer();
                    }
                }
                int i2 = setupdatednodeawaitingattachforinvalidationui.RemoteActionCompatParcelizer;
                if (i2 < setupdatednodeawaitingattachforinvalidationui.write - 1) {
                    setupdatednodeawaitingattachforinvalidationui.RemoteActionCompatParcelizer = i2 + 1;
                } else {
                    setupdatednodeawaitingattachforinvalidationui.RemoteActionCompatParcelizer = 0;
                }
                setownerscopeui4 = setownerscopeui2;
            }
            linkedHashMap2.put(setdetachedlistenerui, setownerscopeui4);
            linkedHashMap3.put(setownerscopeui4, setdetachedlistenerui);
        }
        setOwnerScopeui setownerscopeui6 = setownerscopeui4;
        int iWrite = MathKt.write(f);
        long jMo803invoke0d7_KjU = setdetachedlistenerui.color.mo803invoke0d7_KjU();
        setdetachedlistenerui.MediaDescriptionCompat.invoke();
        setownerscopeui6.RemoteActionCompatParcelizer(button, setdetachedlistenerui.IconCompatParcelizer, j, iWrite, jMo803invoke0d7_KjU, new CoroutineLiveData$$ExternalSyntheticLambda0(20, setdetachedlistenerui));
        setdetachedlistenerui.RemoteActionCompatParcelizer = setownerscopeui6;
        DrawModifierNodeKt.invalidateDraw(setdetachedlistenerui);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new BlockRunner$maybeRun$1(this, (ShortNewsContentCardView) null, 18), 3);
    }
}
