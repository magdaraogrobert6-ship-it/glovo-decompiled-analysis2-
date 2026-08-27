package o;

import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.k$c;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(int i) {
        this.write = i;
    }

    private final Object IconCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        FormBody.Builder builder = new FormBody.Builder();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 12) {
                    builder.RemoteActionCompatParcelizer = (r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o) r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 12) {
                builder.serializer = (setDeviceObjectAllowlistEnabledandroid_sdk_base_release) setDeviceObjectAllowlistEnabledandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((setDeviceObjectAllowlistEnabledandroid_sdk_base_release) builder.serializer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'poi_address' is missing");
            return null;
        }
        if (((r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o) builder.RemoteActionCompatParcelizer) != null) {
            return new accessgetUserCachep(builder);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'poi_location' is missing");
        return null;
    }

    private final Object MediaBrowserCompatMediaItem(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        FormBody.Builder builder = new FormBody.Builder();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 12) {
                    builder.RemoteActionCompatParcelizer = (setPhoneNumberlambda0) setPhoneNumberlambda0.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 12) {
                builder.serializer = (setLanguagelambda0) setLanguagelambda0.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((setLanguagelambda0) builder.serializer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'id' is missing");
            return null;
        }
        if (((setPhoneNumberlambda0) builder.RemoteActionCompatParcelizer) != null) {
            return new setLineIdlambda3(builder);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'property' is missing");
        return null;
    }

    private final Object MediaDescriptionCompat(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        k$c k_c = new k$c();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                if (((String) k_c.MediaSessionCompatQueueItem) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'user_id' is missing");
                    return null;
                }
                if (((String) k_c.MediaDescriptionCompat) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'token' is missing");
                    return null;
                }
                if (((String) k_c.RemoteActionCompatParcelizer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'refresh_token' is missing");
                    return null;
                }
                if (((Long) k_c.write) != null) {
                    return new setHomeCitylambda0(k_c);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'expires_at' is missing");
                return null;
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.MediaSessionCompatQueueItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 2:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.MediaDescriptionCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 3:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 4:
                    if (b != 10) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    }
                    break;
                case 5:
                    if (b != 10) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    }
                    break;
                case 6:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 7:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 8:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                default:
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    break;
            }
        }
    }

    private final Object MediaSessionCompatQueueItem(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        C$b c$b = new C$b();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new setCustomUserAttributelambda3(c$b);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else if (b == 12) {
                        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                        while (true) {
                            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                            byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                            if (b2 == 0) {
                                break;
                            }
                            short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer;
                            if (s2 != 1) {
                                if (s2 != 2) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                } else if (b2 == 11) {
                                    iOParser$Decoder.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                }
                            } else if (b2 == 4) {
                                iOParser$Decoder.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                        }
                        c$b.IconCompatParcelizer = new setLastKnownLocationdefault(iOParser$Decoder);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 12) {
                    c$b.write = (setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0) setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 12) {
                c$b.serializer = (addToCustomAttributeArraylambda1) addToCustomAttributeArraylambda1.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object MediaSessionCompatResultReceiverWrapper(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        applyPendingRuntimeConfiguration applypendingruntimeconfiguration = new applyPendingRuntimeConfiguration();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new unsetCustomUserAttributelambda0(applypendingruntimeconfiguration);
            }
            if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer != 1) {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            } else if (b == 2) {
                applypendingruntimeconfiguration.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object MediaSessionCompatToken(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        C$b c$b = new C$b();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new setLocationCustomAttributelambda0(c$b);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else if (b == 6) {
                        c$b.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 6) {
                    c$b.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 2) {
                c$b.serializer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object ParcelableVolumeInfo(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        FormBody.Builder builder = new FormBody.Builder();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new removeFromSubscriptionGroup(builder);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 4) {
                    builder.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 4) {
                builder.serializer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object PlaybackStateCompat(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new addToSubscriptionGroup(r8lambda1mnczrzuv4owduwgkg6cjtsws);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 4) {
                    r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 4) {
                r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object PlaybackStateCompatCustomAction(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        setCustomAttributeArray setcustomattributearray = new setCustomAttributeArray();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new setCountry(setcustomattributearray);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            } else if (b == 11) {
                                setcustomattributearray.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                        } else if (b == 11) {
                            setcustomattributearray.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 11) {
                        setcustomattributearray.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 4) {
                    setcustomattributearray.serializer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 11) {
                setcustomattributearray.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object RatingCompat(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        setPhoneNumberlambda3 setphonenumberlambda3 = new setPhoneNumberlambda3();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new setLineIdlambda20(setphonenumberlambda3);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        } else if (b == 11) {
                            setphonenumberlambda3.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 11) {
                        setphonenumberlambda3.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 11) {
                    setphonenumberlambda3.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 11) {
                setphonenumberlambda3.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object r8lambda54BeH8ZsBru0CXI2CCSP2syNys(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 12) {
                    r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(6);
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                        if (b2 == 0) {
                            break;
                        }
                        if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer != 1) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                        } else if (b2 == 11) {
                            r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                        }
                    }
                    r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.serializer();
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 10) {
                r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((Long) r8lambda1mnczrzuv4owduwgkg6cjtsws.write) != null) {
            return new setLineId(r8lambda1mnczrzuv4owduwgkg6cjtsws);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start' is missing");
        return null;
    }

    private final Object read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 12) {
                    r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(13);
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                        if (b2 == 0) {
                            break;
                        }
                        if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer != 1) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                        } else if (b2 == 11) {
                            r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                        }
                    }
                    r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer();
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 12) {
                r8lambda1mnczrzuv4owduwgkg6cjtsws.write = (incrementCustomUserAttribute) incrementCustomUserAttribute.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((incrementCustomUserAttribute) r8lambda1mnczrzuv4owduwgkg6cjtsws.write) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
            return null;
        }
        if (((setCustomEndpoint) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer) != null) {
            return new incrementCustomUserAttributelambda0(r8lambda1mnczrzuv4owduwgkg6cjtsws);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'person' is missing");
        return null;
    }

    private final Object write(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        addAliaslambda1 addaliaslambda1 = new addAliaslambda1();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new addToCustomAttributeArraylambda1(addaliaslambda1);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else if (b == 11) {
                        addaliaslambda1.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 4) {
                    addaliaslambda1.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 4) {
                addaliaslambda1.serializer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(4);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        } else if (b == 12) {
                            iscontentcardsunreadvisualindicatorenabled.read = (setPushNotificationSubscriptionType) setPushNotificationSubscriptionType.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 15) {
                        int i = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList = new ArrayList(i);
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList.add((getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                        }
                        iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = arrayList;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 10) {
                    iscontentcardsunreadvisualindicatorenabled.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 10) {
                iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((Long) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer) != null) {
            if (((Long) iscontentcardsunreadvisualindicatorenabled.write) != null) {
                return new setFirstName(iscontentcardsunreadvisualindicatorenabled);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stop' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start' is missing");
        return null;
    }

    private final Object serializer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(6);
        r8lambdat7xjd1d4humw0psb7whucfgonss.getClass();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.serializer();
            }
            if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer != 1) {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            } else if (b == 11) {
                r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object ComponentActivity(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(9);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        } else if (b == 15) {
                            int i = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                            ArrayList arrayList = new ArrayList(i);
                            for (int i2 = 0; i2 < i; i2++) {
                                arrayList.add(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                            }
                            iscontentcardsunreadvisualindicatorenabled.read = arrayList;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 3) {
                        iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 3) {
                    iscontentcardsunreadvisualindicatorenabled.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 3) {
                iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((Byte) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer) != null) {
            if (((Byte) iscontentcardsunreadvisualindicatorenabled.write) != null) {
                if (((Byte) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer) != null) {
                    if (((ArrayList) iscontentcardsunreadvisualindicatorenabled.read) != null) {
                        return new requestBannersRefreshdefault(iscontentcardsunreadvisualindicatorenabled);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'batchable_payloads' is missing");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'cap' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'step_size' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'initial_delay' is missing");
        return null;
    }

    private final Object MediaMetadataCompat(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(7, false);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer != 1) {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            } else if (b == 8) {
                sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((Integer) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write) != null) {
            return new setCustomUserAttributelambda0(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'number_of_payloads_not_uploaded' is missing");
        return null;
    }

    private final Object ResultReceiver(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(8);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        } else if (b == 2) {
                            iscontentcardsunreadvisualindicatorenabled.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 8) {
                        iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 10) {
                    iscontentcardsunreadvisualindicatorenabled.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 10) {
                iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 3);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return r8lambdadeozq815xuuwmllyyvm_qv79qy.read();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else if (b == 12) {
                        r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                        while (true) {
                            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                            byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                            if (b2 == 0) {
                                break;
                            }
                            if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer != 1) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            } else if (b2 == 3) {
                                r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                        }
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = new setCustomUserAttributelambda5(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 12) {
                    BrazeCompanionExternalSyntheticLambda8 brazeCompanionExternalSyntheticLambda8 = new BrazeCompanionExternalSyntheticLambda8();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                        if (b3 == 0) {
                            break;
                        }
                        if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer != 1) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                        } else if (b3 == 10) {
                            brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                        }
                    }
                    if (brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer != null) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.write = new createUriActionFromUrlString(brazeCompanionExternalSyntheticLambda8);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stop' is missing");
                        return null;
                    }
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 12) {
                IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                    if (b4 == 0) {
                        break;
                    }
                    short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer;
                    if (s2 != 1) {
                        if (s2 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                        } else if (b4 == 3) {
                            iOParser$Decoder.read = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                        }
                    } else if (b4 == 10) {
                        iOParser$Decoder.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                    }
                }
                r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = iOParser$Decoder.MediaMetadataCompat();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        NetworkBody networkBody = new NetworkBody(23);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 15) {
                    int i = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                    }
                    networkBody.RemoteActionCompatParcelizer = arrayList;
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 11) {
                networkBody.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((String) networkBody.IconCompatParcelizer) != null) {
            return new BrazeConfig(networkBody);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'category' is missing");
        return null;
    }

    private final Object r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 4);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM(r8lambdadeozq815xuuwmllyyvm_qv79qy);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else if (b == 2) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 13) {
                    int i = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                    HashMap map = new HashMap(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        map.put(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()), Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                    }
                    r8lambdadeozq815xuuwmllyyvm_qv79qy.write = map;
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 2) {
                r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        int i = 10;
        int i2 = 4;
        byte b = 11;
        byte b2 = 0;
        Object[] objArr = 0;
        int i3 = 6;
        int i4 = 2;
        switch (this.write) {
            case 0:
                r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    if (b3 == 0) {
                        if (((Byte) r8lambda1mnczrzuv4owduwgkg6cjtsws.write) != null) {
                            return new r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A(r8lambda1mnczrzuv4owduwgkg6cjtsws);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
                        return null;
                    }
                    short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
                    if (s != 1) {
                        if (s != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                        } else if (b3 == 3) {
                            r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                        }
                    } else if (b3 == 3) {
                        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                    }
                }
                break;
            case 1:
                O$b o$b = new O$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                    if (b4 == 0) {
                        return o$b.serializer();
                    }
                    short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer;
                    if (s2 != 1) {
                        if (s2 != 2) {
                            if (s2 != 3) {
                                if (s2 != 4) {
                                    if (s2 != 5) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                    } else if (b4 == 15) {
                                        int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                        ArrayList arrayList = new ArrayList(i5);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            FormBody.Builder builder = new FormBody.Builder();
                                            while (true) {
                                                r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                                byte b5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                                                if (b5 == 0) {
                                                }
                                                short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer;
                                                if (s3 != 1) {
                                                    if (s3 != 2) {
                                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                                    } else if (b5 == 4) {
                                                        builder.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                                    } else {
                                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                                    }
                                                } else if (b5 == 6) {
                                                    builder.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                                                } else {
                                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                                }
                                                break;
                                            }
                                            arrayList.add(builder.RemoteActionCompatParcelizer());
                                        }
                                        o$b.IconCompatParcelizer = arrayList;
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                    }
                                } else if (b4 == 6) {
                                    o$b.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                }
                            } else if (b4 == 15) {
                                int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList2 = new ArrayList(i7);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    arrayList2.add((r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU) r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                o$b.RemoteActionCompatParcelizer = arrayList2;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                            }
                        } else if (b4 == 3) {
                            o$b.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                        }
                    } else if (b4 == 11) {
                        o$b.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                    }
                }
                break;
            case 2:
                break;
            case 3:
                r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                    if (b6 == 0) {
                        return r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
                    }
                    short s4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer;
                    BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
                    int i9 = 12;
                    switch (s4) {
                        case 1:
                            if (b6 == 12) {
                                r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.RemoteActionCompatParcelizer;
                                    if (b7 == 0) {
                                        if (r8lambdamlvle2kr5fvc3vtodzmadfjxk.write != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU(r8lambdamlvle2kr5fvc3vtodzmadfjxk);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                                    } else if (b7 == 12) {
                                        r8lambdamlvle2kr5fvc3vtodzmadfjxk.write = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 2:
                            if (b6 == 12) {
                                r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk2 = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.RemoteActionCompatParcelizer;
                                    if (b8 == 0) {
                                        if (r8lambdamlvle2kr5fvc3vtodzmadfjxk2.write != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new r8lambda6XVpQwK1zU6mm_JruI3tIJroJFc(r8lambdamlvle2kr5fvc3vtodzmadfjxk2);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                    } else if (b8 == 12) {
                                        r8lambdamlvle2kr5fvc3vtodzmadfjxk2.write = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 3:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0._init_lambda4 = new r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 4:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0.accessensureViewModelStore = new BrazeBootReceiver();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 5:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0._init_lambda2 = (r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A) r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 6:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0.ensureViewModelStore = new r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 7:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0.addObserverForBackInvoker = new setShouldPersistWebView();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 8:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.fullyDrawnReporter_delegatelambda0 = (r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I) r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 9:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.getOnBackPressedInput = (r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU) r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 10:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0.menuHostHelperlambda0 = new r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 11:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0.addContentView = new subscribeToBannersDismissedEvent();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 12:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.onBackPressedInput_delegatelambda0 = (handleIncomingIntentlambda0) handleIncomingIntentlambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 13:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.onBackPressedDispatcher_delegatelambda0 = (r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y) r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 14:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.addOnConfigurationChangedListener = (r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI) r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 15:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.addOnContextAvailableListener = (BrazeUser) BrazeUser.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 16:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.addMenuProvider = (r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM) r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 17:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.addOnMultiWindowModeChangedListener = (r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A) r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 18:
                            if (b6 == 12) {
                                FormBody.Builder builder2 = new FormBody.Builder();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.RemoteActionCompatParcelizer;
                                    if (b9 == 0) {
                                        r8lambdaromdixahini0blcevvl7ehebhj0.addOnNewIntentListener = builder2.read();
                                    } else {
                                        short s5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.serializer;
                                        if (s5 != 1) {
                                            if (s5 != 2) {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                                            } else if (b9 == 2) {
                                                builder2.RemoteActionCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                            } else {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                                            }
                                        } else if (b9 == 3) {
                                            builder2.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                        } else {
                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                                        }
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 19:
                            if (b6 == 12) {
                                BrazeCompanionExternalSyntheticLambda8 brazeCompanionExternalSyntheticLambda8 = new BrazeCompanionExternalSyntheticLambda8();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.RemoteActionCompatParcelizer;
                                    if (b10 == 0) {
                                        r8lambdaromdixahini0blcevvl7ehebhj0.addOnTrimMemoryListener = new requestGeofenceRefresh(brazeCompanionExternalSyntheticLambda8);
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                                    } else if (b10 == 10) {
                                        brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 20:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0.enterPictureInPictureMode = new unsubscribeFromBannersDismissedEvent();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 21:
                            if (b6 == 12) {
                                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.RemoteActionCompatParcelizer;
                                    if (b11 == 0) {
                                        if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.addOnPictureInPictureModeChangedListener = new onActivityPausedlambda1(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'status' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                                    } else if (b11 == 3) {
                                        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 22:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.addOnPictureInPictureUiStateChangedListener = (setSessionHandlingBlocklist) setSessionHandlingBlocklist.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 23:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0.addOnUserLeaveHintListener = new r8lambda7hSNgpBpNnHwzu2sYrBtefYqHlQ();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 24:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.getFullyDrawnReporter = (r8lambdaE7oIx09KQauliA8paOfGanE2_e8) r8lambdaE7oIx09KQauliA8paOfGanE2_e8.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 25:
                            if (b6 == 12) {
                                NetworkBody networkBody = new NetworkBody(i9);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.RemoteActionCompatParcelizer;
                                    if (b12 == 0) {
                                        r8lambdaromdixahini0blcevvl7ehebhj0.getDefaultViewModelCreationExtras = networkBody.write();
                                    } else {
                                        short s6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.serializer;
                                        if (s6 != 1) {
                                            if (s6 != 2) {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                                            } else if (b12 == 2) {
                                                networkBody.RemoteActionCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                            } else {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                                            }
                                        } else if (b12 == 3) {
                                            networkBody.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                        } else {
                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                                        }
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 26:
                            if (b6 == 12) {
                                IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b13 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.RemoteActionCompatParcelizer;
                                    if (b13 == 0) {
                                        r8lambdaromdixahini0blcevvl7ehebhj0.getDefaultViewModelProviderFactory = new addBannerViewMonitor(iOParser$Decoder);
                                    } else {
                                        short s7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.serializer;
                                        if (s7 != 1) {
                                            if (s7 != 2) {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                                            } else if (b13 == 2) {
                                                iOParser$Decoder.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                            } else {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                                            }
                                        } else if (b13 == 12) {
                                            iOParser$Decoder.RemoteActionCompatParcelizer = (validateAndStorePushId) validateAndStorePushId.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                        } else {
                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                                        }
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 27:
                            if (b6 == 12) {
                                r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk3 = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b14 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.RemoteActionCompatParcelizer;
                                    if (b14 == 0) {
                                        if (r8lambdamlvle2kr5fvc3vtodzmadfjxk3.write != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.RemoteActionCompatParcelizer = new refreshBanners(r8lambdamlvle2kr5fvc3vtodzmadfjxk3);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                                    } else if (b14 == 12) {
                                        r8lambdamlvle2kr5fvc3vtodzmadfjxk3.write = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 28:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.read = (r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug) r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 29:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.write = (shouldHandleLifecycleMethodsInActivitylambda0) shouldHandleLifecycleMethodsInActivitylambda0.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 30:
                            if (b6 == 12) {
                                r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk4 = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b15 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.RemoteActionCompatParcelizer;
                                    if (b15 == 0) {
                                        if (r8lambdamlvle2kr5fvc3vtodzmadfjxk4.write != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.serializer = new BrazeActivityLifecycleCallbackListeneronActivityCreated2(r8lambdamlvle2kr5fvc3vtodzmadfjxk4);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                                    } else if (b15 == 12) {
                                        r8lambdamlvle2kr5fvc3vtodzmadfjxk4.write = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 31:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer = (wipeDatalambda0) wipeDatalambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 32:
                            if (b6 == 12) {
                                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2 = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b16 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.RemoteActionCompatParcelizer;
                                    if (b16 == 0) {
                                        if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2.serializer != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.MediaSessionCompatQueueItem = new handleInAppMessageTestPush(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'activity' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                                    } else if (b16 == 3) {
                                        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm2.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 33:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.MediaBrowserCompatMediaItem = (BrazeInternal) BrazeInternal.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            if (b6 == 12) {
                                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm3 = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b17 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.RemoteActionCompatParcelizer;
                                    if (b17 == 0) {
                                        if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm3.serializer != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.MediaMetadataCompat = new r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm3);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location_mode' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                                    } else if (b17 == 3) {
                                        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm3.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 35:
                            if (b6 == 12) {
                                NetworkBody networkBody2 = new NetworkBody(i);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b18 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.RemoteActionCompatParcelizer;
                                    if (b18 == 0) {
                                        r8lambdaromdixahini0blcevvl7ehebhj0.MediaDescriptionCompat = new setSdkEnablementProviderandroid_sdk_base_release(networkBody2);
                                    } else {
                                        short s8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.serializer;
                                        if (s8 != 1) {
                                            if (s8 != 2) {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                                            } else if (b18 == 3) {
                                                networkBody2.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                            } else {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                                            }
                                        } else if (b18 == 12) {
                                            networkBody2.IconCompatParcelizer = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                        } else {
                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                                        }
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.RatingCompat = (getShouldPersistWebView) getShouldPersistWebView.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 37:
                            if (b6 == 12) {
                                applyPendingRuntimeConfiguration applypendingruntimeconfiguration = new applyPendingRuntimeConfiguration();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b19 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.RemoteActionCompatParcelizer;
                                    if (b19 == 0) {
                                        if (applypendingruntimeconfiguration.read != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.MediaSessionCompatToken = new addSerializedContentCardToStorage(applypendingruntimeconfiguration);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'granted' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                                    } else if (b19 == 2) {
                                        applypendingruntimeconfiguration.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 38:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.ParcelableVolumeInfo = (deleteRegisteredGeofenceCache) deleteRegisteredGeofenceCache.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.MediaSessionCompatResultReceiverWrapper = (getDelayedInitializationProviderandroid_sdk_base_release) getDelayedInitializationProviderandroid_sdk_base_release.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 40:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.PlaybackStateCompatCustomAction = (shouldHandleLifecycleMethodsInActivity) shouldHandleLifecycleMethodsInActivity.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.PlaybackStateCompat = (registerOnApplication) registerOnApplication.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (setDelayedInitializationProviderandroid_sdk_base_release) setDelayedInitializationProviderandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 43:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.ComponentActivity = (r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 44:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (onActivityCreatedlambda0) onActivityCreatedlambda0.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            if (b6 == 12) {
                                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(i3, (boolean) (objArr == true ? 1 : 0));
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b20 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.RemoteActionCompatParcelizer;
                                    if (b20 == 0) {
                                        if (((r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write) != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.ResultReceiver = new r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'transport_state' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                                    } else if (b20 == 12) {
                                        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write = (r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE) r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 46:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog) r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case 47:
                            if (b6 == 12) {
                                r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk5 = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b21 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.RemoteActionCompatParcelizer;
                                    if (b21 == 0) {
                                        if (r8lambdamlvle2kr5fvc3vtodzmadfjxk5.write != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ(r8lambdamlvle2kr5fvc3vtodzmadfjxk5);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                                    } else if (b21 == 12) {
                                        r8lambdamlvle2kr5fvc3vtodzmadfjxk5.write = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            b = 11;
                            break;
                        case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80) r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 49:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new r8lambdaKCKMpEZa9rfzvHaSJhY4hue3sPQ();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = (r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc) r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 51:
                            if (b6 == 12) {
                                NetworkBody networkBody3 = new NetworkBody(14);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b22 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20.RemoteActionCompatParcelizer;
                                    if (b22 == 0) {
                                        r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = networkBody3.read();
                                    } else {
                                        short s9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20.serializer;
                                        if (s9 != 1) {
                                            if (s9 != 2) {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                                            } else if (b22 == 3) {
                                                networkBody3.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                            } else {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                                            }
                                        } else if (b22 == b) {
                                            networkBody3.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                        } else {
                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                                        }
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new r8lambdaVyE3aElBJdrGw6tHJhFdi1NUMg();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 53:
                            if (b6 == 12) {
                                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(i2);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b23 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21.RemoteActionCompatParcelizer;
                                    if (b23 == 0) {
                                        if (r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new handleIncomingIntentlambda2(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'thread_dump' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                                    } else if (b23 == b) {
                                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 54:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = (recordGeofenceTransition) recordGeofenceTransition.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 55:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0._init_lambda1 = (r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI) r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 56:
                            if (b6 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaromdixahini0blcevvl7ehebhj0._init_lambda3 = new setStaticExternalIEventMessengerandroid_sdk_base_release();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 57:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.addObserverForBackInvokerlambda0 = (r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q) r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 58:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.createFullyDrawnExecutor = (setConfiguredCustomEndpointandroid_sdk_base_release) setConfiguredCustomEndpointandroid_sdk_base_release.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 59:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.defaultViewModelProviderFactory_delegatelambda0 = (onReceivelambda0) onReceivelambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 60:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.fullyDrawnReporter_delegatelambda00 = (logLocationRecordedEvent) logLocationRecordedEvent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.getSavedStateRegistryControllerannotations = (r8lambda9XibBb_UAwpsuoULwKlfVxtang) r8lambda9XibBb_UAwpsuoULwKlfVxtang.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                            if (b6 == 12) {
                                applyPendingRuntimeConfiguration applypendingruntimeconfiguration2 = new applyPendingRuntimeConfiguration();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b24 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22.RemoteActionCompatParcelizer;
                                    if (b24 == 0) {
                                        if (applypendingruntimeconfiguration2.read != null) {
                                            r8lambdaromdixahini0blcevvl7ehebhj0.onBackPressedDispatcher_delegatelambda00 = new getConfigurationProvider(applypendingruntimeconfiguration2);
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_background_refresh_enabled' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                                    } else if (b24 == 2) {
                                        applypendingruntimeconfiguration2.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        case 63:
                            if (b6 == 12) {
                                r8lambdaromdixahini0blcevvl7ehebhj0.onBackPressedDispatcher_delegatelambda010 = (invokeSuspendlambda1) invokeSuspendlambda1.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            b = 11;
                            break;
                    }
                }
                break;
            case 4:
                IOParser$Decoder iOParser$Decoder2 = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b25 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23.RemoteActionCompatParcelizer;
                    if (b25 == 0) {
                        return new r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I(iOParser$Decoder2);
                    }
                    short s10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23.serializer;
                    if (s10 != 1) {
                        if (s10 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                        } else if (b25 == 3) {
                            iOParser$Decoder2.read = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                        }
                    } else if (b25 == 13) {
                        int i10 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map = new HashMap(i10);
                        int iWrite = 0;
                        while (iWrite < i10) {
                            iWrite = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite, 1);
                        }
                        iOParser$Decoder2.RemoteActionCompatParcelizer = map;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                    }
                }
                break;
            case 5:
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(i4);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b26 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24.RemoteActionCompatParcelizer;
                    if (b26 == 0) {
                        return iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer();
                    }
                    short s11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24.serializer;
                    if (s11 != 1) {
                        if (s11 != 2) {
                            if (s11 != 3) {
                                if (s11 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                                } else if (b26 == 11) {
                                    iscontentcardsunreadvisualindicatorenabled.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                                }
                            } else if (b26 == 8) {
                                iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                        } else if (b26 == 8) {
                            iscontentcardsunreadvisualindicatorenabled.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                        }
                    } else if (b26 == 8) {
                        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                    }
                }
                break;
            case 6:
                r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b27 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25.RemoteActionCompatParcelizer;
                    if (b27 == 0) {
                        return r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25.serializer) {
                        case 1:
                            if (b27 == 8) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                            }
                            break;
                        case 2:
                            if (b27 == 8) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                            }
                            break;
                        case 3:
                            if (b27 == 8) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.read = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                            }
                            break;
                        case 4:
                            if (b27 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                            }
                            break;
                        case 5:
                            if (b27 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                            }
                            break;
                        case 6:
                            if (b27 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                            break;
                    }
                }
                break;
            case 7:
                r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = new r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b28 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26.RemoteActionCompatParcelizer;
                    if (b28 == 0) {
                        return new r8lambdayRbQ7QfQWGgIRqExwjVfCaJEGI(r8lambdauosl1ojcz1lncaiooglfrbn5pcg);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26.serializer) {
                        case 1:
                            if (b28 == 6) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.read = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 2:
                            if (b28 == 6) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 3:
                            if (b28 == 6) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 4:
                            if (b28 == 6) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 5:
                            if (b28 == 6) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatQueueItem = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 6:
                            if (b28 == 6) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RatingCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 7:
                            if (b28 == 6) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 8:
                            if (b28 == 8) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaDescriptionCompat = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 9:
                            if (b28 == 8) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaMetadataCompat = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 10:
                            if (b28 == 8) {
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatToken = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 11:
                            if (b28 == 15) {
                                int i11 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList3 = new ArrayList(i11);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    arrayList3.add(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                                }
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.PlaybackStateCompat = arrayList3;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 12:
                            if (b28 == 15) {
                                int i13 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList4 = new ArrayList(i13);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    arrayList4.add(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                                }
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatResultReceiverWrapper = arrayList4;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        case 13:
                            if (b28 == 13) {
                                int i15 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                                HashMap map2 = new HashMap(i15);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    byte bMediaMetadataCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat();
                                    int i17 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                    ArrayList arrayList5 = new ArrayList(i17);
                                    for (int i18 = 0; i18 < i17; i18++) {
                                        arrayList5.add(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                                    }
                                    map2.put(Byte.valueOf(bMediaMetadataCompat), arrayList5);
                                }
                                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.ParcelableVolumeInfo = map2;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            break;
                    }
                }
                break;
            case 8:
                return IconCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 9:
                return write(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 10:
                return read(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 11:
                return serializer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 12:
                return MediaMetadataCompat(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 13:
                return MediaSessionCompatQueueItem(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 14:
                return MediaDescriptionCompat(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 15:
                return RatingCompat(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 16:
                return MediaBrowserCompatMediaItem(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 17:
                return MediaSessionCompatToken(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 18:
                return MediaSessionCompatResultReceiverWrapper(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 19:
                return PlaybackStateCompat(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 20:
                return ParcelableVolumeInfo(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 21:
                return PlaybackStateCompatCustomAction(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 22:
                return r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 23:
                return r8lambda54BeH8ZsBru0CXI2CCSP2syNys(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 24:
                return ResultReceiver(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 25:
                return ComponentActivity(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 26:
                return r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 27:
                return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 28:
                return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(r8lambdat7xjd1d4humw0psb7whucfgonss);
            default:
                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(b2, i3);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem27 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b29 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem27.RemoteActionCompatParcelizer;
                    if (b29 == 0) {
                        return r8lambdadeozq815xuuwmllyyvm_qv79qy.write();
                    }
                    short s12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem27.serializer;
                    if (s12 != 1) {
                        if (s12 != 2) {
                            if (s12 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b29);
                            } else if (b29 == 3) {
                                r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b29);
                            }
                        } else if (b29 == 10) {
                            r8lambdadeozq815xuuwmllyyvm_qv79qy.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b29);
                        }
                    } else if (b29 == 3) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b29);
                    }
                }
                break;
        }
        while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
        }
        return new r8lambdaKCKMpEZa9rfzvHaSJhY4hue3sPQ();
    }

    private final void serializer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        removeFromSubscriptionGroup removefromsubscriptiongroup = (removeFromSubscriptionGroup) obj;
        Double d = removefromsubscriptiongroup.serializer;
        Double d2 = removefromsubscriptiongroup.RemoteActionCompatParcelizer;
        if (d != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(removefromsubscriptiongroup.serializer.doubleValue());
        }
        if (d2 != null) {
            af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d2);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }

    private final void MediaMetadataCompat(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        BrazeConfig brazeConfig = (BrazeConfig) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
        r8lambdat7xjd1d4humw0psb7whucfgonss.write(brazeConfig.serializer);
        List list = brazeConfig.RemoteActionCompatParcelizer;
        if (list != null) {
            Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 15, list, (byte) 3);
            while (itWrite.hasNext()) {
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Byte) itWrite.next()).byteValue());
            }
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }

    private final void MediaDescriptionCompat(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        logPurchasedefault logpurchasedefault = (logPurchasedefault) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
        IconCompatParcelizer.serializer(logpurchasedefault.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 10);
        IconCompatParcelizer.serializer(logpurchasedefault.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(logpurchasedefault.RemoteActionCompatParcelizer.intValue());
        Boolean bool = logpurchasedefault.write;
        if (bool != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 2, bool);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }

    private final void IconCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        setCountry setcountry = (setCountry) obj;
        String str = setcountry.read;
        String str2 = setcountry.MediaSessionCompatQueueItem;
        String str3 = setcountry.serializer;
        String str4 = setcountry.RemoteActionCompatParcelizer;
        Double d = setcountry.IconCompatParcelizer;
        if (str != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcountry.read);
        }
        if (d != null) {
            af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d);
        }
        if (str4 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
        }
        if (str3 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
        }
        if (str2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }

    private final void write(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        setLineId setlineid = (setLineId) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setlineid.serializer.longValue());
        removeFromCustomAttributeArraylambda1 removefromcustomattributearraylambda1 = setlineid.RemoteActionCompatParcelizer;
        if (removefromcustomattributearraylambda1 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(removefromcustomattributearraylambda1.write);
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }

    private final void RatingCompat(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM r8lambdaimixhbmm7et76wgigmzc6zxqum = (r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM) obj;
        Boolean bool = r8lambdaimixhbmm7et76wgigmzc6zxqum.serializer;
        Boolean bool2 = r8lambdaimixhbmm7et76wgigmzc6zxqum.IconCompatParcelizer;
        Map map = r8lambdaimixhbmm7et76wgigmzc6zxqum.read;
        if (bool != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambdaimixhbmm7et76wgigmzc6zxqum.serializer.booleanValue() ? (byte) 1 : (byte) 0);
        }
        if (map != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 13);
            Iterator itWrite = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 3);
            while (itWrite.hasNext()) {
                Map.Entry entry = (Map.Entry) itWrite.next();
                Byte b = (Byte) entry.getKey();
                Byte b2 = (Byte) entry.getValue();
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b.byteValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b2.byteValue());
            }
        }
        if (bool2 != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 2, bool2);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }

    private final void RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        setFirstName setfirstname = (setFirstName) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
        Long l = setfirstname.IconCompatParcelizer;
        setPushNotificationSubscriptionType setpushnotificationsubscriptiontype = setfirstname.write;
        IconCompatParcelizer.serializer(l, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 10);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setfirstname.read.longValue());
        List list = setfirstname.serializer;
        if (list != null) {
            Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 15, list, (byte) 12);
            while (itWrite.hasNext()) {
                getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) itWrite.next());
            }
        }
        if (setpushnotificationsubscriptiontype != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
            setPushNotificationSubscriptionType.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setpushnotificationsubscriptiontype);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }

    private final void MediaSessionCompatQueueItem(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        requestBannersRefreshdefault requestbannersrefreshdefault = (requestBannersRefreshdefault) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
        af$$ExternalSyntheticOutline1.m((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, requestbannersrefreshdefault.serializer);
        af$$ExternalSyntheticOutline1.m((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, requestbannersrefreshdefault.read);
        af$$ExternalSyntheticOutline1.m((byte) 15, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, requestbannersrefreshdefault.RemoteActionCompatParcelizer);
        List list = requestbannersrefreshdefault.IconCompatParcelizer;
        r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 3, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Byte) it.next()).byteValue());
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }

    private final void MediaBrowserCompatMediaItem(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        IBrazeEndpointProvider iBrazeEndpointProvider = (IBrazeEndpointProvider) obj;
        IBrazeDeeplinkHandlerIntentFlagPurpose iBrazeDeeplinkHandlerIntentFlagPurpose = iBrazeEndpointProvider.serializer;
        setCustomUserAttributelambda5 setcustomuserattributelambda5 = iBrazeEndpointProvider.RemoteActionCompatParcelizer;
        createUriActionFromUrlString createuriactionfromurlstring = iBrazeEndpointProvider.read;
        if (iBrazeDeeplinkHandlerIntentFlagPurpose != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
            IBrazeDeeplinkHandlerIntentFlagPurpose iBrazeDeeplinkHandlerIntentFlagPurpose2 = iBrazeEndpointProvider.serializer;
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
            IconCompatParcelizer.serializer(iBrazeDeeplinkHandlerIntentFlagPurpose2.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 3);
            IconCompatParcelizer.IconCompatParcelizer(iBrazeDeeplinkHandlerIntentFlagPurpose2.read, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
        }
        if (createuriactionfromurlstring != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(createuriactionfromurlstring.read.longValue());
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
        }
        if (setcustomuserattributelambda5 != null) {
            Byte b = setcustomuserattributelambda5.RemoteActionCompatParcelizer;
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
            if (b != null) {
                getBitmapFromCache.read((byte) 3, 1, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        int i;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        byte b9;
        byte b10;
        int i2;
        byte b11;
        byte b12;
        byte b13;
        int i3;
        byte b14;
        byte b15;
        byte b16;
        byte b17;
        int i4;
        byte b18;
        byte b19;
        int i5;
        byte b20;
        byte b21;
        int i6;
        byte b22;
        int i7;
        byte b23;
        byte b24;
        byte b25;
        byte b26;
        byte b27;
        int i8;
        byte b28;
        byte b29;
        byte b30;
        byte b31;
        switch (this.write) {
            case 0:
                r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r8lambda2l1vxswbmfutp9a4iejxpq7zf7a = (r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.serializer.byteValue());
                Byte b32 = r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.read;
                if (b32 != null) {
                    getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b32);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 1:
                r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc r8lambdagn7c5ha_lryxg0qpuqgwsic0hc = (r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                String str = r8lambdagn7c5ha_lryxg0qpuqgwsic0hc.serializer;
                Short sh = r8lambdagn7c5ha_lryxg0qpuqgwsic0hc.RemoteActionCompatParcelizer;
                List list = r8lambdagn7c5ha_lryxg0qpuqgwsic0hc.MediaSessionCompatQueueItem;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 3);
                af$$ExternalSyntheticOutline1.m((byte) 15, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdagn7c5ha_lryxg0qpuqgwsic0hc.read);
                List<r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU> list2 = r8lambdagn7c5ha_lryxg0qpuqgwsic0hc.IconCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 12, list2.size());
                for (r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU r8lambda4mwgvcoszz69yvs_eb4pibqmbqu : list2) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                    IconCompatParcelizer.serializer(r8lambda4mwgvcoszz69yvs_eb4pibqmbqu.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambda4mwgvcoszz69yvs_eb4pibqmbqu.read.doubleValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (sh != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
                }
                if (list != null) {
                    Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 15, list, (byte) 12);
                    while (itWrite.hasNext()) {
                        handleIncomingIntentlambda1 handleincomingintentlambda1 = (handleIncomingIntentlambda1) itWrite.next();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                        IconCompatParcelizer.read((byte) 4, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, handleincomingintentlambda1.serializer);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(handleincomingintentlambda1.RemoteActionCompatParcelizer.doubleValue());
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 2:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 3:
                r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = (r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA) obj;
                r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80 r8lambdaf8wsytxo3nnbajq7v_hfblwn80 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ r8lambdaczkucdbcfyqvin9wog5_olgdyq = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog r8lambdaqoukgs6h1gfby4ttokxnao8yog = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o r8lambdasfjrr_hlzhgr9qjkoigmntl4f8o = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                onActivityCreatedlambda0 onactivitycreatedlambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs r8lambdavyxnhk9sdraxwugvbef6izzxids = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                setDelayedInitializationProviderandroid_sdk_base_release setdelayedinitializationproviderandroid_sdk_base_release = r8lambdaturwertf3otevz1wenzex5tdwa.ResultReceiver;
                registerOnApplication registeronapplication = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                shouldHandleLifecycleMethodsInActivity shouldhandlelifecyclemethodsinactivity = r8lambdaturwertf3otevz1wenzex5tdwa.ComponentActivity;
                getDelayedInitializationProviderandroid_sdk_base_release getdelayedinitializationproviderandroid_sdk_base_release = r8lambdaturwertf3otevz1wenzex5tdwa.ParcelableVolumeInfo;
                deleteRegisteredGeofenceCache deleteregisteredgeofencecache = r8lambdaturwertf3otevz1wenzex5tdwa.MediaSessionCompatToken;
                addSerializedContentCardToStorage addserializedcontentcardtostorage = r8lambdaturwertf3otevz1wenzex5tdwa.MediaSessionCompatResultReceiverWrapper;
                getShouldPersistWebView getshouldpersistwebview = r8lambdaturwertf3otevz1wenzex5tdwa.PlaybackStateCompatCustomAction;
                setSdkEnablementProviderandroid_sdk_base_release setsdkenablementproviderandroid_sdk_base_release = r8lambdaturwertf3otevz1wenzex5tdwa.PlaybackStateCompat;
                r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA r8lambdaleifbdvox5ais6eoxkchnl8ojha = r8lambdaturwertf3otevz1wenzex5tdwa.RatingCompat;
                BrazeInternal brazeInternal = r8lambdaturwertf3otevz1wenzex5tdwa.MediaMetadataCompat;
                handleInAppMessageTestPush handleinappmessagetestpush = r8lambdaturwertf3otevz1wenzex5tdwa.MediaSessionCompatQueueItem;
                wipeDatalambda0 wipedatalambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.MediaBrowserCompatMediaItem;
                BrazeActivityLifecycleCallbackListeneronActivityCreated2 brazeActivityLifecycleCallbackListeneronActivityCreated2 = r8lambdaturwertf3otevz1wenzex5tdwa.MediaDescriptionCompat;
                shouldHandleLifecycleMethodsInActivitylambda0 shouldhandlelifecyclemethodsinactivitylambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.read;
                r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug = r8lambdaturwertf3otevz1wenzex5tdwa.serializer;
                refreshBanners refreshbanners = r8lambdaturwertf3otevz1wenzex5tdwa.write;
                addBannerViewMonitor addbannerviewmonitor = r8lambdaturwertf3otevz1wenzex5tdwa.IconCompatParcelizer;
                invokeSuspendlambda0 invokesuspendlambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.getFullyDrawnReporter;
                r8lambdaE7oIx09KQauliA8paOfGanE2_e8 r8lambdae7oix09kqaulia8paofgane2_e8 = r8lambdaturwertf3otevz1wenzex5tdwa.getActivityResultRegistry;
                r8lambda7hSNgpBpNnHwzu2sYrBtefYqHlQ r8lambda7hsngpbpnnhwzu2syrbtefyqhlq = r8lambdaturwertf3otevz1wenzex5tdwa.getDefaultViewModelCreationExtras;
                setSessionHandlingBlocklist setsessionhandlingblocklist = r8lambdaturwertf3otevz1wenzex5tdwa.getDefaultViewModelProviderFactory;
                onActivityPausedlambda1 onactivitypausedlambda1 = r8lambdaturwertf3otevz1wenzex5tdwa.addOnTrimMemoryListener;
                unsubscribeFromBannersDismissedEvent unsubscribefrombannersdismissedevent = r8lambdaturwertf3otevz1wenzex5tdwa.addOnUserLeaveHintListener;
                requestGeofenceRefresh requestgeofencerefresh = r8lambdaturwertf3otevz1wenzex5tdwa.addOnPictureInPictureModeChangedListener;
                retryInAppMessage retryinappmessage = r8lambdaturwertf3otevz1wenzex5tdwa.addOnPictureInPictureUiStateChangedListener;
                r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r8lambda2l1vxswbmfutp9a4iejxpq7zf7a2 = r8lambdaturwertf3otevz1wenzex5tdwa.enterPictureInPictureMode;
                r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm = r8lambdaturwertf3otevz1wenzex5tdwa.addOnConfigurationChangedListener;
                BrazeUser brazeUser = r8lambdaturwertf3otevz1wenzex5tdwa.addMenuProvider;
                r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI r8lambdarsln0n_71nx5fiy5yo7knsgyi = r8lambdaturwertf3otevz1wenzex5tdwa.addOnNewIntentListener;
                r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y r8lambdastxqz_kvz8rg4vu3rz4svrea8y = r8lambdaturwertf3otevz1wenzex5tdwa.addOnContextAvailableListener;
                handleIncomingIntentlambda0 handleincomingintentlambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.addOnMultiWindowModeChangedListener;
                subscribeToBannersDismissedEvent subscribetobannersdismissedevent = r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedDispatcher_delegatelambda00;
                r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ r8lambdavny7iop5thifaarp93jfd1zipgq = r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedDispatcher_delegatelambda010;
                r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu = r8lambdaturwertf3otevz1wenzex5tdwa.fullyDrawnReporter_delegatelambda0;
                r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0i = r8lambdaturwertf3otevz1wenzex5tdwa.getSavedStateRegistryControllerannotations;
                setShouldPersistWebView setshouldpersistwebview = r8lambdaturwertf3otevz1wenzex5tdwa.menuHostHelperlambda0;
                r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg r8lambdaqgihof_5nhjpnmm9fgnt61b4dmg = r8lambdaturwertf3otevz1wenzex5tdwa.ensureViewModelStore;
                r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a = r8lambdaturwertf3otevz1wenzex5tdwa.addObserverForBackInvoker;
                BrazeBootReceiver brazeBootReceiver = r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda3;
                r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4 r8lambdaqoq3wl0ry1sjdgdfdxhrnvb36l4 = r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda2;
                r8lambda6XVpQwK1zU6mm_JruI3tIJroJFc r8lambda6xvpqwk1zu6mm_jrui3tijrojfc = r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda4;
                BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
                if (r8lambdaibd0azdffjr6m_pevs2l1iejku != null) {
                    i = 1;
                    b = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku2 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaibd0azdffjr6m_pevs2l1iejku2.RemoteActionCompatParcelizer);
                    b2 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i = 1;
                    b = 12;
                    b2 = 0;
                }
                if (r8lambda6xvpqwk1zu6mm_jrui3tijrojfc != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambda6xvpqwk1zu6mm_jrui3tijrojfc.serializer);
                    b3 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b3 = b2;
                }
                if (r8lambdaqoq3wl0ry1sjdgdfdxhrnvb36l4 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b3);
                }
                if (brazeBootReceiver != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b3);
                }
                if (r8lambdadtwa3yx1e9cvszaagaemidzvt8a != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, b);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b);
                    BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.write;
                    BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.IconCompatParcelizer;
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda4);
                    handleIncomingIntent handleincomingintent = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.RemoteActionCompatParcelizer;
                    if (handleincomingintent != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(handleincomingintent.IconCompatParcelizer);
                        b4 = 0;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    } else {
                        b4 = 0;
                    }
                    if (brazeCompanionExternalSyntheticLambda5 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b);
                        brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda5);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                } else {
                    b4 = 0;
                }
                if (r8lambdaqgihof_5nhjpnmm9fgnt61b4dmg != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, b);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (setshouldpersistwebview != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, b);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (r8lambdaxnkp5mxo9act549dmvgqnyhj0i != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, b);
                    r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaxnkp5mxo9act549dmvgqnyhj0i);
                }
                if (r8lambdazeccixubf3xvz58yt5bojkwhdu != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, b);
                    r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdazeccixubf3xvz58yt5bojkwhdu);
                }
                if (r8lambdavny7iop5thifaarp93jfd1zipgq != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, b);
                    b5 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b5 = 0;
                }
                if (subscribetobannersdismissedevent != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(11, b);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b5);
                }
                if (handleincomingintentlambda0 != 0) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(b, b);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    af$$ExternalSyntheticOutline1.m((byte) 8, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, handleincomingintentlambda0.IconCompatParcelizer);
                    SweepGradientShader9KIMszodefault.write(handleincomingintentlambda0.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(handleincomingintentlambda0.serializer.intValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (r8lambdastxqz_kvz8rg4vu3rz4svrea8y != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(13, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    String str2 = r8lambdastxqz_kvz8rg4vu3rz4svrea8y.read;
                    Boolean bool = r8lambdastxqz_kvz8rg4vu3rz4svrea8y.RemoteActionCompatParcelizer;
                    Boolean bool2 = r8lambdastxqz_kvz8rg4vu3rz4svrea8y.write;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
                    Boolean bool3 = r8lambdastxqz_kvz8rg4vu3rz4svrea8y.serializer;
                    if (bool3 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool3);
                    }
                    if (bool2 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 2, bool2);
                    }
                    if (bool != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 2, bool);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (r8lambdarsln0n_71nx5fiy5yo7knsgyi != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(14, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambdarsln0n_71nx5fiy5yo7knsgyi.write.shortValue());
                    String str3 = r8lambdarsln0n_71nx5fiy5yo7knsgyi.serializer;
                    if (str3 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (brazeUser != null) {
                    b6 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(15, (byte) 12);
                    BrazeUser.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeUser);
                } else {
                    b6 = 12;
                }
                if (r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(16, b6);
                    b7 = 3;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    Byte b33 = r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm.serializer;
                    Byte b34 = r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm.RemoteActionCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b33.byteValue());
                    Byte b35 = r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm.read;
                    if (b35 != null) {
                        getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b35);
                    }
                    if (b34 != null) {
                        getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b34);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b7 = 3;
                }
                if (r8lambda2l1vxswbmfutp9a4iejxpq7zf7a2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(17, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b7);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambda2l1vxswbmfutp9a4iejxpq7zf7a2.serializer.byteValue());
                    Byte b36 = r8lambda2l1vxswbmfutp9a4iejxpq7zf7a2.read;
                    if (b36 != null) {
                        getBitmapFromCache.read(b7, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b36);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (retryinappmessage != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(18, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b7);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(retryinappmessage.read.byteValue());
                    Boolean bool4 = retryinappmessage.serializer;
                    if (bool4 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool4);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (requestgeofencerefresh != null) {
                    Long l = requestgeofencerefresh.write;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(19, (byte) 12);
                    if (l != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l.longValue());
                    }
                    b8 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b8 = 0;
                }
                if (unsubscribefrombannersdismissedevent != null) {
                    b9 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(20, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b8);
                } else {
                    b9 = 12;
                }
                if (onactivitypausedlambda1 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(21, b9);
                    b10 = 3;
                    i2 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    IconCompatParcelizer.IconCompatParcelizer(onactivitypausedlambda1.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                } else {
                    b10 = 3;
                    i2 = 1;
                }
                if (setsessionhandlingblocklist != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(22, b9);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b10);
                    af$$ExternalSyntheticOutline1.m(b9, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, setsessionhandlingblocklist.RemoteActionCompatParcelizer);
                    setSessionHandlingBlocklistlambda0 setsessionhandlingblocklistlambda0 = setsessionhandlingblocklist.IconCompatParcelizer;
                    Byte b37 = setsessionhandlingblocklistlambda0.RemoteActionCompatParcelizer;
                    Byte b38 = setsessionhandlingblocklistlambda0.serializer;
                    if (b37 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b10);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setsessionhandlingblocklistlambda0.RemoteActionCompatParcelizer.byteValue());
                    }
                    if (b38 != null) {
                        getBitmapFromCache.read(b10, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b38);
                    }
                    b11 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b11 = 0;
                }
                if (r8lambda7hsngpbpnnhwzu2syrbtefyqhlq != null) {
                    b12 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(23, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b11);
                } else {
                    b12 = 12;
                }
                if (r8lambdae7oix09kqaulia8paofgane2_e8 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(24, b12);
                    r8lambdaE7oIx09KQauliA8paOfGanE2_e8.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdae7oix09kqaulia8paofgane2_e8);
                }
                if (invokesuspendlambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(25, b12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    af$$ExternalSyntheticOutline1.m((byte) 2, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, invokesuspendlambda0.RemoteActionCompatParcelizer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(invokesuspendlambda0.read.booleanValue() ? (byte) 1 : (byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (addbannerviewmonitor != null) {
                    b13 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(26, (byte) 12);
                    addBannerViewMonitor.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, addbannerviewmonitor);
                } else {
                    b13 = 12;
                }
                if (refreshbanners != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(27, b13);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b13);
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, refreshbanners.serializer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (r8lambdafjifijxjxuf3vopuwrut7txivug != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(28, b13);
                    r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdafjifijxjxuf3vopuwrut7txivug);
                }
                if (shouldhandlelifecyclemethodsinactivitylambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(29, b13);
                    shouldHandleLifecycleMethodsInActivitylambda0.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, shouldhandlelifecyclemethodsinactivitylambda0);
                }
                if (brazeActivityLifecycleCallbackListeneronActivityCreated2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(30, b13);
                    i3 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b13);
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeActivityLifecycleCallbackListeneronActivityCreated2.read);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i3 = 1;
                }
                if (wipedatalambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(31, b13);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i3, b13);
                    BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda6 = wipedatalambda0.RemoteActionCompatParcelizer;
                    BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda7 = wipedatalambda0.serializer;
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda6);
                    handleIncomingIntent handleincomingintent2 = wipedatalambda0.write;
                    if (handleincomingintent2 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b13);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i3, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(handleincomingintent2.IconCompatParcelizer);
                        b14 = 0;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    } else {
                        b14 = 0;
                    }
                    b15 = 3;
                    if (brazeCompanionExternalSyntheticLambda7 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b13);
                        brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda7);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b14);
                } else {
                    b14 = 0;
                    b15 = 3;
                }
                if (handleinappmessagetestpush != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(32, b13);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b15);
                    IconCompatParcelizer.IconCompatParcelizer(handleinappmessagetestpush.write, r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                }
                if (brazeInternal != null) {
                    Boolean bool5 = brazeInternal.RemoteActionCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(33, b13);
                    Boolean bool6 = brazeInternal.read;
                    Byte b39 = brazeInternal.serializer;
                    Boolean bool7 = brazeInternal.IconCompatParcelizer;
                    if (bool5 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 1, (byte) 2, bool5);
                    }
                    if (bool7 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool7);
                    }
                    if (b39 != null) {
                        getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b39);
                    }
                    if (bool6 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 2, bool6);
                    }
                    b16 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b16 = 0;
                }
                if (r8lambdaleifbdvox5ais6eoxkchnl8ojha != null) {
                    b17 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(34, (byte) 12);
                    i4 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    IconCompatParcelizer.IconCompatParcelizer(r8lambdaleifbdvox5ais6eoxkchnl8ojha.write, r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                } else {
                    b17 = 12;
                    i4 = 1;
                }
                if (setsdkenablementproviderandroid_sdk_base_release != null) {
                    BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda8 = setsdkenablementproviderandroid_sdk_base_release.read;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(35, b17);
                    Byte b40 = setsdkenablementproviderandroid_sdk_base_release.RemoteActionCompatParcelizer;
                    if (brazeCompanionExternalSyntheticLambda8 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i4, b17);
                        brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda8);
                    }
                    if (b40 != null) {
                        getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b40);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (getshouldpersistwebview != null) {
                    Map map = getshouldpersistwebview.serializer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(36, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite2 = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite2.hasNext()) {
                        Map.Entry entry = (Map.Entry) itWrite2.next();
                        String str4 = (String) entry.getKey();
                        String str5 = (String) entry.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str5);
                    }
                    b18 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b18 = 0;
                }
                if (addserializedcontentcardtostorage != null) {
                    b19 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(37, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(addserializedcontentcardtostorage.write.booleanValue() ? (byte) 1 : (byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b18);
                } else {
                    b19 = 12;
                }
                if (deleteregisteredgeofencecache != null) {
                    Boolean bool8 = deleteregisteredgeofencecache.write;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(38, b19);
                    Boolean bool9 = deleteregisteredgeofencecache.RemoteActionCompatParcelizer;
                    Boolean bool10 = deleteregisteredgeofencecache.IconCompatParcelizer;
                    i5 = 2;
                    if (bool8 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 1, (byte) 2, bool8);
                    }
                    if (bool10 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool10);
                    }
                    if (bool9 != null) {
                        MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 2, bool9);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i5 = 2;
                }
                if (getdelayedinitializationproviderandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(39, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                    IconCompatParcelizer.serializer(getdelayedinitializationproviderandroid_sdk_base_release.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, i5, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(getdelayedinitializationproviderandroid_sdk_base_release.IconCompatParcelizer.intValue());
                    String str6 = getdelayedinitializationproviderandroid_sdk_base_release.write;
                    if (str6 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str6);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (shouldhandlelifecyclemethodsinactivity != null) {
                    b20 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(40, (byte) 12);
                    shouldHandleLifecycleMethodsInActivity.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, shouldhandlelifecyclemethodsinactivity);
                } else {
                    b20 = 12;
                }
                if (registeronapplication != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(41, b20);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(registeronapplication.read);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 10);
                    IconCompatParcelizer.serializer(registeronapplication.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(registeronapplication.RemoteActionCompatParcelizer.longValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (setdelayedinitializationproviderandroid_sdk_base_release != null) {
                    b21 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(42, (byte) 12);
                    setDelayedInitializationProviderandroid_sdk_base_release.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setdelayedinitializationproviderandroid_sdk_base_release);
                } else {
                    b21 = 12;
                }
                if (r8lambdavyxnhk9sdraxwugvbef6izzxids != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(43, b21);
                    r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdavyxnhk9sdraxwugvbef6izzxids);
                }
                if (onactivitycreatedlambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(44, b21);
                    onActivityCreatedlambda0.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, onactivitycreatedlambda0);
                }
                if (r8lambdasfjrr_hlzhgr9qjkoigmntl4f8o != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(45, b21);
                    i6 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b21);
                    r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdasfjrr_hlzhgr9qjkoigmntl4f8o.serializer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i6 = 1;
                }
                if (r8lambdaqoukgs6h1gfby4ttokxnao8yog != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(46, b21);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i6, (byte) 15);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 3, r8lambdaqoukgs6h1gfby4ttokxnao8yog.write.size());
                    Iterator it = r8lambdaqoukgs6h1gfby4ttokxnao8yog.write.iterator();
                    while (it.hasNext()) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Byte) it.next()).byteValue());
                    }
                    b22 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b22 = 0;
                }
                if (r8lambdaczkucdbcfyqvin9wog5_olgdyq != null) {
                    b23 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(47, (byte) 12);
                    i7 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaczkucdbcfyqvin9wog5_olgdyq.serializer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b22);
                } else {
                    i7 = 1;
                    b23 = 12;
                }
                if (r8lambdaf8wsytxo3nnbajq7v_hfblwn80 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(48, b23);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i7, (byte) 3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambdaf8wsytxo3nnbajq7v_hfblwn80.IconCompatParcelizer.byteValue());
                    Byte b41 = r8lambdaf8wsytxo3nnbajq7v_hfblwn80.serializer;
                    if (b41 != null) {
                        getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b41);
                    }
                    b24 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b24 = 0;
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null) {
                    b25 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(49, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b24);
                } else {
                    b25 = 12;
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(50, b25);
                    r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(51, b25);
                    reenqueueInAppMessage reenqueueinappmessage = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(reenqueueinappmessage.IconCompatParcelizer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 3);
                    b26 = 0;
                    IconCompatParcelizer.IconCompatParcelizer(reenqueueinappmessage.write, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
                } else {
                    b26 = 0;
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != null) {
                    b27 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(52, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b26);
                } else {
                    b27 = 12;
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(53, b27);
                    handleIncomingIntentlambda2 handleincomingintentlambda2 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                    i8 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(handleincomingintentlambda2.serializer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b26);
                } else {
                    i8 = 1;
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.accessensureViewModelStore != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(54, b27);
                    recordGeofenceTransition recordgeofencetransition = r8lambdaturwertf3otevz1wenzex5tdwa.accessensureViewModelStore;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i8, (byte) 15);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 11, recordgeofencetransition.write.size());
                    Iterator it2 = recordgeofencetransition.write.iterator();
                    while (it2.hasNext()) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write((String) it2.next());
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 3);
                    IconCompatParcelizer.IconCompatParcelizer(recordgeofencetransition.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda1 != null) {
                    b28 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(55, (byte) 12);
                    r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda1);
                } else {
                    b28 = 12;
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.defaultViewModelProviderFactory_delegatelambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(56, b28);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.addObserverForBackInvokerlambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(57, b28);
                    r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q r8lambdak6izilh9v8ert5zk67d8tg0vc8q = r8lambdaturwertf3otevz1wenzex5tdwa.addObserverForBackInvokerlambda0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    af$$ExternalSyntheticOutline1.m(b28, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdak6izilh9v8ert5zk67d8tg0vc8q.RemoteActionCompatParcelizer);
                    publishBrazePushAction.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdak6izilh9v8ert5zk67d8tg0vc8q.IconCompatParcelizer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b28);
                    logPushCampaign.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdak6izilh9v8ert5zk67d8tg0vc8q.write);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b28);
                    r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdak6izilh9v8ert5zk67d8tg0vc8q.serializer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.createFullyDrawnExecutor != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(58, b28);
                    setConfiguredCustomEndpointandroid_sdk_base_release.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaturwertf3otevz1wenzex5tdwa.createFullyDrawnExecutor);
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.fullyDrawnReporter_delegatelambda00 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(59, b28);
                    onReceivelambda0 onreceivelambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.fullyDrawnReporter_delegatelambda00;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(onreceivelambda0.serializer.value);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(onreceivelambda0.IconCompatParcelizer.intValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.getOnBackPressedInput != null) {
                    b29 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(60, (byte) 12);
                    logLocationRecordedEvent.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaturwertf3otevz1wenzex5tdwa.getOnBackPressedInput);
                } else {
                    b29 = 12;
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedDispatcher_delegatelambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(61, b29);
                    r8lambda9XibBb_UAwpsuoULwKlfVxtang.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedDispatcher_delegatelambda0);
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.addContentView != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(62, b29);
                    getConfigurationProvider getconfigurationprovider = r8lambdaturwertf3otevz1wenzex5tdwa.addContentView;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getconfigurationprovider.RemoteActionCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedInput_delegatelambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(63, (byte) 12);
                    invokeSuspendlambda1.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedInput_delegatelambda0);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 4:
                r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0i2 = (r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I) obj;
                Map map2 = r8lambdaxnkp5mxo9act549dmvgqnyhj0i2.IconCompatParcelizer;
                Byte b42 = r8lambdaxnkp5mxo9act549dmvgqnyhj0i2.read;
                if (map2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite3 = MediaSessionCompatQueueItem.write(map2, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
                    while (itWrite3.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) itWrite3.next();
                        String str7 = (String) entry2.getKey();
                        String str8 = (String) entry2.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str7);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str8);
                    }
                }
                if (b42 != null) {
                    getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b42);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 5:
                r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0 r8lambdaverykpfxabvjgz2vb5xglrkr4_0 = (r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                SweepGradientShader9KIMszodefault.write(r8lambdaverykpfxabvjgz2vb5xglrkr4_0.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                SweepGradientShader9KIMszodefault.write(r8lambdaverykpfxabvjgz2vb5xglrkr4_0.read, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(r8lambdaverykpfxabvjgz2vb5xglrkr4_0.IconCompatParcelizer.intValue());
                String str9 = r8lambdaverykpfxabvjgz2vb5xglrkr4_0.serializer;
                if (str9 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str9);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 6:
                r8lambdacHkwrG2CFDKAOsabUOrbFFKX88 r8lambdachkwrg2cfdkaosabuorbffkx88 = (r8lambdacHkwrG2CFDKAOsabUOrbFFKX88) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                Integer num = r8lambdachkwrg2cfdkaosabuorbffkx88.RemoteActionCompatParcelizer;
                Short sh2 = r8lambdachkwrg2cfdkaosabuorbffkx88.RatingCompat;
                Short sh3 = r8lambdachkwrg2cfdkaosabuorbffkx88.MediaBrowserCompatMediaItem;
                SweepGradientShader9KIMszodefault.write(num, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                SweepGradientShader9KIMszodefault.write(r8lambdachkwrg2cfdkaosabuorbffkx88.read, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(r8lambdachkwrg2cfdkaosabuorbffkx88.serializer.intValue());
                Short sh4 = r8lambdachkwrg2cfdkaosabuorbffkx88.write;
                if (sh4 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, sh4);
                }
                if (sh3 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, sh3);
                }
                if (sh2 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 6, r8lambdat7xjd1d4humw0psb7whucfgonss, sh2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 7:
                r8lambdayRbQ7QfQWGgIRqExwjVfCaJEGI r8lambdayrbq7qfqwggirqexwjvfcajegi = (r8lambdayRbQ7QfQWGgIRqExwjVfCaJEGI) obj;
                Short sh5 = r8lambdayrbq7qfqwggirqexwjvfcajegi.read;
                Integer num2 = r8lambdayrbq7qfqwggirqexwjvfcajegi.ParcelableVolumeInfo;
                Integer num3 = r8lambdayrbq7qfqwggirqexwjvfcajegi.MediaSessionCompatQueueItem;
                Integer num4 = r8lambdayrbq7qfqwggirqexwjvfcajegi.MediaDescriptionCompat;
                Short sh6 = r8lambdayrbq7qfqwggirqexwjvfcajegi.MediaMetadataCompat;
                Short sh7 = r8lambdayrbq7qfqwggirqexwjvfcajegi.MediaBrowserCompatMediaItem;
                Short sh8 = r8lambdayrbq7qfqwggirqexwjvfcajegi.RatingCompat;
                Short sh9 = r8lambdayrbq7qfqwggirqexwjvfcajegi.write;
                Short sh10 = r8lambdayrbq7qfqwggirqexwjvfcajegi.RemoteActionCompatParcelizer;
                Short sh11 = r8lambdayrbq7qfqwggirqexwjvfcajegi.serializer;
                Map map3 = r8lambdayrbq7qfqwggirqexwjvfcajegi.MediaSessionCompatResultReceiverWrapper;
                List list3 = r8lambdayrbq7qfqwggirqexwjvfcajegi.MediaSessionCompatToken;
                List list4 = r8lambdayrbq7qfqwggirqexwjvfcajegi.PlaybackStateCompat;
                if (sh5 != null) {
                    b30 = 6;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambdayrbq7qfqwggirqexwjvfcajegi.read.shortValue());
                } else {
                    b30 = 6;
                }
                if (sh11 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b30, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh11);
                }
                if (sh10 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b30, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, sh10);
                }
                if (sh9 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b30, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, sh9);
                }
                if (sh8 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b30, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, sh8);
                }
                if (sh7 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b30, b30, r8lambdat7xjd1d4humw0psb7whucfgonss, sh7);
                }
                if (sh6 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b30, 7, r8lambdat7xjd1d4humw0psb7whucfgonss, sh6);
                }
                if (num4 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 8, (byte) 8, num4);
                }
                if (num3 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 9, (byte) 8, num3);
                }
                if (num2 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 10, (byte) 8, num2);
                }
                if (list4 != null) {
                    Iterator itWrite4 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 11, (byte) 15, list4, (byte) 3);
                    while (itWrite4.hasNext()) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Byte) itWrite4.next()).byteValue());
                    }
                }
                if (list3 != null) {
                    Iterator itWrite5 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 12, (byte) 15, list3, (byte) 3);
                    while (itWrite5.hasNext()) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Byte) itWrite5.next()).byteValue());
                    }
                }
                if (map3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(13, (byte) 13);
                    Iterator itWrite6 = MediaSessionCompatQueueItem.write(map3, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 15);
                    while (itWrite6.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) itWrite6.next();
                        Byte b43 = (Byte) entry3.getKey();
                        List list5 = (List) entry3.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b43.byteValue());
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 3, list5.size());
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Byte) it3.next()).byteValue());
                        }
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 8:
                accessgetUserCachep accessgetusercachep = (accessgetUserCachep) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                setDeviceObjectAllowlistEnabledandroid_sdk_base_release setdeviceobjectallowlistenabledandroid_sdk_base_release = accessgetusercachep.read;
                String str10 = setdeviceobjectallowlistenabledandroid_sdk_base_release.RemoteActionCompatParcelizer;
                String str11 = setdeviceobjectallowlistenabledandroid_sdk_base_release.write;
                String str12 = setdeviceobjectallowlistenabledandroid_sdk_base_release.read;
                if (str10 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setdeviceobjectallowlistenabledandroid_sdk_base_release.RemoteActionCompatParcelizer);
                }
                if (str12 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str12);
                }
                if (str11 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str11);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o r8lambdalhrh0wcdualb1ubrbfl71ebc4o = accessgetusercachep.serializer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdalhrh0wcdualb1ubrbfl71ebc4o.IconCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0 r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0 = r8lambdalhrh0wcdualb1ubrbfl71ebc4o.write;
                r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE r8lambdao3_bo_8zvdrigycl2l6jayoawe = r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0.RemoteActionCompatParcelizer;
                r8lambdao3_bo_8zvdrigycl2l6jayoawe.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 15);
                List list6 = r8lambdalhrh0wcdualb1ubrbfl71ebc4o.RemoteActionCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 12, list6.size());
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    r8lambdao3_bo_8zvdrigycl2l6jayoawe.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0) it4.next());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 9:
                addToCustomAttributeArraylambda1 addtocustomattributearraylambda1 = (addToCustomAttributeArraylambda1) obj;
                Double d = addtocustomattributearraylambda1.serializer;
                String str13 = addtocustomattributearraylambda1.IconCompatParcelizer;
                Double d2 = addtocustomattributearraylambda1.read;
                if (d != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(addtocustomattributearraylambda1.serializer.doubleValue());
                }
                if (d2 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d2);
                }
                if (str13 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str13);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 10:
                incrementCustomUserAttributelambda0 incrementcustomuserattributelambda0 = (incrementCustomUserAttributelambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                incrementCustomUserAttribute incrementcustomuserattribute = incrementcustomuserattributelambda0.IconCompatParcelizer;
                if (incrementcustomuserattribute.read != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(incrementcustomuserattribute.read);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                setCustomEndpoint setcustomendpoint = incrementcustomuserattributelambda0.write;
                if (setcustomendpoint.RemoteActionCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint.RemoteActionCompatParcelizer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 11:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(((removeFromCustomAttributeArraylambda1) obj).write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 12:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(((setCustomUserAttributelambda0) obj).RemoteActionCompatParcelizer.intValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 13:
                setCustomUserAttributelambda3 setcustomuserattributelambda3 = (setCustomUserAttributelambda3) obj;
                addToCustomAttributeArraylambda1 addtocustomattributearraylambda2 = setcustomuserattributelambda3.write;
                setLastKnownLocationdefault setlastknownlocationdefault = setcustomuserattributelambda3.IconCompatParcelizer;
                setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0 setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0 = setcustomuserattributelambda3.read;
                if (addtocustomattributearraylambda2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    addToCustomAttributeArraylambda1 addtocustomattributearraylambda3 = setcustomuserattributelambda3.write;
                    Double d3 = addtocustomattributearraylambda3.serializer;
                    String str14 = addtocustomattributearraylambda3.IconCompatParcelizer;
                    Double d4 = addtocustomattributearraylambda3.read;
                    if (d3 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(addtocustomattributearraylambda3.serializer.doubleValue());
                    }
                    if (d4 != null) {
                        af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d4);
                    }
                    if (str14 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str14);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0 != null) {
                    Double d5 = setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0.serializer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    String str15 = setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0.write;
                    Double d6 = setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0.read;
                    if (d5 != null) {
                        af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 1, (byte) 4, d5);
                    }
                    if (d6 != null) {
                        af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d6);
                    }
                    if (str15 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str15);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (setlastknownlocationdefault != null) {
                    Double d7 = setlastknownlocationdefault.write;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
                    String str16 = setlastknownlocationdefault.RemoteActionCompatParcelizer;
                    if (d7 != null) {
                        af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 1, (byte) 4, d7);
                    }
                    if (str16 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str16);
                    }
                    b31 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b31 = 0;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b31);
                break;
            case 14:
                setHomeCitylambda0 sethomecitylambda0 = (setHomeCitylambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                String str17 = sethomecitylambda0.read;
                String str18 = sethomecitylambda0.MediaDescriptionCompat;
                String str19 = sethomecitylambda0.MediaBrowserCompatMediaItem;
                String str20 = sethomecitylambda0.RatingCompat;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str17);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(sethomecitylambda0.IconCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(sethomecitylambda0.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 10);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(sethomecitylambda0.serializer.longValue());
                Long l2 = sethomecitylambda0.MediaSessionCompatQueueItem;
                if (l2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l2.longValue());
                }
                if (str20 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str20);
                }
                if (str19 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str19);
                }
                if (str18 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str18);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 15:
                setLineIdlambda20 setlineidlambda20 = (setLineIdlambda20) obj;
                String str21 = setlineidlambda20.read;
                String str22 = setlineidlambda20.write;
                String str23 = setlineidlambda20.RemoteActionCompatParcelizer;
                String str24 = setlineidlambda20.serializer;
                if (str21 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlineidlambda20.read);
                }
                if (str24 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str24);
                }
                if (str23 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str23);
                }
                if (str22 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str22);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 16:
                setLineIdlambda3 setlineidlambda3 = (setLineIdlambda3) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                setLanguagelambda0 setlanguagelambda0 = setlineidlambda3.IconCompatParcelizer;
                if (setlanguagelambda0.IconCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlanguagelambda0.IconCompatParcelizer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                setPhoneNumberlambda0.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setlineidlambda3.read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 17:
                setLocationCustomAttributelambda0 setlocationcustomattributelambda0 = (setLocationCustomAttributelambda0) obj;
                Boolean bool11 = setlocationcustomattributelambda0.serializer;
                Short sh12 = setlocationcustomattributelambda0.RemoteActionCompatParcelizer;
                Short sh13 = setlocationcustomattributelambda0.write;
                if (bool11 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setlocationcustomattributelambda0.serializer.booleanValue() ? (byte) 1 : (byte) 0);
                }
                if (sh13 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh13);
                }
                if (sh12 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, sh12);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 18:
                unsetCustomUserAttributelambda0 unsetcustomuserattributelambda0 = (unsetCustomUserAttributelambda0) obj;
                if (unsetcustomuserattributelambda0.RemoteActionCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(unsetcustomuserattributelambda0.RemoteActionCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 19:
                addToSubscriptionGroup addtosubscriptiongroup = (addToSubscriptionGroup) obj;
                Double d8 = addtosubscriptiongroup.read;
                Double d9 = addtosubscriptiongroup.serializer;
                if (d8 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(addtosubscriptiongroup.read.doubleValue());
                }
                if (d9 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d9);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 20:
                serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, obj);
                break;
            case 21:
                IconCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss, obj);
                break;
            case 22:
                RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss, obj);
                break;
            case 23:
                write(r8lambdat7xjd1d4humw0psb7whucfgonss, obj);
                break;
            case 24:
                MediaDescriptionCompat(r8lambdat7xjd1d4humw0psb7whucfgonss, obj);
                break;
            case 25:
                MediaSessionCompatQueueItem(r8lambdat7xjd1d4humw0psb7whucfgonss, obj);
                break;
            case 26:
                MediaBrowserCompatMediaItem(r8lambdat7xjd1d4humw0psb7whucfgonss, obj);
                break;
            case 27:
                MediaMetadataCompat(r8lambdat7xjd1d4humw0psb7whucfgonss, obj);
                break;
            case 28:
                RatingCompat(r8lambdat7xjd1d4humw0psb7whucfgonss, obj);
                break;
            default:
                setDefaultNotificationChannelDescriptionlambda0 setdefaultnotificationchanneldescriptionlambda0 = (setDefaultNotificationChannelDescriptionlambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                af$$ExternalSyntheticOutline1.m((byte) 10, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, setdefaultnotificationchanneldescriptionlambda0.RemoteActionCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setdefaultnotificationchanneldescriptionlambda0.write.longValue());
                Byte b44 = setdefaultnotificationchanneldescriptionlambda0.read;
                if (b44 != null) {
                    getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b44);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
        }
    }
}
