package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnit;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.SentryOptions;
import io.sentry.android.replay.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class serializer {
    public static boolean IconCompatParcelizer;
    public static WeakReference RemoteActionCompatParcelizer;
    public static final isAdapterPositionOnScreen write = new isAdapterPositionOnScreen(read.serializer);

    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    public static boolean read(SemanticsConfiguration semanticsConfiguration, boolean z, SentryOptions sentryOptions) {
        String str;
        String str2 = semanticsConfiguration != null ? (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.RemoteActionCompatParcelizer) : null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, "unmask"}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, "mask"}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        if (z) {
            str = "android.widget.ImageView";
        } else if (semanticsConfiguration != null) {
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (semanticsConfiguration.contains(semanticsProperties.getText()) || semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText()) || semanticsConfiguration.contains(semanticsProperties.getEditableText())) {
                str = AndroidComposeViewAccessibilityDelegateCompat.TextClassName;
            } else {
                str = AndroidComposeViewAccessibilityDelegateCompat.ClassName;
            }
        } else {
            str = AndroidComposeViewAccessibilityDelegateCompat.ClassName;
        }
        if (sentryOptions.getSessionReplay().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.contains(str)) {
            return false;
        }
        return sentryOptions.getSessionReplay().write.contains(str);
    }

    public static final SemanticsConfiguration write(LayoutNode layoutNode) {
        layoutNode.getClass();
        Method method = (Method) write.MediaSessionCompatResultReceiverWrapper();
        return method != null ? (SemanticsConfiguration) method.invoke(layoutNode, null) : layoutNode.getCollapsedSemantics$ui_release();
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0317  */
    public static IconCompatParcelizer RemoteActionCompatParcelizer(LayoutNode layoutNode, IconCompatParcelizer iconCompatParcelizer, boolean z, SentryOptions sentryOptions) {
        Rect rect;
        boolean z2;
        TextLayoutInput layoutInput;
        TextStyle style;
        TextLayoutInput layoutInput2;
        TextStyle style2;
        AccessibilityAction accessibilityAction;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        Painter painter = null;
        if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
            return null;
        }
        if (z) {
            RemoteActionCompatParcelizer = new WeakReference(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
        }
        LayoutCoordinates coordinates = layoutNode.getCoordinates();
        WeakReference weakReference = RemoteActionCompatParcelizer;
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = weakReference != null ? (LayoutCoordinates) weakReference.get() : null;
        coordinates.getClass();
        if (layoutCoordinatesFindRootCoordinates == null) {
            layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(coordinates);
        }
        float fM3844getWidthimpl = IntSize.m3844getWidthimpl(layoutCoordinatesFindRootCoordinates.mo2217getSizeYbymL2g());
        float fM3843getHeightimpl = IntSize.m3843getHeightimpl(layoutCoordinatesFindRootCoordinates.mo2217getSizeYbymL2g());
        androidx.compose.ui.geometry.Rect rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinatesFindRootCoordinates, coordinates, false, 2, null);
        float left = rectLocalBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fM3844getWidthimpl) {
            left = fM3844getWidthimpl;
        }
        float top = rectLocalBoundingBoxOf$default.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fM3843getHeightimpl) {
            top = fM3843getHeightimpl;
        }
        float right = rectLocalBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fM3844getWidthimpl) {
            fM3844getWidthimpl = right;
        }
        float bottom = rectLocalBoundingBoxOf$default.getBottom();
        float f = bottom >= 0.0f ? bottom : 0.0f;
        if (f <= fM3843getHeightimpl) {
            fM3843getHeightimpl = f;
        }
        if (left == fM3844getWidthimpl || top == fM3843getHeightimpl) {
            rect = new Rect();
        } else {
            long jMo2222localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo2222localToWindowMKHz9U(OffsetKt.Offset(left, top));
            long jMo2222localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo2222localToWindowMKHz9U(OffsetKt.Offset(fM3844getWidthimpl, top));
            long jMo2222localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo2222localToWindowMKHz9U(OffsetKt.Offset(fM3844getWidthimpl, fM3843getHeightimpl));
            long jMo2222localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo2222localToWindowMKHz9U(OffsetKt.Offset(left, fM3843getHeightimpl));
            float fM477getXimpl = Offset.m477getXimpl(jMo2222localToWindowMKHz9U);
            float fM477getXimpl2 = Offset.m477getXimpl(jMo2222localToWindowMKHz9U2);
            float fM477getXimpl3 = Offset.m477getXimpl(jMo2222localToWindowMKHz9U4);
            float fM477getXimpl4 = Offset.m477getXimpl(jMo2222localToWindowMKHz9U3);
            float fMin = Math.min(fM477getXimpl, Math.min(fM477getXimpl2, Math.min(fM477getXimpl3, fM477getXimpl4)));
            float fMax = Math.max(fM477getXimpl, Math.max(fM477getXimpl2, Math.max(fM477getXimpl3, fM477getXimpl4)));
            float fM478getYimpl = Offset.m478getYimpl(jMo2222localToWindowMKHz9U);
            float fM478getYimpl2 = Offset.m478getYimpl(jMo2222localToWindowMKHz9U2);
            float fM478getYimpl3 = Offset.m478getYimpl(jMo2222localToWindowMKHz9U4);
            float fM478getYimpl4 = Offset.m478getYimpl(jMo2222localToWindowMKHz9U3);
            rect = new Rect((int) fMin, (int) Math.min(fM478getYimpl, Math.min(fM478getYimpl2, Math.min(fM478getYimpl3, fM478getYimpl4))), (int) fMax, (int) Math.max(fM478getYimpl, Math.max(fM478getYimpl2, Math.max(fM478getYimpl3, fM478getYimpl4))));
        }
        try {
            SemanticsConfiguration semanticsConfigurationWrite = write(layoutNode);
            boolean z3 = !layoutNode.getOuterCoordinator$ui_release().isTransparent() && (semanticsConfigurationWrite == null || !semanticsConfigurationWrite.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rect.height() > 0 && rect.width() > 0;
            boolean z4 = (semanticsConfigurationWrite != null && semanticsConfigurationWrite.contains(SemanticsActions.INSTANCE.getSetText())) || (semanticsConfigurationWrite != null && semanticsConfigurationWrite.contains(SemanticsProperties.INSTANCE.getEditableText()));
            if ((semanticsConfigurationWrite != null && semanticsConfigurationWrite.contains(SemanticsProperties.INSTANCE.getText())) || z4) {
                boolean z5 = z3 && read(semanticsConfigurationWrite, false, sentryOptions);
                ArrayList arrayList = new ArrayList();
                if (semanticsConfigurationWrite != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationWrite, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction.getAction()) != null) {
                }
                List<ModifierInfo> modifierInfo = layoutNode.getModifierInfo();
                int size = modifierInfo.size();
                Color colorM712boximpl = null;
                boolean z6 = false;
                for (int i = 0; i < size; i++) {
                    Modifier modifier = modifierInfo.get(i).getModifier();
                    String name = modifier.getClass().getName();
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name, (CharSequence) "Text", false)) {
                        try {
                            Field declaredField = modifier.getClass().getDeclaredField(RemoteMessageConst.Notification.COLOR);
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(modifier);
                            ColorProducer colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
                            colorM712boximpl = colorProducer != null ? Color.m712boximpl(colorProducer.mo803invoke0d7_KjU()) : null;
                        } catch (Throwable unused) {
                        }
                    } else if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name, (CharSequence) "Fill", false)) {
                        z6 = true;
                    }
                }
                TextLayoutResult textLayoutResult = (TextLayoutResult) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
                Color colorM712boximpl2 = (textLayoutResult == null || (layoutInput2 = textLayoutResult.getLayoutInput()) == null || (style2 = layoutInput2.getStyle()) == null) ? null : Color.m712boximpl(style2.m3106getColor0d7_KjU());
                if (colorM712boximpl2 == null || colorM712boximpl2.m732unboximpl() != Color.Companion.m758getUnspecified0d7_KjU()) {
                    colorM712boximpl = colorM712boximpl2;
                }
                TextUnit textUnitM3857boximpl = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : TextUnit.m3857boximpl(style.m3107getFontSizeXSAIIZE());
                return new MediaSessionCompatQueueItem((textLayoutResult == null || z4 || (textUnitM3857boximpl == null ? false : TextUnit.m3864equalsimpl0(textUnitM3857boximpl.m3876unboximpl(), TextUnit.Companion.m3878getUnspecifiedXSAIIZE()))) ? null : new io.sentry.android.replay.util.RemoteActionCompatParcelizer(textLayoutResult, z6), colorM712boximpl != null ? Integer.valueOf(ColorKt.m776toArgb8_81llA(colorM712boximpl.m732unboximpl()) | (-16777216)) : null, 0, 0, layoutNode.getWidth(), layoutNode.getHeight(), iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer, z5, rect);
            }
            List<ModifierInfo> modifierInfo2 = layoutNode.getModifierInfo();
            int size2 = modifierInfo2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Modifier modifier2 = modifierInfo2.get(i2).getModifier();
                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) modifier2.getClass().getName(), (CharSequence) "Painter", false)) {
                    try {
                        Field declaredField2 = modifier2.getClass().getDeclaredField("painter");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(modifier2);
                        if (!(obj2 instanceof Painter)) {
                            break;
                        }
                        painter = (Painter) obj2;
                        break;
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (painter != null) {
                boolean z7 = z3 && read(semanticsConfigurationWrite, true, sentryOptions);
                int width = layoutNode.getWidth();
                int height = layoutNode.getHeight();
                float f2 = iconCompatParcelizer.IconCompatParcelizer;
                if (z7) {
                    String name2 = painter.getClass().getName();
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name2, (CharSequence) "Vector", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name2, (CharSequence) "Color", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name2, (CharSequence) "Brush", false)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                return new write(width, height, f2, iconCompatParcelizer, z2, rect);
            }
            return new RemoteActionCompatParcelizer(layoutNode.getWidth(), layoutNode.getHeight(), iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer, z3 && read(semanticsConfigurationWrite, false, sentryOptions), rect);
        } catch (Throwable th) {
            if (!IconCompatParcelizer) {
                IconCompatParcelizer = true;
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            int width2 = layoutNode.getWidth();
            int height2 = layoutNode.getHeight();
            float f3 = iconCompatParcelizer.IconCompatParcelizer;
            if (!layoutNode.getOuterCoordinator$ui_release().isTransparent() && rect.height() > 0) {
                rect.width();
            }
            return new RemoteActionCompatParcelizer(width2, height2, f3, iconCompatParcelizer, true, rect);
        }
    }

    public static void read(LayoutNode layoutNode, IconCompatParcelizer iconCompatParcelizer, boolean z, SentryOptions sentryOptions) {
        List children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = (LayoutNode) children$ui_release.get(i);
            IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(layoutNode2, iconCompatParcelizer, z, sentryOptions);
            if (iconCompatParcelizerRemoteActionCompatParcelizer != null) {
                arrayList.add(iconCompatParcelizerRemoteActionCompatParcelizer);
                read(layoutNode2, iconCompatParcelizerRemoteActionCompatParcelizer, false, sentryOptions);
            }
        }
        iconCompatParcelizer.write = arrayList;
    }
}
