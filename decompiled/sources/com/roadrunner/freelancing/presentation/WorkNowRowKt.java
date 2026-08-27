package com.roadrunner.freelancing.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.freelancing.api.presentation.WorkNowUiModel;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import io.sentry.SentryUUID;
import java.util.Collections;
import java.util.Map;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.computeHorizontalScrollExtent;
import o.constructCompatStyleForBundle;
import o.constructStyleForExtras;
import o.createFromParcel;
import o.extractStyleFromNotification;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCenterHorizontallyannotations;
import o.getCenterVerticallyannotations;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getQueryContext;
import o.getSystemGestureInsets;
import o.getTappableElementInsets;
import o.isAdapterPositionOnScreen;
import o.logPushStoryPageClickedlambda11;
import o.performLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setDisplayShape;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WorkNowRowKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static final void WorkNowDescriptionRow(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 39;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1265062689);
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer + 75;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str)) {
                int i9 = write + 23;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 == 0 ? 123 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i10 = i2;
        if (getpostalcode.write(i10 & 1, (i10 & 147) != 146)) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str + " ");
            getCenterVerticallyannotations.IconCompatParcelizer(builder, "infoIcon", "�");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            getCenterHorizontallyannotations getcenterhorizontallyannotations = new getCenterHorizontallyannotations(new Placeholder(TextUnitKt.getEm(1), TextUnitKt.getEm(1), PlaceholderVerticalAlign.Companion.m2975getTextCenterJ6kI3mc(), null), ExtrasKt.write(1668044632, new DefaultLazyKey(13, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode));
            TextStyle textStyleRemoteActionCompatParcelizer = performLayout.RemoteActionCompatParcelizer();
            Map mapSingletonMap = Collections.singletonMap("infoIcon", getcenterhorizontallyannotations);
            mapSingletonMap.getClass();
            TextKt.m132TextZ58ophY(annotatedString, modifier, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, mapSingletonMap, null, textStyleRemoteActionCompatParcelizer, getpostalcode, (i10 >> 3) & 112, 0, 196604);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, str, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    /* JADX WARN: Code duplicated, block: B:70:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01de  */
    /* JADX WARN: Code duplicated, block: B:93:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0213  */
    /* JADX WARN: Code duplicated, block: B:97:0x0259  */
    public static final void WorkNow(getTappableElementInsets gettappableelementinsets, logPushStoryPageClickedlambda11 logpushstorypageclickedlambda11, WorkNowUiModel workNowUiModel, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        isAdapterPositionOnScreen isadapterpositiononscreen;
        constructStyleForExtras constructstyleforextras;
        boolean z;
        Object objComponentActivity;
        Object objComponentActivity2;
        AndroidContentCaptureManager androidContentCaptureManager;
        AndroidContentCaptureManager androidContentCaptureManager2;
        setDisplayShape setdisplayshape;
        boolean zIconCompatParcelizer;
        Object objComponentActivity3;
        int i3;
        int i4 = 2 % 2;
        workNowUiModel.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1973825079);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(gettappableelementinsets) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(logpushstorypageclickedlambda11) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(workNowUiModel) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i5 = i2 | 24576;
        boolean z2 = true;
        if (getpostalcode.write(i5 & 1, (i5 & 9363) != 9362)) {
            int i6 = write + 67;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager3 = getCreditCardExpirationMonth.write;
            if (objComponentActivity4 == androidContentCaptureManager3) {
                objComponentActivity4 = getSystemGestureInsets.read;
                getpostalcode.write(objComponentActivity4);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager3) {
                objComponentActivity5 = logpushstorypageclickedlambda11.read();
                getpostalcode.write(objComponentActivity5);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity5;
            WorkNowUiModelImpl workNowUiModelImpl = (WorkNowUiModelImpl) workNowUiModel;
            isAdapterPositionOnScreen isadapterpositiononscreen2 = workNowUiModelImpl.MediaSessionCompatQueueItem;
            getQueryContext getquerycontext = workNowUiModelImpl.serializer;
            int i8 = i5 & 896;
            boolean z3 = i8 == 256;
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (z3) {
                isadapterpositiononscreen = isadapterpositiononscreen2;
            } else {
                int i9 = IconCompatParcelizer + 53;
                isadapterpositiononscreen = isadapterpositiononscreen2;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity6 == androidContentCaptureManager3) {
                }
                SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, getpostalcode, 8);
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke((StartWorkingNavigationUiModelImpl) workNowUiModelImpl.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf(((i5 >> 6) & 112) | 384));
                constructstyleforextras = (constructStyleForExtras) ExtrasKt.write(workNowUiModelImpl.MediaDescriptionCompat, getpostalcode, 0).getValue();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{constructstyleforextras, extractStyleFromNotification.read}, getCieXyz.write())).booleanValue()) {
                    int i10 = IconCompatParcelizer + 121;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getpostalcode.serializer(-1529612837);
                    getpostalcode.IconCompatParcelizer(false);
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                } else {
                    if (constructstyleforextras instanceof constructCompatStyleForBundle) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1529616091, false);
                    }
                    getpostalcode.serializer(-173306911);
                    constructCompatStyleForBundle constructcompatstyleforbundle = (constructCompatStyleForBundle) constructstyleforextras;
                    if (i8 == 256) {
                        int i12 = write + 21;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!z) {
                        i3 = write + 31;
                        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            int i14 = 77 / 0;
                            if (objComponentActivity == androidContentCaptureManager3) {
                            }
                        } else if (objComponentActivity == androidContentCaptureManager3) {
                        }
                        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                        if (i8 == 256) {
                            int i15 = IconCompatParcelizer + 123;
                            write = i15 % Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                        } else {
                            z2 = false;
                        }
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (z2) {
                            androidContentCaptureManager = androidContentCaptureManager3;
                        } else {
                            int i17 = IconCompatParcelizer + 79;
                            write = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            androidContentCaptureManager = androidContentCaptureManager3;
                            if (objComponentActivity2 == androidContentCaptureManager) {
                                androidContentCaptureManager2 = androidContentCaptureManager;
                            }
                            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                            setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                            objComponentActivity3 = getpostalcode.ComponentActivity();
                            if (zIconCompatParcelizer || objComponentActivity3 == androidContentCaptureManager2) {
                                objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                                getpostalcode.write(objComponentActivity3);
                            }
                            WorkNowRow(constructcompatstyleforbundle, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), companion, getpostalcode, i5 & 57344);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        androidContentCaptureManager2 = androidContentCaptureManager;
                        objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, workNowUiModel, WorkNowUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 9);
                        getpostalcode.write(objComponentActivity2);
                        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                        setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                        objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                            getpostalcode.write(objComponentActivity3);
                        } else {
                            objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                            getpostalcode.write(objComponentActivity3);
                        }
                        WorkNowRow(constructcompatstyleforbundle, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), companion, getpostalcode, i5 & 57344);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = new NestScreenKt$NestScreen$1$1(0, workNowUiModel, WorkNowUiModel.class, "onWorkNowClicked", "onWorkNowClicked()V", 0, 8);
                    getpostalcode.write(nestScreenKt$NestScreen$1$1);
                    objComponentActivity = nestScreenKt$NestScreen$1$1;
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda3 = (registerInAppMessageManagerlambda0) objComponentActivity;
                    if (i8 == 256) {
                        int i19 = IconCompatParcelizer + 123;
                        write = i19 % Fields.SpotShadowColor;
                        int i110 = i19 % 2;
                    } else {
                        z2 = false;
                    }
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (z2) {
                        int i111 = IconCompatParcelizer + 79;
                        write = i111 % Fields.SpotShadowColor;
                        int i112 = i111 % 2;
                        androidContentCaptureManager = androidContentCaptureManager3;
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            androidContentCaptureManager2 = androidContentCaptureManager;
                        }
                        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda4 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                        setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                        objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                            getpostalcode.write(objComponentActivity3);
                        } else {
                            objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                            getpostalcode.write(objComponentActivity3);
                        }
                        WorkNowRow(constructcompatstyleforbundle, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), companion, getpostalcode, i5 & 57344);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        androidContentCaptureManager = androidContentCaptureManager3;
                    }
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, workNowUiModel, WorkNowUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 9);
                    getpostalcode.write(objComponentActivity2);
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda5 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                    setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer) {
                        objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                        getpostalcode.write(objComponentActivity3);
                    } else {
                        objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                        getpostalcode.write(objComponentActivity3);
                    }
                    WorkNowRow(constructcompatstyleforbundle, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), companion, getpostalcode, i5 & 57344);
                    getpostalcode.IconCompatParcelizer(false);
                }
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
                modifier2 = companion;
            }
            objComponentActivity6 = new RetryWithDelay$$ExternalSyntheticLambda0(17, workNowUiModel);
            getpostalcode.write(objComponentActivity6);
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, getpostalcode, 8);
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke((StartWorkingNavigationUiModelImpl) workNowUiModelImpl.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf(((i5 >> 6) & 112) | 384));
            constructstyleforextras = (constructStyleForExtras) ExtrasKt.write(workNowUiModelImpl.MediaDescriptionCompat, getpostalcode, 0).getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{constructstyleforextras, extractStyleFromNotification.read}, getCieXyz.write())).booleanValue()) {
                int i113 = IconCompatParcelizer + 121;
                write = i113 % Fields.SpotShadowColor;
                int i114 = i113 % 2;
                getpostalcode.serializer(-1529612837);
                getpostalcode.IconCompatParcelizer(false);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
            } else {
                if (constructstyleforextras instanceof constructCompatStyleForBundle) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1529616091, false);
                }
                getpostalcode.serializer(-173306911);
                constructCompatStyleForBundle constructcompatstyleforbundle2 = (constructCompatStyleForBundle) constructstyleforextras;
                if (i8 == 256) {
                    int i115 = write + 21;
                    IconCompatParcelizer = i115 % Fields.SpotShadowColor;
                    int i116 = i115 % 2;
                    z = true;
                } else {
                    z = false;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!z) {
                    i3 = write + 31;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        int i117 = 77 / 0;
                        if (objComponentActivity == androidContentCaptureManager3) {
                        }
                    } else if (objComponentActivity == androidContentCaptureManager3) {
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda6 = (registerInAppMessageManagerlambda0) objComponentActivity;
                    if (i8 == 256) {
                        int i118 = IconCompatParcelizer + 123;
                        write = i118 % Fields.SpotShadowColor;
                        int i119 = i118 % 2;
                    } else {
                        z2 = false;
                    }
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (z2) {
                        int i1110 = IconCompatParcelizer + 79;
                        write = i1110 % Fields.SpotShadowColor;
                        int i1111 = i1110 % 2;
                        androidContentCaptureManager = androidContentCaptureManager3;
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            androidContentCaptureManager2 = androidContentCaptureManager;
                        }
                        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda7 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                        setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                        objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                            getpostalcode.write(objComponentActivity3);
                        } else {
                            objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                            getpostalcode.write(objComponentActivity3);
                        }
                        WorkNowRow(constructcompatstyleforbundle2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), companion, getpostalcode, i5 & 57344);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        androidContentCaptureManager = androidContentCaptureManager3;
                    }
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, workNowUiModel, WorkNowUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 9);
                    getpostalcode.write(objComponentActivity2);
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda8 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                    setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer) {
                        objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                        getpostalcode.write(objComponentActivity3);
                    } else {
                        objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                        getpostalcode.write(objComponentActivity3);
                    }
                    WorkNowRow(constructcompatstyleforbundle2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), companion, getpostalcode, i5 & 57344);
                    getpostalcode.IconCompatParcelizer(false);
                }
                NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = new NestScreenKt$NestScreen$1$1(0, workNowUiModel, WorkNowUiModel.class, "onWorkNowClicked", "onWorkNowClicked()V", 0, 8);
                getpostalcode.write(nestScreenKt$NestScreen$1$2);
                objComponentActivity = nestScreenKt$NestScreen$1$2;
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda9 = (registerInAppMessageManagerlambda0) objComponentActivity;
                if (i8 == 256) {
                    int i1112 = IconCompatParcelizer + 123;
                    write = i1112 % Fields.SpotShadowColor;
                    int i1113 = i1112 % 2;
                } else {
                    z2 = false;
                }
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z2) {
                    int i1114 = IconCompatParcelizer + 79;
                    write = i1114 % Fields.SpotShadowColor;
                    int i1115 = i1114 % 2;
                    androidContentCaptureManager = androidContentCaptureManager3;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        androidContentCaptureManager2 = androidContentCaptureManager;
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda10 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                    setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer) {
                        objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                        getpostalcode.write(objComponentActivity3);
                    } else {
                        objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                        getpostalcode.write(objComponentActivity3);
                    }
                    WorkNowRow(constructcompatstyleforbundle2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda10, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), companion, getpostalcode, i5 & 57344);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    androidContentCaptureManager = androidContentCaptureManager3;
                }
                androidContentCaptureManager2 = androidContentCaptureManager;
                objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, workNowUiModel, WorkNowUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 9);
                getpostalcode.write(objComponentActivity2);
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda11 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer) {
                    objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                    getpostalcode.write(objComponentActivity3);
                } else {
                    objComponentActivity3 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 10);
                    getpostalcode.write(objComponentActivity3);
                }
                WorkNowRow(constructcompatstyleforbundle2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda11, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), companion, getpostalcode, i5 & 57344);
                getpostalcode.IconCompatParcelizer(false);
            }
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) gettappableelementinsets, (Object) logpushstorypageclickedlambda11, (Object) workNowUiModel, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier2, i, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    public static final void WorkNowRow(constructCompatStyleForBundle constructcompatstyleforbundle, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1423082421);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(constructcompatstyleforbundle);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(constructcompatstyleforbundle);
            }
            i2 = (!zIconCompatParcelizer ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = IconCompatParcelizer + 3;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i8 = write + 49;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i4 = 256;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
            } else {
                int i9 = 13 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i4 = 256;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(modifier)) {
                int i10 = IconCompatParcelizer + 99;
                write = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 != 0 ? 18605 : Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if (getpostalcode.write(i11 & 1, (i11 & 9363) != 9362)) {
            boolean z = (i11 & 896) == 256;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!z) {
                int i12 = write + 15;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, 0);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, 0);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifier, Dimensions.getAnimatedVisibility, Dimensions.getContentHeight);
            Alignment.Companion companion = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, companion.getCenterVertically(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                int i14 = IconCompatParcelizer + 39;
                write = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    Modifier.Companion companion3 = Modifier.Companion;
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(d$$ExternalSyntheticOutline0.m(1.0f, true, companion3), 0.0f, 0.0f, Dimensions.setTransitioning, 0.0f, 11);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, 0);
                    int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                    TextKt.m131TextNvy7gAk(constructcompatstyleforbundle.IconCompatParcelizer, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131070);
                    WorkNowDescriptionRow((i11 >> 9) & 14, getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13), constructcompatstyleforbundle.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                    getpostalcode.IconCompatParcelizer(true);
                    PrimaryKt.write(constructcompatstyleforbundle.serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, false, null, null, null, null, null, getpostalcode, i11 & 112, 0, 2044);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    boolean z2 = getpostalcode.ComponentActivity;
                    throw null;
                }
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) constructcompatstyleforbundle, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 26);
        }
    }
}
