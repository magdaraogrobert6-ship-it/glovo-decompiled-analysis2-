package com.sentiance.core.model.events;

import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.domain.SaveSignInDataUseCaseImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.push.core.domain.RegisterPushNotificationUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.SignInApplicantUseCase$invoke$1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler21;
import o.ActivityHandler22;
import o.ActivityHandler24;
import o.ActivityHandler25;
import o.ActivityHandler45;
import o.AndroidIndirectPointerEvent_androidKt;
import o.BrazeExternalSyntheticLambda5;
import o.PreferenceGroupAdapter;
import o.acquire;
import o.addToSubscriptionGrouplambda2;
import o.ancestorToLocalS_NoaFU;
import o.boundingRectInRoot;
import o.constrainedMap;
import o.createFromParcel;
import o.getColorIntegerOrNulllambda0;
import o.getRectManager;
import o.hideCurrentlyDisplayingInAppMessage;
import o.incrementCustomUserAttributelambda0;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.isOffline;
import o.isOnline;
import o.lambda31;
import o.logPushCampaign;
import o.mergeJsonObjects;
import o.onItemDismiss;
import o.removeFromSubscriptionGrouplambda2;
import o.requestSingleLocationUpdatelambda1;
import o.resetTransientState;
import o.setAttributionDatalambda0;
import o.setCountrylambda0;
import o.setCustomAttributedefault;
import o.setCustomAttributelambda11;
import o.setDefaultNotificationAccentColor;
import o.setDefaultNotificationChannelDescription;
import o.setGraphicModalMaxWidthDp;
import o.setLineIdlambda3;
import o.setPhoneNumber;
import o.setPresentationView;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.verifyPlayStorePurchaseI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class i$c {
    private static int MediaSessionCompatQueueItem = 0;
    private static int PlaybackStateCompat = 1;
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public I$b RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 17;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        I$b i$b = (I$b) this.serializer;
        getRectManager.IconCompatParcelizer(i$b, "localStore not initialized yet", new Object[0]);
        int i4 = MediaSessionCompatQueueItem + 105;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return i$b;
    }

    public i$c() {
        this.write = new constrainedMap(R.drawable.ic_bold_large_essentials_heart, R.color.success_main, "Heart");
        this.MediaMetadataCompat = new constrainedMap(R.drawable.ic_bold_large_arrow_circle_with_tail_up, R.color.alert_main, "Arrow With Tail Up");
        this.IconCompatParcelizer = new constrainedMap(R.drawable.ic_bold_large_heavy, R.color.secondary_main, "Big Order");
        this.serializer = new constrainedMap(R.drawable.ic_bold_large_partly_cloudy_partly_cloudy, R.color.component_background_chip_selected, "Bad Weather");
        this.RemoteActionCompatParcelizer = new constrainedMap(R.drawable.ic_umbrella_beach, R.color.error_dark_02, "Holiday");
        this.read = new constrainedMap(R.drawable.ic_moon, R.color.secondary_main, "Night");
        this.RatingCompat = new constrainedMap(R.drawable.ic_rain, R.color.component_background_chip_selected, "Rain");
        this.MediaDescriptionCompat = new constrainedMap(R.drawable.ic_fire, R.color.alert_main, "Rush Hour");
        this.MediaBrowserCompatMediaItem = new constrainedMap(R.drawable.ic_snowflake, R.color.component_background_chip_selected, "Snow");
    }

    public ancestorToLocalS_NoaFU serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 79;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ancestorToLocalS_NoaFU ancestortolocals_noafu = (ancestorToLocalS_NoaFU) this.RemoteActionCompatParcelizer;
            getRectManager.IconCompatParcelizer(ancestortolocals_noafu, "syncEngine not initialized yet", new Object[0]);
            return ancestortolocals_noafu;
        }
        ancestorToLocalS_NoaFU ancestortolocals_noafu2 = (ancestorToLocalS_NoaFU) this.RemoteActionCompatParcelizer;
        getRectManager.IconCompatParcelizer(ancestortolocals_noafu2, "syncEngine not initialized yet", new Object[0]);
        return ancestortolocals_noafu2;
    }

    public static i$c IconCompatParcelizer(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt, setPresentationView setpresentationview, lambda31 lambda31Var, PreferenceGroupAdapter preferenceGroupAdapter, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt2, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, acquire acquireVar) {
        int i = 2 % 2;
        i$c i_c = new i$c(mergejsonobjects, mergejsonobjects2, androidIndirectPointerEvent_androidKt, setpresentationview, lambda31Var, preferenceGroupAdapter, androidIndirectPointerEvent_androidKt2, requestsinglelocationupdatelambda1, acquireVar);
        int i2 = PlaybackStateCompat + 29;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return i_c;
    }

    public setCountrylambda0 read() {
        int i = 2 % 2;
        int i2 = ((setDefaultNotificationAccentColor) this.write) != null ? 1 : 0;
        if (((setDefaultNotificationChannelDescription) this.MediaMetadataCompat) != null) {
            int i3 = MediaSessionCompatQueueItem + 113;
            PlaybackStateCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i2++;
        }
        if (((addToSubscriptionGrouplambda2) this.IconCompatParcelizer) != null) {
            int i5 = PlaybackStateCompat + 15;
            int i6 = i5 % Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i6;
            int i7 = i5 % 2;
            i2++;
            int i8 = i6 + 45;
            PlaybackStateCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if (((incrementCustomUserAttributelambda0) this.serializer) != null) {
            int i10 = MediaSessionCompatQueueItem + 63;
            PlaybackStateCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2++;
        }
        if (((setAttributionDatalambda0) this.RemoteActionCompatParcelizer) != null) {
            int i12 = PlaybackStateCompat + 81;
            MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
            i2 = i12 % 2 != 0 ? i2 % 1 : i2 + 1;
        }
        if (((setLineIdlambda3) this.read) != null) {
            i2++;
        }
        if (((removeFromSubscriptionGrouplambda2) this.RatingCompat) != null) {
            i2++;
        }
        if (((setCustomAttributelambda11) this.MediaDescriptionCompat) != null) {
            i2++;
        }
        if (((setCustomAttributedefault) this.MediaBrowserCompatMediaItem) != null) {
            i2++;
        }
        if (i2 == 1) {
            return new setCountrylambda0(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i2, "Invalid union; ", " field(s) were set"));
        return null;
    }

    public setPhoneNumber write() {
        int i;
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat + 31;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (((Byte) this.write) != null) {
            if (((com.sentiance.core.model.thrift.ThriftBool) this.IconCompatParcelizer) != null) {
                if (((com.sentiance.core.model.thrift.ThriftBool) this.serializer) != null) {
                    return new setPhoneNumber(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_activity_recognition_permission_granted' is missing");
                i = MediaSessionCompatQueueItem + 117;
                PlaybackStateCompat = i % Fields.SpotShadowColor;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_precise_location_permission_granted' is missing");
            }
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location_authorization_status' is missing");
        i = PlaybackStateCompat + 35;
        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
        int i4 = i % 2;
        return null;
    }

    public logPushCampaign IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 77;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 == 0) {
            if (((Byte) this.write) != null) {
                int i4 = i3 + 99;
                PlaybackStateCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    if (((ThriftBool) this.IconCompatParcelizer) != null) {
                        if (((ThriftBool) this.serializer) != null) {
                            return new logPushCampaign(this);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_activity_recognition_permission_granted' is missing");
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_precise_location_permission_granted' is missing");
                        int i5 = PlaybackStateCompat + 7;
                        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    }
                } else {
                    throw null;
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location_authorization_status' is missing");
            }
            return null;
        }
        throw null;
    }

    public /* synthetic */ i$c(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5, mergeJsonObjects mergejsonobjects6, mergeJsonObjects mergejsonobjects7, mergeJsonObjects mergejsonobjects8, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0) {
        this.write = mergejsonobjects;
        this.MediaMetadataCompat = mergejsonobjects2;
        this.IconCompatParcelizer = mergejsonobjects3;
        this.serializer = mergejsonobjects4;
        this.RemoteActionCompatParcelizer = mergejsonobjects5;
        this.read = mergejsonobjects6;
        this.RatingCompat = mergejsonobjects7;
        this.MediaDescriptionCompat = mergejsonobjects8;
        this.MediaBrowserCompatMediaItem = getcolorintegerornulllambda0;
    }

    public i$c(FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl, transferSessionPackageI transfersessionpackagei, AppEventInfoChangeHandler appEventInfoChangeHandler, isOffline isoffline, isOnline isonline, boundingRectInRoot boundingrectinroot, RegisterPushNotificationUseCaseImpl registerPushNotificationUseCaseImpl, H$b h$b, SaveSignInDataUseCaseImpl saveSignInDataUseCaseImpl) {
        fetchRemoteConfigUseCaseImpl.getClass();
        transfersessionpackagei.getClass();
        appEventInfoChangeHandler.getClass();
        isoffline.getClass();
        isonline.getClass();
        boundingrectinroot.getClass();
        registerPushNotificationUseCaseImpl.getClass();
        h$b.getClass();
        saveSignInDataUseCaseImpl.getClass();
        this.write = fetchRemoteConfigUseCaseImpl;
        this.MediaMetadataCompat = transfersessionpackagei;
        this.IconCompatParcelizer = appEventInfoChangeHandler;
        this.serializer = isoffline;
        this.RemoteActionCompatParcelizer = isonline;
        this.read = boundingrectinroot;
        this.RatingCompat = registerPushNotificationUseCaseImpl;
        this.MediaDescriptionCompat = h$b;
        this.MediaBrowserCompatMediaItem = saveSignInDataUseCaseImpl;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0167  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ec A[PHI: r2 r3 r4 r18
  0x01ec: PHI (r2v8 int) = (r2v5 int), (r2v15 int) binds: [B:60:0x01e9, B:23:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x01ec: PHI (r3v12 int) = (r3v10 int), (r3v18 int) binds: [B:60:0x01e9, B:23:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x01ec: PHI (r4v7 ??) = (r4v3 ??), (r4v10 ??) binds: [B:60:0x01e9, B:23:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x01ec: PHI (r18v5 o.transferSessionPackageI) = (r5v2 o.transferSessionPackageI), (r18v8 o.transferSessionPackageI) binds: [B:60:0x01e9, B:23:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0216  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String, o.ActivityHandler22, o.ActivityHandler25] */
    /* JADX INFO: renamed from: invoke-0E7RQCE$implementation, reason: not valid java name */
    public Object m5082invoke0E7RQCE$implementation(ActivityHandler21 activityHandler21, ActivityHandler22 activityHandler22, ContinuationImpl continuationImpl) throws Throwable {
        SignInApplicantUseCase$invoke$1 signInApplicantUseCase$invoke$1;
        Object isitemdismissable;
        int i;
        String str;
        int i2;
        ActivityHandler25 activityHandler25;
        String str2;
        int i3;
        AppEventInfoChangeHandler appEventInfoChangeHandler;
        ?? r4;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        RegisterPushNotificationUseCaseImpl registerPushNotificationUseCaseImpl;
        FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl;
        ActivityHandler22 activityHandler23 = activityHandler22;
        int i4 = 2 % 2;
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) this.MediaMetadataCompat;
        if (continuationImpl instanceof SignInApplicantUseCase$invoke$1) {
            signInApplicantUseCase$invoke$1 = (SignInApplicantUseCase$invoke$1) continuationImpl;
            int i5 = signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = i5 - Integer.MIN_VALUE;
                int i6 = MediaSessionCompatQueueItem + 27;
                PlaybackStateCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                signInApplicantUseCase$invoke$1 = new SignInApplicantUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            signInApplicantUseCase$invoke$1 = new SignInApplicantUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = signInApplicantUseCase$invoke$1.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str3 = ((boundingRectInRoot) this.read).write().countryCode;
            H$b h$b = (H$b) this.MediaDescriptionCompat;
            String str4 = activityHandler23.accessToken;
            h$b.getClass();
            str4.getClass();
            try {
                String str5 = (String) hideCurrentlyDisplayingInAppMessage.serializer(str4, new String[]{"."}, 6).get(1);
                ((BrazeExternalSyntheticLambda5) h$b.serializer).getClass();
                str5.getClass();
                byte[] bArrDecode = Base64.decode(str5, 8);
                bArrDecode.getClass();
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                String str6 = new String(bArrDecode, charset);
                resetTransientState resettransientstate = (resetTransientState) ((isAdapterPositionOnScreen) h$b.write).MediaSessionCompatResultReceiverWrapper();
                resettransientstate.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = ActivityHandler25.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                isitemdismissable = (ActivityHandler25) resettransientstate.serializer(str6, setgraphicmodalmaxwidthdpSerializer);
            } catch (Exception e) {
                DecodingFailException decodingFailException = new DecodingFailException(e);
                Timber.RemoteActionCompatParcelizer.write(decodingFailException);
                isitemdismissable = new isItemDismissable(decodingFailException);
            }
            if (isitemdismissable instanceof isItemDismissable) {
                return isitemdismissable;
            }
            ActivityHandler25 activityHandler26 = (ActivityHandler25) isitemdismissable;
            SaveSignInDataUseCaseImpl saveSignInDataUseCaseImpl = (SaveSignInDataUseCaseImpl) this.MediaBrowserCompatMediaItem;
            String str7 = activityHandler21.write;
            String str8 = activityHandler21.read;
            int i9 = ActivityHandler24.RemoteActionCompatParcelizer[((verifyPlayStorePurchaseI) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(-383819351, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), 383819352, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) transfersessionpackagei})).ordinal()];
            if (i9 == 1) {
                str7 = str8;
            } else if (i9 != 2) {
                if (i9 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                if (str7 == null) {
                    str7 = str8;
                }
            } else if (str7 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("email should not be null");
                return null;
            }
            String str9 = activityHandler21.RemoteActionCompatParcelizer;
            signInApplicantUseCase$invoke$1.serializer = activityHandler23;
            signInApplicantUseCase$invoke$1.read = str3;
            signInApplicantUseCase$invoke$1.write = activityHandler26;
            i = 0;
            signInApplicantUseCase$invoke$1.IconCompatParcelizer = 0;
            signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer = 0;
            signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = 1;
            if (saveSignInDataUseCaseImpl.invoke(str7, str9, signInApplicantUseCase$invoke$1) != coroutineSingletons) {
                str = str3;
                i2 = 0;
                activityHandler25 = activityHandler26;
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            i2 = signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer;
            int i10 = signInApplicantUseCase$invoke$1.IconCompatParcelizer;
            activityHandler25 = signInApplicantUseCase$invoke$1.write;
            str = signInApplicantUseCase$invoke$1.read;
            ActivityHandler22 activityHandler24 = signInApplicantUseCase$invoke$1.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            i = i10;
            activityHandler23 = activityHandler24;
        } else {
            if (i8 == 2) {
                i2 = signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer;
                i3 = signInApplicantUseCase$invoke$1.IconCompatParcelizer;
                str2 = signInApplicantUseCase$invoke$1.MediaMetadataCompat;
                str = signInApplicantUseCase$invoke$1.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((isOnline) this.RemoteActionCompatParcelizer).serializer(str2, str);
                appEventInfoChangeHandler = (AppEventInfoChangeHandler) this.IconCompatParcelizer;
                r4 = 0;
                signInApplicantUseCase$invoke$1.serializer = null;
                signInApplicantUseCase$invoke$1.read = null;
                signInApplicantUseCase$invoke$1.write = null;
                signInApplicantUseCase$invoke$1.MediaMetadataCompat = null;
                signInApplicantUseCase$invoke$1.IconCompatParcelizer = i3;
                signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer = i2;
                signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = 3;
                if (appEventInfoChangeHandler.refreshUserInfo(signInApplicantUseCase$invoke$1) != coroutineSingletons) {
                    fetchRemoteConfigUseCaseImpl = (FetchRemoteConfigUseCaseImpl) this.write;
                    signInApplicantUseCase$invoke$1.serializer = r4;
                    signInApplicantUseCase$invoke$1.read = r4;
                    signInApplicantUseCase$invoke$1.write = r4;
                    signInApplicantUseCase$invoke$1.MediaMetadataCompat = r4;
                    signInApplicantUseCase$invoke$1.IconCompatParcelizer = i3;
                    signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer = i2;
                    signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = 4;
                    if (fetchRemoteConfigUseCaseImpl.m5013invokegIAlus(true, signInApplicantUseCase$invoke$1) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            int i11 = MediaSessionCompatQueueItem + 75;
            PlaybackStateCompat = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0 ? i8 == 3 : i8 == 5) {
                i2 = signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer;
                i3 = signInApplicantUseCase$invoke$1.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                transfersessionpackagei = transfersessionpackagei;
                r4 = 0;
                fetchRemoteConfigUseCaseImpl = (FetchRemoteConfigUseCaseImpl) this.write;
                signInApplicantUseCase$invoke$1.serializer = r4;
                signInApplicantUseCase$invoke$1.read = r4;
                signInApplicantUseCase$invoke$1.write = r4;
                signInApplicantUseCase$invoke$1.MediaMetadataCompat = r4;
                signInApplicantUseCase$invoke$1.IconCompatParcelizer = i3;
                signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer = i2;
                signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = 4;
                if (fetchRemoteConfigUseCaseImpl.m5013invokegIAlus(true, signInApplicantUseCase$invoke$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i8 != 4) {
                if (i8 == 5) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer;
            i3 = signInApplicantUseCase$invoke$1.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((onItemDismiss) obj).getClass();
            transfersessionpackagei = transfersessionpackagei;
        }
        firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_PUSH_NOTIFICATION_FOR_APPLICANT_ENABLED)) {
            return createfromparcel;
        }
        int i12 = PlaybackStateCompat + 37;
        MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        registerPushNotificationUseCaseImpl = (RegisterPushNotificationUseCaseImpl) this.RatingCompat;
        signInApplicantUseCase$invoke$1.serializer = null;
        signInApplicantUseCase$invoke$1.read = null;
        signInApplicantUseCase$invoke$1.write = null;
        signInApplicantUseCase$invoke$1.MediaMetadataCompat = null;
        signInApplicantUseCase$invoke$1.IconCompatParcelizer = i3;
        signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer = i2;
        signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = 5;
        if (registerPushNotificationUseCaseImpl.invoke(signInApplicantUseCase$invoke$1) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return createfromparcel;
        String strValueOf = String.valueOf(activityHandler25.userId);
        isOffline isoffline = (isOffline) this.serializer;
        ActivityHandler45 activityHandler45 = new ActivityHandler45(activityHandler25.expiry, activityHandler23.accessToken, activityHandler23.refreshToken, activityHandler23.deviceToken, str, strValueOf);
        signInApplicantUseCase$invoke$1.serializer = null;
        signInApplicantUseCase$invoke$1.read = str;
        signInApplicantUseCase$invoke$1.write = null;
        signInApplicantUseCase$invoke$1.MediaMetadataCompat = strValueOf;
        signInApplicantUseCase$invoke$1.IconCompatParcelizer = i;
        signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer = i2;
        signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = 2;
        Object objStoreApplicantData = isoffline.RemoteActionCompatParcelizer.storeApplicantData(activityHandler45, signInApplicantUseCase$invoke$1);
        if (objStoreApplicantData != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objStoreApplicantData = createfromparcel;
        }
        if (objStoreApplicantData != coroutineSingletons) {
            str2 = strValueOf;
            i3 = i;
            ((isOnline) this.RemoteActionCompatParcelizer).serializer(str2, str);
            appEventInfoChangeHandler = (AppEventInfoChangeHandler) this.IconCompatParcelizer;
            r4 = 0;
            signInApplicantUseCase$invoke$1.serializer = null;
            signInApplicantUseCase$invoke$1.read = null;
            signInApplicantUseCase$invoke$1.write = null;
            signInApplicantUseCase$invoke$1.MediaMetadataCompat = null;
            signInApplicantUseCase$invoke$1.IconCompatParcelizer = i3;
            signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer = i2;
            signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = 3;
            if (appEventInfoChangeHandler.refreshUserInfo(signInApplicantUseCase$invoke$1) != coroutineSingletons) {
                fetchRemoteConfigUseCaseImpl = (FetchRemoteConfigUseCaseImpl) this.write;
                signInApplicantUseCase$invoke$1.serializer = r4;
                signInApplicantUseCase$invoke$1.read = r4;
                signInApplicantUseCase$invoke$1.write = r4;
                signInApplicantUseCase$invoke$1.MediaMetadataCompat = r4;
                signInApplicantUseCase$invoke$1.IconCompatParcelizer = i3;
                signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer = i2;
                signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = 4;
                if (fetchRemoteConfigUseCaseImpl.m5013invokegIAlus(true, signInApplicantUseCase$invoke$1) != coroutineSingletons) {
                    firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                    firebaseRemoteConfigImpl.getClass();
                    if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_PUSH_NOTIFICATION_FOR_APPLICANT_ENABLED)) {
                        return createfromparcel;
                    }
                    int i14 = PlaybackStateCompat + 37;
                    MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    registerPushNotificationUseCaseImpl = (RegisterPushNotificationUseCaseImpl) this.RatingCompat;
                    signInApplicantUseCase$invoke$1.serializer = null;
                    signInApplicantUseCase$invoke$1.read = null;
                    signInApplicantUseCase$invoke$1.write = null;
                    signInApplicantUseCase$invoke$1.MediaMetadataCompat = null;
                    signInApplicantUseCase$invoke$1.IconCompatParcelizer = i3;
                    signInApplicantUseCase$invoke$1.RemoteActionCompatParcelizer = i2;
                    signInApplicantUseCase$invoke$1.MediaSessionCompatQueueItem = 5;
                    if (registerPushNotificationUseCaseImpl.invoke(signInApplicantUseCase$invoke$1) != coroutineSingletons) {
                        return createfromparcel;
                    }
                }
            }
        }
        return coroutineSingletons;
    }

    public i$c(int i) {
    }
}
