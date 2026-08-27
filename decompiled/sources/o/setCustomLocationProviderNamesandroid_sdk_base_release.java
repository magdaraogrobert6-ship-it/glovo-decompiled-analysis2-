package o;

import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.E$b;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomLocationProviderNamesandroid_sdk_base_release implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ setCustomLocationProviderNamesandroid_sdk_base_release(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        io.sentry.hints.MediaSessionCompatQueueItem mediaSessionCompatQueueItem = setContentCardsUnreadVisualIndicatorEnabled.write;
        switch (i) {
            case 0:
                setCountrylambda1 setcountrylambda1 = new setCountrylambda1();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    if (b == 0) {
                        return setcountrylambda1.read();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                        case 1:
                            if (b == 10) {
                                setcountrylambda1.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                continue;
                            }
                            break;
                        case 2:
                            if (b == 12) {
                                setcountrylambda1.read = (removeFromSubscriptionGrouplambda0) removeFromSubscriptionGrouplambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                continue;
                            }
                            break;
                        case 3:
                            if (b == 12) {
                                setcountrylambda1.write = (createNotification) createNotification.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                continue;
                            }
                            break;
                        case 4:
                            if (b == 15) {
                                int i2 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList = new ArrayList(i2);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    arrayList.add((getAdmMessagingRegistrationEnabledandroid_sdk_base_release) getAdmMessagingRegistrationEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                setcountrylambda1.MediaSessionCompatQueueItem = arrayList;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                continue;
                            }
                            break;
                        case 5:
                            if (b == 6) {
                                setcountrylambda1.MediaMetadataCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 6:
                            if (b == 6) {
                                setcountrylambda1.RatingCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 7:
                            if (b == 6) {
                                setcountrylambda1.PlaybackStateCompatCustomAction = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 8:
                            if (b == 6) {
                                setcountrylambda1.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 9:
                            if (b == 3) {
                                setcountrylambda1.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 10:
                            if (b == 11) {
                                setcountrylambda1.MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 11:
                            if (b == 6) {
                                setcountrylambda1.MediaDescriptionCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            continue;
                    }
                }
                break;
            case 1:
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(10);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                    if (b2 == 0) {
                        return new getBrazeSdkMetadataandroid_sdk_base_release(iscontentcardsunreadvisualindicatorenabled);
                    }
                    short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer;
                    if (s != 1) {
                        if (s != 2) {
                            if (s != 3) {
                                if (s != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                } else if (b2 == 4) {
                                    iscontentcardsunreadvisualindicatorenabled.read = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                }
                            } else if (b2 == 4) {
                                iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                        } else if (b2 == 4) {
                            iscontentcardsunreadvisualindicatorenabled.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                        }
                    } else if (b2 == 4) {
                        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                    }
                }
                break;
            case 2:
                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 7);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                    if (b3 == 0) {
                        return r8lambdadeozq815xuuwmllyyvm_qv79qy.IconCompatParcelizer();
                    }
                    short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer;
                    if (s2 != 1) {
                        if (s2 != 2) {
                            if (s2 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                            } else if (b3 == 12) {
                                r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = (getDefaultNotificationAccentColorandroid_sdk_base_release) getDefaultNotificationAccentColorandroid_sdk_base_release.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                            }
                        } else if (b3 == 8) {
                            r8lambdadeozq815xuuwmllyyvm_qv79qy.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                        }
                    } else if (b3 == 11) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                    }
                }
                break;
            case 3:
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled2 = new isContentCardsUnreadVisualIndicatorEnabled(11);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                    if (b4 == 0) {
                        if (((Byte) iscontentcardsunreadvisualindicatorenabled2.RemoteActionCompatParcelizer) != null) {
                            return new getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release(iscontentcardsunreadvisualindicatorenabled2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'significance' is missing");
                        return null;
                    }
                    short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer;
                    io.sentry.hints.MediaSessionCompatQueueItem mediaSessionCompatQueueItem2 = getDeviceObjectAllowlistandroid_sdk_base_release.write;
                    if (s3 != 1) {
                        if (s3 != 2) {
                            if (s3 != 3) {
                                if (s3 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                } else if (b4 == 3) {
                                    iscontentcardsunreadvisualindicatorenabled2.read = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                }
                            } else if (b4 == 3) {
                                iscontentcardsunreadvisualindicatorenabled2.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                            }
                        } else if (b4 == 15) {
                            int i4 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                            ArrayList arrayList2 = new ArrayList(i4);
                            for (int i5 = 0; i5 < i4; i5++) {
                                arrayList2.add((getDeviceObjectAllowlistandroid_sdk_base_release) mediaSessionCompatQueueItem2.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            }
                            iscontentcardsunreadvisualindicatorenabled2.write = arrayList2;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                        }
                    } else if (b4 == 12) {
                        iscontentcardsunreadvisualindicatorenabled2.IconCompatParcelizer = (getDeviceObjectAllowlistandroid_sdk_base_release) mediaSessionCompatQueueItem2.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                    }
                }
                break;
            case 4:
                getInAppMessageTestPushEagerDisplayEnabledandroid_sdk_base_release getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release = new getInAppMessageTestPushEagerDisplayEnabledandroid_sdk_base_release();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.RemoteActionCompatParcelizer;
                    if (b5 == 0) {
                        if (getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.RemoteActionCompatParcelizer != null) {
                            if (getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.IconCompatParcelizer != null) {
                                if (getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.serializer != null) {
                                    return new getHandlePushDeepLinksAutomaticallyandroid_sdk_base_release(getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release);
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'z' is missing");
                                return null;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'y' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'x' is missing");
                        return null;
                    }
                    short s4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.serializer;
                    if (s4 != 1) {
                        if (s4 != 2) {
                            if (s4 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                            } else if (b5 == 6) {
                                getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                            }
                        } else if (b5 == 6) {
                            getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                        }
                    } else if (b5 == 6) {
                        getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                    }
                }
                break;
            case 5:
                IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.RemoteActionCompatParcelizer;
                    if (b6 == 0) {
                        return iOParser$Decoder.MediaSessionCompatQueueItem();
                    }
                    short s5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.serializer;
                    if (s5 != 1) {
                        if (s5 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        } else if (b6 == 12) {
                            while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                            }
                            iOParser$Decoder.read = new getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        }
                    } else if (b6 == 12) {
                        while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                        }
                        iOParser$Decoder.RemoteActionCompatParcelizer = new getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                    }
                }
                break;
            case 6:
                com.airbnb.lottie.PerformanceTracker performanceTracker = new com.airbnb.lottie.PerformanceTracker(7, false);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.RemoteActionCompatParcelizer;
                    if (b7 == 0) {
                        return new getSmallNotificationIconNameandroid_sdk_base_release(performanceTracker);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                    } else if (b7 == 13) {
                        int i6 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map = new HashMap(i6);
                        int iWrite = 0;
                        while (iWrite < i6) {
                            iWrite = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite, 1);
                        }
                        performanceTracker.IconCompatParcelizer = map;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                    }
                }
                break;
            case 7:
                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy2 = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 9);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.RemoteActionCompatParcelizer;
                    if (b8 == 0) {
                        if (((Byte) r8lambdadeozq815xuuwmllyyvm_qv79qy2.RemoteActionCompatParcelizer) != null) {
                            return new isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release(r8lambdadeozq815xuuwmllyyvm_qv79qy2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
                        return null;
                    }
                    short s6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.serializer;
                    if (s6 != 1) {
                        if (s6 != 2) {
                            if (s6 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                            } else if (b8 == 11) {
                                r8lambdadeozq815xuuwmllyyvm_qv79qy2.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                            }
                        } else if (b8 == 12) {
                            r8lambdadeozq815xuuwmllyyvm_qv79qy2.write = (isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release) isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                        }
                    } else if (b8 == 3) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy2.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                    }
                }
                break;
            case 8:
                com.airbnb.lottie.PerformanceTracker performanceTracker2 = new com.airbnb.lottie.PerformanceTracker(13, false);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.RemoteActionCompatParcelizer;
                    if (b9 == 0) {
                        return new isHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(performanceTracker2);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    } else if (b9 == 13) {
                        int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map2 = new HashMap(i7);
                        int iWrite2 = 0;
                        while (iWrite2 < i7) {
                            iWrite2 = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map2, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite2, 1);
                        }
                        performanceTracker2.IconCompatParcelizer = map2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    }
                }
                break;
            case 9:
                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.RemoteActionCompatParcelizer;
                    if (b10 == 0) {
                        return new isInAppMessageAccessibilityExclusiveModeEnabledandroid_sdk_base_release(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    } else if (b10 == 3) {
                        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    }
                }
                break;
            case 10:
                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2 = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.RemoteActionCompatParcelizer;
                    if (b11 == 0) {
                        if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2.serializer != null) {
                            return new isPushHtmlRenderingEnabledandroid_sdk_base_release(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    } else if (b11 == 3) {
                        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    }
                }
                break;
            case 11:
                E$b e$b = new E$b(16);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.RemoteActionCompatParcelizer;
                    if (b12 == 0) {
                        return new isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release(e$b);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.serializer) {
                        case 1:
                            if (b12 == 4) {
                                e$b.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 2:
                            if (b12 == 11) {
                                e$b.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 3:
                            if (b12 == 4) {
                                e$b.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 4:
                            if (b12 == 2) {
                                e$b.IconCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 5:
                            if (b12 == 4) {
                                e$b.MediaDescriptionCompat = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 6:
                            if (b12 == 11) {
                                e$b.MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 7:
                            if (b12 == 4) {
                                e$b.MediaMetadataCompat = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            break;
                    }
                }
                break;
            case 12:
                IOParser$Decoder iOParser$Decoder2 = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b13 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.RemoteActionCompatParcelizer;
                    if (b13 == 0) {
                        return iOParser$Decoder2.MediaDescriptionCompat();
                    }
                    short s7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.serializer;
                    if (s7 != 1) {
                        if (s7 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                        } else if (b13 == 12) {
                            iOParser$Decoder2.read = (setContentCardsUnreadVisualIndicatorEnabled) mediaSessionCompatQueueItem.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                        }
                    } else if (b13 == 11) {
                        iOParser$Decoder2.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                    }
                }
                break;
            case 13:
                setDefaultNotificationChannelName setdefaultnotificationchannelname = new setDefaultNotificationChannelName();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b14 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.RemoteActionCompatParcelizer;
                    if (b14 == 0) {
                        return setdefaultnotificationchannelname.IconCompatParcelizer();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.serializer) {
                        case 1:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.read = (getBadNetworkIntervalandroid_sdk_base_release) getBadNetworkIntervalandroid_sdk_base_release.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 2:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.serializer = (setCustomUserAttributedefault) setCustomUserAttributedefault.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 3:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.RemoteActionCompatParcelizer = (BrazeUserExternalSyntheticLambda1) BrazeUserExternalSyntheticLambda1.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 4:
                            if (b14 == 12) {
                                IOParser$Decoder iOParser$Decoder3 = new IOParser$Decoder();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b15 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.RemoteActionCompatParcelizer;
                                    if (b15 == 0) {
                                        setdefaultnotificationchannelname.write = iOParser$Decoder3.MediaDescriptionCompat();
                                        break;
                                    } else {
                                        short s8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.serializer;
                                        if (s8 != 1) {
                                            if (s8 != 2) {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                                            } else if (b15 == 12) {
                                                iOParser$Decoder3.read = (setContentCardsUnreadVisualIndicatorEnabled) mediaSessionCompatQueueItem.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                            } else {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                                            }
                                        } else if (b15 == 11) {
                                            iOParser$Decoder3.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                        } else {
                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                                        }
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                                break;
                            }
                            break;
                        case 5:
                            if (b14 == 12) {
                                IOParser$Decoder iOParser$Decoder4 = new IOParser$Decoder();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b16 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.RemoteActionCompatParcelizer;
                                    if (b16 == 0) {
                                        setdefaultnotificationchannelname.IconCompatParcelizer = iOParser$Decoder4.write();
                                        break;
                                    } else {
                                        short s9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.serializer;
                                        if (s9 != 1) {
                                            if (s9 != 2) {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                                            } else if (b16 == 12) {
                                                iOParser$Decoder4.read = (setLanguage) setLanguage.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                            } else {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                                            }
                                        } else if (b16 == 11) {
                                            iOParser$Decoder4.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                        } else {
                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                                        }
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                                break;
                            }
                            break;
                        case 6:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.RatingCompat = (unsetCustomUserAttributelambda1) unsetCustomUserAttributelambda1.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 7:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.MediaSessionCompatQueueItem = (setEmaillambda3) setEmaillambda3.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 8:
                            if (b14 == 12) {
                                NetworkBody networkBody = new NetworkBody(22);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b17 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.RemoteActionCompatParcelizer;
                                    if (b17 == 0) {
                                        setdefaultnotificationchannelname.MediaBrowserCompatMediaItem = networkBody.IconCompatParcelizer();
                                        break;
                                    } else {
                                        short s10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.serializer;
                                        if (s10 != 1) {
                                            if (s10 != 2) {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                                            } else if (b17 == 12) {
                                                networkBody.RemoteActionCompatParcelizer = (IBrazeEndpointProvider) IBrazeEndpointProvider.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                            } else {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                                            }
                                        } else if (b17 == 11) {
                                            networkBody.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                        } else {
                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                                        }
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                                break;
                            }
                            break;
                        case 9:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.MediaMetadataCompat = (BrazeUserExternalSyntheticLambda3) BrazeUserExternalSyntheticLambda3.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 10:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.MediaDescriptionCompat = (IBrazeDeeplinkHandler) IBrazeDeeplinkHandler.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 11:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.MediaSessionCompatToken = (addAliaslambda0) addAliaslambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 12:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.ParcelableVolumeInfo = (setDefaultNotificationChannelDescriptionandroid_sdk_base_release) setDefaultNotificationChannelDescriptionandroid_sdk_base_release.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 13:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.PlaybackStateCompatCustomAction = (setDeviceObjectAllowlist) setDeviceObjectAllowlist.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 14:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.PlaybackStateCompat = (getGreatNetworkIntervalandroid_sdk_base_release) getGreatNetworkIntervalandroid_sdk_base_release.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 15:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.MediaSessionCompatResultReceiverWrapper = (addAliaslambda3) addAliaslambda3.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 16:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (setEmail) setEmail.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 17:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (logPurchasedefault) logPurchasedefault.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 18:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.ComponentActivity = (setAutomaticLocationCollectionEnabledandroid_sdk_base_release) setAutomaticLocationCollectionEnabledandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        case 19:
                            if (b14 == 12) {
                                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(7, false);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b18 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.RemoteActionCompatParcelizer;
                                    if (b18 == 0) {
                                        if (((Integer) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write) != null) {
                                            setdefaultnotificationchannelname.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new setCustomUserAttributelambda0(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'number_of_payloads_not_uploaded' is missing");
                                            return null;
                                        }
                                        break;
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                                    } else if (b18 == 8) {
                                        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                                break;
                            }
                            break;
                        case 20:
                            if (b14 == 12) {
                                setdefaultnotificationchannelname.ResultReceiver = (unsetCustomUserAttribute) unsetCustomUserAttribute.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            break;
                    }
                }
                break;
            default:
                BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda2 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda2();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b19 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.RemoteActionCompatParcelizer;
                    if (b19 == 0) {
                        if (brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2.RemoteActionCompatParcelizer != null) {
                            if (brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2.IconCompatParcelizer != null) {
                                if (brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2.write != null) {
                                    return new setDeviceObjectAllowlist(brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2);
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'end_time' is missing");
                                return null;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start_time' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trip_id' is missing");
                        return null;
                    }
                    short s11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.serializer;
                    if (s11 != 1) {
                        if (s11 != 2) {
                            if (s11 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                            } else if (b19 == 10) {
                                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                            }
                        } else if (b19 == 10) {
                            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                        }
                    } else if (b19 == 11) {
                        brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                    }
                }
                break;
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
        byte b;
        byte b2;
        int i;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        int i2;
        int i3;
        byte b9;
        int i4;
        byte b10;
        byte b11;
        byte b12;
        int i5;
        byte b13;
        int i6 = this.RemoteActionCompatParcelizer;
        io.sentry.hints.MediaSessionCompatQueueItem mediaSessionCompatQueueItem = setContentCardsUnreadVisualIndicatorEnabled.write;
        switch (i6) {
            case 0:
                setCustomWebViewActivityClass setcustomwebviewactivityclass = (setCustomWebViewActivityClass) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                Long l = setcustomwebviewactivityclass.IconCompatParcelizer;
                Short sh = setcustomwebviewactivityclass.ParcelableVolumeInfo;
                String str = setcustomwebviewactivityclass.PlaybackStateCompat;
                Byte b14 = setcustomwebviewactivityclass.MediaSessionCompatQueueItem;
                Short sh2 = setcustomwebviewactivityclass.MediaBrowserCompatMediaItem;
                Short sh3 = setcustomwebviewactivityclass.RatingCompat;
                Short sh4 = setcustomwebviewactivityclass.MediaDescriptionCompat;
                Short sh5 = setcustomwebviewactivityclass.MediaMetadataCompat;
                List list = setcustomwebviewactivityclass.read;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l.longValue());
                removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda0 = setcustomwebviewactivityclass.RemoteActionCompatParcelizer;
                if (removefromsubscriptiongrouplambda0 != null) {
                    b = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    removeFromSubscriptionGrouplambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, removefromsubscriptiongrouplambda0);
                } else {
                    b = 12;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b);
                createNotification.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomwebviewactivityclass.serializer);
                if (list != null) {
                    Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 15, list, b);
                    while (itWrite.hasNext()) {
                        getAdmMessagingRegistrationEnabledandroid_sdk_base_release getadmmessagingregistrationenabledandroid_sdk_base_release = (getAdmMessagingRegistrationEnabledandroid_sdk_base_release) itWrite.next();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(getadmmessagingregistrationenabledandroid_sdk_base_release.IconCompatParcelizer);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(getadmmessagingregistrationenabledandroid_sdk_base_release.serializer);
                        String str2 = getadmmessagingregistrationenabledandroid_sdk_base_release.write;
                        if (str2 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                }
                if (sh5 != null) {
                    b2 = 6;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, sh5);
                } else {
                    b2 = 6;
                }
                if (sh4 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b2, b2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh4);
                }
                if (sh3 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b2, 7, r8lambdat7xjd1d4humw0psb7whucfgonss, sh3);
                }
                if (sh2 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b2, 8, r8lambdat7xjd1d4humw0psb7whucfgonss, sh2);
                }
                if (b14 != null) {
                    getBitmapFromCache.read((byte) 3, 9, r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                }
                if (str != null) {
                    i = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
                } else {
                    i = 11;
                }
                if (sh != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, i, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 1:
                getBrazeSdkMetadataandroid_sdk_base_release getbrazesdkmetadataandroid_sdk_base_release = (getBrazeSdkMetadataandroid_sdk_base_release) obj;
                Double d = getbrazesdkmetadataandroid_sdk_base_release.IconCompatParcelizer;
                Double d2 = getbrazesdkmetadataandroid_sdk_base_release.RemoteActionCompatParcelizer;
                Double d3 = getbrazesdkmetadataandroid_sdk_base_release.read;
                Double d4 = getbrazesdkmetadataandroid_sdk_base_release.write;
                if (d != null) {
                    b3 = 4;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getbrazesdkmetadataandroid_sdk_base_release.IconCompatParcelizer.doubleValue());
                } else {
                    b3 = 4;
                }
                if (d4 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, b3, d4);
                }
                if (d3 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, b3, d3);
                }
                if (d2 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, b3, b3, d2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 2:
                getDoesPushStoryDismissOnClickandroid_sdk_base_release getdoespushstorydismissonclickandroid_sdk_base_release = (getDoesPushStoryDismissOnClickandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(getdoespushstorydismissonclickandroid_sdk_base_release.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 8);
                SweepGradientShader9KIMszodefault.write(getdoespushstorydismissonclickandroid_sdk_base_release.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 12);
                getDefaultNotificationAccentColorandroid_sdk_base_release.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, getdoespushstorydismissonclickandroid_sdk_base_release.read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 3:
                getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release getfallbackfirebasemessagingserviceclasspathandroid_sdk_base_release = (getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release) obj;
                getDeviceObjectAllowlistandroid_sdk_base_release getdeviceobjectallowlistandroid_sdk_base_release = getfallbackfirebasemessagingserviceclasspathandroid_sdk_base_release.write;
                Byte b15 = getfallbackfirebasemessagingserviceclasspathandroid_sdk_base_release.serializer;
                List list2 = getfallbackfirebasemessagingserviceclasspathandroid_sdk_base_release.read;
                io.sentry.hints.MediaSessionCompatQueueItem mediaSessionCompatQueueItem2 = getDeviceObjectAllowlistandroid_sdk_base_release.write;
                if (getdeviceobjectallowlistandroid_sdk_base_release != null) {
                    b4 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    mediaSessionCompatQueueItem2.read(r8lambdat7xjd1d4humw0psb7whucfgonss, getfallbackfirebasemessagingserviceclasspathandroid_sdk_base_release.write);
                } else {
                    b4 = 12;
                }
                if (list2 != null) {
                    Iterator itWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 15, list2, b4);
                    while (itWrite2.hasNext()) {
                        mediaSessionCompatQueueItem2.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (getDeviceObjectAllowlistandroid_sdk_base_release) itWrite2.next());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 3);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getfallbackfirebasemessagingserviceclasspathandroid_sdk_base_release.RemoteActionCompatParcelizer.byteValue());
                if (b15 != null) {
                    getBitmapFromCache.read((byte) 3, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 4:
                getHandlePushDeepLinksAutomaticallyandroid_sdk_base_release gethandlepushdeeplinksautomaticallyandroid_sdk_base_release = (getHandlePushDeepLinksAutomaticallyandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                IconCompatParcelizer.read((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, gethandlepushdeeplinksautomaticallyandroid_sdk_base_release.serializer);
                IconCompatParcelizer.read((byte) 6, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, gethandlepushdeeplinksautomaticallyandroid_sdk_base_release.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(gethandlepushdeeplinksautomaticallyandroid_sdk_base_release.RemoteActionCompatParcelizer.shortValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 5:
                getSdkFlavorandroid_sdk_base_release getsdkflavorandroid_sdk_base_release = (getSdkFlavorandroid_sdk_base_release) obj;
                getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release getshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release = getsdkflavorandroid_sdk_base_release.RemoteActionCompatParcelizer;
                getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release getshouldusewindowflagsecureinactivitiesandroid_sdk_base_release = getsdkflavorandroid_sdk_base_release.read;
                if (getshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release != null) {
                    b5 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b5 = 12;
                }
                if (getshouldusewindowflagsecureinactivitiesandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b5);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 6:
                Map map = ((getSmallNotificationIconNameandroid_sdk_base_release) obj).serializer;
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
                isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release isfirebasecloudmessagingregistrationenabledandroid_sdk_base_release = (isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                Byte b16 = isfirebasecloudmessagingregistrationenabledandroid_sdk_base_release.write;
                String str5 = isfirebasecloudmessagingregistrationenabledandroid_sdk_base_release.IconCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b16.byteValue());
                isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release isfallbackfirebasemessagingserviceenabledandroid_sdk_base_release = isfirebasecloudmessagingregistrationenabledandroid_sdk_base_release.read;
                if (isfallbackfirebasemessagingserviceenabledandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, isfallbackfirebasemessagingserviceenabledandroid_sdk_base_release);
                }
                if (str5 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str5);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 8:
                Map map2 = ((isHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) obj).serializer;
                if (map2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite4 = MediaSessionCompatQueueItem.write(map2, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) itWrite4.next();
                        String str6 = (String) entry2.getKey();
                        String str7 = (String) entry2.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str6);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str7);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 9:
                isInAppMessageAccessibilityExclusiveModeEnabledandroid_sdk_base_release isinappmessageaccessibilityexclusivemodeenabledandroid_sdk_base_release = (isInAppMessageAccessibilityExclusiveModeEnabledandroid_sdk_base_release) obj;
                if (isinappmessageaccessibilityexclusivemodeenabledandroid_sdk_base_release.IconCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(isinappmessageaccessibilityexclusivemodeenabledandroid_sdk_base_release.IconCompatParcelizer.byteValue());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 10:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                IconCompatParcelizer.IconCompatParcelizer(((isPushHtmlRenderingEnabledandroid_sdk_base_release) obj).read, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
                break;
            case 11:
                isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release istouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = (isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release) obj;
                Double d5 = istouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read;
                Double d6 = istouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.MediaMetadataCompat;
                String str8 = istouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.MediaSessionCompatQueueItem;
                Double d7 = istouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.MediaBrowserCompatMediaItem;
                Boolean bool = istouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.IconCompatParcelizer;
                Double d8 = istouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.serializer;
                String str9 = istouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.RemoteActionCompatParcelizer;
                if (d5 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(istouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read.doubleValue());
                }
                if (str9 != null) {
                    b6 = 2;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str9);
                } else {
                    b6 = 2;
                }
                if (d8 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 4, d8);
                }
                if (bool != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, b6, bool);
                }
                if (d7 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 4, d7);
                }
                if (str8 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str8);
                }
                if (d6 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 4, d6);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 12:
                setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release = (setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release.IconCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                mediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release.read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 13:
                setDefaultNotificationAccentColorandroid_sdk_base_release setdefaultnotificationaccentcolorandroid_sdk_base_release = (setDefaultNotificationAccentColorandroid_sdk_base_release) obj;
                getBadNetworkIntervalandroid_sdk_base_release getbadnetworkintervalandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.read;
                unsetCustomUserAttribute unsetcustomuserattribute = setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                setCustomUserAttributelambda0 setcustomuserattributelambda0 = setdefaultnotificationaccentcolorandroid_sdk_base_release.ComponentActivity;
                setAutomaticLocationCollectionEnabledandroid_sdk_base_release setautomaticlocationcollectionenabledandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                logPurchasedefault logpurchasedefault = setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                setEmail setemail = setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                addAliaslambda3 addaliaslambda3 = setdefaultnotificationaccentcolorandroid_sdk_base_release.ResultReceiver;
                getGreatNetworkIntervalandroid_sdk_base_release getgreatnetworkintervalandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.ParcelableVolumeInfo;
                setDeviceObjectAllowlist setdeviceobjectallowlist = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaSessionCompatToken;
                setDefaultNotificationChannelDescriptionandroid_sdk_base_release setdefaultnotificationchanneldescriptionandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.PlaybackStateCompat;
                addAliaslambda0 addaliaslambda0 = setdefaultnotificationaccentcolorandroid_sdk_base_release.PlaybackStateCompatCustomAction;
                IBrazeDeeplinkHandler iBrazeDeeplinkHandler = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaSessionCompatResultReceiverWrapper;
                BrazeUserExternalSyntheticLambda3 brazeUserExternalSyntheticLambda3 = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaSessionCompatQueueItem;
                IBrazeExternalSyntheticBUOutline0 iBrazeExternalSyntheticBUOutline0 = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaDescriptionCompat;
                setEmaillambda3 setemaillambda3 = setdefaultnotificationaccentcolorandroid_sdk_base_release.RatingCompat;
                unsetCustomUserAttributelambda1 unsetcustomuserattributelambda1 = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaBrowserCompatMediaItem;
                setGender setgender = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaMetadataCompat;
                setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release2 = setdefaultnotificationaccentcolorandroid_sdk_base_release.serializer;
                BrazeUserExternalSyntheticLambda1 brazeUserExternalSyntheticLambda1 = setdefaultnotificationaccentcolorandroid_sdk_base_release.write;
                setCustomUserAttributedefault setcustomuserattributedefault = setdefaultnotificationaccentcolorandroid_sdk_base_release.RemoteActionCompatParcelizer;
                if (getbadnetworkintervalandroid_sdk_base_release != null) {
                    b7 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    getBadNetworkIntervalandroid_sdk_base_release.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setdefaultnotificationaccentcolorandroid_sdk_base_release.read);
                } else {
                    b7 = 12;
                }
                if (setcustomuserattributedefault != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b7);
                    setCustomUserAttributedefault.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomuserattributedefault);
                }
                if (brazeUserExternalSyntheticLambda1 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b7);
                    BrazeUserExternalSyntheticLambda1.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeUserExternalSyntheticLambda1);
                }
                if (setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b7);
                    b8 = 11;
                    i2 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release2.IconCompatParcelizer);
                    i3 = 2;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b7);
                    mediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release2.read);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b8 = 11;
                    i2 = 1;
                    i3 = 2;
                }
                if (setgender != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, b7);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setgender.read);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i3, b7);
                    setLanguage.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setgender.write);
                    b9 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b9 = 0;
                }
                if (unsetcustomuserattributelambda1 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, b7);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                    IconCompatParcelizer.serializer(unsetcustomuserattributelambda1.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, i3, (byte) 10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(unsetcustomuserattributelambda1.write.longValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b9);
                }
                if (setemaillambda3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, b7);
                    setEmaillambda3.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setemaillambda3);
                }
                if (iBrazeExternalSyntheticBUOutline0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, b7);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(iBrazeExternalSyntheticBUOutline0.serializer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b7);
                    IBrazeEndpointProvider.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, iBrazeExternalSyntheticBUOutline0.write);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (brazeUserExternalSyntheticLambda3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, b7);
                    BrazeUserExternalSyntheticLambda3.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeUserExternalSyntheticLambda3);
                }
                if (iBrazeDeeplinkHandler != null) {
                    String str10 = iBrazeDeeplinkHandler.RemoteActionCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, b7);
                    i4 = 11;
                    if (str10 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str10);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i4 = 11;
                }
                if (addaliaslambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i4, b7);
                    addAliaslambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, addaliaslambda0);
                }
                if (setdefaultnotificationchanneldescriptionandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(b7, b7);
                    setDefaultNotificationChannelDescriptionandroid_sdk_base_release.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setdefaultnotificationchanneldescriptionandroid_sdk_base_release);
                }
                if (setdeviceobjectallowlist != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(13, b7);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setdeviceobjectallowlist.read);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 10);
                    IconCompatParcelizer.serializer(setdeviceobjectallowlist.write, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setdeviceobjectallowlist.RemoteActionCompatParcelizer.longValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (getgreatnetworkintervalandroid_sdk_base_release != null) {
                    b10 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(14, (byte) 12);
                    getGreatNetworkIntervalandroid_sdk_base_release.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, getgreatnetworkintervalandroid_sdk_base_release);
                } else {
                    b10 = 12;
                }
                if (addaliaslambda3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(15, b10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                    SweepGradientShader9KIMszodefault.write(addaliaslambda3.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                    SweepGradientShader9KIMszodefault.write(addaliaslambda3.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 6);
                    IconCompatParcelizer.read((byte) 10, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, addaliaslambda3.IconCompatParcelizer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(addaliaslambda3.read.longValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (setemail != null) {
                    b11 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(16, (byte) 12);
                    setEmail.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setemail);
                } else {
                    b11 = 12;
                }
                if (logpurchasedefault != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(17, b11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                    IconCompatParcelizer.serializer(logpurchasedefault.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 10);
                    IconCompatParcelizer.serializer(logpurchasedefault.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(logpurchasedefault.RemoteActionCompatParcelizer.intValue());
                    Boolean bool2 = logpurchasedefault.write;
                    if (bool2 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 2, bool2);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (setautomaticlocationcollectionenabledandroid_sdk_base_release != null) {
                    b12 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(18, (byte) 12);
                    setAutomaticLocationCollectionEnabledandroid_sdk_base_release.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setautomaticlocationcollectionenabledandroid_sdk_base_release);
                } else {
                    b12 = 12;
                }
                if (setcustomuserattributelambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(19, b12);
                    i5 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(setcustomuserattributelambda0.RemoteActionCompatParcelizer.intValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i5 = 1;
                }
                if (unsetcustomuserattribute != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(20, b12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i5, (byte) 3);
                    af$$ExternalSyntheticOutline1.m(b12, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, unsetcustomuserattribute.IconCompatParcelizer);
                    setEmailNotificationSubscriptionTypelambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, unsetcustomuserattribute.serializer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b12);
                    setPhoneNumber.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, unsetcustomuserattribute.RemoteActionCompatParcelizer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b12);
                    setCustomUserAttributelambda2.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, unsetcustomuserattribute.write);
                    b13 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b13 = 0;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b13);
                break;
            default:
                setDeviceObjectAllowlist setdeviceobjectallowlist2 = (setDeviceObjectAllowlist) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(setdeviceobjectallowlist2.read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 10);
                IconCompatParcelizer.serializer(setdeviceobjectallowlist2.write, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 10);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setdeviceobjectallowlist2.RemoteActionCompatParcelizer.longValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
        }
    }
}
