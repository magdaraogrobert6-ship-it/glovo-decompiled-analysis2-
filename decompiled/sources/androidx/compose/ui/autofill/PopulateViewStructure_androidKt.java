package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsInfoKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;
import o.createFromParcel;
import o.getCieXyz;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onRemeasuredozmzZPI;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class PopulateViewStructure_androidKt {
    /* JADX WARN: Code duplicated, block: B:101:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:154:0x0584  */
    /* JADX WARN: Code duplicated, block: B:159:0x058c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0596  */
    /* JADX WARN: Code duplicated, block: B:163:0x0598  */
    /* JADX WARN: Code duplicated, block: B:166:0x059e  */
    /* JADX WARN: Code duplicated, block: B:168:0x05aa A[LOOP:4: B:167:0x05a8->B:168:0x05aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:179:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:181:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:184:0x03b3 A[EDGE_INSN: B:184:0x03b3->B:72:0x03b3 BREAK  A[LOOP:0: B:9:0x003d->B:70:0x0392], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0390 A[DONT_INVERT, PHI: r4 r19 r20 r21 r22 r23 r24 r25 r26 r27 r28
  0x0390: PHI (r4v7 boolean) = (r4v6 boolean), (r4v8 boolean) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r19v6 androidx.compose.ui.autofill.ContentDataType) = (r19v5 androidx.compose.ui.autofill.ContentDataType), (r19v7 androidx.compose.ui.autofill.ContentDataType) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r21v8 androidx.compose.ui.state.ToggleableState) = (r21v7 androidx.compose.ui.state.ToggleableState), (r21v9 androidx.compose.ui.state.ToggleableState) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r22v6 androidx.compose.ui.text.AnnotatedString) = (r22v5 androidx.compose.ui.text.AnnotatedString), (r22v7 androidx.compose.ui.text.AnnotatedString) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r23v6 androidx.compose.ui.autofill.AndroidFillableData) = (r23v5 androidx.compose.ui.autofill.AndroidFillableData), (r23v7 androidx.compose.ui.autofill.AndroidFillableData) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r24v6 androidx.compose.ui.autofill.ContentType) = (r24v5 androidx.compose.ui.autofill.ContentType), (r24v7 androidx.compose.ui.autofill.ContentType) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r26v6 androidx.compose.ui.semantics.Role) = (r26v5 androidx.compose.ui.semantics.Role), (r26v7 androidx.compose.ui.semantics.Role) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]
  0x0390: PHI (r28v6 java.lang.Integer) = (r28v5 java.lang.Integer), (r28v7 java.lang.Integer) binds: [B:10:0x0047, B:68:0x038e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0392 A[LOOP:0: B:9:0x003d->B:70:0x0392, LOOP_END] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void populate(final ViewStructure viewStructure, SemanticsInfo semanticsInfo, AutofillId autofillId, String str, RectManager rectManager) {
        ToggleableState toggleableState;
        ContentDataType contentDataType;
        AnnotatedString annotatedString;
        AndroidFillableData androidFillableData;
        ContentType contentType;
        Boolean bool;
        Role role;
        Integer num;
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        String strM2783toLegacyClassNameV4PA4sw;
        int size;
        String string;
        int i2;
        String[] contentHints;
        String[] contentHints2;
        onRemeasuredozmzZPI props$ui;
        long[] jArr;
        long[] jArr2;
        onRemeasuredozmzZPI props$ui2;
        ToggleableState toggleableState2;
        boolean zBooleanValue;
        char c;
        final AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        char c2 = 7;
        long j = -9187201950435737472L;
        Integer numValueOf = null;
        if (semanticsConfiguration == null || (props$ui2 = semanticsConfiguration.getProps$ui()) == null) {
            toggleableState = null;
            contentDataType = null;
            annotatedString = null;
            androidFillableData = null;
            contentType = null;
            bool = null;
            role = null;
            num = null;
            z = true;
            z2 = false;
            z3 = false;
        } else {
            Object[] objArr = props$ui2.IconCompatParcelizer;
            Object[] objArr2 = props$ui2.MediaMetadataCompat;
            long[] jArr3 = props$ui2.write;
            int length = jArr3.length - 2;
            if (length >= 0) {
                contentDataType = null;
                toggleableState2 = null;
                annotatedString = null;
                androidFillableData = null;
                contentType = null;
                bool = null;
                role = null;
                num = null;
                zBooleanValue = true;
                int i3 = 0;
                z2 = false;
                z3 = false;
                while (true) {
                    long j2 = jArr3[i3];
                    Object[] objArr3 = objArr;
                    if ((((~j2) << c2) & j2 & j) == j) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                        objArr = objArr3;
                        c2 = 7;
                        j = -9187201950435737472L;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j2 & 255) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr3[i6];
                                Object obj2 = objArr2[i6];
                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getContentDataType()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    contentDataType = (ContentDataType) obj2;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getContentDescription()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    String str2 = (String) onContentCardDismissed.MediaMetadataCompat((List) obj2);
                                    if (str2 != null) {
                                        autofillApi26Helper.setContentDescription(viewStructure, str2);
                                    }
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getContentType()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    contentType = (ContentType) obj2;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getFillableData()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    androidFillableData = (AndroidFillableData) obj2;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getEditableText()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    annotatedString = (AnnotatedString) obj2;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getFocused()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    autofillApi26Helper.setFocused(viewStructure, ((Boolean) obj2).booleanValue());
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getMaxTextLength()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getPassword()}, getCieXyz.write())).booleanValue()) {
                                    c = '\b';
                                    z3 = true;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getIsSensitiveData()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getRole()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    role = (Role) obj2;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getSelected()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getToggleableState()}, getCieXyz.write())).booleanValue()) {
                                    obj2.getClass();
                                    toggleableState2 = (ToggleableState) obj2;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsActions.getOnClick()}, getCieXyz.write())).booleanValue()) {
                                    autofillApi26Helper.setClickable(viewStructure, true);
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsActions.getOnLongClick()}, getCieXyz.write())).booleanValue()) {
                                    autofillApi26Helper.setLongClickable(viewStructure, true);
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsActions.getRequestFocus()}, getCieXyz.write())).booleanValue()) {
                                    autofillApi26Helper.setFocusable(viewStructure, true);
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsActions.getSetText()}, getCieXyz.write())).booleanValue()) {
                                    c = '\b';
                                    z2 = true;
                                }
                                c = '\b';
                            } else {
                                c = '\b';
                            }
                            j2 >>= c;
                        }
                        if (i4 != 8) {
                            break;
                        }
                        if (i3 != length) {
                            break;
                        }
                        i3++;
                        objArr = objArr3;
                        c2 = 7;
                        j = -9187201950435737472L;
                    }
                }
            } else {
                contentDataType = null;
                toggleableState2 = null;
                annotatedString = null;
                androidFillableData = null;
                contentType = null;
                bool = null;
                role = null;
                num = null;
                zBooleanValue = true;
                z2 = false;
                z3 = false;
            }
            z = zBooleanValue;
            toggleableState = toggleableState2;
        }
        SemanticsConfiguration semanticsConfigurationMergedSemanticsConfiguration = SemanticsInfoKt.mergedSemanticsConfiguration(semanticsInfo);
        if (semanticsConfigurationMergedSemanticsConfiguration == null || (props$ui = semanticsConfigurationMergedSemanticsConfiguration.getProps$ui()) == null) {
            list = null;
        } else {
            Object[] objArr4 = props$ui.IconCompatParcelizer;
            Object[] objArr5 = props$ui.MediaMetadataCompat;
            long[] jArr4 = props$ui.write;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                list = null;
                int i7 = 0;
                while (true) {
                    long j3 = jArr4[i7];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length2)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j3 & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                Object obj3 = objArr4[i10];
                                Object obj4 = objArr5[i10];
                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) obj3;
                                jArr2 = jArr4;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey2, semanticsProperties.getDisabled()}, getCieXyz.write())).booleanValue()) {
                                    autofillApi26Helper.setEnabled(viewStructure, false);
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey2, semanticsProperties.getText()}, getCieXyz.write())).booleanValue()) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                            }
                            j3 >>= 8;
                            i9++;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        if (i8 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                    }
                    if (i7 == length2) {
                        break;
                    }
                    i7++;
                    jArr4 = jArr;
                }
            } else {
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(semanticsInfo.getSemanticsId());
        if (semanticsInfo.getParentInfo() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        autofillApi26Helper.setAutofillId(viewStructure, autofillId, iIntValue);
        autofillApi26Helper.setId(viewStructure, iIntValue, str, null, null);
        if (contentDataType != null) {
            numValueOf = Integer.valueOf(ContentDataType_androidKt.getDataType(contentDataType));
        } else if (z2) {
            numValueOf = 1;
        } else if (toggleableState != null) {
            numValueOf = 2;
        }
        if (numValueOf != null) {
            autofillApi26Helper.setAutofillType(viewStructure, numValueOf.intValue());
        }
        if (annotatedString != null) {
            autofillApi26Helper.setAutofillValue(viewStructure, autofillApi26Helper.getAutofillTextValue(annotatedString.getText()));
        }
        if (androidFillableData != null) {
            autofillApi26Helper.setAutofillValue(viewStructure, androidFillableData.getAutofillValue$ui());
        }
        if (contentType != null && (contentHints2 = ContentType_androidKt.getContentHints(contentType)) != null) {
            autofillApi26Helper.setAutofillHints(viewStructure, contentHints2);
        }
        rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt.populate.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
            public /* synthetic */ Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                invoke(((Number) obj5).intValue(), ((Number) obj6).intValue(), ((Number) obj7).intValue(), ((Number) obj8).intValue());
                return createFromParcel.INSTANCE;
            }

            public final void invoke(int i11, int i12, int i13, int i14) {
                autofillApi26Helper.setDimens(viewStructure, i11, i12, 0, 0, i13 - i11, i14 - i12);
            }
        });
        if (bool != null) {
            autofillApi26Helper.setSelected(viewStructure, bool.booleanValue());
        }
        if (toggleableState != null) {
            autofillApi26Helper.setCheckable(viewStructure, true);
            autofillApi26Helper.setChecked(viewStructure, toggleableState == ToggleableState.On);
        } else if (bool != null) {
            int iM2821getTabo7Vup1c = Role.Companion.m2821getTabo7Vup1c();
            if (role == null || !Role.m2810equalsimpl0(role.m2813unboximpl(), iM2821getTabo7Vup1c)) {
                autofillApi26Helper.setCheckable(viewStructure, true);
                autofillApi26Helper.setChecked(viewStructure, bool.booleanValue());
            }
        }
        String str3 = (String) onContentCardClicked.serializer(ContentType_androidKt.getContentHints(ContentType.Companion.getPassword()));
        if (contentType != null && (contentHints = ContentType_androidKt.getContentHints(contentType)) != null) {
            z4 = true;
            boolean z7 = onContentCardClicked.IconCompatParcelizer(contentHints, str3);
            if (!z3 || z7) {
                z5 = z4;
            } else {
                z5 = false;
            }
            if (!z5 || z) {
                z6 = z4;
            } else {
                z6 = false;
            }
            autofillApi26Helper.setDataIsSensitive(viewStructure, z6);
            if (semanticsInfo.isTransparent()) {
                i = 4;
            } else {
                i = 0;
            }
            autofillApi26Helper.setVisibility(viewStructure, i);
            if (list != null) {
                size = list.size();
                string = "";
                for (i2 = 0; i2 < size; i2++) {
                    AnnotatedString annotatedString2 = (AnnotatedString) list.get(i2);
                    StringBuilder sbM = d$$ExternalSyntheticOutline0.m(string);
                    sbM.append(annotatedString2.getText());
                    sbM.append('\n');
                    string = sbM.toString();
                }
                autofillApi26Helper.setText(viewStructure, string);
                autofillApi26Helper.setClassName(viewStructure, AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            }
            if (semanticsInfo.getChildrenInfo().isEmpty() && role != null && (strM2783toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m2783toLegacyClassNameV4PA4sw(role.m2813unboximpl())) != null) {
                autofillApi26Helper.setClassName(viewStructure, strM2783toLegacyClassNameV4PA4sw);
            }
            if (z2) {
                autofillApi26Helper.setClassName(viewStructure, AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                if (num != null) {
                    AutofillApi28Helper.INSTANCE.setMaxTextLength(viewStructure, num.intValue());
                }
                if (z5) {
                    autofillApi26Helper.setInputType(viewStructure, 129);
                }
            }
        }
        z4 = true;
        if (z3) {
            z5 = z4;
        } else {
            z5 = z4;
        }
        if (z5) {
            z6 = z4;
        } else {
            z6 = z4;
        }
        autofillApi26Helper.setDataIsSensitive(viewStructure, z6);
        if (semanticsInfo.isTransparent()) {
            i = 4;
        } else {
            i = 0;
        }
        autofillApi26Helper.setVisibility(viewStructure, i);
        if (list != null) {
            size = list.size();
            string = "";
            while (i2 < size) {
                AnnotatedString annotatedString3 = (AnnotatedString) list.get(i2);
                StringBuilder sbM2 = d$$ExternalSyntheticOutline0.m(string);
                sbM2.append(annotatedString3.getText());
                sbM2.append('\n');
                string = sbM2.toString();
            }
            autofillApi26Helper.setText(viewStructure, string);
            autofillApi26Helper.setClassName(viewStructure, AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
        }
        if (semanticsInfo.getChildrenInfo().isEmpty()) {
            autofillApi26Helper.setClassName(viewStructure, strM2783toLegacyClassNameV4PA4sw);
        }
        if (z2) {
            autofillApi26Helper.setClassName(viewStructure, AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
            if (num != null) {
                AutofillApi28Helper.INSTANCE.setMaxTextLength(viewStructure, num.intValue());
            }
            if (z5) {
                autofillApi26Helper.setInputType(viewStructure, 129);
            }
        }
    }
}
