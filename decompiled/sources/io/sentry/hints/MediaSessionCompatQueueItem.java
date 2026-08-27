package io.sentry.hints;

import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.airbnb.lottie.PerformanceTracker;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.logistics.rider.glovo.R;
import com.sentiance.core.model.events.I$b;
import com.ui.common.widget.message_dialog.MessageDialogFragment;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4;
import o.getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations;
import o.getBitmapFromCache;
import o.getDefaultNotificationAccentColorandroid_sdk_base_release;
import o.getDeviceObjectAllowlistandroid_sdk_base_release;
import o.getHandlePushDeepLinksAutomaticallyandroid_sdk_base_release;
import o.getInAppMessageTestPushEagerDisplayEnabledandroid_sdk_base_release;
import o.getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release;
import o.getLargeNotificationIconNameandroid_sdk_base_release;
import o.getLowestValueslo4al4;
import o.getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release;
import o.getSdkFlavorandroid_sdk_base_release;
import o.getServerTargetandroid_sdk_base_release;
import o.getSessionTimeoutandroid_sdk_base_release;
import o.getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release;
import o.getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release;
import o.getTriggerActionMinimumTimeIntervalSecondsandroid_sdk_base_release;
import o.isAutomaticLocationCollectionEnabledandroid_sdk_base_release;
import o.isDeviceObjectAllowlistEnabledandroid_sdk_base_release;
import o.isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release;
import o.isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release;
import o.isFirebaseMessagingServiceOnNewTokenRegistrationEnabledandroid_sdk_base_release;
import o.isPushHtmlRenderingEnabledandroid_sdk_base_release;
import o.isPushWakeScreenForNotificationEnabledandroid_sdk_base_release;
import o.isSdkAuthEnabledandroid_sdk_base_release;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0;
import o.r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs;
import o.r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0;
import o.r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM;
import o.r8lambdadeOzq815xUUwmlLYYvm_QV79QY;
import o.r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4;
import o.r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls;
import o.removeFromSubscriptionGrouplambda0;
import o.setAdmMessagingRegistrationEnabled;
import o.setAdmMessagingRegistrationEnabledandroid_sdk_base_release;
import o.setApiKey;
import o.setApiKeyandroid_sdk_base_release;
import o.setAutomaticGeofenceRequestsEnabled;
import o.setContentCardsUnreadVisualIndicatorEnabled;
import o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release;
import o.setCustomUserAttributelambda5;
import o.setCustomWebViewActivityClass;
import o.setDeviceObjectAllowlistEnabledandroid_sdk_base_release;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatQueueItem implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0, MediaBrowserCompatMediaItem {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public static int serializer(int i, int i2, int i3) {
        int i4 = 1;
        while (i3 >= 32) {
            i4 = (int) ((((((long) (i2 * i4)) & 4294967295L) * ((long) i)) + ((long) i4)) >>> 32);
            i3 -= 32;
        }
        if (i3 <= 0) {
            return i4;
        }
        return (int) ((((((long) ((i2 * i4) & ((-1) >>> (-i3)))) & 4294967295L) * ((long) i)) + ((long) i4)) >>> i3);
    }

    public MediaSessionCompatQueueItem(int i) {
        int i2;
        this.RemoteActionCompatParcelizer = 16;
        HashMap map = new HashMap();
        int i3 = i - 2;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = -i;
        int i5 = (2 - (i4 * i4)) * i4;
        int i6 = (2 - (i4 * i5)) * i5;
        int i7 = (2 - (i4 * i6)) * i6;
        int i8 = (2 - (i4 * i7)) * i7;
        for (int i9 = 1; i9 < 32 - iNumberOfLeadingZeros; i9++) {
            int i10 = 1 << (i9 - 1);
            if (i10 >= 64 && !map.containsKey(Integer.valueOf(i10))) {
                map.put(Integer.valueOf(i10), Integer.valueOf(serializer(i, i8, i10)));
            }
            int i11 = 1 << i9;
            if ((i3 & i11) != 0 && (i2 = (i11 - 1) & i3) >= 64 && !map.containsKey(Integer.valueOf(i2))) {
                map.put(Integer.valueOf(i2), Integer.valueOf(serializer(i, i8, i2)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        int i = 10;
        int i2 = 6;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i3 = 12;
        switch (this.RemoteActionCompatParcelizer) {
            case 1:
                I$b i$b = new I$b(0);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    if (b == 0) {
                        return i$b.write();
                    }
                    short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
                    if (s != 1) {
                        if (s != 2) {
                            if (s != 3) {
                                if (s != 4) {
                                    if (s != 5) {
                                        switch (s) {
                                            case 100:
                                                if (b != 6) {
                                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                                } else {
                                                    i$b.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                                                }
                                                break;
                                            case 101:
                                                if (b != 12) {
                                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                                } else {
                                                    i$b.RatingCompat = (isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release) isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                                }
                                                break;
                                            case 102:
                                                if (b != 12) {
                                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                                    break;
                                                } else {
                                                    r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                                                    while (true) {
                                                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                                        byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                                                        if (b2 == 0) {
                                                            if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer == null) {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
                                                                return null;
                                                            }
                                                            i$b.MediaMetadataCompat = new isPushHtmlRenderingEnabledandroid_sdk_base_release(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
                                                            break;
                                                        } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer != 1) {
                                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                                        } else if (b2 == 3) {
                                                            r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                                        } else {
                                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                                        }
                                                    }
                                                }
                                                break;
                                            case 103:
                                                if (b != 12) {
                                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                                    break;
                                                } else {
                                                    r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2 = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                                                    while (true) {
                                                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                                        byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                                                        if (b3 == 0) {
                                                            if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2.serializer == null) {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
                                                                return null;
                                                            }
                                                            i$b.MediaBrowserCompatMediaItem = new isPushWakeScreenForNotificationEnabledandroid_sdk_base_release(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2);
                                                            break;
                                                        } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer != 1) {
                                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                                        } else if (b3 == 3) {
                                                            r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                                        } else {
                                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                                        }
                                                    }
                                                }
                                                break;
                                            case 104:
                                                if (b != 12) {
                                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                                    break;
                                                } else {
                                                    r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm3 = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                                                    while (true) {
                                                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                                        byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                                                        if (b4 == 0) {
                                                            if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm3.serializer == null) {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
                                                                return null;
                                                            }
                                                            i$b.MediaSessionCompatResultReceiverWrapper = new setAdmMessagingRegistrationEnabledandroid_sdk_base_release(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm3);
                                                            break;
                                                        } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer != 1) {
                                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                                        } else if (b4 == 3) {
                                                            r8lambdaxdc9yg9rrx23qvlbekkfzieitwm3.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                                        } else {
                                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                                        }
                                                    }
                                                }
                                                break;
                                            case 105:
                                                if (b != 12) {
                                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                                    break;
                                                } else {
                                                    r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm4 = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                                                    while (true) {
                                                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                                        byte b5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.RemoteActionCompatParcelizer;
                                                        if (b5 == 0) {
                                                            if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm4.serializer == null) {
                                                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
                                                                return null;
                                                            }
                                                            i$b.PlaybackStateCompat = new isSdkAuthEnabledandroid_sdk_base_release(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm4);
                                                            break;
                                                        } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.serializer != 1) {
                                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                                        } else if (b5 == 3) {
                                                            r8lambdaxdc9yg9rrx23qvlbekkfzieitwm4.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                                        } else {
                                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                                        }
                                                    }
                                                }
                                                break;
                                            case GwiErrorCode.ALG_LIBRARY_NOT_EXIST /* 106 */:
                                                if (b != 12) {
                                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                                } else {
                                                    i$b.MediaSessionCompatQueueItem = (getSessionTimeoutandroid_sdk_base_release) getSessionTimeoutandroid_sdk_base_release.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                                }
                                                break;
                                            default:
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                                break;
                                        }
                                    } else if (b == 12) {
                                        i$b.MediaDescriptionCompat = (getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release) getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                    }
                                } else if (b == 12) {
                                    i$b.RemoteActionCompatParcelizer = (getHandlePushDeepLinksAutomaticallyandroid_sdk_base_release) getHandlePushDeepLinksAutomaticallyandroid_sdk_base_release.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                }
                            } else if (b == 12) {
                                i$b.serializer = (getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release) getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                        } else if (b == 12) {
                            i$b.read = (getServerTargetandroid_sdk_base_release) getServerTargetandroid_sdk_base_release.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 12) {
                        i$b.IconCompatParcelizer = (getLargeNotificationIconNameandroid_sdk_base_release) getLargeNotificationIconNameandroid_sdk_base_release.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                }
                break;
            case 2:
                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(objArr == true ? 1 : 0, 8);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.RemoteActionCompatParcelizer;
                    if (b6 == 0) {
                        return r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer();
                    }
                    short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.serializer;
                    if (s2 != 1) {
                        if (s2 != 2) {
                            if (s2 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            } else if (b6 == 3) {
                                r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                        } else if (b6 == 13) {
                            int i4 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                            HashMap map = new HashMap(i4);
                            int iWrite = 0;
                            while (iWrite < i4) {
                                iWrite = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite, 1);
                            }
                            r8lambdadeozq815xuuwmllyyvm_qv79qy.write = map;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        }
                    } else if (b6 == 10) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                    }
                }
                break;
            case 3:
                getInAppMessageTestPushEagerDisplayEnabledandroid_sdk_base_release getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release = new getInAppMessageTestPushEagerDisplayEnabledandroid_sdk_base_release();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.RemoteActionCompatParcelizer;
                    if (b7 == 0) {
                        if (getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.RemoteActionCompatParcelizer == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'x' is missing");
                            return null;
                        }
                        if (getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.IconCompatParcelizer == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'y' is missing");
                            return null;
                        }
                        if (getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.serializer != null) {
                            return new getLargeNotificationIconNameandroid_sdk_base_release(getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'z' is missing");
                        return null;
                    }
                    short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.serializer;
                    if (s3 != 1) {
                        if (s3 != 2) {
                            if (s3 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            } else if (b7 == 6) {
                                getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                        } else if (b7 == 6) {
                            getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                        }
                    } else if (b7 == 6) {
                        getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                    }
                }
                break;
            case 4:
                FormBody.Builder builder = new FormBody.Builder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.RemoteActionCompatParcelizer;
                    if (b8 == 0) {
                        if (((Byte) builder.serializer) != null) {
                            return new getSessionTimeoutandroid_sdk_base_release(builder);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
                        return null;
                    }
                    short s4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.serializer;
                    if (s4 != 1) {
                        if (s4 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                        } else if (b8 == 12) {
                            builder.RemoteActionCompatParcelizer = (getSdkFlavorandroid_sdk_base_release) getSdkFlavorandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                        }
                    } else if (b8 == 3) {
                        builder.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                    }
                }
                break;
            case 5:
                PerformanceTracker performanceTracker = new PerformanceTracker(i2, objArr2 == true ? 1 : 0);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.RemoteActionCompatParcelizer;
                    if (b9 == 0) {
                        return new getTriggerActionMinimumTimeIntervalSecondsandroid_sdk_base_release(performanceTracker);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    } else if (b9 == 13) {
                        int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map2 = new HashMap(i5);
                        int iWrite2 = 0;
                        while (iWrite2 < i5) {
                            iWrite2 = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map2, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite2, 1);
                        }
                        performanceTracker.IconCompatParcelizer = map2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    }
                }
                break;
            case 6:
                PerformanceTracker performanceTracker2 = new PerformanceTracker(i, objArr3 == true ? 1 : 0);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.RemoteActionCompatParcelizer;
                    if (b10 == 0) {
                        return new isDeviceObjectAllowlistEnabledandroid_sdk_base_release(performanceTracker2);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    } else if (b10 == 13) {
                        int i6 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map3 = new HashMap(i6);
                        int iWrite3 = 0;
                        while (iWrite3 < i6) {
                            iWrite3 = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map3, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite3, 1);
                        }
                        performanceTracker2.IconCompatParcelizer = map3;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    }
                }
                break;
            case 7:
                PerformanceTracker performanceTracker3 = new PerformanceTracker(i3, objArr4 == true ? 1 : 0);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.RemoteActionCompatParcelizer;
                    if (b11 == 0) {
                        return new isAutomaticLocationCollectionEnabledandroid_sdk_base_release(performanceTracker3);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    } else if (b11 == 13) {
                        int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map4 = new HashMap(i7);
                        int iWrite4 = 0;
                        while (iWrite4 < i7) {
                            iWrite4 = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map4, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite4, 1);
                        }
                        performanceTracker3.IconCompatParcelizer = map4;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    }
                }
                break;
            case 8:
                PerformanceTracker performanceTracker4 = new PerformanceTracker(15, z);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.RemoteActionCompatParcelizer;
                    if (b12 == 0) {
                        return new isFirebaseMessagingServiceOnNewTokenRegistrationEnabledandroid_sdk_base_release(performanceTracker4);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                    } else if (b12 == 13) {
                        int i8 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map5 = new HashMap(i8);
                        int iWrite5 = 0;
                        while (iWrite5 < i8) {
                            iWrite5 = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map5, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite5, 1);
                        }
                        performanceTracker4.IconCompatParcelizer = map5;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                    }
                }
                break;
            case 9:
                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm5 = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b13 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.RemoteActionCompatParcelizer;
                    if (b13 == 0) {
                        if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm5.serializer != null) {
                            return new isPushWakeScreenForNotificationEnabledandroid_sdk_base_release(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm5);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                    } else if (b13 == 3) {
                        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm5.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                    }
                }
                break;
            case 10:
                setApiKey setapikey = new setApiKey();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b14 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.RemoteActionCompatParcelizer;
                    if (b14 == 0) {
                        if (setapikey.RemoteActionCompatParcelizer == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'peak_threshold' is missing");
                            return null;
                        }
                        if (setapikey.read != null) {
                            return new setAdmMessagingRegistrationEnabled(setapikey);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'min_peak_timespan' is missing");
                        return null;
                    }
                    short s5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.serializer;
                    if (s5 != 1) {
                        if (s5 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                        } else if (b14 == 6) {
                            setapikey.read = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                        }
                    } else if (b14 == 6) {
                        setapikey.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                    }
                }
                break;
            case 11:
                FormBody.Builder builder2 = new FormBody.Builder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b15 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.RemoteActionCompatParcelizer;
                    if (b15 == 0) {
                        if (((Short) builder2.serializer) == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'interval_secs' is missing");
                            return null;
                        }
                        if (((Short) builder2.RemoteActionCompatParcelizer) != null) {
                            return new setAutomaticGeofenceRequestsEnabled(builder2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'duration_secs' is missing");
                        return null;
                    }
                    short s6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.serializer;
                    if (s6 != 1) {
                        if (s6 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                        } else if (b15 == 6) {
                            builder2.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                        }
                    } else if (b15 == 6) {
                        builder2.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                    }
                }
                break;
            case 12:
                r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b16 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.RemoteActionCompatParcelizer;
                    if (b16 == 0) {
                        return r8lambdayc78smgbbb6fudfjq0u5z3_ls.RatingCompat();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.serializer) {
                        case 1:
                            if (b16 != 12) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            } else {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = (r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4) r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            }
                            break;
                        case 2:
                            if (b16 != 12) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            } else {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = (setApiKeyandroid_sdk_base_release) setApiKeyandroid_sdk_base_release.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            }
                            break;
                        case 3:
                            if (b16 != 12) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            } else {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = (removeFromSubscriptionGrouplambda0) removeFromSubscriptionGrouplambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            }
                            break;
                        case 4:
                            if (b16 != 12) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            } else {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = (getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            }
                            break;
                        case 5:
                            if (b16 != 12) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            } else {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = (setCustomWebViewActivityClass) setCustomWebViewActivityClass.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            }
                            break;
                        case 6:
                            if (b16 != 12) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                                break;
                            } else {
                                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm6 = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b17 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.RemoteActionCompatParcelizer;
                                    if (b17 == 0) {
                                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.read = new setCustomUserAttributelambda5(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm6);
                                        break;
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                                    } else if (b17 == 3) {
                                        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm6.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                                    }
                                }
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            break;
                    }
                }
                break;
            case 13:
                setApiKey setapikey2 = new setApiKey();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b18 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.RemoteActionCompatParcelizer;
                    if (b18 == 0) {
                        return new setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release(setapikey2);
                    }
                    short s7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.serializer;
                    if (s7 != 1) {
                        if (s7 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                        } else if (b18 == 6) {
                            setapikey2.read = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                        }
                    } else if (b18 == 6) {
                        setapikey2.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                    }
                }
                break;
            default:
                BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b19 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.RemoteActionCompatParcelizer;
                    if (b19 == 0) {
                        return new setDeviceObjectAllowlistEnabledandroid_sdk_base_release(brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4);
                    }
                    short s8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.serializer;
                    if (s8 != 1) {
                        if (s8 != 2) {
                            if (s8 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                            } else if (b19 == 11) {
                                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                            }
                        } else if (b19 == 11) {
                            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                        }
                    } else if (b19 == 11) {
                        brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                    }
                }
                break;
        }
    }

    public static MessageDialogFragment IconCompatParcelizer(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = true;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            z3 = false;
        }
        int i2 = (i & Fields.RotationX) != 0 ? R.color.primary_button_background : R.color.warning_button_background;
        MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("TITLE", str);
        bundle.putString("DESCRIPTION_BUNDLE", str2);
        bundle.putString("MAIN_ACTION_BUNDLE", str3);
        bundle.putString("SECONDARY_ACTION_BUNDLE", str4);
        bundle.putString("SKIP_ACTION_BUNDLE", str5);
        bundle.putBoolean("SKIP", z);
        bundle.putBoolean("CANCELLABLE", z2);
        bundle.putBoolean("SHOULD_MAIN_ACTION_DISMISS", z3);
        bundle.putInt("BUTTON_BACKGROUND_COLOR", i2);
        messageDialogFragment.setArguments(bundle);
        return messageDialogFragment;
    }

    public /* synthetic */ MediaSessionCompatQueueItem(byte b, int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        byte b;
        int i;
        byte b2;
        byte b3;
        int i2;
        byte b4;
        byte b5;
        byte b6;
        switch (this.RemoteActionCompatParcelizer) {
            case 1:
                getDefaultNotificationAccentColorandroid_sdk_base_release getdefaultnotificationaccentcolorandroid_sdk_base_release = (getDefaultNotificationAccentColorandroid_sdk_base_release) obj;
                getLargeNotificationIconNameandroid_sdk_base_release getlargenotificationiconnameandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.read;
                getSessionTimeoutandroid_sdk_base_release getsessiontimeoutandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.PlaybackStateCompatCustomAction;
                isSdkAuthEnabledandroid_sdk_base_release issdkauthenabledandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.PlaybackStateCompat;
                setAdmMessagingRegistrationEnabledandroid_sdk_base_release setadmmessagingregistrationenabledandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.ParcelableVolumeInfo;
                isPushWakeScreenForNotificationEnabledandroid_sdk_base_release ispushwakescreenfornotificationenabledandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.MediaDescriptionCompat;
                isPushHtmlRenderingEnabledandroid_sdk_base_release ispushhtmlrenderingenabledandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.MediaSessionCompatQueueItem;
                isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release isfirebasecloudmessagingregistrationenabledandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.RatingCompat;
                Short sh = getdefaultnotificationaccentcolorandroid_sdk_base_release.MediaMetadataCompat;
                getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.MediaBrowserCompatMediaItem;
                getHandlePushDeepLinksAutomaticallyandroid_sdk_base_release gethandlepushdeeplinksautomaticallyandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.RemoteActionCompatParcelizer;
                getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release getpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.serializer;
                getServerTargetandroid_sdk_base_release getservertargetandroid_sdk_base_release = getdefaultnotificationaccentcolorandroid_sdk_base_release.write;
                if (getlargenotificationiconnameandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    getLargeNotificationIconNameandroid_sdk_base_release getlargenotificationiconnameandroid_sdk_base_release2 = getdefaultnotificationaccentcolorandroid_sdk_base_release.read;
                    b = 6;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                    o.IconCompatParcelizer.read((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, getlargenotificationiconnameandroid_sdk_base_release2.serializer);
                    o.IconCompatParcelizer.read((byte) 6, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, getlargenotificationiconnameandroid_sdk_base_release2.read);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getlargenotificationiconnameandroid_sdk_base_release2.write.shortValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b = 6;
                }
                if (getservertargetandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b);
                    o.IconCompatParcelizer.read(b, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, getservertargetandroid_sdk_base_release.IconCompatParcelizer);
                    i = 3;
                    o.IconCompatParcelizer.read(b, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, getservertargetandroid_sdk_base_release.read);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getservertargetandroid_sdk_base_release.serializer.shortValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i = 3;
                }
                if (getpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b);
                    o.IconCompatParcelizer.read(b, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, getpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release.write);
                    o.IconCompatParcelizer.read(b, i, r8lambdat7xjd1d4humw0psb7whucfgonss, getpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release.RemoteActionCompatParcelizer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release.IconCompatParcelizer.shortValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (gethandlepushdeeplinksautomaticallyandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b);
                    o.IconCompatParcelizer.read(b, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, gethandlepushdeeplinksautomaticallyandroid_sdk_base_release.serializer);
                    o.IconCompatParcelizer.read(b, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, gethandlepushdeeplinksautomaticallyandroid_sdk_base_release.write);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(gethandlepushdeeplinksautomaticallyandroid_sdk_base_release.RemoteActionCompatParcelizer.shortValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 12);
                    getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release);
                }
                if (sh != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 100, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
                }
                if (isfirebasecloudmessagingregistrationenabledandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(101, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    Byte b7 = isfirebasecloudmessagingregistrationenabledandroid_sdk_base_release.write;
                    String str = isfirebasecloudmessagingregistrationenabledandroid_sdk_base_release.IconCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b7.byteValue());
                    isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release isfallbackfirebasemessagingserviceenabledandroid_sdk_base_release = isfirebasecloudmessagingregistrationenabledandroid_sdk_base_release.read;
                    if (isfallbackfirebasemessagingserviceenabledandroid_sdk_base_release != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                        isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, isfallbackfirebasemessagingserviceenabledandroid_sdk_base_release);
                    }
                    if (str != null) {
                        b3 = 3;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
                    } else {
                        b3 = 3;
                    }
                    b2 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b2 = 0;
                    b3 = 3;
                }
                if (ispushhtmlrenderingenabledandroid_sdk_base_release != null) {
                    b4 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(102, (byte) 12);
                    i2 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b3);
                    o.IconCompatParcelizer.IconCompatParcelizer(ispushhtmlrenderingenabledandroid_sdk_base_release.read, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                } else {
                    i2 = 1;
                    b4 = 12;
                }
                if (ispushwakescreenfornotificationenabledandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(103, b4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b3);
                    o.IconCompatParcelizer.IconCompatParcelizer(ispushwakescreenfornotificationenabledandroid_sdk_base_release.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                }
                if (setadmmessagingregistrationenabledandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(104, b4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b3);
                    o.IconCompatParcelizer.IconCompatParcelizer(setadmmessagingregistrationenabledandroid_sdk_base_release.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                }
                if (issdkauthenabledandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(105, b4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b3);
                    o.IconCompatParcelizer.IconCompatParcelizer(issdkauthenabledandroid_sdk_base_release.read, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                }
                if (getsessiontimeoutandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(GwiErrorCode.ALG_LIBRARY_NOT_EXIST, b4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getsessiontimeoutandroid_sdk_base_release.IconCompatParcelizer.byteValue());
                    getSdkFlavorandroid_sdk_base_release getsdkflavorandroid_sdk_base_release = getsessiontimeoutandroid_sdk_base_release.write;
                    if (getsdkflavorandroid_sdk_base_release != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b4);
                        getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release getshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release = getsdkflavorandroid_sdk_base_release.RemoteActionCompatParcelizer;
                        getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release getshouldusewindowflagsecureinactivitiesandroid_sdk_base_release = getsdkflavorandroid_sdk_base_release.read;
                        if (getshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b4);
                            b5 = 0;
                            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                        } else {
                            b5 = 0;
                        }
                        if (getshouldusewindowflagsecureinactivitiesandroid_sdk_base_release != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b4);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b5);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b5);
                    } else {
                        b5 = 0;
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b5);
                } else {
                    b5 = 0;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b5);
                break;
            case 2:
                getDeviceObjectAllowlistandroid_sdk_base_release getdeviceobjectallowlistandroid_sdk_base_release = (getDeviceObjectAllowlistandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                Long l = getdeviceobjectallowlistandroid_sdk_base_release.serializer;
                Byte b8 = getdeviceobjectallowlistandroid_sdk_base_release.IconCompatParcelizer;
                o.IconCompatParcelizer.serializer(l, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 13);
                Iterator itWrite = o.MediaSessionCompatQueueItem.write(getdeviceobjectallowlistandroid_sdk_base_release.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                while (itWrite.hasNext()) {
                    Map.Entry entry = (Map.Entry) itWrite.next();
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
                }
                if (b8 != null) {
                    getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 3:
                getLargeNotificationIconNameandroid_sdk_base_release getlargenotificationiconnameandroid_sdk_base_release3 = (getLargeNotificationIconNameandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                o.IconCompatParcelizer.read((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, getlargenotificationiconnameandroid_sdk_base_release3.serializer);
                o.IconCompatParcelizer.read((byte) 6, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, getlargenotificationiconnameandroid_sdk_base_release3.read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getlargenotificationiconnameandroid_sdk_base_release3.write.shortValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 4:
                getSessionTimeoutandroid_sdk_base_release getsessiontimeoutandroid_sdk_base_release2 = (getSessionTimeoutandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getsessiontimeoutandroid_sdk_base_release2.IconCompatParcelizer.byteValue());
                getSdkFlavorandroid_sdk_base_release getsdkflavorandroid_sdk_base_release2 = getsessiontimeoutandroid_sdk_base_release2.write;
                if (getsdkflavorandroid_sdk_base_release2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release getshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release2 = getsdkflavorandroid_sdk_base_release2.RemoteActionCompatParcelizer;
                    getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release getshouldusewindowflagsecureinactivitiesandroid_sdk_base_release2 = getsdkflavorandroid_sdk_base_release2.read;
                    if (getshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release2 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                    if (getshouldusewindowflagsecureinactivitiesandroid_sdk_base_release2 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 5:
                Map map = ((getTriggerActionMinimumTimeIntervalSecondsandroid_sdk_base_release) obj).RemoteActionCompatParcelizer;
                if (map != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite2 = o.MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) itWrite2.next();
                        String str4 = (String) entry2.getKey();
                        String str5 = (String) entry2.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str5);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 6:
                Map map2 = ((isDeviceObjectAllowlistEnabledandroid_sdk_base_release) obj).RemoteActionCompatParcelizer;
                if (map2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite3 = o.MediaSessionCompatQueueItem.write(map2, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) itWrite3.next();
                        String str6 = (String) entry3.getKey();
                        String str7 = (String) entry3.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str6);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str7);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 7:
                Map map3 = ((isAutomaticLocationCollectionEnabledandroid_sdk_base_release) obj).RemoteActionCompatParcelizer;
                if (map3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite4 = o.MediaSessionCompatQueueItem.write(map3, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite4.hasNext()) {
                        Map.Entry entry4 = (Map.Entry) itWrite4.next();
                        String str8 = (String) entry4.getKey();
                        String str9 = (String) entry4.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str8);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str9);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 8:
                Map map4 = ((isFirebaseMessagingServiceOnNewTokenRegistrationEnabledandroid_sdk_base_release) obj).serializer;
                if (map4 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite5 = o.MediaSessionCompatQueueItem.write(map4, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite5.hasNext()) {
                        Map.Entry entry5 = (Map.Entry) itWrite5.next();
                        String str10 = (String) entry5.getKey();
                        String str11 = (String) entry5.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str10);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str11);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 9:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                o.IconCompatParcelizer.IconCompatParcelizer(((isPushWakeScreenForNotificationEnabledandroid_sdk_base_release) obj).serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
                break;
            case 10:
                setAdmMessagingRegistrationEnabled setadmmessagingregistrationenabled = (setAdmMessagingRegistrationEnabled) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                o.IconCompatParcelizer.read((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, setadmmessagingregistrationenabled.RemoteActionCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setadmmessagingregistrationenabled.IconCompatParcelizer.shortValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 11:
                setAutomaticGeofenceRequestsEnabled setautomaticgeofencerequestsenabled = (setAutomaticGeofenceRequestsEnabled) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                o.IconCompatParcelizer.read((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, setautomaticgeofencerequestsenabled.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setautomaticgeofencerequestsenabled.serializer.shortValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 12:
                setContentCardsUnreadVisualIndicatorEnabled setcontentcardsunreadvisualindicatorenabled = (setContentCardsUnreadVisualIndicatorEnabled) obj;
                r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 r8lambdasscpazklpwhzf7qziwqx9zu4wp4 = setcontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
                setCustomUserAttributelambda5 setcustomuserattributelambda5 = setcontentcardsunreadvisualindicatorenabled.MediaDescriptionCompat;
                setCustomWebViewActivityClass setcustomwebviewactivityclass = setcontentcardsunreadvisualindicatorenabled.MediaMetadataCompat;
                getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations getbraze_push_delivery_flush_min_keyannotations = setcontentcardsunreadvisualindicatorenabled.serializer;
                removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda0 = setcontentcardsunreadvisualindicatorenabled.read;
                setApiKeyandroid_sdk_base_release setapikeyandroid_sdk_base_release = setcontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
                if (r8lambdasscpazklpwhzf7qziwqx9zu4wp4 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcontentcardsunreadvisualindicatorenabled.IconCompatParcelizer);
                }
                if (setapikeyandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                    Long l2 = setapikeyandroid_sdk_base_release.serializer;
                    Byte b9 = setapikeyandroid_sdk_base_release.read;
                    o.IconCompatParcelizer.serializer(l2, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(setapikeyandroid_sdk_base_release.RemoteActionCompatParcelizer.value);
                    Byte b10 = setapikeyandroid_sdk_base_release.IconCompatParcelizer;
                    if (b10 != null) {
                        getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    }
                    if (b9 != null) {
                        getBitmapFromCache.read((byte) 3, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (removefromsubscriptiongrouplambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
                    removeFromSubscriptionGrouplambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, removefromsubscriptiongrouplambda0);
                }
                if (getbraze_push_delivery_flush_min_keyannotations != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
                    getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, getbraze_push_delivery_flush_min_keyannotations);
                }
                if (setcustomwebviewactivityclass != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 12);
                    setCustomWebViewActivityClass.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomwebviewactivityclass);
                }
                if (setcustomuserattributelambda5 != null) {
                    Byte b11 = setcustomuserattributelambda5.RemoteActionCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 12);
                    if (b11 != null) {
                        getBitmapFromCache.read((byte) 3, 1, r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 13:
                setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release = (setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release) obj;
                Short sh2 = setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release.IconCompatParcelizer;
                Short sh3 = setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release.write;
                if (sh2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release.IconCompatParcelizer.shortValue());
                }
                if (sh3 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh3);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            default:
                setDeviceObjectAllowlistEnabledandroid_sdk_base_release setdeviceobjectallowlistenabledandroid_sdk_base_release = (setDeviceObjectAllowlistEnabledandroid_sdk_base_release) obj;
                String str12 = setdeviceobjectallowlistenabledandroid_sdk_base_release.RemoteActionCompatParcelizer;
                String str13 = setdeviceobjectallowlistenabledandroid_sdk_base_release.write;
                String str14 = setdeviceobjectallowlistenabledandroid_sdk_base_release.read;
                if (str12 != null) {
                    b6 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setdeviceobjectallowlistenabledandroid_sdk_base_release.RemoteActionCompatParcelizer);
                } else {
                    b6 = 11;
                }
                if (str14 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b6);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str14);
                }
                if (str13 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b6);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str13);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
        }
    }
}
