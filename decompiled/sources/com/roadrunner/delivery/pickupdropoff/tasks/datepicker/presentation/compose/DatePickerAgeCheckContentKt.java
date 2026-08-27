package com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.extractAuthorizationHeader;
import o.extractFromIndyLambdaFields;
import o.filterParameterFields;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.hasRootCause;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isValidParameter;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DatePickerAgeCheckContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d A[PHI: r3
  0x003d: PHI (r3v10 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v12 o.getPostalCode) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r3
  0x0032: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v12 o.getPostalCode) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if ((r5 instanceof o.allAnimations) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if ((r5 instanceof o.allAnimations) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        r3.serializer(-510108385);
        DatePickerAgeCheckContent(((o.allAnimations) r5).IconCompatParcelizer, r10, r0, r3, r4 & 1008);
        r3.IconCompatParcelizer(false);
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        r3.serializer(1366672404);
        r3.IconCompatParcelizer(false);
        r6 = r3.MediaDescriptionCompat();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        if (r6 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        r5 = 0;
        r6.serializer = new o.parseParametersToValuegetDp(r9, r10, r4, r13, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write(final com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl r9, final o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r10, androidx.compose.ui.Modifier r11, o.getBirthDateFull r12, final int r13) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.compose.DatePickerAgeCheckContentKt.write(com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, androidx.compose.ui.Modifier, o.getBirthDateFull, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[PHI: r4
  0x0055: PHI (r4v9 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01db  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r4
  0x002f: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void DateViewerPicker(final extractFromIndyLambdaFields extractfromindylambdafields, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        boolean z;
        long windowSystemUiVisibility;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 113;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(2054376446);
            if ((i & 37) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(extractfromindylambdafields);
                } else {
                    int i6 = RemoteActionCompatParcelizer + 13;
                    write = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    zIconCompatParcelizer = getpostalcode.read(extractfromindylambdafields);
                }
                if (zIconCompatParcelizer) {
                    int i8 = write + 59;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(2054376446);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(extractfromindylambdafields);
                } else {
                    int i10 = RemoteActionCompatParcelizer + 13;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    zIconCompatParcelizer = getpostalcode.read(extractfromindylambdafields);
                }
                if (zIconCompatParcelizer) {
                    int i12 = write + 59;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        final int i14 = 0;
        if ((i3 & 19) != 18) {
            int i15 = write + 5;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i17 = RemoteActionCompatParcelizer + 47;
            write = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) extractfromindylambdafields.displayDate);
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (zSerializer) {
                    getpostalcode.serializer(-1355109561);
                    String str = extractfromindylambdafields.selectionPlaceHolder;
                    boolean z5 = (i3 & 112) == 32;
                    boolean z6 = (i3 & 14) == 4 || ((i3 & 8) != 0 && getpostalcode.IconCompatParcelizer(extractfromindylambdafields));
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((z5 | z6) || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.parseParametersToValue
                            private static int read = 1;
                            private static int serializer;

                            /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
                            
                                return r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
                            
                                r4.invoke(r3);
                                r1 = o.parseParametersToValue.serializer + 47;
                                o.parseParametersToValue.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                r1 = r1 % 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
                            
                                return r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
                            
                                if (r1 != 0) goto L9;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
                            
                                if (r1 != 0) goto L9;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
                            
                                r4.invoke(r3);
                             */
                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke() {
                                /*
                                    r6 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    int r1 = o.parseParametersToValue.serializer
                                    int r1 = r1 + 109
                                    int r2 = r1 % 128
                                    o.parseParametersToValue.read = r2
                                    int r1 = r1 % r0
                                    if (r1 != 0) goto L1d
                                    int r1 = r3
                                    o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                    o.extractFromIndyLambdaFields r3 = r2
                                    o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r4 = r1
                                    r5 = 85
                                    int r5 = r5 / 0
                                    if (r1 == 0) goto L2b
                                    goto L27
                                L1d:
                                    int r1 = r3
                                    o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                    o.extractFromIndyLambdaFields r3 = r2
                                    o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r4 = r1
                                    if (r1 == 0) goto L2b
                                L27:
                                    r4.invoke(r3)
                                    return r2
                                L2b:
                                    r4.invoke(r3)
                                    int r1 = o.parseParametersToValue.serializer
                                    int r1 = r1 + 47
                                    int r3 = r1 % 128
                                    o.parseParametersToValue.read = r3
                                    int r1 = r1 % r0
                                    return r2
                                */
                                throw new UnsupportedOperationException("Method not decompiled: o.parseParametersToValue.invoke():java.lang.Object");
                            }
                        };
                        getpostalcode.write(objComponentActivity);
                    }
                    Modifier modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
                    modifierWrite.getClass();
                    isValidParameter.RemoteActionCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierWrite, false, false, Integer.valueOf(R.drawable.ic_bold_large_calendar_default), null, null, null, getpostalcode, 384, 984);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1354740506);
                    if (extractfromindylambdafields.isValidAge) {
                        getpostalcode.serializer(-1354720356);
                        windowSystemUiVisibility = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1354674724);
                        windowSystemUiVisibility = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getWindowSystemUiVisibility();
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    long j = windowSystemUiVisibility;
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierWrite2 = SizeKt.write(companion, 1.0f);
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, Alignment.Companion.getCenterVertically(), getpostalcode, 54);
                    int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                    if (getpostalcode.read != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        TextKt.m131TextNvy7gAk(extractfromindylambdafields.displayDate, companion, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 131064);
                        String str2 = extractfromindylambdafields.editButtonTitle;
                        if ((i3 & 112) == 32) {
                            int i18 = RemoteActionCompatParcelizer + 41;
                            write = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((i3 & 14) != 4) {
                            int i20 = write + 15;
                            RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                            if (i20 % 2 == 0 ? (i3 & 8) != 0 : (i3 & 3) != 0) {
                                z3 = getpostalcode.IconCompatParcelizer(extractfromindylambdafields);
                            }
                        }
                        Object objComponentActivity2 = getpostalcode.ComponentActivity();
                        if ((z3 || z2) || objComponentActivity2 == androidContentCaptureManager) {
                            z4 = true;
                            final char c = 1 == true ? 1 : 0;
                            objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.parseParametersToValue
                                private static int read = 1;
                                private static int serializer;

                                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                public final java.lang.Object invoke() {
                                    /*
                                        r6 = this;
                                        r0 = 2
                                        int r1 = r0 % r0
                                        int r1 = o.parseParametersToValue.serializer
                                        int r1 = r1 + 109
                                        int r2 = r1 % 128
                                        o.parseParametersToValue.read = r2
                                        int r1 = r1 % r0
                                        if (r1 != 0) goto L1d
                                        int r1 = r3
                                        o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                        o.extractFromIndyLambdaFields r3 = r2
                                        o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r4 = r1
                                        r5 = 85
                                        int r5 = r5 / 0
                                        if (r1 == 0) goto L2b
                                        goto L27
                                    L1d:
                                        int r1 = r3
                                        o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                        o.extractFromIndyLambdaFields r3 = r2
                                        o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r4 = r1
                                        if (r1 == 0) goto L2b
                                    L27:
                                        r4.invoke(r3)
                                        return r2
                                    L2b:
                                        r4.invoke(r3)
                                        int r1 = o.parseParametersToValue.serializer
                                        int r1 = r1 + 47
                                        int r3 = r1 % 128
                                        o.parseParametersToValue.read = r3
                                        int r1 = r1 % r0
                                        return r2
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: o.parseParametersToValue.invoke():java.lang.Object");
                                }
                            };
                            getpostalcode.write(objComponentActivity2);
                        } else {
                            z4 = true;
                        }
                        isValidParameter.RemoteActionCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, (Modifier) companion, false, Integer.valueOf(R.drawable.ic_bold_large_edit_default), (hasRootCause) null, (extractAuthorizationHeader) null, (MutableInteractionSourceImpl) null, (getBirthDateFull) getpostalcode, 384, 488);
                        getpostalcode.IconCompatParcelizer(z4);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        SentryUUID.write();
                        throw null;
                    }
                }
            } else {
                Object obj = null;
                hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) extractfromindylambdafields.displayDate);
                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                obj.hashCode();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 24, extractfromindylambdafields, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d A[PHI: r2
  0x004d: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0290  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r2
  0x0030: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void DatePickerAgeCheckContent(extractFromIndyLambdaFields extractfromindylambdafields, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 89;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1606064659);
            if ((i & 12) == 0) {
                if ((i & 8) == 0) {
                    int i7 = write + 77;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    zIconCompatParcelizer = getpostalcode.read(extractfromindylambdafields);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(extractfromindylambdafields);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1606064659);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    int i9 = write + 77;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    zIconCompatParcelizer = getpostalcode.read(extractfromindylambdafields);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(extractfromindylambdafields);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i11 = write + 69;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i13 = write + 35;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                i4 = i13 % 2 != 0 ? 26 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            int i14 = write + 53;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i3 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i16 = i3;
        if (getpostalcode.write(i16 & 1, (i16 & 147) != 146)) {
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), null, 3);
            modifierWrite.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = RemoteActionCompatParcelizer + 67;
            write = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i19 = write + 71;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str = extractfromindylambdafields.title;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            getPostalCode getpostalcode2 = getpostalcode;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
            Modifier.Companion companion2 = Modifier.Companion;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.getActionBarHideOffset)});
            TextKt.m131TextNvy7gAk(extractfromindylambdafields.description, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setMenu)});
            TextKt.m131TextNvy7gAk(extractfromindylambdafields.datePickerTitle, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
            float f = Dimensions.getNestedScrollAxes;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, f)});
            DateViewerPicker(extractfromindylambdafields, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, i16 & 126);
            if (extractfromindylambdafields.displayDate.length() > 0) {
                int i21 = RemoteActionCompatParcelizer + 87;
                write = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                if (extractfromindylambdafields.isValidAge) {
                    getpostalcode.serializer(-1139865563);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1140165395);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, f)});
                    filterParameterFields filterparameterfields = extractfromindylambdafields.errorData;
                    BannerMessageKt.m5059BannerMessageError1xFH4wI(companion2, null, filterparameterfields.errorTitle, filterparameterfields.errorMessage, null, null, null, 0L, null, 0L, null, 0L, 0L, getpostalcode, 6, 0, 32742);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode.serializer(-1139865563);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 22, extractfromindylambdafields, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }
}
