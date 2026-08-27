package com.roadrunner.startworking.oneclick.bullet;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.Collections;
import java.util.Map;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.canReadPlayIds;
import o.dc;
import o.getBirthDateFull;
import o.getCenterHorizontallyannotations;
import o.getCenterVerticallyannotations;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.lambda320;
import o.logLocationRecordedEventFromLocationUpdatelambda10;
import o.logPushNotificationActionClickedlambda12;
import o.logPushNotificationOpenedlambda10;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PolicyItemWithHyperLinkKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0051 A[PHI: r0
  0x0051: PHI (r0v12 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v14 o.getPostalCode) binds: [B:8:0x0034, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r0
  0x0036: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v14 o.getPostalCode) binds: [B:8:0x0034, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void PolicyItemWithHyperLink(logPushNotificationActionClickedlambda12 logpushnotificationactionclickedlambda12, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 65;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(674712122);
            if ((i & 3) == 0) {
                if (getpostalcode.read(logpushnotificationactionclickedlambda12)) {
                    int i7 = serializer + 9;
                    int i8 = i7 % Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i8;
                    int i9 = i7 % 2;
                    int i10 = i8 + 63;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(674712122);
            if ((i & 6) == 0) {
                if (getpostalcode.read(logpushnotificationactionclickedlambda12)) {
                    int i12 = serializer + 9;
                    int i13 = i12 % Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i13;
                    int i14 = i12 % 2;
                    int i15 = i13 + 63;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
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
            int i17 = serializer + 21;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i19 = RemoteActionCompatParcelizer + 39;
            serializer = i19 % Fields.SpotShadowColor;
            if (i19 % 2 == 0) {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
            if (!getpostalcode.read(modifier)) {
                i4 = Fields.SpotShadowColor;
            } else {
                int i20 = serializer + 107;
                RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                i4 = Fields.RotationX;
            }
            i3 |= i4;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i22 = RemoteActionCompatParcelizer + 101;
            serializer = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_essentials_dot, getpostalcode, 0), "", (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), getpostalcode, Painter.$stable | 48, 4);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setTabContainer)});
            TextWithHyperLink(logpushnotificationactionclickedlambda12, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, i3 & 126);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new logLocationRecordedEventFromLocationUpdatelambda10(logpushnotificationactionclickedlambda12, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, i, 0);
        }
        int i24 = RemoteActionCompatParcelizer + 9;
        serializer = i24 % Fields.SpotShadowColor;
        int i25 = i24 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public static final void TextWithIcon(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-976065734);
        if ((i & 6) == 0) {
            int i5 = RemoteActionCompatParcelizer + 97;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
                if (getpostalcode2.read(str)) {
                    i3 = 4;
                } else {
                    int i7 = serializer + 33;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i3 = 2;
                }
            } else if (getpostalcode2.read(str)) {
                i3 = 4;
            } else {
                int i9 = serializer + 33;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = RemoteActionCompatParcelizer + 65;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= !getpostalcode2.read(R.drawable.ic_bold_large_text_formatting_external_link) ? 16 : 32;
            int i13 = RemoteActionCompatParcelizer + 19;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        if ((i & 384) == 0) {
            i2 |= !(getpostalcode2.read(modifier) ^ true) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i15 = i2;
        if (getpostalcode2.write(i15 & 1, (i15 & 147) != 146)) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str.concat(" "));
            getCenterVerticallyannotations.IconCompatParcelizer(builder, "externalUrlIcon", "�");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            getCenterHorizontallyannotations getcenterhorizontallyannotations = new getCenterHorizontallyannotations(new Placeholder(TextUnitKt.getEm(1), TextUnitKt.getEm(1), PlaceholderVerticalAlign.Companion.m2975getTextCenterJ6kI3mc(), null), ExtrasKt.write(-796319031, new lambda320(12), getpostalcode2));
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            long emojiCompatEnabled = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled();
            Map mapSingletonMap = Collections.singletonMap("externalUrlIcon", getcenterhorizontallyannotations);
            mapSingletonMap.getClass();
            getpostalcode = getpostalcode2;
            TextKt.m132TextZ58ophY(annotatedString, modifier, emojiCompatEnabled, 0L, null, 0L, null, 0L, 0, false, 0, 0, mapSingletonMap, null, textStyle, getpostalcode, (i15 >> 3) & 112, 0, 196600);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    public static final void PolicyItem(logPushNotificationOpenedlambda10 logpushnotificationopenedlambda10, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 77;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(419198695);
        if ((i & 6) == 0) {
            i2 = (!getpostalcode2.read(logpushnotificationopenedlambda10) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = serializer + 115;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode2.read(modifier)) {
                int i9 = RemoteActionCompatParcelizer + 77;
                serializer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 4 % 4;
                }
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i11 = serializer + 11;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                int i12 = RemoteActionCompatParcelizer + 111;
                serializer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_essentials_dot, getpostalcode2, 0);
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    IconKt.m116Iconww6aTOc(painterPainterResource, "", (Modifier) null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode2, Painter.$stable | 48, 4);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setTabContainer)});
                    TextKt.m131TextNvy7gAk(logpushnotificationopenedlambda10.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
                    getpostalcode = getpostalcode2;
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    boolean z2 = getpostalcode2.ComponentActivity;
                    throw null;
                }
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 16, logpushnotificationopenedlambda10, modifier);
        }
    }

    public static final void TextWithHyperLink(logPushNotificationActionClickedlambda12 logpushnotificationactionclickedlambda12, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        boolean z2;
        boolean z3;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-807124862);
        if ((i & 6) == 0) {
            i2 = i | (getpostalcode2.read(logpushnotificationactionclickedlambda12) ? 4 : 2);
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i5 = RemoteActionCompatParcelizer + 93;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i6 = RemoteActionCompatParcelizer + 105;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i8 = i2 | 384;
        if ((i8 & 147) != 146) {
            int i9 = RemoteActionCompatParcelizer + 125;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode2.write(i8 & 1, z)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            getpostalcode = getpostalcode2;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextKt.m131TextNvy7gAk(logpushnotificationactionclickedlambda12.read, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
            getpostalcode = getpostalcode2;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion, Dimensions.setPrimaryBackground)});
            if ((i8 & 112) == 32) {
                int i11 = RemoteActionCompatParcelizer + 99;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i8 & 14) == 4) {
                int i13 = RemoteActionCompatParcelizer + 101;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z3 | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 23, logpushnotificationactionclickedlambda12);
                getpostalcode.write(objComponentActivity);
                int i15 = serializer + 55;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            }
            TextWithIcon(0, getpostalcode, canReadPlayIds.read(companion, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63), logpushnotificationactionclickedlambda12.write);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new logLocationRecordedEventFromLocationUpdatelambda10(logpushnotificationactionclickedlambda12, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 1);
        }
    }
}
