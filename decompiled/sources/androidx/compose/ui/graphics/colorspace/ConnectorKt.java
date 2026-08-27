package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.VerticalScrollableClipShape;
import o.animateToWithDecay;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectorKt {
    private static final animateToWithDecay Connectors;

    /* JADX INFO: renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m1174connectorKeyYBCOT_4(int i, int i2, int i3) {
        return i | (i2 << 6) | (i3 << 12);
    }

    public static final animateToWithDecay getConnectors() {
        return Connectors;
    }

    static {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        int id$ui_graphics = colorSpaces.getSrgb().getId$ui_graphics();
        int id$ui_graphics2 = colorSpaces.getSrgb().getId$ui_graphics();
        RenderIntent.Companion companion = RenderIntent.Companion;
        int iM1183getPerceptualuksYyKA = companion.m1183getPerceptualuksYyKA();
        Connector connectorIdentity$ui_graphics = Connector.Companion.identity$ui_graphics(colorSpaces.getSrgb());
        int id$ui_graphics3 = colorSpaces.getSrgb().getId$ui_graphics();
        int id$ui_graphics4 = colorSpaces.getOklab().getId$ui_graphics();
        int iM1183getPerceptualuksYyKA2 = companion.m1183getPerceptualuksYyKA();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Connector connector = new Connector(colorSpaces.getSrgb(), colorSpaces.getOklab(), companion.m1183getPerceptualuksYyKA(), defaultConstructorMarker);
        int id$ui_graphics5 = colorSpaces.getOklab().getId$ui_graphics();
        int id$ui_graphics6 = colorSpaces.getSrgb().getId$ui_graphics();
        int iM1183getPerceptualuksYyKA3 = companion.m1183getPerceptualuksYyKA();
        Connector connector2 = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion.m1183getPerceptualuksYyKA(), defaultConstructorMarker);
        animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
        animateToWithDecay animatetowithdecay2 = new animateToWithDecay();
        animatetowithdecay2.IconCompatParcelizer(id$ui_graphics | (id$ui_graphics2 << 6) | (iM1183getPerceptualuksYyKA << 12), connectorIdentity$ui_graphics);
        animatetowithdecay2.IconCompatParcelizer((id$ui_graphics4 << 6) | id$ui_graphics3 | (iM1183getPerceptualuksYyKA2 << 12), connector);
        animatetowithdecay2.IconCompatParcelizer((id$ui_graphics6 << 6) | id$ui_graphics5 | (iM1183getPerceptualuksYyKA3 << 12), connector2);
        Connectors = animatetowithdecay2;
    }
}
