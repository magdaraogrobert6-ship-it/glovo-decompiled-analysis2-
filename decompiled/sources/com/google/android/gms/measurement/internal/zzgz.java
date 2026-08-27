package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import kotlin.TuplesKt;
import o.LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2;
import o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1;
import o.LookaheadLayoutCoordinatesKt;
import o.LookaheadScope;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtLookaheadScope4;
import o.Measured;
import o.OnGloballyPositionedModifierKt;
import o.OnLayoutRectChangedElement;
import o.SoftKeyboardInterceptionModifierNode;
import o.access1001;
import o.accessgetExtendedTouchPaddingNHjbRcjd;
import o.accessgetSystemNavigationDowncp;
import o.getLookaheadDelegate;
import o.getNumPadDivideEK5gGoQ;
import o.getOnGloballyPositioned;
import o.getSelectionEndui_text;
import o.getStem3EK5gGoQ;
import o.getSystemHomeEK5gGoQ;
import o.getSystemNavigationUpEK5gGoQ;
import o.getTEK5gGoQ;
import o.getTvInputHdmi1EK5gGoQ;
import o.getTvInputVga1EK5gGoQ;
import o.getTvNumberEntryEK5gGoQ;
import o.getTvPowerEK5gGoQ;
import o.getTvRadioServiceEK5gGoQ;
import o.getTvSatelliteBsEK5gGoQ;
import o.getTvSatelliteCsEK5gGoQ;
import o.getTvSatelliteServiceEK5gGoQ;
import o.getTvTerrestrialDigitalEK5gGoQ;
import o.getTvTimerProgrammingEK5gGoQ;
import o.getTvZoomModeEK5gGoQ;
import o.getTwoEK5gGoQ;
import o.getUEK5gGoQ;
import o.getVoiceAssistEK5gGoQ;
import o.getWEK5gGoQ;
import o.getXEK5gGoQ;
import o.getYEK5gGoQ;
import o.getYenEK5gGoQ;
import o.lookaheadScopeCoordinates;
import o.onLayoutRectChangeddefault;
import o.onPostFlingRZ2iAVYsuspendImpl;
import o.onPreFlingQWom1MosuspendImpl;
import o.premeasure0kLqBqw;
import o.setCalculateNestedScrollScopeui;
import o.setComposedWithReusableContentHost;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgz extends getOnGloballyPositioned {
    public final /* synthetic */ int serializer;

    public static int read(getTwoEK5gGoQ gettwoek5ggoq, String str) {
        for (int i = 0; i < ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).onPictureInPictureModeChanged(); i++) {
            if (str.equals(((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).PlaybackStateCompatCustomAction(i).IconCompatParcelizer())) {
                return i;
            }
        }
        return -1;
    }

    @Override // o.getOnGloballyPositioned
    public final void read() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzgz(zzpg zzpgVar, int i) {
        super(zzpgVar);
        this.serializer = i;
    }

    public static final String IconCompatParcelizer(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static Bundle[] IconCompatParcelizer(onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl) {
        ArrayList arrayList = new ArrayList();
        Iterator it = onpostflingrz2iavysuspendimpl.iterator();
        while (it.hasNext()) {
            getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq = (getTvSatelliteServiceEK5gGoQ) it.next();
            if (gettvsatelliteserviceek5ggoq != null) {
                Bundle bundle = new Bundle();
                for (getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq2 : gettvsatelliteserviceek5ggoq.MediaSessionCompatResultReceiverWrapper()) {
                    if (gettvsatelliteserviceek5ggoq2.RemoteActionCompatParcelizer()) {
                        bundle.putString(gettvsatelliteserviceek5ggoq2.read(), gettvsatelliteserviceek5ggoq2.serializer());
                    } else if (gettvsatelliteserviceek5ggoq2.MediaBrowserCompatMediaItem()) {
                        bundle.putLong(gettvsatelliteserviceek5ggoq2.read(), gettvsatelliteserviceek5ggoq2.MediaDescriptionCompat());
                    } else if (gettvsatelliteserviceek5ggoq2.MediaSessionCompatQueueItem()) {
                        bundle.putDouble(gettvsatelliteserviceek5ggoq2.read(), gettvsatelliteserviceek5ggoq2.PlaybackStateCompatCustomAction());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void RemoteActionCompatParcelizer(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                serializer(builder, str3, string, set);
            }
        }
    }

    public static Bundle read(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(read((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static HashMap read(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(read((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(read((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(read((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static final Bundle serializer(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq = (getTvSatelliteServiceEK5gGoQ) it.next();
            String str = gettvsatelliteserviceek5ggoq.read();
            if (gettvsatelliteserviceek5ggoq.MediaSessionCompatQueueItem()) {
                bundle.putDouble(str, gettvsatelliteserviceek5ggoq.PlaybackStateCompatCustomAction());
            } else if (gettvsatelliteserviceek5ggoq.RatingCompat()) {
                bundle.putFloat(str, gettvsatelliteserviceek5ggoq.MediaMetadataCompat());
            } else if (gettvsatelliteserviceek5ggoq.RemoteActionCompatParcelizer()) {
                bundle.putString(str, gettvsatelliteserviceek5ggoq.serializer());
            } else if (gettvsatelliteserviceek5ggoq.MediaBrowserCompatMediaItem()) {
                bundle.putLong(str, gettvsatelliteserviceek5ggoq.MediaDescriptionCompat());
            }
        }
        return bundle;
    }

    public String IconCompatParcelizer(getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq) {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("\nproperty_filter {\n");
        if (getsystemnavigationupek5ggoq.serializer()) {
            read(sbM, 0, "filter_id", Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer()));
        }
        read(sbM, 0, "property_name", ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(getsystemnavigationupek5ggoq.IconCompatParcelizer()));
        String strIconCompatParcelizer = IconCompatParcelizer(getsystemnavigationupek5ggoq.MediaMetadataCompat(), getsystemnavigationupek5ggoq.MediaSessionCompatQueueItem(), getsystemnavigationupek5ggoq.MediaBrowserCompatMediaItem());
        if (!strIconCompatParcelizer.isEmpty()) {
            read(sbM, 0, "filter_type", strIconCompatParcelizer);
        }
        RemoteActionCompatParcelizer(sbM, 1, getsystemnavigationupek5ggoq.read());
        sbM.append("}\n");
        return sbM.toString();
    }

    public List read(onPreFlingQWom1MosuspendImpl onpreflingqwom1mosuspendimpl, List list) {
        int i;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        ArrayList arrayList = new ArrayList(onpreflingqwom1mosuspendimpl);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.MediaSessionCompatQueueItem.serializer("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public String serializer(getUEK5gGoQ getuek5ggoq) {
        String str;
        String str2;
        String str3;
        getTvInputVga1EK5gGoQ gettvinputvga1ek5ggoqAddOnPictureInPictureModeChangedListener;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("\nbatch {\n");
        if (getuek5ggoq.MediaDescriptionCompat()) {
            read(sbM, 0, "upload_subdomain", getuek5ggoq.RatingCompat());
        }
        if (getuek5ggoq.write()) {
            read(sbM, 0, "sgtm_join_id", getuek5ggoq.IconCompatParcelizer());
        }
        for (getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq : getuek5ggoq.read()) {
            if (gettvzoommodeek5ggoq != null) {
                RemoteActionCompatParcelizer(1, sbM);
                sbM.append("bundle {\n");
                if (gettvzoommodeek5ggoq.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()) {
                    read(sbM, 1, "protocol_version", Integer.valueOf(gettvzoommodeek5ggoq.getLastCustomNonConfigurationInstance()));
                }
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
                zzgn zzgnVar = lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (setcomposedwithreusablecontenthost.write(gettvzoommodeek5ggoq.serializer(), premeasure0kLqBqw.defaultViewModelProviderFactory_delegatelambda0) && gettvzoommodeek5ggoq.getSavedStateRegistryControllerannotations()) {
                    read(sbM, 1, "session_stitching_token", gettvzoommodeek5ggoq.onBackPressedDispatcher_delegatelambda0());
                }
                read(sbM, 1, "platform", gettvzoommodeek5ggoq.removeOnConfigurationChangedListener());
                if (gettvzoommodeek5ggoq.RemoteActionCompatParcelizer()) {
                    read(sbM, 1, "gmp_version", Long.valueOf(gettvzoommodeek5ggoq.read()));
                }
                if (gettvzoommodeek5ggoq.RatingCompat()) {
                    read(sbM, 1, "uploading_gmp_version", Long.valueOf(gettvzoommodeek5ggoq.MediaMetadataCompat()));
                }
                if (gettvzoommodeek5ggoq.getOnBackPressedInput()) {
                    read(sbM, 1, "dynamite_version", Long.valueOf(gettvzoommodeek5ggoq.menuHostHelperlambda0()));
                }
                if (gettvzoommodeek5ggoq.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()) {
                    read(sbM, 1, "config_version", Long.valueOf(gettvzoommodeek5ggoq.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()));
                }
                read(sbM, 1, "gmp_app_id", gettvzoommodeek5ggoq.ComponentActivity());
                read(sbM, 1, HiAnalyticsConstant.BI_KEY_APP_ID, gettvzoommodeek5ggoq.serializer());
                read(sbM, 1, "app_version", gettvzoommodeek5ggoq.write());
                if (gettvzoommodeek5ggoq.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                    read(sbM, 1, "app_version_major", Integer.valueOf(gettvzoommodeek5ggoq.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()));
                }
                read(sbM, 1, "firebase_instance_id", gettvzoommodeek5ggoq.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg());
                if (gettvzoommodeek5ggoq.MediaSessionCompatToken()) {
                    read(sbM, 1, "dev_cert_hash", Long.valueOf(gettvzoommodeek5ggoq.PlaybackStateCompatCustomAction()));
                }
                read(sbM, 1, "app_store", gettvzoommodeek5ggoq.setContentView());
                if (gettvzoommodeek5ggoq.onPanelClosed()) {
                    read(sbM, 1, "upload_timestamp_millis", Long.valueOf(gettvzoommodeek5ggoq.onSaveInstanceState()));
                }
                if (gettvzoommodeek5ggoq.onRetainCustomNonConfigurationInstance()) {
                    read(sbM, 1, "start_timestamp_millis", Long.valueOf(gettvzoommodeek5ggoq.onUserLeaveHint()));
                }
                if (gettvzoommodeek5ggoq.onRetainNonConfigurationInstance()) {
                    read(sbM, 1, "end_timestamp_millis", Long.valueOf(gettvzoommodeek5ggoq.onTrimMemory()));
                }
                if (gettvzoommodeek5ggoq.registerForActivityResult()) {
                    read(sbM, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(gettvzoommodeek5ggoq.removeOnContextAvailableListener()));
                }
                if (gettvzoommodeek5ggoq.removeMenuProvider()) {
                    read(sbM, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(gettvzoommodeek5ggoq.peekAvailableContext()));
                }
                read(sbM, 1, "app_instance_id", gettvzoommodeek5ggoq.MediaSessionCompatResultReceiverWrapper());
                read(sbM, 1, "resettable_device_id", gettvzoommodeek5ggoq.MediaSessionCompatQueueItem());
                read(sbM, 1, "ds_id", gettvzoommodeek5ggoq.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ());
                if (gettvzoommodeek5ggoq.MediaBrowserCompatMediaItem()) {
                    read(sbM, 1, "limited_ad_tracking", Boolean.valueOf(gettvzoommodeek5ggoq.MediaDescriptionCompat()));
                }
                read(sbM, 1, "os_version", gettvzoommodeek5ggoq.removeOnPictureInPictureUiStateChangedListener());
                read(sbM, 1, "device_model", gettvzoommodeek5ggoq.removeOnPictureInPictureModeChangedListener());
                read(sbM, 1, "user_default_language", gettvzoommodeek5ggoq.removeOnNewIntentListener());
                if (gettvzoommodeek5ggoq.removeOnMultiWindowModeChangedListener()) {
                    read(sbM, 1, "time_zone_offset_minutes", Integer.valueOf(gettvzoommodeek5ggoq.removeOnTrimMemoryListener()));
                }
                if (gettvzoommodeek5ggoq.PlaybackStateCompat()) {
                    read(sbM, 1, "bundle_sequential_index", Integer.valueOf(gettvzoommodeek5ggoq.ParcelableVolumeInfo()));
                }
                if (gettvzoommodeek5ggoq.enterPictureInPictureMode()) {
                    read(sbM, 1, "delivery_index", Integer.valueOf(gettvzoommodeek5ggoq.addOnUserLeaveHintListener()));
                }
                if (gettvzoommodeek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
                    read(sbM, 1, "service_upload", Boolean.valueOf(gettvzoommodeek5ggoq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
                }
                read(sbM, 1, "health_monitor", gettvzoommodeek5ggoq.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
                if (gettvzoommodeek5ggoq.addObserverForBackInvoker()) {
                    read(sbM, 1, "retry_counter", Integer.valueOf(gettvzoommodeek5ggoq.createFullyDrawnExecutor()));
                }
                if (gettvzoommodeek5ggoq.fullyDrawnReporter_delegatelambda00()) {
                    read(sbM, 1, "consent_signals", gettvzoommodeek5ggoq.fullyDrawnReporter_delegatelambda0());
                }
                if (gettvzoommodeek5ggoq.addOnMultiWindowModeChangedListener()) {
                    read(sbM, 1, "is_dma_region", Boolean.valueOf(gettvzoommodeek5ggoq.addOnNewIntentListener()));
                }
                if (gettvzoommodeek5ggoq.addOnConfigurationChangedListener()) {
                    read(sbM, 1, "core_platform_services", gettvzoommodeek5ggoq.addMenuProvider());
                }
                if (gettvzoommodeek5ggoq.addContentView()) {
                    read(sbM, 1, "consent_diagnostics", gettvzoommodeek5ggoq.addOnContextAvailableListener());
                }
                if (gettvzoommodeek5ggoq.onBackPressedInput_delegatelambda0()) {
                    read(sbM, 1, "target_os_version", Long.valueOf(gettvzoommodeek5ggoq.onBackPressedDispatcher_delegatelambda010()));
                }
                accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(gettvzoommodeek5ggoq.serializer(), premeasure0kLqBqw.getSavedStateRegistryControllerannotations)) {
                    read(sbM, 1, "ad_services_version", Integer.valueOf(gettvzoommodeek5ggoq.addOnTrimMemoryListener()));
                    if (gettvzoommodeek5ggoq.addOnPictureInPictureUiStateChangedListener() && (gettvinputvga1ek5ggoqAddOnPictureInPictureModeChangedListener = gettvzoommodeek5ggoq.addOnPictureInPictureModeChangedListener()) != null) {
                        RemoteActionCompatParcelizer(2, sbM);
                        sbM.append("attribution_eligibility_status {\n");
                        read(sbM, 2, "eligible", Boolean.valueOf(gettvinputvga1ek5ggoqAddOnPictureInPictureModeChangedListener.serializer()));
                        read(sbM, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(gettvinputvga1ek5ggoqAddOnPictureInPictureModeChangedListener.write()));
                        read(sbM, 2, "pre_r", Boolean.valueOf(gettvinputvga1ek5ggoqAddOnPictureInPictureModeChangedListener.read()));
                        read(sbM, 2, "r_extensions_too_old", Boolean.valueOf(gettvinputvga1ek5ggoqAddOnPictureInPictureModeChangedListener.RatingCompat()));
                        read(sbM, 2, "adservices_extension_too_old", Boolean.valueOf(gettvinputvga1ek5ggoqAddOnPictureInPictureModeChangedListener.MediaSessionCompatQueueItem()));
                        read(sbM, 2, "ad_storage_not_allowed", Boolean.valueOf(gettvinputvga1ek5ggoqAddOnPictureInPictureModeChangedListener.MediaBrowserCompatMediaItem()));
                        read(sbM, 2, "measurement_manager_disabled", Boolean.valueOf(gettvinputvga1ek5ggoqAddOnPictureInPictureModeChangedListener.MediaDescriptionCompat()));
                        RemoteActionCompatParcelizer(2, sbM);
                        sbM.append("}\n");
                    }
                }
                if (gettvzoommodeek5ggoq.getActivityResultRegistry()) {
                    getTvInputHdmi1EK5gGoQ defaultViewModelCreationExtras = gettvzoommodeek5ggoq.getDefaultViewModelCreationExtras();
                    RemoteActionCompatParcelizer(2, sbM);
                    sbM.append("ad_campaign_info {\n");
                    if (defaultViewModelCreationExtras.MediaBrowserCompatMediaItem()) {
                        read(sbM, 2, "deep_link_gclid", defaultViewModelCreationExtras.MediaDescriptionCompat());
                    }
                    if (defaultViewModelCreationExtras.MediaSessionCompatQueueItem()) {
                        read(sbM, 2, "deep_link_gbraid", defaultViewModelCreationExtras.MediaSessionCompatToken());
                    }
                    if (defaultViewModelCreationExtras.PlaybackStateCompatCustomAction()) {
                        read(sbM, 2, "deep_link_gad_source", defaultViewModelCreationExtras.ParcelableVolumeInfo());
                    }
                    if (defaultViewModelCreationExtras.PlaybackStateCompat()) {
                        read(sbM, 2, "deep_link_session_millis", Long.valueOf(defaultViewModelCreationExtras.MediaSessionCompatResultReceiverWrapper()));
                    }
                    if (defaultViewModelCreationExtras.ComponentActivity()) {
                        read(sbM, 2, "market_referrer_gclid", defaultViewModelCreationExtras.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                    }
                    if (defaultViewModelCreationExtras.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) {
                        read(sbM, 2, "market_referrer_gbraid", defaultViewModelCreationExtras.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                    }
                    if (defaultViewModelCreationExtras.ResultReceiver()) {
                        read(sbM, 2, "market_referrer_gad_source", defaultViewModelCreationExtras.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
                    }
                    if (defaultViewModelCreationExtras.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg()) {
                        read(sbM, 2, "market_referrer_click_millis", Long.valueOf(defaultViewModelCreationExtras.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()));
                    }
                    RemoteActionCompatParcelizer(2, sbM);
                    sbM.append("}\n");
                }
                if (gettvzoommodeek5ggoq.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw()) {
                    read(sbM, 1, "batching_timestamp_millis", Long.valueOf(gettvzoommodeek5ggoq.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()));
                }
                if (gettvzoommodeek5ggoq.getFullyDrawnReporter()) {
                    getYenEK5gGoQ defaultViewModelProviderFactory = gettvzoommodeek5ggoq.getDefaultViewModelProviderFactory();
                    RemoteActionCompatParcelizer(2, sbM);
                    sbM.append("sgtm_diagnostics {\n");
                    int iWrite = defaultViewModelProviderFactory.write();
                    if (iWrite == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iWrite == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iWrite != 3) {
                        str2 = iWrite != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    read(sbM, 2, "upload_type", str2);
                    read(sbM, 2, "client_upload_eligibility", defaultViewModelProviderFactory.RemoteActionCompatParcelizer().name());
                    int i = defaultViewModelProviderFactory.read();
                    if (i == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (i == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (i == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (i != 4) {
                        str3 = i != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    read(sbM, 2, "service_upload_eligibility", str3);
                    RemoteActionCompatParcelizer(2, sbM);
                    sbM.append("}\n");
                }
                if (gettvzoommodeek5ggoq._init_lambda4()) {
                    getTvRadioServiceEK5gGoQ gettvradioserviceek5ggoq_init_lambda3 = gettvzoommodeek5ggoq._init_lambda3();
                    RemoteActionCompatParcelizer(2, sbM);
                    sbM.append("consent_info_extra {\n");
                    for (getTvPowerEK5gGoQ gettvpowerek5ggoq : gettvradioserviceek5ggoq_init_lambda3.write()) {
                        RemoteActionCompatParcelizer(3, sbM);
                        sbM.append("limited_data_modes {\n");
                        int iWrite2 = gettvpowerek5ggoq.write();
                        if (iWrite2 == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iWrite2 == 2) {
                            str = "AD_STORAGE";
                        } else if (iWrite2 != 3) {
                            str = iWrite2 != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        read(sbM, 3, "type", str);
                        int iIconCompatParcelizer = gettvpowerek5ggoq.IconCompatParcelizer();
                        read(sbM, 3, "mode", iIconCompatParcelizer != 1 ? iIconCompatParcelizer != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        RemoteActionCompatParcelizer(3, sbM);
                        sbM.append("}\n");
                    }
                    RemoteActionCompatParcelizer(2, sbM);
                    sbM.append("}\n");
                }
                onPostFlingRZ2iAVYsuspendImpl<getYEK5gGoQ> onpostflingrz2iavysuspendimplOnPictureInPictureUiStateChanged = gettvzoommodeek5ggoq.onPictureInPictureUiStateChanged();
                if (onpostflingrz2iavysuspendimplOnPictureInPictureUiStateChanged != null) {
                    for (getYEK5gGoQ getyek5ggoq : onpostflingrz2iavysuspendimplOnPictureInPictureUiStateChanged) {
                        if (getyek5ggoq != null) {
                            RemoteActionCompatParcelizer(2, sbM);
                            sbM.append("user_property {\n");
                            read(sbM, 2, "set_timestamp_millis", getyek5ggoq.serializer() ? Long.valueOf(getyek5ggoq.RemoteActionCompatParcelizer()) : null);
                            read(sbM, 2, "name", zzgnVar.RemoteActionCompatParcelizer(getyek5ggoq.IconCompatParcelizer()));
                            read(sbM, 2, "string_value", getyek5ggoq.RatingCompat());
                            read(sbM, 2, "int_value", getyek5ggoq.MediaBrowserCompatMediaItem() ? Long.valueOf(getyek5ggoq.MediaMetadataCompat()) : null);
                            read(sbM, 2, "double_value", getyek5ggoq.PlaybackStateCompat() ? Double.valueOf(getyek5ggoq.PlaybackStateCompatCustomAction()) : null);
                            RemoteActionCompatParcelizer(2, sbM);
                            sbM.append("}\n");
                        }
                    }
                }
                onPostFlingRZ2iAVYsuspendImpl<getTvNumberEntryEK5gGoQ> onpostflingrz2iavysuspendimplResultReceiver = gettvzoommodeek5ggoq.ResultReceiver();
                if (onpostflingrz2iavysuspendimplResultReceiver != null) {
                    for (getTvNumberEntryEK5gGoQ gettvnumberentryek5ggoq : onpostflingrz2iavysuspendimplResultReceiver) {
                        if (gettvnumberentryek5ggoq != null) {
                            RemoteActionCompatParcelizer(2, sbM);
                            sbM.append("audience_membership {\n");
                            if (gettvnumberentryek5ggoq.IconCompatParcelizer()) {
                                read(sbM, 2, "audience_id", Integer.valueOf(gettvnumberentryek5ggoq.read()));
                            }
                            if (gettvnumberentryek5ggoq.MediaDescriptionCompat()) {
                                read(sbM, 2, "new_audience", Boolean.valueOf(gettvnumberentryek5ggoq.RatingCompat()));
                            }
                            write(sbM, "current_data", gettvnumberentryek5ggoq.write());
                            if (gettvnumberentryek5ggoq.serializer()) {
                                write(sbM, "previous_data", gettvnumberentryek5ggoq.MediaMetadataCompat());
                            }
                            RemoteActionCompatParcelizer(2, sbM);
                            sbM.append("}\n");
                        }
                    }
                }
                List<getTvTerrestrialDigitalEK5gGoQ> listOnMenuItemSelected = gettvzoommodeek5ggoq.onMenuItemSelected();
                if (listOnMenuItemSelected != null) {
                    for (getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq : listOnMenuItemSelected) {
                        if (gettvterrestrialdigitalek5ggoq != null) {
                            RemoteActionCompatParcelizer(2, sbM);
                            sbM.append("event {\n");
                            read(sbM, 2, "name", zzgnVar.write(gettvterrestrialdigitalek5ggoq.IconCompatParcelizer()));
                            if (gettvterrestrialdigitalek5ggoq.RemoteActionCompatParcelizer()) {
                                read(sbM, 2, "timestamp_millis", Long.valueOf(gettvterrestrialdigitalek5ggoq.MediaMetadataCompat()));
                            }
                            if (gettvterrestrialdigitalek5ggoq.MediaSessionCompatQueueItem()) {
                                read(sbM, 2, "previous_timestamp_millis", Long.valueOf(gettvterrestrialdigitalek5ggoq.MediaDescriptionCompat()));
                            }
                            if (gettvterrestrialdigitalek5ggoq.MediaBrowserCompatMediaItem()) {
                                read(sbM, 2, "count", Integer.valueOf(gettvterrestrialdigitalek5ggoq.RatingCompat()));
                            }
                            if (gettvterrestrialdigitalek5ggoq.write() != 0) {
                                RemoteActionCompatParcelizer(sbM, 2, (onPostFlingRZ2iAVYsuspendImpl) gettvterrestrialdigitalek5ggoq.serializer());
                            }
                            RemoteActionCompatParcelizer(2, sbM);
                            sbM.append("}\n");
                        }
                    }
                }
                RemoteActionCompatParcelizer(1, sbM);
                sbM.append("}\n");
            }
        }
        sbM.append("} // End-of-batch\n");
        return sbM.toString();
    }

    public byte[] write(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(e, "Failed to gzip content");
            throw e;
        }
    }

    public static final void read(StringBuilder sb, int i, String str, getStem3EK5gGoQ getstem3ek5ggoq) {
        String str2;
        if (getstem3ek5ggoq == null) {
            return;
        }
        RemoteActionCompatParcelizer(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (getstem3ek5ggoq.serializer()) {
            int iParcelableVolumeInfo = getstem3ek5ggoq.ParcelableVolumeInfo();
            if (iParcelableVolumeInfo == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iParcelableVolumeInfo == 2) {
                str2 = "LESS_THAN";
            } else if (iParcelableVolumeInfo == 3) {
                str2 = "GREATER_THAN";
            } else if (iParcelableVolumeInfo != 4) {
                str2 = "BETWEEN";
            } else {
                str2 = "EQUAL";
            }
            read(sb, i, "comparison_type", str2);
        }
        if (getstem3ek5ggoq.RemoteActionCompatParcelizer()) {
            read(sb, i, "match_as_float", Boolean.valueOf(getstem3ek5ggoq.write()));
        }
        if (getstem3ek5ggoq.IconCompatParcelizer()) {
            read(sb, i, "comparison_value", getstem3ek5ggoq.MediaMetadataCompat());
        }
        if (getstem3ek5ggoq.MediaDescriptionCompat()) {
            read(sb, i, "min_comparison_value", getstem3ek5ggoq.MediaSessionCompatQueueItem());
        }
        if (getstem3ek5ggoq.RatingCompat()) {
            read(sb, i, "max_comparison_value", getstem3ek5ggoq.MediaBrowserCompatMediaItem());
        }
        RemoteActionCompatParcelizer(i, sb);
        sb.append("}\n");
    }

    public static zzbg write(getNumPadDivideEK5gGoQ getnumpaddivideek5ggoq) {
        Object obj;
        Bundle bundle = read((Map) getnumpaddivideek5ggoq.serializer, true);
        String string = (!bundle.containsKey("_o") || (obj = bundle.get("_o")) == null) ? "app" : obj.toString();
        String str = (String) TuplesKt.RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{getnumpaddivideek5ggoq.RemoteActionCompatParcelizer, Measured.IconCompatParcelizer, Measured.RemoteActionCompatParcelizer}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
        if (str == null) {
            str = getnumpaddivideek5ggoq.RemoteActionCompatParcelizer;
        }
        return new zzbg(str, new zzbe(bundle), string, getnumpaddivideek5ggoq.write);
    }

    public long IconCompatParcelizer(byte[] bArr) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bArr);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        onlayoutrectchangeddefault.MediaSessionCompatToken();
        MessageDigest messageDigestSerializer = onLayoutRectChangeddefault.serializer();
        if (messageDigestSerializer != null) {
            return onLayoutRectChangeddefault.serializer(messageDigestSerializer.digest(bArr));
        }
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to get MD5");
        return 0L;
    }

    public void IconCompatParcelizer(getXEK5gGoQ getxek5ggoq, Object obj) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(obj);
        getxek5ggoq.ParcelableVolumeInfo();
        ((getYEK5gGoQ) getxek5ggoq.IconCompatParcelizer).ParcelableVolumeInfo();
        getxek5ggoq.ParcelableVolumeInfo();
        ((getYEK5gGoQ) getxek5ggoq.IconCompatParcelizer).MediaSessionCompatToken();
        getxek5ggoq.ParcelableVolumeInfo();
        ((getYEK5gGoQ) getxek5ggoq.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        if (obj instanceof String) {
            getxek5ggoq.ParcelableVolumeInfo();
            ((getYEK5gGoQ) getxek5ggoq.IconCompatParcelizer).write((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            getxek5ggoq.ParcelableVolumeInfo();
            ((getYEK5gGoQ) getxek5ggoq.IconCompatParcelizer).IconCompatParcelizer(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            getxek5ggoq.ParcelableVolumeInfo();
            ((getYEK5gGoQ) getxek5ggoq.IconCompatParcelizer).write(dDoubleValue);
        } else {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void RemoteActionCompatParcelizer(StringBuilder sb, int i, getSystemHomeEK5gGoQ getsystemhomeek5ggoq) {
        String str;
        if (getsystemhomeek5ggoq == null) {
            return;
        }
        RemoteActionCompatParcelizer(i, sb);
        sb.append("filter {\n");
        if (getsystemhomeek5ggoq.RatingCompat()) {
            read(sb, i, "complement", Boolean.valueOf(getsystemhomeek5ggoq.MediaBrowserCompatMediaItem()));
        }
        if (getsystemhomeek5ggoq.MediaMetadataCompat()) {
            read(sb, i, "param_name", ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(getsystemhomeek5ggoq.MediaSessionCompatQueueItem()));
        }
        if (getsystemhomeek5ggoq.serializer()) {
            int i2 = i + 1;
            getTEK5gGoQ gettek5ggoqRemoteActionCompatParcelizer = getsystemhomeek5ggoq.RemoteActionCompatParcelizer();
            if (gettek5ggoqRemoteActionCompatParcelizer != null) {
                RemoteActionCompatParcelizer(i2, sb);
                sb.append("string_filter {\n");
                if (gettek5ggoqRemoteActionCompatParcelizer.serializer()) {
                    switch (gettek5ggoqRemoteActionCompatParcelizer.MediaMetadataCompat()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    read(sb, i2, "match_type", str);
                }
                if (gettek5ggoqRemoteActionCompatParcelizer.write()) {
                    read(sb, i2, "expression", gettek5ggoqRemoteActionCompatParcelizer.read());
                }
                if (gettek5ggoqRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                    read(sb, i2, "case_sensitive", Boolean.valueOf(gettek5ggoqRemoteActionCompatParcelizer.MediaDescriptionCompat()));
                }
                if (gettek5ggoqRemoteActionCompatParcelizer.RatingCompat() > 0) {
                    RemoteActionCompatParcelizer(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : gettek5ggoqRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                        RemoteActionCompatParcelizer(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                RemoteActionCompatParcelizer(i2, sb);
                sb.append("}\n");
            }
        }
        if (getsystemhomeek5ggoq.read()) {
            read(sb, i + 1, "number_filter", getsystemhomeek5ggoq.write());
        }
        RemoteActionCompatParcelizer(i, sb);
        sb.append("}\n");
    }

    public void RemoteActionCompatParcelizer(getTvTimerProgrammingEK5gGoQ gettvtimerprogrammingek5ggoq, Object obj) {
        gettvtimerprogrammingek5ggoq.ParcelableVolumeInfo();
        ((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoq.IconCompatParcelizer).ParcelableVolumeInfo();
        gettvtimerprogrammingek5ggoq.ParcelableVolumeInfo();
        ((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoq.IconCompatParcelizer).PlaybackStateCompat();
        gettvtimerprogrammingek5ggoq.ParcelableVolumeInfo();
        ((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoq.IconCompatParcelizer).ResultReceiver();
        gettvtimerprogrammingek5ggoq.ParcelableVolumeInfo();
        ((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoq.IconCompatParcelizer).ComponentActivity();
        if (obj instanceof String) {
            gettvtimerprogrammingek5ggoq.write((String) obj);
            return;
        }
        if (obj instanceof Long) {
            gettvtimerprogrammingek5ggoq.RemoteActionCompatParcelizer(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            gettvtimerprogrammingek5ggoq.ParcelableVolumeInfo();
            ((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoq.IconCompatParcelizer).write(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                getTvTimerProgrammingEK5gGoQ gettvtimerprogrammingek5ggoqIconCompatParcelizer = getTvSatelliteServiceEK5gGoQ.IconCompatParcelizer();
                for (String str : bundle.keySet()) {
                    getTvTimerProgrammingEK5gGoQ gettvtimerprogrammingek5ggoqIconCompatParcelizer2 = getTvSatelliteServiceEK5gGoQ.IconCompatParcelizer();
                    gettvtimerprogrammingek5ggoqIconCompatParcelizer2.serializer(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        gettvtimerprogrammingek5ggoqIconCompatParcelizer2.RemoteActionCompatParcelizer(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        gettvtimerprogrammingek5ggoqIconCompatParcelizer2.write((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        gettvtimerprogrammingek5ggoqIconCompatParcelizer2.ParcelableVolumeInfo();
                        ((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoqIconCompatParcelizer2.IconCompatParcelizer).write(dDoubleValue2);
                    }
                    gettvtimerprogrammingek5ggoqIconCompatParcelizer.ParcelableVolumeInfo();
                    ((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoqIconCompatParcelizer.IconCompatParcelizer).RemoteActionCompatParcelizer((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoqIconCompatParcelizer2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                }
                if (((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoqIconCompatParcelizer.IconCompatParcelizer).MediaSessionCompatToken() > 0) {
                    arrayList.add((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoqIconCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                }
            }
        }
        gettvtimerprogrammingek5ggoq.ParcelableVolumeInfo();
        ((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoq.IconCompatParcelizer).write(arrayList);
    }

    public boolean serializer() {
        NetworkInfo activeNetworkInfo;
        ComponentActivity();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean RemoteActionCompatParcelizer(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final getTvSatelliteServiceEK5gGoQ write(getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq, String str) {
        for (getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq : gettvterrestrialdigitalek5ggoq.serializer()) {
            if (gettvsatelliteserviceek5ggoq.read().equals(str)) {
                return gettvsatelliteserviceek5ggoq;
            }
        }
        return null;
    }

    public static final void write(StringBuilder sb, String str, getWEK5gGoQ getwek5ggoq) {
        if (getwek5ggoq == null) {
            return;
        }
        RemoteActionCompatParcelizer(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (getwek5ggoq.RatingCompat() != 0) {
            RemoteActionCompatParcelizer(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : getwek5ggoq.write()) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i++;
            }
            sb.append('\n');
        }
        if (getwek5ggoq.read() != 0) {
            RemoteActionCompatParcelizer(4, sb);
            sb.append("status: ");
            int i2 = 0;
            for (Long l2 : getwek5ggoq.IconCompatParcelizer()) {
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i2++;
            }
            sb.append('\n');
        }
        if (getwek5ggoq.MediaDescriptionCompat() != 0) {
            RemoteActionCompatParcelizer(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i3 = 0;
            for (getTvSatelliteCsEK5gGoQ gettvsatellitecsek5ggoq : getwek5ggoq.MediaSessionCompatQueueItem()) {
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(gettvsatellitecsek5ggoq.serializer() ? Integer.valueOf(gettvsatellitecsek5ggoq.read()) : null);
                sb.append(":");
                sb.append(gettvsatellitecsek5ggoq.RemoteActionCompatParcelizer() ? Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer()) : null);
                i3++;
            }
            sb.append("}\n");
        }
        if (getwek5ggoq.MediaBrowserCompatMediaItem() != 0) {
            RemoteActionCompatParcelizer(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i4 = 0;
            for (getVoiceAssistEK5gGoQ getvoiceassistek5ggoq : getwek5ggoq.MediaMetadataCompat()) {
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(getvoiceassistek5ggoq.read() ? Integer.valueOf(getvoiceassistek5ggoq.RemoteActionCompatParcelizer()) : null);
                sb.append(": [");
                Iterator it = getvoiceassistek5ggoq.serializer().iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i5++;
                }
                sb.append("]");
                i4++;
            }
            sb.append("}\n");
        }
        RemoteActionCompatParcelizer(3, sb);
        sb.append("}\n");
    }

    public getTvTerrestrialDigitalEK5gGoQ RemoteActionCompatParcelizer(LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2) {
        getTvSatelliteBsEK5gGoQ gettvsatellitebsek5ggoq = getTvTerrestrialDigitalEK5gGoQ.read();
        long j = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2.write;
        gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
        ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).RemoteActionCompatParcelizer(j);
        zzbe zzbeVar = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2.MediaDescriptionCompat;
        Objects.requireNonNull(zzbeVar);
        Bundle bundle = zzbeVar.read;
        for (String str : bundle.keySet()) {
            getTvTimerProgrammingEK5gGoQ gettvtimerprogrammingek5ggoqIconCompatParcelizer = getTvSatelliteServiceEK5gGoQ.IconCompatParcelizer();
            gettvtimerprogrammingek5ggoqIconCompatParcelizer.serializer(str);
            Object obj = bundle.get(str);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(obj);
            RemoteActionCompatParcelizer(gettvtimerprogrammingek5ggoqIconCompatParcelizer, obj);
            gettvsatellitebsek5ggoq.serializer(gettvtimerprogrammingek5ggoqIconCompatParcelizer);
        }
        String str2 = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2.read;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            getTvTimerProgrammingEK5gGoQ gettvtimerprogrammingek5ggoqIconCompatParcelizer2 = getTvSatelliteServiceEK5gGoQ.IconCompatParcelizer();
            gettvtimerprogrammingek5ggoqIconCompatParcelizer2.serializer("_o");
            gettvtimerprogrammingek5ggoqIconCompatParcelizer2.write(str2);
            gettvsatellitebsek5ggoq.read((getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoqIconCompatParcelizer2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        }
        return (getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    public Parcelable write(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader$ParseException unused) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public static final void RemoteActionCompatParcelizer(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void read(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        RemoteActionCompatParcelizer(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void serializer(getTvSatelliteBsEK5gGoQ gettvsatellitebsek5ggoq, String str, Long l) {
        List listSerializer = gettvsatellitebsek5ggoq.serializer();
        int i = 0;
        while (true) {
            if (i >= listSerializer.size()) {
                i = -1;
                break;
            } else if (str.equals(((getTvSatelliteServiceEK5gGoQ) listSerializer.get(i)).read())) {
                break;
            } else {
                i++;
            }
        }
        getTvTimerProgrammingEK5gGoQ gettvtimerprogrammingek5ggoqIconCompatParcelizer = getTvSatelliteServiceEK5gGoQ.IconCompatParcelizer();
        gettvtimerprogrammingek5ggoqIconCompatParcelizer.serializer(str);
        gettvtimerprogrammingek5ggoqIconCompatParcelizer.RemoteActionCompatParcelizer(l.longValue());
        if (i < 0) {
            gettvsatellitebsek5ggoq.serializer(gettvtimerprogrammingek5ggoqIconCompatParcelizer);
        } else {
            gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
            ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).serializer(i, (getTvSatelliteServiceEK5gGoQ) gettvtimerprogrammingek5ggoqIconCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        }
    }

    public static zzmb write(zzmb zzmbVar, byte[] bArr) throws zzmr {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNodeSerializer;
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode = SoftKeyboardInterceptionModifierNode.read;
        if (softKeyboardInterceptionModifierNode == null) {
            synchronized (SoftKeyboardInterceptionModifierNode.class) {
                softKeyboardInterceptionModifierNodeSerializer = SoftKeyboardInterceptionModifierNode.read;
                if (softKeyboardInterceptionModifierNodeSerializer == null) {
                    setCalculateNestedScrollScopeui setcalculatenestedscrollscopeui = setCalculateNestedScrollScopeui.serializer;
                    softKeyboardInterceptionModifierNodeSerializer = access1001.serializer();
                    SoftKeyboardInterceptionModifierNode.read = softKeyboardInterceptionModifierNodeSerializer;
                }
            }
            softKeyboardInterceptionModifierNode = softKeyboardInterceptionModifierNodeSerializer;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            zzmbVar.getClass();
            zzmbVar.serializer(bArr, bArr.length, softKeyboardInterceptionModifierNode);
            return zzmbVar;
        }
        zzmbVar.getClass();
        int length = bArr.length;
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode2 = SoftKeyboardInterceptionModifierNode.read;
        setCalculateNestedScrollScopeui setcalculatenestedscrollscopeui2 = setCalculateNestedScrollScopeui.serializer;
        zzmbVar.serializer(bArr, length, SoftKeyboardInterceptionModifierNode.serializer);
        return zzmbVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable RemoteActionCompatParcelizer(getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq) {
        if (gettvsatelliteserviceek5ggoq.RemoteActionCompatParcelizer()) {
            return gettvsatelliteserviceek5ggoq.serializer();
        }
        if (gettvsatelliteserviceek5ggoq.MediaBrowserCompatMediaItem()) {
            return Long.valueOf(gettvsatelliteserviceek5ggoq.MediaDescriptionCompat());
        }
        if (gettvsatelliteserviceek5ggoq.MediaSessionCompatQueueItem()) {
            return Double.valueOf(gettvsatelliteserviceek5ggoq.PlaybackStateCompatCustomAction());
        }
        if (gettvsatelliteserviceek5ggoq.MediaSessionCompatToken() > 0) {
            return IconCompatParcelizer((onPostFlingRZ2iAVYsuspendImpl) gettvsatelliteserviceek5ggoq.MediaSessionCompatResultReceiverWrapper());
        }
        return null;
    }

    public static final void serializer(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public void RemoteActionCompatParcelizer(StringBuilder sb, int i, onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl) {
        if (onpostflingrz2iavysuspendimpl == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = onpostflingrz2iavysuspendimpl.iterator();
        while (it.hasNext()) {
            getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq = (getTvSatelliteServiceEK5gGoQ) it.next();
            if (gettvsatelliteserviceek5ggoq != null) {
                RemoteActionCompatParcelizer(i2, sb);
                sb.append("param {\n");
                read(sb, i2, "name", gettvsatelliteserviceek5ggoq.write() ? ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(gettvsatelliteserviceek5ggoq.read()) : null);
                read(sb, i2, "string_value", gettvsatelliteserviceek5ggoq.RemoteActionCompatParcelizer() ? gettvsatelliteserviceek5ggoq.serializer() : null);
                read(sb, i2, "int_value", gettvsatelliteserviceek5ggoq.MediaBrowserCompatMediaItem() ? Long.valueOf(gettvsatelliteserviceek5ggoq.MediaDescriptionCompat()) : null);
                read(sb, i2, "double_value", gettvsatelliteserviceek5ggoq.MediaSessionCompatQueueItem() ? Double.valueOf(gettvsatelliteserviceek5ggoq.PlaybackStateCompatCustomAction()) : null);
                if (gettvsatelliteserviceek5ggoq.MediaSessionCompatToken() > 0) {
                    RemoteActionCompatParcelizer(sb, i2, (onPostFlingRZ2iAVYsuspendImpl) gettvsatelliteserviceek5ggoq.MediaSessionCompatResultReceiverWrapper());
                }
                RemoteActionCompatParcelizer(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public zzoh read(String str, getTwoEK5gGoQ gettwoek5ggoq, getTvSatelliteBsEK5gGoQ gettvsatellitebsek5ggoq, String str2) {
        int iIndexOf;
        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        if (!setcomposedwithreusablecontenthost.write(str, premeasure0kLqBqw.getSavedStateRegistryControllerannotations)) {
            return null;
        }
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = setcomposedwithreusablecontenthost.read(str, premeasure0kLqBqw.onConfigurationChanged).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                Gson$$ExternalSyntheticBUOutline0.m(str3, "duplicate element: ");
                return null;
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        zzpg zzpgVar = this.MediaSessionCompatToken;
        OnGloballyPositionedModifierKt onGloballyPositionedModifierKt = zzpgVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        lookaheadScopeCoordinates lookaheadscopecoordinates = zzpgVar.PlaybackStateCompat;
        lookaheadScopeCoordinates lookaheadscopecoordinates2 = onGloballyPositionedModifierKt.MediaSessionCompatToken.PlaybackStateCompat;
        zzpg.serializer(lookaheadscopecoordinates2);
        String strRemoteActionCompatParcelizer = lookaheadscopecoordinates2.RemoteActionCompatParcelizer(str);
        Uri.Builder builder = new Uri.Builder();
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost2 = ((LookaheadScopeKtLookaheadScope221) onGloballyPositionedModifierKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat;
        builder.scheme(setcomposedwithreusablecontenthost2.read(str, premeasure0kLqBqw.getLifecycle));
        if (!TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
            String str4 = setcomposedwithreusablecontenthost2.read(str, premeasure0kLqBqw.getOnBackPressedDispatcher);
            StringBuilder sb = new StringBuilder(String.valueOf(strRemoteActionCompatParcelizer).length() + 1 + String.valueOf(str4).length());
            sb.append(strRemoteActionCompatParcelizer);
            sb.append(".");
            sb.append(str4);
            builder.authority(sb.toString());
        } else {
            builder.authority(setcomposedwithreusablecontenthost2.read(str, premeasure0kLqBqw.getOnBackPressedDispatcher));
        }
        builder.path(setcomposedwithreusablecontenthost2.read(str, premeasure0kLqBqw.getSavedStateRegistry));
        serializer(builder, "gmp_app_id", ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).ComponentActivity(), setUnmodifiableSet);
        setcomposedwithreusablecontenthost.read();
        serializer(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strMediaSessionCompatResultReceiverWrapper = ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.getOnBackPressedInput;
        if (setcomposedwithreusablecontenthost.write(str, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1)) {
            zzpg.serializer(lookaheadscopecoordinates);
            if (lookaheadscopecoordinates.MediaBrowserCompatMediaItem(str)) {
                strMediaSessionCompatResultReceiverWrapper = "";
            }
        }
        serializer(builder, "app_instance_id", strMediaSessionCompatResultReceiverWrapper, setUnmodifiableSet);
        serializer(builder, "rdid", ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).MediaSessionCompatQueueItem(), setUnmodifiableSet);
        serializer(builder, "bundle_id", gettwoek5ggoq.RemoteActionCompatParcelizer(), setUnmodifiableSet);
        String str5 = gettvsatellitebsek5ggoq.read();
        String str6 = (String) TuplesKt.RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{str5, Measured.RemoteActionCompatParcelizer, Measured.IconCompatParcelizer}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
        if (true != TextUtils.isEmpty(str6)) {
            str5 = str6;
        }
        serializer(builder, "app_event_name", str5, setUnmodifiableSet);
        serializer(builder, "app_version", String.valueOf(((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()), setUnmodifiableSet);
        String strRemoveOnPictureInPictureUiStateChangedListener = ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).removeOnPictureInPictureUiStateChangedListener();
        if (setcomposedwithreusablecontenthost.write(str, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1)) {
            zzpg.serializer(lookaheadscopecoordinates);
            if (lookaheadscopecoordinates.write(str) && !TextUtils.isEmpty(strRemoveOnPictureInPictureUiStateChangedListener) && (iIndexOf = strRemoveOnPictureInPictureUiStateChangedListener.indexOf(".")) != -1) {
                strRemoveOnPictureInPictureUiStateChangedListener = strRemoveOnPictureInPictureUiStateChangedListener.substring(0, iIndexOf);
            }
        }
        serializer(builder, "os_version", strRemoveOnPictureInPictureUiStateChangedListener, setUnmodifiableSet);
        serializer(builder, "timestamp", String.valueOf(gettvsatellitebsek5ggoq.write()), setUnmodifiableSet);
        String str7 = "1";
        if (((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).MediaDescriptionCompat()) {
            serializer(builder, "lat", "1", setUnmodifiableSet);
        }
        serializer(builder, "privacy_sandbox_version", String.valueOf(((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).addOnTrimMemoryListener()), setUnmodifiableSet);
        serializer(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        serializer(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        serializer(builder, "request_uuid", str2, setUnmodifiableSet);
        List<getTvSatelliteServiceEK5gGoQ> listSerializer = gettvsatellitebsek5ggoq.serializer();
        Bundle bundle = new Bundle();
        for (getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq : listSerializer) {
            String str8 = gettvsatelliteserviceek5ggoq.read();
            if (gettvsatelliteserviceek5ggoq.MediaSessionCompatQueueItem()) {
                bundle.putString(str8, String.valueOf(gettvsatelliteserviceek5ggoq.PlaybackStateCompatCustomAction()));
            } else if (gettvsatelliteserviceek5ggoq.RatingCompat()) {
                bundle.putString(str8, String.valueOf(gettvsatelliteserviceek5ggoq.MediaMetadataCompat()));
            } else if (gettvsatelliteserviceek5ggoq.RemoteActionCompatParcelizer()) {
                bundle.putString(str8, gettvsatelliteserviceek5ggoq.serializer());
            } else if (gettvsatelliteserviceek5ggoq.MediaBrowserCompatMediaItem()) {
                bundle.putString(str8, String.valueOf(gettvsatelliteserviceek5ggoq.MediaDescriptionCompat()));
            }
        }
        RemoteActionCompatParcelizer(builder, setcomposedwithreusablecontenthost.read(str, premeasure0kLqBqw.invalidateMenu).split("\\|"), bundle, setUnmodifiableSet);
        List<getYEK5gGoQ> listUnmodifiableList = Collections.unmodifiableList(((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).onPictureInPictureUiStateChanged());
        Bundle bundle2 = new Bundle();
        for (getYEK5gGoQ getyek5ggoq : listUnmodifiableList) {
            String strIconCompatParcelizer = getyek5ggoq.IconCompatParcelizer();
            if (getyek5ggoq.PlaybackStateCompat()) {
                bundle2.putString(strIconCompatParcelizer, String.valueOf(getyek5ggoq.PlaybackStateCompatCustomAction()));
            } else if (getyek5ggoq.MediaSessionCompatQueueItem()) {
                bundle2.putString(strIconCompatParcelizer, String.valueOf(getyek5ggoq.MediaDescriptionCompat()));
            } else if (getyek5ggoq.read()) {
                bundle2.putString(strIconCompatParcelizer, getyek5ggoq.RatingCompat());
            } else if (getyek5ggoq.MediaBrowserCompatMediaItem()) {
                bundle2.putString(strIconCompatParcelizer, String.valueOf(getyek5ggoq.MediaMetadataCompat()));
            }
        }
        RemoteActionCompatParcelizer(builder, setcomposedwithreusablecontenthost.read(str, premeasure0kLqBqw.initializeViewTreeOwners).split("\\|"), bundle2, setUnmodifiableSet);
        if (true != ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).addOnNewIntentListener()) {
            str7 = "0";
        }
        serializer(builder, "dma", str7, setUnmodifiableSet);
        if (!((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).addMenuProvider().isEmpty()) {
            serializer(builder, "dma_cps", ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).addMenuProvider(), setUnmodifiableSet);
        }
        if (((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).getActivityResultRegistry()) {
            getTvInputHdmi1EK5gGoQ defaultViewModelCreationExtras = ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).getDefaultViewModelCreationExtras();
            if (!defaultViewModelCreationExtras.MediaDescriptionCompat().isEmpty()) {
                serializer(builder, "dl_gclid", defaultViewModelCreationExtras.MediaDescriptionCompat(), setUnmodifiableSet);
            }
            if (!defaultViewModelCreationExtras.MediaSessionCompatToken().isEmpty()) {
                serializer(builder, "dl_gbraid", defaultViewModelCreationExtras.MediaSessionCompatToken(), setUnmodifiableSet);
            }
            if (!defaultViewModelCreationExtras.ParcelableVolumeInfo().isEmpty()) {
                serializer(builder, "dl_gs", defaultViewModelCreationExtras.ParcelableVolumeInfo(), setUnmodifiableSet);
            }
            if (defaultViewModelCreationExtras.MediaSessionCompatResultReceiverWrapper() > 0) {
                serializer(builder, "dl_ss_ts", String.valueOf(defaultViewModelCreationExtras.MediaSessionCompatResultReceiverWrapper()), setUnmodifiableSet);
            }
            if (!defaultViewModelCreationExtras.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().isEmpty()) {
                serializer(builder, "mr_gclid", defaultViewModelCreationExtras.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(), setUnmodifiableSet);
            }
            if (!defaultViewModelCreationExtras.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().isEmpty()) {
                serializer(builder, "mr_gbraid", defaultViewModelCreationExtras.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), setUnmodifiableSet);
            }
            if (!defaultViewModelCreationExtras.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().isEmpty()) {
                serializer(builder, "mr_gs", defaultViewModelCreationExtras.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8(), setUnmodifiableSet);
            }
            if (defaultViewModelCreationExtras.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() > 0) {
                serializer(builder, "mr_click_ts", String.valueOf(defaultViewModelCreationExtras.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()), setUnmodifiableSet);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public static final Serializable read(getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq, String str) {
        getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoqWrite = write(gettvterrestrialdigitalek5ggoq, str);
        if (gettvsatelliteserviceek5ggoqWrite == null) {
            return null;
        }
        return RemoteActionCompatParcelizer(gettvsatelliteserviceek5ggoqWrite);
    }

    public static boolean write(onPreFlingQWom1MosuspendImpl onpreflingqwom1mosuspendimpl, int i) {
        if (i < onpreflingqwom1mosuspendimpl.size() * 64) {
            return ((1 << (i % 64)) & ((Long) onpreflingqwom1mosuspendimpl.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList serializer(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public boolean read(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public void read(String str, OnLayoutRectChangedElement onLayoutRectChangedElement, getUEK5gGoQ getuek5ggoq, LookaheadLayoutCoordinatesKt lookaheadLayoutCoordinatesKt) {
        String str2 = onLayoutRectChangedElement.write;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        ComponentActivity();
        try {
            URL url = new URI(str2).toURL();
            this.MediaSessionCompatToken.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            byte[] bArrRemoveOnUserLeaveHintListener = getuek5ggoq.removeOnUserLeaveHintListener();
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            Map map = onLayoutRectChangedElement.read;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            lookaheadScopeKtLookaheadScope4.serializer((Runnable) new LookaheadScope(this, str, url, bArrRemoveOnUserLeaveHintListener, map, lookaheadLayoutCoordinatesKt));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer("Failed to parse URL. Not uploading MeasurementBatch. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), str2);
        }
    }
}
