package com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.logistics.rider.glovo.R;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.rrds.compose.component.actions.links.LinkifyTextKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidLocaleDelegateAPI23;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.accessupdateWithEmojiCompat;
import o.asExecutor;
import o.asExecutorlambda0;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.getQueryContext;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeliveryNotesKt {
    private static int read = 1;
    private static int write;

    public static final void read(accessupdateWithEmojiCompat accessupdatewithemojicompat, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 103;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(702252290);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i7 = read + 45;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                zIconCompatParcelizer = getpostalcode2.read(accessupdatewithemojicompat);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(accessupdatewithemojicompat);
            }
            if (zIconCompatParcelizer) {
                int i9 = read + 119;
                write = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = read + 89;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= !(getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i12 = write + 77;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            getpostalcode = getpostalcode2;
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.write(modifier, 1.0f), null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(682331335, new GapComposerKt$$ExternalSyntheticLambda0(accessupdatewithemojicompat, 22, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), getpostalcode2), getpostalcode2, 12582912, 122);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidLocaleDelegateAPI23(accessupdatewithemojicompat, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, i, 0);
        }
    }

    public static final void DeliveryNotes(DeliveryNotesUiModel deliveryNotesUiModel, CreateHomeScope createHomeScope, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier.Companion companion;
        Context context;
        DeliveryNotesUiModelImpl deliveryNotesUiModelImpl;
        getQueryContext getquerycontext;
        Modifier.Companion companion2;
        boolean z;
        Modifier modifier2;
        int i3 = 2 % 2;
        deliveryNotesUiModel.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(835311449);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(deliveryNotesUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(createHomeScope) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 256 : Fields.SpotShadowColor;
        }
        int i4 = i2 | 3072;
        if (!getpostalcode.write(i4 & 1, (i4 & 1171) != 1170)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i5 = write + 115;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                companion = Modifier.Companion;
                context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
                deliveryNotesUiModelImpl = (DeliveryNotesUiModelImpl) deliveryNotesUiModel;
                getquerycontext = deliveryNotesUiModelImpl.write;
                if ((i4 & 8375) == 28920) {
                    companion2 = companion;
                    z = true;
                } else {
                    companion2 = companion;
                    z = false;
                }
            } else {
                companion = Modifier.Companion;
                context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
                DeliveryNotesUiModelImpl deliveryNotesUiModelImpl2 = (DeliveryNotesUiModelImpl) deliveryNotesUiModel;
                getQueryContext getquerycontext2 = deliveryNotesUiModelImpl2.write;
                if ((i4 & 896) == 256) {
                    deliveryNotesUiModelImpl = deliveryNotesUiModelImpl2;
                    getquerycontext = getquerycontext2;
                    companion2 = companion;
                    z = true;
                } else {
                    deliveryNotesUiModelImpl = deliveryNotesUiModelImpl2;
                    getquerycontext = getquerycontext2;
                    companion2 = companion;
                    z = false;
                }
            }
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(createHomeScope);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(context);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SessionDao_Impl$$ExternalSyntheticLambda1(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, createHomeScope, context);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            asExecutor asexecutor = (asExecutor) ExtrasKt.write(deliveryNotesUiModelImpl.MediaDescriptionCompat, getpostalcode, 0).getValue();
            if (asexecutor instanceof asExecutorlambda0) {
                getpostalcode.serializer(-424544707);
                getpostalcode.IconCompatParcelizer(false);
            } else if (asexecutor instanceof accessupdateWithEmojiCompat) {
                int i6 = write + 11;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                getpostalcode.serializer(-275924383);
                accessupdateWithEmojiCompat accessupdatewithemojicompat = (accessupdateWithEmojiCompat) asexecutor;
                boolean z2 = (i4 & 14) == 4;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                    RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = new RoomDatabase$createConnectionManager$2(2, deliveryNotesUiModel, DeliveryNotesUiModel.class, "onTranslationClicked", "onTranslationClicked(Ljava/lang/String;Ljava/lang/String;)V", 0, 10);
                    getpostalcode.write(roomDatabase$createConnectionManager$2);
                    objComponentActivity2 = roomDatabase$createConnectionManager$2;
                }
                read(accessupdatewithemojicompat, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity2), companion2, getpostalcode, (i4 >> 3) & 896);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                throw d$$ExternalSyntheticOutline0.m(getpostalcode, -424548326, false);
            }
            modifier2 = companion2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) deliveryNotesUiModel, (Object) createHomeScope, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier2, i, 15);
        }
    }

    public static final void DeliveryNotesContent(accessupdateWithEmojiCompat accessupdatewithemojicompat, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2007827142);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(accessupdatewithemojicompat);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessupdatewithemojicompat);
            }
            i2 = i | (zIconCompatParcelizer ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i4 & 147) != 146) {
            int i5 = read + 61;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            float f = Dimensions.setMenu;
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.serializer(f, companion2.getStart()), companion2.getTop(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i7 = write + 35;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    int i9 = write + 37;
                    read = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.serializer(constructor);
                        throw null;
                    }
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_file_new_note, getpostalcode, 0);
                ColorFilter.Companion companion4 = ColorFilter.Companion;
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                ImageKt.Image(painterPainterResource, "image description", null, null, ContentScale.Companion.getNone(), 0.0f, ColorFilter.Companion.m763tintxETnrds$default(companion4, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0, 2, null), getpostalcode, Painter.$stable | 24624, 44);
                Modifier modifierWrite = SizeKt.write(companion, 1.0f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode, 0);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i10 = read + 73;
                    write = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.serializer(constructor2);
                        throw null;
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                LinkifyTextKt.m5034LinkifyPhoneNumberAndUrlTextcf5BqRc(accessupdatewithemojicompat.RemoteActionCompatParcelizer, performLayout.IconCompatParcelizer(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), null, getpostalcode, 0);
                if (accessupdatewithemojicompat.write) {
                    getpostalcode.serializer(-822272103);
                    String str = accessupdatewithemojicompat.serializer;
                    boolean z2 = (i4 & 112) == 32;
                    boolean z3 = (i4 & 14) == 4 || ((i4 & 8) != 0 && getpostalcode.IconCompatParcelizer(accessupdatewithemojicompat));
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((z3 | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 21, accessupdatewithemojicompat);
                        getpostalcode.write(objComponentActivity);
                        int i11 = write + 101;
                        read = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                    }
                    TertiaryKt.IconCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, false, 0, null, null, null, getpostalcode, 0, 252);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-822078942);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidLocaleDelegateAPI23(accessupdatewithemojicompat, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 1);
        }
    }
}
