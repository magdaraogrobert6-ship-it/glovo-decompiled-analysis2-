package com.roadrunner.rider.state.quests.presentation.list;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import com.roadrunner.rrds.compose.component.indicators.progress.SectionedCircleProgressorKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.addInteger;
import o.addJsonObject;
import o.addMapJson;
import o.buildMapping;
import o.buildReftagSdkClickPackage;
import o.containsFireIds;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QuestListItemKt {
    private static int serializer = 1;
    private static int write;

    public static final void QuestListItem(addMapJson addmapjson, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5;
        int i6 = 2 % 2;
        addmapjson.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-952177436);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i7 = serializer + 97;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                zIconCompatParcelizer = getpostalcode.read(addmapjson);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(addmapjson);
            }
            if (zIconCompatParcelizer) {
                int i9 = serializer + 67;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i11 = serializer + 23;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                i3 = Fields.RotationX;
            } else {
                int i13 = write + 119;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            int i15 = serializer + 19;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            QuestListItemColumn(addmapjson, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, getpostalcode, i2 & 1022);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new buildReftagSdkClickPackage(addmapjson, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    public static final void QuestListItemColumn(addMapJson addmapjson, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        ?? r3;
        getPostalCode getpostalcode2;
        Modifier.Companion companion;
        float f;
        getPostalCode getpostalcode3;
        float f2;
        Modifier.Companion companion2;
        boolean z2;
        getPostalCode getpostalcode4;
        boolean z3;
        boolean z4;
        int i3 = 2 % 2;
        getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull;
        getpostalcode5.MediaSessionCompatQueueItem(704742298);
        getAddressCountry getaddresscountry = getpostalcode5.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode5.read(addmapjson) : getpostalcode5.IconCompatParcelizer(addmapjson) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = write + 123;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 |= !(getpostalcode5.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode5.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode5.write(i2 & 1, (i2 & 147) != 146)) {
            int i6 = serializer + 51;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            getNewPassword getnewpassword = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite = SizeKt.write(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode5.write(getnewpassword)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), 1.0f);
            boolean z5 = (i2 & 112) == 32;
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                if ((i2 & 8) != 0) {
                    int i8 = write + 41;
                    serializer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        int i9 = 48 / 0;
                        if (getpostalcode5.IconCompatParcelizer(addmapjson)) {
                            z = true;
                        }
                    } else if (getpostalcode5.IconCompatParcelizer(addmapjson)) {
                        z = true;
                    }
                }
                z = false;
            }
            Object objComponentActivity = getpostalcode5.ComponentActivity();
            if (!z && !z5) {
                int i10 = serializer + 19;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 48 / 0;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 2, addmapjson);
                        getpostalcode5.write(objComponentActivity);
                    }
                } else if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 2, addmapjson);
                    getpostalcode5.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 2, addmapjson);
                getpostalcode5.write(objComponentActivity);
            }
            Modifier modifierRemoteActionCompatParcelizer = ClickableKt.RemoteActionCompatParcelizer(modifierWrite, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 15);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion3 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion3.getStart(), getpostalcode5, 0);
            int iHashCode = Long.hashCode(getpostalcode5.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode5.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode5, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i12 = serializer + 37;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            getpostalcode5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode5.ComponentActivity) {
                getpostalcode5.serializer(constructor);
            } else {
                getpostalcode5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode5, modalBottomSheetYbuCTN8Serializer, getpostalcode5, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode5, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode5, Integer.valueOf(iHashCode), getpostalcode5));
            Modifier.Companion companion5 = Modifier.Companion;
            Modifier modifierWrite2 = SizeKt.write(companion5, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, companion3.getTop(), getpostalcode5, 6);
            int iHashCode2 = Long.hashCode(getpostalcode5.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode5.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode5, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            getpostalcode5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode5.ComponentActivity) {
                getpostalcode5.serializer(constructor2);
            } else {
                getpostalcode5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode5, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode5, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode5, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode5, Integer.valueOf(iHashCode2), getpostalcode5));
            String str = addmapjson.serializer;
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            long presenter = ((buildMapping) getpostalcode5.write(getnewpassword)).setPresenter();
            int iM3569getEllipsisgIe3tQ8 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
            Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, companion5);
            float f3 = Dimensions.setPrimaryBackground;
            TextKt.m131TextNvy7gAk(str, PaddingKt.m74paddingqDBjuR0$default(modifierM, 0.0f, 0.0f, f3, 0.0f, 11), presenter, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 1, 0, null, textStyle, getpostalcode5, 0, 24960, 110584);
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_arrow_right, getpostalcode5, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode5.write(getnewpassword)).setOnMenuItemClickListener(), getpostalcode5, Painter.$stable | 48, 4);
            getpostalcode5.IconCompatParcelizer(true);
            float f4 = Dimensions.setSplitBackground;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion5, 0.0f, f4, 0.0f, 0.0f, 13);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion3.getTop(), getpostalcode5, 0);
            int iHashCode3 = Long.hashCode(getpostalcode5.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode5.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode5, modifierM74paddingqDBjuR0$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion4.getConstructor();
            getpostalcode5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode5.ComponentActivity) {
                getpostalcode5.serializer(constructor3);
            } else {
                getpostalcode5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode5, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode5, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode5, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode5, Integer.valueOf(iHashCode3), getpostalcode5));
            addJsonObject addjsonobject = addmapjson.read;
            if (addjsonobject == null) {
                int i14 = write + 123;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode5.serializer(-674521360);
                getpostalcode5.IconCompatParcelizer(false);
                getpostalcode2 = getpostalcode5;
                r3 = 0;
            } else {
                getpostalcode5.serializer(-674521359);
                r3 = 0;
                SectionedCircleProgressorKt.IconCompatParcelizer(addjsonobject.MediaDescriptionCompat, addjsonobject.RemoteActionCompatParcelizer, 0, addjsonobject.serializer, addjsonobject.MediaMetadataCompat, addjsonobject.IconCompatParcelizer, addjsonobject.read, getpostalcode5, null, addjsonobject.write);
                getPostalCode getpostalcode6 = getpostalcode5;
                getpostalcode6.IconCompatParcelizer(false);
                getpostalcode2 = getpostalcode6;
            }
            Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(companion5, f4, 0.0f, 0.0f, 0.0f, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion3.getStart(), getpostalcode2, r3);
            int iHashCode4 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = r11.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor4);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode4), getpostalcode2));
            String str2 = addmapjson.MediaDescriptionCompat;
            if (str2 == null) {
                getpostalcode2.serializer(-589246561);
                getpostalcode2.IconCompatParcelizer((boolean) r3);
                getpostalcode3 = getpostalcode2;
                companion = companion5;
                f = f3;
            } else {
                getpostalcode2.serializer(-589246560);
                getPostalCode getpostalcode7 = getpostalcode2;
                TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode2.write(getnewpassword)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode7, 0, 0, 131066);
                companion = companion5;
                f = f3;
                getPostalCode getpostalcode8 = getpostalcode7;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode8, SizeKt.m83size3ABfNKs(companion, f)});
                getpostalcode8.IconCompatParcelizer((boolean) r3);
                getpostalcode3 = getpostalcode8;
            }
            String str3 = addmapjson.MediaSessionCompatQueueItem;
            if (str3 == null) {
                getpostalcode3.serializer(-588929493);
                getpostalcode3.IconCompatParcelizer((boolean) r3);
                getpostalcode4 = getpostalcode3;
                f2 = f;
                Modifier.Companion companion6 = companion;
                z2 = r3;
                companion2 = companion6;
            } else {
                getpostalcode3.serializer(-588929492);
                getPostalCode getpostalcode9 = getpostalcode3;
                f2 = f;
                companion2 = companion;
                TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode3.write(getnewpassword)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), getpostalcode9, 0, 0, 131066);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode9, SizeKt.m83size3ABfNKs(companion2, f2)});
                z2 = 0;
                getpostalcode9.IconCompatParcelizer(false);
                getpostalcode4 = getpostalcode9;
            }
            containsFireIds containsfireids = addmapjson.RemoteActionCompatParcelizer;
            if (containsfireids == null) {
                getpostalcode4.serializer(-588604365);
                getpostalcode4.IconCompatParcelizer(z2);
                z4 = z2;
            } else {
                getpostalcode4.serializer(-588604364);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer3 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion3.getCenterVertically(), getpostalcode4, 48);
                int iHashCode5 = Long.hashCode(getpostalcode4.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode4.serializer();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode4, companion2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = r15.getConstructor();
                getpostalcode4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode4.ComponentActivity) {
                    getpostalcode4.serializer(constructor5);
                } else {
                    getpostalcode4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode4, supportingtextpaddinga9ujit4material3defaultSerializer3, getpostalcode4, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                AndroidContentCaptureManagerCompanion.write(getpostalcode4, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode4, Integer.valueOf(iHashCode5), getpostalcode4));
                String str4 = containsfireids.serializer;
                if (str4 == null) {
                    getpostalcode4.serializer(-1483671890);
                    z3 = false;
                    getpostalcode4.IconCompatParcelizer(false);
                } else {
                    getpostalcode4.serializer(-1483671889);
                    TagsKt.write(str4, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, 0.0f, f2, 0.0f, 11), 0, 0, getpostalcode4, 0, 28);
                    z3 = false;
                    getpostalcode4.IconCompatParcelizer(false);
                }
                String str5 = containsfireids.write;
                if (str5 == null) {
                    getpostalcode4.serializer(-1483372771);
                    getpostalcode4.IconCompatParcelizer(z3);
                } else {
                    getpostalcode4.serializer(-1483372770);
                    TextKt.m131TextNvy7gAk(str5, null, containsfireids.IconCompatParcelizer, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode4, 0, 0, 131066);
                    getpostalcode4.IconCompatParcelizer(false);
                }
                getpostalcode4.IconCompatParcelizer(true);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode4, SizeKt.m83size3ABfNKs(companion2, f2)});
                z4 = false;
                getpostalcode4.IconCompatParcelizer(false);
            }
            addInteger addinteger = addmapjson.write;
            if (addinteger == null) {
                getpostalcode4.serializer(-587721702);
                getpostalcode4.IconCompatParcelizer(z4);
            } else {
                getpostalcode4.serializer(-587721701);
                TextKt.m131TextNvy7gAk(addinteger.serializer, null, addinteger.write, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode4, 0, 0, 131066);
                getpostalcode4.IconCompatParcelizer(false);
            }
            int i16 = serializer + 103;
            write = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            af$$ExternalSyntheticOutline0.m(getpostalcode4, true, true, true);
            getpostalcode = getpostalcode4;
        } else {
            getPostalCode getpostalcode10 = getpostalcode5;
            getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode10;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new buildReftagSdkClickPackage(addmapjson, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, i, 1);
        }
    }
}
