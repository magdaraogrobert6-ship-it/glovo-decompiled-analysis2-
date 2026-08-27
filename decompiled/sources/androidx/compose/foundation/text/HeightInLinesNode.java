package androidx.compose.foundation.text;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import bo.app.af$$ExternalSyntheticOutline1;
import kotlin.ranges.RangesKt;
import o.accessgetEvenOddcp;
import o.getBottomStartannotations;
import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
public final class HeightInLinesNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode, ObserverModifierNode {
    public boolean IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public TextStyle MediaMetadataCompat;
    public TextStyle MediaSessionCompatQueueItem;
    public onViewAttachedToWindow RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        this.IconCompatParcelizer = true;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.MediaSessionCompatQueueItem = null;
        this.RemoteActionCompatParcelizer = null;
        this.IconCompatParcelizer = false;
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void onLayoutDirectionChange() {
        this.MediaSessionCompatQueueItem = TextStyleKt.resolveDefaults(this.MediaMetadataCompat, DelegatableNodeKt.requireLayoutDirection(this));
        this.IconCompatParcelizer = true;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        FontFamily.Resolver resolver = (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver());
        this.MediaSessionCompatQueueItem = TextStyleKt.resolveDefaults(this.MediaMetadataCompat, DelegatableNodeKt.requireLayoutDirection(this));
        FontFamily fontFamily = serializer().getFontFamily();
        FontWeight fontWeight = serializer().getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle fontStyleM3108getFontStyle4Lr2A7w = serializer().m3108getFontStyle4Lr2A7w();
        int iM3193unboximpl = fontStyleM3108getFontStyle4Lr2A7w != null ? fontStyleM3108getFontStyle4Lr2A7w.m3193unboximpl() : FontStyle.Companion.m3197getNormal_LCdwA();
        FontSynthesis fontSynthesisM3109getFontSynthesisZQGJjVo = serializer().m3109getFontSynthesisZQGJjVo();
        this.RemoteActionCompatParcelizer = resolver.mo3162resolveDPcqOEQ(fontFamily, fontWeight, iM3193unboximpl, fontSynthesisM3109getFontSynthesisZQGJjVo != null ? fontSynthesisM3109getFontSynthesisZQGJjVo.m3206unboximpl() : FontSynthesis.Companion.m3207getAllGVVA2EU());
        ObserverModifierNodeKt.observeReads(this, new getBottomStartannotations(this, 0));
        this.IconCompatParcelizer = true;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        if (this.IconCompatParcelizer) {
            TextStyle textStyleSerializer = serializer();
            FontFamily.Resolver resolver = (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver());
            String str = TextFieldDelegateKt.read;
            int iComputeSizeForDefaultText = (int) (TextFieldDelegateKt.computeSizeForDefaultText(textStyleSerializer, measureScope, resolver, str, 1) & 4294967295L);
            int iComputeSizeForDefaultText2 = ((int) (TextFieldDelegateKt.computeSizeForDefaultText(textStyleSerializer, measureScope, resolver, str + '\n' + str, 2) & 4294967295L)) - iComputeSizeForDefaultText;
            int i = this.read;
            this.MediaDescriptionCompat = i == 1 ? -1 : ((i - 1) * iComputeSizeForDefaultText2) + iComputeSizeForDefaultText;
            int i2 = this.serializer;
            this.write = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * iComputeSizeForDefaultText2) + iComputeSizeForDefaultText;
            this.IconCompatParcelizer = false;
        }
        int i3 = this.MediaDescriptionCompat;
        int iRemoteActionCompatParcelizer = i3 != -1 ? RangesKt.RemoteActionCompatParcelizer(i3, Constraints.m3627getMinHeightimpl(j), Constraints.m3625getMaxHeightimpl(j)) : Constraints.m3627getMinHeightimpl(j);
        int i4 = this.write;
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(Constraints.m3616copyZbe2FdA$default(j, 0, 0, iRemoteActionCompatParcelizer, i4 != -1 ? RangesKt.RemoteActionCompatParcelizer(i4, Constraints.m3627getMinHeightimpl(j), Constraints.m3625getMaxHeightimpl(j)) : Constraints.m3625getMaxHeightimpl(j), 3, null));
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new accessgetEvenOddcp(placeableMo2209measureBRTryo0, 4), 4, null);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        if (this.RemoteActionCompatParcelizer != null) {
            ObserverModifierNodeKt.observeReads(this, new getBottomStartannotations(this, 1));
        }
        this.IconCompatParcelizer = true;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public final TextStyle serializer() {
        TextStyle textStyle = this.MediaSessionCompatQueueItem;
        if (textStyle != null) {
            return textStyle;
        }
        throw af$$ExternalSyntheticOutline1.m("Resolved style is not set.");
    }
}
