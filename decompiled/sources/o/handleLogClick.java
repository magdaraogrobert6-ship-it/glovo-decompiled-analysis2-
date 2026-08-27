package o;

import android.content.ContentValues;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleFeedbackInternal;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import com.sentiance.sdk.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class handleLogClick extends r8lambdaSl6HfpkWhWo6LDjCw2JoZqjyIyY {
    private final List<handleLogClickdefault> IconCompatParcelizer;
    private final OccupantRoleFeedbackInternal MediaBrowserCompatMediaItem;
    private final OccupantRoleInternal MediaDescriptionCompat;
    private final r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ MediaMetadataCompat;
    private final Boolean MediaSessionCompatQueueItem;
    private final Double RatingCompat;
    private final int read;
    private final parseString serializer;
    private final Double write;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        throw null;
    }

    public final Double MediaBrowserCompatMediaItem() {
        return this.write;
    }

    public final int MediaDescriptionCompat() {
        return this.read;
    }

    public final OccupantRoleInternal MediaMetadataCompat() {
        return this.MediaDescriptionCompat;
    }

    public final OccupantRoleFeedbackInternal MediaSessionCompatQueueItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final List<handleLogClickdefault> MediaSessionCompatResultReceiverWrapper() {
        return this.IconCompatParcelizer;
    }

    public final r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ ParcelableVolumeInfo() {
        return this.MediaMetadataCompat;
    }

    public final parseString PlaybackStateCompat() {
        return this.serializer;
    }

    public final Double RatingCompat() {
        return this.RatingCompat;
    }

    public final Boolean read() {
        return this.MediaSessionCompatQueueItem;
    }

    public final String serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<handleLogClick> write() {
        return InAppMessageHtml.MediaBrowserCompatMediaItem();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        byte[] byteArray;
        byte[] bArrSerializer;
        ContentValues contentValues = new ContentValues();
        contentValues.put("unique_id", this.RemoteActionCompatParcelizer);
        contentValues.put("distance", Integer.valueOf(this.read));
        try {
            r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU r8lambda_fm5wworzosaheqcw4itnpw4teuRemoteActionCompatParcelizer = handleLogClickdefault.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (r8lambda_fm5wworzosaheqcw4itnpw4teuRemoteActionCompatParcelizer != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new migratePushDeliveryEventsToJson(byteArrayOutputStream));
                r8lambdaajvt3gxgjaliojuptnhztnfupq.serializer(1, (byte) 10);
                r8lambdaajvt3gxgjaliojuptnhztnfupq.serializer(r8lambda_fm5wworzosaheqcw4itnpw4teuRemoteActionCompatParcelizer.serializer.longValue());
                r8lambdaajvt3gxgjaliojuptnhztnfupq.serializer(2, (byte) 15);
                List list = r8lambda_fm5wworzosaheqcw4itnpw4teuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                r8lambdaajvt3gxgjaliojuptnhztnfupq.write((byte) 12, list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r8lambdacHkwrG2CFDKAOsabUOrbFFKX88.IconCompatParcelizer.read(r8lambdaajvt3gxgjaliojuptnhztnfupq, (r8lambdacHkwrG2CFDKAOsabUOrbFFKX88) it.next());
                }
                r8lambdaajvt3gxgjaliojuptnhztnfupq.RemoteActionCompatParcelizer((byte) 0);
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                byteArray = null;
            }
        } catch (IOException unused) {
        }
        contentValues.put("transport_waypoints", byteArray);
        parseString parsestring = this.serializer;
        if (parsestring != null) {
            contentValues.put("transport_tags", parsestring.write());
        }
        contentValues.put("occupant_role", this.MediaDescriptionCompat.getValue());
        contentValues.put("occupant_role_feedback", this.MediaBrowserCompatMediaItem.getValue());
        Double d = this.write;
        if (d != null) {
            contentValues.put("occupant_role_probability", d);
        }
        Double d2 = this.RatingCompat;
        if (d2 != null) {
            contentValues.put("occupant_role_threshold", d2);
        }
        String strWrite = this.MediaMetadataCompat.write();
        if (strWrite == null) {
            bArrSerializer = new byte[0];
        } else {
            byte[] bytes = strWrite.getBytes(ensureSubscribedToInAppMessageEvents.write);
            bytes.getClass();
            try {
                r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                getResourceConfigurationValuelambda0 getresourceconfigurationvaluelambda0 = new getResourceConfigurationValuelambda0(r8lambdabeyrnr8p6809bwlboro_stans);
                java.util.logging.Logger logger = getResourceIdentifier.read;
                readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getresourceconfigurationvaluelambda0);
                try {
                    readresourcevaluelambda2.write(bytes);
                    readresourcevaluelambda2.close();
                    byte[] bArrRatingCompat = r8lambdabeyrnr8p6809bwlboro_stans.RatingCompat();
                    bArrSerializer = bArrRatingCompat.length < bytes.length ? onContentCardClicked.serializer(new byte[]{1}, bArrRatingCompat) : onContentCardClicked.serializer(new byte[]{0}, bytes);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{readresourcevaluelambda2, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            } catch (IOException unused2) {
            }
        }
        contentValues.put("wrong_way_driving_details", bArrSerializer);
        contentValues.put("did_evaluate_phone_usage", this.MediaSessionCompatQueueItem);
        return contentValues;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportMetadataEntry{mDistanceMeters=");
        sb.append(this.read);
        sb.append(", mWaypoints=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mTransportTags=");
        sb.append(this.serializer);
        sb.append(", mOccupantRoleProbability=");
        sb.append(this.write);
        sb.append(", mOccupantRoleThreshold=");
        sb.append(this.RatingCompat);
        sb.append(", mOccupantRole=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", mOccupantRoleFeedback=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", uniqueId='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', mWrongWayDrivingDetails='");
        sb.append(this.MediaMetadataCompat);
        sb.append("', mDidEvaluatePhoneUsage='");
        return c8$$ExternalSyntheticOutline0.m(sb, "'}", this.MediaSessionCompatQueueItem);
    }

    public handleLogClick(String str, int i, byte[] bArr, String str2, Double d, OccupantRoleInternal occupantRoleInternal, OccupantRoleFeedbackInternal occupantRoleFeedbackInternal, Double d2, byte[] bArr2, Boolean bool) {
        List<handleLogClickdefault> list;
        Float fValueOf;
        parseString parsestring;
        super(str);
        this.read = i;
        r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw r8lambdaioedr8z56pu9mv1sxvtoeet1ziw = r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU.IconCompatParcelizer;
        Optional optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
        try {
            r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new r8lambdactPImk7nPmPQDeegHjgpfDqwpkI(new ByteArrayInputStream(bArr)));
            try {
                optionalMediaSessionCompatQueueItem = Optional.RemoteActionCompatParcelizer(r8lambdaioedr8z56pu9mv1sxvtoeet1ziw.RemoteActionCompatParcelizer(r8lambdaajvt3gxgjaliojuptnhztnfupq));
                r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
            } catch (Throwable th) {
                try {
                    r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
        r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iqRemoteActionCompatParcelizer = null;
        if (optionalMediaSessionCompatQueueItem.read()) {
            list = Collections.EMPTY_LIST;
        } else {
            r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU r8lambda_fm5wworzosaheqcw4itnpw4teu = (r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU) optionalMediaSessionCompatQueueItem.write();
            ArrayList arrayList = new ArrayList();
            long jLongValue = r8lambda_fm5wworzosaheqcw4itnpw4teu.serializer.longValue();
            for (r8lambdacHkwrG2CFDKAOsabUOrbFFKX88 r8lambdachkwrg2cfdkaosabuorbffkx88 : r8lambda_fm5wworzosaheqcw4itnpw4teu.RemoteActionCompatParcelizer) {
                Integer num = r8lambdachkwrg2cfdkaosabuorbffkx88.RemoteActionCompatParcelizer;
                Short sh = r8lambdachkwrg2cfdkaosabuorbffkx88.RatingCompat;
                long jIntValue = num.intValue();
                double dIntValue = ((double) r8lambdachkwrg2cfdkaosabuorbffkx88.read.intValue()) / 1000000.0d;
                double dIntValue2 = ((double) r8lambdachkwrg2cfdkaosabuorbffkx88.serializer.intValue()) / 1000000.0d;
                Short sh2 = r8lambdachkwrg2cfdkaosabuorbffkx88.write;
                Float fValueOf2 = sh2 != null ? Float.valueOf(sh2.floatValue()) : null;
                Short sh3 = r8lambdachkwrg2cfdkaosabuorbffkx88.MediaBrowserCompatMediaItem;
                Float fValueOf3 = sh3 != null ? Float.valueOf(sh3.floatValue() / 100.0f) : null;
                if (sh != null) {
                    fValueOf = Float.valueOf(sh.shortValue() == Short.MAX_VALUE ? Float.MAX_VALUE : sh.floatValue() / 100.0f);
                } else {
                    fValueOf = null;
                }
                arrayList.add(new handleLogClickdefault(jLongValue + jIntValue, dIntValue, dIntValue2, fValueOf2, fValueOf3, fValueOf));
            }
            list = arrayList;
        }
        this.IconCompatParcelizer = list;
        if (str2 == null) {
            parsestring = null;
        } else {
            try {
                parsestring = (parseString) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(parseString.class, str2);
            } catch (JSONException unused2) {
                parsestring = null;
            }
        }
        this.serializer = parsestring;
        this.MediaDescriptionCompat = occupantRoleInternal;
        this.write = d;
        this.MediaBrowserCompatMediaItem = occupantRoleFeedbackInternal;
        this.RatingCompat = d2;
        if (bArr2 == null) {
            r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.RemoteActionCompatParcelizer.getClass();
            r8lambdavofb8wwxngiixelwle1ybluc3iqRemoteActionCompatParcelizer = r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.read.RemoteActionCompatParcelizer();
        } else {
            r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.RemoteActionCompatParcelizer.getClass();
            if (bArr2.length != 0) {
                boolean z = bArr2[0] == 1;
                byte[] bArrIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(bArr2, 1, bArr2.length);
                if (z) {
                    try {
                        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                        r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(bArrIconCompatParcelizer);
                        getFallbackConfigKey getfallbackconfigkey = new getFallbackConfigKey(r8lambdabeyrnr8p6809bwlboro_stans);
                        java.util.logging.Logger logger = getResourceIdentifier.read;
                        readResourceValuelambda1 readresourcevaluelambda1 = new readResourceValuelambda1(getfallbackconfigkey);
                        try {
                            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = readresourcevaluelambda1.IconCompatParcelizer;
                            r8lambdabeyrnr8p6809bwlboro_stans2.IconCompatParcelizer(getfallbackconfigkey);
                            byte[] bArrRatingCompat = r8lambdabeyrnr8p6809bwlboro_stans2.RatingCompat();
                            readresourcevaluelambda1.close();
                            bArrIconCompatParcelizer = bArrRatingCompat;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{readresourcevaluelambda1, th3}, sourceInformationContextOfdefault.read());
                                throw th4;
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
                r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iq = new r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ(null);
                r8lambdavofb8wwxngiixelwle1ybluc3iq.RemoteActionCompatParcelizer(new String(bArrIconCompatParcelizer, ensureSubscribedToInAppMessageEvents.write));
                r8lambdavofb8wwxngiixelwle1ybluc3iqRemoteActionCompatParcelizer = r8lambdavofb8wwxngiixelwle1ybluc3iq;
            }
        }
        this.MediaMetadataCompat = r8lambdavofb8wwxngiixelwle1ybluc3iqRemoteActionCompatParcelizer;
        this.MediaSessionCompatQueueItem = bool;
    }

    public final int hashCode() {
        int i = this.read;
        r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iq = this.MediaMetadataCompat;
        Boolean bool = this.MediaSessionCompatQueueItem;
        return Objects.hash(Integer.valueOf(i), this.IconCompatParcelizer, this.serializer, this.write, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.RatingCompat, r8lambdavofb8wwxngiixelwle1ybluc3iq, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        handleLogClick handlelogclick = (handleLogClick) obj;
        return this.read == handlelogclick.read && Objects.equals(this.IconCompatParcelizer, handlelogclick.IconCompatParcelizer) && this.serializer == handlelogclick.serializer && Objects.equals(this.write, handlelogclick.write) && Objects.equals(this.RatingCompat, handlelogclick.RatingCompat) && this.MediaDescriptionCompat == handlelogclick.MediaDescriptionCompat && this.MediaBrowserCompatMediaItem == handlelogclick.MediaBrowserCompatMediaItem && this.MediaMetadataCompat == handlelogclick.MediaMetadataCompat && this.MediaSessionCompatQueueItem == handlelogclick.MediaSessionCompatQueueItem;
    }

    public handleLogClick(String str, int i, List<handleLogClickdefault> list, parseString parsestring, Double d, OccupantRoleInternal occupantRoleInternal, OccupantRoleFeedbackInternal occupantRoleFeedbackInternal, Double d2, r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iq, Boolean bool) {
        super(str);
        this.read = i;
        this.IconCompatParcelizer = list;
        this.serializer = parsestring;
        this.MediaDescriptionCompat = occupantRoleInternal;
        this.write = d;
        this.MediaBrowserCompatMediaItem = occupantRoleFeedbackInternal;
        this.RatingCompat = d2;
        this.MediaMetadataCompat = r8lambdavofb8wwxngiixelwle1ybluc3iq;
        this.MediaSessionCompatQueueItem = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @runlambda0
    public handleLogClick(String str, int i, List<handleLogClickdefault> list, Boolean bool) {
        OccupantRoleInternal occupantRoleInternal = OccupantRoleInternal.UNAVAILABLE;
        OccupantRoleFeedbackInternal occupantRoleFeedbackInternal = OccupantRoleFeedbackInternal.UNSET;
        r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.RemoteActionCompatParcelizer.getClass();
        this(str, i, list, (parseString) null, (Double) null, occupantRoleInternal, occupantRoleFeedbackInternal, (Double) null, r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.read.RemoteActionCompatParcelizer(), bool);
    }
}
