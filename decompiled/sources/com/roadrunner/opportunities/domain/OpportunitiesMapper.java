package com.roadrunner.opportunities.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.o7;
import o.o7ExternalSyntheticLambda3;
import o.onContentCardDismissed;
import o.onMove;
import o.removeNodeAtDepth;
import o.s6;
import o.sa;
import o.sb;
import o.sd;
import o.se;
import o.setCarryoverInAppMessage;
import o.sg;
import o.t1;
import o.t2;
import o.t3;
import o.v4;
import o.v9;
import o.vcExternalSyntheticLambda2;
import o.vf;
import o.w3;
import o.w4ExternalSyntheticLambda0;
import o.w7ExternalSyntheticLambda0;
import o.w8ExternalSyntheticLambda1;
import o.w8ExternalSyntheticLambda6;
import o.wd;
import o.xa;

/* JADX INFO: loaded from: classes3.dex */
public final class OpportunitiesMapper {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final o7 IconCompatParcelizer;
    public final v4 RemoteActionCompatParcelizer;
    public final vcExternalSyntheticLambda2 read;
    public final xa serializer;
    public final v9 write;

    public OpportunitiesMapper(xa xaVar, vcExternalSyntheticLambda2 vcexternalsyntheticlambda2, v4 v4Var, v9 v9Var, o7 o7Var) {
        xaVar.getClass();
        vcexternalsyntheticlambda2.getClass();
        v4Var.getClass();
        v9Var.getClass();
        o7Var.getClass();
        this.serializer = xaVar;
        this.read = vcexternalsyntheticlambda2;
        this.RemoteActionCompatParcelizer = v4Var;
        this.write = v9Var;
        this.IconCompatParcelizer = o7Var;
    }

