package com.roadrunner.delivery.accept.deliverydetails.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.Measurer2;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.accept.deliverydetails.api.DeliveryDetailsUiModel;
import com.roadrunner.delivery.accept.deliverydetails.presentation.DeliveryDetailsUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.opportunities.calendar.tile.BonusMultiplierTileKt$BonusMultiplierWithTime$$inlined$ConstraintLayout$5;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Arrays;
import java.util.Iterator;
import o.ActivityPackageSender1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.CanvasCompatQ;
import o.CanvasCompatR;
import o.CanvasCompatS;
import o.CharSequenceCharacterIterator;
import o.DefaultPagerNestedScrollConnection;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawBackgroundModifier;
import o.DrawBehindElement;
import o.IActivityPackageSender;
import o.IActivityPackageSenderResponseDataCallbackSubscriber;
import o.InlineClassUtils_androidKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextFieldDefaults;
import o.buildMapping;
import o.createFromParcel;
import o.drawDoubleRoundRect;
import o.ff;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getLayers;
import o.getLayout;
import o.getNewPassword;
import o.getPostalCode;
import o.getTypeface;
import o.getVariationSettings;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setClickable;
import o.supportingTextPaddinga9UjIt4material3default;
import o.u3;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeliveryDetailsContentKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static /* synthetic */ Object write(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = ~i;
        int i10 = ~((~i2) | i9);
        int i11 = ~(i5 | i9);
        int i12 = i10 | i11;
        int i13 = i11 | i2;
        int i14 = ~(i9 | i2);
        int i15 = i + i2 + i3 + (1577873432 * i6) + (977123338 * i4);
        int i16 = i15 * i15;
        int i17 = (((-1026819430) * i) - 865599488) + ((-647756440) * i2) + (i12 * 189531495) + ((-189531495) * i13) + (189531495 * i14) + ((-837287936) * i3) + ((-767557632) * i6) + (1290797056 * i4) + ((-539361280) * i16);
        int i18 = (i * (-1177406726)) + 1326046462 + (i2 * (-1177405720)) + (i12 * 503) + (i13 * (-503)) + (i14 * 503) + (i3 * (-1177406223)) + (i6 * 1546282648) + (i4 * (-1884272278)) + (i16 * 70909952);
        int i19 = i17 + (i18 * i18 * 451280896);
        int i20 = 4;
        char c = 1;
        if (i19 == 1) {
            CharSequenceCharacterIterator charSequenceCharacterIterator = (CharSequenceCharacterIterator) objArr[0];
            Modifier modifier = (Modifier) objArr[1];
            getBirthDateFull getbirthdatefull = (getBirthDateFull) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i21 = 2 % 2;
            int i22 = IconCompatParcelizer + 17;
            write = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-878692873);
            if ((iIntValue & 6) == 0) {
                int i24 = write + 29;
                IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                if ((iIntValue & 8) == 0 ? getpostalcode.read(charSequenceCharacterIterator) : getpostalcode.IconCompatParcelizer(charSequenceCharacterIterator)) {
                    int i26 = IconCompatParcelizer + 7;
                    write = i26 % Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                } else {
                    i20 = 2;
                }
                i7 = i20 | iIntValue;
            } else {
                i7 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i7 |= getpostalcode.read(modifier) ? 32 : 16;
            }
            if (!getpostalcode.write(i7 & 1, (i7 & 19) != 18)) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else if (charSequenceCharacterIterator.MediaDescriptionCompat.isEmpty()) {
                getpostalcode.serializer(686479051);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(686415625);
                Tags(charSequenceCharacterIterator.MediaDescriptionCompat, modifier, getpostalcode, i7 & 112);
                getpostalcode.IconCompatParcelizer(false);
            }
            getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat == null) {
                return null;
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayout(charSequenceCharacterIterator, modifier, iIntValue, 5);
            return null;
        }
        getTypeface gettypeface = (getTypeface) objArr[0];
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i28 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        getpostalcode2.MediaSessionCompatQueueItem(-173613699);
        if ((iIntValue2 & 6) == 0) {
            int i29 = IconCompatParcelizer + 107;
            write = i29 % Fields.SpotShadowColor;
            if ((i29 % 2 == 0 ? (iIntValue2 & 8) != 0 : (iIntValue2 & 63) != 0) ? getpostalcode2.IconCompatParcelizer(gettypeface) : getpostalcode2.read(gettypeface)) {
                int i30 = write;
                int i31 = i30 + 27;
                IconCompatParcelizer = i31 % Fields.SpotShadowColor;
                int i32 = i31 % 2;
                int i33 = i30 + 77;
                IconCompatParcelizer = i33 % Fields.SpotShadowColor;
                int i34 = i33 % 2;
            } else {
                i20 = 2;
            }
            i8 = i20 | iIntValue2;
        } else {
            i8 = iIntValue2;
        }
        if (getpostalcode2.write(i8 & 1, (i8 & 3) != 2)) {
            int i35 = InlineClassUtils_androidKt.RemoteActionCompatParcelizer[gettypeface.IconCompatParcelizer.ordinal()];
            if (i35 != 1) {
                int i36 = IconCompatParcelizer;
                int i37 = i36 + 121;
                write = i37 % Fields.SpotShadowColor;
                int i38 = i37 % 2;
                if (i35 == 2) {
                    getpostalcode2.serializer(660966182);
                    String str = gettypeface.RemoteActionCompatParcelizer;
                    Modifier.Companion companion = Modifier.Companion;
                    companion.getClass();
                    TagsKt.MediaBrowserCompatMediaItem(str, companion, 0, 0, getpostalcode2, 48, 28);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    if (i35 != 3) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode2, 660961233, false);
                    }
                    int i39 = i36 + 45;
                    write = i39 % Fields.SpotShadowColor;
                    if (i39 % 2 != 0) {
                        getpostalcode2.serializer(660969411);
                        String str2 = gettypeface.RemoteActionCompatParcelizer;
                        Modifier.Companion companion2 = Modifier.Companion;
                        companion2.getClass();
                        TagsKt.write(str2, companion2, 1, 1, getpostalcode2, 28, 61);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.serializer(660969411);
                        String str3 = gettypeface.RemoteActionCompatParcelizer;
                        Modifier.Companion companion3 = Modifier.Companion;
                        companion3.getClass();
                        TagsKt.write(str3, companion3, 0, 0, getpostalcode2, 48, 28);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                }
            } else {
                getpostalcode2.serializer(660962666);
                String str4 = gettypeface.RemoteActionCompatParcelizer;
                Modifier.Companion companion4 = Modifier.Companion;
                companion4.getClass();
                TagsKt.RemoteActionCompatParcelizer(str4, companion4, 0, 0, getpostalcode2, 48, 28);
                getpostalcode2.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 == null) {
            return null;
        }
        gethandleruiannotationsMediaDescriptionCompat2.serializer = new getVariationSettings(gettypeface, iIntValue2, c == true ? 1 : 0);
        return null;
    }

    public static final long serializer(CharSequenceCharacterIterator charSequenceCharacterIterator, getBirthDateFull getbirthdatefull) {
        long supportBackgroundTintMode;
        int i = 2 % 2;
        int i2 = write + 37;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (charSequenceCharacterIterator.MediaBrowserCompatMediaItem == CanvasCompatS.PickedUp) {
            getpostalcode.serializer(1868473524);
            supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener();
        } else {
            getpostalcode.serializer(1868474228);
            supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
        }
        getpostalcode.IconCompatParcelizer(false);
        int i4 = write + 85;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return supportBackgroundTintMode;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035 A[PHI: r8
  0x0035: PHI (r8v5 o.getPostalCode) = (r8v1 o.getPostalCode), (r8v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r8
  0x002a: PHI (r8v2 o.getPostalCode) = (r8v1 o.getPostalCode), (r8v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RemoteActionCompatParcelizer(DeliveryDetailsUiModel deliveryDetailsUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 87;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            deliveryDetailsUiModel.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(288606655);
            if ((i & 30) == 0) {
                if (getpostalcode.read(deliveryDetailsUiModel)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            deliveryDetailsUiModel.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(288606655);
            if ((i & 6) == 0) {
                if (getpostalcode.read(deliveryDetailsUiModel)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i6 = i3 | 48;
        if (getpostalcode.write(i6 & 1, (i6 & 19) != 18)) {
            modifier = Modifier.Companion;
            CanvasCompatR canvasCompatR = (CanvasCompatR) ExtrasKt.write(((DeliveryDetailsUiModelImpl) deliveryDetailsUiModel).MediaDescriptionCompat, getpostalcode, 0).getValue();
            if (!(!(canvasCompatR instanceof CanvasCompatQ))) {
                int i7 = write + 51;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                getpostalcode.serializer(-643466946);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(canvasCompatR instanceof drawDoubleRoundRect)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1821875354, false);
                }
                int i9 = IconCompatParcelizer + 93;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    getpostalcode.serializer(-643395057);
                    modifier.getClass();
                    DeliveryDetails((drawDoubleRoundRect) canvasCompatR, modifier, getpostalcode, 1);
                } else {
                    getpostalcode.serializer(-643395057);
                    modifier.getClass();
                    DeliveryDetails((drawDoubleRoundRect) canvasCompatR, modifier, getpostalcode, 0);
                }
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(deliveryDetailsUiModel, modifier, i, 16);
        }
    }

    public static final void write(CharSequenceCharacterIterator charSequenceCharacterIterator, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean zIconCompatParcelizer;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = write + 51;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1389813335);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i7 = IconCompatParcelizer + 51;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                zIconCompatParcelizer = getpostalcode.read(charSequenceCharacterIterator);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(charSequenceCharacterIterator);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i9 = write + 39;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            int i11 = IconCompatParcelizer + 9;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = false;
        }
        if (!(!getpostalcode.write(i2 & 1, z))) {
            ImageKt.Image(PainterResources_androidKt.painterResource(charSequenceCharacterIterator.read, getpostalcode, 0), null, modifier, null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, serializer(charSequenceCharacterIterator, getpostalcode), 0, 2, null), getpostalcode, Painter.$stable | 48 | ((i2 << 3) & 896), 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayout(charSequenceCharacterIterator, modifier, i, i3);
        }
    }

    public static final void serializer(CharSequenceCharacterIterator charSequenceCharacterIterator, long j, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        charSequenceCharacterIterator.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(758813943);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 85;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? (i & 8) == 0 : (i & 76) == 0) {
                zIconCompatParcelizer = getpostalcode.read(charSequenceCharacterIterator);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(charSequenceCharacterIterator);
            }
            i2 = i | (zIconCompatParcelizer ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.serializer(j)) {
                int i6 = write + 59;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                i3 = i6 % 2 == 0 ? 30 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i7 = i2 | 384;
        if ((i7 & 147) != 146) {
            int i8 = write + 79;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            float f = Dimensions.generateLayoutParams;
            getCurrentSessionimpl.read(PaddingKt.m74paddingqDBjuR0$default(modifierWrite, 0.0f, f, 0.0f, Dimensions.getActionBarHideOffset, 5), RectangleShapeKt.getRectangleShape(), withSessionCancellingPreviousimpl.serializer(j, getpostalcode, (i7 >> 3) & 14), withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(f, 62), DefaultPagerNestedScrollConnection.serializer(f, Color.Companion.m757getTransparent0d7_KjU()), ExtrasKt.write(1163970153, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(8, charSequenceCharacterIterator), getpostalcode), getpostalcode, 196656, 0);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setClickable(charSequenceCharacterIterator, j, modifier2, i, 2);
        }
    }

    public static final void read(CharSequenceCharacterIterator charSequenceCharacterIterator, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1708455696);
        if ((i & 6) == 0) {
            int i5 = write + 109;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0 ? (i & 8) == 0 : (i & 79) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(charSequenceCharacterIterator);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(charSequenceCharacterIterator);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
            int i6 = write + 103;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = write + 99;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (!(!getpostalcode2.read(modifier))) {
                int i10 = write + 95;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if (getpostalcode2.write(i12 & 1, (i12 & 19) != 18)) {
            String str = charSequenceCharacterIterator.serializer;
            if (str != null) {
                getpostalcode2.serializer(-1241052137);
                TextKt.m131TextNvy7gAk(str, modifier, serializer(charSequenceCharacterIterator, getpostalcode2), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3512getEnde0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode2, i12 & 112, 0, 130040);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                int i13 = write + 105;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    getpostalcode2.serializer(-1241052138);
                    getpostalcode2.IconCompatParcelizer(true);
                } else {
                    getpostalcode2.serializer(-1241052138);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                getpostalcode = getpostalcode2;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayout(charSequenceCharacterIterator, modifier, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072 A[PHI: r3
  0x0072: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v7 java.lang.String) binds: [B:32:0x0065, B:29:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(CharSequenceCharacterIterator charSequenceCharacterIterator, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        String str;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1042798930);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(charSequenceCharacterIterator);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(charSequenceCharacterIterator);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ^ true ? 16 : 32;
        }
        int i4 = i2;
        if (!getpostalcode2.write(i4 & 1, (i4 & 19) != 18)) {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i5 = IconCompatParcelizer + 119;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            int i7 = write + 89;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                str = charSequenceCharacterIterator.write;
                int i8 = 6 / 0;
                if (str == null) {
                    getpostalcode2.serializer(524591571);
                    getpostalcode2.IconCompatParcelizer(false);
                    getpostalcode = getpostalcode2;
                } else {
                    getpostalcode2.serializer(524591572);
                    TextKt.m131TextNvy7gAk(str, modifier, serializer(charSequenceCharacterIterator, getpostalcode2), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode2, i4 & 112, 0, 130040);
                    getpostalcode = getpostalcode2;
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                str = charSequenceCharacterIterator.write;
                if (str == null) {
                    getpostalcode2.serializer(524591571);
                    getpostalcode2.IconCompatParcelizer(false);
                    getpostalcode = getpostalcode2;
                } else {
                    getpostalcode2.serializer(524591572);
                    TextKt.m131TextNvy7gAk(str, modifier, serializer(charSequenceCharacterIterator, getpostalcode2), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode2, i4 & 112, 0, 130040);
                    getpostalcode = getpostalcode2;
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayout(charSequenceCharacterIterator, modifier, i, 6);
        }
    }

    public static final void MediaBrowserCompatMediaItem(CharSequenceCharacterIterator charSequenceCharacterIterator, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-393327690);
        boolean z = true;
        if ((i & 6) == 0) {
            int i5 = write + 11;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (!((i5 % 2 != 0 ? (i & 8) != 0 : (i & 62) != 0) ? getpostalcode2.IconCompatParcelizer(charSequenceCharacterIterator) : getpostalcode2.read(charSequenceCharacterIterator))) {
                i3 = 2;
            } else {
                int i6 = IconCompatParcelizer + 57;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = IconCompatParcelizer + 17;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        int i10 = i2;
        if ((i10 & 19) != 18) {
            int i11 = IconCompatParcelizer + 27;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i10 & 1, z)) {
            String str = charSequenceCharacterIterator.MediaMetadataCompat;
            if (str == null) {
                getpostalcode2.serializer(-954313144);
                getpostalcode2.IconCompatParcelizer(false);
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(-954313143);
                TextKt.m131TextNvy7gAk(str, modifier, serializer(charSequenceCharacterIterator, getpostalcode2), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, i10 & 112, 0, 130040);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayout(charSequenceCharacterIterator, modifier, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    public static final void NewDeliveryRouteLine(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 97;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2052121958);
        getAddressCountry getaddresscountry = getpostalcode.read;
        int i5 = i | 6;
        if (!getpostalcode.write(i5 & 1, (i5 & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = IconCompatParcelizer + 105;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            modifier = Modifier.Companion;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(modifier, 1.0f), Dimensions.setActionBarVisibilityCallback, 0.0f, 0.0f, 0.0f, 14);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            Alignment.Companion companion = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i8 = write + 29;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i9 = 43 / 0;
                if (getpostalcode.ComponentActivity) {
                    int i10 = write + 41;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i12 = write + 41;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierM86width3ABfNKs = SizeKt.m86width3ABfNKs(modifier, Dimensions.removeOnContextAvailableListener);
            MeasurePolicy measurePolicy = BoxKt.read(companion.getCenter(), false);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM86width3ABfNKs);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i14 = IconCompatParcelizer + 37;
                write = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    getpostalcode.serializer(constructor2);
                    int i15 = 74 / 0;
                } else {
                    getpostalcode.serializer(constructor2);
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier, Dimensions.write), Dimensions.setMenu), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[PHI: r4
  0x0068: PHI (r4v9 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r4
  0x002e: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void Tags(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 53;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-977976746);
            if ((i & 32) == 0) {
                int i7 = write + 31;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0 ? (i & 8) == 0 : (i & 107) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                    int i8 = IconCompatParcelizer + 63;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
                if (zIconCompatParcelizer) {
                    i4 = write + 89;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-977976746);
            if ((i & 6) == 0) {
                int i10 = write + 31;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                zIconCompatParcelizer = i10 % 2 == 0 ? getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) : getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                if (zIconCompatParcelizer) {
                    i4 = write + 89;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
            int i11 = IconCompatParcelizer + 45;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        int i13 = 1;
        if (getpostalcode.write(i3 & 1, (i3 & 19) != 18)) {
            modifier.getClass();
            Modifier modifierSerializer = PagerWrapperFlingBehavior.serializer(modifier, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), true, false);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = write + 9;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(-1807653452);
            int i16 = 0;
            for (Object obj : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                if (i16 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                write(10994189, new Object[]{(getTypeface) obj, getpostalcode, 0}, -10994189, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), ff.IconCompatParcelizer());
                if (i16 == r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size() - 1) {
                    getpostalcode.serializer(-1636915439);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(Modifier.Companion, Dimensions.getActionBarHideOffset)});
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1636844325);
                    getpostalcode.IconCompatParcelizer(false);
                }
                i16++;
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new u3(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, modifier, i, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[PHI: r4
  0x0055: PHI (r4v9 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r4
  0x002f: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void DeliveryDetails(drawDoubleRoundRect drawdoubleroundrect, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 109;
        write = i7 % Fields.SpotShadowColor;
        Object obj = null;
        if (i7 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-313467761);
            if ((i & 7) == 0) {
                if ((i & 8) == 0) {
                    i4 = write + 55;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        getpostalcode.read(drawdoubleroundrect);
                        obj.hashCode();
                        throw null;
                    }
                    zIconCompatParcelizer = getpostalcode.read(drawdoubleroundrect);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(drawdoubleroundrect);
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
            getpostalcode.MediaSessionCompatQueueItem(-313467761);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    i4 = write + 55;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        getpostalcode.read(drawdoubleroundrect);
                        obj.hashCode();
                        throw null;
                    }
                    zIconCompatParcelizer = getpostalcode.read(drawdoubleroundrect);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(drawdoubleroundrect);
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
            if (getpostalcode.read(modifier)) {
                int i8 = IconCompatParcelizer + 61;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 19) != 18)) {
            int i10 = write + 93;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(BackgroundKt.m20backgroundbw27NRU(SizeKt.write(modifier, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), 0.0f, Dimensions.setActionBarVisibilityCallback, 0.0f, Dimensions.getNestedScrollAxes, 5);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(-1124053352);
            Iterator it = drawdoubleroundrect.IconCompatParcelizer.iterator();
            int i12 = 0;
            while (!(!it.hasNext())) {
                Object next = it.next();
                if (i12 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                Modifier.Companion companion2 = Modifier.Companion;
                String.format("destination_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                companion2.getClass();
                Destination((CharSequenceCharacterIterator) next, companion2, getpostalcode, 0);
                i12++;
                int i13 = IconCompatParcelizer + 71;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(drawdoubleroundrect, modifier, i, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    public static final void Destination(CharSequenceCharacterIterator charSequenceCharacterIterator, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        long overflowIcon;
        float f;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        charSequenceCharacterIterator.getClass();
        boolean z = charSequenceCharacterIterator.IconCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-646728002);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(charSequenceCharacterIterator);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(charSequenceCharacterIterator);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i5 = write + 41;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 == 0 ? 72 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            CanvasCompatS canvasCompatS = charSequenceCharacterIterator.MediaBrowserCompatMediaItem;
            if (canvasCompatS == CanvasCompatS.NewCustomer) {
                getpostalcode.serializer(-268184668);
                overflowIcon = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon();
            } else {
                int i6 = IconCompatParcelizer + 51;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    if (canvasCompatS != CanvasCompatS.NewVendor) {
                        getpostalcode.serializer(-268183964);
                        overflowIcon = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                    } else {
                        getpostalcode.serializer(-268184668);
                        overflowIcon = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon();
                    }
                } else {
                    int i7 = 85 / 0;
                    if (canvasCompatS != CanvasCompatS.NewVendor) {
                        getpostalcode.serializer(-268183964);
                        overflowIcon = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                    } else {
                        getpostalcode.serializer(-268184668);
                        overflowIcon = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon();
                    }
                }
            }
            getpostalcode.IconCompatParcelizer(false);
            int i8 = write + 23;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 98 / 0;
                if (z) {
                    f = Dimensions.getActionBarHideOffset;
                } else {
                    f = Dimensions.generateLayoutParams;
                }
            } else if (z) {
                f = Dimensions.getActionBarHideOffset;
            } else {
                f = Dimensions.generateLayoutParams;
            }
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(modifier, 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                serializer(charSequenceCharacterIterator, overflowIcon, null, getpostalcode, i2 & 14);
                if (z) {
                    getpostalcode.serializer(20229056);
                    NewDeliveryRouteLine(null, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(20273262);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
                int i10 = write + 7;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayout(charSequenceCharacterIterator, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[PHI: r1 r2 r3 r4
  0x0080: PHI (r1v12 androidx.compose.ui.Modifier$Companion) = (r1v11 androidx.compose.ui.Modifier$Companion), (r1v18 androidx.compose.ui.Modifier$Companion) binds: [B:29:0x007e, B:26:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r2v6 androidx.compose.ui.Modifier) = (r2v5 androidx.compose.ui.Modifier), (r2v18 androidx.compose.ui.Modifier) binds: [B:29:0x007e, B:26:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r3v2 float) = (r3v1 float), (r3v10 float) binds: [B:29:0x007e, B:26:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r4v1 o.CanvasCompatS) = (r4v0 o.CanvasCompatS), (r4v7 o.CanvasCompatS) binds: [B:29:0x007e, B:26:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0161  */
    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    public static final void RemoteActionCompatParcelizer(CharSequenceCharacterIterator charSequenceCharacterIterator, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier.Companion companion;
        Modifier modifierWrite;
        float f;
        CanvasCompatS canvasCompatS;
        float f2;
        Density density;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        Measurer2 measurer2;
        Object objComponentActivity2;
        DrawBehindElement drawBehindElement;
        Object objComponentActivity3;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        Object objComponentActivity4;
        DrawBackgroundModifier drawBackgroundModifier;
        Object objComponentActivity5;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8;
        Object objComponentActivity6;
        boolean z;
        Object obj;
        Object objComponentActivity7;
        boolean zIconCompatParcelizer;
        Object objComponentActivity8;
        Modifier modifier2;
        int i3;
        boolean zIconCompatParcelizer2;
        int i4;
        int i5 = 2 % 2;
        charSequenceCharacterIterator.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-792736553);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer2 = getpostalcode.read(charSequenceCharacterIterator);
            } else {
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(charSequenceCharacterIterator);
            }
            if (zIconCompatParcelizer2) {
                int i6 = write + 53;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 == 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        int i8 = 1;
        if (getpostalcode.write(i7 & 1, (i7 & 19) != 18)) {
            int i9 = IconCompatParcelizer + 61;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                companion = Modifier.Companion;
                modifierWrite = SizeKt.write(companion, 1.0f);
                f = Dimensions.setActionBarVisibilityCallback;
                canvasCompatS = charSequenceCharacterIterator.MediaBrowserCompatMediaItem;
                if (canvasCompatS != CanvasCompatS.NewCustomer) {
                    if (canvasCompatS == CanvasCompatS.NewVendor) {
                        f2 = Dimensions.generateLayoutParams;
                    }
                }
                Modifier.Companion companion2 = companion;
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, f, f2, 0.0f, 0.0f, 12);
                getpostalcode.serializer(-1003410150);
                getpostalcode.serializer(212064437);
                getpostalcode.IconCompatParcelizer(false);
                density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new Measurer2(density);
                    getpostalcode.write(objComponentActivity);
                }
                measurer2 = (Measurer2) objComponentActivity;
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new DrawBehindElement();
                    getpostalcode.write(objComponentActivity2);
                }
                drawBehindElement = (DrawBehindElement) objComponentActivity2;
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                    getpostalcode.write(objComponentActivity3);
                }
                populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                    getpostalcode.write(objComponentActivity4);
                }
                drawBackgroundModifier = (DrawBackgroundModifier) objComponentActivity4;
                objComponentActivity5 = getpostalcode.ComponentActivity();
                if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                    getpostalcode.write(objComponentActivity5);
                }
                populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(measurer2);
                boolean z2 = getpostalcode.read(257);
                objComponentActivity6 = getpostalcode.ComponentActivity();
                z = zIconCompatParcelizer3 | z2;
                obj = null;
                if (z) {
                    objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 1);
                    getpostalcode.write(objComponentActivity6);
                } else {
                    i3 = write + 11;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 1);
                        getpostalcode.write(objComponentActivity6);
                    }
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity6;
                objComponentActivity7 = getpostalcode.ComponentActivity();
                if (objComponentActivity7 == androidContentCaptureManager) {
                    objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 1);
                    getpostalcode.write(objComponentActivity7);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(measurer2);
                objComponentActivity8 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer) {
                    objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, i8);
                    getpostalcode.write(objComponentActivity8);
                } else {
                    int i10 = write + 57;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, i8);
                        getpostalcode.write(objComponentActivity8);
                    }
                }
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM74paddingqDBjuR0$default, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new BonusMultiplierTileKt$BonusMultiplierWithTime$$inlined$ConstraintLayout$5(populateViewStructure_androidKtpopulate8, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, charSequenceCharacterIterator, 1), getpostalcode), measurePolicy, getpostalcode, 48, 0);
                getpostalcode.IconCompatParcelizer(false);
                modifier2 = companion2;
            } else {
                companion = Modifier.Companion;
                modifierWrite = SizeKt.write(companion, 1.0f);
                f = Dimensions.setActionBarVisibilityCallback;
                canvasCompatS = charSequenceCharacterIterator.MediaBrowserCompatMediaItem;
                if (canvasCompatS != CanvasCompatS.NewCustomer) {
                    if (canvasCompatS == CanvasCompatS.NewVendor) {
                        f2 = Dimensions.generateLayoutParams;
                    }
                }
                Modifier.Companion companion3 = companion;
                Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, f, f2, 0.0f, 0.0f, 12);
                getpostalcode.serializer(-1003410150);
                getpostalcode.serializer(212064437);
                getpostalcode.IconCompatParcelizer(false);
                density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new Measurer2(density);
                    getpostalcode.write(objComponentActivity);
                }
                measurer2 = (Measurer2) objComponentActivity;
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new DrawBehindElement();
                    getpostalcode.write(objComponentActivity2);
                }
                drawBehindElement = (DrawBehindElement) objComponentActivity2;
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                    getpostalcode.write(objComponentActivity3);
                }
                populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                    getpostalcode.write(objComponentActivity4);
                }
                drawBackgroundModifier = (DrawBackgroundModifier) objComponentActivity4;
                objComponentActivity5 = getpostalcode.ComponentActivity();
                if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                    getpostalcode.write(objComponentActivity5);
                }
                populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
                boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(measurer2);
                boolean z3 = getpostalcode.read(257);
                objComponentActivity6 = getpostalcode.ComponentActivity();
                z = zIconCompatParcelizer4 | z3;
                obj = null;
                if (z) {
                    objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 1);
                    getpostalcode.write(objComponentActivity6);
                } else {
                    i3 = write + 11;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 1);
                        getpostalcode.write(objComponentActivity6);
                    }
                }
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objComponentActivity6;
                objComponentActivity7 = getpostalcode.ComponentActivity();
                if (objComponentActivity7 == androidContentCaptureManager) {
                    objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 1);
                    getpostalcode.write(objComponentActivity7);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(measurer2);
                objComponentActivity8 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer) {
                    objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, i8);
                    getpostalcode.write(objComponentActivity8);
                } else {
                    int i12 = write + 57;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    if (objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, i8);
                        getpostalcode.write(objComponentActivity8);
                    }
                }
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM74paddingqDBjuR0$default2, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new BonusMultiplierTileKt$BonusMultiplierWithTime$$inlined$ConstraintLayout$5(populateViewStructure_androidKtpopulate8, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, charSequenceCharacterIterator, 1), getpostalcode), measurePolicy2, getpostalcode, 48, 0);
                getpostalcode.IconCompatParcelizer(false);
                modifier2 = companion3;
            }
            f2 = Dimensions.getNestedScrollAxes;
            Modifier.Companion companion4 = companion;
            Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, f, f2, 0.0f, 0.0f, 12);
            getpostalcode.serializer(-1003410150);
            getpostalcode.serializer(212064437);
            getpostalcode.IconCompatParcelizer(false);
            density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            objComponentActivity = getpostalcode.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new Measurer2(density);
                getpostalcode.write(objComponentActivity);
            }
            measurer2 = (Measurer2) objComponentActivity;
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new DrawBehindElement();
                getpostalcode.write(objComponentActivity2);
            }
            drawBehindElement = (DrawBehindElement) objComponentActivity2;
            objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity3);
            }
            populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                getpostalcode.write(objComponentActivity4);
            }
            drawBackgroundModifier = (DrawBackgroundModifier) objComponentActivity4;
            objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity5);
            }
            populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(measurer2);
            boolean z4 = getpostalcode.read(257);
            objComponentActivity6 = getpostalcode.ComponentActivity();
            z = zIconCompatParcelizer5 | z4;
            obj = null;
            if (z) {
                objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 1);
                getpostalcode.write(objComponentActivity6);
            } else {
                i3 = write + 11;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 1);
                    getpostalcode.write(objComponentActivity6);
                }
            }
            MeasurePolicy measurePolicy3 = (MeasurePolicy) objComponentActivity6;
            objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 1);
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(measurer2);
            objComponentActivity8 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer) {
                objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, i8);
                getpostalcode.write(objComponentActivity8);
            } else {
                int i14 = write + 57;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (objComponentActivity8 == androidContentCaptureManager) {
                    objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, i8);
                    getpostalcode.write(objComponentActivity8);
                }
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM74paddingqDBjuR0$default3, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new BonusMultiplierTileKt$BonusMultiplierWithTime$$inlined$ConstraintLayout$5(populateViewStructure_androidKtpopulate8, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, charSequenceCharacterIterator, 1), getpostalcode), measurePolicy3, getpostalcode, 48, 0);
            getpostalcode.IconCompatParcelizer(false);
            modifier2 = companion4;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayout(charSequenceCharacterIterator, modifier2, i, i8);
        }
    }

    public static final void read(getTypeface gettypeface, getBirthDateFull getbirthdatefull, int i) {
        Object[] objArr = {gettypeface, getbirthdatefull, Integer.valueOf(i)};
        int iIconCompatParcelizer = ff.IconCompatParcelizer();
        write(10994189, objArr, -10994189, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), iIconCompatParcelizer, ff.IconCompatParcelizer());
    }

    public static final void IconCompatParcelizer(CharSequenceCharacterIterator charSequenceCharacterIterator, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        Object[] objArr = {charSequenceCharacterIterator, modifier, getbirthdatefull, Integer.valueOf(i)};
        int iIconCompatParcelizer = ff.IconCompatParcelizer();
        write(1957866164, objArr, -1957866163, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), iIconCompatParcelizer, ff.IconCompatParcelizer());
    }
}
