package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.R;
import androidx.compose.ui.contentcapture.ContentCaptureManager;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsSortKt;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.ranges.RangesKt;
import o.StretchOverscrollNode;
import o.accessanimateTo;
import o.ensureSubscribedToInAppMessageEventslambda5;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static int IconCompatParcelizer = 0;
    private static byte read = -112;
    private static int serializer = 1;

    @ExperimentalComposeUiApi
    @onItemDismisslambda0
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    public static final boolean getDisableContentCapture() {
        return ContentCaptureManager.Companion.isEnabled();
    }

    public static final void setDisableContentCapture(boolean z) {
        ContentCaptureManager.Companion.setEnabled(z);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTraversalValues(final StretchOverscrollNode stretchOverscrollNode, accessanimateTo accessanimateto, accessanimateTo accessanimateto2, final Resources resources) {
        accessanimateto.read();
        accessanimateto2.read();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) stretchOverscrollNode.serializer(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        semanticsNode.getClass();
        List<SemanticsNode> listSubtreeSortedByGeometryGrouping = SemanticsSortKt.subtreeSortedByGeometryGrouping(semanticsNode, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(SemanticsNode semanticsNode2) {
                return Boolean.valueOf(stretchOverscrollNode.RemoteActionCompatParcelizer(semanticsNode2.getId()));
            }

            {
                super(1);
            }
        }, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(SemanticsNode semanticsNode2) {
                return Boolean.valueOf(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isScreenReaderFocusable(semanticsNode2, resources));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{semanticsNode}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
        int iWrite = SQLite.write((List) listSubtreeSortedByGeometryGrouping);
        int i = 1;
        if (1 > iWrite) {
            return;
        }
        while (true) {
            int id = listSubtreeSortedByGeometryGrouping.get(i - 1).getId();
            int id2 = listSubtreeSortedByGeometryGrouping.get(i).getId();
            accessanimateto.IconCompatParcelizer(id, id2);
            accessanimateto2.IconCompatParcelizer(id2, id);
            if (i == iWrite) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessibilityAction.getLabel(), accessibilityAction2.getLabel()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return !semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getDisabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getEditableText())) {
            Object[] objArr = {SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getFocused()), Boolean.TRUE};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        LayoutNode layoutNodeFindClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode$ui(), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Code duplicated, block: B:9:0x001a  */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(LayoutNode layoutNode) {
                boolean z;
                SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
                if (semanticsConfiguration != null) {
                    z = semanticsConfiguration.isMergingSemanticsOfDescendants() && semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getEditableText());
                }
                return Boolean.valueOf(z);
            }
        });
        if (layoutNodeFindClosestParentNode == null) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = layoutNodeFindClosestParentNode.getSemanticsConfiguration();
        if (semanticsConfiguration != null) {
            Object[] objArr2 = {SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsProperties.getFocused()), Boolean.TRUE};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getRole());
        boolean z = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getSelected())) != null) {
            int iM2821getTabo7Vup1c = Role.Companion.m2821getTabo7Vup1c();
            if (role == null || !Role.m2810equalsimpl0(role.m2813unboximpl(), iM2821getTabo7Vup1c)) {
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString getInfoText(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getEditableText());
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getText());
        return annotatedString == null ? list != null ? (AnnotatedString) onContentCardDismissed.MediaMetadataCompat(list) : null : annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScreenReaderFocusable(SemanticsNode semanticsNode, Resources resources) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getContentDescription());
        return !SemanticsOwnerKt.isHidden(semanticsNode) && (semanticsNode.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() || (semanticsNode.isUnmergedLeafNode$ui() && ((list != null ? (String) onContentCardDismissed.MediaMetadataCompat(list) : null) != null || getInfoText(semanticsNode) != null || getInfoStateDescriptionOrNull(semanticsNode, resources) != null || getInfoIsCheckable(semanticsNode))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        for (LayoutNode parent$ui = layoutNode.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(parent$ui)).booleanValue()) {
                return parent$ui;
            }
        }
        return null;
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    private static final String createStateDescriptionForTextField(SemanticsNode semanticsNode, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        String string;
        int i;
        int i2;
        int i3 = 2 % 2;
        SemanticsConfiguration config = semanticsNode.copyWithMergingEnabled$ui().getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Collection collection2 = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getContentDescription());
        if (collection2 != null) {
            int i4 = serializer + 97;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (collection2.isEmpty()) {
                collection = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getText());
                if (collection != null) {
                    charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getEditableText());
                    if (charSequence != null) {
                    }
                    string = resources.getString(R.string.state_empty);
                    if (!(!string.startsWith("%('"))) {
                        return string;
                    }
                    i = IconCompatParcelizer + 31;
                    serializer = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        Object[] objArr = new Object[1];
                        a(string.substring(3), objArr);
                        return ((String) objArr[0]).intern();
                    }
                    Object[] objArr2 = new Object[1];
                    a(string.substring(3), objArr2);
                    ((String) objArr2[0]).intern();
                    throw null;
                }
                i2 = serializer + 21;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    collection.isEmpty();
                    throw null;
                }
                if (collection.isEmpty()) {
                    charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getEditableText());
                    if (charSequence != null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                        if (!(!string.startsWith("%('"))) {
                            return string;
                        }
                        i = IconCompatParcelizer + 31;
                        serializer = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            Object[] objArr3 = new Object[1];
                            a(string.substring(3), objArr3);
                            return ((String) objArr3[0]).intern();
                        }
                        Object[] objArr4 = new Object[1];
                        a(string.substring(3), objArr4);
                        ((String) objArr4[0]).intern();
                        throw null;
                    }
                }
            }
        } else {
            collection = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getText());
            if (collection != null) {
                charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getEditableText());
                if (charSequence != null) {
                }
                string = resources.getString(R.string.state_empty);
                if (!(!string.startsWith("%('"))) {
                    return string;
                }
                i = IconCompatParcelizer + 31;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    Object[] objArr5 = new Object[1];
                    a(string.substring(3), objArr5);
                    return ((String) objArr5[0]).intern();
                }
                Object[] objArr6 = new Object[1];
                a(string.substring(3), objArr6);
                ((String) objArr6[0]).intern();
                throw null;
            }
            i2 = serializer + 21;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                collection.isEmpty();
                throw null;
            }
            if (collection.isEmpty()) {
                charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getEditableText());
                if (charSequence != null) {
                }
                string = resources.getString(R.string.state_empty);
                if (!(!string.startsWith("%('"))) {
                    return string;
                }
                i = IconCompatParcelizer + 31;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    Object[] objArr7 = new Object[1];
                    a(string.substring(3), objArr7);
                    return ((String) objArr7[0]).intern();
                }
                Object[] objArr8 = new Object[1];
                a(string.substring(3), objArr8);
                ((String) objArr8[0]).intern();
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    public static final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode, Resources resources) {
        int iRemoteActionCompatParcelizer;
        Locale locale;
        String string;
        String string2;
        int i;
        int i2 = 2 % 2;
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ?? orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getRole());
        Object obj = null;
        if (toggleableState != null) {
            int i3 = IconCompatParcelizer + 47;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0 ? (i = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()]) == 1 : (i = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()]) == 1) {
                int iM2820getSwitcho7Vup1c = Role.Companion.m2820getSwitcho7Vup1c();
                if (role != null && Role.m2810equalsimpl0(role.m2813unboximpl(), iM2820getSwitcho7Vup1c) && orNull == 0) {
                    orNull = resources.getString(R.string.state_on);
                    if (orNull.startsWith("%('")) {
                        Object[] objArr = new Object[1];
                        a(orNull.substring(3), objArr);
                        orNull = ((String) objArr[0]).intern();
                    }
                }
            } else {
                int i4 = serializer + 65;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0 ? i == 2 : i == 3) {
                    int iM2820getSwitcho7Vup1c2 = Role.Companion.m2820getSwitcho7Vup1c();
                    if (role == null) {
                        int i5 = serializer + 7;
                        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    } else if (Role.m2810equalsimpl0(role.m2813unboximpl(), iM2820getSwitcho7Vup1c2) && orNull == 0) {
                        orNull = resources.getString(R.string.state_off);
                        if (orNull.startsWith("%('")) {
                            int i7 = IconCompatParcelizer + 69;
                            serializer = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            Object[] objArr2 = new Object[1];
                            a(orNull.substring(3), objArr2);
                            orNull = ((String) objArr2[0]).intern();
                        }
                    }
                } else {
                    if (i != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    if (orNull == 0) {
                        orNull = resources.getString(R.string.indeterminate);
                        if (orNull.startsWith("%('")) {
                            Object[] objArr3 = new Object[1];
                            a(orNull.substring(3), objArr3);
                            orNull = ((String) objArr3[0]).intern();
                        }
                    }
                }
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getSelected());
        ?? Intern = orNull;
        if (bool != null) {
            int i9 = serializer + 1;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            boolean zBooleanValue = bool.booleanValue();
            int iM2821getTabo7Vup1c = Role.Companion.m2821getTabo7Vup1c();
            if (role == null || !Role.m2810equalsimpl0(role.m2813unboximpl(), iM2821getTabo7Vup1c)) {
                Intern = orNull;
                int i11 = serializer + 1;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                Intern = orNull;
                if (i11 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (orNull == 0) {
                    if (zBooleanValue) {
                        string2 = resources.getString(R.string.selected);
                        if (string2.startsWith("%('")) {
                            Intern = string2;
                            Object[] objArr4 = new Object[1];
                            a(string2.substring(3), objArr4);
                            Intern = ((String) objArr4[0]).intern();
                        }
                    } else {
                        string = resources.getString(R.string.not_selected);
                        if (string.startsWith("%('")) {
                            Intern = string;
                            Object[] objArr5 = new Object[1];
                            a(string.substring(3), objArr5);
                            Intern = ((String) objArr5[0]).intern();
                        }
                    }
                }
            }
        }
        Intern = string;
        Intern = string2;
        Intern = orNull;
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getProgressBarRangeInfo());
        ?? Intern2 = Intern;
        if (progressBarRangeInfo != null) {
            int i12 = serializer + 9;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (Intern == 0) {
                    ensureSubscribedToInAppMessageEventslambda5 range = progressBarRangeInfo.getRange();
                    float current = ((Number) range.IconCompatParcelizer()).floatValue() - ((Number) range.RemoteActionCompatParcelizer()).floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo.getCurrent() - ((Number) range.RemoteActionCompatParcelizer()).floatValue()) / (((Number) range.IconCompatParcelizer()).floatValue() - ((Number) range.RemoteActionCompatParcelizer()).floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (current == 0.0f) {
                        iRemoteActionCompatParcelizer = 0;
                    } else {
                        iRemoteActionCompatParcelizer = current == 1.0f ? 100 : RangesKt.RemoteActionCompatParcelizer(Math.round(current * 100.0f), 1, 99);
                    }
                    int i14 = R.string.template_percent;
                    Object[] objArr6 = {Integer.valueOf(iRemoteActionCompatParcelizer)};
                    Configuration configuration = resources.getConfiguration();
                    if (Build.VERSION.SDK_INT >= 24) {
                        int i15 = IconCompatParcelizer + 21;
                        serializer = i15 % Fields.SpotShadowColor;
                        locale = i15 % 2 == 0 ? configuration.getLocales().get(0) : configuration.getLocales().get(0);
                    } else {
                        locale = configuration.locale;
                    }
                    String string3 = resources.getString(i14);
                    if (string3.startsWith("%('")) {
                        Object[] objArr7 = new Object[1];
                        a(string3.substring(3), objArr7);
                        string3 = ((String) objArr7[0]).intern();
                    }
                    Intern2 = String.format(locale, string3, objArr6);
                }
            } else if (Intern == 0) {
                int i16 = serializer + 1;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                String string4 = resources.getString(R.string.in_progress);
                boolean z = !string4.startsWith("%('");
                Intern2 = string4;
                if (!z) {
                    Object[] objArr8 = new Object[1];
                    a(string4.substring(3), objArr8);
                    Intern2 = ((String) objArr8[0]).intern();
                }
            }
        }
        ?? CreateStateDescriptionForTextField = Intern2;
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getEditableText())) {
            int i18 = IconCompatParcelizer + 7;
            serializer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            CreateStateDescriptionForTextField = createStateDescriptionForTextField(semanticsNode, resources);
        }
        return (String) CreateStateDescriptionForTextField;
    }
}
