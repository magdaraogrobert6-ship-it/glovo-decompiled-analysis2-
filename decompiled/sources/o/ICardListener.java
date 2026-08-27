package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.WrongWayDrivingDetectionState;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SafetyScoresCalculator")
public class ICardListener {
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final logImpression read;
    private final getExpirationTimestamp write;

    public static /* synthetic */ void IconCompatParcelizer(ICardListener iCardListener, String str, long j, long j2, ArrayList arrayList) {
        r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k r8lambdaljnxqufanckwlgxbv6bnxcttl0kWrite = iCardListener.read.IconCompatParcelizer().write(j, str, j2);
        if (r8lambdaljnxqufanckwlgxbv6bnxcttl0kWrite != null) {
            arrayList.add(r8lambdaljnxqufanckwlgxbv6bnxcttl0kWrite);
        }
    }

    public static void IconCompatParcelizer(ICardListener iCardListener, ArrayList arrayList, String str, long j, long j2, ArrayList arrayList2) {
        CardExternalSyntheticLambda1 cardExternalSyntheticLambda1;
        setViewed setviewedRemoteActionCompatParcelizer = iCardListener.read.RemoteActionCompatParcelizer();
        str.getClass();
        ArrayList arrayListRemoteActionCompatParcelizer = setviewedRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(j, j2, arrayList);
        ArrayList<r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps> arrayList3 = new ArrayList();
        for (Object obj : arrayListRemoteActionCompatParcelizer) {
            r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps r8lambdaf43wjdaanol1ga_eezyhy_7dops = (r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps) obj;
            if (r8lambdaf43wjdaanol1ga_eezyhy_7dops.IconCompatParcelizer() != null && r8lambdaf43wjdaanol1ga_eezyhy_7dops.IconCompatParcelizer().floatValue() >= 4.166667f) {
                arrayList3.add(obj);
            }
        }
        if (arrayList3.isEmpty()) {
            cardExternalSyntheticLambda1 = null;
        } else {
            long jWrite = 0;
            for (r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps r8lambdaf43wjdaanol1ga_eezyhy_7dops2 : arrayList3) {
                jWrite += r8lambdaf43wjdaanol1ga_eezyhy_7dops2.write() - r8lambdaf43wjdaanol1ga_eezyhy_7dops2.serializer();
            }
            cardExternalSyntheticLambda1 = new CardExternalSyntheticLambda1(jWrite, j2 - j);
        }
        arrayList2.add(cardExternalSyntheticLambda1 == null ? new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.CALL_WHILE_MOVING, 1.0d) : new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.CALL_WHILE_MOVING, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(1.0d - (cardExternalSyntheticLambda1.read() / cardExternalSyntheticLambda1.IconCompatParcelizer()))));
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(ICardListener iCardListener, String str, ArrayList arrayList, ArrayList arrayList2) {
        r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k r8lambdaljnxqufanckwlgxbv6bnxcttl0kSerializer = iCardListener.read.serializer().serializer(str, arrayList);
        if (r8lambdaljnxqufanckwlgxbv6bnxcttl0kSerializer != null) {
            arrayList2.add(r8lambdaljnxqufanckwlgxbv6bnxcttl0kSerializer);
        }
    }

    public static /* synthetic */ void read(ICardListener iCardListener, String str, long j, long j2, Boolean bool, ArrayList arrayList) {
        r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k r8lambdaljnxqufanckwlgxbv6bnxcttl0kWrite = iCardListener.read.read().write(str, j, j2, bool);
        if (r8lambdaljnxqufanckwlgxbv6bnxcttl0kWrite != null) {
            arrayList.add(r8lambdaljnxqufanckwlgxbv6bnxcttl0kWrite);
        }
    }

    public static void read(ICardListener iCardListener, String str, r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iq, ArrayList arrayList) {
        Double dValueOf;
        iCardListener.read.getClass();
        str.getClass();
        r8lambdavofb8wwxngiixelwle1ybluc3iq.getClass();
        r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k r8lambdaljnxqufanckwlgxbv6bnxcttl0k = null;
        if (r8lambdavofb8wwxngiixelwle1ybluc3iq.serializer() == WrongWayDrivingDetectionState.NOT_ATTEMPTED) {
            dValueOf = null;
        } else {
            dValueOf = !r8lambdavofb8wwxngiixelwle1ybluc3iq.RemoteActionCompatParcelizer().isEmpty() ? Double.valueOf(0.0d) : Double.valueOf(1.0d);
        }
        if (dValueOf != null) {
            r8lambdaljnxqufanckwlgxbv6bnxcttl0k = new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.WRONG_WAY_DRIVING, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(dValueOf.doubleValue()));
        }
        if (r8lambdaljnxqufanckwlgxbv6bnxcttl0k != null) {
            arrayList.add(r8lambdaljnxqufanckwlgxbv6bnxcttl0k);
        }
    }

    public static /* synthetic */ void write(ICardListener iCardListener, String str, long j, long j2, TransportChangeType transportChangeType, ArrayList arrayList) {
        r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k r8lambdaljnxqufanckwlgxbv6bnxcttl0k = iCardListener.read.MediaBrowserCompatMediaItem().read(str, j, j2, transportChangeType);
        if (r8lambdaljnxqufanckwlgxbv6bnxcttl0k != null) {
            arrayList.add(r8lambdaljnxqufanckwlgxbv6bnxcttl0k);
        }
    }

    public ICardListener(logImpression logimpression, getExpirationTimestamp getexpirationtimestamp, ConfigurationManager configurationManager) {
        this.read = logimpression;
        this.write = getexpirationtimestamp;
        this.RemoteActionCompatParcelizer = configurationManager;
    }

    public final ArrayList read(String str, int i, long j, long j2, ArrayList arrayList, TransportChangeType transportChangeType, r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iq, Boolean bool) {
        getExpirationTimestamp.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList();
        ConfigurationManager configurationManager = this.RemoteActionCompatParcelizer;
        setTest settest = setTest.read(configurationManager, i, j2 - j);
        settest.IconCompatParcelizer(new ControlCard(this, str, j, j2, transportChangeType, arrayList2, 0));
        settest.read(new ControlCard(this, str, j, j2, transportChangeType, arrayList2, 1));
        settest.RemoteActionCompatParcelizer(new onCardUpdate(this, str, j, j2, arrayList2));
        settest.IconCompatParcelizer(new TextAnnouncementCard(this, arrayList, str, j, j2, arrayList2));
        settest.read(new r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I(this, str, arrayList, arrayList2, 4));
        settest.write(new r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I(this, str, r8lambdavofb8wwxngiixelwle1ybluc3iq, arrayList2, 5));
        settest.read(new TextAnnouncementCard(this, str, j, j2, bool, arrayList2));
        Double dValueOf = Double.valueOf(0.0d);
        getBrazeSdkMetadataandroid_sdk_base_release getbrazesdkmetadataandroid_sdk_base_releaseRemoteActionCompatParcelizer = configurationManager.RemoteActionCompatParcelizer(transportChangeType == TransportChangeType.TRANSPORT_MOTORCYCLE ? (byte) 1 : (byte) 0);
        if (getbrazesdkmetadataandroid_sdk_base_releaseRemoteActionCompatParcelizer != null) {
            Double d = getbrazesdkmetadataandroid_sdk_base_releaseRemoteActionCompatParcelizer.read;
            if (d == null) {
                d = dValueOf;
            }
            double dDoubleValue = d.doubleValue();
            Double d2 = getbrazesdkmetadataandroid_sdk_base_releaseRemoteActionCompatParcelizer.IconCompatParcelizer;
            if (d2 == null) {
                d2 = dValueOf;
            }
            double dDoubleValue2 = d2.doubleValue();
            Double d3 = getbrazesdkmetadataandroid_sdk_base_releaseRemoteActionCompatParcelizer.write;
            if (d3 == null) {
                d3 = dValueOf;
            }
            double dDoubleValue3 = d3.doubleValue();
            Double d4 = getbrazesdkmetadataandroid_sdk_base_releaseRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            if (d4 != null) {
                dValueOf = d4;
            }
            remoteActionCompatParcelizer = new getExpirationTimestamp.RemoteActionCompatParcelizer(dDoubleValue, dDoubleValue2, dDoubleValue3, dValueOf.doubleValue());
        } else {
            remoteActionCompatParcelizer = getIconBackgroundColor.IconCompatParcelizer;
        }
        this.write.getClass();
        r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k r8lambdaljnxqufanckwlgxbv6bnxcttl0k = getExpirationTimestamp.read(str, remoteActionCompatParcelizer, arrayList2);
        if (r8lambdaljnxqufanckwlgxbv6bnxcttl0k != null) {
            arrayList2.add(r8lambdaljnxqufanckwlgxbv6bnxcttl0k);
        }
        return arrayList2;
    }
}
