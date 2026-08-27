package o;

import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.ButtonTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.IvrState;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableStepComposableKt;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TransitionBasedAnimation {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    public static final void RemoteActionCompatParcelizer(final asTree astree, final IvrState ivrState, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final boolean z, androidx.compose.ui.Modifier modifier, final Integer num, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final androidx.compose.ui.Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        int i3;
        boolean z2;
        String str;
        fieldToDouble fieldtodouble;
        createFromParcel createfromparcel;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        ivrState.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(685901894);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(astree);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(astree);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(ivrState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.write(z) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        int i6 = i2 | 24576;
        if ((196608 & i) == 0) {
            int i7 = write + 59;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.read(num)) {
                int i9 = RemoteActionCompatParcelizer + 39;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    throw null;
                }
                i4 = androidx.compose.ui.graphics.Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i6 |= i4;
        }
        if (getpostalcode.write(i6 & 1, (74899 & i6) != 74898)) {
            modifier2 = androidx.compose.ui.Modifier.Companion;
            if ((i6 & 112) == 32) {
                int i10 = RemoteActionCompatParcelizer + 73;
                write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2) {
                objComponentActivity = Boolean.valueOf(ivrState == IvrState.SUCCESS);
                getpostalcode.write(objComponentActivity);
            } else {
                int i11 = write + 99;
                RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = Boolean.valueOf(ivrState == IvrState.SUCCESS);
                    getpostalcode.write(objComponentActivity);
                }
            }
            final boolean zBooleanValue = ((Boolean) objComponentActivity).booleanValue();
            final ComposeAnimationState composeAnimationState = astree.button;
            if (composeAnimationState == null) {
                getpostalcode.serializer(-1750715697);
                getpostalcode.IconCompatParcelizer(false);
                createfromparcel = null;
            } else {
                getpostalcode.serializer(-1750715696);
                if (!zBooleanValue) {
                    str = astree.initialDescription;
                } else {
                    int i13 = write + 99;
                    RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    str = astree.descriptionCallStarted;
                }
                if (zBooleanValue) {
                    int i15 = RemoteActionCompatParcelizer + 25;
                    write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        fieldtodouble = fieldToDouble.Complete;
                        int i16 = 96 / 0;
                    } else {
                        fieldtodouble = fieldToDouble.Complete;
                    }
                } else {
                    fieldtodouble = fieldToDouble.Active;
                }
                CustomerUnavailableStepComposableKt.CustomerUnavailableStepComposable(fieldtodouble, coil3.ExtrasKt.write(726649284, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.parse
                    private static int MediaBrowserCompatMediaItem = 1;
                    private static int MediaMetadataCompat;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z3;
                        boolean z4;
                        int i17 = 2 % 2;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if ((iIntValue & 3) != 2) {
                            int i18 = MediaMetadataCompat + 5;
                            MediaBrowserCompatMediaItem = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(iIntValue & 1, z3)) {
                            if (zBooleanValue) {
                                getpostalcode2.serializer(973690462);
                                IconCompatParcelizer.IconCompatParcelizer(androidx.compose.ui.Modifier.Companion, Dimensions.setActionBarVisibilityCallback, getpostalcode2, false);
                                int i20 = MediaBrowserCompatMediaItem + 117;
                                MediaMetadataCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i21 = i20 % 2;
                            } else {
                                getpostalcode2.serializer(973823545);
                                ComposeAnimationState composeAnimationState2 = composeAnimationState;
                                ButtonTypeToken buttonTypeToken = composeAnimationState2.type;
                                String str2 = composeAnimationState2.actionTitle;
                                Integer num2 = composeAnimationState2.actionIcon;
                                if (ivrState == IvrState.IN_PROGRESS) {
                                    int i22 = MediaMetadataCompat + 37;
                                    MediaBrowserCompatMediaItem = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    z4 = !(i22 % 2 == 0);
                                } else {
                                    z4 = false;
                                }
                                ButtonTypeTokenMapperKt.IconCompatParcelizer(buttonTypeToken, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.foundation.layout.SizeKt.write(androidx.compose.ui.Modifier.Companion, 1.0f), z, z4, num2, getpostalcode2, 3072, androidx.compose.ui.graphics.Fields.SpotShadowColor);
                                getpostalcode2.IconCompatParcelizer(false);
                            }
                        } else {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), modifier2, astree.title, str, num, false, getpostalcode, (i6 & 458752) | ((i6 >> 6) & 896) | 48, 64);
                getpostalcode.IconCompatParcelizer(false);
                createfromparcel = createFromParcel.INSTANCE;
            }
            if (createfromparcel == null) {
                Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("IvrCall: Button data is not present."));
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i17 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TriggerComposeAnimationCompanion
                    private static int MediaBrowserCompatMediaItem = 1;
                    private static int RatingCompat;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = RatingCompat + 79;
                        MediaBrowserCompatMediaItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        Object obj3 = null;
                        if (i19 % 2 == 0) {
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            obj3.hashCode();
                            throw null;
                        }
                        int i20 = i17;
                        createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                        int i21 = i;
                        if (i20 == 0) {
                            ((Integer) obj2).getClass();
                            TransitionBasedAnimation.RemoteActionCompatParcelizer(astree, ivrState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, modifier2, num, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i21 | 1));
                            return createfromparcel3;
                        }
                        ((Integer) obj2).getClass();
                        TransitionBasedAnimation.RemoteActionCompatParcelizer(astree, ivrState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, modifier2, num, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i21 | 1));
                        int i22 = MediaBrowserCompatMediaItem + 75;
                        RatingCompat = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i22 % 2 == 0) {
                            return createfromparcel3;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                };
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            i3 = RemoteActionCompatParcelizer + 49;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i18 = 1;
            final androidx.compose.ui.Modifier modifier3 = modifier2;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TriggerComposeAnimationCompanion
                private static int MediaBrowserCompatMediaItem = 1;
                private static int RatingCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i110 = RatingCompat + 79;
                    MediaBrowserCompatMediaItem = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    Object obj3 = null;
                    if (i110 % 2 == 0) {
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        obj3.hashCode();
                        throw null;
                    }
                    int i20 = i18;
                    createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                    int i21 = i;
                    if (i20 == 0) {
                        ((Integer) obj2).getClass();
                        TransitionBasedAnimation.RemoteActionCompatParcelizer(astree, ivrState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, modifier3, num, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i21 | 1));
                        return createfromparcel3;
                    }
                    ((Integer) obj2).getClass();
                    TransitionBasedAnimation.RemoteActionCompatParcelizer(astree, ivrState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, modifier3, num, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i21 | 1));
                    int i22 = MediaBrowserCompatMediaItem + 75;
                    RatingCompat = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i22 % 2 == 0) {
                        return createfromparcel3;
                    }
                    obj3.hashCode();
                    throw null;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            i3 = RemoteActionCompatParcelizer + 49;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }
}
