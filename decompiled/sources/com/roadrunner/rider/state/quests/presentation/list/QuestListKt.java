package com.roadrunner.rider.state.quests.presentation.list;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.nest.NestFragment$onCreateView$1$1$1$1;
import com.roadrunner.rider.state.quests.api.list.QuestListUiModel;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import com.roadrunner.settings.SettingsFragment;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RadioButton;
import o.TextFieldDefaults;
import o.addDuration;
import o.addLong;
import o.addMapJson;
import o.addString;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.registerInAppMessageManagerlambda0;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QuestListKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[PHI: r1
  0x0074: PHI (r1v9 androidx.compose.ui.Modifier$Companion) = (r1v8 androidx.compose.ui.Modifier$Companion), (r1v32 androidx.compose.ui.Modifier$Companion) binds: [B:22:0x0072, B:19:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[PHI: r1 r2
  0x0080: PHI (r1v10 androidx.compose.ui.Modifier$Companion) = (r1v8 androidx.compose.ui.Modifier$Companion), (r1v32 androidx.compose.ui.Modifier$Companion) binds: [B:22:0x0072, B:19:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r2v9 o.addLong) = (r2v8 o.addLong), (r2v19 o.addLong) binds: [B:22:0x0072, B:19:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    public static final void QuestList(QuestListUiModel questListUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        addLong addlong;
        int i3;
        boolean z;
        Object objComponentActivity;
        int i4;
        boolean z2;
        Object objComponentActivity2;
        boolean z3;
        Object objComponentActivity3;
        int i5;
        int i6 = 2 % 2;
        questListUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(315994229);
        if ((i & 6) == 0) {
            if (getpostalcode.read(questListUiModel)) {
                int i7 = write + 9;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i9 = RemoteActionCompatParcelizer + 115;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                companion = Modifier.Companion;
                addlong = (addLong) ExtrasKt.write(((QuestListUiModelImpl) questListUiModel).MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
                if (addlong instanceof addDuration) {
                    getpostalcode.serializer(-1272217351);
                    getpostalcode.IconCompatParcelizer(false);
                    modifier2 = companion;
                } else {
                    modifier2 = companion;
                    if (addlong instanceof addString) {
                        getpostalcode.serializer(-1272216286);
                        addString addstring = (addString) addlong;
                        i3 = i2 & 14;
                        if (i3 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objComponentActivity = getpostalcode.ComponentActivity();
                        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        if (!z || objComponentActivity == androidContentCaptureManager) {
                            SettingsFragment.AnonymousClass1 anonymousClass1 = new SettingsFragment.AnonymousClass1(1, questListUiModel, QuestListUiModel.class, "onHeaderActionClicked", "onHeaderActionClicked(Ljava/lang/String;)V", 0, 24);
                            getpostalcode.write(anonymousClass1);
                            objComponentActivity = anonymousClass1;
                        }
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity);
                        if (i3 == 4) {
                            z2 = true;
                        } else {
                            i4 = write + 115;
                            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                int i10 = 4 % 3;
                            }
                            z2 = false;
                        }
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (!z2 || objComponentActivity2 == androidContentCaptureManager) {
                            SettingsFragment.AnonymousClass1 anonymousClass2 = new SettingsFragment.AnonymousClass1(1, questListUiModel, QuestListUiModel.class, "onFooterActionClicked", "onFooterActionClicked(Ljava/lang/String;)V", 0, 25);
                            getpostalcode.write(anonymousClass2);
                            objComponentActivity2 = anonymousClass2;
                        }
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2);
                        if (i3 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (!z3 || objComponentActivity3 == androidContentCaptureManager) {
                            NestFragment$onCreateView$1$1$1$1 nestFragment$onCreateView$1$1$1$1 = new NestFragment$onCreateView$1$1$1$1(3, questListUiModel, QuestListUiModel.class, "onQuestClicked", "onQuestClicked(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 11);
                            getpostalcode.write(nestFragment$onCreateView$1$1$1$1);
                            objComponentActivity3 = nestFragment$onCreateView$1$1$1$1;
                        }
                        QuestListColumn(addstring, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3), null, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1272218512, false);
                    }
                }
            } else {
                companion = Modifier.Companion;
                addlong = (addLong) ExtrasKt.write(((QuestListUiModelImpl) questListUiModel).MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
                if (addlong instanceof addDuration) {
                    getpostalcode.serializer(-1272217351);
                    getpostalcode.IconCompatParcelizer(false);
                    modifier2 = companion;
                } else {
                    modifier2 = companion;
                    if (addlong instanceof addString) {
                        getpostalcode.serializer(-1272216286);
                        addString addstring2 = (addString) addlong;
                        i3 = i2 & 14;
                        if (i3 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objComponentActivity = getpostalcode.ComponentActivity();
                        AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                        if (!z) {
                            SettingsFragment.AnonymousClass1 anonymousClass3 = new SettingsFragment.AnonymousClass1(1, questListUiModel, QuestListUiModel.class, "onHeaderActionClicked", "onHeaderActionClicked(Ljava/lang/String;)V", 0, 24);
                            getpostalcode.write(anonymousClass3);
                            objComponentActivity = anonymousClass3;
                        } else {
                            SettingsFragment.AnonymousClass1 anonymousClass4 = new SettingsFragment.AnonymousClass1(1, questListUiModel, QuestListUiModel.class, "onHeaderActionClicked", "onHeaderActionClicked(Ljava/lang/String;)V", 0, 24);
                            getpostalcode.write(anonymousClass4);
                            objComponentActivity = anonymousClass4;
                        }
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity);
                        if (i3 == 4) {
                            z2 = true;
                        } else {
                            i4 = write + 115;
                            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                int i11 = 4 % 3;
                            }
                            z2 = false;
                        }
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (!z2) {
                            SettingsFragment.AnonymousClass1 anonymousClass5 = new SettingsFragment.AnonymousClass1(1, questListUiModel, QuestListUiModel.class, "onFooterActionClicked", "onFooterActionClicked(Ljava/lang/String;)V", 0, 25);
                            getpostalcode.write(anonymousClass5);
                            objComponentActivity2 = anonymousClass5;
                        } else {
                            SettingsFragment.AnonymousClass1 anonymousClass6 = new SettingsFragment.AnonymousClass1(1, questListUiModel, QuestListUiModel.class, "onFooterActionClicked", "onFooterActionClicked(Ljava/lang/String;)V", 0, 25);
                            getpostalcode.write(anonymousClass6);
                            objComponentActivity2 = anonymousClass6;
                        }
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2);
                        if (i3 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (!z3) {
                            NestFragment$onCreateView$1$1$1$1 nestFragment$onCreateView$1$1$1$2 = new NestFragment$onCreateView$1$1$1$1(3, questListUiModel, QuestListUiModel.class, "onQuestClicked", "onQuestClicked(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 11);
                            getpostalcode.write(nestFragment$onCreateView$1$1$1$2);
                            objComponentActivity3 = nestFragment$onCreateView$1$1$1$2;
                        } else {
                            NestFragment$onCreateView$1$1$1$1 nestFragment$onCreateView$1$1$1$3 = new NestFragment$onCreateView$1$1$1$1(3, questListUiModel, QuestListUiModel.class, "onQuestClicked", "onQuestClicked(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 11);
                            getpostalcode.write(nestFragment$onCreateView$1$1$1$3);
                            objComponentActivity3 = nestFragment$onCreateView$1$1$1$3;
                        }
                        QuestListColumn(addstring2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3), null, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1272218512, false);
                    }
                }
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 4, questListUiModel, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0208  */
    public static final void QuestListColumn(final addString addstring, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        int i6 = write + 39;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1980663548);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i8 = RemoteActionCompatParcelizer + 49;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                zIconCompatParcelizer = getpostalcode.read(addstring);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(addstring);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = RemoteActionCompatParcelizer + 21;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i12 = RemoteActionCompatParcelizer + 51;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i14 = i2 | 24576;
        if (getpostalcode.write(i14 & 1, (i14 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite = SizeKt.write(PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(companion, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility), 1.0f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierWrite2 = SizeKt.write(companion, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, companion2.getCenterVertically(), getpostalcode, 54);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(addstring.RatingCompat, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 131066);
            String str = addstring.IconCompatParcelizer;
            boolean z2 = (i14 & 112) == 32;
            int i15 = i14 & 14;
            if (i15 != 4) {
                int i16 = RemoteActionCompatParcelizer + 3;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                if ((i14 & 8) == 0 || !getpostalcode.IconCompatParcelizer(addstring)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | z2) || objComponentActivity == androidContentCaptureManager) {
                final int i18 = 0;
                objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.readQueryString
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i19 = 2 % 2;
                        int i20 = serializer + 123;
                        write = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i21 = i20 % 2;
                        int i22 = i18;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        addString addstring2 = addstring;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                        if (i22 == 0) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(addstring2.serializer);
                            return createfromparcel;
                        }
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(addstring2.read);
                        int i23 = write + 61;
                        serializer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        return createfromparcel;
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            TertiaryKt.IconCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, companion, false, 0, null, null, null, getpostalcode, 384, 248);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.serializer(-1949116297);
            int i19 = 0;
            for (Object obj : addstring.write) {
                if (i19 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                addMapJson addmapjson = (addMapJson) obj;
                boolean z3 = (i14 & 7168) == 2048;
                boolean z4 = getpostalcode.read(i19);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z4 || z3) {
                    objComponentActivity2 = new AndroidPathIterator_androidKtWhenMappings(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i19, 27);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    int i20 = RemoteActionCompatParcelizer + 57;
                    write = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new AndroidPathIterator_androidKtWhenMappings(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i19, 27);
                        getpostalcode.write(objComponentActivity2);
                    }
                }
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dimensions.setTabContainer, 1);
                modifierM73paddingVpY3zN4$default.getClass();
                QuestListItemKt.QuestListItem(addmapjson, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2, modifierM73paddingVpY3zN4$default, getpostalcode, 0);
                DividerKt.RemoteActionCompatParcelizer(Dimensions.onMultiWindowModeChanged, 0, 6, 0L, getpostalcode, null);
                i19++;
            }
            boolean z5 = false;
            getpostalcode.IconCompatParcelizer(false);
            Modifier.Companion companion4 = Modifier.Companion;
            Object[] objArr = {getpostalcode, SizeKt.m83size3ABfNKs(companion4, Dimensions.setTabContainer)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            String str2 = addstring.RemoteActionCompatParcelizer;
            boolean z6 = (i14 & 896) == 256;
            if (i15 == 4 || ((i14 & 8) != 0 && getpostalcode.IconCompatParcelizer(addstring))) {
                z5 = true;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if ((z6 | z5) || objComponentActivity3 == androidContentCaptureManager) {
                final int i22 = 1;
                objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.readQueryString
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i110 = 2 % 2;
                        int i23 = serializer + 123;
                        write = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        int i25 = i22;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        addString addstring2 = addstring;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        if (i25 == 0) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(addstring2.serializer);
                            return createfromparcel;
                        }
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(addstring2.read);
                        int i26 = write + 61;
                        serializer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i27 = i26 % 2;
                        return createfromparcel;
                    }
                };
                getpostalcode.write(objComponentActivity3);
                int i23 = RemoteActionCompatParcelizer + 93;
                write = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
            }
            Modifier modifierThen = companion4.then(new RadioButton(Alignment.Companion.getCenterHorizontally()));
            modifierThen.getClass();
            TertiaryKt.IconCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, modifierThen, false, 0, null, null, null, getpostalcode, 0, 248);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(i, 21, modifier2, addstring, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        }
    }
}