    public static ArrayList RemoteActionCompatParcelizer(vf vfVar) {
        int i = 2 % 2;
        ArrayList<List> arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(vfVar.coordinates);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 10));
        int i2 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 2 % 3;
        }
        for (List list : arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            arrayList.add(new o7ExternalSyntheticLambda3(((Number) list.get(1)).doubleValue(), ((Number) list.get(0)).doubleValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:48:0x014e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    /* JADX WARN: Code duplicated, block: B:54:0x018f  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01af -> B:46:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01e8 -> B:64:0x01eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01f0 -> B:65:0x01ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01f7 -> B:69:0x01fd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getZoneGeoJson(o.w8ExternalSyntheticLambda6 r23, o.w4ExternalSyntheticLambda0 r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.opportunities.domain.OpportunitiesMapper.getZoneGeoJson(o.w8ExternalSyntheticLambda6, o.w4ExternalSyntheticLambda0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r46v0, types: [com.roadrunner.opportunities.domain.OpportunitiesMapper] */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public final Object invoke(w4ExternalSyntheticLambda0 w4externalsyntheticlambda0, ContinuationImpl continuationImpl) throws Throwable {
        wd wdVar;
        s6 s6Var;
        sa sbVar;
        char c;
        boolean z;
        s6 s6Var2;
        ?? arrayList;
        boolean z2;
        w4ExternalSyntheticLambda0 w4externalsyntheticlambda1 = w4externalsyntheticlambda0;
        int i = 2 % 2;
        if (!(continuationImpl instanceof wd)) {
            wdVar = new wd(this, continuationImpl);
        } else {
            wdVar = (wd) continuationImpl;
            int i2 = wdVar.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaDescriptionCompat + 101;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                wdVar.IconCompatParcelizer = i3 % 2 == 0 ? i2 - Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                wdVar = new wd(this, continuationImpl);
            }
        }
        Object objMapToZones = wdVar.write;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = wdVar.IconCompatParcelizer;
        s6 s6Var3 = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objMapToZones);
            wdVar.read = w4externalsyntheticlambda1;
            wdVar.IconCompatParcelizer = 1;
            objMapToZones = mapToZones(w4externalsyntheticlambda1, wdVar);
            if (objMapToZones == obj) {
                int i5 = MediaBrowserCompatMediaItem + 23;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return obj;
                }
                s6Var3.hashCode();
                throw null;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w4externalsyntheticlambda1 = wdVar.read;
            ExtrasKt.RemoteActionCompatParcelizer(objMapToZones);
        }
        Map map = (Map) objMapToZones;
        boolean z3 = w4externalsyntheticlambda1.showZone;
        List list = w4externalsyntheticlambda1.opportunities;
        List list2 = w4externalsyntheticlambda1.zones;
        xa xaVar = this.serializer;
        v9 v9Var = this.write;
        if (z3 && list.isEmpty()) {
            w8ExternalSyntheticLambda6 w8externalsyntheticlambda6 = (w8ExternalSyntheticLambda6) onContentCardDismissed.MediaMetadataCompat(list2);
            if (w8externalsyntheticlambda6 == null) {
                sbVar = sd.RemoteActionCompatParcelizer;
            } else {
                String str = w8externalsyntheticlambda6.name;
                int i6 = w8externalsyntheticlambda6.id;
                t3 t3VarRemoteActionCompatParcelizer = xa.RemoteActionCompatParcelizer(xaVar, w8externalsyntheticlambda6.bonusMultiplier, w8externalsyntheticlambda6.bonusTypes);
                boolean z4 = w4externalsyntheticlambda1.showZone;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w8externalsyntheticlambda6.calendarEnabled, Boolean.TRUE}, getCieXyz.write())).booleanValue() && v9Var.serializer()) {
                    int i7 = MediaDescriptionCompat + 13;
                    MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                sbVar = new sb((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new t2(str, i6, null, null, t3VarRemoteActionCompatParcelizer, true, z4, false, Boolean.valueOf(z2))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), false);
            }
            s6Var = null;
        } else {
            List list3 = list2;
            int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list3, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            for (Object obj2 : list3) {
                int i8 = MediaBrowserCompatMediaItem + 31;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                linkedHashMap.put(Integer.valueOf(((w8ExternalSyntheticLambda6) obj2).id), obj2);
            }
            List list4 = list;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                w3 w3Var = (w3) it.next();
                Object obj3 = linkedHashMap.get(Integer.valueOf(w3Var.zoneId));
                if (obj3 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Opportunities should always have their zones in the response!");
                    return null;
                }
                w8ExternalSyntheticLambda6 w8externalsyntheticlambda7 = (w8ExternalSyntheticLambda6) obj3;
                int i10 = w3Var.zoneId;
                String str2 = w8externalsyntheticlambda7.name;
                String str3 = w3Var.url;
                t3 t3VarRemoteActionCompatParcelizer2 = xa.RemoteActionCompatParcelizer(xaVar, w8externalsyntheticlambda7.bonusMultiplier, w8externalsyntheticlambda7.bonusTypes);
                boolean z5 = w4externalsyntheticlambda1.showZone;
                w7ExternalSyntheticLambda0 w7externalsyntheticlambda0 = w3Var.startingPoint;
                t1 t1Var = w7externalsyntheticlambda0 != null ? new t1(RemoteActionCompatParcelizer(w7externalsyntheticlambda0.geoJson), RemoteActionCompatParcelizer(w7externalsyntheticlambda0.centerGeoJson), w7externalsyntheticlambda0.name, w7externalsyntheticlambda0.id) : null;
                Boolean bool = w3Var.upcomingSession;
                Boolean bool2 = Boolean.TRUE;
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, bool2}, getCieXyz.write())).booleanValue();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w8externalsyntheticlambda7.calendarEnabled, bool2}, getCieXyz.write())).booleanValue()) {
                    int i11 = MediaBrowserCompatMediaItem + 117;
                    MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                    c = 2;
                    int i12 = i11 % 2;
                    if (v9Var.serializer()) {
                        int i13 = MediaDescriptionCompat + 75;
                        MediaBrowserCompatMediaItem = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        z = true;
                    }
                    arrayList2.add(new t2(str2, i10, str3, t1Var, t3VarRemoteActionCompatParcelizer2, false, z5, zBooleanValue, Boolean.valueOf(z)));
                    it = it;
                    xaVar = xaVar;
                    linkedHashMap = linkedHashMap;
                    s6Var3 = null;
                } else {
                    c = 2;
                }
                z = false;
                arrayList2.add(new t2(str2, i10, str3, t1Var, t3VarRemoteActionCompatParcelizer2, false, z5, zBooleanValue, Boolean.valueOf(z)));
                it = it;
                xaVar = xaVar;
                linkedHashMap = linkedHashMap;
                s6Var3 = null;
            }
            s6Var = s6Var3;
            sbVar = new sb(arrayList2, list2.size() > 1);
        }
        vf vfVar = w4externalsyntheticlambda1.activeArea;
        if (vfVar != null) {
            List<List> list5 = vfVar.coordinates;
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
            for (List<List> list6 : list5) {
                ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                for (List list7 : list6) {
                    arrayList4.add(new o7ExternalSyntheticLambda3(((Number) list7.get(1)).doubleValue(), ((Number) list7.get(0)).doubleValue()));
                }
                arrayList3.add(arrayList4);
            }
            s6Var2 = new s6(arrayList3);
        } else {
            s6Var2 = s6Var;
        }
        List<w8ExternalSyntheticLambda1> list8 = w4externalsyntheticlambda1.startNow;
        if (list8 != null) {
            arrayList = new ArrayList();
            for (w8ExternalSyntheticLambda1 w8externalsyntheticlambda1 : list8) {
                Integer numPlaybackStateCompat = setCarryoverInAppMessage.PlaybackStateCompat(w8externalsyntheticlambda1.id);
                Object sgVar = numPlaybackStateCompat != null ? new sg(numPlaybackStateCompat.intValue(), w8externalsyntheticlambda1.type, w8externalsyntheticlambda1.startTime) : s6Var;
                if (sgVar != null) {
                    arrayList.add(sgVar);
                }
            }
        } else {
            arrayList = instance_delegatelambda0.write;
        }
        return new se(sbVar, s6Var2, map, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0289  */
    /* JADX WARN: Code duplicated, block: B:57:0x0302  */
    /* JADX WARN: Code duplicated, block: B:58:0x030f  */
    /* JADX WARN: Code duplicated, block: B:61:0x031e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0321  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0645 -> B:114:0x0656). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x05e5 -> B:100:0x05f6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable mapToZones(o.w4ExternalSyntheticLambda0 r53, kotlin.coroutines.jvm.internal.ContinuationImpl r54) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.opportunities.domain.OpportunitiesMapper.mapToZones(o.w4ExternalSyntheticLambda0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
