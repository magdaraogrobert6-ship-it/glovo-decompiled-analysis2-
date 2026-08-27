package o;

import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.drivinginsights.api.SafetyScores;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleFeedbackInternal;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import com.sentiance.sdk.ondevice.api.event.OccupantRole;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class registerGeofencesWithGooglePlay {
    private final setHeaderTextColor serializer;

    public registerGeofencesWithGooglePlay(setHeaderTextColor setheadertextcolor, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        setheadertextcolor.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.serializer = setheadertextcolor;
    }

    public final Float IconCompatParcelizer(long j, List<? extends TransportMode> list, List<? extends OccupantRole> list2) {
        OccupantRoleInternal occupantRoleInternal;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(TransportChangeType.getTransportChangeTypes((TransportMode) it.next()));
        }
        ArrayList arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList);
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 10));
        Iterator it2 = arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((TransportChangeType) it2.next()).value));
        }
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (OccupantRole occupantRole : list2) {
            OccupantRoleInternal.Companion.getClass();
            occupantRole.getClass();
            int i = setImageDownloadSuccessful.write[occupantRole.ordinal()];
            if (i == 1) {
                occupantRoleInternal = OccupantRoleInternal.DRIVER;
            } else if (i != 2) {
                occupantRoleInternal = OccupantRoleInternal.UNAVAILABLE;
            } else {
                occupantRoleInternal = OccupantRoleInternal.PASSENGER;
            }
            arrayList3.add(occupantRoleInternal.getValue());
        }
        WhereClause whereClause = WhereClause.serializer("type").read(arrayList2);
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        long jCurrentTimeMillis = System.currentTimeMillis();
        final setHeaderTextColor setheadertextcolor = this.serializer;
        List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(inAppMessageFull, j, jCurrentTimeMillis, whereClause);
        listIconCompatParcelizer.getClass();
        final ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
        Iterator it3 = listIconCompatParcelizer.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) it3.next()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        }
        if (!arrayList4.isEmpty()) {
            String str = String.format("coalesce(nullif(%s, '%s'), %s) IN (%s)", Arrays.copyOf(new Object[]{"occupant_role_feedback", OccupantRoleFeedbackInternal.UNSET.getValue(), "occupant_role", onContentCardDismissed.IconCompatParcelizer(arrayList3, ",", null, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.sentiance.sdk.drivinginsights.providers.SafetyScoresProvider$getAverageOverallSafetyScore$condition$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    String str2 = (String) obj;
                    str2.getClass();
                    return "'" + str2 + '\'';
                }
            }, 30)}, 4));
            List list3 = Collections.EMPTY_LIST;
            final WhereClause whereClause2 = new WhereClause(str, list3);
            final InAppMessageHtml inAppMessageHtmlMediaBrowserCompatMediaItem = InAppMessageHtml.MediaBrowserCompatMediaItem();
            List list4 = (List) setheadertextcolor.serializer(list3, (r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<List>) new r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk() { // from class: o.enableDarkTheme
                @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
                public final Object serializer(SQLiteDatabase sQLiteDatabase) {
                    return setHeaderTextColor.IconCompatParcelizer(setheadertextcolor, arrayList4, whereClause2, inAppMessageHtmlMediaBrowserCompatMediaItem, sQLiteDatabase);
                }
            });
            list4.getClass();
            final ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(((handleLogClick) it4.next()).serializer());
            }
            if (!arrayList5.isEmpty()) {
                final WhereClause whereClauseWrite = WhereClause.serializer("type").write(SafetyScoreType.OVERALL.value);
                final logImpressionlambda3 logimpressionlambda3MediaBrowserCompatMediaItem = logImpressionlambda3.MediaBrowserCompatMediaItem();
                List list5 = (List) setheadertextcolor.serializer(Collections.EMPTY_LIST, (r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<List>) new r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk() { // from class: o.enableDarkTheme
                    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
                    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
                        return setHeaderTextColor.IconCompatParcelizer(setheadertextcolor, arrayList5, whereClauseWrite, logimpressionlambda3MediaBrowserCompatMediaItem, sQLiteDatabase);
                    }
                });
                if (!list5.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(Double.valueOf(((r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ) it5.next()).read()));
                    }
                    Iterator it6 = arrayList6.iterator();
                    double dDoubleValue = 0.0d;
                    int i2 = 0;
                    while (it6.hasNext()) {
                        dDoubleValue += ((Number) it6.next()).doubleValue();
                        i2++;
                        if (i2 < 0) {
                            androidx.sqlite.SQLite.RemoteActionCompatParcelizer();
                            throw null;
                        }
                    }
                    return Float.valueOf((float) (i2 == 0 ? Double.NaN : dDoubleValue / ((double) i2)));
                }
            }
        }
        return null;
    }

    public final SafetyScores IconCompatParcelizer(String str) {
        List<r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ> listIconCompatParcelizer = this.serializer.IconCompatParcelizer(logImpressionlambda3.MediaBrowserCompatMediaItem(), str);
        listIconCompatParcelizer.getClass();
        SafetyScores.Builder builder = new SafetyScores.Builder();
        for (r8lambdaRwoOJtaRBUu1yb4G_0x9VnCeEQ r8lambdarwoojtarbuu1yb4g_0x9vnceeq : listIconCompatParcelizer) {
            float f = (float) r8lambdarwoojtarbuu1yb4g_0x9vnceeq.read();
            SafetyScoreType safetyScoreTypeSerializer = r8lambdarwoojtarbuu1yb4g_0x9vnceeq.serializer();
            switch (safetyScoreTypeSerializer == null ? -1 : isGeofencesEnabledFromEnvironment.read[safetyScoreTypeSerializer.ordinal()]) {
                case 1:
                    builder.setSmoothScore(Float.valueOf(f));
                    break;
                case 2:
                    builder.setFocusScore(Float.valueOf(f));
                    break;
                case 3:
                    builder.setCallWhileMovingScore(Float.valueOf(f));
                    break;
                case 4:
                    builder.setLegalScore(Float.valueOf(f));
                    break;
                case 5:
                    builder.setOverallScore(Float.valueOf(f));
                    break;
                case 6:
                    builder.setHarshBrakingScore(Float.valueOf(f));
                    break;
                case 7:
                    builder.setHarshTurningScore(Float.valueOf(f));
                    break;
                case 8:
                    builder.setHarshAccelerationScore(Float.valueOf(f));
                    break;
                case 9:
                    builder.setWrongWayDrivingScore(Float.valueOf(f));
                    break;
                case 10:
                    builder.setAttentionScore(Float.valueOf(f));
                    break;
            }
        }
        SafetyScores safetyScoresCreateSafetyScores = builder.createSafetyScores();
        safetyScoresCreateSafetyScores.getClass();
        return safetyScoresCreateSafetyScores;
    }
}
