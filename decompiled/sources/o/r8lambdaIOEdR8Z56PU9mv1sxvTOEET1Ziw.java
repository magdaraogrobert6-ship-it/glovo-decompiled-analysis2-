package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
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
public final class r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(int i) {
        this.write = i;
    }

    private final Object IconCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        k$c k_c = new k$c();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new isAmazonDevice(k_c);
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 2:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 3:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.IconCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 4:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.read = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 5:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.serializer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 6:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.MediaSessionCompatQueueItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 7:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.MediaBrowserCompatMediaItem = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 8:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        k_c.MediaDescriptionCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                default:
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    break;
            }
        }
    }

    private final Object MediaMetadataCompat(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
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
                    r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = (setDefaultNotificationChannelNamelambda0) setDefaultNotificationChannelNamelambda0.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 15) {
                int i = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken()));
                }
                r8lambda1mnczrzuv4owduwgkg6cjtsws.write = arrayList;
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((ArrayList) r8lambda1mnczrzuv4owduwgkg6cjtsws.write) != null) {
            return new r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg(r8lambda1mnczrzuv4owduwgkg6cjtsws);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'automatic_sync' is missing");
        return null;
    }

    private final Object MediaSessionCompatQueueItem(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        setPhoneNumberlambda3 setphonenumberlambda3 = new setPhoneNumberlambda3();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new setApiKeylambda0(setphonenumberlambda3);
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

    private final Object write(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
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
                    r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = (unsetLocationCustomAttributelambda0) unsetLocationCustomAttributelambda0.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 3) {
                r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((Byte) r8lambda1mnczrzuv4owduwgkg6cjtsws.write) != null) {
            return new getIntentFlags(r8lambda1mnczrzuv4owduwgkg6cjtsws);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'zoom_level' is missing");
        return null;
    }

    private final Object read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(7);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return iscontentcardsunreadvisualindicatorenabled.read();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        } else if (b == 12) {
                            iscontentcardsunreadvisualindicatorenabled.read = (setCustomUserAttributelambda2) setCustomUserAttributelambda2.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 12) {
                        iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = (setPhoneNumber) setPhoneNumber.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 12) {
                    iscontentcardsunreadvisualindicatorenabled.write = (setEmailNotificationSubscriptionTypelambda0) setEmailNotificationSubscriptionTypelambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 3) {
                iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object serializer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(5);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return iscontentcardsunreadvisualindicatorenabled.serializer();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
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
                            iscontentcardsunreadvisualindicatorenabled.read = new setCustomUserAttributelambda5(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 12) {
                        iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = (removeFromSubscriptionGrouplambda0) removeFromSubscriptionGrouplambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 12) {
                    iscontentcardsunreadvisualindicatorenabled.write = (setCustomUserAttributeToSecondsFromEpoch) setCustomUserAttributeToSecondsFromEpoch.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 12) {
                iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = (setLineId) setLineId.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        int i = 9;
        byte b = 13;
        int i2 = 8;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.write) {
            case 0:
                r8lambdaFtgykSaC7C6ocmzGhhm1R9I r8lambdaftgyksac7c6ocmzghhm1r9i = new r8lambdaFtgykSaC7C6ocmzGhhm1R9I();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    if (b2 == 0) {
                        return new r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug(r8lambdaftgyksac7c6ocmzghhm1r9i);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                        case 1:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 2:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 3:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 4:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 5:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 6:
                            if (b2 == 3) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.RatingCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 7:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.MediaMetadataCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 8:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.MediaDescriptionCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 9:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.MediaSessionCompatQueueItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 10:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.ParcelableVolumeInfo = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 11:
                            if (b2 == 2) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.PlaybackStateCompatCustomAction = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 12:
                            if (b2 == 2) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.MediaSessionCompatToken = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 13:
                            if (b2 == 2) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.PlaybackStateCompat = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 14:
                            if (b2 == 2) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.MediaSessionCompatResultReceiverWrapper = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 15:
                            if (b2 == 6) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 16:
                            if (b2 == 6) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.ComponentActivity = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 17:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 18:
                            if (b2 == 6) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.ResultReceiver = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 19:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 20:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 21:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 22:
                            if (b2 == 15) {
                                int i3 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList = new ArrayList(i3);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    arrayList.add((r8lambdaR6dAybf4g5pc5sZkFujTnBDSk) r8lambdaR6dAybf4g5pc5sZkFujTnBDSk.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = arrayList;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 23:
                            if (b2 == 6) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 24:
                            if (b2 == 12) {
                                NetworkBody networkBody = new NetworkBody(13);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                                    if (b3 == 0) {
                                        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new BrazeFlushPushDeliveryReceiver(networkBody);
                                        break;
                                    } else {
                                        short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer;
                                        if (s != 1) {
                                            if (s != 2) {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                            } else if (b3 == 6) {
                                                networkBody.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                                            } else {
                                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                            }
                                        } else if (b3 == 6) {
                                            networkBody.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                                        } else {
                                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                        }
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                break;
                            }
                            break;
                        case 25:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 26:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 27:
                            if (b2 == 11) {
                                r8lambdaftgyksac7c6ocmzghhm1r9i.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            break;
                    }
                }
                break;
            case 1:
                N$b n$b = new N$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                    if (b4 == 0) {
                        if (((String) n$b.read) != null) {
                            if (((ArrayList) n$b.write) != null) {
                                if (((Byte) n$b.IconCompatParcelizer) != null) {
                                    return new r8lambda9XibBb_UAwpsuoULwKlfVxtang(n$b);
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'event_type' is missing");
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'geofences' is missing");
                            }
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'uuid' is missing");
                        }
                        return null;
                    }
                    short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer;
                    if (s2 != 1) {
                        if (s2 != 2) {
                            if (s2 != 3) {
                                if (s2 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                } else if (b4 == 12) {
                                    n$b.serializer = (BrazeCompanionExternalSyntheticLambda4) BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                }
                            } else if (b4 == 3) {
                                n$b.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                            }
                        } else if (b4 == 15) {
                            int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                            ArrayList arrayList2 = new ArrayList(i5);
                            for (int i6 = 0; i6 < i5; i6++) {
                                arrayList2.add((r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E) r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            }
                            n$b.write = arrayList2;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                        }
                    } else if (b4 == 11) {
                        n$b.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                    }
                }
                break;
            case 2:
                break;
            case 3:
                FormBody.Builder builder = new FormBody.Builder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                    if (b5 == 0) {
                        if (((Short) builder.serializer) != null) {
                            return new r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI(builder);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timezone' is missing");
                        return null;
                    }
                    short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer;
                    if (s3 != 1) {
                        if (s3 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                        } else if (b5 == 11) {
                            builder.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                        }
                    } else if (b5 == 6) {
                        builder.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                    }
                }
                break;
            case 4:
                O$b o$b = new O$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.RemoteActionCompatParcelizer;
                    if (b6 == 0) {
                        return o$b.MediaMetadataCompat();
                    }
                    short s4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.serializer;
                    if (s4 != 1) {
                        if (s4 != 2) {
                            if (s4 != 3) {
                                if (s4 != 4) {
                                    if (s4 != 5) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                                    } else if (b6 == 13) {
                                        int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                                        HashMap map = new HashMap(i7);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            map.put(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()), Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat()));
                                        }
                                        o$b.IconCompatParcelizer = map;
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                                    }
                                } else if (b6 == 15) {
                                    int i9 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                    ArrayList arrayList3 = new ArrayList(i9);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        arrayList3.add((r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4) r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                    }
                                    o$b.read = arrayList3;
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                                }
                            } else if (b6 == 3) {
                                o$b.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                        } else if (b6 == 13) {
                            int i11 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                            HashMap map2 = new HashMap(i11);
                            for (int i12 = 0; i12 < i11; i12++) {
                                map2.put(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()), Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                            }
                            o$b.RemoteActionCompatParcelizer = map2;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        }
                    } else if (b6 == 8) {
                        o$b.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                    }
                }
                break;
            case 5:
                r8lambdaZA7Eh514LyJrawNusHpVw7pA98 r8lambdaza7eh514lyjrawnushpvw7pa98 = new r8lambdaZA7Eh514LyJrawNusHpVw7pA98();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.RemoteActionCompatParcelizer;
                    if (b7 == 0) {
                        if (r8lambdaza7eh514lyjrawnushpvw7pa98.read != null) {
                            if (r8lambdaza7eh514lyjrawnushpvw7pa98.write != null) {
                                if (r8lambdaza7eh514lyjrawnushpvw7pa98.serializer != null) {
                                    return new r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE(r8lambdaza7eh514lyjrawnushpvw7pa98);
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'end_time' is missing");
                            }
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start_time' is missing");
                        }
                        return null;
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.serializer) {
                        case 1:
                            if (b7 == 10) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.read = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 2:
                            if (b7 == 10) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 3:
                            if (b7 == 3) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 4:
                            if (b7 == 8) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 5:
                            if (b7 == 8) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.RemoteActionCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 6:
                            if (b7 == 8) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.MediaDescriptionCompat = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 7:
                            if (b7 == 3) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.MediaMetadataCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 8:
                            if (b7 == 15) {
                                int i13 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList4 = new ArrayList(i13);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    arrayList4.add((getDelayedInitializationProviderandroid_sdk_base_release) getDelayedInitializationProviderandroid_sdk_base_release.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                r8lambdaza7eh514lyjrawnushpvw7pa98.MediaBrowserCompatMediaItem = arrayList4;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            break;
                    }
                }
                break;
            case 6:
                r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.RemoteActionCompatParcelizer;
                    if (b8 == 0) {
                        return r8lambda1mnczrzuv4owduwgkg6cjtsws.serializer();
                    }
                    short s5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.serializer;
                    if (s5 != 1) {
                        if (s5 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                        } else if (b8 == 15) {
                            int i15 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                            ArrayList arrayList5 = new ArrayList(i15);
                            for (int i16 = 0; i16 < i15; i16++) {
                                arrayList5.add((r8lambdacHkwrG2CFDKAOsabUOrbFFKX88) r8lambdacHkwrG2CFDKAOsabUOrbFFKX88.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            }
                            r8lambda1mnczrzuv4owduwgkg6cjtsws.write = arrayList5;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                        }
                    } else if (b8 == 10) {
                        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                    }
                }
                break;
            case 7:
                r8lambdamXVT_jugIlUrYH44s7scl52H3aY r8lambdamxvt_jugiluryh44s7scl52h3ay = new r8lambdamXVT_jugIlUrYH44s7scl52H3aY();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.RemoteActionCompatParcelizer;
                    if (b9 == 0) {
                        return new r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ(r8lambdamxvt_jugiluryh44s7scl52h3ay);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.serializer) {
                        case 1:
                            if (b9 == 11) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 2:
                            if (b9 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.read = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 3:
                            if (b9 == 2) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.write = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 4:
                            if (b9 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 5:
                            if (b9 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.RemoteActionCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 6:
                            if (b9 == 2) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.MediaMetadataCompat = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 7:
                            if (b9 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.MediaBrowserCompatMediaItem = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            break;
                    }
                }
                break;
            case 8:
                removeFromCustomAttributeArray removefromcustomattributearray = new removeFromCustomAttributeArray();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.RemoteActionCompatParcelizer;
                    if (b10 == 0) {
                        return new _set_userId_lambda0(removefromcustomattributearray);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.serializer) {
                        case 1:
                            if (b10 == 11) {
                                removefromcustomattributearray.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 2:
                            if (b10 == 4) {
                                removefromcustomattributearray.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 3:
                            if (b10 == 11) {
                                removefromcustomattributearray.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 4:
                            if (b10 == 12) {
                                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(i2, (boolean) (objArr == true ? 1 : 0));
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.RemoteActionCompatParcelizer;
                                    if (b11 == 0) {
                                        removefromcustomattributearray.read = new setFirstNamelambda0(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release);
                                        break;
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                                    } else if (b11 == 4) {
                                        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                                break;
                            }
                            break;
                        case 5:
                            if (b10 == 15) {
                                int i17 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList6 = new ArrayList(i17);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    arrayList6.add((isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release) isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                removefromcustomattributearray.IconCompatParcelizer = arrayList6;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 6:
                            if (b10 == 11) {
                                removefromcustomattributearray.MediaSessionCompatQueueItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 7:
                            if (b10 == 11) {
                                removefromcustomattributearray.MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            break;
                    }
                }
                break;
            case 9:
                IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.RemoteActionCompatParcelizer;
                    if (b12 == 0) {
                        if (((incrementCustomUserAttribute) iOParser$Decoder.RemoteActionCompatParcelizer) != null) {
                            if (((setLocationCustomAttributelambda1) iOParser$Decoder.read) != null) {
                                return new addToSubscriptionGrouplambda2(iOParser$Decoder);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'hub' is missing");
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                        }
                        return null;
                    }
                    short s6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.serializer;
                    if (s6 != 1) {
                        if (s6 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                        } else if (b12 == 12) {
                            iOParser$Decoder.read = (setLocationCustomAttributelambda1) setLocationCustomAttributelambda1.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                        }
                    } else if (b12 == 12) {
                        iOParser$Decoder.RemoteActionCompatParcelizer = (incrementCustomUserAttribute) incrementCustomUserAttribute.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                    }
                }
                break;
            case 10:
                r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
                r8lambdat7xjd1d4humw0psb7whucfgonss.getClass();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b13 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.RemoteActionCompatParcelizer;
                    if (b13 == 0) {
                        return r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.serializer) {
                        case 1:
                            if (b13 == 12) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = (setHomeCitylambda1) setHomeCitylambda1.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                            }
                            break;
                        case 2:
                            if (b13 == 10) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                            }
                            break;
                        case 3:
                            if (b13 == 10) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                            }
                            break;
                        case 4:
                            if (b13 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                            }
                            break;
                        case 5:
                            if (b13 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                            }
                            break;
                        case 6:
                            if (b13 == 12) {
                                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(6);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b14 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.RemoteActionCompatParcelizer;
                                    if (b14 == 0) {
                                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.read = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.serializer();
                                        break;
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                                    } else if (b14 == 11) {
                                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                                break;
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                            break;
                    }
                }
                break;
            case 11:
                IOParser$Decoder iOParser$Decoder2 = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b15 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.RemoteActionCompatParcelizer;
                    if (b15 == 0) {
                        if (((setCustomEndpoint) iOParser$Decoder2.RemoteActionCompatParcelizer) != null) {
                            if (((unsetLocationCustomAttributelambda2) iOParser$Decoder2.read) != null) {
                                return new setCustomAttributedefault(iOParser$Decoder2);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'install' is missing");
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'person' is missing");
                        }
                        return null;
                    }
                    short s7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.serializer;
                    if (s7 != 1) {
                        if (s7 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                        } else if (b15 == 12) {
                            iOParser$Decoder2.read = (unsetLocationCustomAttributelambda2) unsetLocationCustomAttributelambda2.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                        }
                    } else if (b15 == 12) {
                        r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2 = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(13);
                        while (true) {
                            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                            byte b16 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.RemoteActionCompatParcelizer;
                            if (b16 == 0) {
                                iOParser$Decoder2.RemoteActionCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2.RemoteActionCompatParcelizer();
                            } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.serializer != 1) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            } else if (b16 == 11) {
                                r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            }
                        }
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                    }
                }
                break;
            case 12:
                r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws2 = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b17 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.RemoteActionCompatParcelizer;
                    if (b17 == 0) {
                        return r8lambda1mnczrzuv4owduwgkg6cjtsws2.IconCompatParcelizer();
                    }
                    short s8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.serializer;
                    if (s8 != 1) {
                        if (s8 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                        } else if (b17 == 10) {
                            r8lambda1mnczrzuv4owduwgkg6cjtsws2.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                        }
                    } else if (b17 == 3) {
                        r8lambda1mnczrzuv4owduwgkg6cjtsws2.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                    }
                }
                break;
            case 13:
                C$b c$b = new C$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b18 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.RemoteActionCompatParcelizer;
                    if (b18 == 0) {
                        return new setCustomUserAttributeToSecondsFromEpochlambda0(c$b);
                    }
                    short s9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.serializer;
                    if (s9 != 1) {
                        if (s9 != 2) {
                            if (s9 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                            } else if (b18 == 6) {
                                c$b.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                            }
                        } else if (b18 == 6) {
                            c$b.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                        }
                    } else if (b18 == 13) {
                        int i19 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map3 = new HashMap(i19);
                        for (int i20 = 0; i20 < i19; i20++) {
                            map3.put(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()), (getBrazeSdkMetadataandroid_sdk_base_release) getBrazeSdkMetadataandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                        }
                        c$b.serializer = map3;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                    }
                }
                break;
            case 14:
                IOParser$Decoder iOParser$Decoder3 = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b19 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.RemoteActionCompatParcelizer;
                    if (b19 == 0) {
                        return new setLastKnownLocationdefault(iOParser$Decoder3);
                    }
                    short s10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.serializer;
                    if (s10 != 1) {
                        if (s10 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                        } else if (b19 == 11) {
                            iOParser$Decoder3.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                        }
                    } else if (b19 == 4) {
                        iOParser$Decoder3.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                    }
                }
                break;
            case 15:
                NetworkBody networkBody2 = new NetworkBody(18);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b20 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.RemoteActionCompatParcelizer;
                    if (b20 == 0) {
                        if (((Long) networkBody2.IconCompatParcelizer) != null) {
                            if (((Integer) networkBody2.RemoteActionCompatParcelizer) != null) {
                                return new setLastKnownLocationlambda0(networkBody2);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'magnitude' is missing");
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
                        }
                        return null;
                    }
                    short s11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.serializer;
                    if (s11 != 1) {
                        if (s11 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                        } else if (b20 == 8) {
                            networkBody2.RemoteActionCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                        }
                    } else if (b20 == 10) {
                        networkBody2.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                    }
                }
                break;
            case 16:
                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2 = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(i, (boolean) (objArr2 == true ? 1 : 0));
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b21 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20.RemoteActionCompatParcelizer;
                    if (b21 == 0) {
                        if (((Short) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2.write) != null) {
                            return new setLocationCustomAttributelambda3(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'peak_threshold' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                    } else if (b21 == 6) {
                        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                    }
                }
                break;
            case 17:
                setPhoneNumberlambda3 setphonenumberlambda3 = new setPhoneNumberlambda3();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b22 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21.RemoteActionCompatParcelizer;
                    if (b22 == 0) {
                        return new setPushNotificationSubscriptionTypelambda0(setphonenumberlambda3);
                    }
                    short s12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21.serializer;
                    if (s12 != 1) {
                        if (s12 != 2) {
                            if (s12 != 3) {
                                if (s12 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                                } else if (b22 == 11) {
                                    setphonenumberlambda3.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                                }
                            } else if (b22 == 11) {
                                setphonenumberlambda3.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                            }
                        } else if (b22 == 11) {
                            setphonenumberlambda3.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                        }
                    } else if (b22 == 11) {
                        setphonenumberlambda3.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                    }
                }
                break;
            case 18:
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k3 = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(9);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b23 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22.RemoteActionCompatParcelizer;
                    if (b23 == 0) {
                        int i21 = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k3.RemoteActionCompatParcelizer != null ? 1 : 0;
                        if (i21 == 1) {
                            return new unsetLocationCustomAttributelambda2(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k3);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i21, "Invalid union; ", " field(s) were set"));
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                    } else if (b23 == 11) {
                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k3.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                    }
                }
                break;
            case 19:
                k$c k_c = new k$c();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b24 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23.RemoteActionCompatParcelizer;
                    if (b24 == 0) {
                        return new addToCustomAttributeArray(k_c);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23.serializer) {
                        case 1:
                            if (b24 == 11) {
                                k_c.MediaSessionCompatQueueItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                            }
                            break;
                        case 2:
                            if (b24 == 4) {
                                k_c.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                            }
                            break;
                        case 3:
                            if (b24 == 11) {
                                k_c.MediaDescriptionCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                            }
                            break;
                        case 4:
                            if (b24 == 4) {
                                k_c.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                            }
                            break;
                        case 5:
                            if (b24 == 4) {
                                k_c.IconCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                            }
                            break;
                        case 6:
                            if (b24 == 11) {
                                k_c.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                            }
                            break;
                        case 7:
                            if (b24 == 4) {
                                k_c.read = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                            }
                            break;
                        case 8:
                            if (b24 == 15) {
                                int i22 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList7 = new ArrayList(i22);
                                for (int i23 = 0; i23 < i22; i23++) {
                                    arrayList7.add(Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat()));
                                }
                                k_c.MediaBrowserCompatMediaItem = arrayList7;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                            break;
                    }
                }
                break;
            case 20:
                IOParser$Decoder iOParser$Decoder4 = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b25 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24.RemoteActionCompatParcelizer;
                    if (b25 == 0) {
                        return new setAttributionData(iOParser$Decoder4);
                    }
                    short s13 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24.serializer;
                    if (s13 != 1) {
                        if (s13 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                        } else if (b25 == 6) {
                            iOParser$Decoder4.read = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                        }
                    } else if (b25 == 6) {
                        iOParser$Decoder4.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                    }
                }
                break;
            case 21:
                C$b c$b2 = new C$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b26 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25.RemoteActionCompatParcelizer;
                    if (b26 == 0) {
                        if (((Long) c$b2.serializer) != null) {
                            return new setCustomUserAttributeToSecondsFromEpoch(c$b2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stop' is missing");
                        return null;
                    }
                    short s14 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25.serializer;
                    if (s14 != 1) {
                        if (s14 != 2) {
                            if (s14 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            } else if (b26 == b) {
                                int i24 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                                HashMap map4 = new HashMap(i24);
                                for (int i25 = 0; i25 < i24; i25++) {
                                    String strRemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                    int i26 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                    ArrayList arrayList8 = new ArrayList(i26);
                                    for (int i27 = 0; i27 < i26; i27++) {
                                        arrayList8.add((setFirstName) setFirstName.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                    }
                                    map4.put(strRemoteActionCompatParcelizer, arrayList8);
                                }
                                c$b2.IconCompatParcelizer = map4;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                        } else if (b26 == 3) {
                            c$b2.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                        }
                    } else if (b26 == 10) {
                        c$b2.serializer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                    }
                    b = 13;
                }
                break;
            case 22:
                return serializer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 23:
                return read(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 24:
                return IconCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 25:
                NetworkBody networkBody3 = new NetworkBody(22);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b27 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26.RemoteActionCompatParcelizer;
                    if (b27 == 0) {
                        return networkBody3.IconCompatParcelizer();
                    }
                    short s15 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26.serializer;
                    if (s15 != 1) {
                        if (s15 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                        } else if (b27 == 12) {
                            networkBody3.RemoteActionCompatParcelizer = (IBrazeEndpointProvider) IBrazeEndpointProvider.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                        }
                    } else if (b27 == 11) {
                        networkBody3.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                    }
                }
                break;
            case 26:
                return write(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 27:
                return MediaMetadataCompat(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 28:
                return MediaSessionCompatQueueItem(r8lambdat7xjd1d4humw0psb7whucfgonss);
            default:
                addAliaslambda1 addaliaslambda1 = new addAliaslambda1();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem27 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b28 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem27.RemoteActionCompatParcelizer;
                    if (b28 == 0) {
                        return new setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0(addaliaslambda1);
                    }
                    short s16 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem27.serializer;
                    if (s16 != 1) {
                        if (s16 != 2) {
                            if (s16 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            } else if (b28 == 11) {
                                addaliaslambda1.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                            }
                        } else if (b28 == 4) {
                            addaliaslambda1.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                        }
                    } else if (b28 == 4) {
                        addaliaslambda1.serializer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                    }
                }
                break;
        }
        while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
        }
        return new r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4();
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
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
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        byte b15;
        byte b16;
        byte b17;
        int i = this.write;
        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
        switch (i) {
            case 0:
                r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug = (r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug) obj;
                String str = r8lambdafjifijxjxuf3vopuwrut7txivug.IconCompatParcelizer;
                String str2 = r8lambdafjifijxjxuf3vopuwrut7txivug.RemoteActionCompatParcelizer;
                String str3 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                String str4 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                BrazeFlushPushDeliveryReceiver brazeFlushPushDeliveryReceiver = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                Short sh = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                String str5 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                String str6 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                String str7 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                Short sh2 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                String str8 = r8lambdafjifijxjxuf3vopuwrut7txivug.ResultReceiver;
                Short sh3 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                Short sh4 = r8lambdafjifijxjxuf3vopuwrut7txivug.ComponentActivity;
                Boolean bool = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                Boolean bool2 = r8lambdafjifijxjxuf3vopuwrut7txivug.ParcelableVolumeInfo;
                Boolean bool3 = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaSessionCompatToken;
                Boolean bool4 = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaSessionCompatResultReceiverWrapper;
                String str9 = r8lambdafjifijxjxuf3vopuwrut7txivug.PlaybackStateCompat;
                String str10 = r8lambdafjifijxjxuf3vopuwrut7txivug.PlaybackStateCompatCustomAction;
                String str11 = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaBrowserCompatMediaItem;
                String str12 = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaDescriptionCompat;
                Byte b18 = r8lambdafjifijxjxuf3vopuwrut7txivug.RatingCompat;
                String str13 = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaMetadataCompat;
                String str14 = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaSessionCompatQueueItem;
                String str15 = r8lambdafjifijxjxuf3vopuwrut7txivug.read;
                String str16 = r8lambdafjifijxjxuf3vopuwrut7txivug.serializer;
                List list = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                if (str != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdafjifijxjxuf3vopuwrut7txivug.IconCompatParcelizer);
                }
                if (str16 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str16);
                }
                if (str15 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str15);
                }
                if (str14 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str14);
                }
                if (str13 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str13);
                }
                if (b18 != null) {
                    getBitmapFromCache.read((byte) 3, 6, r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                }
                if (str12 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str12);
                }
                if (str11 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str11);
                }
                if (str10 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str10);
                }
                if (str9 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str9);
                }
                if (bool4 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 11, (byte) 2, bool4);
                }
                if (bool3 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 12, (byte) 2, bool3);
                }
                if (bool2 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 13, (byte) 2, bool2);
                }
                if (bool != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 14, (byte) 2, bool);
                }
                if (sh4 != null) {
                    b = 6;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 15, r8lambdat7xjd1d4humw0psb7whucfgonss, sh4);
                } else {
                    b = 6;
                }
                if (sh3 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b, 16, r8lambdat7xjd1d4humw0psb7whucfgonss, sh3);
                }
                if (str8 != null) {
                    b2 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(17, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str8);
                } else {
                    b2 = 11;
                }
                if (sh2 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b, 18, r8lambdat7xjd1d4humw0psb7whucfgonss, sh2);
                }
                if (str7 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(19, b2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str7);
                }
                if (str6 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(20, b2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str6);
                }
                if (str5 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(21, b2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str5);
                }
                if (list != null) {
                    Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 22, (byte) 15, list, (byte) 12);
                    while (itWrite.hasNext()) {
                        r8lambdaR6dAybf4g5pc5sZkFujTnBDSk r8lambdar6daybf4g5pc5szkfujtnbdsk = (r8lambdaR6dAybf4g5pc5sZkFujTnBDSk) itWrite.next();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdar6daybf4g5pc5szkfujtnbdsk.read);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdar6daybf4g5pc5szkfujtnbdsk.serializer);
                        String str17 = r8lambdar6daybf4g5pc5szkfujtnbdsk.IconCompatParcelizer;
                        if (str17 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str17);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                }
                if (sh != null) {
                    b3 = 6;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 23, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
                } else {
                    b3 = 6;
                }
                if (brazeFlushPushDeliveryReceiver != null) {
                    Short sh5 = brazeFlushPushDeliveryReceiver.read;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(24, (byte) 12);
                    Short sh6 = brazeFlushPushDeliveryReceiver.RemoteActionCompatParcelizer;
                    if (sh5 != null) {
                        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b3, 1, r8lambdat7xjd1d4humw0psb7whucfgonss, sh5);
                    }
                    if (sh6 != null) {
                        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh6);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (str4 != null) {
                    b4 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(25, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
                } else {
                    b4 = 11;
                }
                if (str3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(26, b4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
                }
                if (str2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(27, b4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 1:
                r8lambda9XibBb_UAwpsuoULwKlfVxtang r8lambda9xibbb_uawpsuoulwklfvxtang = (r8lambda9XibBb_UAwpsuoULwKlfVxtang) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                String str18 = r8lambda9xibbb_uawpsuoulwklfvxtang.write;
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambda9xibbb_uawpsuoulwklfvxtang.RemoteActionCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str18);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 15);
                List list2 = r8lambda9xibbb_uawpsuoulwklfvxtang.read;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 12, list2.size());
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E) it.next());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 3);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambda9xibbb_uawpsuoulwklfvxtang.serializer.byteValue());
                if (brazeCompanionExternalSyntheticLambda4 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda4);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 2:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 3:
                r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI r8lambdarsln0n_71nx5fiy5yo7knsgyi = (r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambdarsln0n_71nx5fiy5yo7knsgyi.write.shortValue());
                String str19 = r8lambdarsln0n_71nx5fiy5yo7knsgyi.serializer;
                if (str19 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str19);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 4:
                r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs r8lambdavyxnhk9sdraxwugvbef6izzxids = (r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                Integer num = r8lambdavyxnhk9sdraxwugvbef6izzxids.read;
                Byte b19 = r8lambdavyxnhk9sdraxwugvbef6izzxids.serializer;
                Map map = r8lambdavyxnhk9sdraxwugvbef6izzxids.MediaBrowserCompatMediaItem;
                List list3 = r8lambdavyxnhk9sdraxwugvbef6izzxids.RemoteActionCompatParcelizer;
                SweepGradientShader9KIMszodefault.write(num, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 13);
                Iterator itWrite2 = MediaSessionCompatQueueItem.write(r8lambdavyxnhk9sdraxwugvbef6izzxids.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 3);
                while (itWrite2.hasNext()) {
                    Map.Entry entry = (Map.Entry) itWrite2.next();
                    Byte b20 = (Byte) entry.getKey();
                    Byte b21 = (Byte) entry.getValue();
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b20.byteValue());
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b21.byteValue());
                }
                if (b19 != null) {
                    getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                }
                if (list3 != null) {
                    Iterator itWrite3 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 15, list3, (byte) 12);
                    while (itWrite3.hasNext()) {
                        r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4 r8lambdauwxdsmrlntzuda6i1vdnmbtuwe4 = (r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4) itWrite3.next();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                        brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdauwxdsmrlntzuda6i1vdnmbtuwe4.RemoteActionCompatParcelizer);
                        clearInstanceandroid_sdk_base_release clearinstanceandroid_sdk_base_release = r8lambdauwxdsmrlntzuda6i1vdnmbtuwe4.write;
                        if (clearinstanceandroid_sdk_base_release != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(clearinstanceandroid_sdk_base_release.serializer.booleanValue() ? (byte) 1 : (byte) 0);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 2);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(clearinstanceandroid_sdk_base_release.write.booleanValue() ? (byte) 1 : (byte) 0);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 2);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(clearinstanceandroid_sdk_base_release.RemoteActionCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
                            b5 = 0;
                            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                        } else {
                            b5 = 0;
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b5);
                    }
                }
                if (map != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 13);
                    Iterator itWrite4 = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 4);
                    while (itWrite4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) itWrite4.next();
                        Byte b22 = (Byte) entry2.getKey();
                        Double d = (Double) entry2.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b22.byteValue());
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(d.doubleValue());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 5:
                r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE r8lambdaycpcax7c0cs_kam0o8re2fzmjhe = (r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                Long l = r8lambdaycpcax7c0cs_kam0o8re2fzmjhe.write;
                Byte b23 = r8lambdaycpcax7c0cs_kam0o8re2fzmjhe.MediaSessionCompatQueueItem;
                Integer num2 = r8lambdaycpcax7c0cs_kam0o8re2fzmjhe.RatingCompat;
                Integer num3 = r8lambdaycpcax7c0cs_kam0o8re2fzmjhe.MediaMetadataCompat;
                List list4 = r8lambdaycpcax7c0cs_kam0o8re2fzmjhe.MediaBrowserCompatMediaItem;
                IconCompatParcelizer.serializer(l, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 10);
                IconCompatParcelizer.serializer(r8lambdaycpcax7c0cs_kam0o8re2fzmjhe.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 3);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambdaycpcax7c0cs_kam0o8re2fzmjhe.IconCompatParcelizer.byteValue());
                Integer num4 = r8lambdaycpcax7c0cs_kam0o8re2fzmjhe.read;
                byte b24 = 8;
                if (num4 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 8, num4);
                }
                if (num3 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 8, num3);
                }
                if (num2 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 8, num2);
                }
                if (b23 != null) {
                    getBitmapFromCache.read((byte) 3, 7, r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                }
                if (list4 != null) {
                    Iterator itWrite5 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 8, (byte) 15, list4, (byte) 12);
                    while (itWrite5.hasNext()) {
                        getDelayedInitializationProviderandroid_sdk_base_release getdelayedinitializationproviderandroid_sdk_base_release = (getDelayedInitializationProviderandroid_sdk_base_release) itWrite5.next();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                        IconCompatParcelizer.serializer(getdelayedinitializationproviderandroid_sdk_base_release.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, b24);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.read(getdelayedinitializationproviderandroid_sdk_base_release.IconCompatParcelizer.intValue());
                        String str20 = getdelayedinitializationproviderandroid_sdk_base_release.write;
                        if (str20 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str20);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                        b24 = 8;
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 6:
                r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU r8lambda_fm5wworzosaheqcw4itnpw4teu = (r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                IconCompatParcelizer.serializer(r8lambda_fm5wworzosaheqcw4itnpw4teu.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 15);
                List list5 = r8lambda_fm5wworzosaheqcw4itnpw4teu.RemoteActionCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 12, list5.size());
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    r8lambdacHkwrG2CFDKAOsabUOrbFFKX88.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (r8lambdacHkwrG2CFDKAOsabUOrbFFKX88) it2.next());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 7:
                r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ r8lambdauawnoq1fyynohte6w4x6glr3nlq = (r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ) obj;
                String str21 = r8lambdauawnoq1fyynohte6w4x6glr3nlq.write;
                Integer num5 = r8lambdauawnoq1fyynohte6w4x6glr3nlq.MediaDescriptionCompat;
                Boolean bool5 = r8lambdauawnoq1fyynohte6w4x6glr3nlq.RatingCompat;
                Integer num6 = r8lambdauawnoq1fyynohte6w4x6glr3nlq.MediaSessionCompatQueueItem;
                Integer num7 = r8lambdauawnoq1fyynohte6w4x6glr3nlq.IconCompatParcelizer;
                Boolean bool6 = r8lambdauawnoq1fyynohte6w4x6glr3nlq.serializer;
                Integer num8 = r8lambdauawnoq1fyynohte6w4x6glr3nlq.read;
                if (str21 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdauawnoq1fyynohte6w4x6glr3nlq.write);
                }
                if (num8 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8, num8);
                }
                if (bool6 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 2, bool6);
                }
                if (num7 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 8, num7);
                }
                if (num6 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 8, num6);
                }
                if (bool5 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 2, bool5);
                }
                if (num5 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 8, num5);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 8:
                _set_userId_lambda0 _set_userid_lambda0 = (_set_userId_lambda0) obj;
                String str22 = _set_userid_lambda0.read;
                String str23 = _set_userid_lambda0.MediaSessionCompatQueueItem;
                String str24 = _set_userid_lambda0.MediaDescriptionCompat;
                setFirstNamelambda0 setfirstnamelambda0 = _set_userid_lambda0.IconCompatParcelizer;
                String str25 = _set_userid_lambda0.serializer;
                Double d2 = _set_userid_lambda0.RemoteActionCompatParcelizer;
                List list6 = _set_userid_lambda0.RatingCompat;
                if (str22 != null) {
                    b6 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(_set_userid_lambda0.read);
                } else {
                    b6 = 11;
                }
                if (d2 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d2);
                }
                if (str25 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b6);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str25);
                }
                if (setfirstnamelambda0 != null) {
                    Double d3 = setfirstnamelambda0.RemoteActionCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
                    if (d3 != null) {
                        af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 1, (byte) 4, d3);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (list6 != null) {
                    Iterator itWrite6 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 15, list6, (byte) 12);
                    while (itWrite6.hasNext()) {
                        isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release) itWrite6.next());
                    }
                }
                if (str24 != null) {
                    b7 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str24);
                } else {
                    b7 = 11;
                }
                if (str23 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, b7);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str23);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 9:
                addToSubscriptionGrouplambda2 addtosubscriptiongrouplambda2 = (addToSubscriptionGrouplambda2) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                incrementCustomUserAttribute incrementcustomuserattribute = addtosubscriptiongrouplambda2.write;
                if (incrementcustomuserattribute.read != null) {
                    b8 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(incrementcustomuserattribute.read);
                } else {
                    b8 = 11;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                setLocationCustomAttributelambda1 setlocationcustomattributelambda1 = addtosubscriptiongrouplambda2.serializer;
                if (setlocationcustomattributelambda1.IconCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlocationcustomattributelambda1.IconCompatParcelizer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 10:
                removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda0 = (removeFromSubscriptionGrouplambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                setHomeCitylambda1 sethomecitylambda1 = removefromsubscriptiongrouplambda0.write;
                removeFromCustomAttributeArraylambda1 removefromcustomattributearraylambda1 = removefromsubscriptiongrouplambda0.MediaSessionCompatQueueItem;
                Short sh7 = removefromsubscriptiongrouplambda0.MediaMetadataCompat;
                Short sh8 = removefromsubscriptiongrouplambda0.IconCompatParcelizer;
                setHomeCitylambda1.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, sethomecitylambda1);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 10);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(removefromsubscriptiongrouplambda0.serializer.longValue());
                Long l2 = removefromsubscriptiongrouplambda0.RemoteActionCompatParcelizer;
                if (l2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l2.longValue());
                }
                if (sh8 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, sh8);
                }
                if (sh7 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, sh7);
                }
                if (removefromcustomattributearraylambda1 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(removefromcustomattributearraylambda1.write);
                    b9 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b9 = 0;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b9);
                break;
            case 11:
                setCustomAttributedefault setcustomattributedefault = (setCustomAttributedefault) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                setCustomEndpoint setcustomendpoint = setcustomattributedefault.RemoteActionCompatParcelizer;
                if (setcustomendpoint.RemoteActionCompatParcelizer != null) {
                    b10 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint.RemoteActionCompatParcelizer);
                } else {
                    b10 = 11;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                unsetLocationCustomAttributelambda2 unsetlocationcustomattributelambda2 = setcustomattributedefault.IconCompatParcelizer;
                if (unsetlocationcustomattributelambda2.write != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(unsetlocationcustomattributelambda2.write);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 12:
                setCustomUserAttributelambda4 setcustomuserattributelambda4 = (setCustomUserAttributelambda4) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                af$$ExternalSyntheticOutline1.m((byte) 10, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomuserattributelambda4.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setcustomuserattributelambda4.serializer.longValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 13:
                setCustomUserAttributeToSecondsFromEpochlambda0 setcustomuserattributetosecondsfromepochlambda0 = (setCustomUserAttributeToSecondsFromEpochlambda0) obj;
                Map map2 = setcustomuserattributetosecondsfromepochlambda0.RemoteActionCompatParcelizer;
                Short sh9 = setcustomuserattributetosecondsfromepochlambda0.write;
                Short sh10 = setcustomuserattributetosecondsfromepochlambda0.serializer;
                if (map2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                    Iterator itWrite7 = MediaSessionCompatQueueItem.write(map2, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 12);
                    while (itWrite7.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) itWrite7.next();
                        Byte b25 = (Byte) entry3.getKey();
                        getBrazeSdkMetadataandroid_sdk_base_release getbrazesdkmetadataandroid_sdk_base_release = (getBrazeSdkMetadataandroid_sdk_base_release) entry3.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b25.byteValue());
                        Double d4 = getbrazesdkmetadataandroid_sdk_base_release.IconCompatParcelizer;
                        Double d5 = getbrazesdkmetadataandroid_sdk_base_release.RemoteActionCompatParcelizer;
                        Double d6 = getbrazesdkmetadataandroid_sdk_base_release.read;
                        Double d7 = getbrazesdkmetadataandroid_sdk_base_release.write;
                        if (d4 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getbrazesdkmetadataandroid_sdk_base_release.IconCompatParcelizer.doubleValue());
                        }
                        if (d7 != null) {
                            af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d7);
                        }
                        if (d6 != null) {
                            af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 4, d6);
                        }
                        if (d5 != null) {
                            af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 4, d5);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                }
                if (sh10 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh10);
                }
                if (sh9 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, sh9);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 14:
                setLastKnownLocationdefault setlastknownlocationdefault = (setLastKnownLocationdefault) obj;
                Double d8 = setlastknownlocationdefault.write;
                String str26 = setlastknownlocationdefault.RemoteActionCompatParcelizer;
                if (d8 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setlastknownlocationdefault.write.doubleValue());
                }
                if (str26 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str26);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 15:
                setLastKnownLocationlambda0 setlastknownlocationlambda0 = (setLastKnownLocationlambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                IconCompatParcelizer.serializer(setlastknownlocationlambda0.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(setlastknownlocationlambda0.read.intValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 16:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((setLocationCustomAttributelambda3) obj).RemoteActionCompatParcelizer.shortValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 17:
                setPushNotificationSubscriptionTypelambda0 setpushnotificationsubscriptiontypelambda0 = (setPushNotificationSubscriptionTypelambda0) obj;
                String str27 = setpushnotificationsubscriptiontypelambda0.write;
                String str28 = setpushnotificationsubscriptiontypelambda0.RemoteActionCompatParcelizer;
                String str29 = setpushnotificationsubscriptiontypelambda0.serializer;
                String str30 = setpushnotificationsubscriptiontypelambda0.read;
                if (str27 != null) {
                    b11 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setpushnotificationsubscriptiontypelambda0.write);
                } else {
                    b11 = 11;
                }
                if (str30 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str30);
                }
                if (str29 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str29);
                }
                if (str28 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str28);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 18:
                unsetLocationCustomAttributelambda2 unsetlocationcustomattributelambda3 = (unsetLocationCustomAttributelambda2) obj;
                if (unsetlocationcustomattributelambda3.write != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(unsetlocationcustomattributelambda3.write);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 19:
                addToCustomAttributeArray addtocustomattributearray = (addToCustomAttributeArray) obj;
                String str31 = addtocustomattributearray.write;
                Double d9 = addtocustomattributearray.MediaDescriptionCompat;
                String str32 = addtocustomattributearray.RatingCompat;
                Double d10 = addtocustomattributearray.MediaSessionCompatQueueItem;
                Double d11 = addtocustomattributearray.IconCompatParcelizer;
                String str33 = addtocustomattributearray.serializer;
                Double d12 = addtocustomattributearray.RemoteActionCompatParcelizer;
                List list7 = addtocustomattributearray.MediaBrowserCompatMediaItem;
                if (str31 != null) {
                    b12 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(addtocustomattributearray.write);
                } else {
                    b12 = 11;
                }
                if (d12 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d12);
                }
                if (str33 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str33);
                }
                if (d11 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 4, d11);
                }
                if (d10 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 4, d10);
                }
                if (str32 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str32);
                }
                if (d9 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 4, d9);
                }
                if (list7 != null) {
                    Iterator itWrite8 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 8, (byte) 15, list7, (byte) 4);
                    while (itWrite8.hasNext()) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Double) itWrite8.next()).doubleValue());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 20:
                setAttributionData setattributiondata = (setAttributionData) obj;
                Short sh11 = setattributiondata.read;
                Short sh12 = setattributiondata.RemoteActionCompatParcelizer;
                if (sh11 != null) {
                    b13 = 6;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setattributiondata.read.shortValue());
                } else {
                    b13 = 6;
                }
                if (sh12 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b13, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh12);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 21:
                setCustomUserAttributeToSecondsFromEpoch setcustomuserattributetosecondsfromepoch = (setCustomUserAttributeToSecondsFromEpoch) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                Long l3 = setcustomuserattributetosecondsfromepoch.write;
                Map map3 = setcustomuserattributetosecondsfromepoch.RemoteActionCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l3.longValue());
                Byte b26 = setcustomuserattributetosecondsfromepoch.read;
                if (b26 != null) {
                    getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                }
                if (map3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 13);
                    Iterator itWrite9 = MediaSessionCompatQueueItem.write(map3, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 15);
                    while (itWrite9.hasNext()) {
                        Map.Entry entry4 = (Map.Entry) itWrite9.next();
                        String str34 = (String) entry4.getKey();
                        List list8 = (List) entry4.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str34);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 12, list8.size());
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            setFirstName.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (setFirstName) it3.next());
                        }
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 22:
                setLanguage setlanguage = (setLanguage) obj;
                setLineId setlineid = setlanguage.serializer;
                setCustomUserAttributelambda5 setcustomuserattributelambda5 = setlanguage.IconCompatParcelizer;
                removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda1 = setlanguage.write;
                setCustomUserAttributeToSecondsFromEpoch setcustomuserattributetosecondsfromepoch2 = setlanguage.read;
                if (setlineid != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    setLineId setlineid2 = setlanguage.serializer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setlineid2.serializer.longValue());
                    removeFromCustomAttributeArraylambda1 removefromcustomattributearraylambda2 = setlineid2.RemoteActionCompatParcelizer;
                    if (removefromcustomattributearraylambda2 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(removefromcustomattributearraylambda2.write);
                        b15 = 0;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    } else {
                        b15 = 0;
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b15);
                }
                if (setcustomuserattributetosecondsfromepoch2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    setCustomUserAttributeToSecondsFromEpoch.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomuserattributetosecondsfromepoch2);
                }
                if (removefromsubscriptiongrouplambda1 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
                    removeFromSubscriptionGrouplambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, removefromsubscriptiongrouplambda1);
                }
                if (setcustomuserattributelambda5 != null) {
                    Byte b27 = setcustomuserattributelambda5.RemoteActionCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
                    if (b27 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b27.byteValue());
                    }
                    b14 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b14 = 0;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b14);
                break;
            case 23:
                unsetCustomUserAttribute unsetcustomuserattribute = (unsetCustomUserAttribute) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                af$$ExternalSyntheticOutline1.m((byte) 12, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, unsetcustomuserattribute.IconCompatParcelizer);
                setEmailNotificationSubscriptionTypelambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, unsetcustomuserattribute.serializer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
                setPhoneNumber.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, unsetcustomuserattribute.RemoteActionCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
                setCustomUserAttributelambda2.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, unsetcustomuserattribute.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 24:
                isAmazonDevice isamazondevice = (isAmazonDevice) obj;
                Double d13 = isamazondevice.write;
                String str35 = isamazondevice.MediaSessionCompatQueueItem;
                Double d14 = isamazondevice.MediaBrowserCompatMediaItem;
                String str36 = isamazondevice.RatingCompat;
                Double d15 = isamazondevice.MediaDescriptionCompat;
                Double d16 = isamazondevice.read;
                Double d17 = isamazondevice.IconCompatParcelizer;
                Double d18 = isamazondevice.serializer;
                if (d13 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(isamazondevice.write.doubleValue());
                }
                if (d18 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d18);
                }
                if (d17 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 4, d17);
                }
                if (d16 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 4, d16);
                }
                if (d15 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 4, d15);
                }
                if (str36 != null) {
                    b16 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str36);
                } else {
                    b16 = 11;
                }
                if (d14 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 4, d14);
                }
                if (str35 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, b16);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str35);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 25:
                IBrazeExternalSyntheticBUOutline0 iBrazeExternalSyntheticBUOutline0 = (IBrazeExternalSyntheticBUOutline0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(iBrazeExternalSyntheticBUOutline0.serializer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                IBrazeEndpointProvider.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, iBrazeExternalSyntheticBUOutline0.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 26:
                getIntentFlags getintentflags = (getIntentFlags) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getintentflags.IconCompatParcelizer.byteValue());
                unsetLocationCustomAttributelambda0 unsetlocationcustomattributelambda0 = getintentflags.serializer;
                if (unsetlocationcustomattributelambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    unsetLocationCustomAttributelambda0.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, unsetlocationcustomattributelambda0);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 27:
                r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg = (r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 15);
                List list9 = r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg.write;
                setDefaultNotificationChannelNamelambda0 setdefaultnotificationchannelnamelambda0 = r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg.read;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 8, list9.size());
                Iterator it4 = r8lambdaglz3ec9gpc1dqyzqccn1g4v9mg.write.iterator();
                while (it4.hasNext()) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(((Integer) it4.next()).intValue());
                }
                if (setdefaultnotificationchannelnamelambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    setDefaultNotificationChannelNamelambda0.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setdefaultnotificationchannelnamelambda0);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 28:
                setApiKeylambda0 setapikeylambda0 = (setApiKeylambda0) obj;
                String str37 = setapikeylambda0.serializer;
                String str38 = setapikeylambda0.write;
                String str39 = setapikeylambda0.RemoteActionCompatParcelizer;
                String str40 = setapikeylambda0.read;
                if (str37 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setapikeylambda0.serializer);
                }
                if (str40 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str40);
                }
                if (str39 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str39);
                }
                if (str38 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str38);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            default:
                setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0 setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0 = (setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0) obj;
                Double d19 = setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0.serializer;
                String str41 = setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0.write;
                Double d20 = setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0.read;
                if (d19 != null) {
                    b17 = 4;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0.serializer.doubleValue());
                } else {
                    b17 = 4;
                }
                if (d20 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, b17, d20);
                }
                if (str41 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str41);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
        }
    }
}
