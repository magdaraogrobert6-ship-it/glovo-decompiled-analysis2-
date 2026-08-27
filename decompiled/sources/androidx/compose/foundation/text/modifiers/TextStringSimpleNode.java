package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
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
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import bo.app.a5$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DrawableTransformation;
import o.OutlinedTextFieldDefaults;
import o.TriStateCheckbox;
import o.accessderivedMediaQuerylambda0;
import o.getKey3;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public HashMap IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public ColorProducer MediaMetadataCompat;
    public getKey3 MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public accessderivedMediaQuerylambda0 ParcelableVolumeInfo;
    public TextStyle RatingCompat;
    public int RemoteActionCompatParcelizer;
    public FontFamily.Resolver read;
    public int serializer;
    public ParagraphLayoutCache write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final ParagraphLayoutCache RemoteActionCompatParcelizer() {
        TextStyle textStyle = this.RatingCompat;
        if (this.write == null) {
            this.write = new ParagraphLayoutCache(this.MediaSessionCompatResultReceiverWrapper, textStyle, this.read, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.RemoteActionCompatParcelizer, this.serializer);
        }
        ParagraphLayoutCache paragraphLayoutCache = this.write;
        paragraphLayoutCache.getClass();
        return paragraphLayoutCache;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0013, B:13:0x001d, B:15:0x002c, B:16:0x002f, B:18:0x0038, B:20:0x003f, B:21:0x0047, B:22:0x006d, B:12:0x0019), top: B:28:0x0005 }] */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            accessderivedMediaQuerylambda0 accessderivedmediaquerylambda0 = this.ParcelableVolumeInfo;
            if (accessderivedmediaquerylambda0 == null) {
                paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            } else {
                if (!accessderivedmediaquerylambda0.read()) {
                    accessderivedmediaquerylambda0 = null;
                }
                if (accessderivedmediaquerylambda0 == null || (paragraphLayoutCacheRemoteActionCompatParcelizer = accessderivedmediaquerylambda0.serializer()) == null) {
                    paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                }
            }
            paragraphLayoutCacheRemoteActionCompatParcelizer.serializer(measureScope);
            boolean zM108layoutWithConstraintsK40F9xA = paragraphLayoutCacheRemoteActionCompatParcelizer.m108layoutWithConstraintsK40F9xA(j, measureScope.getLayoutDirection());
            ParagraphIntrinsics paragraphIntrinsics = paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompat;
            if (paragraphIntrinsics != null) {
                paragraphIntrinsics.getHasStaleResolvedFonts();
            }
            Paragraph paragraph = paragraphLayoutCacheRemoteActionCompatParcelizer.ParcelableVolumeInfo;
            paragraph.getClass();
            long j2 = paragraphLayoutCacheRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
            if (zM108layoutWithConstraintsK40F9xA) {
                LayoutModifierNodeKt.invalidateLayer(this);
                HashMap map = this.IconCompatParcelizer;
                if (map == null) {
                    map = new HashMap(2);
                    this.IconCompatParcelizer = map;
                }
                map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(paragraph.getFirstBaseline())));
                map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(paragraph.getLastBaseline())));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(Constraints.Companion.m3635fitPrioritizingWidthZbe2FdA(i, i, i2, i2));
            HashMap map2 = this.IconCompatParcelizer;
            map2.getClass();
            return measureScope.layout(i, i2, map2, new OutlinedTextFieldDefaults(placeableMo2209measureBRTryo0, 4));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer;
        accessderivedMediaQuerylambda0 accessderivedmediaquerylambda0 = this.ParcelableVolumeInfo;
        if (accessderivedmediaquerylambda0 == null) {
            paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        } else {
            if (!accessderivedmediaquerylambda0.read()) {
                accessderivedmediaquerylambda0 = null;
            }
            if (accessderivedmediaquerylambda0 == null || (paragraphLayoutCacheRemoteActionCompatParcelizer = accessderivedmediaquerylambda0.serializer()) == null) {
                paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            }
        }
        paragraphLayoutCacheRemoteActionCompatParcelizer.serializer(intrinsicMeasureScope);
        return paragraphLayoutCacheRemoteActionCompatParcelizer.write(intrinsicMeasureScope.getLayoutDirection(), i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer;
        accessderivedMediaQuerylambda0 accessderivedmediaquerylambda0 = this.ParcelableVolumeInfo;
        if (accessderivedmediaquerylambda0 == null) {
            paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        } else {
            if (!accessderivedmediaquerylambda0.read()) {
                accessderivedmediaquerylambda0 = null;
            }
            if (accessderivedmediaquerylambda0 == null || (paragraphLayoutCacheRemoteActionCompatParcelizer = accessderivedmediaquerylambda0.serializer()) == null) {
                paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            }
        }
        paragraphLayoutCacheRemoteActionCompatParcelizer.serializer(intrinsicMeasureScope);
        return TextDelegateKt.ceilToIntPx(paragraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer(intrinsicMeasureScope.getLayoutDirection()).getMaxIntrinsicWidth());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer;
        accessderivedMediaQuerylambda0 accessderivedmediaquerylambda0 = this.ParcelableVolumeInfo;
        if (accessderivedmediaquerylambda0 == null) {
            paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        } else {
            if (!accessderivedmediaquerylambda0.read()) {
                accessderivedmediaquerylambda0 = null;
            }
            if (accessderivedmediaquerylambda0 == null || (paragraphLayoutCacheRemoteActionCompatParcelizer = accessderivedmediaquerylambda0.serializer()) == null) {
                paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            }
        }
        paragraphLayoutCacheRemoteActionCompatParcelizer.serializer(intrinsicMeasureScope);
        return paragraphLayoutCacheRemoteActionCompatParcelizer.write(intrinsicMeasureScope.getLayoutDirection(), i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer;
        accessderivedMediaQuerylambda0 accessderivedmediaquerylambda0 = this.ParcelableVolumeInfo;
        if (accessderivedmediaquerylambda0 == null) {
            paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        } else {
            if (!accessderivedmediaquerylambda0.read()) {
                accessderivedmediaquerylambda0 = null;
            }
            if (accessderivedmediaquerylambda0 == null || (paragraphLayoutCacheRemoteActionCompatParcelizer = accessderivedmediaquerylambda0.serializer()) == null) {
                paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            }
        }
        paragraphLayoutCacheRemoteActionCompatParcelizer.serializer(intrinsicMeasureScope);
        return TextDelegateKt.ceilToIntPx(paragraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer(intrinsicMeasureScope.getLayoutDirection()).getMinIntrinsicWidth());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.getKey3] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        getKey3 getkey3 = this.MediaSessionCompatQueueItem;
        ?? r0 = getkey3;
        if (getkey3 == null) {
            final int i = 0;
            ?? r1 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.getKey3
                public final /* synthetic */ androidx.compose.foundation.text.modifiers.TextStringSimpleNode read;

                {
                    this.read = this;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x012d  */
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult;
                    androidx.compose.ui.unit.Density density;
                    int i2 = i;
                    androidx.compose.foundation.text.modifiers.TextStringSimpleNode textStringSimpleNode = this.read;
                    boolean z = false;
                    if (i2 == 0) {
                        List list = (List) obj;
                        androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer = textStringSimpleNode.RemoteActionCompatParcelizer();
                        androidx.compose.ui.text.TextStyle textStyle = textStringSimpleNode.RatingCompat;
                        androidx.compose.ui.graphics.ColorProducer colorProducer = textStringSimpleNode.MediaMetadataCompat;
                        androidx.compose.ui.text.TextStyle textStyleM3121mergedA7vx0o = textStyle.m3121mergedA7vx0o((16609104 & 1) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo803invoke0d7_KjU() : androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU(), (16609104 & 2) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? androidx.compose.ui.text.style.TextAlign.Companion.m3517getUnspecifiede0LSkKk() : 0, (16609104 & 65536) != 0 ? androidx.compose.ui.text.style.TextDirection.Companion.m3533getUnspecifieds_7Xco() : 0, (16609104 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? null : null, (16609104 & 1048576) != 0 ? androidx.compose.ui.text.style.LineBreak.Companion.m3429getUnspecifiedrAG3T2k() : 0, (16609104 & 2097152) != 0 ? androidx.compose.ui.text.style.Hyphens.Companion.m3405getUnspecifiedvmbZdU8() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
                        androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = null;
                        if (layoutDirection == null || (density = paragraphLayoutCacheRemoteActionCompatParcelizer.serializer) == null) {
                            textLayoutResult = null;
                        } else {
                            androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(paragraphLayoutCacheRemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, null, 2, null);
                            if (paragraphLayoutCacheRemoteActionCompatParcelizer.ParcelableVolumeInfo == null || paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompat == null) {
                                textLayoutResult = null;
                            } else {
                                long jM3614constructorimpl = androidx.compose.ui.unit.Constraints.m3614constructorimpl(paragraphLayoutCacheRemoteActionCompatParcelizer.ComponentActivity & androidx.compose.ui.unit.ConstraintsKt.MaxDimensionsAndFocusMask);
                                int i3 = paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction;
                                boolean z2 = paragraphLayoutCacheRemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                int i4 = paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper;
                                androidx.compose.ui.text.font.FontFamily.Resolver resolver = paragraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer;
                                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                                textLayoutResult = new androidx.compose.ui.text.TextLayoutResult(new androidx.compose.ui.text.TextLayoutInput(annotatedString, textStyleM3121mergedA7vx0o, instance_delegatelambda0Var, i3, z2, i4, density, layoutDirection, resolver, jM3614constructorimpl, (DefaultConstructorMarker) null), new androidx.compose.ui.text.MultiParagraph(new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyleM3121mergedA7vx0o, instance_delegatelambda0Var, density, paragraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer), jM3614constructorimpl, paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction, paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper, (DefaultConstructorMarker) null), paragraphLayoutCacheRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, null);
                            }
                        }
                        if (textLayoutResult != null) {
                            list.add(textLayoutResult);
                            textLayoutResult2 = textLayoutResult;
                        }
                        return Boolean.valueOf(textLayoutResult2 != null);
                    }
                    if (i2 != 1) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        accessderivedMediaQuerylambda0 accessderivedmediaquerylambda0 = textStringSimpleNode.ParcelableVolumeInfo;
                        if (accessderivedmediaquerylambda0 != null) {
                            accessderivedmediaquerylambda0.read(zBooleanValue);
                            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textStringSimpleNode);
                            androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textStringSimpleNode);
                            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textStringSimpleNode);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    String text = ((androidx.compose.ui.text.AnnotatedString) obj).getText();
                    accessderivedMediaQuerylambda0 accessderivedmediaquerylambda1 = textStringSimpleNode.ParcelableVolumeInfo;
                    if (accessderivedmediaquerylambda1 != null) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{text, accessderivedmediaquerylambda1.write()}, getCieXyz.write())).booleanValue()) {
                            accessderivedmediaquerylambda1.IconCompatParcelizer(text);
                            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCacheSerializer = accessderivedmediaquerylambda1.serializer();
                            if (paragraphLayoutCacheSerializer != null) {
                                androidx.compose.ui.text.TextStyle textStyle2 = textStringSimpleNode.RatingCompat;
                                androidx.compose.ui.text.font.FontFamily.Resolver resolver2 = textStringSimpleNode.read;
                                int i5 = textStringSimpleNode.MediaBrowserCompatMediaItem;
                                boolean z3 = textStringSimpleNode.MediaDescriptionCompat;
                                int i6 = textStringSimpleNode.RemoteActionCompatParcelizer;
                                int i7 = textStringSimpleNode.serializer;
                                paragraphLayoutCacheSerializer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = text;
                                paragraphLayoutCacheSerializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = textStyle2;
                                paragraphLayoutCacheSerializer.IconCompatParcelizer = resolver2;
                                paragraphLayoutCacheSerializer.MediaSessionCompatResultReceiverWrapper = i5;
                                paragraphLayoutCacheSerializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z3;
                                paragraphLayoutCacheSerializer.PlaybackStateCompatCustomAction = i6;
                                paragraphLayoutCacheSerializer.MediaSessionCompatToken = i7;
                                paragraphLayoutCacheSerializer.RatingCompat = (paragraphLayoutCacheSerializer.RatingCompat << 2) | 2;
                                paragraphLayoutCacheSerializer.markDirty();
                            }
                        }
                    } else {
                        accessderivedMediaQuerylambda0 accessderivedmediaquerylambda2 = new accessderivedMediaQuerylambda0(textStringSimpleNode.MediaSessionCompatResultReceiverWrapper, text);
                        androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCache = new androidx.compose.foundation.text.modifiers.ParagraphLayoutCache(text, textStringSimpleNode.RatingCompat, textStringSimpleNode.read, textStringSimpleNode.MediaBrowserCompatMediaItem, textStringSimpleNode.MediaDescriptionCompat, textStringSimpleNode.RemoteActionCompatParcelizer, textStringSimpleNode.serializer);
                        paragraphLayoutCache.serializer(textStringSimpleNode.RemoteActionCompatParcelizer().serializer);
                        accessderivedmediaquerylambda2.RemoteActionCompatParcelizer(paragraphLayoutCache);
                        textStringSimpleNode.ParcelableVolumeInfo = accessderivedmediaquerylambda2;
                    }
                    androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textStringSimpleNode);
                    androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textStringSimpleNode);
                    androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textStringSimpleNode);
                    return Boolean.TRUE;
                }
            };
            this.MediaSessionCompatQueueItem = r1;
            r0 = r1;
        }
        final int i2 = 2;
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.MediaSessionCompatResultReceiverWrapper, null, 2, null));
        accessderivedMediaQuerylambda0 accessderivedmediaquerylambda0 = this.ParcelableVolumeInfo;
        if (accessderivedmediaquerylambda0 != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, accessderivedmediaquerylambda0.read());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, new AnnotatedString(accessderivedmediaquerylambda0.write(), null, 2, null));
        }
        final int i3 = 1;
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.getKey3
            public final /* synthetic */ androidx.compose.foundation.text.modifiers.TextStringSimpleNode read;

            {
                this.read = this;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x012d  */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult;
                androidx.compose.ui.unit.Density density;
                int i4 = i3;
                androidx.compose.foundation.text.modifiers.TextStringSimpleNode textStringSimpleNode = this.read;
                boolean z = false;
                if (i4 == 0) {
                    List list = (List) obj;
                    androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer = textStringSimpleNode.RemoteActionCompatParcelizer();
                    androidx.compose.ui.text.TextStyle textStyle = textStringSimpleNode.RatingCompat;
                    androidx.compose.ui.graphics.ColorProducer colorProducer = textStringSimpleNode.MediaMetadataCompat;
                    androidx.compose.ui.text.TextStyle textStyleM3121mergedA7vx0o = textStyle.m3121mergedA7vx0o((16609104 & 1) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo803invoke0d7_KjU() : androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU(), (16609104 & 2) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? androidx.compose.ui.text.style.TextAlign.Companion.m3517getUnspecifiede0LSkKk() : 0, (16609104 & 65536) != 0 ? androidx.compose.ui.text.style.TextDirection.Companion.m3533getUnspecifieds_7Xco() : 0, (16609104 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? null : null, (16609104 & 1048576) != 0 ? androidx.compose.ui.text.style.LineBreak.Companion.m3429getUnspecifiedrAG3T2k() : 0, (16609104 & 2097152) != 0 ? androidx.compose.ui.text.style.Hyphens.Companion.m3405getUnspecifiedvmbZdU8() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = null;
                    if (layoutDirection == null || (density = paragraphLayoutCacheRemoteActionCompatParcelizer.serializer) == null) {
                        textLayoutResult = null;
                    } else {
                        androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(paragraphLayoutCacheRemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, null, 2, null);
                        if (paragraphLayoutCacheRemoteActionCompatParcelizer.ParcelableVolumeInfo == null || paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompat == null) {
                            textLayoutResult = null;
                        } else {
                            long jM3614constructorimpl = androidx.compose.ui.unit.Constraints.m3614constructorimpl(paragraphLayoutCacheRemoteActionCompatParcelizer.ComponentActivity & androidx.compose.ui.unit.ConstraintsKt.MaxDimensionsAndFocusMask);
                            int i5 = paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction;
                            boolean z2 = paragraphLayoutCacheRemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            int i6 = paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper;
                            androidx.compose.ui.text.font.FontFamily.Resolver resolver = paragraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer;
                            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                            textLayoutResult = new androidx.compose.ui.text.TextLayoutResult(new androidx.compose.ui.text.TextLayoutInput(annotatedString, textStyleM3121mergedA7vx0o, instance_delegatelambda0Var, i5, z2, i6, density, layoutDirection, resolver, jM3614constructorimpl, (DefaultConstructorMarker) null), new androidx.compose.ui.text.MultiParagraph(new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyleM3121mergedA7vx0o, instance_delegatelambda0Var, density, paragraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer), jM3614constructorimpl, paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction, paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper, (DefaultConstructorMarker) null), paragraphLayoutCacheRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, null);
                        }
                    }
                    if (textLayoutResult != null) {
                        list.add(textLayoutResult);
                        textLayoutResult2 = textLayoutResult;
                    }
                    return Boolean.valueOf(textLayoutResult2 != null);
                }
                if (i4 != 1) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    accessderivedMediaQuerylambda0 accessderivedmediaquerylambda1 = textStringSimpleNode.ParcelableVolumeInfo;
                    if (accessderivedmediaquerylambda1 != null) {
                        accessderivedmediaquerylambda1.read(zBooleanValue);
                        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textStringSimpleNode);
                        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textStringSimpleNode);
                        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textStringSimpleNode);
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                String text = ((androidx.compose.ui.text.AnnotatedString) obj).getText();
                accessderivedMediaQuerylambda0 accessderivedmediaquerylambda2 = textStringSimpleNode.ParcelableVolumeInfo;
                if (accessderivedmediaquerylambda2 != null) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{text, accessderivedmediaquerylambda2.write()}, getCieXyz.write())).booleanValue()) {
                        accessderivedmediaquerylambda2.IconCompatParcelizer(text);
                        androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCacheSerializer = accessderivedmediaquerylambda2.serializer();
                        if (paragraphLayoutCacheSerializer != null) {
                            androidx.compose.ui.text.TextStyle textStyle2 = textStringSimpleNode.RatingCompat;
                            androidx.compose.ui.text.font.FontFamily.Resolver resolver2 = textStringSimpleNode.read;
                            int i7 = textStringSimpleNode.MediaBrowserCompatMediaItem;
                            boolean z3 = textStringSimpleNode.MediaDescriptionCompat;
                            int i8 = textStringSimpleNode.RemoteActionCompatParcelizer;
                            int i9 = textStringSimpleNode.serializer;
                            paragraphLayoutCacheSerializer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = text;
                            paragraphLayoutCacheSerializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = textStyle2;
                            paragraphLayoutCacheSerializer.IconCompatParcelizer = resolver2;
                            paragraphLayoutCacheSerializer.MediaSessionCompatResultReceiverWrapper = i7;
                            paragraphLayoutCacheSerializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z3;
                            paragraphLayoutCacheSerializer.PlaybackStateCompatCustomAction = i8;
                            paragraphLayoutCacheSerializer.MediaSessionCompatToken = i9;
                            paragraphLayoutCacheSerializer.RatingCompat = (paragraphLayoutCacheSerializer.RatingCompat << 2) | 2;
                            paragraphLayoutCacheSerializer.markDirty();
                        }
                    }
                } else {
                    accessderivedMediaQuerylambda0 accessderivedmediaquerylambda3 = new accessderivedMediaQuerylambda0(textStringSimpleNode.MediaSessionCompatResultReceiverWrapper, text);
                    androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCache = new androidx.compose.foundation.text.modifiers.ParagraphLayoutCache(text, textStringSimpleNode.RatingCompat, textStringSimpleNode.read, textStringSimpleNode.MediaBrowserCompatMediaItem, textStringSimpleNode.MediaDescriptionCompat, textStringSimpleNode.RemoteActionCompatParcelizer, textStringSimpleNode.serializer);
                    paragraphLayoutCache.serializer(textStringSimpleNode.RemoteActionCompatParcelizer().serializer);
                    accessderivedmediaquerylambda3.RemoteActionCompatParcelizer(paragraphLayoutCache);
                    textStringSimpleNode.ParcelableVolumeInfo = accessderivedmediaquerylambda3;
                }
                androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textStringSimpleNode);
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textStringSimpleNode);
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textStringSimpleNode);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.getKey3
            public final /* synthetic */ androidx.compose.foundation.text.modifiers.TextStringSimpleNode read;

            {
                this.read = this;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x012d  */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult;
                androidx.compose.ui.unit.Density density;
                int i4 = i2;
                androidx.compose.foundation.text.modifiers.TextStringSimpleNode textStringSimpleNode = this.read;
                boolean z = false;
                if (i4 == 0) {
                    List list = (List) obj;
                    androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer = textStringSimpleNode.RemoteActionCompatParcelizer();
                    androidx.compose.ui.text.TextStyle textStyle = textStringSimpleNode.RatingCompat;
                    androidx.compose.ui.graphics.ColorProducer colorProducer = textStringSimpleNode.MediaMetadataCompat;
                    androidx.compose.ui.text.TextStyle textStyleM3121mergedA7vx0o = textStyle.m3121mergedA7vx0o((16609104 & 1) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo803invoke0d7_KjU() : androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU(), (16609104 & 2) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? androidx.compose.ui.text.style.TextAlign.Companion.m3517getUnspecifiede0LSkKk() : 0, (16609104 & 65536) != 0 ? androidx.compose.ui.text.style.TextDirection.Companion.m3533getUnspecifieds_7Xco() : 0, (16609104 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : 0L, (16609104 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? null : null, (16609104 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? null : null, (16609104 & 1048576) != 0 ? androidx.compose.ui.text.style.LineBreak.Companion.m3429getUnspecifiedrAG3T2k() : 0, (16609104 & 2097152) != 0 ? androidx.compose.ui.text.style.Hyphens.Companion.m3405getUnspecifiedvmbZdU8() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = null;
                    if (layoutDirection == null || (density = paragraphLayoutCacheRemoteActionCompatParcelizer.serializer) == null) {
                        textLayoutResult = null;
                    } else {
                        androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(paragraphLayoutCacheRemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, null, 2, null);
                        if (paragraphLayoutCacheRemoteActionCompatParcelizer.ParcelableVolumeInfo == null || paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompat == null) {
                            textLayoutResult = null;
                        } else {
                            long jM3614constructorimpl = androidx.compose.ui.unit.Constraints.m3614constructorimpl(paragraphLayoutCacheRemoteActionCompatParcelizer.ComponentActivity & androidx.compose.ui.unit.ConstraintsKt.MaxDimensionsAndFocusMask);
                            int i5 = paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction;
                            boolean z2 = paragraphLayoutCacheRemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            int i6 = paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper;
                            androidx.compose.ui.text.font.FontFamily.Resolver resolver = paragraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer;
                            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                            textLayoutResult = new androidx.compose.ui.text.TextLayoutResult(new androidx.compose.ui.text.TextLayoutInput(annotatedString, textStyleM3121mergedA7vx0o, instance_delegatelambda0Var, i5, z2, i6, density, layoutDirection, resolver, jM3614constructorimpl, (DefaultConstructorMarker) null), new androidx.compose.ui.text.MultiParagraph(new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, textStyleM3121mergedA7vx0o, instance_delegatelambda0Var, density, paragraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer), jM3614constructorimpl, paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction, paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper, (DefaultConstructorMarker) null), paragraphLayoutCacheRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, null);
                        }
                    }
                    if (textLayoutResult != null) {
                        list.add(textLayoutResult);
                        textLayoutResult2 = textLayoutResult;
                    }
                    return Boolean.valueOf(textLayoutResult2 != null);
                }
                if (i4 != 1) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    accessderivedMediaQuerylambda0 accessderivedmediaquerylambda1 = textStringSimpleNode.ParcelableVolumeInfo;
                    if (accessderivedmediaquerylambda1 != null) {
                        accessderivedmediaquerylambda1.read(zBooleanValue);
                        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textStringSimpleNode);
                        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textStringSimpleNode);
                        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textStringSimpleNode);
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                String text = ((androidx.compose.ui.text.AnnotatedString) obj).getText();
                accessderivedMediaQuerylambda0 accessderivedmediaquerylambda2 = textStringSimpleNode.ParcelableVolumeInfo;
                if (accessderivedmediaquerylambda2 != null) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{text, accessderivedmediaquerylambda2.write()}, getCieXyz.write())).booleanValue()) {
                        accessderivedmediaquerylambda2.IconCompatParcelizer(text);
                        androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCacheSerializer = accessderivedmediaquerylambda2.serializer();
                        if (paragraphLayoutCacheSerializer != null) {
                            androidx.compose.ui.text.TextStyle textStyle2 = textStringSimpleNode.RatingCompat;
                            androidx.compose.ui.text.font.FontFamily.Resolver resolver2 = textStringSimpleNode.read;
                            int i7 = textStringSimpleNode.MediaBrowserCompatMediaItem;
                            boolean z3 = textStringSimpleNode.MediaDescriptionCompat;
                            int i8 = textStringSimpleNode.RemoteActionCompatParcelizer;
                            int i9 = textStringSimpleNode.serializer;
                            paragraphLayoutCacheSerializer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = text;
                            paragraphLayoutCacheSerializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = textStyle2;
                            paragraphLayoutCacheSerializer.IconCompatParcelizer = resolver2;
                            paragraphLayoutCacheSerializer.MediaSessionCompatResultReceiverWrapper = i7;
                            paragraphLayoutCacheSerializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z3;
                            paragraphLayoutCacheSerializer.PlaybackStateCompatCustomAction = i8;
                            paragraphLayoutCacheSerializer.MediaSessionCompatToken = i9;
                            paragraphLayoutCacheSerializer.RatingCompat = (paragraphLayoutCacheSerializer.RatingCompat << 2) | 2;
                            paragraphLayoutCacheSerializer.markDirty();
                        }
                    }
                } else {
                    accessderivedMediaQuerylambda0 accessderivedmediaquerylambda3 = new accessderivedMediaQuerylambda0(textStringSimpleNode.MediaSessionCompatResultReceiverWrapper, text);
                    androidx.compose.foundation.text.modifiers.ParagraphLayoutCache paragraphLayoutCache = new androidx.compose.foundation.text.modifiers.ParagraphLayoutCache(text, textStringSimpleNode.RatingCompat, textStringSimpleNode.read, textStringSimpleNode.MediaBrowserCompatMediaItem, textStringSimpleNode.MediaDescriptionCompat, textStringSimpleNode.RemoteActionCompatParcelizer, textStringSimpleNode.serializer);
                    paragraphLayoutCache.serializer(textStringSimpleNode.RemoteActionCompatParcelizer().serializer);
                    accessderivedmediaquerylambda3.RemoteActionCompatParcelizer(paragraphLayoutCache);
                    textStringSimpleNode.ParcelableVolumeInfo = accessderivedmediaquerylambda3;
                }
                androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(textStringSimpleNode);
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(textStringSimpleNode);
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(textStringSimpleNode);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new a5$$ExternalSyntheticLambda0(5, this), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, r0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer;
        if (isAttached()) {
            accessderivedMediaQuerylambda0 accessderivedmediaquerylambda0 = this.ParcelableVolumeInfo;
            if (accessderivedmediaquerylambda0 == null) {
                paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            } else {
                if (!accessderivedmediaquerylambda0.read()) {
                    accessderivedmediaquerylambda0 = null;
                }
                if (accessderivedmediaquerylambda0 == null || (paragraphLayoutCacheRemoteActionCompatParcelizer = accessderivedmediaquerylambda0.serializer()) == null) {
                    paragraphLayoutCacheRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                }
            }
            Paragraph paragraph = paragraphLayoutCacheRemoteActionCompatParcelizer.ParcelableVolumeInfo;
            if (paragraph == null) {
                TriStateCheckbox.write("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.write + ", textSubstitution=" + this.ParcelableVolumeInfo + ')');
                DrawableTransformation.read();
                return;
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean z = paragraphLayoutCacheRemoteActionCompatParcelizer.write;
            if (z) {
                long j = paragraphLayoutCacheRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
                canvas.save();
                Canvas.m694clipRectN_I0leg$default(canvas, 0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 0, 16, null);
            }
            try {
                TextStyle textStyle = this.RatingCompat;
                TextDecoration textDecoration = textStyle.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = textStyle.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = textStyle.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = textStyle.getBrush();
                if (brush != null) {
                    Paragraph.m2920painthn5TExg$default(paragraph, canvas, brush, textStyle.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.MediaMetadataCompat;
                    long jMo803invoke0d7_KjU = colorProducer != null ? colorProducer.mo803invoke0d7_KjU() : Color.Companion.m758getUnspecified0d7_KjU();
                    if (jMo803invoke0d7_KjU == 16) {
                        jMo803invoke0d7_KjU = textStyle.m3106getColor0d7_KjU() != 16 ? textStyle.m3106getColor0d7_KjU() : Color.Companion.m748getBlack0d7_KjU();
                    }
                    Paragraph.m2918paintLG529CI$default(paragraph, canvas, jMo803invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
                }
            } finally {
                if (z) {
                    canvas.restore();
                }
            }
        }
    }
}
