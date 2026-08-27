package io.sentry.compose.gestures;

import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import io.sentry.compose.serializer;
import io.sentry.internal.gestures.IconCompatParcelizer;
import io.sentry.internal.gestures.read;
import io.sentry.util.RemoteActionCompatParcelizer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.UriActionExternalSyntheticLambda4;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class ComposeGestureTargetLocator implements read {
    public final BrazeActionParserExternalSyntheticLambda0 IconCompatParcelizer;
    public volatile serializer read;
    public final RemoteActionCompatParcelizer write;

    public ComposeGestureTargetLocator(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        brazeActionParserExternalSyntheticLambda0.getClass();
        this.IconCompatParcelizer = brazeActionParserExternalSyntheticLambda0;
        this.write = new RemoteActionCompatParcelizer();
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.sentry:sentry-compose", "8.32.0");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02b5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:0x02b7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.internal.gestures.read
    public final io.sentry.internal.gestures.serializer locate(View view, float f, float f2, IconCompatParcelizer iconCompatParcelizer) {
        String str;
        ComposeGestureTargetLocator composeGestureTargetLocator;
        IconCompatParcelizer iconCompatParcelizer2;
        String str2;
        Rect zero;
        ComposeGestureTargetLocator composeGestureTargetLocator2 = this;
        IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer;
        iconCompatParcelizer.getClass();
        Object obj = null;
        if (!(view instanceof Owner)) {
            return null;
        }
        if (composeGestureTargetLocator2.read == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = composeGestureTargetLocator2.write.serializer();
            try {
                if (composeGestureTargetLocator2.read == null) {
                    composeGestureTargetLocator2.read = new serializer(composeGestureTargetLocator2.IconCompatParcelizer);
                }
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                    throw th2;
                }
            }
        }
        LayoutNode root = ((Owner) view).getRoot();
        LinkedList linkedList = new LinkedList();
        linkedList.add(root);
        String str3 = null;
        String str4 = null;
        while (!linkedList.isEmpty()) {
            LayoutNode layoutNode = (LayoutNode) linkedList.poll();
            if (layoutNode != null) {
                if (layoutNode.isPlaced()) {
                    LayoutCoordinates coordinates = layoutNode.getCoordinates();
                    LayoutCoordinates coordinates2 = root.getCoordinates();
                    coordinates.getClass();
                    if (coordinates2 == null) {
                        coordinates2 = LayoutCoordinatesKt.findRootCoordinates(coordinates);
                    }
                    float fMo2217getSizeYbymL2g = (int) (coordinates2.mo2217getSizeYbymL2g() >> 32);
                    float fMo2217getSizeYbymL2g2 = (int) (coordinates2.mo2217getSizeYbymL2g() & 4294967295L);
                    Rect rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(coordinates2, coordinates, false, 2, obj);
                    float left = rectLocalBoundingBoxOf$default.getLeft();
                    if (left < 0.0f) {
                        left = 0.0f;
                    }
                    if (left > fMo2217getSizeYbymL2g) {
                        left = fMo2217getSizeYbymL2g;
                    }
                    float top = rectLocalBoundingBoxOf$default.getTop();
                    if (top < 0.0f) {
                        top = 0.0f;
                    }
                    if (top > fMo2217getSizeYbymL2g2) {
                        top = fMo2217getSizeYbymL2g2;
                    }
                    float right = rectLocalBoundingBoxOf$default.getRight();
                    if (right < 0.0f) {
                        right = 0.0f;
                    }
                    if (right <= fMo2217getSizeYbymL2g) {
                        fMo2217getSizeYbymL2g = right;
                    }
                    float bottom = rectLocalBoundingBoxOf$default.getBottom();
                    float f3 = bottom >= 0.0f ? bottom : 0.0f;
                    if (f3 <= fMo2217getSizeYbymL2g2) {
                        fMo2217getSizeYbymL2g2 = f3;
                    }
                    if (left == fMo2217getSizeYbymL2g || top == fMo2217getSizeYbymL2g2) {
                        zero = Rect.Companion.getZero();
                        str2 = str4;
                    } else {
                        long jMo2222localToWindowMKHz9U = coordinates2.mo2222localToWindowMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(top)) & 4294967295L) | (((long) Float.floatToRawIntBits(left)) << 32)));
                        long jMo2222localToWindowMKHz9U2 = coordinates2.mo2222localToWindowMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(top)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo2217getSizeYbymL2g)) << 32)));
                        long jFloatToRawIntBits = Float.floatToRawIntBits(fMo2217getSizeYbymL2g);
                        String str5 = str4;
                        long jMo2222localToWindowMKHz9U3 = coordinates2.mo2222localToWindowMKHz9U(Offset.m469constructorimpl((jFloatToRawIntBits << 32) | (((long) Float.floatToRawIntBits(fMo2217getSizeYbymL2g2)) & 4294967295L)));
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(left);
                        str2 = str5;
                        long jMo2222localToWindowMKHz9U4 = coordinates2.mo2222localToWindowMKHz9U(Offset.m469constructorimpl((jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(fMo2217getSizeYbymL2g2)) & 4294967295L)));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U2 >> 32));
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U4 >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U3 >> 32));
                        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U & 4294967295L));
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U2 & 4294967295L));
                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U4 & 4294967295L));
                        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U3 & 4294967295L));
                        zero = new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
                    }
                    if (zero.m503containsk4lQ0M(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)))) {
                        List<ModifierInfo> modifierInfo = layoutNode.getModifierInfo();
                        int size = modifierInfo.size();
                        boolean z = false;
                        boolean z2 = false;
                        for (int i = 0; i < size; i++) {
                            ModifierInfo modifierInfo2 = modifierInfo.get(i);
                            serializer serializerVar = this.read;
                            serializerVar.getClass();
                            String strSerializer = serializerVar.serializer(modifierInfo2.getModifier());
                            if (strSerializer != null) {
                                str3 = str3;
                                str3 = strSerializer;
                            }
                            str3 = str3;
                            if (modifierInfo2.getModifier() instanceof SemanticsModifier) {
                                Modifier modifier = modifierInfo2.getModifier();
                                modifier.getClass();
                                Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = ((SemanticsModifier) modifier).getSemanticsConfiguration().iterator();
                                while (it.hasNext()) {
                                    String name = it.next().getKey().getName();
                                    if ("ScrollBy".equals(name)) {
                                        z = true;
                                    } else if ("OnClick".equals(name)) {
                                        z2 = true;
                                    }
                                }
                            } else {
                                String name2 = modifierInfo2.getModifier().getClass().getName();
                                if ("androidx.compose.foundation.ClickableElement".equals(name2) || "androidx.compose.foundation.CombinedClickableElement".equals(name2)) {
                                    z2 = true;
                                } else if ("androidx.compose.foundation.ScrollingLayoutElement".equals(name2) || "androidx.compose.foundation.ScrollingContainerElement".equals(name2)) {
                                    z = true;
                                }
                            }
                        }
                        str3 = str3;
                        composeGestureTargetLocator = this;
                        if (z2) {
                            iconCompatParcelizer2 = iconCompatParcelizer;
                            if (iconCompatParcelizer2 == IconCompatParcelizer.CLICKABLE) {
                                str4 = str3;
                            }
                            if (z && iconCompatParcelizer2 == IconCompatParcelizer.SCROLLABLE) {
                                str = str3;
                                if (str == null) {
                                    return null;
                                }
                                return new io.sentry.internal.gestures.serializer(null, null, null, str, "jetpack_compose");
                            }
                        } else {
                            iconCompatParcelizer2 = iconCompatParcelizer;
                        }
                        str4 = str2;
                        if (z) {
                            str = str3;
                            if (str == null) {
                                return null;
                            }
                            return new io.sentry.internal.gestures.serializer(null, null, null, str, "jetpack_compose");
                        }
                    } else {
                        composeGestureTargetLocator = this;
                        iconCompatParcelizer2 = iconCompatParcelizer;
                    }
                    LinkedList linkedList2 = linkedList;
                    linkedList2.addAll(layoutNode.getZSortedChildren().read());
                    linkedList = linkedList2;
                    root = root;
                    iconCompatParcelizer3 = iconCompatParcelizer2;
                    composeGestureTargetLocator2 = composeGestureTargetLocator;
                    obj = null;
                } else {
                    root = root;
                    composeGestureTargetLocator = composeGestureTargetLocator2;
                    iconCompatParcelizer2 = iconCompatParcelizer3;
                    linkedList = linkedList;
                    str3 = str3;
                    str2 = str4;
                    layoutNode = layoutNode;
                }
                str3 = str3;
                str4 = str2;
                LinkedList linkedList3 = linkedList;
                linkedList3.addAll(layoutNode.getZSortedChildren().read());
                linkedList = linkedList3;
                root = root;
                iconCompatParcelizer3 = iconCompatParcelizer2;
                composeGestureTargetLocator2 = composeGestureTargetLocator;
                obj = null;
            }
        }
        str = str4;
        if (str == null) {
            return null;
        }
        return new io.sentry.internal.gestures.serializer(null, null, null, str, "jetpack_compose");
    }
}
