package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import bo.app.a5$$ExternalSyntheticLambda0;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d4$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ImageResources_androidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.getBias;
import o.getBirthDateFull;
import o.getBottomEndannotations;
import o.getBottomLeft;
import o.getBottomannotations;
import o.getCenterEnd;
import o.getCenterHorizontallyannotations;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getOwnerScopeui;
import o.getPostalCode;
import o.getRight;
import o.isAppSetIdReadingEnabled;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setSpotShadowColor8_81llA;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicTextKt {
    public static final ArrayList access$measureWithTextRangeMeasureConstraints(List list, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (!((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = (Measurable) list.get(i);
            Object parentData = measurable.getParentData();
            parentData.getClass();
            ImageResources_androidKt imageResources_androidKtSerializer = ((getBias) parentData).write.serializer();
            arrayList.add(new onViewAttachedToWindowlambda0(measurable.mo2209measureBRTryo0(Constraints.Companion.m3635fitPrioritizingWidthZbe2FdA(imageResources_androidKtSerializer.write(), imageResources_androidKtSerializer.write(), imageResources_androidKtSerializer.serializer(), imageResources_androidKtSerializer.serializer())), imageResources_androidKtSerializer.IconCompatParcelizer()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: BasicText-CL7eQgs, reason: not valid java name */
    public static final void m98BasicTextCL7eQgs(final AnnotatedString annotatedString, final Modifier modifier, final TextStyle textStyle, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final int i, final boolean z, final int i2, final int i3, final Map map, getBirthDateFull getbirthdatefull, final int i4, final int i5) {
        int i6;
        int i7;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1343466571);
        if ((i4 & 6) == 0) {
            i6 = (getpostalcode2.read(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= getpostalcode2.read(textStyle) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i4 & 3072) == 0) {
            i6 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i4 & 24576) == 0) {
            i6 |= getpostalcode2.read(i) ? Fields.Clip : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= getpostalcode2.write(z) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= getpostalcode2.read(i2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i4) == 0) {
            i6 |= getpostalcode2.read(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i6 |= getpostalcode2.IconCompatParcelizer(map) ? 67108864 : 33554432;
        }
        int i8 = i6 | 805306368;
        if ((i5 & 6) == 0) {
            if ((i5 & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read((Object) null);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer((Object) null);
            }
            i7 = i5 | (zIconCompatParcelizer ? 4 : 2);
        } else {
            i7 = i5;
        }
        int i9 = 0;
        if (getpostalcode2.write(i8 & 1, ((i8 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            getBottomEndannotations.RemoteActionCompatParcelizer(i3, i2);
            if (getpostalcode2.write((getNewPassword) getOwnerScopeui.serializer) == null) {
                getpostalcode2.serializer(1588759409);
                getpostalcode2.IconCompatParcelizer(false);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = AnnotatedStringResolveInlineContentKt.write;
                boolean zHasStringAnnotations = annotatedString.hasStringAnnotations("androidx.compose.foundation.text.inlineContent", 0, annotatedString.getText().length());
                boolean zHasLinkAnnotations = annotatedString.hasLinkAnnotations(0, annotatedString.length());
                FontFamily.Resolver resolver = (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
                if (!zHasStringAnnotations && !zHasLinkAnnotations) {
                    getpostalcode2.serializer(1589006262);
                    getRight.read(annotatedString, textStyle, resolver, null, getpostalcode2);
                    Modifier modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, annotatedString, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, z, i2, i3, resolver, null, null, null);
                    getpostalcode = getpostalcode2;
                    int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, getBottomannotations.read, companion.getSetMeasurePolicy());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                        getpostalcode.IconCompatParcelizer(true);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        SentryUUID.write();
                        throw null;
                    }
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.serializer(1590022070);
                    boolean z2 = (i8 & 14) == 4;
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (z2 || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(annotatedString);
                        getpostalcode.write(objComponentActivity);
                    }
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
                    AnnotatedString annotatedString2 = (AnnotatedString) populateViewStructure_androidKtpopulate7.getValue();
                    boolean z3 = getpostalcode.read(populateViewStructure_androidKtpopulate7);
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new getBottomLeft(populateViewStructure_androidKtpopulate7, i9);
                        getpostalcode.write(objComponentActivity2);
                    }
                    int i10 = i8 << 6;
                    m100LayoutWithLinksAndInlineContent11Od_4g(modifier, annotatedString2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, zHasStringAnnotations, map, textStyle, i, z, i2, i3, resolver, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), ((i8 >> 21) & 896) | ((i7 << 12) & 57344));
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                return;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getCenterRight
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.foundation.text.BasicTextKt.m98BasicTextCL7eQgs(annotatedString, modifier, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, z, i2, i3, map, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), ContentType_androidKt.RemoteActionCompatParcelizer(i5));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x0193  */
    /* JADX WARN: Code duplicated, block: B:117:0x019f  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:121:0x0218  */
    /* JADX WARN: Code duplicated, block: B:123:0x021f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0223  */
    /* JADX WARN: Code duplicated, block: B:126:0x025a  */
    /* JADX WARN: Code duplicated, block: B:128:0x025e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0289  */
    /* JADX WARN: Code duplicated, block: B:133:0x0298  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: BasicText-RWo7tUw, reason: not valid java name */
    public static final void m99BasicTextRWo7tUw(final String str, final Modifier modifier, final TextStyle textStyle, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, boolean z, final int i2, int i3, getBirthDateFull getbirthdatefull, final int i4, final int i5) throws Throwable {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean zIconCompatParcelizer;
        int i16;
        boolean z3;
        getPostalCode getpostalcode;
        final int i17;
        int i18;
        final boolean z4;
        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        int iM3568getClipgIe3tQ8;
        boolean z5;
        int i19;
        FontFamily.Resolver resolver;
        Executor executor;
        boolean z6;
        Throwable th;
        int i20;
        Modifier modifierRemoteActionCompatParcelizer;
        int iHashCode;
        Modifier modifierMaterializeModifier;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i21;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (getpostalcode2.read(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= getpostalcode2.read(textStyle) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i22 = i5 & 8;
        if (i22 == 0) {
            if ((i4 & 3072) == 0) {
                i6 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                if ((i4 & 24576) == 0) {
                    i8 = i;
                    if (getpostalcode2.read(i8)) {
                        i9 = Fields.Clip;
                    } else {
                        i9 = 8192;
                    }
                    i6 |= i9;
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                    if ((196608 & i4) == 0) {
                        z2 = z;
                        if (getpostalcode2.write(z2)) {
                            i11 = Fields.RenderEffect;
                        } else {
                            i11 = 65536;
                        }
                        i6 |= i11;
                    }
                    if ((1572864 & i4) == 0) {
                        if (getpostalcode2.read(i2)) {
                            i21 = 1048576;
                        } else {
                            i21 = Fields.BlendMode;
                        }
                        i6 |= i21;
                    }
                    i12 = i5 & Fields.SpotShadowColor;
                    if (i12 != 0) {
                        i6 |= 12582912;
                        i13 = i3;
                    } else {
                        i13 = i3;
                        if ((i4 & 12582912) == 0) {
                            if (getpostalcode2.read(i13)) {
                                i14 = 8388608;
                            } else {
                                i14 = 4194304;
                            }
                            i6 |= i14;
                        }
                    }
                    i15 = i6 | 100663296;
                    if ((i5 & Fields.RotationY) != 0) {
                        i15 = i6 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zIconCompatParcelizer = getpostalcode2.read((Object) null);
                        } else {
                            zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer((Object) null);
                        }
                        if (zIconCompatParcelizer) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i15 |= i16;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (getpostalcode2.write(i15 & 1, z3)) {
                        if (i22 != 0) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = null;
                        } else {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                        }
                        if (i7 != 0) {
                            iM3568getClipgIe3tQ8 = TextOverflow.Companion.m3568getClipgIe3tQ8();
                        } else {
                            iM3568getClipgIe3tQ8 = i8;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i12 != 0) {
                            i19 = 1;
                        } else {
                            i19 = i13;
                        }
                        getBottomEndannotations.RemoteActionCompatParcelizer(i19, i2);
                        if (getpostalcode2.write((getNewPassword) getOwnerScopeui.serializer) == null) {
                            getpostalcode2.serializer(356914239);
                            getpostalcode2.IconCompatParcelizer(false);
                            resolver = (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
                            executor = (Executor) getpostalcode2.write((getNewPassword) getRight.write);
                            if (executor == null && getRight.serializer(str.length())) {
                                getpostalcode2.serializer(1254298614);
                                try {
                                    executor.execute(new setSpotShadowColor8_81llA(textStyle, (LayoutDirection) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection()), str, (Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity()), resolver));
                                } catch (RejectedExecutionException unused) {
                                }
                                z6 = false;
                                getpostalcode2.IconCompatParcelizer(false);
                            } else {
                                z6 = false;
                                getpostalcode2.serializer(1255914055);
                                getpostalcode2.IconCompatParcelizer(false);
                            }
                            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 == null) {
                                getpostalcode2.serializer(357875859);
                                getpostalcode2.IconCompatParcelizer(z6);
                                modifierRemoteActionCompatParcelizer = modifier.then(new TextStringSimpleElement(str, textStyle, resolver, iM3568getClipgIe3tQ8, z5, i2, i19));
                                i20 = i19;
                                getpostalcode = getpostalcode2;
                                th = null;
                            } else {
                                getpostalcode2.serializer(357232113);
                                th = null;
                                i20 = i19;
                                getpostalcode = getpostalcode2;
                                modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, new AnnotatedString(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, iM3568getClipgIe3tQ8, z5, i2, i20, (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, null);
                                getpostalcode.IconCompatParcelizer(z6);
                            }
                            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                            companion = ComposeUiNode.Companion;
                            constructor = companion.getConstructor();
                            if (getpostalcode.read != null) {
                                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (getpostalcode.ComponentActivity) {
                                    getpostalcode.serializer(constructor);
                                } else {
                                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                                AndroidContentCaptureManagerCompanion.write(getpostalcode, getBottomannotations.read, companion.getSetMeasurePolicy());
                                AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                                AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                                AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                                getpostalcode.IconCompatParcelizer(true);
                                i18 = i20;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                                i17 = iM3568getClipgIe3tQ8;
                                z4 = z5;
                            } else {
                                SentryUUID.write();
                                throw th;
                            }
                        } else {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                            return;
                        }
                    } else {
                        getpostalcode = getpostalcode2;
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        i17 = i8;
                        i18 = i13;
                        z4 = z2;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    }
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        final int i23 = i18;
                        gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBottomRight
                            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                            public final Object invoke(Object obj, Object obj2) throws Throwable {
                                ((Integer) obj2).getClass();
                                androidx.compose.foundation.text.BasicTextKt.m99BasicTextRWo7tUw(str, modifier, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i17, z4, i2, i23, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i5);
                                return createFromParcel.INSTANCE;
                            }
                        };
                    }
                }
                i6 |= 196608;
                z2 = z;
                if ((1572864 & i4) == 0) {
                    if (getpostalcode2.read(i2)) {
                        i21 = 1048576;
                    } else {
                        i21 = Fields.BlendMode;
                    }
                    i6 |= i21;
                }
                i12 = i5 & Fields.SpotShadowColor;
                if (i12 != 0) {
                    i6 |= 12582912;
                    i13 = i3;
                } else {
                    i13 = i3;
                    if ((i4 & 12582912) == 0) {
                        if (getpostalcode2.read(i13)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i6 | 100663296;
                if ((i5 & Fields.RotationY) != 0) {
                    i15 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zIconCompatParcelizer = getpostalcode2.read((Object) null);
                    } else {
                        zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer((Object) null);
                    }
                    if (zIconCompatParcelizer) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i15 |= i16;
                }
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode2.write(i15 & 1, z3)) {
                    if (i22 != 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = null;
                    } else {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    }
                    if (i7 != 0) {
                        iM3568getClipgIe3tQ8 = TextOverflow.Companion.m3568getClipgIe3tQ8();
                    } else {
                        iM3568getClipgIe3tQ8 = i8;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i13;
                    }
                    getBottomEndannotations.RemoteActionCompatParcelizer(i19, i2);
                    if (getpostalcode2.write((getNewPassword) getOwnerScopeui.serializer) == null) {
                        getpostalcode2.serializer(356914239);
                        getpostalcode2.IconCompatParcelizer(false);
                        resolver = (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
                        executor = (Executor) getpostalcode2.write((getNewPassword) getRight.write);
                        if (executor == null) {
                            z6 = false;
                            getpostalcode2.serializer(1255914055);
                            getpostalcode2.IconCompatParcelizer(false);
                        } else {
                            z6 = false;
                            getpostalcode2.serializer(1255914055);
                            getpostalcode2.IconCompatParcelizer(false);
                        }
                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 == null) {
                            getpostalcode2.serializer(357875859);
                            getpostalcode2.IconCompatParcelizer(z6);
                            modifierRemoteActionCompatParcelizer = modifier.then(new TextStringSimpleElement(str, textStyle, resolver, iM3568getClipgIe3tQ8, z5, i2, i19));
                            i20 = i19;
                            getpostalcode = getpostalcode2;
                            th = null;
                        } else {
                            getpostalcode2.serializer(357232113);
                            th = null;
                            i20 = i19;
                            getpostalcode = getpostalcode2;
                            modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, new AnnotatedString(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, iM3568getClipgIe3tQ8, z5, i2, i20, (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, null);
                            getpostalcode.IconCompatParcelizer(z6);
                        }
                        iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        companion = ComposeUiNode.Companion;
                        constructor = companion.getConstructor();
                        if (getpostalcode.read != null) {
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                getpostalcode.serializer(constructor);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, getBottomannotations.read, companion.getSetMeasurePolicy());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                            getpostalcode.IconCompatParcelizer(true);
                            i18 = i20;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                            i17 = iM3568getClipgIe3tQ8;
                            z4 = z5;
                        } else {
                            SentryUUID.write();
                            throw th;
                        }
                    } else {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                        return;
                    }
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i17 = i8;
                    i18 = i13;
                    z4 = z2;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final int i24 = i18;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBottomRight
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) throws Throwable {
                            ((Integer) obj2).getClass();
                            androidx.compose.foundation.text.BasicTextKt.m99BasicTextRWo7tUw(str, modifier, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i17, z4, i2, i24, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i5);
                            return createFromParcel.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 24576;
            i8 = i;
            i10 = i5 & 32;
            if (i10 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (getpostalcode2.write(z2)) {
                        i11 = Fields.RenderEffect;
                    } else {
                        i11 = 65536;
                    }
                    i6 |= i11;
                }
                if ((1572864 & i4) == 0) {
                    if (getpostalcode2.read(i2)) {
                        i21 = 1048576;
                    } else {
                        i21 = Fields.BlendMode;
                    }
                    i6 |= i21;
                }
                i12 = i5 & Fields.SpotShadowColor;
                if (i12 != 0) {
                    i6 |= 12582912;
                    i13 = i3;
                } else {
                    i13 = i3;
                    if ((i4 & 12582912) == 0) {
                        if (getpostalcode2.read(i13)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i6 | 100663296;
                if ((i5 & Fields.RotationY) != 0) {
                    i15 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zIconCompatParcelizer = getpostalcode2.read((Object) null);
                    } else {
                        zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer((Object) null);
                    }
                    if (zIconCompatParcelizer) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i15 |= i16;
                }
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode2.write(i15 & 1, z3)) {
                    if (i22 != 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = null;
                    } else {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    }
                    if (i7 != 0) {
                        iM3568getClipgIe3tQ8 = TextOverflow.Companion.m3568getClipgIe3tQ8();
                    } else {
                        iM3568getClipgIe3tQ8 = i8;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i13;
                    }
                    getBottomEndannotations.RemoteActionCompatParcelizer(i19, i2);
                    if (getpostalcode2.write((getNewPassword) getOwnerScopeui.serializer) == null) {
                        getpostalcode2.serializer(356914239);
                        getpostalcode2.IconCompatParcelizer(false);
                        resolver = (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
                        executor = (Executor) getpostalcode2.write((getNewPassword) getRight.write);
                        if (executor == null) {
                            z6 = false;
                            getpostalcode2.serializer(1255914055);
                            getpostalcode2.IconCompatParcelizer(false);
                        } else {
                            z6 = false;
                            getpostalcode2.serializer(1255914055);
                            getpostalcode2.IconCompatParcelizer(false);
                        }
                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 == null) {
                            getpostalcode2.serializer(357875859);
                            getpostalcode2.IconCompatParcelizer(z6);
                            modifierRemoteActionCompatParcelizer = modifier.then(new TextStringSimpleElement(str, textStyle, resolver, iM3568getClipgIe3tQ8, z5, i2, i19));
                            i20 = i19;
                            getpostalcode = getpostalcode2;
                            th = null;
                        } else {
                            getpostalcode2.serializer(357232113);
                            th = null;
                            i20 = i19;
                            getpostalcode = getpostalcode2;
                            modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, new AnnotatedString(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, iM3568getClipgIe3tQ8, z5, i2, i20, (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, null);
                            getpostalcode.IconCompatParcelizer(z6);
                        }
                        iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        companion = ComposeUiNode.Companion;
                        constructor = companion.getConstructor();
                        if (getpostalcode.read != null) {
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                getpostalcode.serializer(constructor);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, getBottomannotations.read, companion.getSetMeasurePolicy());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                            getpostalcode.IconCompatParcelizer(true);
                            i18 = i20;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                            i17 = iM3568getClipgIe3tQ8;
                            z4 = z5;
                        } else {
                            SentryUUID.write();
                            throw th;
                        }
                    } else {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                        return;
                    }
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i17 = i8;
                    i18 = i13;
                    z4 = z2;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final int i25 = i18;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBottomRight
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) throws Throwable {
                            ((Integer) obj2).getClass();
                            androidx.compose.foundation.text.BasicTextKt.m99BasicTextRWo7tUw(str, modifier, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i17, z4, i2, i25, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i5);
                            return createFromParcel.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 196608;
            z2 = z;
            if ((1572864 & i4) == 0) {
                if (getpostalcode2.read(i2)) {
                    i21 = 1048576;
                } else {
                    i21 = Fields.BlendMode;
                }
                i6 |= i21;
            }
            i12 = i5 & Fields.SpotShadowColor;
            if (i12 != 0) {
                i6 |= 12582912;
                i13 = i3;
            } else {
                i13 = i3;
                if ((i4 & 12582912) == 0) {
                    if (getpostalcode2.read(i13)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i6 |= i14;
                }
            }
            i15 = i6 | 100663296;
            if ((i5 & Fields.RotationY) != 0) {
                i15 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zIconCompatParcelizer = getpostalcode2.read((Object) null);
                } else {
                    zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer((Object) null);
                }
                if (zIconCompatParcelizer) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i15 |= i16;
            }
            if ((i15 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode2.write(i15 & 1, z3)) {
                if (i22 != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = null;
                } else {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                }
                if (i7 != 0) {
                    iM3568getClipgIe3tQ8 = TextOverflow.Companion.m3568getClipgIe3tQ8();
                } else {
                    iM3568getClipgIe3tQ8 = i8;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i12 != 0) {
                    i19 = 1;
                } else {
                    i19 = i13;
                }
                getBottomEndannotations.RemoteActionCompatParcelizer(i19, i2);
                if (getpostalcode2.write((getNewPassword) getOwnerScopeui.serializer) == null) {
                    getpostalcode2.serializer(356914239);
                    getpostalcode2.IconCompatParcelizer(false);
                    resolver = (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
                    executor = (Executor) getpostalcode2.write((getNewPassword) getRight.write);
                    if (executor == null) {
                        z6 = false;
                        getpostalcode2.serializer(1255914055);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        z6 = false;
                        getpostalcode2.serializer(1255914055);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 == null) {
                        getpostalcode2.serializer(357875859);
                        getpostalcode2.IconCompatParcelizer(z6);
                        modifierRemoteActionCompatParcelizer = modifier.then(new TextStringSimpleElement(str, textStyle, resolver, iM3568getClipgIe3tQ8, z5, i2, i19));
                        i20 = i19;
                        getpostalcode = getpostalcode2;
                        th = null;
                    } else {
                        getpostalcode2.serializer(357232113);
                        th = null;
                        i20 = i19;
                        getpostalcode = getpostalcode2;
                        modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, new AnnotatedString(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, iM3568getClipgIe3tQ8, z5, i2, i20, (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, null);
                        getpostalcode.IconCompatParcelizer(z6);
                    }
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, getBottomannotations.read, companion.getSetMeasurePolicy());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                        getpostalcode.IconCompatParcelizer(true);
                        i18 = i20;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                        i17 = iM3568getClipgIe3tQ8;
                        z4 = z5;
                    } else {
                        SentryUUID.write();
                        throw th;
                    }
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                    return;
                }
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i17 = i8;
                i18 = i13;
                z4 = z2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final int i26 = i18;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBottomRight
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        ((Integer) obj2).getClass();
                        androidx.compose.foundation.text.BasicTextKt.m99BasicTextRWo7tUw(str, modifier, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i17, z4, i2, i26, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i5);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i6 |= 3072;
        i7 = i5 & 16;
        if (i7 != 0) {
            if ((i4 & 24576) == 0) {
                i8 = i;
                if (getpostalcode2.read(i8)) {
                    i9 = Fields.Clip;
                } else {
                    i9 = 8192;
                }
                i6 |= i9;
            }
            i10 = i5 & 32;
            if (i10 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (getpostalcode2.write(z2)) {
                        i11 = Fields.RenderEffect;
                    } else {
                        i11 = 65536;
                    }
                    i6 |= i11;
                }
                if ((1572864 & i4) == 0) {
                    if (getpostalcode2.read(i2)) {
                        i21 = 1048576;
                    } else {
                        i21 = Fields.BlendMode;
                    }
                    i6 |= i21;
                }
                i12 = i5 & Fields.SpotShadowColor;
                if (i12 != 0) {
                    i6 |= 12582912;
                    i13 = i3;
                } else {
                    i13 = i3;
                    if ((i4 & 12582912) == 0) {
                        if (getpostalcode2.read(i13)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i6 | 100663296;
                if ((i5 & Fields.RotationY) != 0) {
                    i15 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zIconCompatParcelizer = getpostalcode2.read((Object) null);
                    } else {
                        zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer((Object) null);
                    }
                    if (zIconCompatParcelizer) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i15 |= i16;
                }
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode2.write(i15 & 1, z3)) {
                    if (i22 != 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = null;
                    } else {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    }
                    if (i7 != 0) {
                        iM3568getClipgIe3tQ8 = TextOverflow.Companion.m3568getClipgIe3tQ8();
                    } else {
                        iM3568getClipgIe3tQ8 = i8;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i13;
                    }
                    getBottomEndannotations.RemoteActionCompatParcelizer(i19, i2);
                    if (getpostalcode2.write((getNewPassword) getOwnerScopeui.serializer) == null) {
                        getpostalcode2.serializer(356914239);
                        getpostalcode2.IconCompatParcelizer(false);
                        resolver = (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
                        executor = (Executor) getpostalcode2.write((getNewPassword) getRight.write);
                        if (executor == null) {
                            z6 = false;
                            getpostalcode2.serializer(1255914055);
                            getpostalcode2.IconCompatParcelizer(false);
                        } else {
                            z6 = false;
                            getpostalcode2.serializer(1255914055);
                            getpostalcode2.IconCompatParcelizer(false);
                        }
                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 == null) {
                            getpostalcode2.serializer(357875859);
                            getpostalcode2.IconCompatParcelizer(z6);
                            modifierRemoteActionCompatParcelizer = modifier.then(new TextStringSimpleElement(str, textStyle, resolver, iM3568getClipgIe3tQ8, z5, i2, i19));
                            i20 = i19;
                            getpostalcode = getpostalcode2;
                            th = null;
                        } else {
                            getpostalcode2.serializer(357232113);
                            th = null;
                            i20 = i19;
                            getpostalcode = getpostalcode2;
                            modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, new AnnotatedString(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, iM3568getClipgIe3tQ8, z5, i2, i20, (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, null);
                            getpostalcode.IconCompatParcelizer(z6);
                        }
                        iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        companion = ComposeUiNode.Companion;
                        constructor = companion.getConstructor();
                        if (getpostalcode.read != null) {
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                getpostalcode.serializer(constructor);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, getBottomannotations.read, companion.getSetMeasurePolicy());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                            getpostalcode.IconCompatParcelizer(true);
                            i18 = i20;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                            i17 = iM3568getClipgIe3tQ8;
                            z4 = z5;
                        } else {
                            SentryUUID.write();
                            throw th;
                        }
                    } else {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                        return;
                    }
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i17 = i8;
                    i18 = i13;
                    z4 = z2;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final int i27 = i18;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBottomRight
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) throws Throwable {
                            ((Integer) obj2).getClass();
                            androidx.compose.foundation.text.BasicTextKt.m99BasicTextRWo7tUw(str, modifier, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i17, z4, i2, i27, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i5);
                            return createFromParcel.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 196608;
            z2 = z;
            if ((1572864 & i4) == 0) {
                if (getpostalcode2.read(i2)) {
                    i21 = 1048576;
                } else {
                    i21 = Fields.BlendMode;
                }
                i6 |= i21;
            }
            i12 = i5 & Fields.SpotShadowColor;
            if (i12 != 0) {
                i6 |= 12582912;
                i13 = i3;
            } else {
                i13 = i3;
                if ((i4 & 12582912) == 0) {
                    if (getpostalcode2.read(i13)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i6 |= i14;
                }
            }
            i15 = i6 | 100663296;
            if ((i5 & Fields.RotationY) != 0) {
                i15 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zIconCompatParcelizer = getpostalcode2.read((Object) null);
                } else {
                    zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer((Object) null);
                }
                if (zIconCompatParcelizer) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i15 |= i16;
            }
            if ((i15 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode2.write(i15 & 1, z3)) {
                if (i22 != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = null;
                } else {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                }
                if (i7 != 0) {
                    iM3568getClipgIe3tQ8 = TextOverflow.Companion.m3568getClipgIe3tQ8();
                } else {
                    iM3568getClipgIe3tQ8 = i8;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i12 != 0) {
                    i19 = 1;
                } else {
                    i19 = i13;
                }
                getBottomEndannotations.RemoteActionCompatParcelizer(i19, i2);
                if (getpostalcode2.write((getNewPassword) getOwnerScopeui.serializer) == null) {
                    getpostalcode2.serializer(356914239);
                    getpostalcode2.IconCompatParcelizer(false);
                    resolver = (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
                    executor = (Executor) getpostalcode2.write((getNewPassword) getRight.write);
                    if (executor == null) {
                        z6 = false;
                        getpostalcode2.serializer(1255914055);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        z6 = false;
                        getpostalcode2.serializer(1255914055);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 == null) {
                        getpostalcode2.serializer(357875859);
                        getpostalcode2.IconCompatParcelizer(z6);
                        modifierRemoteActionCompatParcelizer = modifier.then(new TextStringSimpleElement(str, textStyle, resolver, iM3568getClipgIe3tQ8, z5, i2, i19));
                        i20 = i19;
                        getpostalcode = getpostalcode2;
                        th = null;
                    } else {
                        getpostalcode2.serializer(357232113);
                        th = null;
                        i20 = i19;
                        getpostalcode = getpostalcode2;
                        modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, new AnnotatedString(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, iM3568getClipgIe3tQ8, z5, i2, i20, (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, null);
                        getpostalcode.IconCompatParcelizer(z6);
                    }
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, getBottomannotations.read, companion.getSetMeasurePolicy());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                        getpostalcode.IconCompatParcelizer(true);
                        i18 = i20;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                        i17 = iM3568getClipgIe3tQ8;
                        z4 = z5;
                    } else {
                        SentryUUID.write();
                        throw th;
                    }
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                    return;
                }
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i17 = i8;
                i18 = i13;
                z4 = z2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final int i28 = i18;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBottomRight
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        ((Integer) obj2).getClass();
                        androidx.compose.foundation.text.BasicTextKt.m99BasicTextRWo7tUw(str, modifier, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i17, z4, i2, i28, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i5);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i6 |= 24576;
        i8 = i;
        i10 = i5 & 32;
        if (i10 != 0) {
            if ((196608 & i4) == 0) {
                z2 = z;
                if (getpostalcode2.write(z2)) {
                    i11 = Fields.RenderEffect;
                } else {
                    i11 = 65536;
                }
                i6 |= i11;
            }
            if ((1572864 & i4) == 0) {
                if (getpostalcode2.read(i2)) {
                    i21 = 1048576;
                } else {
                    i21 = Fields.BlendMode;
                }
                i6 |= i21;
            }
            i12 = i5 & Fields.SpotShadowColor;
            if (i12 != 0) {
                i6 |= 12582912;
                i13 = i3;
            } else {
                i13 = i3;
                if ((i4 & 12582912) == 0) {
                    if (getpostalcode2.read(i13)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i6 |= i14;
                }
            }
            i15 = i6 | 100663296;
            if ((i5 & Fields.RotationY) != 0) {
                i15 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zIconCompatParcelizer = getpostalcode2.read((Object) null);
                } else {
                    zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer((Object) null);
                }
                if (zIconCompatParcelizer) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i15 |= i16;
            }
            if ((i15 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode2.write(i15 & 1, z3)) {
                if (i22 != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = null;
                } else {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                }
                if (i7 != 0) {
                    iM3568getClipgIe3tQ8 = TextOverflow.Companion.m3568getClipgIe3tQ8();
                } else {
                    iM3568getClipgIe3tQ8 = i8;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i12 != 0) {
                    i19 = 1;
                } else {
                    i19 = i13;
                }
                getBottomEndannotations.RemoteActionCompatParcelizer(i19, i2);
                if (getpostalcode2.write((getNewPassword) getOwnerScopeui.serializer) == null) {
                    getpostalcode2.serializer(356914239);
                    getpostalcode2.IconCompatParcelizer(false);
                    resolver = (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
                    executor = (Executor) getpostalcode2.write((getNewPassword) getRight.write);
                    if (executor == null) {
                        z6 = false;
                        getpostalcode2.serializer(1255914055);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        z6 = false;
                        getpostalcode2.serializer(1255914055);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 == null) {
                        getpostalcode2.serializer(357875859);
                        getpostalcode2.IconCompatParcelizer(z6);
                        modifierRemoteActionCompatParcelizer = modifier.then(new TextStringSimpleElement(str, textStyle, resolver, iM3568getClipgIe3tQ8, z5, i2, i19));
                        i20 = i19;
                        getpostalcode = getpostalcode2;
                        th = null;
                    } else {
                        getpostalcode2.serializer(357232113);
                        th = null;
                        i20 = i19;
                        getpostalcode = getpostalcode2;
                        modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, new AnnotatedString(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, iM3568getClipgIe3tQ8, z5, i2, i20, (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, null);
                        getpostalcode.IconCompatParcelizer(z6);
                    }
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, getBottomannotations.read, companion.getSetMeasurePolicy());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                        getpostalcode.IconCompatParcelizer(true);
                        i18 = i20;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                        i17 = iM3568getClipgIe3tQ8;
                        z4 = z5;
                    } else {
                        SentryUUID.write();
                        throw th;
                    }
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                    return;
                }
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i17 = i8;
                i18 = i13;
                z4 = z2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final int i29 = i18;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBottomRight
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        ((Integer) obj2).getClass();
                        androidx.compose.foundation.text.BasicTextKt.m99BasicTextRWo7tUw(str, modifier, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i17, z4, i2, i29, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i5);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i6 |= 196608;
        z2 = z;
        if ((1572864 & i4) == 0) {
            if (getpostalcode2.read(i2)) {
                i21 = 1048576;
            } else {
                i21 = Fields.BlendMode;
            }
            i6 |= i21;
        }
        i12 = i5 & Fields.SpotShadowColor;
        if (i12 != 0) {
            i6 |= 12582912;
            i13 = i3;
        } else {
            i13 = i3;
            if ((i4 & 12582912) == 0) {
                if (getpostalcode2.read(i13)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i6 |= i14;
            }
        }
        i15 = i6 | 100663296;
        if ((i5 & Fields.RotationY) != 0) {
            i15 = i6 | 905969664;
        } else if ((805306368 & i4) == 0) {
            if ((1073741824 & i4) == 0) {
                zIconCompatParcelizer = getpostalcode2.read((Object) null);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer((Object) null);
            }
            if (zIconCompatParcelizer) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i15 |= i16;
        }
        if ((i15 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode2.write(i15 & 1, z3)) {
            if (i22 != 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = null;
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }
            if (i7 != 0) {
                iM3568getClipgIe3tQ8 = TextOverflow.Companion.m3568getClipgIe3tQ8();
            } else {
                iM3568getClipgIe3tQ8 = i8;
            }
            if (i10 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i12 != 0) {
                i19 = 1;
            } else {
                i19 = i13;
            }
            getBottomEndannotations.RemoteActionCompatParcelizer(i19, i2);
            if (getpostalcode2.write((getNewPassword) getOwnerScopeui.serializer) == null) {
                getpostalcode2.serializer(356914239);
                getpostalcode2.IconCompatParcelizer(false);
                resolver = (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
                executor = (Executor) getpostalcode2.write((getNewPassword) getRight.write);
                if (executor == null) {
                    z6 = false;
                    getpostalcode2.serializer(1255914055);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    z6 = false;
                    getpostalcode2.serializer(1255914055);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 == null) {
                    getpostalcode2.serializer(357875859);
                    getpostalcode2.IconCompatParcelizer(z6);
                    modifierRemoteActionCompatParcelizer = modifier.then(new TextStringSimpleElement(str, textStyle, resolver, iM3568getClipgIe3tQ8, z5, i2, i19));
                    i20 = i19;
                    getpostalcode = getpostalcode2;
                    th = null;
                } else {
                    getpostalcode2.serializer(357232113);
                    th = null;
                    i20 = i19;
                    getpostalcode = getpostalcode2;
                    modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, new AnnotatedString(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, iM3568getClipgIe3tQ8, z5, i2, i20, (FontFamily.Resolver) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, null);
                    getpostalcode.IconCompatParcelizer(z6);
                }
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, getBottomannotations.read, companion.getSetMeasurePolicy());
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                    getpostalcode.IconCompatParcelizer(true);
                    i18 = i20;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                    i17 = iM3568getClipgIe3tQ8;
                    z4 = z5;
                } else {
                    SentryUUID.write();
                    throw th;
                }
            } else {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                return;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i17 = i8;
            i18 = i13;
            z4 = z2;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i210 = i18;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBottomRight
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    ((Integer) obj2).getClass();
                    androidx.compose.foundation.text.BasicTextKt.m99BasicTextRWo7tUw(str, modifier, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i17, z4, i2, i210, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i5);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0284  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [androidx.compose.foundation.text.TextLinkScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r1v4, types: [o.getBirthDateFull, o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX INFO: renamed from: LayoutWithLinksAndInlineContent-11Od_4g, reason: not valid java name */
    public static final void m100LayoutWithLinksAndInlineContent11Od_4g(final Modifier modifier, final AnnotatedString annotatedString, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final boolean z, final Map map, final TextStyle textStyle, final int i, final boolean z2, final int i2, final int i3, final FontFamily.Resolver resolver, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getBirthDateFull getbirthdatefull, final int i4, final int i5) {
        int i6;
        int i7;
        ?? r1;
        TextLinkScope textLinkScope;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        int i8;
        int i9;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8;
        int i10;
        ?? r16;
        Object obj;
        Object obj2;
        MeasurePolicy textMeasurePolicy;
        boolean z3;
        boolean z4;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        boolean zIconCompatParcelizer;
        Map map2 = map;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2118572703);
        if ((i4 & 6) == 0) {
            i6 = (getpostalcode.read(modifier) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= getpostalcode.read(annotatedString) ? 32 : 16;
        }
        int i11 = i4 & 384;
        int i12 = Fields.SpotShadowColor;
        if (i11 == 0) {
            i6 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : 128;
        }
        int i13 = i4 & 3072;
        int i14 = Fields.CameraDistance;
        if (i13 == 0) {
            i6 |= getpostalcode.write(z) ? 2048 : 1024;
        }
        int i15 = i4 & 24576;
        int i16 = Fields.Clip;
        if (i15 == 0) {
            i6 |= getpostalcode.IconCompatParcelizer(map2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= getpostalcode.read(textStyle) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= getpostalcode.read(i) ? 1048576 : Fields.BlendMode;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= getpostalcode.write(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= getpostalcode.read(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= getpostalcode.read(i3) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (getpostalcode.IconCompatParcelizer(resolver) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= getpostalcode.IconCompatParcelizer((Object) null) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer((Object) null)) {
                i12 = Fields.RotationX;
            }
            i7 |= i12;
        }
        if ((i5 & 3072) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                i14 = 1024;
            }
            i7 |= i14;
        }
        if ((i5 & 24576) == 0) {
            if ((32768 & i5) == 0) {
                zIconCompatParcelizer = getpostalcode.read((Object) null);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer((Object) null);
            }
            if (!zIconCompatParcelizer) {
                i16 = 8192;
            }
            i7 |= i16;
        }
        if (getpostalcode.write(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            boolean zHasLinkAnnotations = annotatedString.hasLinkAnnotations(0, annotatedString.length());
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zHasLinkAnnotations) {
                getpostalcode.serializer(145641571);
                boolean z5 = (i6 & 112) == 32;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                Object obj7 = objComponentActivity;
                if (z5 || objComponentActivity == androidContentCaptureManager) {
                    TextLinkScope textLinkScope2 = new TextLinkScope(annotatedString);
                    getpostalcode.write(textLinkScope2);
                    obj7 = textLinkScope2;
                }
                getpostalcode.IconCompatParcelizer(false);
                textLinkScope = (TextLinkScope) obj7;
            } else {
                getpostalcode.serializer(145707228);
                getpostalcode.IconCompatParcelizer(false);
                textLinkScope = null;
            }
            if (annotatedString.hasLinkAnnotations(0, annotatedString.length())) {
                getpostalcode.serializer(145905443);
                boolean z6 = (i6 & 112) == 32;
                boolean z7 = getpostalcode.read(textLinkScope);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if ((z6 || z7) || objComponentActivity2 == androidContentCaptureManager) {
                    d4$$ExternalSyntheticLambda2 d4__externalsyntheticlambda2 = new d4$$ExternalSyntheticLambda2(textLinkScope, 3, annotatedString);
                    getpostalcode.write(d4__externalsyntheticlambda2);
                    obj6 = d4__externalsyntheticlambda2;
                } else {
                    obj6 = objComponentActivity2;
                }
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6;
                i8 = 0;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(146002721);
                boolean z8 = (i6 & 112) == 32;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                Object obj8 = objComponentActivity3;
                if (z8 || objComponentActivity3 == androidContentCaptureManager) {
                    a5$$ExternalSyntheticLambda0 a5__externalsyntheticlambda0 = new a5$$ExternalSyntheticLambda0(2, annotatedString);
                    getpostalcode.write(a5__externalsyntheticlambda0);
                    obj8 = a5__externalsyntheticlambda0;
                }
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8;
                i8 = 0;
                getpostalcode.IconCompatParcelizer(false);
            }
            if (z) {
                if (map2 != null) {
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = AnnotatedStringResolveInlineContentKt.write;
                    if (!map.isEmpty()) {
                        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations("androidx.compose.foundation.text.inlineContent", i8, annotatedString.getText().length());
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = stringAnnotations.size();
                        int i17 = 0;
                        while (i17 < size) {
                            AnnotatedString.Range<String> range = stringAnnotations.get(i17);
                            List<AnnotatedString.Range<String>> list = stringAnnotations;
                            getCenterHorizontallyannotations getcenterhorizontallyannotations = (getCenterHorizontallyannotations) map2.get(range.getItem());
                            if (getcenterhorizontallyannotations != null) {
                                arrayList.add(new AnnotatedString.Range(getcenterhorizontallyannotations.IconCompatParcelizer, range.getStart(), range.getEnd()));
                                arrayList2.add(new AnnotatedString.Range(getcenterhorizontallyannotations.read, range.getStart(), range.getEnd()));
                            }
                            i17++;
                            map2 = map;
                            stringAnnotations = list;
                            size = size;
                            i6 = i6;
                        }
                        i9 = i6;
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(arrayList, arrayList2);
                    } else {
                        i9 = i6;
                        onviewattachedtowindowlambda0 = AnnotatedStringResolveInlineContentKt.write;
                    }
                } else {
                    i9 = i6;
                    onviewattachedtowindowlambda0 = AnnotatedStringResolveInlineContentKt.write;
                }
                populateViewStructure_androidKtpopulate7 = null;
            } else {
                i9 = i6;
                populateViewStructure_androidKtpopulate7 = null;
                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(null, null);
            }
            List list2 = (List) onviewattachedtowindowlambda0.serializer;
            List list3 = (List) onviewattachedtowindowlambda0.write;
            if (z) {
                getpostalcode.serializer(146318828);
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (objComponentActivity4 == androidContentCaptureManager) {
                    obj5 = objComponentActivity4;
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(populateViewStructure_androidKtpopulate7);
                    getpostalcode.write(populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer);
                    obj5 = populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer;
                }
                obj5 = objComponentActivity4;
                getpostalcode.IconCompatParcelizer(false);
                populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) obj5;
            } else {
                getpostalcode.serializer(146406588);
                getpostalcode.IconCompatParcelizer(false);
                populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
            }
            if (z) {
                getpostalcode.serializer(146499837);
                boolean z9 = getpostalcode.read(populateViewStructure_androidKtpopulate8);
                Object objComponentActivity5 = getpostalcode.ComponentActivity();
                if (z9 || objComponentActivity5 == androidContentCaptureManager) {
                    i10 = 1;
                    getBottomLeft getbottomleft = new getBottomLeft(populateViewStructure_androidKtpopulate8, i10);
                    getpostalcode.write(getbottomleft);
                    obj4 = getbottomleft;
                } else {
                    i10 = 1;
                    obj4 = objComponentActivity5;
                }
                getpostalcode.IconCompatParcelizer(false);
                r16 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
            } else {
                i10 = 1;
                getpostalcode.serializer(146571260);
                getpostalcode.IconCompatParcelizer(false);
                r16 = populateViewStructure_androidKtpopulate7;
            }
            getRight.read(annotatedString, textStyle, resolver, list2, getpostalcode);
            AnnotatedString annotatedString2 = (AnnotatedString) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(textLinkScope);
            int i18 = i9;
            int i19 = (i18 & 896) == 256 ? i10 : 0;
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if ((i19 | (zIconCompatParcelizer2 ? 1 : 0)) != 0 || objComponentActivity6 == androidContentCaptureManager) {
                Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(textLinkScope, 8, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                getpostalcode.write(recomposer$$ExternalSyntheticLambda4);
                obj = recomposer$$ExternalSyntheticLambda4;
            } else {
                obj = objComponentActivity6;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj;
            final ?? r10 = textLinkScope;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = populateViewStructure_androidKtpopulate8;
            ?? r2 = getpostalcode;
            Modifier modifierRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(modifier, annotatedString2, textStyle, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, i, z2, i2, i3, resolver, list2, r16, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
            if (!z) {
                r2.serializer(147750935);
                boolean zIconCompatParcelizer3 = r2.IconCompatParcelizer(r10);
                Object objComponentActivity7 = r2.ComponentActivity();
                if (zIconCompatParcelizer3 || objComponentActivity7 == androidContentCaptureManager) {
                    z4 = false;
                    final boolean z10 = false ? 1 : 0;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.getCenterLeft
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i20 = z10;
                            androidx.compose.foundation.text.TextLinkScope textLinkScope3 = r10;
                            if (i20 != 0) {
                                return Boolean.valueOf(textLinkScope3 != null ? ((Boolean) new CoroutineLiveData$$ExternalSyntheticLambda0(13, textLinkScope3).invoke()).booleanValue() : false);
                            }
                            return Boolean.valueOf(textLinkScope3 != null ? ((Boolean) new CoroutineLiveData$$ExternalSyntheticLambda0(13, textLinkScope3).invoke()).booleanValue() : false);
                        }
                    };
                    r2.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    obj3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                } else {
                    z4 = false;
                    obj3 = objComponentActivity7;
                }
                textMeasurePolicy = new getCenterEnd((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3);
                r2.IconCompatParcelizer(z4);
            } else {
                r2.serializer(147927697);
                boolean zIconCompatParcelizer4 = r2.IconCompatParcelizer(r10);
                Object objComponentActivity8 = r2.ComponentActivity();
                if (zIconCompatParcelizer4 || objComponentActivity8 == androidContentCaptureManager) {
                    obj2 = objComponentActivity8;
                    final int i20 = 1;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.getCenterLeft
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i21 = i20;
                            androidx.compose.foundation.text.TextLinkScope textLinkScope3 = r10;
                            if (i21 != 0) {
                                return Boolean.valueOf(textLinkScope3 != null ? ((Boolean) new CoroutineLiveData$$ExternalSyntheticLambda0(13, textLinkScope3).invoke()).booleanValue() : false);
                            }
                            return Boolean.valueOf(textLinkScope3 != null ? ((Boolean) new CoroutineLiveData$$ExternalSyntheticLambda0(13, textLinkScope3).invoke()).booleanValue() : false);
                        }
                    };
                    r2.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                    obj2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
                boolean z11 = r2.read(populateViewStructure_androidKtpopulate9);
                Object objComponentActivity9 = r2.ComponentActivity();
                Object obj9 = objComponentActivity9;
                if (z11 || objComponentActivity9 == androidContentCaptureManager) {
                    a5$$ExternalSyntheticLambda0 a5__externalsyntheticlambda1 = new a5$$ExternalSyntheticLambda0(3, populateViewStructure_androidKtpopulate9);
                    r2.write(a5__externalsyntheticlambda1);
                    obj9 = a5__externalsyntheticlambda1;
                }
                textMeasurePolicy = new TextMeasurePolicy(r8lambdardpfsr94j4iebcwx_kpqzpm8k3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9);
                r2.IconCompatParcelizer(false);
            }
            int iHashCode = Long.hashCode(r2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = r2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(r2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (r2.read != null) {
                r2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (r2.ComponentActivity) {
                    r2.serializer(constructor);
                } else {
                    r2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, (getPostalCode) r2, textMeasurePolicy, (getPostalCode) r2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(r2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, (getPostalCode) r2, Integer.valueOf(iHashCode), (getPostalCode) r2));
                if (r10 == 0) {
                    r2.serializer(-433557001);
                    z3 = false;
                } else {
                    r2.serializer(-291080374);
                    z3 = false;
                    r10.LinksComposables(r2, 0);
                }
                r2.IconCompatParcelizer(z3);
                if (list3 == null) {
                    r2.serializer(-433506223);
                } else {
                    r2.serializer(-433506222);
                    AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, list3, r2, (i18 >> 3) & 14);
                }
                r2.IconCompatParcelizer(false);
                r2.IconCompatParcelizer(true);
                r1 = r2;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getPostalCode getpostalcode2 = getpostalcode;
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r1 = getpostalcode2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = r1.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getTopRightannotations
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5);
                    androidx.compose.foundation.text.BasicTextKt.m100LayoutWithLinksAndInlineContent11Od_4g(modifier, annotatedString, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, map, textStyle, i, z2, i2, i3, resolver, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (getBirthDateFull) obj10, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static final Modifier RemoteActionCompatParcelizer(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3) {
        return modifier.then(Modifier.Companion).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, z, i2, i3, list, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3));
    }
}
