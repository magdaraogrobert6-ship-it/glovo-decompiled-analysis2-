package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatorMutex$mutate$2;
import androidx.compose.material3.TooltipStateImpl;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.YieldKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.applyMeasureResultfoundation;
import o.createFromParcel;
import o.getContentCaptureSessionui;
import o.getListIndexOrDefault;
import o.getListIndexValue;
import o.getRootAutofillId;
import o.getShouldOptInWhenPushAuthorizedandroid_sdk_base_release;
import o.getShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release;
import o.getSmallNotificationIconNameandroid_sdk_base_release;
import o.getTriggerActionMinimumTimeIntervalSecondsandroid_sdk_base_release;
import o.isAutomaticLocationCollectionEnabledandroid_sdk_base_release;
import o.isContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release;
import o.isDeviceObjectAllowlistEnabledandroid_sdk_base_release;
import o.isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release;
import o.isFirebaseMessagingServiceOnNewTokenRegistrationEnabledandroid_sdk_base_release;
import o.isGeofencesEnabledandroid_sdk_base_release;
import o.isHtmlInAppMessageApplyWindowInsetsEnabledandroid_sdk_base_release;
import o.isHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.isInAppMessageAccessibilityExclusiveModeEnabledandroid_sdk_base_release;
import o.isPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release;
import o.isSessionStartBasedTimeoutEnabledandroid_sdk_base_release;
import o.listValue;
import o.onShowTranslationui;
import o.populate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.setAutofillHints;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableState {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object MediaSessionCompatToken;
    public Object ParcelableVolumeInfo;
    public Object PlaybackStateCompat;
    public Object PlaybackStateCompatCustomAction;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public void IconCompatParcelizer(Object obj) {
        ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) this.MediaDescriptionCompat)).setValue(obj);
    }

    public listValue RemoteActionCompatParcelizer() {
        return (listValue) ((PopulateViewStructure_androidKtpopulate7) this.RemoteActionCompatParcelizer).getValue();
    }

    public float serializer() {
        return ((getContentCaptureSessionui) ((populate) this.PlaybackStateCompatCustomAction)).serializer();
    }

    public Object settle(float f, SuspendLambda suspendLambda) {
        Object value = ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) this.MediaDescriptionCompat)).getValue();
        Object objWrite = write(read(), f, value);
        boolean zBooleanValue = ((Boolean) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.serializer).invoke(objWrite)).booleanValue();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (zBooleanValue) {
            Object objAnchoredDrag = anchoredDrag(objWrite, applyMeasureResultfoundation.Default, new AnchoredDraggableKt$animateTo$2(this, f, null), suspendLambda);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objAnchoredDrag != coroutineSingletons) {
                objAnchoredDrag = createfromparcel;
            }
            if (objAnchoredDrag == coroutineSingletons) {
                return objAnchoredDrag;
            }
        } else {
            Object objAnchoredDrag2 = anchoredDrag(value, applyMeasureResultfoundation.Default, new AnchoredDraggableKt$animateTo$2(this, f, null), suspendLambda);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objAnchoredDrag2 != coroutineSingletons2) {
                objAnchoredDrag2 = createfromparcel;
            }
            if (objAnchoredDrag2 == coroutineSingletons2) {
                return objAnchoredDrag2;
            }
        }
        return createfromparcel;
    }

    public Object write(float f, float f2, Object obj) {
        getRootAutofillId getrootautofillid = (getRootAutofillId) this.ParcelableVolumeInfo;
        listValue listvalueRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        float f3 = listvalueRemoteActionCompatParcelizer.read(obj);
        float fFloatValue = ((Number) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.PlaybackStateCompat).invoke()).floatValue();
        if (f3 != f && !Float.isNaN(f3)) {
            if (f3 < f) {
                if (f2 >= fFloatValue) {
                    Object objWrite = listvalueRemoteActionCompatParcelizer.write(f, true);
                    objWrite.getClass();
                    return objWrite;
                }
                Object objWrite2 = listvalueRemoteActionCompatParcelizer.write(f, true);
                objWrite2.getClass();
                if (f >= Math.abs(Math.abs(((Number) getrootautofillid.invoke(Float.valueOf(Math.abs(listvalueRemoteActionCompatParcelizer.read(objWrite2) - f3)))).floatValue()) + f3)) {
                    return objWrite2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objWrite3 = listvalueRemoteActionCompatParcelizer.write(f, false);
                    objWrite3.getClass();
                    return objWrite3;
                }
                Object objWrite4 = listvalueRemoteActionCompatParcelizer.write(f, false);
                objWrite4.getClass();
                float fAbs = Math.abs(f3 - Math.abs(((Number) getrootautofillid.invoke(Float.valueOf(Math.abs(f3 - listvalueRemoteActionCompatParcelizer.read(objWrite4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objWrite4;
                }
            }
        }
        return obj;
    }

    public isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release write() {
        int i = ((isInAppMessageAccessibilityExclusiveModeEnabledandroid_sdk_base_release) this.ParcelableVolumeInfo) != null ? 1 : 0;
        if (((isHtmlInAppMessageApplyWindowInsetsEnabledandroid_sdk_base_release) this.PlaybackStateCompat) != null) {
            i++;
        }
        if (((isSessionStartBasedTimeoutEnabledandroid_sdk_base_release) this.IconCompatParcelizer) != null) {
            i++;
        }
        if (((isHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) this.serializer) != null) {
            i++;
        }
        if (((getTriggerActionMinimumTimeIntervalSecondsandroid_sdk_base_release) this.MediaBrowserCompatMediaItem) != null) {
            i++;
        }
        if (((getShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release) this.MediaMetadataCompat) != null) {
            i++;
        }
        if (((isGeofencesEnabledandroid_sdk_base_release) this.MediaDescriptionCompat) != null) {
            i++;
        }
        if (((isFirebaseMessagingServiceOnNewTokenRegistrationEnabledandroid_sdk_base_release) this.MediaSessionCompatQueueItem) != null) {
            i++;
        }
        if (((getSmallNotificationIconNameandroid_sdk_base_release) this.RemoteActionCompatParcelizer) != null) {
            i++;
        }
        if (((isDeviceObjectAllowlistEnabledandroid_sdk_base_release) this.MediaSessionCompatToken) != null) {
            i++;
        }
        if (((getShouldOptInWhenPushAuthorizedandroid_sdk_base_release) this.write) != null) {
            i++;
        }
        if (((isContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release) this.PlaybackStateCompatCustomAction) != null) {
            i++;
        }
        if (((isPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release) this.RatingCompat) != null) {
            i++;
        }
        if (((isAutomaticLocationCollectionEnabledandroid_sdk_base_release) this.read) != null) {
            i++;
        }
        if (i == 1) {
            return new isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Invalid union; ", " field(s) were set"));
        return null;
    }

    public void write(Object obj) {
        ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) this.MediaSessionCompatQueueItem)).setValue(obj);
    }

    public float RemoteActionCompatParcelizer(float f) {
        Float fValueOf;
        float fSerializer = Float.isNaN(serializer()) ? 0.0f : serializer();
        float f2 = RemoteActionCompatParcelizer().read();
        Collection collectionValues = RemoteActionCompatParcelizer().serializer.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return RangesKt.write(fSerializer + f, f2, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public Object anchoredDrag(Object obj, applyMeasureResultfoundation applymeasureresultfoundation, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, ShortNewsContentCardView shortNewsContentCardView) {
        getListIndexValue getlistindexvalue;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.serializer;
        if (shortNewsContentCardView instanceof getListIndexValue) {
            getlistindexvalue = (getListIndexValue) shortNewsContentCardView;
            int i = getlistindexvalue.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                getlistindexvalue.write = i - Integer.MIN_VALUE;
            } else {
                getlistindexvalue = new getListIndexValue(this, shortNewsContentCardView);
            }
        } else {
            getlistindexvalue = new getListIndexValue(this, shortNewsContentCardView);
        }
        getListIndexValue getlistindexvalue2 = getlistindexvalue;
        Object obj2 = getlistindexvalue2.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getlistindexvalue2.write;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                if (RemoteActionCompatParcelizer().serializer.containsKey(obj)) {
                    setAutofillHints setautofillhints = (setAutofillHints) this.MediaBrowserCompatMediaItem;
                    TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, obj, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, null, 2);
                    getlistindexvalue2.write = 1;
                    setautofillhints.getClass();
                    if (YieldKt.coroutineScope(new MutatorMutex$mutate$2(applymeasureresultfoundation, (Object) setautofillhints, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) anonymousClass2, (ShortNewsContentCardView) null, 2), getlistindexvalue2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    IconCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            }
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            write(null);
            Object objSerializer = RemoteActionCompatParcelizer().serializer(serializer());
            if (objSerializer != null && Math.abs(serializer() - RemoteActionCompatParcelizer().read(objSerializer)) <= 0.5f && ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objSerializer)).booleanValue()) {
                IconCompatParcelizer(objSerializer);
            }
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            write(null);
            Object objSerializer2 = RemoteActionCompatParcelizer().serializer(serializer());
            if (objSerializer2 != null && Math.abs(serializer() - RemoteActionCompatParcelizer().read(objSerializer2)) <= 0.5f && ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objSerializer2)).booleanValue()) {
                IconCompatParcelizer(objSerializer2);
            }
            throw th;
        }
    }

    public float read() {
        if (!Float.isNaN(serializer())) {
            return serializer();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public Object anchoredDrag(applyMeasureResultfoundation applymeasureresultfoundation, AnchoredDraggableState$draggableState$1$drag$2 anchoredDraggableState$draggableState$1$drag$2, ContinuationImpl continuationImpl) {
        getListIndexOrDefault getlistindexordefault;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.serializer;
        if (continuationImpl instanceof getListIndexOrDefault) {
            getlistindexordefault = (getListIndexOrDefault) continuationImpl;
            int i = getlistindexordefault.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getlistindexordefault.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getlistindexordefault = new getListIndexOrDefault(this, continuationImpl);
            }
        } else {
            getlistindexordefault = new getListIndexOrDefault(this, continuationImpl);
        }
        Object obj = getlistindexordefault.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getlistindexordefault.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                setAutofillHints setautofillhints = (setAutofillHints) this.MediaBrowserCompatMediaItem;
                AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, anchoredDraggableState$draggableState$1$drag$2, shortNewsContentCardView, 4);
                getlistindexordefault.IconCompatParcelizer = 1;
                setautofillhints.getClass();
                if (YieldKt.coroutineScope(new MutatorMutex$mutate$2(applymeasureresultfoundation, (Object) setautofillhints, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) authRepository$logoutUser$2, (ShortNewsContentCardView) null, 2), getlistindexordefault) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            Object objSerializer = RemoteActionCompatParcelizer().serializer(serializer());
            if (objSerializer != null && Math.abs(serializer() - RemoteActionCompatParcelizer().read(objSerializer)) <= 0.5f && ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objSerializer)).booleanValue()) {
                IconCompatParcelizer(objSerializer);
            }
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            Object objSerializer2 = RemoteActionCompatParcelizer().serializer(serializer());
            if (objSerializer2 != null && Math.abs(serializer() - RemoteActionCompatParcelizer().read(objSerializer2)) <= 0.5f && ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objSerializer2)).booleanValue()) {
                IconCompatParcelizer(objSerializer2);
            }
            throw th;
        }
    }
}
