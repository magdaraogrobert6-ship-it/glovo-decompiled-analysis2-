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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.af$$ExternalSyntheticOutline1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessgetEvenOddcp;
import o.component2;
import o.getCieXyz;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSizeNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public component2 RemoteActionCompatParcelizer;
    public final TextStyle read;
    public onViewAttachedToWindow write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.read, DelegatableNodeKt.requireLayoutDirection(this));
        FontFamily.Resolver resolver = (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver());
        RemoteActionCompatParcelizer(textStyleResolveDefaults, resolver);
        LayoutDirection layoutDirectionRequireLayoutDirection = DelegatableNodeKt.requireLayoutDirection(this);
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        onViewAttachedToWindow onviewattachedtowindow = this.write;
        if (onviewattachedtowindow == null) {
            throw af$$ExternalSyntheticOutline1.m("Font resolution state is not set.");
        }
        this.RemoteActionCompatParcelizer = new component2(layoutDirectionRequireLayoutDirection, densityRequireDensity, resolver, textStyleResolveDefaults, onviewattachedtowindow.getValue());
    }

    public TextFieldSizeNode(TextStyle textStyle) {
        this.read = textStyle;
    }

    public final void RemoteActionCompatParcelizer(TextStyle textStyle, FontFamily.Resolver resolver) {
        FontFamily fontFamily = textStyle.getFontFamily();
        FontWeight fontWeight = textStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle fontStyleM3108getFontStyle4Lr2A7w = textStyle.m3108getFontStyle4Lr2A7w();
        int iM3193unboximpl = fontStyleM3108getFontStyle4Lr2A7w != null ? fontStyleM3108getFontStyle4Lr2A7w.m3193unboximpl() : FontStyle.Companion.m3197getNormal_LCdwA();
        FontSynthesis fontSynthesisM3109getFontSynthesisZQGJjVo = textStyle.m3109getFontSynthesisZQGJjVo();
        this.write = resolver.mo3162resolveDPcqOEQ(fontFamily, fontWeight, iM3193unboximpl, fontSynthesisM3109getFontSynthesisZQGJjVo != null ? fontSynthesisM3109getFontSynthesisZQGJjVo.m3206unboximpl() : FontSynthesis.Companion.m3207getAllGVVA2EU());
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        component2 component2Var = this.RemoteActionCompatParcelizer;
        if (component2Var == null) {
            throw af$$ExternalSyntheticOutline1.m("Min size state is not set.");
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = component2Var.read;
        onViewAttachedToWindow onviewattachedtowindow = this.write;
        if (onviewattachedtowindow == null) {
            throw af$$ExternalSyntheticOutline1.m("Font resolution state is not set.");
        }
        Object value = onviewattachedtowindow.getValue();
        Object[] objArr = {value, component2Var.RatingCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            component2Var.RatingCompat = value;
            ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(Boolean.TRUE);
        }
        onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
        if (((Boolean) onshowtranslationui.getValue()).booleanValue()) {
            component2Var.IconCompatParcelizer = TextFieldDelegateKt.computeSizeForDefaultText(component2Var.MediaMetadataCompat, component2Var.RemoteActionCompatParcelizer, component2Var.write, TextFieldDelegateKt.read, 1);
            onshowtranslationui.setValue(Boolean.FALSE);
        }
        long j2 = component2Var.IconCompatParcelizer;
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(ConstraintsKt.m3641constrainN9IONVI(j, ConstraintsKt.Constraints$default((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10, null)));
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new accessgetEvenOddcp(placeableMo2209measureBRTryo0, 5), 4, null);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        component2 component2Var = this.RemoteActionCompatParcelizer;
        if (component2Var != null) {
            component2.IconCompatParcelizer(component2Var, null, DelegatableNodeKt.requireDensity(this), null, 29);
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void onLayoutDirectionChange() {
        component2 component2Var = this.RemoteActionCompatParcelizer;
        if (component2Var != null) {
            component2.IconCompatParcelizer(component2Var, DelegatableNodeKt.requireLayoutDirection(this), null, null, 30);
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
