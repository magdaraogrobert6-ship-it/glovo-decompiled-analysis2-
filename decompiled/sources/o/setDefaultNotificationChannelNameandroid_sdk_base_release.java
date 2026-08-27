package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sentiance.core.model.events.E$b;
import com.sentiance.okhttp3.u$a;
import io.sentry.util.network.NetworkBody;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class setDefaultNotificationChannelNameandroid_sdk_base_release implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ setDefaultNotificationChannelNameandroid_sdk_base_release(int i) {
        this.IconCompatParcelizer = i;
    }

    public static final Field RemoteActionCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(RemoteMessageConst.Notification.TAG);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception unused) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, ff$$ExternalSyntheticOutline0.m("Could not load ", str, ".tag field"), new Object[0]);
            return null;
        }
    }

    public static final String read(RequestBuilder requestBuilder, RequestBuilder[] requestBuilderArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        RequestBuilder requestBuilder2 = PublicSuffixDatabase.serializer;
        int iSerializer = requestBuilder.serializer();
        int i5 = 0;
        while (i5 < iSerializer) {
            int i6 = (i5 + iSerializer) / 2;
            while (i6 > -1 && requestBuilder.write(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (requestBuilder.write(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bWrite = requestBuilderArr[i10].write(i11);
                    byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
                    int i13 = bWrite & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bWrite2 = requestBuilder.write(i7 + i12);
                byte[] bArr2 = InAppMessageHtmlBaseViewCompanion.read;
                i4 = i3 - (bWrite2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (requestBuilderArr[i10].serializer() != i11) {
                    z2 = z;
                } else {
                    if (i10 == requestBuilderArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iSerializer2 = requestBuilderArr[i10].serializer() - i11;
                    int length = requestBuilderArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iSerializer2 += requestBuilderArr[i15].serializer();
                    }
                    if (iSerializer2 >= i14) {
                        if (iSerializer2 <= i14) {
                            return requestBuilder.read(i7, i9 + i7).serializer(ensureSubscribedToInAppMessageEvents.write);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iSerializer = i6;
        }
        return null;
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        int i = 14;
        int i2 = 15;
        int i3 = 11;
        int i4 = 13;
        boolean z = false;
        switch (this.IconCompatParcelizer) {
            case 0:
                FormBody.Builder builder = new FormBody.Builder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    if (b == 0) {
                        if (((setLocationCustomAttribute) builder.serializer) == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'app' is missing");
                            return null;
                        }
                        if (((setCustomEndpoint) builder.RemoteActionCompatParcelizer) != null) {
                            return new setDefaultNotificationChannelDescription(builder);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'person' is missing");
                        return null;
                    }
                    short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
                    if (s != 1) {
                        if (s != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        } else if (b == 12) {
                            r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(i4);
                            while (true) {
                                r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                                if (b2 == 0) {
                                    builder.RemoteActionCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer();
                                } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer != 1) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                } else if (b2 == 11) {
                                    r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                }
                            }
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 12) {
                        builder.serializer = (setLocationCustomAttribute) setLocationCustomAttribute.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                }
                break;
            case 1:
                u$a u_a = new u$a();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                    if (b3 == 0) {
                        return new getCustomLocationProviderNamesandroid_sdk_base_release(u_a);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                    } else if (b3 == 15) {
                        int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList = new ArrayList(i5);
                        for (int i6 = 0; i6 < i5; i6++) {
                            NetworkBody networkBody = new NetworkBody(16);
                            while (true) {
                                r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                                if (b4 == 0) {
                                }
                                short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer;
                                if (s2 != 1) {
                                    if (s2 != 2) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                    } else if (b4 == 12) {
                                        networkBody.RemoteActionCompatParcelizer = (setCountrylambda0) setCountrylambda0.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                    }
                                } else if (b4 == 12) {
                                    networkBody.IconCompatParcelizer = (setBadNetworkIntervalandroid_sdk_base_release) setBadNetworkIntervalandroid_sdk_base_release.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                }
                                break;
                            }
                            arrayList.add(networkBody.RemoteActionCompatParcelizer());
                        }
                        u_a.IconCompatParcelizer = arrayList;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                    }
                }
                break;
            case 2:
                BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.RemoteActionCompatParcelizer;
                    if (b5 == 0) {
                        return brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.read();
                    }
                    short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.serializer;
                    if (s3 != 1) {
                        if (s3 != 2) {
                            if (s3 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                            } else if (b5 == 11) {
                                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                            }
                        } else if (b5 == 11) {
                            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                        }
                    } else if (b5 == 11) {
                        brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                    }
                }
                break;
            case 3:
                E$b e$b = new E$b(i2);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.RemoteActionCompatParcelizer;
                    if (b6 == 0) {
                        return new getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release(e$b);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.serializer) {
                        case 1:
                            if (b6 == 12) {
                                e$b.read = (getGoodNetworkIntervalandroid_sdk_base_release) getGoodNetworkIntervalandroid_sdk_base_release.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 2:
                            if (b6 == 15) {
                                int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList2 = new ArrayList(i7);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    arrayList2.add((getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release) getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                e$b.IconCompatParcelizer = arrayList2;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 3:
                            if (b6 == 6) {
                                e$b.MediaDescriptionCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 4:
                            if (b6 == 3) {
                                e$b.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 5:
                            if (b6 == 6) {
                                e$b.MediaBrowserCompatMediaItem = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 6:
                            if (b6 == 6) {
                                e$b.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 7:
                            if (b6 == 6) {
                                e$b.MediaMetadataCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            break;
                    }
                }
                break;
            case 4:
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
                            return new getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release(getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'z' is missing");
                        return null;
                    }
                    short s4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.serializer;
                    if (s4 != 1) {
                        if (s4 != 2) {
                            if (s4 != 3) {
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
            case 5:
                break;
            case 6:
                com.airbnb.lottie.PerformanceTracker performanceTracker = new com.airbnb.lottie.PerformanceTracker(9, z);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.RemoteActionCompatParcelizer;
                    if (b8 == 0) {
                        return new getShouldOptInWhenPushAuthorizedandroid_sdk_base_release(performanceTracker);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                    } else if (b8 == 13) {
                        int i9 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map = new HashMap(i9);
                        int iWrite = 0;
                        while (iWrite < i9) {
                            iWrite = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite, 1);
                        }
                        performanceTracker.IconCompatParcelizer = map;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                    }
                }
                break;
            case 7:
                com.airbnb.lottie.PerformanceTracker performanceTracker2 = new com.airbnb.lottie.PerformanceTracker(i3, z);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.RemoteActionCompatParcelizer;
                    if (b9 == 0) {
                        return new isContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release(performanceTracker2);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    } else if (b9 == 13) {
                        int i10 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map2 = new HashMap(i10);
                        int iWrite2 = 0;
                        while (iWrite2 < i10) {
                            iWrite2 = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map2, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite2, 1);
                        }
                        performanceTracker2.IconCompatParcelizer = map2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    }
                }
                break;
            case 8:
                com.airbnb.lottie.PerformanceTracker performanceTracker3 = new com.airbnb.lottie.PerformanceTracker(i, z);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.RemoteActionCompatParcelizer;
                    if (b10 == 0) {
                        return new isGeofencesEnabledandroid_sdk_base_release(performanceTracker3);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    } else if (b10 == 13) {
                        int i11 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map3 = new HashMap(i11);
                        int iWrite3 = 0;
                        while (iWrite3 < i11) {
                            iWrite3 = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map3, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite3, 1);
                        }
                        performanceTracker3.IconCompatParcelizer = map3;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    }
                }
                break;
            case 9:
                com.airbnb.lottie.PerformanceTracker performanceTracker4 = new com.airbnb.lottie.PerformanceTracker(17, z);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.RemoteActionCompatParcelizer;
                    if (b11 == 0) {
                        return new isSessionStartBasedTimeoutEnabledandroid_sdk_base_release(performanceTracker4);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    } else if (b11 == 13) {
                        int i12 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map4 = new HashMap(i12);
                        int iWrite4 = 0;
                        while (iWrite4 < i12) {
                            iWrite4 = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map4, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite4, 1);
                        }
                        performanceTracker4.IconCompatParcelizer = map4;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    }
                }
                break;
            case 10:
                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.RemoteActionCompatParcelizer;
                    if (b12 == 0) {
                        if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer != null) {
                            return new setAdmMessagingRegistrationEnabledandroid_sdk_base_release(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                    } else if (b12 == 3) {
                        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                    }
                }
                break;
            case 11:
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(i);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b13 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.RemoteActionCompatParcelizer;
                    if (b13 == 0) {
                        if (((Long) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer) == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'segments_detection_time' is missing");
                            return null;
                        }
                        if (((ArrayList) iscontentcardsunreadvisualindicatorenabled.write) == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'segments' is missing");
                            return null;
                        }
                        if (((Long) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer) == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'fromMs' is missing");
                            return null;
                        }
                        if (((Long) iscontentcardsunreadvisualindicatorenabled.read) != null) {
                            return new setAutomaticLocationCollectionEnabledandroid_sdk_base_release(iscontentcardsunreadvisualindicatorenabled);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'toMs' is missing");
                        return null;
                    }
                    short s5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.serializer;
                    if (s5 != 1) {
                        if (s5 != 2) {
                            if (s5 != 3) {
                                if (s5 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                                } else if (b13 == 10) {
                                    iscontentcardsunreadvisualindicatorenabled.read = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                                }
                            } else if (b13 == 10) {
                                iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                            }
                        } else if (b13 == 15) {
                            int i13 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                            ArrayList arrayList3 = new ArrayList(i13);
                            for (int i14 = 0; i14 < i13; i14++) {
                                arrayList3.add((setBadNetworkDataFlushInterval) setBadNetworkDataFlushInterval.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            }
                            iscontentcardsunreadvisualindicatorenabled.write = arrayList3;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                        }
                    } else if (b13 == 10) {
                        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                    }
                }
                break;
            case 12:
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2 = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(i4);
                r8lambdat7xjd1d4humw0psb7whucfgonss.getClass();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b14 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.RemoteActionCompatParcelizer;
                    if (b14 == 0) {
                        return r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2.RemoteActionCompatParcelizer();
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                    } else if (b14 == 11) {
                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                    }
                }
                break;
            default:
                com.airbnb.lottie.PerformanceTracker performanceTracker5 = new com.airbnb.lottie.PerformanceTracker(18, z);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b15 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.RemoteActionCompatParcelizer;
                    if (b15 == 0) {
                        return new setCustomLocationProviderNames(performanceTracker5);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                    } else if (b15 == 13) {
                        int i15 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map5 = new HashMap(i15);
                        for (int i16 = 0; i16 < i15; i16++) {
                            map5.put(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()), Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction()));
                        }
                        performanceTracker5.IconCompatParcelizer = map5;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                    }
                }
                break;
        }
        while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
        }
        return new getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release();
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
        switch (this.IconCompatParcelizer) {
            case 0:
                setDefaultNotificationChannelDescription setdefaultnotificationchanneldescription = (setDefaultNotificationChannelDescription) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                setLocationCustomAttribute setlocationcustomattribute = setdefaultnotificationchanneldescription.IconCompatParcelizer;
                if (setlocationcustomattribute.serializer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlocationcustomattribute.serializer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                setCustomEndpoint setcustomendpoint = setdefaultnotificationchanneldescription.write;
                if (setcustomendpoint.RemoteActionCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint.RemoteActionCompatParcelizer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 1:
                List list = ((getCustomLocationProviderNamesandroid_sdk_base_release) obj).IconCompatParcelizer;
                if (list != null) {
                    Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 1, (byte) 15, list, (byte) 12);
                    while (itWrite.hasNext()) {
                        incrementCustomUserAttributedefault.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (incrementCustomUserAttributedefault) itWrite.next());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 2:
                getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release getfirebasecloudmessagingsenderidkeyandroid_sdk_base_release = (getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(getfirebasecloudmessagingsenderidkeyandroid_sdk_base_release.serializer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(getfirebasecloudmessagingsenderidkeyandroid_sdk_base_release.IconCompatParcelizer);
                String str = getfirebasecloudmessagingsenderidkeyandroid_sdk_base_release.read;
                if (str != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 3:
                getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release = (getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release) obj;
                getGoodNetworkIntervalandroid_sdk_base_release getgoodnetworkintervalandroid_sdk_base_release = getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release.IconCompatParcelizer;
                Short sh = getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release.RatingCompat;
                Short sh2 = getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release.MediaBrowserCompatMediaItem;
                Short sh3 = getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release.MediaSessionCompatQueueItem;
                Byte b = getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release.serializer;
                Short sh4 = getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release.RemoteActionCompatParcelizer;
                List list2 = getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release.read;
                if (getgoodnetworkintervalandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    getGoodNetworkIntervalandroid_sdk_base_release.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release.IconCompatParcelizer);
                }
                if (list2 != null) {
                    Iterator itWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 15, list2, (byte) 12);
                    while (itWrite2.hasNext()) {
                        getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release getfirebasecloudmessagingsenderidkeyandroid_sdk_base_release2 = (getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release) itWrite2.next();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(getfirebasecloudmessagingsenderidkeyandroid_sdk_base_release2.serializer);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(getfirebasecloudmessagingsenderidkeyandroid_sdk_base_release2.IconCompatParcelizer);
                        String str2 = getfirebasecloudmessagingsenderidkeyandroid_sdk_base_release2.read;
                        if (str2 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                }
                if (sh4 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, sh4);
                }
                if (b != null) {
                    getBitmapFromCache.read((byte) 3, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
                if (sh3 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, sh3);
                }
                if (sh2 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 6, r8lambdat7xjd1d4humw0psb7whucfgonss, sh2);
                }
                if (sh != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 7, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 4:
                getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release getpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release = (getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                IconCompatParcelizer.read((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, getpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release.write);
                IconCompatParcelizer.read((byte) 6, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, getpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release.RemoteActionCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getpushdeeplinkbackstackactivityclassnameandroid_sdk_base_release.IconCompatParcelizer.shortValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 5:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 6:
                Map map = ((getShouldOptInWhenPushAuthorizedandroid_sdk_base_release) obj).write;
                if (map != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite3 = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite3.hasNext()) {
                        Map.Entry entry = (Map.Entry) itWrite3.next();
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 7:
                Map map2 = ((isContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release) obj).write;
                if (map2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite4 = MediaSessionCompatQueueItem.write(map2, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) itWrite4.next();
                        String str5 = (String) entry2.getKey();
                        String str6 = (String) entry2.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str5);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str6);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 8:
                Map map3 = ((isGeofencesEnabledandroid_sdk_base_release) obj).read;
                if (map3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite5 = MediaSessionCompatQueueItem.write(map3, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite5.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) itWrite5.next();
                        String str7 = (String) entry3.getKey();
                        String str8 = (String) entry3.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str7);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str8);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 9:
                Map map4 = ((isSessionStartBasedTimeoutEnabledandroid_sdk_base_release) obj).serializer;
                if (map4 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite6 = MediaSessionCompatQueueItem.write(map4, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite6.hasNext()) {
                        Map.Entry entry4 = (Map.Entry) itWrite6.next();
                        String str9 = (String) entry4.getKey();
                        String str10 = (String) entry4.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str9);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str10);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 10:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                IconCompatParcelizer.IconCompatParcelizer(((setAdmMessagingRegistrationEnabledandroid_sdk_base_release) obj).serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
                break;
            case 11:
                setAutomaticLocationCollectionEnabledandroid_sdk_base_release setautomaticlocationcollectionenabledandroid_sdk_base_release = (setAutomaticLocationCollectionEnabledandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                IconCompatParcelizer.serializer(setautomaticlocationcollectionenabledandroid_sdk_base_release.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 15);
                List list3 = setautomaticlocationcollectionenabledandroid_sdk_base_release.write;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 12, list3.size());
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    setBadNetworkDataFlushInterval.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (setBadNetworkDataFlushInterval) it.next());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 10);
                IconCompatParcelizer.serializer(setautomaticlocationcollectionenabledandroid_sdk_base_release.read, r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 10);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setautomaticlocationcollectionenabledandroid_sdk_base_release.RemoteActionCompatParcelizer.longValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 12:
                setCustomEndpoint setcustomendpoint2 = (setCustomEndpoint) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.getClass();
                if (setcustomendpoint2.RemoteActionCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint2.RemoteActionCompatParcelizer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            default:
                Map map5 = ((setCustomLocationProviderNames) obj).serializer;
                if (map5 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite7 = MediaSessionCompatQueueItem.write(map5, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 6);
                    while (itWrite7.hasNext()) {
                        Map.Entry entry5 = (Map.Entry) itWrite7.next();
                        Byte b2 = (Byte) entry5.getKey();
                        Short sh5 = (Short) entry5.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b2.byteValue());
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(sh5.shortValue());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
        }
    }
}
