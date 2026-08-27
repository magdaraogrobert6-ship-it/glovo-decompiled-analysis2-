package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import bo.app.a5$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.KeyedComposedModifierN;
import o.MediaQueryKt;
import o.OutlinedTextFieldDefaults;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public int IconCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaBrowserCompatMediaItem;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat;
    public ColorProducer MediaSessionCompatQueueItem;
    public TextStyle MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public List ParcelableVolumeInfo;
    public AnnotatedString PlaybackStateCompat;
    public KeyedComposedModifierN PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public FontFamily.Resolver RemoteActionCompatParcelizer;
    public MediaQueryKt ResultReceiver;
    public MultiParagraphLayoutCache read;
    public int serializer;
    public Map write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            MultiParagraphLayoutCache multiParagraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(measureScope);
            boolean zRemoteActionCompatParcelizer = multiParagraphLayoutCacheRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(j, measureScope.getLayoutDirection());
            TextLayoutResult textLayoutResult = multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat;
            if (textLayoutResult == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + multiParagraphLayoutCacheRemoteActionCompatParcelizer);
            }
            textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
            if (zRemoteActionCompatParcelizer) {
                LayoutModifierNodeKt.invalidateLayer(this);
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.MediaDescriptionCompat;
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(textLayoutResult);
                }
                Map linkedHashMap = this.write;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline())));
                linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())));
                this.write = linkedHashMap;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.MediaMetadataCompat;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(textLayoutResult.getPlaceholderRects());
            }
            Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(Constraints.Companion.m3635fitPrioritizingWidthZbe2FdA((int) (textLayoutResult.m3047getSizeYbymL2g() >> 32), (int) (textLayoutResult.m3047getSizeYbymL2g() >> 32), (int) (textLayoutResult.m3047getSizeYbymL2g() & 4294967295L), (int) (textLayoutResult.m3047getSizeYbymL2g() & 4294967295L)));
            int iM3047getSizeYbymL2g = (int) (textLayoutResult.m3047getSizeYbymL2g() >> 32);
            int iM3047getSizeYbymL2g2 = (int) (textLayoutResult.m3047getSizeYbymL2g() & 4294967295L);
            Map<AlignmentLine, Integer> map = this.write;
            map.getClass();
            MeasureResult measureResultLayout = measureScope.layout(iM3047getSizeYbymL2g, iM3047getSizeYbymL2g2, map, new OutlinedTextFieldDefaults(placeableMo2209measureBRTryo0, 3));
            Trace.endSection();
            return measureResultLayout;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return RemoteActionCompatParcelizer(intrinsicMeasureScope).read(intrinsicMeasureScope.getLayoutDirection(), i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return TextDelegateKt.ceilToIntPx(RemoteActionCompatParcelizer(intrinsicMeasureScope).IconCompatParcelizer(intrinsicMeasureScope.getLayoutDirection()).getMaxIntrinsicWidth());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return RemoteActionCompatParcelizer(intrinsicMeasureScope).read(intrinsicMeasureScope.getLayoutDirection(), i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return TextDelegateKt.ceilToIntPx(RemoteActionCompatParcelizer(intrinsicMeasureScope).IconCompatParcelizer(intrinsicMeasureScope.getLayoutDirection()).getMinIntrinsicWidth());
    }

    public final MultiParagraphLayoutCache RemoteActionCompatParcelizer() {
        if (this.read == null) {
            this.read = new MultiParagraphLayoutCache(this.PlaybackStateCompat, this.MediaSessionCompatResultReceiverWrapper, this.RemoteActionCompatParcelizer, this.RatingCompat, this.MediaSessionCompatToken, this.IconCompatParcelizer, this.serializer, this.ParcelableVolumeInfo);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this.read;
        multiParagraphLayoutCache.getClass();
        return multiParagraphLayoutCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.KeyedComposedModifierN] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        KeyedComposedModifierN keyedComposedModifierN = this.PlaybackStateCompatCustomAction;
        ?? r0 = keyedComposedModifierN;
        if (keyedComposedModifierN == null) {
            final int i = 0;
            ?? r1 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.KeyedComposedModifierN
                public final /* synthetic */ androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = this;
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    int i2 = i;
                    androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode textAnnotatedStringNode = this.IconCompatParcelizer;
                    boolean z = false;
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult = null;
                    if (i2 == 0) {
                        List list = (List) obj;
                        androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = textAnnotatedStringNode.RemoteActionCompatParcelizer().RatingCompat;
                        if (textLayoutResult2 != null) {
                            androidx.compose.ui.text.AnnotatedString text = textLayoutResult2.getLayoutInput().getText();
                            androidx.compose.ui.text.TextStyle textStyle = textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper;
                            androidx.compose.ui.graphics.ColorProducer colorProducer = textAnnotatedStringNode.MediaSessionCompatQueueItem;
                            androidx.compose.ui.text.TextLayoutResult textLayoutResultM3044copyO0kMr_c$default = androidx.compose.ui.text.TextLayoutResult.m3044copyO0kMr_c$default(textLayoutResult2, new androidx.compose.ui.text.TextLayoutInput(text, textStyle.m3121mergedA7vx0o((16609104 & 1) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo803invoke0d7_KjU() : androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU(), (16609104 & 2) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? androidx.compose.ui.text.style.TextAlign.Companion.m3517getUnspecifiede0LSkKk() : 0, (16609104 & 65536) != 0 ? androidx.compose.ui.text.style.TextDirection.Companion.m3533getUnspecifieds_7Xco() : 0, (16609104 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? null : null, (16609104 & 1048576) != 0 ? androidx.compose.ui.text.style.LineBreak.Companion.m3429getUnspecifiedrAG3T2k() : 0, (16609104 & 2097152) != 0 ? androidx.compose.ui.text.style.Hyphens.Companion.m3405getUnspecifiedvmbZdU8() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null), textLayoutResult2.getLayoutInput().getPlaceholders(), textLayoutResult2.getLayoutInput().getMaxLines(), textLayoutResult2.getLayoutInput().getSoftWrap(), textLayoutResult2.getLayoutInput().m3043getOverflowgIe3tQ8(), textLayoutResult2.getLayoutInput().getDensity(), textLayoutResult2.getLayoutInput().getLayoutDirection(), textLayoutResult2.getLayoutInput().getFontFamilyResolver(), textLayoutResult2.getLayoutInput().m3042getConstraintsmsEJaDk(), (DefaultConstructorMarker) null), 0L, 2, null);
                            if (textLayoutResultM3044copyO0kMr_c$default != null) {
                                list.add(textLayoutResultM3044copyO0kMr_c$default);
                                textLayoutResult = textLayoutResultM3044copyO0kMr_c$default;
                            }
                        }
                        return Boolean.valueOf(textLayoutResult != null);
                    }
                    if (i2 != 1) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        MediaQueryKt mediaQueryKt = textAnnotatedStringNode.ResultReceiver;
                        if (mediaQueryKt != null) {
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = textAnnotatedStringNode.MediaBrowserCompatMediaItem;
                            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(mediaQueryKt);
                            }
                            MediaQueryKt mediaQueryKt2 = textAnnotatedStringNode.ResultReceiver;
                            if (mediaQueryKt2 != null) {
                                mediaQueryKt2.IconCompatParcelizer(zBooleanValue);
                            }
                            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textAnnotatedStringNode);
                            androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textAnnotatedStringNode);
                            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    androidx.compose.ui.text.AnnotatedString annotatedString = (androidx.compose.ui.text.AnnotatedString) obj;
                    MediaQueryKt mediaQueryKt3 = textAnnotatedStringNode.ResultReceiver;
                    instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                    if (mediaQueryKt3 != null) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{annotatedString, mediaQueryKt3.serializer()}, getCieXyz.write())).booleanValue()) {
                            mediaQueryKt3.write(annotatedString);
                            androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCacheRemoteActionCompatParcelizer = mediaQueryKt3.RemoteActionCompatParcelizer();
                            if (multiParagraphLayoutCacheRemoteActionCompatParcelizer != null) {
                                androidx.compose.ui.text.TextStyle textStyle2 = textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper;
                                androidx.compose.ui.text.font.FontFamily.Resolver resolver = textAnnotatedStringNode.RemoteActionCompatParcelizer;
                                int i3 = textAnnotatedStringNode.RatingCompat;
                                boolean z2 = textAnnotatedStringNode.MediaSessionCompatToken;
                                int i4 = textAnnotatedStringNode.IconCompatParcelizer;
                                int i5 = textAnnotatedStringNode.serializer;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.ComponentActivity = annotatedString;
                                boolean zHasSameLayoutAffectingAttributes = textStyle2.hasSameLayoutAffectingAttributes(multiParagraphLayoutCacheRemoteActionCompatParcelizer.ResultReceiver);
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.ResultReceiver = textStyle2;
                                if (!zHasSameLayoutAffectingAttributes) {
                                    multiParagraphLayoutCacheRemoteActionCompatParcelizer.read <<= 2;
                                    multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatToken = null;
                                    multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat = null;
                                    multiParagraphLayoutCacheRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = -1;
                                    multiParagraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer = -1;
                                }
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.write = resolver;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompat = i3;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.ParcelableVolumeInfo = z2;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatQueueItem = i4;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper = i5;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction = instance_delegatelambda0Var;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.read = (multiParagraphLayoutCacheRemoteActionCompatParcelizer.read << 2) | 2;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatToken = null;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat = null;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = -1;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer = -1;
                            }
                        }
                    } else {
                        MediaQueryKt mediaQueryKt4 = new MediaQueryKt(textAnnotatedStringNode.PlaybackStateCompat, annotatedString);
                        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache = new androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache(annotatedString, textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper, textAnnotatedStringNode.RemoteActionCompatParcelizer, textAnnotatedStringNode.RatingCompat, textAnnotatedStringNode.MediaSessionCompatToken, textAnnotatedStringNode.IconCompatParcelizer, textAnnotatedStringNode.serializer, instance_delegatelambda0Var);
                        multiParagraphLayoutCache.write(textAnnotatedStringNode.RemoteActionCompatParcelizer().serializer);
                        mediaQueryKt4.IconCompatParcelizer(multiParagraphLayoutCache);
                        textAnnotatedStringNode.ResultReceiver = mediaQueryKt4;
                    }
                    androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textAnnotatedStringNode);
                    androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textAnnotatedStringNode);
                    androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode);
                    return Boolean.TRUE;
                }
            };
            this.PlaybackStateCompatCustomAction = r1;
            r0 = r1;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.PlaybackStateCompat);
        MediaQueryKt mediaQueryKt = this.ResultReceiver;
        if (mediaQueryKt != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, mediaQueryKt.serializer());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, mediaQueryKt.IconCompatParcelizer());
        }
        final int i2 = 1;
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.KeyedComposedModifierN
            public final /* synthetic */ androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i3 = i2;
                androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode textAnnotatedStringNode = this.IconCompatParcelizer;
                boolean z = false;
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = null;
                if (i3 == 0) {
                    List list = (List) obj;
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = textAnnotatedStringNode.RemoteActionCompatParcelizer().RatingCompat;
                    if (textLayoutResult2 != null) {
                        androidx.compose.ui.text.AnnotatedString text = textLayoutResult2.getLayoutInput().getText();
                        androidx.compose.ui.text.TextStyle textStyle = textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper;
                        androidx.compose.ui.graphics.ColorProducer colorProducer = textAnnotatedStringNode.MediaSessionCompatQueueItem;
                        androidx.compose.ui.text.TextLayoutResult textLayoutResultM3044copyO0kMr_c$default = androidx.compose.ui.text.TextLayoutResult.m3044copyO0kMr_c$default(textLayoutResult2, new androidx.compose.ui.text.TextLayoutInput(text, textStyle.m3121mergedA7vx0o((16609104 & 1) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo803invoke0d7_KjU() : androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU(), (16609104 & 2) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? androidx.compose.ui.text.style.TextAlign.Companion.m3517getUnspecifiede0LSkKk() : 0, (16609104 & 65536) != 0 ? androidx.compose.ui.text.style.TextDirection.Companion.m3533getUnspecifieds_7Xco() : 0, (16609104 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? null : null, (16609104 & 1048576) != 0 ? androidx.compose.ui.text.style.LineBreak.Companion.m3429getUnspecifiedrAG3T2k() : 0, (16609104 & 2097152) != 0 ? androidx.compose.ui.text.style.Hyphens.Companion.m3405getUnspecifiedvmbZdU8() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null), textLayoutResult2.getLayoutInput().getPlaceholders(), textLayoutResult2.getLayoutInput().getMaxLines(), textLayoutResult2.getLayoutInput().getSoftWrap(), textLayoutResult2.getLayoutInput().m3043getOverflowgIe3tQ8(), textLayoutResult2.getLayoutInput().getDensity(), textLayoutResult2.getLayoutInput().getLayoutDirection(), textLayoutResult2.getLayoutInput().getFontFamilyResolver(), textLayoutResult2.getLayoutInput().m3042getConstraintsmsEJaDk(), (DefaultConstructorMarker) null), 0L, 2, null);
                        if (textLayoutResultM3044copyO0kMr_c$default != null) {
                            list.add(textLayoutResultM3044copyO0kMr_c$default);
                            textLayoutResult = textLayoutResultM3044copyO0kMr_c$default;
                        }
                    }
                    return Boolean.valueOf(textLayoutResult != null);
                }
                if (i3 != 1) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    MediaQueryKt mediaQueryKt2 = textAnnotatedStringNode.ResultReceiver;
                    if (mediaQueryKt2 != null) {
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = textAnnotatedStringNode.MediaBrowserCompatMediaItem;
                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(mediaQueryKt2);
                        }
                        MediaQueryKt mediaQueryKt3 = textAnnotatedStringNode.ResultReceiver;
                        if (mediaQueryKt3 != null) {
                            mediaQueryKt3.IconCompatParcelizer(zBooleanValue);
                        }
                        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textAnnotatedStringNode);
                        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textAnnotatedStringNode);
                        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode);
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                androidx.compose.ui.text.AnnotatedString annotatedString = (androidx.compose.ui.text.AnnotatedString) obj;
                MediaQueryKt mediaQueryKt4 = textAnnotatedStringNode.ResultReceiver;
                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                if (mediaQueryKt4 != null) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{annotatedString, mediaQueryKt4.serializer()}, getCieXyz.write())).booleanValue()) {
                        mediaQueryKt4.write(annotatedString);
                        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCacheRemoteActionCompatParcelizer = mediaQueryKt4.RemoteActionCompatParcelizer();
                        if (multiParagraphLayoutCacheRemoteActionCompatParcelizer != null) {
                            androidx.compose.ui.text.TextStyle textStyle2 = textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper;
                            androidx.compose.ui.text.font.FontFamily.Resolver resolver = textAnnotatedStringNode.RemoteActionCompatParcelizer;
                            int i4 = textAnnotatedStringNode.RatingCompat;
                            boolean z2 = textAnnotatedStringNode.MediaSessionCompatToken;
                            int i5 = textAnnotatedStringNode.IconCompatParcelizer;
                            int i6 = textAnnotatedStringNode.serializer;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.ComponentActivity = annotatedString;
                            boolean zHasSameLayoutAffectingAttributes = textStyle2.hasSameLayoutAffectingAttributes(multiParagraphLayoutCacheRemoteActionCompatParcelizer.ResultReceiver);
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.ResultReceiver = textStyle2;
                            if (!zHasSameLayoutAffectingAttributes) {
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.read <<= 2;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatToken = null;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat = null;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = -1;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer = -1;
                            }
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.write = resolver;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompat = i4;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.ParcelableVolumeInfo = z2;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatQueueItem = i5;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper = i6;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction = instance_delegatelambda0Var;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.read = (multiParagraphLayoutCacheRemoteActionCompatParcelizer.read << 2) | 2;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatToken = null;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat = null;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = -1;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer = -1;
                        }
                    }
                } else {
                    MediaQueryKt mediaQueryKt5 = new MediaQueryKt(textAnnotatedStringNode.PlaybackStateCompat, annotatedString);
                    androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache = new androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache(annotatedString, textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper, textAnnotatedStringNode.RemoteActionCompatParcelizer, textAnnotatedStringNode.RatingCompat, textAnnotatedStringNode.MediaSessionCompatToken, textAnnotatedStringNode.IconCompatParcelizer, textAnnotatedStringNode.serializer, instance_delegatelambda0Var);
                    multiParagraphLayoutCache.write(textAnnotatedStringNode.RemoteActionCompatParcelizer().serializer);
                    mediaQueryKt5.IconCompatParcelizer(multiParagraphLayoutCache);
                    textAnnotatedStringNode.ResultReceiver = mediaQueryKt5;
                }
                androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textAnnotatedStringNode);
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textAnnotatedStringNode);
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode);
                return Boolean.TRUE;
            }
        }, 1, null);
        final int i3 = 2;
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.KeyedComposedModifierN
            public final /* synthetic */ androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i4 = i3;
                androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode textAnnotatedStringNode = this.IconCompatParcelizer;
                boolean z = false;
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = null;
                if (i4 == 0) {
                    List list = (List) obj;
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = textAnnotatedStringNode.RemoteActionCompatParcelizer().RatingCompat;
                    if (textLayoutResult2 != null) {
                        androidx.compose.ui.text.AnnotatedString text = textLayoutResult2.getLayoutInput().getText();
                        androidx.compose.ui.text.TextStyle textStyle = textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper;
                        androidx.compose.ui.graphics.ColorProducer colorProducer = textAnnotatedStringNode.MediaSessionCompatQueueItem;
                        androidx.compose.ui.text.TextLayoutResult textLayoutResultM3044copyO0kMr_c$default = androidx.compose.ui.text.TextLayoutResult.m3044copyO0kMr_c$default(textLayoutResult2, new androidx.compose.ui.text.TextLayoutInput(text, textStyle.m3121mergedA7vx0o((16609104 & 1) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo803invoke0d7_KjU() : androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU(), (16609104 & 2) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? androidx.compose.ui.text.style.TextAlign.Companion.m3517getUnspecifiede0LSkKk() : 0, (16609104 & 65536) != 0 ? androidx.compose.ui.text.style.TextDirection.Companion.m3533getUnspecifieds_7Xco() : 0, (16609104 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? null : null, (16609104 & 1048576) != 0 ? androidx.compose.ui.text.style.LineBreak.Companion.m3429getUnspecifiedrAG3T2k() : 0, (16609104 & 2097152) != 0 ? androidx.compose.ui.text.style.Hyphens.Companion.m3405getUnspecifiedvmbZdU8() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null), textLayoutResult2.getLayoutInput().getPlaceholders(), textLayoutResult2.getLayoutInput().getMaxLines(), textLayoutResult2.getLayoutInput().getSoftWrap(), textLayoutResult2.getLayoutInput().m3043getOverflowgIe3tQ8(), textLayoutResult2.getLayoutInput().getDensity(), textLayoutResult2.getLayoutInput().getLayoutDirection(), textLayoutResult2.getLayoutInput().getFontFamilyResolver(), textLayoutResult2.getLayoutInput().m3042getConstraintsmsEJaDk(), (DefaultConstructorMarker) null), 0L, 2, null);
                        if (textLayoutResultM3044copyO0kMr_c$default != null) {
                            list.add(textLayoutResultM3044copyO0kMr_c$default);
                            textLayoutResult = textLayoutResultM3044copyO0kMr_c$default;
                        }
                    }
                    return Boolean.valueOf(textLayoutResult != null);
                }
                if (i4 != 1) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    MediaQueryKt mediaQueryKt2 = textAnnotatedStringNode.ResultReceiver;
                    if (mediaQueryKt2 != null) {
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = textAnnotatedStringNode.MediaBrowserCompatMediaItem;
                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(mediaQueryKt2);
                        }
                        MediaQueryKt mediaQueryKt3 = textAnnotatedStringNode.ResultReceiver;
                        if (mediaQueryKt3 != null) {
                            mediaQueryKt3.IconCompatParcelizer(zBooleanValue);
                        }
                        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textAnnotatedStringNode);
                        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textAnnotatedStringNode);
                        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode);
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                androidx.compose.ui.text.AnnotatedString annotatedString = (androidx.compose.ui.text.AnnotatedString) obj;
                MediaQueryKt mediaQueryKt4 = textAnnotatedStringNode.ResultReceiver;
                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                if (mediaQueryKt4 != null) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{annotatedString, mediaQueryKt4.serializer()}, getCieXyz.write())).booleanValue()) {
                        mediaQueryKt4.write(annotatedString);
                        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCacheRemoteActionCompatParcelizer = mediaQueryKt4.RemoteActionCompatParcelizer();
                        if (multiParagraphLayoutCacheRemoteActionCompatParcelizer != null) {
                            androidx.compose.ui.text.TextStyle textStyle2 = textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper;
                            androidx.compose.ui.text.font.FontFamily.Resolver resolver = textAnnotatedStringNode.RemoteActionCompatParcelizer;
                            int i5 = textAnnotatedStringNode.RatingCompat;
                            boolean z2 = textAnnotatedStringNode.MediaSessionCompatToken;
                            int i6 = textAnnotatedStringNode.IconCompatParcelizer;
                            int i7 = textAnnotatedStringNode.serializer;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.ComponentActivity = annotatedString;
                            boolean zHasSameLayoutAffectingAttributes = textStyle2.hasSameLayoutAffectingAttributes(multiParagraphLayoutCacheRemoteActionCompatParcelizer.ResultReceiver);
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.ResultReceiver = textStyle2;
                            if (!zHasSameLayoutAffectingAttributes) {
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.read <<= 2;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatToken = null;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat = null;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = -1;
                                multiParagraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer = -1;
                            }
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.write = resolver;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompat = i5;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.ParcelableVolumeInfo = z2;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatQueueItem = i6;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper = i7;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction = instance_delegatelambda0Var;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.read = (multiParagraphLayoutCacheRemoteActionCompatParcelizer.read << 2) | 2;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatToken = null;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat = null;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = -1;
                            multiParagraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer = -1;
                        }
                    }
                } else {
                    MediaQueryKt mediaQueryKt5 = new MediaQueryKt(textAnnotatedStringNode.PlaybackStateCompat, annotatedString);
                    androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache multiParagraphLayoutCache = new androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache(annotatedString, textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper, textAnnotatedStringNode.RemoteActionCompatParcelizer, textAnnotatedStringNode.RatingCompat, textAnnotatedStringNode.MediaSessionCompatToken, textAnnotatedStringNode.IconCompatParcelizer, textAnnotatedStringNode.serializer, instance_delegatelambda0Var);
                    multiParagraphLayoutCache.write(textAnnotatedStringNode.RemoteActionCompatParcelizer().serializer);
                    mediaQueryKt5.IconCompatParcelizer(multiParagraphLayoutCache);
                    textAnnotatedStringNode.ResultReceiver = mediaQueryKt5;
                }
                androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textAnnotatedStringNode);
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textAnnotatedStringNode);
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new a5$$ExternalSyntheticLambda0(4, this), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, r0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        List list;
        if (isAttached()) {
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            MultiParagraphLayoutCache multiParagraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(contentDrawScope);
            TextLayoutResult textLayoutResult = multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat;
            if (textLayoutResult == null) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(multiParagraphLayoutCacheRemoteActionCompatParcelizer, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                return;
            }
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m3559equalsimpl0(this.RatingCompat, TextOverflow.Companion.m3572getVisiblegIe3tQ8());
            if (z) {
                Rect rectM517Recttz77jQw = RectKt.m517Recttz77jQw(Offset.Companion.m493getZeroF1C5BW0(), Size.m537constructorimpl((((long) Float.floatToRawIntBits((int) (textLayoutResult.m3047getSizeYbymL2g() >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (textLayoutResult.m3047getSizeYbymL2g() & 4294967295L))))));
                canvas.save();
                Canvas.m695clipRectmtrdDE$default(canvas, rectM517Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.MediaSessionCompatResultReceiverWrapper.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.MediaSessionCompatResultReceiverWrapper.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.MediaSessionCompatResultReceiverWrapper.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.MediaSessionCompatResultReceiverWrapper.getBrush();
                if (brush != null) {
                    multiParagraph.m2915painthn5TExg(canvas, brush, (64 & 4) != 0 ? Float.NaN : this.MediaSessionCompatResultReceiverWrapper.getAlpha(), (64 & 8) != 0 ? null : shadow2, (64 & 16) != 0 ? null : textDecoration2, (64 & 32) != 0 ? null : drawStyle2, (64 & 64) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : 0);
                } else {
                    ColorProducer colorProducer = this.MediaSessionCompatQueueItem;
                    long jMo803invoke0d7_KjU = colorProducer != null ? colorProducer.mo803invoke0d7_KjU() : Color.Companion.m758getUnspecified0d7_KjU();
                    if (jMo803invoke0d7_KjU == 16) {
                        jMo803invoke0d7_KjU = this.MediaSessionCompatResultReceiverWrapper.m3106getColor0d7_KjU() != 16 ? this.MediaSessionCompatResultReceiverWrapper.m3106getColor0d7_KjU() : Color.Companion.m748getBlack0d7_KjU();
                    }
                    multiParagraph.m2913paintLG529CI(canvas, (32 & 2) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : jMo803invoke0d7_KjU, (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z) {
                    canvas.restore();
                }
                MediaQueryKt mediaQueryKt = this.ResultReceiver;
                if (mediaQueryKt != null && mediaQueryKt.IconCompatParcelizer()) {
                    list = this.ParcelableVolumeInfo;
                    if (list != null) {
                        return;
                    } else {
                        return;
                    }
                } else {
                    AnnotatedString annotatedString = this.PlaybackStateCompat;
                    if (!annotatedString.hasLinkAnnotations(0, annotatedString.length())) {
                        list = this.ParcelableVolumeInfo;
                        if (list != null || list.isEmpty()) {
                            return;
                        }
                    }
                }
                contentDrawScope.drawContent();
            } catch (Throwable th) {
                if (z) {
                    canvas.restore();
                }
                throw th;
            }
        }
    }

    public final MultiParagraphLayoutCache RemoteActionCompatParcelizer(Density density) {
        MultiParagraphLayoutCache multiParagraphLayoutCacheRemoteActionCompatParcelizer;
        MediaQueryKt mediaQueryKt = this.ResultReceiver;
        if (mediaQueryKt != null && mediaQueryKt.IconCompatParcelizer() && (multiParagraphLayoutCacheRemoteActionCompatParcelizer = mediaQueryKt.RemoteActionCompatParcelizer()) != null) {
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.write(density);
            return multiParagraphLayoutCacheRemoteActionCompatParcelizer;
        }
        MultiParagraphLayoutCache multiParagraphLayoutCacheRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        multiParagraphLayoutCacheRemoteActionCompatParcelizer2.write(density);
        return multiParagraphLayoutCacheRemoteActionCompatParcelizer2;
    }
}
