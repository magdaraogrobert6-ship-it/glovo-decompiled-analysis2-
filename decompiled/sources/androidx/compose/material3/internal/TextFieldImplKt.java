package androidx.compose.material3.internal;

import androidx.collection.ObjectList$toString$1;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.mapbox.navigation.core.MapboxNavigation;
import io.sentry.SentryUUID;
import o.AndroidAutofillManager_androidKt;
import o.AndroidAutofillManageronFocusChanged21;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentDataType;
import o.AutofillTree;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SwitchKt;
import o.UiMediaScopeKeyboardKindCompanion;
import o.createFromParcel;
import o.getAndroidAutofillType;
import o.getAndroidRenderEffect;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getFartKroMQ;
import o.getHandleruiannotations;
import o.getList;
import o.getNewPassword;
import o.getPointerInputFilterannotations;
import o.getPostalCode;
import o.newChild;
import o.notifyViewVisibilityChanged;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.paddingqDBjuR0default;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafDO76o9OYYvjKpysJSsx90eBs8;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdaz8s0fQwEJ2REloWUnQw1hUaIxGo;
import o.removeNodeAtDepth;
import o.requiredHeightInVpY3zN4default;
import o.requiredSize3ABfNKs;
import o.requiredSizeInqDBjuR0default;
import o.requiredWidth3ABfNKs;
import o.reset;
import o.resolvePointerPrecision;
import o.setClickable;
import o.setFocused;
import o.setId;
import o.setInputType;
import o.setOpaque;
import o.setText;
import o.textValue;
import o.width;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextFieldImplKt {
    public static final float IconCompatParcelizer;
    public static final float MediaSessionCompatQueueItem = Dp.m3673constructorimpl(16.0f);
    public static final float RemoteActionCompatParcelizer;
    public static final float read;
    public static final float serializer;
    public static final float write;

    static {
        Dp.m3673constructorimpl(4.0f);
        Dp.m3673constructorimpl(4.0f);
        IconCompatParcelizer = Dp.m3673constructorimpl(4.0f);
        read = Dp.m3673constructorimpl(2.0f);
        write = Dp.m3673constructorimpl(24.0f);
        RemoteActionCompatParcelizer = Dp.m3673constructorimpl(16.0f);
        serializer = Dp.m3673constructorimpl(16.0f);
    }

    public static final float minimizedLabelHalfHeight(getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        long jM3115getLineHeightXSAIIZE = ((getAndroidAutofillType) getpostalcode.write((getNewPassword) AndroidContentDataType.RemoteActionCompatParcelizer)).IconCompatParcelizer.m3115getLineHeightXSAIIZE();
        long j = getList.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (!TextUnit.m3870isSpimpl(jM3115getLineHeightXSAIIZE)) {
            jM3115getLineHeightXSAIIZE = j;
        }
        return Dp.m3673constructorimpl(((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo43toDpGaN1DYA(jM3115getLineHeightXSAIIZE) / 2.0f);
    }

    public static final float textFieldHorizontalIconPadding(getBirthDateFull getbirthdatefull) {
        float fM3687unboximpl = ((Dp) ((getPostalCode) getbirthdatefull).write((getNewPassword) getFartKroMQ.write)).m3687unboximpl();
        if (Float.isNaN(fM3687unboximpl)) {
            fM3687unboximpl = Dp.m3673constructorimpl(0.0f);
        }
        float fM3673constructorimpl = Dp.m3673constructorimpl(Dp.m3673constructorimpl(fM3687unboximpl - SmallIconButtonTokens.IconCompatParcelizer) / 2.0f);
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
        if (fM3673constructorimpl < fM3673constructorimpl2) {
            fM3673constructorimpl = fM3673constructorimpl2;
        }
        return Dp.m3673constructorimpl(fM3673constructorimpl);
    }

    public static final void RemoteActionCompatParcelizer(long j, TextStyle textStyle, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(396611577);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.serializer(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Options.Companion.IconCompatParcelizer(j, textStyle, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, i2 & 1022);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setClickable(j, textStyle, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i, 0);
        }
    }

    public static final Alignment.Horizontal write(AndroidAutofillManageronFocusChanged21 androidAutofillManageronFocusChanged21) {
        if (androidAutofillManageronFocusChanged21 instanceof AndroidAutofillManager_androidKt) {
            return ((AndroidAutofillManager_androidKt) androidAutofillManageronFocusChanged21).read;
        }
        Gson$$ExternalSyntheticBUOutline0.m(androidAutofillManageronFocusChanged21, "Unknown position: ");
        return null;
    }

    public static final void IconCompatParcelizer(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(590397809);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.serializer(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            AndroidContentCaptureManagerCompanion.read(UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(j)), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i2 & 112) | 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setFocused(j, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0317  */
    /* JADX WARN: Code duplicated, block: B:227:0x0344  */
    public static final void CommonDecorationBox(final setText settext, final CharSequence charSequence, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final AndroidAutofillManager_androidKt androidAutofillManager_androidKt, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, final boolean z, final boolean z2, final boolean z3, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final SwitchKt switchKt, final TextFieldColors textFieldColors, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        newChild newchild;
        long j;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        reset resetVar;
        getPostalCode getpostalcode;
        int i5;
        TextFieldColors textFieldColors2;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode2;
        long j2;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode3;
        long j3;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode4;
        long j4;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode5;
        long j5;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode6;
        long j6;
        boolean z4;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode7;
        AndroidContentCaptureManager androidContentCaptureManager = AndroidContentCaptureManager.write;
        reset resetVar2 = reset.IconCompatParcelizer;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(546805032);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.read(settext.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(charSequence) ? 32 : 16;
        }
        int i6 = i & 384;
        int i7 = Fields.RotationX;
        if (i6 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 256 : 128;
        }
        int i8 = i & 3072;
        int i9 = Fields.RotationZ;
        if (i8 == 0) {
            i3 |= getpostalcode2.read(androidAutofillManager_androidKt) ? Fields.CameraDistance : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde5) ? 536870912 : 268435456;
        }
        int i10 = i3;
        if ((i2 & 6) == 0) {
            i4 = (getpostalcode2.IconCompatParcelizer((Object) null) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.write(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (!getpostalcode2.write(z2)) {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode2.write(z3)) {
                i9 = Fields.CameraDistance;
            }
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            i4 |= getpostalcode2.read(mutableInteractionSourceImpl) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= getpostalcode2.read(switchKt) ? Fields.RenderEffect : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= getpostalcode2.read(textFieldColors) ? 1048576 : Fields.BlendMode;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 8388608 : 4194304;
        }
        int i11 = i4;
        if (getpostalcode2.write(i10 & 1, ((306783379 & i10) == 306783378 && (i11 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) getPointerInputFilterannotations.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, getpostalcode2, (i11 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                newchild = newChild.Focused;
            } else if (charSequence.length() == 0) {
                newchild = newChild.UnfocusedEmpty;
            } else {
                newchild = newChild.UnfocusedNotEmpty;
            }
            if (!z2) {
                j = textFieldColors.serializer;
            } else if (z3) {
                j = textFieldColors.PlaybackStateCompatCustomAction;
            } else if (zBooleanValue) {
                j = textFieldColors.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            } else {
                j = textFieldColors.addObserverForBackInvokerlambda0;
            }
            getAndroidAutofillType getandroidautofilltype = (getAndroidAutofillType) getpostalcode2.write((getNewPassword) AndroidContentDataType.RemoteActionCompatParcelizer);
            final TextStyle textStyle = getandroidautofilltype.serializer;
            TextStyle textStyle2 = getandroidautofilltype.IconCompatParcelizer;
            long jM3106getColor0d7_KjU = textStyle.m3106getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            boolean z5 = (Color.m723equalsimpl0(jM3106getColor0d7_KjU, companion.m758getUnspecified0d7_KjU()) && !Color.m723equalsimpl0(textStyle2.m3106getColor0d7_KjU(), companion.m758getUnspecified0d7_KjU())) || (!Color.m723equalsimpl0(textStyle.m3106getColor0d7_KjU(), companion.m758getUnspecified0d7_KjU()) && Color.m723equalsimpl0(textStyle2.m3106getColor0d7_KjU(), companion.m758getUnspecified0d7_KjU()));
            long jM3106getColor0d7_KjU2 = textStyle2.m3106getColor0d7_KjU();
            if (z5 && jM3106getColor0d7_KjU2 == 16) {
                jM3106getColor0d7_KjU2 = j;
            }
            long jM3106getColor0d7_KjU3 = textStyle.m3106getColor0d7_KjU();
            long j7 = (z5 && jM3106getColor0d7_KjU3 == 16) ? j : jM3106getColor0d7_KjU3;
            boolean z6 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null;
            long j8 = jM3106getColor0d7_KjU2;
            Transition transitionSerializer = requiredHeightInVpY3zN4default.serializer(newchild, "TextFieldInputState", getpostalcode2, 48, 0);
            TransitionState transitionState = transitionSerializer.MediaSessionCompatToken;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = transitionSerializer.MediaBrowserCompatMediaItem;
            width widthVarSerializer = resolvePointerPrecision.serializer(AutofillTree.FastSpatial, getpostalcode2);
            newChild newchild2 = (newChild) transitionState.IconCompatParcelizer();
            getpostalcode2.serializer(-1436405362);
            int[] iArr = textValue.RemoteActionCompatParcelizer;
            int i12 = iArr[newchild2.ordinal()];
            float f6 = 1.0f;
            if (i12 == 1) {
                f = 1.0f;
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                } else if (z6) {
                    f = 0.0f;
                }
                f = 1.0f;
            }
            getpostalcode2.IconCompatParcelizer(false);
            onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
            newChild newchild3 = (newChild) onshowtranslationui.getValue();
            getpostalcode2.serializer(-1436405362);
            int i13 = iArr[newchild3.ordinal()];
            if (i13 == 1) {
                f2 = 1.0f;
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                } else if (z6) {
                    f2 = 0.0f;
                }
                f2 = 1.0f;
            }
            getpostalcode2.IconCompatParcelizer(false);
            transitionSerializer.IconCompatParcelizer();
            getpostalcode2.serializer(-709912974);
            getpostalcode2.IconCompatParcelizer(false);
            requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = requiredWidth3ABfNKs.read;
            requiredSize3ABfNKs requiredsize3abfnksSerializer = requiredHeightInVpY3zN4default.serializer(transitionSerializer, Float.valueOf(f), Float.valueOf(f2), widthVarSerializer, requiredsizeinqdbjur0default, "LabelProgress", getpostalcode2, 196608);
            AutofillTree autofillTree = AutofillTree.FastEffects;
            width widthVarSerializer2 = resolvePointerPrecision.serializer(autofillTree, getpostalcode2);
            boolean z7 = z5;
            width widthVarSerializer3 = resolvePointerPrecision.serializer(AutofillTree.SlowEffects, getpostalcode2);
            newChild newchild4 = (newChild) transitionState.IconCompatParcelizer();
            getpostalcode2.serializer(-1093194547);
            int i14 = iArr[newchild4.ordinal()];
            if (i14 == 1) {
                f3 = 1.0f;
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                } else if (!z6) {
                    f3 = 1.0f;
                }
                f3 = 0.0f;
            }
            getpostalcode2.IconCompatParcelizer(false);
            newChild newchild5 = (newChild) onshowtranslationui.getValue();
            getpostalcode2.serializer(-1093194547);
            int i15 = iArr[newchild5.ordinal()];
            if (i15 == 1) {
                f4 = 1.0f;
            } else {
                if (i15 != 2) {
                    if (i15 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                } else if (!z6) {
                    f4 = 1.0f;
                }
                f4 = 0.0f;
            }
            getpostalcode2.IconCompatParcelizer(false);
            paddingqDBjuR0default paddingqdbjur0defaultIconCompatParcelizer = transitionSerializer.IconCompatParcelizer();
            getpostalcode2.serializer(-984009111);
            newChild newchild6 = newChild.Focused;
            newChild newchild7 = newChild.UnfocusedEmpty;
            width widthVar = (!paddingqdbjur0defaultIconCompatParcelizer.RemoteActionCompatParcelizer(newchild6, newchild7) && (paddingqdbjur0defaultIconCompatParcelizer.RemoteActionCompatParcelizer(newchild7, newchild6) || paddingqdbjur0defaultIconCompatParcelizer.RemoteActionCompatParcelizer(newChild.UnfocusedNotEmpty, newchild7))) ? widthVarSerializer3 : widthVarSerializer2;
            getpostalcode2.IconCompatParcelizer(false);
            final requiredSize3ABfNKs requiredsize3abfnksSerializer2 = requiredHeightInVpY3zN4default.serializer(transitionSerializer, Float.valueOf(f3), Float.valueOf(f4), widthVar, requiredsizeinqdbjur0default, "PlaceholderOpacity", getpostalcode2, 196608);
            newChild newchild8 = (newChild) transitionState.IconCompatParcelizer();
            getpostalcode2.serializer(-1258455321);
            int i16 = iArr[newchild8.ordinal()];
            if (i16 == 1) {
                f5 = 1.0f;
            } else {
                if (i16 != 2) {
                    if (i16 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                } else if (z6) {
                    f5 = 0.0f;
                }
                f5 = 1.0f;
            }
            getpostalcode2.IconCompatParcelizer(false);
            newChild newchild9 = (newChild) onshowtranslationui.getValue();
            getpostalcode2.serializer(-1258455321);
            int i17 = iArr[newchild9.ordinal()];
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                } else if (z6) {
                    f6 = 0.0f;
                }
            }
            getpostalcode2.IconCompatParcelizer(false);
            transitionSerializer.IconCompatParcelizer();
            getpostalcode2.serializer(2126293195);
            getpostalcode2.IconCompatParcelizer(false);
            final requiredSize3ABfNKs requiredsize3abfnksSerializer3 = requiredHeightInVpY3zN4default.serializer(transitionSerializer, Float.valueOf(f5), Float.valueOf(f6), widthVarSerializer2, requiredsizeinqdbjur0default, "PrefixSuffixOpacity", getpostalcode2, 196608);
            width widthVarSerializer4 = resolvePointerPrecision.serializer(autofillTree, getpostalcode2);
            newChild newchild10 = (newChild) onshowtranslationui.getValue();
            getpostalcode2.serializer(-12973394);
            long j9 = iArr[newchild10.ordinal()] == 1 ? j8 : j7;
            getpostalcode2.IconCompatParcelizer(false);
            ColorSpace colorSpaceM726getColorSpaceimpl = Color.m726getColorSpaceimpl(j9);
            boolean z8 = getpostalcode2.read(colorSpaceM726getColorSpaceimpl);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (z8 || objComponentActivity == androidContentCaptureManager2) {
                ObjectList$toString$1 objectList$toString$1 = new ObjectList$toString$1(4, colorSpaceM726getColorSpaceimpl);
                resetVar = resetVar2;
                objComponentActivity = new requiredSizeInqDBjuR0default(resetVar, objectList$toString$1);
                getpostalcode2.write(objComponentActivity);
            } else {
                resetVar = resetVar2;
            }
            requiredSizeInqDBjuR0default requiredsizeinqdbjur0default2 = (requiredSizeInqDBjuR0default) objComponentActivity;
            newChild newchild11 = (newChild) transitionState.IconCompatParcelizer();
            getpostalcode2.serializer(-12973394);
            long j10 = iArr[newchild11.ordinal()] == 1 ? j8 : j7;
            getpostalcode2.IconCompatParcelizer(false);
            Color colorM712boximpl = Color.m712boximpl(j10);
            newChild newchild12 = (newChild) onshowtranslationui.getValue();
            getpostalcode2.serializer(-12973394);
            if (iArr[newchild12.ordinal()] == 1) {
                j7 = j8;
            }
            getpostalcode2.IconCompatParcelizer(false);
            Color colorM712boximpl2 = Color.m712boximpl(j7);
            transitionSerializer.IconCompatParcelizer();
            getpostalcode2.serializer(1954111929);
            getpostalcode2.IconCompatParcelizer(false);
            requiredSize3ABfNKs requiredsize3abfnksSerializer4 = requiredHeightInVpY3zN4default.serializer(transitionSerializer, colorM712boximpl, colorM712boximpl2, widthVarSerializer4, requiredsizeinqdbjur0default2, "LabelTextStyleColor", getpostalcode2, 196608);
            getpostalcode2.serializer(-464752477);
            getpostalcode2.IconCompatParcelizer(false);
            ColorSpace colorSpaceM726getColorSpaceimpl2 = Color.m726getColorSpaceimpl(j);
            boolean z9 = getpostalcode2.read(colorSpaceM726getColorSpaceimpl2);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z9 || objComponentActivity2 == androidContentCaptureManager2) {
                objComponentActivity2 = new requiredSizeInqDBjuR0default(resetVar, new ObjectList$toString$1(4, colorSpaceM726getColorSpaceimpl2));
                getpostalcode2.write(objComponentActivity2);
            }
            getpostalcode2.serializer(-464752477);
            getpostalcode2.IconCompatParcelizer(false);
            Color colorM712boximpl3 = Color.m712boximpl(j);
            getpostalcode2.serializer(-464752477);
            getpostalcode2.IconCompatParcelizer(false);
            Color colorM712boximpl4 = Color.m712boximpl(j);
            transitionSerializer.IconCompatParcelizer();
            getpostalcode2.serializer(1190923886);
            getpostalcode2.IconCompatParcelizer(false);
            requiredSize3ABfNKs requiredsize3abfnksSerializer5 = requiredHeightInVpY3zN4default.serializer(transitionSerializer, colorM712boximpl3, colorM712boximpl4, widthVarSerializer4, (requiredSizeInqDBjuR0default) objComponentActivity2, "LabelContentColor", getpostalcode2, 196608);
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager2) {
                objComponentActivity3 = new setId();
                getpostalcode2.write(objComponentActivity3);
            }
            setId setid = (setId) objComponentActivity3;
            if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry == null) {
                getpostalcode2.serializer(-1891724857);
                getpostalcode2.IconCompatParcelizer(false);
                textFieldColors2 = textFieldColors;
                getpostalcode = getpostalcode2;
                i5 = i10;
                dragAndDropTargetModifierNode2 = null;
            } else {
                getpostalcode2.serializer(-1891724856);
                getpostalcode = getpostalcode2;
                i5 = i10;
                textFieldColors2 = textFieldColors;
                DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite = ExtrasKt.write(-1076580032, new setInputType(textStyle, textStyle2, requiredsize3abfnksSerializer, requiredsize3abfnksSerializer5, z7, requiredsize3abfnksSerializer4, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, setid), getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode2 = dragAndDropTargetModifierNodeWrite;
            }
            if (!z2) {
                j2 = textFieldColors2.MediaBrowserCompatMediaItem;
            } else if (z3) {
                j2 = textFieldColors2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            } else if (zBooleanValue) {
                j2 = textFieldColors2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            } else {
                j2 = textFieldColors2.ensureViewModelStore;
            }
            final long j11 = j2;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager2) {
                objComponentActivity4 = CompositionKt.serializer(androidContentCaptureManager, new getAndroidRenderEffect(requiredsize3abfnksSerializer2, 3));
                getpostalcode.write(objComponentActivity4);
            }
            onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) objComponentActivity4;
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 != null && charSequence.length() == 0 && ((Boolean) onviewattachedtowindow.getValue()).booleanValue()) {
                getpostalcode.serializer(-1890614312);
                DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite2 = ExtrasKt.write(1405547205, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
                    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Modifier modifier = (Modifier) obj;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((getPostalCode) getbirthdatefull2).read(modifier) ? 4 : 2;
                        }
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                            onViewAttachedToWindow onviewattachedtowindow2 = requiredsize3abfnksSerializer2;
                            boolean z10 = getpostalcode3.read(onviewattachedtowindow2);
                            Object objComponentActivity5 = getpostalcode3.ComponentActivity();
                            if (z10 || objComponentActivity5 == getCreditCardExpirationMonth.write) {
                                objComponentActivity5 = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(onviewattachedtowindow2, 1);
                                getpostalcode3.write(objComponentActivity5);
                            }
                            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5);
                            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                            int iSerializer = SentryUUID.serializer(getpostalcode3);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierGraphicsLayer);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                            if (getpostalcode3.read == null) {
                                SentryUUID.write();
                                throw null;
                            }
                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode3.ComponentActivity) {
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            if (getpostalcode3.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion2.getSetModifier());
                            TextFieldImplKt.RemoteActionCompatParcelizer(j11, textStyle, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getpostalcode3, 0);
                            getpostalcode3.IconCompatParcelizer(true);
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode3 = dragAndDropTargetModifierNodeWrite2;
            } else {
                getpostalcode.serializer(-1890217110);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode3 = null;
            }
            if (!z2) {
                j3 = textFieldColors2.MediaMetadataCompat;
            } else if (z3) {
                j3 = textFieldColors2.ComponentActivity;
            } else if (zBooleanValue) {
                j3 = textFieldColors2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            } else {
                j3 = textFieldColors2.addObserverForBackInvoker;
            }
            final long j12 = j3;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager2) {
                objComponentActivity5 = CompositionKt.serializer((AndroidContentCaptureManager) r16, new getAndroidRenderEffect(requiredsize3abfnksSerializer3, 4));
                getpostalcode.write(objComponentActivity5);
            }
            onViewAttachedToWindow onviewattachedtowindow2 = (onViewAttachedToWindow) objComponentActivity5;
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 != null && ((Boolean) onviewattachedtowindow2.getValue()).booleanValue()) {
                getpostalcode.serializer(-1889877907);
                DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite3 = ExtrasKt.write(606594655, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
                    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Modifier.Companion companion2 = Modifier.Companion;
                            onViewAttachedToWindow onviewattachedtowindow3 = requiredsize3abfnksSerializer3;
                            boolean z10 = getpostalcode3.read(onviewattachedtowindow3);
                            Object objComponentActivity6 = getpostalcode3.ComponentActivity();
                            if (z10 || objComponentActivity6 == getCreditCardExpirationMonth.write) {
                                objComponentActivity6 = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(onviewattachedtowindow3, 2);
                                getpostalcode3.write(objComponentActivity6);
                            }
                            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6);
                            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                            int iSerializer = SentryUUID.serializer(getpostalcode3);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierGraphicsLayer);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                            if (getpostalcode3.read == null) {
                                SentryUUID.write();
                                throw null;
                            }
                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode3.ComponentActivity) {
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            if (getpostalcode3.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion3.getSetModifier());
                            TextFieldImplKt.RemoteActionCompatParcelizer(j12, textStyle, r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, getpostalcode3, 0);
                            getpostalcode3.IconCompatParcelizer(true);
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode4 = dragAndDropTargetModifierNodeWrite3;
            } else {
                getpostalcode.serializer(-1889500886);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode4 = null;
            }
            if (!z2) {
                j4 = textFieldColors2.MediaDescriptionCompat;
            } else if (z3) {
                j4 = textFieldColors2.ResultReceiver;
            } else if (zBooleanValue) {
                j4 = textFieldColors2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            } else {
                j4 = textFieldColors2.defaultViewModelProviderFactory_delegatelambda0;
            }
            final long j13 = j4;
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde5 != null && ((Boolean) onviewattachedtowindow2.getValue()).booleanValue()) {
                getpostalcode.serializer(-1889301555);
                DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite4 = ExtrasKt.write(-45078754, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
                    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Modifier.Companion companion2 = Modifier.Companion;
                            onViewAttachedToWindow onviewattachedtowindow3 = requiredsize3abfnksSerializer3;
                            boolean z10 = getpostalcode3.read(onviewattachedtowindow3);
                            Object objComponentActivity6 = getpostalcode3.ComponentActivity();
                            if (z10 || objComponentActivity6 == getCreditCardExpirationMonth.write) {
                                objComponentActivity6 = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(onviewattachedtowindow3, 3);
                                getpostalcode3.write(objComponentActivity6);
                            }
                            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6);
                            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                            int iSerializer = SentryUUID.serializer(getpostalcode3);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierGraphicsLayer);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                            if (getpostalcode3.read == null) {
                                SentryUUID.write();
                                throw null;
                            }
                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode3.ComponentActivity) {
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            if (getpostalcode3.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion3.getSetModifier());
                            TextFieldImplKt.RemoteActionCompatParcelizer(j13, textStyle, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, getpostalcode3, 0);
                            getpostalcode3.IconCompatParcelizer(true);
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode5 = dragAndDropTargetModifierNodeWrite4;
            } else {
                getpostalcode.serializer(-1888924534);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode5 = null;
            }
            if (!z2) {
                j5 = textFieldColors2.read;
            } else if (z3) {
                j5 = textFieldColors2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            } else if (zBooleanValue) {
                j5 = textFieldColors2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            } else {
                j5 = textFieldColors2.createFullyDrawnExecutor;
            }
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 == null) {
                getpostalcode.serializer(-1888749663);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode6 = null;
            } else {
                getpostalcode.serializer(-1888749662);
                DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite5 = ExtrasKt.write(-1736293487, new setOpaque(j5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, 0), getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode6 = dragAndDropTargetModifierNodeWrite5;
            }
            if (!z2) {
                j6 = textFieldColors2.MediaSessionCompatToken;
            } else if (z3) {
                j6 = textFieldColors2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            } else if (zBooleanValue) {
                j6 = textFieldColors2._init_lambda4;
            } else {
                j6 = textFieldColors2.getSavedStateRegistryControllerannotations;
            }
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 == null) {
                getpostalcode.serializer(-1888469888);
                z4 = false;
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode7 = null;
            } else {
                z4 = false;
                getpostalcode.serializer(-1888469887);
                DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite6 = ExtrasKt.write(1334518521, new setOpaque(j6, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, 1), getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNode7 = dragAndDropTargetModifierNodeWrite6;
            }
            getpostalcode.serializer(-1888176380);
            getpostalcode.IconCompatParcelizer(z4);
            int i18 = textValue.write[settext.ordinal()];
            if (i18 == 1) {
                int i19 = i5;
                getpostalcode.serializer(-1887830698);
                TextFieldKt.TextFieldLayout(Modifier.Companion, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, dragAndDropTargetModifierNode2, dragAndDropTargetModifierNode3, dragAndDropTargetModifierNode6, dragAndDropTargetModifierNode7, dragAndDropTargetModifierNode4, dragAndDropTargetModifierNode5, z, androidAutofillManager_androidKt, new notifyViewVisibilityChanged(new MapboxNavigation.AnonymousClass10(0, 4, onViewAttachedToWindow.class, requiredsize3abfnksSerializer, "value", "getValue()Ljava/lang/Object;")), ExtrasKt.write(-1729858187, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "Container");
                            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), true);
                            int iSerializer = SentryUUID.serializer(getpostalcode3);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierLayoutId);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                            if (getpostalcode3.read == null) {
                                SentryUUID.write();
                                throw null;
                            }
                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode3.ComponentActivity) {
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            if (getpostalcode3.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion2.getSetModifier());
                            dragAndDropTargetModifierNode.invoke(getpostalcode3, 0);
                            getpostalcode3.IconCompatParcelizer(true);
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), null, switchKt, getpostalcode, ((i19 >> 3) & 112) | 6 | ((i11 << 21) & 234881024) | ((i19 << 18) & 1879048192), ((i11 >> 6) & 7168) | 48);
                getpostalcode2 = getpostalcode;
                getpostalcode2.IconCompatParcelizer(false);
            } else if (i18 == 2) {
                getpostalcode.serializer(-1886778186);
                Object objComponentActivity6 = getpostalcode.ComponentActivity();
                if (objComponentActivity6 == androidContentCaptureManager2) {
                    objComponentActivity6 = CompositionKt.RemoteActionCompatParcelizer(Size.m534boximpl(Size.Companion.m555getZeroNHjbRc()));
                    getpostalcode.write(objComponentActivity6);
                }
                final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity6;
                DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite7 = ExtrasKt.write(528115858, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
                    /* JADX WARN: Code duplicated, block: B:18:0x00b1  */
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "Container");
                            final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = populateViewStructure_androidKtpopulate8;
                            final Class<PopulateViewStructure_androidKtpopulate7> cls = PopulateViewStructure_androidKtpopulate7.class;
                            final String str = "value";
                            final String str2 = "getValue()Ljava/lang/Object;";
                            final int i20 = 0;
                            r8lambdaz8s0fQwEJ2REloWUnQw1hUaIxGo r8lambdaz8s0fqwej2relowunqw1huaixgo = new r8lambdaz8s0fQwEJ2REloWUnQw1hUaIxGo(populateViewStructure_androidKtpopulate9, cls, str, str2, i20) { // from class: o.setLongClickable
                                @Override // o.registerInAppMessageManagerlambda7
                                public final Object get() {
                                    return ((PopulateViewStructure_androidKtpopulate7) this.MediaMetadataCompat).getValue();
                                }
                            };
                            Alignment.Horizontal horizontalWrite = TextFieldImplKt.write(androidAutofillManager_androidKt);
                            float f7 = OutlinedTextFieldKt.read;
                            Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifierLayoutId, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(r8lambdaz8s0fqwej2relowunqw1huaixgo, switchKt, horizontalWrite, 13));
                            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), true);
                            int iSerializer = SentryUUID.serializer(getpostalcode3);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierDrawWithContent);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                            if (getpostalcode3.read == null) {
                                SentryUUID.write();
                                throw null;
                            }
                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode3.ComponentActivity) {
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            if (getpostalcode3.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion2.getSetModifier());
                            dragAndDropTargetModifierNode.invoke(getpostalcode3, 0);
                            getpostalcode3.IconCompatParcelizer(true);
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode);
                Modifier.Companion companion2 = Modifier.Companion;
                notifyViewVisibilityChanged notifyviewvisibilitychanged = new notifyViewVisibilityChanged(new MapboxNavigation.AnonymousClass10(0, 5, onViewAttachedToWindow.class, requiredsize3abfnksSerializer, "value", "getValue()Ljava/lang/Object;"));
                int i20 = i5;
                boolean z10 = (i20 & 7168) == 2048;
                boolean z11 = getpostalcode.read(r44);
                Object objComponentActivity7 = getpostalcode.ComponentActivity();
                if ((z10 | z11) || objComponentActivity7 == androidContentCaptureManager2) {
                    objComponentActivity7 = new Navigator$$ExternalSyntheticLambda1(androidAutofillManager_androidKt, requiredsize3abfnksSerializer, populateViewStructure_androidKtpopulate8);
                    getpostalcode.write(objComponentActivity7);
                }
                getPostalCode getpostalcode3 = getpostalcode;
                OutlinedTextFieldKt.OutlinedTextFieldLayout(companion2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, dragAndDropTargetModifierNode3, dragAndDropTargetModifierNode2, dragAndDropTargetModifierNode6, dragAndDropTargetModifierNode7, dragAndDropTargetModifierNode4, dragAndDropTargetModifierNode5, z, androidAutofillManager_androidKt, notifyviewvisibilitychanged, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7, dragAndDropTargetModifierNodeWrite7, null, switchKt, getpostalcode3, ((i20 >> 3) & 112) | 6 | ((i11 << 21) & 234881024) | ((i20 << 18) & 1879048192), (57344 & (i11 >> 3)) | 384);
                getpostalcode3.IconCompatParcelizer(false);
                getpostalcode2 = getpostalcode3;
            } else {
                throw d$$ExternalSyntheticOutline0.m(getpostalcode, 493292232, z4);
            }
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.setDataIsSensitive
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.material3.internal.TextFieldImplKt.CommonDecorationBox(settext, charSequence, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, androidAutofillManager_androidKt, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, z, z2, z3, mutableInteractionSourceImpl, switchKt, textFieldColors, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
