package com.sentiance.sdk.configuration;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.LocationProvider;
import com.sentiance.core.model.thrift.ThriftBool;
import com.sentiance.core.model.thrift.TimeSeriesType;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.TransmittableDataType;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.feature.FeatureType;
import com.sentiance.sdk.payload.submission.SubmissionEvaluationConfig;
import com.sentiance.sdk.sensorstream.SensorType;
import com.sentiance.sdk.services.ServiceForegroundMode;
import com.sentiance.sdk.util.c;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda2;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import o.BannerExternalSyntheticLambda0;
import o.BrazeUserExternalSyntheticLambda28;
import o.GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2;
import o.createUriActionFromUri;
import o.getAnalyticsEnabledEnterannotations;
import o.getBannerIdannotations;
import o.getBrazeSdkMetadataandroid_sdk_base_release;
import o.getDefaultNotificationChannelDescriptionandroid_sdk_base_release;
import o.getDefaultNotificationChannelNameandroid_sdk_base_release;
import o.getIntentFlags;
import o.getNotificationCategory;
import o.getVerticalAccuracy;
import o.initializeGeofenceslambda1;
import o.migratePushDeliveryEventsToJsonlambda20;
import o.migrateSealedSessionsMapToJsonlambda0;
import o.parseLonglambda0;
import o.r8lambda1MNczrzuv4oWduWgKg6cjtSWs;
import o.r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg;
import o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q;
import o.r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg;
import o.r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM;
import o.r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0;
import o.r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8;
import o.r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls;
import o.requestBannersRefreshdefault;
import o.retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release;
import o.retrieveRegisteredGeofencesFromLocalStoragelambda0;
import o.setCustomAttribute;
import o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release;
import o.setCustomLocationProviderNames;
import o.setCustomUserAttribute;
import o.setCustomUserAttributeToSecondsFromEpochlambda0;
import o.setDateOfBirthlambda0;
import o.setDefaultNotificationChannelNamelambda0;
import o.setEmaillambda0;
import o.setEmaillambda20;
import o.setHomeCity;
import o.setHomeCitylambda1;
import o.setLocationCustomAttributelambda0;
import o.setPhoneNumberlambda20;
import o.unsetCustomUserAttributelambda0;
import o.unsetLocationCustomAttributelambda0;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "ConfigurationManager", componentName = "ConfigurationManager")
public class ConfigurationManager implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q, getNotificationCategory {
    private static final List<Byte> IconCompatParcelizer;
    private static final List<Byte> MediaBrowserCompatMediaItem;
    private static final List<String> MediaDescriptionCompat;
    private static final List<Byte> MediaMetadataCompat;
    private static final List<LocationProvider> RatingCompat;
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    private static final List<Byte> read;
    private static final Map<SensorType, Short> serializer;
    private static final long write;
    private final c ComponentActivity;
    private final Context MediaSessionCompatQueueItem;
    private final retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release MediaSessionCompatResultReceiverWrapper;
    private final GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2 MediaSessionCompatToken;
    private final getAnalyticsEnabledEnterannotations ParcelableVolumeInfo;
    private final parseLonglambda0 PlaybackStateCompat;
    private final getVerticalAccuracy PlaybackStateCompatCustomAction;
    private final r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg ResultReceiver;
    private File r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final retrieveRegisteredGeofencesFromLocalStoragelambda0 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final initializeGeofenceslambda1 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private setEmaillambda0 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    private setEmaillambda0 addOnPictureInPictureModeChangedListener() {
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null) {
                return setemaillambda0;
            }
            File activityResultRegistry = getActivityResultRegistry();
            setEmaillambda0 setemaillambda0Serializer = activityResultRegistry.exists() ? (setEmaillambda0) this.PlaybackStateCompatCustomAction.write(setEmaillambda0.read, activityResultRegistry).RemoteActionCompatParcelizer() : null;
            if (setemaillambda0Serializer == null) {
                setemaillambda0Serializer = enterPictureInPictureMode();
            }
            if (setemaillambda0Serializer == null) {
                setemaillambda0Serializer = addOnUserLeaveHintListener().serializer();
            }
            return setemaillambda0Serializer;
        }
    }

    private void addOnPictureInPictureUiStateChangedListener() {
        Boolean bool;
        synchronized (this) {
            if (this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer().RemoteActionCompatParcelizer()) {
                return;
            }
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer((setemaillambda0 == null || (bool = setemaillambda0.MediaBrowserCompatMediaItem) == null) ? migratePushDeliveryEventsToJsonlambda20.a(Boolean.valueOf(this.ResultReceiver.MediaDescriptionCompat())) : migratePushDeliveryEventsToJsonlambda20.a(bool));
        }
    }

    public final int ComponentActivity() {
        Short sh;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (sh = setemaillambda0.addOnMultiWindowModeChangedListener) != null) {
                return sh.shortValue();
            }
            return this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer().read() ? 120 : 60;
        }
    }

    public final byte IconCompatParcelizer() {
        BrazeUserExternalSyntheticLambda28 brazeUserExternalSyntheticLambda28;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (brazeUserExternalSyntheticLambda28 = setemaillambda0.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != null) {
                return brazeUserExternalSyntheticLambda28.write.byteValue();
            }
            return (byte) 5;
        }
    }

    public final int MediaDescriptionCompat() {
        BrazeUserExternalSyntheticLambda28 brazeUserExternalSyntheticLambda28;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (brazeUserExternalSyntheticLambda28 = setemaillambda0.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != null) {
                return brazeUserExternalSyntheticLambda28.read.shortValue();
            }
            return 10;
        }
    }

    public final ArrayList MediaMetadataCompat() {
        ArrayList arrayListIconCompatParcelizer;
        synchronized (this) {
            arrayListIconCompatParcelizer = IconCompatParcelizer(addOnPictureInPictureModeChangedListener().menuHostHelperlambda0);
        }
        return arrayListIconCompatParcelizer;
    }

    public final List<Integer> MediaSessionCompatQueueItem() {
        r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg = setemaillambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
                return r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg.write;
            }
            return Collections.EMPTY_LIST;
        }
    }

    public final Short MediaSessionCompatResultReceiverWrapper() {
        setCustomUserAttributeToSecondsFromEpochlambda0 setcustomuserattributetosecondsfromepochlambda0;
        Short sh;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 == null || (setcustomuserattributetosecondsfromepochlambda0 = setemaillambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) == null || (sh = setcustomuserattributetosecondsfromepochlambda0.write) == null) {
                return null;
            }
            return sh;
        }
    }

    public final int PlaybackStateCompatCustomAction() {
        setCustomUserAttributeToSecondsFromEpochlambda0 setcustomuserattributetosecondsfromepochlambda0;
        Short sh;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (setcustomuserattributetosecondsfromepochlambda0 = setemaillambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null && (sh = setcustomuserattributetosecondsfromepochlambda0.serializer) != null) {
                return sh.shortValue();
            }
            return 1;
        }
    }

    public final short RatingCompat() {
        setEmaillambda20 setemaillambda20;
        Short sh;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release = (setemaillambda0 == null || (setemaillambda20 = setemaillambda0._init_lambda1) == null) ? null : setemaillambda20.IconCompatParcelizer;
            if (setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release != null && (sh = setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release.IconCompatParcelizer) != null) {
                return sh.shortValue();
            }
            return (short) 10;
        }
    }

    public final boolean RatingCompat(byte b) {
        boolean z;
        synchronized (this) {
            z = MediaBrowserCompatMediaItem(b) != null;
        }
        return z;
    }

    public final getBrazeSdkMetadataandroid_sdk_base_release RemoteActionCompatParcelizer(byte b) {
        setCustomUserAttributeToSecondsFromEpochlambda0 setcustomuserattributetosecondsfromepochlambda0;
        Map map;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (setcustomuserattributetosecondsfromepochlambda0 = setemaillambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null && (map = setcustomuserattributetosecondsfromepochlambda0.RemoteActionCompatParcelizer) != null) {
                getBrazeSdkMetadataandroid_sdk_base_release getbrazesdkmetadataandroid_sdk_base_release = (getBrazeSdkMetadataandroid_sdk_base_release) map.get(Byte.valueOf(b));
                getBrazeSdkMetadataandroid_sdk_base_release getbrazesdkmetadataandroid_sdk_base_release2 = (getBrazeSdkMetadataandroid_sdk_base_release) this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer.get((byte) 0);
                if (getbrazesdkmetadataandroid_sdk_base_release == null) {
                    getbrazesdkmetadataandroid_sdk_base_release = getbrazesdkmetadataandroid_sdk_base_release2;
                }
                return getbrazesdkmetadataandroid_sdk_base_release;
            }
            return null;
        }
    }

    public final short RemoteActionCompatParcelizer() {
        setEmaillambda20 setemaillambda20;
        Short sh;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release = (setemaillambda0 == null || (setemaillambda20 = setemaillambda0._init_lambda1) == null) ? null : setemaillambda20.IconCompatParcelizer;
            if (setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release != null && (sh = setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release.write) != null) {
                return sh.shortValue();
            }
            return (short) 3;
        }
    }

    public final void RemoteActionCompatParcelizer(setEmaillambda0 setemaillambda0, Long l) {
        synchronized (this) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = setemaillambda0;
            if (setemaillambda0 == null) {
                this.PlaybackStateCompat.IconCompatParcelizer("Configuration saved: null", new Object[0]);
            } else if (this.PlaybackStateCompatCustomAction.read(setEmaillambda0.read, setemaillambda0, getActivityResultRegistry(), false)) {
                if (l != null) {
                    this.ComponentActivity.read(l.longValue(), "last_modified_time");
                    this.PlaybackStateCompat.IconCompatParcelizer("Configuration last updated time: %d, stored in cache", l);
                }
                this.PlaybackStateCompat.IconCompatParcelizer("Configuration saved configuration: %s", write(setemaillambda0));
            } else {
                this.PlaybackStateCompat.RemoteActionCompatParcelizer("Failed to store configuration", new Object[0]);
            }
        }
        addOnPictureInPictureUiStateChangedListener();
        this.ParcelableVolumeInfo.IconCompatParcelizer(ControlMessage.CONFIGURATION_UPDATED, (Object) null);
    }

    public final Set<TransmittableDataType> ResultReceiver() {
        Set<TransmittableDataType> setIconCompatParcelizer;
        synchronized (this) {
            setIconCompatParcelizer = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer();
        }
        return setIconCompatParcelizer;
    }

    public final EnumMap _init_lambda1() {
        SubmissionEvaluationConfig.Category category;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && setemaillambda0.addOnUserLeaveHintListener != null) {
                EnumMap enumMap = new EnumMap(SubmissionEvaluationConfig.Category.class);
                for (Map.Entry entry : this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.addOnUserLeaveHintListener.entrySet()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        String strIconCompatParcelizer = IconCompatParcelizer(((Byte) it.next()).byteValue());
                        if (strIconCompatParcelizer != null) {
                            arrayList.add(strIconCompatParcelizer);
                        }
                    }
                    byte bByteValue = ((Byte) entry.getKey()).byteValue();
                    if (bByteValue == 0) {
                        category = SubmissionEvaluationConfig.Category.REALTIME_ONLY;
                    } else if (bByteValue == 1) {
                        category = SubmissionEvaluationConfig.Category.REALTIME_PREFERRED;
                    } else if (bByteValue != 2) {
                        category = bByteValue != 3 ? null : SubmissionEvaluationConfig.Category.ASYNCHRONOUS;
                    } else {
                        category = SubmissionEvaluationConfig.Category.REALTIME_NON_BLOCKING;
                    }
                    if (category != null) {
                        enumMap.put(category, arrayList);
                    }
                }
                return enumMap;
            }
            return null;
        }
    }

    public final boolean _init_lambda4() {
        Boolean bool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (bool = setemaillambda0.PlaybackStateCompat) != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public final boolean accessensureViewModelStore() {
        r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8 r8lambdacmobxhcmrg5haij_oobybfwnnj8;
        ThriftBool thriftBool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdacmobxhcmrg5haij_oobybfwnnj8 = setemaillambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null && (thriftBool = r8lambdacmobxhcmrg5haij_oobybfwnnj8.IconCompatParcelizer) != null && thriftBool != ThriftBool.UNSET) {
                return thriftBool == ThriftBool.TRUE;
            }
            return true;
        }
    }

    public final boolean addContentView() {
        r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM r8lambdaimixhbmm7et76wgigmzc6zxqum;
        Boolean bool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdaimixhbmm7et76wgigmzc6zxqum = setemaillambda0.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) != null && (bool = r8lambdaimixhbmm7et76wgigmzc6zxqum.IconCompatParcelizer) != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public final Long addMenuProvider() {
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 == null) {
                return null;
            }
            Byte b = setemaillambda0.onBackPressedDispatcher_delegatelambda0;
            if (b == null) {
                return null;
            }
            return Long.valueOf(TimeUnit.MINUTES.toMillis(((long) b.byteValue()) * 15));
        }
    }

    public final boolean addObserverForBackInvoker() {
        createUriActionFromUri createuriactionfromuri;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (createuriactionfromuri = setemaillambda0.ResultReceiver) != null) {
                return createuriactionfromuri.read.booleanValue();
            }
            return false;
        }
    }

    public final Long addObserverForBackInvokerlambda0() {
        synchronized (this) {
            long jIconCompatParcelizer = this.ComponentActivity.IconCompatParcelizer("last_modified_time", -1L);
            if (jIconCompatParcelizer != -1) {
                return Long.valueOf(jIconCompatParcelizer);
            }
            return null;
        }
    }

    public final boolean addOnConfigurationChangedListener() {
        r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg;
        setDefaultNotificationChannelNamelambda0 setdefaultnotificationchannelnamelambda0;
        Boolean bool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg = setemaillambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null && (setdefaultnotificationchannelnamelambda0 = r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg.read) != null && (bool = setdefaultnotificationchannelnamelambda0.IconCompatParcelizer) != null) {
                return bool.booleanValue();
            }
            return true;
        }
    }

    public final boolean addOnContextAvailableListener() {
        r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM r8lambdaimixhbmm7et76wgigmzc6zxqum;
        Boolean bool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdaimixhbmm7et76wgigmzc6zxqum = setemaillambda0.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) != null && (bool = r8lambdaimixhbmm7et76wgigmzc6zxqum.serializer) != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public final Byte addOnMultiWindowModeChangedListener() {
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 == null) {
                return null;
            }
            Byte b = setemaillambda0.addContentView;
            if (b == null) {
                return null;
            }
            return b;
        }
    }

    public final boolean addOnNewIntentListener() {
        r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg;
        setDefaultNotificationChannelNamelambda0 setdefaultnotificationchannelnamelambda0;
        Boolean bool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg = setemaillambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null && (setdefaultnotificationchannelnamelambda0 = r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg.read) != null && (bool = setdefaultnotificationchannelnamelambda0.read) != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        synchronized (this) {
            getActivityResultRegistry().delete();
            this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer();
            this.ComponentActivity.read();
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
        }
    }

    public final boolean createFullyDrawnExecutor() {
        r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8 r8lambdacmobxhcmrg5haij_oobybfwnnj8;
        ThriftBool thriftBool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdacmobxhcmrg5haij_oobybfwnnj8 = setemaillambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null && (thriftBool = r8lambdacmobxhcmrg5haij_oobybfwnnj8.write) != null && thriftBool != ThriftBool.UNSET) {
                return thriftBool == ThriftBool.TRUE;
            }
            return true;
        }
    }

    public final Boolean defaultViewModelProviderFactory_delegatelambda0() {
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 == null) {
                return null;
            }
            return setemaillambda0.onBackPressedInput_delegatelambda0;
        }
    }

    public final boolean ensureViewModelStore() {
        r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8 r8lambdacmobxhcmrg5haij_oobybfwnnj8;
        ThriftBool thriftBool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdacmobxhcmrg5haij_oobybfwnnj8 = setemaillambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null && (thriftBool = r8lambdacmobxhcmrg5haij_oobybfwnnj8.MediaDescriptionCompat) != null && thriftBool != ThriftBool.UNSET) {
                return thriftBool == ThriftBool.TRUE;
            }
            return true;
        }
    }

    public final double fullyDrawnReporter_delegatelambda0() {
        Byte b;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (b = setemaillambda0.RatingCompat) != null && b.byteValue() != 0) {
                return ((double) this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RatingCompat.byteValue()) / 100.0d;
            }
            return 0.1d;
        }
    }

    public final boolean fullyDrawnReporter_delegatelambda00() {
        r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8 r8lambdacmobxhcmrg5haij_oobybfwnnj8;
        ThriftBool thriftBool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdacmobxhcmrg5haij_oobybfwnnj8 = setemaillambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null && (thriftBool = r8lambdacmobxhcmrg5haij_oobybfwnnj8.MediaBrowserCompatMediaItem) != null && thriftBool != ThriftBool.UNSET) {
                return thriftBool == ThriftBool.TRUE;
            }
            return false;
        }
    }

    public final List<Integer> getOnBackPressedInput() {
        setCustomAttribute setcustomattribute;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (setcustomattribute = setemaillambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) != null && setcustomattribute.read != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Short) it.next()).shortValue()));
                }
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
    }

    public final boolean menuHostHelperlambda0() {
        r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8 r8lambdacmobxhcmrg5haij_oobybfwnnj8;
        ThriftBool thriftBool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdacmobxhcmrg5haij_oobybfwnnj8 = setemaillambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null && (thriftBool = r8lambdacmobxhcmrg5haij_oobybfwnnj8.serializer) != null && thriftBool != ThriftBool.UNSET) {
                return thriftBool == ThriftBool.TRUE;
            }
            return true;
        }
    }

    public final setHomeCitylambda1 onBackPressedDispatcher_delegatelambda0() {
        setHomeCitylambda1 sethomecitylambda1;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            sethomecitylambda1 = setemaillambda0 == null ? null : setemaillambda0.addOnPictureInPictureUiStateChangedListener;
        }
        return sethomecitylambda1;
    }

    public final boolean onBackPressedDispatcher_delegatelambda00() {
        unsetCustomUserAttributelambda0 unsetcustomuserattributelambda0;
        Boolean bool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (unsetcustomuserattributelambda0 = setemaillambda0.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) != null && (bool = unsetcustomuserattributelambda0.RemoteActionCompatParcelizer) != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public final long onBackPressedDispatcher_delegatelambda010() {
        setCustomUserAttribute setcustomuserattribute;
        Short sh;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (setcustomuserattribute = setemaillambda0.write) != null && (sh = setcustomuserattribute.MediaSessionCompatQueueItem) != null) {
                return ((long) sh.shortValue()) * 1000;
            }
            return 900000L;
        }
    }

    public final short r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        Short sh;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (sh = setemaillambda0.MediaSessionCompatToken) != null) {
                return sh.shortValue();
            }
            return (short) 63;
        }
    }

    public final long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        setCustomUserAttribute setcustomuserattribute;
        Short sh;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (setcustomuserattribute = setemaillambda0.write) != null && (sh = setcustomuserattribute.RatingCompat) != null) {
                return ((long) sh.shortValue()) * 1000;
            }
            return 180000L;
        }
    }

    public final boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        setEmaillambda20 setemaillambda20;
        Short sh;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release = (setemaillambda0 == null || (setemaillambda20 = setemaillambda0._init_lambda1) == null) ? null : setemaillambda20.IconCompatParcelizer;
            if (setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release != null && (sh = setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release.write) != null) {
                return sh.shortValue() > 0;
            }
            return false;
        }
    }

    public final ArrayList r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        ArrayList arrayListIconCompatParcelizer;
        synchronized (this) {
            arrayListIconCompatParcelizer = IconCompatParcelizer(addOnPictureInPictureModeChangedListener().addObserverForBackInvokerlambda0);
        }
        return arrayListIconCompatParcelizer;
    }

    public final boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
        r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8 r8lambdacmobxhcmrg5haij_oobybfwnnj8;
        ThriftBool thriftBool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdacmobxhcmrg5haij_oobybfwnnj8 = setemaillambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null && (thriftBool = r8lambdacmobxhcmrg5haij_oobybfwnnj8.read) != null && thriftBool != ThriftBool.UNSET) {
                return thriftBool == ThriftBool.TRUE;
            }
            return false;
        }
    }

    public final boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        setPhoneNumberlambda20 setphonenumberlambda20;
        Boolean bool;
        setEmaillambda20 setemaillambda20;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 == null || (setemaillambda20 = setemaillambda0._init_lambda1) == null || (setphonenumberlambda20 = setemaillambda20.RemoteActionCompatParcelizer) == null) {
                setphonenumberlambda20 = null;
            }
            if (setphonenumberlambda20 != null && (bool = setphonenumberlambda20.RemoteActionCompatParcelizer) != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public final boolean r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
        Boolean bool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (bool = setemaillambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public final int read() {
        setCustomAttribute setcustomattribute;
        Byte b;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (setcustomattribute = setemaillambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) != null && (b = setcustomattribute.serializer) != null) {
                return b.byteValue();
            }
            return 14;
        }
    }

    public final byte serializer() {
        BrazeUserExternalSyntheticLambda28 brazeUserExternalSyntheticLambda28;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (brazeUserExternalSyntheticLambda28 = setemaillambda0.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != null) {
                return brazeUserExternalSyntheticLambda28.serializer.byteValue();
            }
            return (byte) 5;
        }
    }

    public final String write() {
        getDefaultNotificationChannelDescriptionandroid_sdk_base_release getdefaultnotificationchanneldescriptionandroid_sdk_base_release;
        String str;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            return (setemaillambda0 == null || (getdefaultnotificationchanneldescriptionandroid_sdk_base_release = setemaillambda0.addOnConfigurationChangedListener) == null || (str = getdefaultnotificationchanneldescriptionandroid_sdk_base_release.MediaDescriptionCompat) == null) ? Constants.HIGH : str;
        }
    }

    @TargetApi
    public final List<SensorType> write(DetectionTrigger detectionTrigger) {
        List<SensorType> list;
        synchronized (this) {
            list = (List) serializer(detectionTrigger).keySet().stream().collect(Collectors.toList());
        }
        return list;
    }

    static {
        List<Byte> list = Collections.EMPTY_LIST;
        MediaBrowserCompatMediaItem = list;
        MediaMetadataCompat = list;
        RatingCompat = Arrays.asList(LocationProvider.GPS, LocationProvider.NETWORK);
        MediaDescriptionCompat = Arrays.asList(Constants.REFERRER_API_SAMSUNG, Constants.REFERRER_API_GOOGLE);
        HashMap<SensorType, Short> map = new HashMap<SensorType, Short>() { // from class: com.sentiance.sdk.configuration.ConfigurationManager.1
        };
        map.put(SensorType.ACCELEROMETER, (short) 25);
        map.put(SensorType.GYROSCOPE, (short) 25);
        serializer = map;
        IconCompatParcelizer = Collections.singletonList((byte) 0);
        read = Collections.singletonList((byte) 0);
        write = 300L;
    }

    private static setDateOfBirthlambda0 addOnUserLeaveHintListener() {
        setDateOfBirthlambda0 setdateofbirthlambda0 = new setDateOfBirthlambda0();
        setdateofbirthlambda0.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = Boolean.TRUE;
        setdateofbirthlambda0.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = "halt_indefinitely";
        Boolean bool = Boolean.FALSE;
        setdateofbirthlambda0._init_lambda4 = bool;
        setdateofbirthlambda0._init_lambda1 = bool;
        setdateofbirthlambda0._init_lambda2 = bool;
        setdateofbirthlambda0.addObserverForBackInvokerlambda0 = bool;
        List<Byte> list = MediaBrowserCompatMediaItem;
        if (list == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'wifi_eligible_payloads' cannot be null");
            return null;
        }
        setdateofbirthlambda0.addObserverForBackInvoker = list;
        setdateofbirthlambda0.serializer(MediaMetadataCompat);
        setdateofbirthlambda0.createFullyDrawnExecutor = (short) 2048;
        setdateofbirthlambda0.menuHostHelperlambda0 = (short) 30;
        setdateofbirthlambda0.getSavedStateRegistryControllerannotations = (short) 128;
        return setdateofbirthlambda0;
    }

    public final setEmaillambda0 ParcelableVolumeInfo() {
        return new setDateOfBirthlambda0(addOnPictureInPictureModeChangedListener()).serializer();
    }

    public final Short read(DetectionTrigger detectionTrigger) {
        Short sh;
        synchronized (this) {
            if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                return (short) 60;
            }
            getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat = MediaMetadataCompat(MediaSessionCompatQueueItem(detectionTrigger));
            if (getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat == null || (sh = getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat.MediaBrowserCompatMediaItem) == null) {
                return (short) 60;
            }
            return sh;
        }
    }

    public ConfigurationManager(Context context, parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg, GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2 googlePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, initializeGeofenceslambda1 initializegeofenceslambda1, retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0, retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, c cVar) {
        this.MediaSessionCompatQueueItem = context;
        this.PlaybackStateCompat = parselonglambda0;
        this.PlaybackStateCompatCustomAction = getverticalaccuracy;
        this.MediaSessionCompatToken = googlePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2;
        this.ParcelableVolumeInfo = getanalyticsenabledenterannotations;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = initializegeofenceslambda1;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = retrieveregisteredgeofencesfromlocalstoragelambda0;
        this.MediaSessionCompatResultReceiverWrapper = retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release;
        this.ResultReceiver = r8lambda7zcvodb3ypljdzjmgkbnvobyklg;
        this.ComponentActivity = cVar;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getActivityResultRegistry();
        File file = new File(context.getFilesDir(), "sentiance-config");
        if (file.exists()) {
            try {
                migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file, new File(context.getNoBackupFilesDir(), "sentiance-config"));
                file.delete();
            } catch (IOException unused) {
                this.PlaybackStateCompat.RemoteActionCompatParcelizer("Failed to copy config file to no-backup dir", new Object[0]);
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new File(this.MediaSessionCompatQueueItem.getFilesDir(), "sentiance-config");
            }
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = addOnPictureInPictureModeChangedListener();
        if (getActivityResultRegistry().exists()) {
            addOnPictureInPictureUiStateChangedListener();
        }
    }

    private getDefaultNotificationChannelNameandroid_sdk_base_release MediaMetadataCompat(byte b) {
        Map map;
        setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (setemaillambda0 == null || (map = setemaillambda0.getSavedStateRegistryControllerannotations) == null) {
            return null;
        }
        return (getDefaultNotificationChannelNameandroid_sdk_base_release) map.get(Byte.valueOf(b));
    }

    public final long MediaBrowserCompatMediaItem() {
        return ((long) addOnPictureInPictureModeChangedListener().fullyDrawnReporter_delegatelambda0.shortValue()) * 1048576;
    }

    public final long MediaSessionCompatToken() {
        setLocationCustomAttributelambda0 setlocationcustomattributelambda0;
        Short sh;
        setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        return (setemaillambda0 == null || (setlocationcustomattributelambda0 = setemaillambda0.defaultViewModelProviderFactory_delegatelambda0) == null || (sh = setlocationcustomattributelambda0.write) == null) ? write : sh.shortValue();
    }

    public final long PlaybackStateCompat() {
        setLocationCustomAttributelambda0 setlocationcustomattributelambda0;
        Short sh;
        setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (setemaillambda0 == null || (setlocationcustomattributelambda0 = setemaillambda0.defaultViewModelProviderFactory_delegatelambda0) == null || (sh = setlocationcustomattributelambda0.RemoteActionCompatParcelizer) == null) {
            return 20L;
        }
        return sh.shortValue();
    }

    public final boolean _init_lambda2() {
        setLocationCustomAttributelambda0 setlocationcustomattributelambda0;
        Boolean bool;
        setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (setemaillambda0 == null || (setlocationcustomattributelambda0 = setemaillambda0.defaultViewModelProviderFactory_delegatelambda0) == null || (bool = setlocationcustomattributelambda0.serializer) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final long getSavedStateRegistryControllerannotations() {
        return ((long) addOnPictureInPictureModeChangedListener().getOnBackPressedInput.shortValue()) * 1048576;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.singletonList(getActivityResultRegistry());
    }

    public final boolean onBackPressedInput_delegatelambda0() {
        Map map;
        setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (setemaillambda0 == null || (map = setemaillambda0.createFullyDrawnExecutor) == null || !map.containsKey("fg_service_in_bg")) {
            return false;
        }
        return "true".equalsIgnoreCase((String) map.get("fg_service_in_bg"));
    }

    public final Map<SensorType, Short> r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        setCustomLocationProviderNames setcustomlocationprovidernames;
        Map map;
        setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        return (setemaillambda0 == null || (setcustomlocationprovidernames = setemaillambda0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) == null || (map = setcustomlocationprovidernames.serializer) == null) ? Collections.EMPTY_MAP : (Map) map.entrySet().stream().collect(Collectors.toMap(new H3Core$$ExternalSyntheticLambda2(5), new H3Core$$ExternalSyntheticLambda2(3)));
    }

    public final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        return ((long) addOnPictureInPictureModeChangedListener().fullyDrawnReporter_delegatelambda00.shortValue()) * 1048576;
    }

    public final boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
        String str = addOnPictureInPictureModeChangedListener()._init_lambda4;
        boolean zStartsWith = str.startsWith("enable_sdk");
        parseLonglambda0 parselonglambda0 = this.PlaybackStateCompat;
        if (zStartsWith) {
            Matcher matcher = Pattern.compile("enable_sdk_at_version_([0-9]+\\.[0-9]+\\.[0-9]+)").matcher(str);
            String strGroup = (matcher.find() && matcher.groupCount() == 1) ? matcher.group(1) : null;
            if (strGroup != null) {
                try {
                    this.MediaSessionCompatToken.getClass();
                    if (read(strGroup) == -1) {
                    }
                } catch (IllegalArgumentException e) {
                    parselonglambda0.IconCompatParcelizer(false, e, "Invalid versions", new Object[0]);
                    return false;
                }
            }
            return false;
        }
        if (!str.equals("halt_indefinitely")) {
            parselonglambda0.write("Unknown kill switch action '%s'", str);
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private setEmaillambda0 enterPictureInPictureMode() {
        Context context = this.MediaSessionCompatQueueItem;
        byte b = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("flavorConfig", 0);
        String string = sharedPreferences.getString("flavor", null);
        sharedPreferences.edit().clear().apply();
        if (string == null || !Arrays.asList("full", "realtime_marketing", "offline_driving", "offline_segmentation", "triggered_trips").contains(string)) {
            this.PlaybackStateCompat.IconCompatParcelizer("Not converting flavor to SdkConfiguration (flavor=%s)", string);
            return null;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("killswitch", 0);
        String string2 = sharedPreferences2.getString("action", "halt_indefinitely");
        sharedPreferences2.edit().clear().apply();
        setDateOfBirthlambda0 setdateofbirthlambda0AddOnUserLeaveHintListener = addOnUserLeaveHintListener();
        Boolean bool = Boolean.TRUE;
        setdateofbirthlambda0AddOnUserLeaveHintListener.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = bool;
        if (string2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'killswitch' cannot be null");
            return null;
        }
        setdateofbirthlambda0AddOnUserLeaveHintListener.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = string2;
        switch (string.hashCode()) {
            case -1693489026:
                if (!string.equals("offline_segmentation")) {
                    b = -1;
                }
                break;
            case -1022780053:
                if (!string.equals("offline_driving")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -698848506:
                if (!string.equals("triggered_trips")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 3154575:
                if (!string.equals("full")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1568991314:
                if (!string.equals("realtime_marketing")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            setdateofbirthlambda0AddOnUserLeaveHintListener.serializer(Collections.EMPTY_LIST);
            Boolean bool2 = Boolean.FALSE;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda4 = bool2;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda1 = bool2;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda2 = bool2;
            setdateofbirthlambda0AddOnUserLeaveHintListener.addObserverForBackInvokerlambda0 = bool2;
        } else if (b == 1) {
            setdateofbirthlambda0AddOnUserLeaveHintListener.serializer(Collections.EMPTY_LIST);
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda4 = bool;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda1 = bool;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda2 = bool;
            setdateofbirthlambda0AddOnUserLeaveHintListener.addObserverForBackInvokerlambda0 = bool;
        } else if (b == 2) {
            setdateofbirthlambda0AddOnUserLeaveHintListener.serializer(Arrays.asList((byte) 2, (byte) 3, (byte) 11, (byte) 12));
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda4 = bool;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda1 = bool;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda2 = bool;
            setdateofbirthlambda0AddOnUserLeaveHintListener.addObserverForBackInvokerlambda0 = bool;
        } else if (b == 3) {
            setdateofbirthlambda0AddOnUserLeaveHintListener.serializer(addOnTrimMemoryListener());
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda4 = bool;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda1 = bool;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda2 = bool;
            setdateofbirthlambda0AddOnUserLeaveHintListener.addObserverForBackInvokerlambda0 = bool;
        } else if (b == 4) {
            setdateofbirthlambda0AddOnUserLeaveHintListener.serializer(addOnTrimMemoryListener());
            Boolean bool3 = Boolean.FALSE;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda4 = bool3;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda1 = bool3;
            setdateofbirthlambda0AddOnUserLeaveHintListener._init_lambda2 = bool3;
            setdateofbirthlambda0AddOnUserLeaveHintListener.addObserverForBackInvokerlambda0 = bool3;
        }
        return setdateofbirthlambda0AddOnUserLeaveHintListener.serializer();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public final boolean MediaBrowserCompatMediaItem(DetectionTrigger detectionTrigger) {
        boolean z;
        Boolean bool;
        synchronized (this) {
            boolean z2 = true;
            if (detectionTrigger != null) {
                try {
                    if (write(detectionTrigger).isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z = false;
            }
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (bool = setemaillambda0.onBackPressedDispatcher_delegatelambda010) != null) {
                if (detectionTrigger == null) {
                    return bool.booleanValue();
                }
                getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat = MediaMetadataCompat(MediaSessionCompatQueueItem(detectionTrigger));
                if (getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat != null && getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat.PlaybackStateCompatCustomAction != null) {
                    if (!this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.onBackPressedDispatcher_delegatelambda010.booleanValue() && !getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat.PlaybackStateCompatCustomAction.booleanValue()) {
                        z2 = false;
                    }
                    return z2;
                }
                return z;
            }
            return z;
        }
    }

    private File getActivityResultRegistry() {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new File(this.MediaSessionCompatQueueItem.getNoBackupFilesDir(), "sentiance-config");
        }
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public static String IconCompatParcelizer(byte b) {
        switch (b) {
            case 1:
                return FeedbackEvent.DRIVER_MODE_TRIP;
            case 2:
                return "device_info";
            case 3:
                return "metadata";
            case 4:
                return "tripEvent|trip_start";
            case 5:
                return "tripEvent|trip_end";
            case 6:
                return "tripEvent|waypoint";
            case 7:
                return "tripEvent|motion_activity_event";
            case 8:
                return "stationaryEvent|stationary_start";
            case 9:
                return "stationaryEvent|stationary_end";
            case 10:
                return "stationaryEvent|waypoint";
            case 11:
                return "sleep";
            case 12:
                return "externalEvent";
            case 13:
            case 14:
                return "offTheGridEvent";
            case 15:
            case 17:
            case 18:
            case 20:
            default:
                return null;
            case 16:
                return "tripEvent|crash";
            case 19:
                return "timeline";
            case 21:
                return "app_foreground_session";
            case 22:
                return "step_count";
            case 23:
                return "user_segments";
            case 24:
                return "sdk_reset";
            case 25:
                return "status_update";
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    private static LocationProvider RemoteActionCompatParcelizer(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != 102570) {
            if (iHashCode != 106069776) {
                if (iHashCode == 1843485230 && str.equals("network")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("other")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("gps")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b != 0) {
            return b != 1 ? LocationProvider.OTHER : LocationProvider.NETWORK;
        }
        return LocationProvider.GPS;
    }

    private setHomeCity MediaBrowserCompatMediaItem(byte b) {
        Map map;
        setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (setemaillambda0 == null || (map = setemaillambda0.ComponentActivity) == null) {
            return null;
        }
        return (setHomeCity) map.get(Byte.valueOf(b));
    }

    private static byte MediaSessionCompatQueueItem(DetectionTrigger detectionTrigger) {
        return detectionTrigger == DetectionTrigger.EXTERNAL ? (byte) 2 : (byte) 1;
    }

    public final Byte MediaSessionCompatQueueItem(byte b) {
        r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM r8lambdaimixhbmm7et76wgigmzc6zxqum;
        Map map;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdaimixhbmm7et76wgigmzc6zxqum = setemaillambda0.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) != null && (map = r8lambdaimixhbmm7et76wgigmzc6zxqum.read) != null) {
                return (Byte) map.get(Byte.valueOf(b));
            }
            return null;
        }
    }

    @TargetApi
    public final Map<SensorType, Short> serializer(DetectionTrigger detectionTrigger) {
        synchronized (this) {
            if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                return Collections.EMPTY_MAP;
            }
            getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat = MediaMetadataCompat(MediaSessionCompatQueueItem(detectionTrigger));
            if (getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat == null) {
                return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM._init_lambda3.booleanValue() ? serializer : Collections.EMPTY_MAP;
            }
            return read(getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat);
        }
    }

    public final boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
        boolean zIconCompatParcelizer;
        synchronized (this) {
            zIconCompatParcelizer = IconCompatParcelizer((Byte) (byte) 2);
        }
        return zIconCompatParcelizer;
    }

    public final requestBannersRefreshdefault IconCompatParcelizer(DetectionTrigger detectionTrigger) {
        synchronized (this) {
            if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                return null;
            }
            getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat = MediaMetadataCompat(MediaSessionCompatQueueItem(detectionTrigger));
            if (getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat == null) {
                return null;
            }
            return getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat.PlaybackStateCompat;
        }
    }

    public final boolean read(byte b) {
        List arrayList;
        boolean zContains;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && setemaillambda0.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != null) {
                arrayList = new ArrayList(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
            } else {
                arrayList = IconCompatParcelizer;
            }
            zContains = arrayList.contains(Byte.valueOf(b));
        }
        return zContains;
    }

    public final boolean MediaDescriptionCompat(byte b) {
        Set set;
        setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (setemaillambda0 == null || (set = setemaillambda0.MediaSessionCompatResultReceiverWrapper) == null) {
            return false;
        }
        return set.contains(Byte.valueOf(b));
    }

    public final r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 serializer(String str, DetectionTrigger detectionTrigger, boolean z) {
        boolean zBooleanValue;
        getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat;
        long millis = TimeUnit.SECONDS.toMillis(read(detectionTrigger).shortValue());
        ServiceForegroundMode serviceForegroundMode = MediaBrowserCompatMediaItem(detectionTrigger) ? ServiceForegroundMode.ENABLED : ServiceForegroundMode.O_ONLY;
        synchronized (this) {
            zBooleanValue = !write(detectionTrigger).isEmpty();
            if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null && (getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat = MediaMetadataCompat(MediaSessionCompatQueueItem(detectionTrigger))) != null) {
                Boolean bool = getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat.MediaMetadataCompat;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
        }
        return r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.read(str, millis, serviceForegroundMode, z, zBooleanValue, StartLocationFixRequest$Purpose.DETECTIONS);
    }

    public final Set<Byte> _init_lambda3() {
        Set<Byte> set;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            return (setemaillambda0 == null || (set = setemaillambda0._init_lambda2) == null) ? Collections.EMPTY_SET : set;
        }
    }

    public final boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        Boolean bool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (bool = setemaillambda0.RemoteActionCompatParcelizer) != null) {
                return bool.booleanValue();
            }
            String str = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write().read;
            return !MediaDescriptionCompat.contains(str == null ? "" : str.toLowerCase());
        }
    }

    public static ArrayList IconCompatParcelizer(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strIconCompatParcelizer = IconCompatParcelizer(((Byte) it.next()).byteValue());
            if (strIconCompatParcelizer != null) {
                arrayList.add(strIconCompatParcelizer);
            }
        }
        return arrayList;
    }

    private static List addOnTrimMemoryListener() {
        return Arrays.asList((byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 2, (byte) 3, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 19, (byte) 21, (byte) 23, (byte) 22);
    }

    public final boolean RemoteActionCompatParcelizer(DetectionTrigger detectionTrigger) {
        synchronized (this) {
            if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                return false;
            }
            getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat = MediaMetadataCompat(MediaSessionCompatQueueItem(detectionTrigger));
            if (getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat == null) {
                return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.ensureViewModelStore.booleanValue();
            }
            return getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat.write.booleanValue();
        }
    }

    private static setEmaillambda0 write(setEmaillambda0 setemaillambda0) {
        unsetLocationCustomAttributelambda0 unsetlocationcustomattributelambda0IconCompatParcelizer;
        unsetLocationCustomAttributelambda0 unsetlocationcustomattributelambda0;
        unsetLocationCustomAttributelambda0 unsetlocationcustomattributelambda1 = setemaillambda0.addOnPictureInPictureModeChangedListener;
        getIntentFlags getintentflags = setemaillambda0.PlaybackStateCompatCustomAction;
        getIntentFlags getintentflags2 = null;
        if (unsetlocationcustomattributelambda1 != null) {
            r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls(unsetlocationcustomattributelambda1);
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = "(redacted)";
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = "(redacted)";
            unsetlocationcustomattributelambda0IconCompatParcelizer = r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer();
        } else {
            unsetlocationcustomattributelambda0IconCompatParcelizer = null;
        }
        if (getintentflags != null && (unsetlocationcustomattributelambda0 = getintentflags.serializer) != null) {
            r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls2 = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls(unsetlocationcustomattributelambda0);
            r8lambdayc78smgbbb6fudfjq0u5z3_ls2.serializer = "(redacted)";
            r8lambdayc78smgbbb6fudfjq0u5z3_ls2.RemoteActionCompatParcelizer = "(redacted)";
            unsetLocationCustomAttributelambda0 unsetlocationcustomattributelambda0IconCompatParcelizer2 = r8lambdayc78smgbbb6fudfjq0u5z3_ls2.IconCompatParcelizer();
            r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
            Byte b = getintentflags.IconCompatParcelizer;
            r8lambda1mnczrzuv4owduwgkg6cjtsws.write = b;
            r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = unsetlocationcustomattributelambda0IconCompatParcelizer2;
            if (b != null) {
                getintentflags2 = new getIntentFlags(r8lambda1mnczrzuv4owduwgkg6cjtsws);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'zoom_level' is missing");
                return null;
            }
        }
        setDateOfBirthlambda0 setdateofbirthlambda0 = new setDateOfBirthlambda0(setemaillambda0);
        setdateofbirthlambda0.addOnMultiWindowModeChangedListener = unsetlocationcustomattributelambda0IconCompatParcelizer;
        setdateofbirthlambda0.PlaybackStateCompatCustomAction = getintentflags2;
        return setdateofbirthlambda0.serializer();
    }

    public final boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        Boolean bool;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (bool = setemaillambda0.addMenuProvider) != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public final BannerExternalSyntheticLambda0 read(String str, byte b) {
        setHomeCity sethomecityMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(b);
        if (sethomecityMediaBrowserCompatMediaItem == null) {
            return null;
        }
        Map map = sethomecityMediaBrowserCompatMediaItem.write;
        if (map.isEmpty()) {
            return null;
        }
        getBannerIdannotations getbanneridannotations = new getBannerIdannotations(str);
        for (Map.Entry entry : map.entrySet()) {
            short sShortValue = ((Short) entry.getValue()).shortValue();
            SensorType sensorTypeFromTimeSeriesType = SensorType.fromTimeSeriesType((TimeSeriesType) entry.getKey());
            if (sensorTypeFromTimeSeriesType != null) {
                getbanneridannotations.read(sensorTypeFromTimeSeriesType, sShortValue);
            }
        }
        return new BannerExternalSyntheticLambda0(getbanneridannotations);
    }

    @TargetApi
    private static Map read(getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_release) {
        int i = 1;
        Map map = (Map) getdefaultnotificationchannelnameandroid_sdk_base_release.MediaSessionCompatQueueItem.stream().collect(Collectors.toMap(new H3Core$$ExternalSyntheticLambda2(i), new H3Core$$ExternalSyntheticLambda3(i, getdefaultnotificationchannelnameandroid_sdk_base_release)));
        Map map2 = getdefaultnotificationchannelnameandroid_sdk_base_release.MediaSessionCompatResultReceiverWrapper;
        if (map2 == null) {
            return map;
        }
        map.putAll((Map) map2.entrySet().stream().collect(Collectors.toMap(new H3Core$$ExternalSyntheticLambda2(2), new H3Core$$ExternalSyntheticLambda2(3))));
        return map;
    }

    private int read(String str) throws IllegalArgumentException {
        Pattern patternCompile = Pattern.compile("([0-9]+)\\.([0-9]+)\\.([0-9]+)");
        Matcher matcher = patternCompile.matcher("6.27.1");
        Matcher matcher2 = patternCompile.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind && zFind2) {
            for (int i = 1; i <= 3; i++) {
                try {
                    int i2 = Integer.parseInt(matcher.group(i));
                    int i3 = Integer.parseInt(matcher2.group(i));
                    if (i2 < i3) {
                        return -1;
                    }
                    if (i2 > i3) {
                        return 1;
                    }
                    if (i == 3) {
                        return 0;
                    }
                } catch (NumberFormatException e) {
                    this.PlaybackStateCompat.IconCompatParcelizer(false, e, "Failed to parse versions: 6.27.1, ".concat(str), new Object[0]);
                }
            }
            Locale locale = Locale.US;
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Something went wrong trying to compare 6.27.1 and ".concat(str));
            return 0;
        }
        Locale locale2 = Locale.US;
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Both versions must consist of major, minor and patch levels (you supplied: '6.27.1' and '", str, "')"));
        return 0;
    }

    public static boolean serializer(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strIconCompatParcelizer = IconCompatParcelizer(((Byte) it.next()).byteValue());
            if (strIconCompatParcelizer != null && strIconCompatParcelizer.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 serializer(byte b) {
        synchronized (this) {
            setHomeCity sethomecityMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(b);
            if (sethomecityMediaBrowserCompatMediaItem == null) {
                return null;
            }
            return r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.read("AppForegroundSessionManager", sethomecityMediaBrowserCompatMediaItem.read.shortValue() * 1000, ServiceForegroundMode.ENABLED, true, true, StartLocationFixRequest$Purpose.OTHER);
        }
    }

    public final boolean write(FeatureType featureType) {
        synchronized (this) {
            if (featureType == FeatureType.DATA_COLLECTOR) {
                return true;
            }
            Byte thrift = featureType.toThrift();
            return thrift != null && IconCompatParcelizer(thrift);
        }
    }

    private boolean IconCompatParcelizer(Byte b) {
        Set set;
        if (b.byteValue() == 2) {
            getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat = MediaMetadataCompat(MediaSessionCompatQueueItem(DetectionTrigger.EXTERNAL));
            getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat2 = MediaMetadataCompat(MediaSessionCompatQueueItem(DetectionTrigger.SDK));
            if (getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat != null && getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat.IconCompatParcelizer.booleanValue()) {
                return true;
            }
            if (getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat2 != null && getdefaultnotificationchannelnameandroid_sdk_base_releaseMediaMetadataCompat2.IconCompatParcelizer.booleanValue()) {
                return true;
            }
        }
        setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (setemaillambda0 == null || (set = setemaillambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) == null) {
            return false;
        }
        return set.contains(b);
    }

    public final void RemoteActionCompatParcelizer(Set<TransmittableDataType> set) {
        synchronized (this) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read(set);
        }
    }

    public final boolean IconCompatParcelizer(String str) {
        List list;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (list = setemaillambda0.addOnNewIntentListener) != null) {
                return list.contains(RemoteActionCompatParcelizer(str));
            }
            return RatingCompat.contains(RemoteActionCompatParcelizer(str));
        }
    }

    public final boolean write(byte b) {
        List arrayList;
        boolean zContains;
        r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg;
        setDefaultNotificationChannelNamelambda0 setdefaultnotificationchannelnamelambda0;
        synchronized (this) {
            setEmaillambda0 setemaillambda0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (setemaillambda0 != null && (r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg = setemaillambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null && (setdefaultnotificationchannelnamelambda0 = r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg.read) != null && setdefaultnotificationchannelnamelambda0.RemoteActionCompatParcelizer != null) {
                arrayList = new ArrayList(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read.RemoteActionCompatParcelizer);
            } else {
                arrayList = read;
            }
            zContains = arrayList.contains(Byte.valueOf(b));
        }
        return zContains;
    }
}
