package o;

import android.util.Log;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public final class setForceRecompose {
    public final /* synthetic */ int IconCompatParcelizer;
    public Long MediaBrowserCompatMediaItem;
    public Long MediaDescriptionCompat;
    public Boolean MediaMetadataCompat;
    public final SoftwareKeyboardInterceptionModifierKt RatingCompat;
    public Boolean RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final /* synthetic */ setContent write;

    public setForceRecompose(setContent setcontent, String str, int i, SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt, int i2) {
        this.IconCompatParcelizer = i2;
        this.write = setcontent;
        this.serializer = str;
        this.read = i;
        this.RatingCompat = softwareKeyboardInterceptionModifierKt;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0274  */
    /* JADX WARN: Code duplicated, block: B:106:0x0294  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:132:0x0306  */
    /* JADX WARN: Code duplicated, block: B:134:0x030c  */
    /* JADX WARN: Code duplicated, block: B:135:0x031a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0320  */
    /* JADX WARN: Code duplicated, block: B:139:0x0328  */
    /* JADX WARN: Code duplicated, block: B:141:0x0332  */
    /* JADX WARN: Code duplicated, block: B:151:0x0356  */
    /* JADX WARN: Code duplicated, block: B:154:0x035f  */
    /* JADX WARN: Code duplicated, block: B:158:0x038a A[EDGE_INSN: B:158:0x038a->B:161:0x03b0 BREAK  A[LOOP:1: B:60:0x0183->B:65:0x01a7]] */
    /* JADX WARN: Code duplicated, block: B:159:0x039d A[EDGE_INSN: B:159:0x039d->B:161:0x03b0 BREAK  A[LOOP:1: B:60:0x0183->B:65:0x01a7]] */
    /* JADX WARN: Code duplicated, block: B:205:0x033b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x03b0 A[EDGE_INSN: B:225:0x03b0->B:161:0x03b0 BREAK  A[LOOP:1: B:60:0x0183->B:65:0x01a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x03b0 A[EDGE_INSN: B:229:0x03b0->B:161:0x03b0 BREAK  A[LOOP:1: B:60:0x0183->B:65:0x01a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03b0 A[EDGE_INSN: B:234:0x03b0->B:161:0x03b0 BREAK  A[LOOP:1: B:60:0x0183->B:65:0x01a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0176  */
    /* JADX WARN: Code duplicated, block: B:62:0x0189  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a7 A[LOOP:1: B:60:0x0183->B:65:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202  */
    /* JADX WARN: Code duplicated, block: B:83:0x020b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0217  */
    /* JADX WARN: Code duplicated, block: B:92:0x0247  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean write(Long l, Long l2, getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq, long j, getPlaceablesCount getplaceablescount, boolean z) {
        HashSet hashSet;
        Iterator it;
        ImageKt imageKt;
        Iterator it2;
        Iterator it3;
        getSystemHomeEK5gGoQ getsystemhomeek5ggoq;
        boolean z2;
        String strMediaSessionCompatQueueItem;
        Object obj;
        Boolean boolSerializer;
        Boolean boolSerializer2;
        String str;
        getStem3EK5gGoQ getstem3ek5ggoqWrite;
        Iterator it4;
        ImageKt imageKt2;
        long j2;
        Boolean boolSerializer3;
        getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq;
        Long lValueOf;
        Double dValueOf;
        getSystemHomeEK5gGoQ getsystemhomeek5ggoq2;
        Boolean boolSerializer4;
        int i;
        accessgetRelocatecp.write();
        setContent setcontent = this.write;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setcontent.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        zzgn zzgnVar = lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.accessensureViewModelStore;
        String str2 = this.serializer;
        boolean zWrite = setcomposedwithreusablecontenthost.write(str2, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1);
        getSpacebarEK5gGoQ getspacebarek5ggoq = (getSpacebarEK5gGoQ) this.RatingCompat;
        long j3 = getspacebarek5ggoq.MediaSessionCompatResultReceiverWrapper() ? getplaceablescount.IconCompatParcelizer : j;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        zzgs zzgsVar = getlookaheaddelegate.PlaybackStateCompat;
        zzgs zzgsVar2 = getlookaheaddelegate.MediaSessionCompatQueueItem;
        boolean zIsLoggable = Log.isLoggable(getlookaheaddelegate.ResultReceiver(), 2);
        int i2 = this.read;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgsVar.IconCompatParcelizer("Evaluating filter. audience, filter, event", Integer.valueOf(i2), getspacebarek5ggoq.IconCompatParcelizer() ? Integer.valueOf(getspacebarek5ggoq.write()) : null, zzgnVar.write(getspacebarek5ggoq.read()));
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgz zzgzVar = setcontent.MediaSessionCompatToken.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            zzpg.serializer(zzgzVar);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (getspacebarek5ggoq.IconCompatParcelizer()) {
                i = 0;
                zzgz.read(sb, 0, "filter_id", Integer.valueOf(getspacebarek5ggoq.write()));
            } else {
                i = 0;
            }
            zzgz.read(sb, i, "event_name", ((LookaheadScopeKtLookaheadScope221) zzgzVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(getspacebarek5ggoq.read()));
            String strIconCompatParcelizer = zzgz.IconCompatParcelizer(getspacebarek5ggoq.MediaDescriptionCompat(), getspacebarek5ggoq.MediaSessionCompatQueueItem(), getspacebarek5ggoq.MediaSessionCompatResultReceiverWrapper());
            if (!strIconCompatParcelizer.isEmpty()) {
                zzgz.read(sb, 0, "filter_type", strIconCompatParcelizer);
            }
            if (getspacebarek5ggoq.RatingCompat()) {
                zzgz.read(sb, 1, "event_count_filter", getspacebarek5ggoq.MediaMetadataCompat());
            }
            if (getspacebarek5ggoq.MediaBrowserCompatMediaItem() > 0) {
                sb.append("  filters {\n");
                Iterator it5 = getspacebarek5ggoq.RemoteActionCompatParcelizer().iterator();
                while (it5.hasNext()) {
                    zzgzVar.RemoteActionCompatParcelizer(sb, 2, (getSystemHomeEK5gGoQ) it5.next());
                }
            }
            zzgz.RemoteActionCompatParcelizer(1, sb);
            sb.append("}\n}\n");
            zzgsVar.serializer(sb.toString(), "Filter definition");
        }
        if (!getspacebarek5ggoq.IconCompatParcelizer() || getspacebarek5ggoq.write() > 256) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgsVar2.serializer("Invalid event filter ID. appId, id", getLookaheadDelegate.RemoteActionCompatParcelizer(str2), String.valueOf(getspacebarek5ggoq.IconCompatParcelizer() ? Integer.valueOf(getspacebarek5ggoq.write()) : null));
            return false;
        }
        boolean z3 = getspacebarek5ggoq.MediaDescriptionCompat() || getspacebarek5ggoq.MediaSessionCompatQueueItem() || getspacebarek5ggoq.MediaSessionCompatResultReceiverWrapper();
        if (z && !z3) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgsVar.serializer("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i2), getspacebarek5ggoq.IconCompatParcelizer() ? Integer.valueOf(getspacebarek5ggoq.write()) : null);
            return true;
        }
        String strIconCompatParcelizer2 = gettvterrestrialdigitalek5ggoq.IconCompatParcelizer();
        if (!getspacebarek5ggoq.RatingCompat()) {
            hashSet = new HashSet();
            it = getspacebarek5ggoq.RemoteActionCompatParcelizer().iterator();
            while (true) {
                if (it.hasNext()) {
                    imageKt = new ImageKt(0);
                    it2 = gettvterrestrialdigitalek5ggoq.serializer().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = getspacebarek5ggoq.RemoteActionCompatParcelizer().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                getsystemhomeek5ggoq = (getSystemHomeEK5gGoQ) it3.next();
                                if (getsystemhomeek5ggoq.RatingCompat()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strMediaSessionCompatQueueItem = getsystemhomeek5ggoq.MediaSessionCompatQueueItem();
                                if (strMediaSessionCompatQueueItem.isEmpty()) {
                                    obj = imageKt.get(strMediaSessionCompatQueueItem);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                if (obj == null) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    zzgsVar2.serializer("Unknown param type. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                    break;
                                                }
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                zzgsVar.serializer("Missing param for filter. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (getsystemhomeek5ggoq.serializer()) {
                                                if (getsystemhomeek5ggoq.read()) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    zzgsVar2.serializer("No filter for String param. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (zzgz.RemoteActionCompatParcelizer(str)) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    zzgsVar2.serializer("Invalid param value for number filter. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                    break;
                                                }
                                                getstem3ek5ggoqWrite = getsystemhomeek5ggoq.write();
                                                if (zzgz.RemoteActionCompatParcelizer(str)) {
                                                    it4 = it3;
                                                    imageKt2 = imageKt;
                                                    j2 = 0;
                                                    boolSerializer3 = serializer(new BigDecimal(str), getstem3ek5ggoqWrite, 0.0d);
                                                } else {
                                                    boolSerializer3 = null;
                                                }
                                                if (boolSerializer3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolSerializer3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                imageKt = imageKt2;
                                                it3 = it4;
                                            } else {
                                                getTEK5gGoQ gettek5ggoqRemoteActionCompatParcelizer = getsystemhomeek5ggoq.RemoteActionCompatParcelizer();
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                boolSerializer3 = serializer((String) obj, gettek5ggoqRemoteActionCompatParcelizer, getlookaheaddelegate);
                                            }
                                            it4 = it3;
                                            imageKt2 = imageKt;
                                            j2 = 0;
                                            if (boolSerializer3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolSerializer3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            imageKt = imageKt2;
                                            it3 = it4;
                                        } else {
                                            if (getsystemhomeek5ggoq.read()) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                zzgsVar2.serializer("No number filter for double param. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                break;
                                            }
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolSerializer2 = serializer(new BigDecimal(dDoubleValue), getsystemhomeek5ggoq.write(), Math.ulp(dDoubleValue));
                                            if (boolSerializer2 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolSerializer2.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (getsystemhomeek5ggoq.read()) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar2.serializer("No number filter for long param. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                            break;
                                        }
                                        boolSerializer = serializer(new BigDecimal(((Long) obj).longValue()), getsystemhomeek5ggoq.write(), 0.0d);
                                        if (boolSerializer != null) {
                                            break;
                                            break;
                                        }
                                        if (boolSerializer.booleanValue() == z2) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar2.serializer(zzgnVar.write(strIconCompatParcelizer2), "Event has empty param name. event");
                                    break;
                                }
                            }
                        } else {
                            gettvsatelliteserviceek5ggoq = (getTvSatelliteServiceEK5gGoQ) it2.next();
                            if (!hashSet.contains(gettvsatelliteserviceek5ggoq.read())) {
                                if (gettvsatelliteserviceek5ggoq.MediaBrowserCompatMediaItem()) {
                                    if (gettvsatelliteserviceek5ggoq.MediaSessionCompatQueueItem()) {
                                        if (gettvsatelliteserviceek5ggoq.RemoteActionCompatParcelizer()) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar2.serializer("Unknown value for param. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(gettvsatelliteserviceek5ggoq.read()));
                                            break;
                                        }
                                        imageKt.put(gettvsatelliteserviceek5ggoq.read(), gettvsatelliteserviceek5ggoq.serializer());
                                    } else {
                                        String str3 = gettvsatelliteserviceek5ggoq.read();
                                        if (gettvsatelliteserviceek5ggoq.MediaSessionCompatQueueItem()) {
                                            dValueOf = Double.valueOf(gettvsatelliteserviceek5ggoq.PlaybackStateCompatCustomAction());
                                        } else {
                                            dValueOf = null;
                                        }
                                        imageKt.put(str3, dValueOf);
                                    }
                                } else {
                                    String str4 = gettvsatelliteserviceek5ggoq.read();
                                    if (gettvsatelliteserviceek5ggoq.MediaBrowserCompatMediaItem()) {
                                        lValueOf = Long.valueOf(gettvsatelliteserviceek5ggoq.MediaDescriptionCompat());
                                    } else {
                                        lValueOf = null;
                                    }
                                    imageKt.put(str4, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    getsystemhomeek5ggoq2 = (getSystemHomeEK5gGoQ) it.next();
                    if (getsystemhomeek5ggoq2.MediaSessionCompatQueueItem().isEmpty()) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar2.serializer(zzgnVar.write(strIconCompatParcelizer2), "null or empty param name in filter. event");
                        break;
                    }
                    hashSet.add(getsystemhomeek5ggoq2.MediaSessionCompatQueueItem());
                }
            }
        } else {
            try {
                boolSerializer4 = serializer(new BigDecimal(j3), getspacebarek5ggoq.MediaMetadataCompat(), 0.0d);
            } catch (NumberFormatException unused) {
                boolSerializer4 = null;
            }
            if (boolSerializer4 != null) {
                if (boolSerializer4.booleanValue()) {
                    hashSet = new HashSet();
                    it = getspacebarek5ggoq.RemoteActionCompatParcelizer().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            imageKt = new ImageKt(0);
                            it2 = gettvterrestrialdigitalek5ggoq.serializer().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = getspacebarek5ggoq.RemoteActionCompatParcelizer().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        getsystemhomeek5ggoq = (getSystemHomeEK5gGoQ) it3.next();
                                        if (getsystemhomeek5ggoq.RatingCompat() || !getsystemhomeek5ggoq.MediaBrowserCompatMediaItem()) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        strMediaSessionCompatQueueItem = getsystemhomeek5ggoq.MediaSessionCompatQueueItem();
                                        if (strMediaSessionCompatQueueItem.isEmpty()) {
                                            obj = imageKt.get(strMediaSessionCompatQueueItem);
                                            if (obj instanceof Long) {
                                                if (obj instanceof Double) {
                                                    if (obj instanceof String) {
                                                        if (obj == null) {
                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                            zzgsVar2.serializer("Unknown param type. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                            break;
                                                        }
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                        zzgsVar.serializer("Missing param for filter. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (getsystemhomeek5ggoq.serializer()) {
                                                        if (getsystemhomeek5ggoq.read()) {
                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                            zzgsVar2.serializer("No filter for String param. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                            break;
                                                        }
                                                        str = (String) obj;
                                                        if (zzgz.RemoteActionCompatParcelizer(str)) {
                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                            zzgsVar2.serializer("Invalid param value for number filter. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                            break;
                                                        }
                                                        getstem3ek5ggoqWrite = getsystemhomeek5ggoq.write();
                                                        if (zzgz.RemoteActionCompatParcelizer(str)) {
                                                            boolSerializer3 = null;
                                                        } else {
                                                            try {
                                                                it4 = it3;
                                                                imageKt2 = imageKt;
                                                                j2 = 0;
                                                                try {
                                                                    boolSerializer3 = serializer(new BigDecimal(str), getstem3ek5ggoqWrite, 0.0d);
                                                                } catch (NumberFormatException unused2) {
                                                                    boolSerializer3 = null;
                                                                }
                                                            } catch (NumberFormatException unused3) {
                                                                it4 = it3;
                                                                imageKt2 = imageKt;
                                                                j2 = 0;
                                                            }
                                                        }
                                                        if (boolSerializer3 != null) {
                                                            break;
                                                        }
                                                        if (boolSerializer3.booleanValue() == z2) {
                                                            bool = Boolean.FALSE;
                                                            break;
                                                        }
                                                        imageKt = imageKt2;
                                                        it3 = it4;
                                                    } else {
                                                        getTEK5gGoQ gettek5ggoqRemoteActionCompatParcelizer2 = getsystemhomeek5ggoq.RemoteActionCompatParcelizer();
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                        boolSerializer3 = serializer((String) obj, gettek5ggoqRemoteActionCompatParcelizer2, getlookaheaddelegate);
                                                    }
                                                    it4 = it3;
                                                    imageKt2 = imageKt;
                                                    j2 = 0;
                                                    if (boolSerializer3 != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolSerializer3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    imageKt = imageKt2;
                                                    it3 = it4;
                                                } else if (getsystemhomeek5ggoq.read()) {
                                                    double dDoubleValue2 = ((Double) obj).doubleValue();
                                                    try {
                                                        boolSerializer2 = serializer(new BigDecimal(dDoubleValue2), getsystemhomeek5ggoq.write(), Math.ulp(dDoubleValue2));
                                                    } catch (NumberFormatException unused4) {
                                                        boolSerializer2 = null;
                                                    }
                                                    if (boolSerializer2 != null) {
                                                        break;
                                                    }
                                                    if (boolSerializer2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    zzgsVar2.serializer("No number filter for double param. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                    break;
                                                }
                                            } else if (getsystemhomeek5ggoq.read()) {
                                                try {
                                                    boolSerializer = serializer(new BigDecimal(((Long) obj).longValue()), getsystemhomeek5ggoq.write(), 0.0d);
                                                } catch (NumberFormatException unused5) {
                                                    boolSerializer = null;
                                                }
                                                if (boolSerializer != null) {
                                                    break;
                                                }
                                                if (boolSerializer.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                zzgsVar2.serializer("No number filter for long param. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(strMediaSessionCompatQueueItem));
                                                break;
                                            }
                                        } else {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar2.serializer(zzgnVar.write(strIconCompatParcelizer2), "Event has empty param name. event");
                                            break;
                                        }
                                    }
                                } else {
                                    gettvsatelliteserviceek5ggoq = (getTvSatelliteServiceEK5gGoQ) it2.next();
                                    if (!hashSet.contains(gettvsatelliteserviceek5ggoq.read())) {
                                        if (gettvsatelliteserviceek5ggoq.MediaBrowserCompatMediaItem()) {
                                            if (gettvsatelliteserviceek5ggoq.MediaSessionCompatQueueItem()) {
                                                if (gettvsatelliteserviceek5ggoq.RemoteActionCompatParcelizer()) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    zzgsVar2.serializer("Unknown value for param. event, param", zzgnVar.write(strIconCompatParcelizer2), zzgnVar.IconCompatParcelizer(gettvsatelliteserviceek5ggoq.read()));
                                                    break;
                                                }
                                                imageKt.put(gettvsatelliteserviceek5ggoq.read(), gettvsatelliteserviceek5ggoq.serializer());
                                            } else {
                                                String str5 = gettvsatelliteserviceek5ggoq.read();
                                                if (gettvsatelliteserviceek5ggoq.MediaSessionCompatQueueItem()) {
                                                    dValueOf = Double.valueOf(gettvsatelliteserviceek5ggoq.PlaybackStateCompatCustomAction());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                imageKt.put(str5, dValueOf);
                                            }
                                        } else {
                                            String str6 = gettvsatelliteserviceek5ggoq.read();
                                            if (gettvsatelliteserviceek5ggoq.MediaBrowserCompatMediaItem()) {
                                                lValueOf = Long.valueOf(gettvsatelliteserviceek5ggoq.MediaDescriptionCompat());
                                            } else {
                                                lValueOf = null;
                                            }
                                            imageKt.put(str6, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            getsystemhomeek5ggoq2 = (getSystemHomeEK5gGoQ) it.next();
                            if (getsystemhomeek5ggoq2.MediaSessionCompatQueueItem().isEmpty()) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar2.serializer(zzgnVar.write(strIconCompatParcelizer2), "null or empty param name in filter. event");
                                break;
                            }
                            hashSet.add(getsystemhomeek5ggoq2.MediaSessionCompatQueueItem());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        zzgsVar.serializer(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.RemoteActionCompatParcelizer = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.MediaMetadataCompat = bool2;
        if (!z3 || !gettvterrestrialdigitalek5ggoq.RemoteActionCompatParcelizer()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(gettvterrestrialdigitalek5ggoq.MediaMetadataCompat());
        if (getspacebarek5ggoq.MediaSessionCompatQueueItem()) {
            if (zWrite && getspacebarek5ggoq.RatingCompat()) {
                lValueOf2 = l;
            }
            this.MediaDescriptionCompat = lValueOf2;
            return true;
        }
        if (zWrite && getspacebarek5ggoq.RatingCompat()) {
            lValueOf2 = l2;
        }
        this.MediaBrowserCompatMediaItem = lValueOf2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    public static Boolean serializer(BigDecimal bigDecimal, getStem3EK5gGoQ getstem3ek5ggoq, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getstem3ek5ggoq);
        if (getstem3ek5ggoq.serializer()) {
            if (getstem3ek5ggoq.ParcelableVolumeInfo() != 1 && (getstem3ek5ggoq.ParcelableVolumeInfo() != 5 ? getstem3ek5ggoq.IconCompatParcelizer() : getstem3ek5ggoq.MediaDescriptionCompat() && getstem3ek5ggoq.RatingCompat())) {
                int iParcelableVolumeInfo = getstem3ek5ggoq.ParcelableVolumeInfo();
                try {
                    if (getstem3ek5ggoq.ParcelableVolumeInfo() == 5) {
                        if (zzgz.RemoteActionCompatParcelizer(getstem3ek5ggoq.MediaSessionCompatQueueItem()) && zzgz.RemoteActionCompatParcelizer(getstem3ek5ggoq.MediaBrowserCompatMediaItem())) {
                            BigDecimal bigDecimal5 = new BigDecimal(getstem3ek5ggoq.MediaSessionCompatQueueItem());
                            bigDecimal4 = new BigDecimal(getstem3ek5ggoq.MediaBrowserCompatMediaItem());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iParcelableVolumeInfo == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iParcelableVolumeInfo - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (zzgz.RemoteActionCompatParcelizer(getstem3ek5ggoq.MediaMetadataCompat())) {
                        bigDecimal2 = new BigDecimal(getstem3ek5ggoq.MediaMetadataCompat());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iParcelableVolumeInfo == 5) {
                            i = iParcelableVolumeInfo - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iParcelableVolumeInfo - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public static Boolean serializer(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean serializer(String str, getTEK5gGoQ gettek5ggoq, getLookaheadDelegate getlookaheaddelegate) {
        List listMediaBrowserCompatMediaItem;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(gettek5ggoq);
        if (str != null && gettek5ggoq.serializer() && gettek5ggoq.MediaMetadataCompat() != 1 && (gettek5ggoq.MediaMetadataCompat() != 7 ? gettek5ggoq.write() : gettek5ggoq.RatingCompat() != 0)) {
            int iMediaMetadataCompat = gettek5ggoq.MediaMetadataCompat();
            boolean zMediaDescriptionCompat = gettek5ggoq.MediaDescriptionCompat();
            String upperCase = (zMediaDescriptionCompat || iMediaMetadataCompat == 2 || iMediaMetadataCompat == 7) ? gettek5ggoq.read() : gettek5ggoq.read().toUpperCase(java.util.Locale.ENGLISH);
            if (gettek5ggoq.RatingCompat() == 0) {
                listMediaBrowserCompatMediaItem = null;
            } else {
                listMediaBrowserCompatMediaItem = gettek5ggoq.MediaBrowserCompatMediaItem();
                if (!zMediaDescriptionCompat) {
                    ArrayList arrayList = new ArrayList(listMediaBrowserCompatMediaItem.size());
                    Iterator it = listMediaBrowserCompatMediaItem.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(java.util.Locale.ENGLISH));
                    }
                    listMediaBrowserCompatMediaItem = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iMediaMetadataCompat == 2 ? upperCase : null;
            if (iMediaMetadataCompat != 7 ? upperCase != null : listMediaBrowserCompatMediaItem != null && !listMediaBrowserCompatMediaItem.isEmpty()) {
                if (!zMediaDescriptionCompat && iMediaMetadataCompat != 2) {
                    str = str.toUpperCase(java.util.Locale.ENGLISH);
                }
                switch (iMediaMetadataCompat - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zMediaDescriptionCompat ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (getlookaheaddelegate != null) {
                                    getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(upperCase));
                    case 3:
                        return Boolean.valueOf(str.endsWith(upperCase));
                    case 4:
                        return Boolean.valueOf(str.contains(upperCase));
                    case 5:
                        return Boolean.valueOf(str.equals(upperCase));
                    case 6:
                        if (listMediaBrowserCompatMediaItem != null) {
                            return Boolean.valueOf(listMediaBrowserCompatMediaItem.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public boolean read(Long l, Long l2, getYEK5gGoQ getyek5ggoq, boolean z) {
        boolean z2;
        Boolean boolSerializer;
        Boolean boolSerializer2;
        Boolean boolSerializer3;
        Boolean boolSerializer4;
        accessgetRelocatecp.write();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        zzgn zzgnVar = lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        boolean zWrite = setcomposedwithreusablecontenthost.write(this.serializer, premeasure0kLqBqw.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq = (getSystemNavigationUpEK5gGoQ) this.RatingCompat;
        boolean zMediaMetadataCompat = getsystemnavigationupek5ggoq.MediaMetadataCompat();
        boolean zMediaSessionCompatQueueItem = getsystemnavigationupek5ggoq.MediaSessionCompatQueueItem();
        boolean zMediaBrowserCompatMediaItem = getsystemnavigationupek5ggoq.MediaBrowserCompatMediaItem();
        boolean z3 = zMediaMetadataCompat || zMediaSessionCompatQueueItem || zMediaBrowserCompatMediaItem;
        if (z && !z3) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.read), getsystemnavigationupek5ggoq.serializer() ? Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer()) : null);
            return true;
        }
        getSystemHomeEK5gGoQ getsystemhomeek5ggoq = getsystemnavigationupek5ggoq.read();
        boolean zMediaBrowserCompatMediaItem2 = getsystemhomeek5ggoq.MediaBrowserCompatMediaItem();
        if (getyek5ggoq.MediaBrowserCompatMediaItem()) {
            if (!getsystemhomeek5ggoq.read()) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(zzgnVar.RemoteActionCompatParcelizer(getyek5ggoq.IconCompatParcelizer()), "No number filter for long property. property");
                z2 = zMediaBrowserCompatMediaItem;
                boolSerializer = null;
            } else {
                z2 = zMediaBrowserCompatMediaItem;
                try {
                    boolSerializer4 = serializer(new BigDecimal(getyek5ggoq.MediaMetadataCompat()), getsystemhomeek5ggoq.write(), 0.0d);
                } catch (NumberFormatException unused) {
                    boolSerializer4 = null;
                }
                boolSerializer = serializer(boolSerializer4, zMediaBrowserCompatMediaItem2);
            }
        } else {
            z2 = zMediaBrowserCompatMediaItem;
            if (getyek5ggoq.PlaybackStateCompat()) {
                if (!getsystemhomeek5ggoq.read()) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(zzgnVar.RemoteActionCompatParcelizer(getyek5ggoq.IconCompatParcelizer()), "No number filter for double property. property");
                    boolSerializer = null;
                } else {
                    double dPlaybackStateCompatCustomAction = getyek5ggoq.PlaybackStateCompatCustomAction();
                    try {
                        boolSerializer3 = serializer(new BigDecimal(dPlaybackStateCompatCustomAction), getsystemhomeek5ggoq.write(), Math.ulp(dPlaybackStateCompatCustomAction));
                    } catch (NumberFormatException unused2) {
                        boolSerializer3 = null;
                    }
                    boolSerializer = serializer(boolSerializer3, zMediaBrowserCompatMediaItem2);
                }
            } else {
                if (getyek5ggoq.read()) {
                    if (!getsystemhomeek5ggoq.serializer()) {
                        if (!getsystemhomeek5ggoq.read()) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(zzgnVar.RemoteActionCompatParcelizer(getyek5ggoq.IconCompatParcelizer()), "No string or number filter defined. property");
                        } else if (zzgz.RemoteActionCompatParcelizer(getyek5ggoq.RatingCompat())) {
                            String strRatingCompat = getyek5ggoq.RatingCompat();
                            getStem3EK5gGoQ getstem3ek5ggoqWrite = getsystemhomeek5ggoq.write();
                            if (zzgz.RemoteActionCompatParcelizer(strRatingCompat)) {
                                try {
                                    boolSerializer2 = serializer(new BigDecimal(strRatingCompat), getstem3ek5ggoqWrite, 0.0d);
                                } catch (NumberFormatException unused3) {
                                    boolSerializer2 = null;
                                }
                            } else {
                                boolSerializer2 = null;
                            }
                            boolSerializer = serializer(boolSerializer2, zMediaBrowserCompatMediaItem2);
                        } else {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer("Invalid user property value for Numeric number filter. property, value", zzgnVar.RemoteActionCompatParcelizer(getyek5ggoq.IconCompatParcelizer()), getyek5ggoq.RatingCompat());
                        }
                    } else {
                        String strRatingCompat2 = getyek5ggoq.RatingCompat();
                        getTEK5gGoQ gettek5ggoqRemoteActionCompatParcelizer = getsystemhomeek5ggoq.RemoteActionCompatParcelizer();
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        boolSerializer = serializer(serializer(strRatingCompat2, gettek5ggoqRemoteActionCompatParcelizer, getlookaheaddelegate), zMediaBrowserCompatMediaItem2);
                    }
                } else {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(zzgnVar.RemoteActionCompatParcelizer(getyek5ggoq.IconCompatParcelizer()), "User property has no value, property");
                }
                boolSerializer = null;
            }
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.serializer(boolSerializer == null ? "null" : boolSerializer, "Property filter result");
        if (boolSerializer == null) {
            return false;
        }
        this.RemoteActionCompatParcelizer = Boolean.TRUE;
        if (!z2 || boolSerializer.booleanValue()) {
            if (!z || getsystemnavigationupek5ggoq.MediaMetadataCompat()) {
                this.MediaMetadataCompat = boolSerializer;
            }
            if (boolSerializer.booleanValue() && z3 && getyek5ggoq.serializer()) {
                long jRemoteActionCompatParcelizer = getyek5ggoq.RemoteActionCompatParcelizer();
                if (l != null) {
                    jRemoteActionCompatParcelizer = l.longValue();
                }
                if (zWrite && getsystemnavigationupek5ggoq.MediaMetadataCompat() && !getsystemnavigationupek5ggoq.MediaSessionCompatQueueItem() && l2 != null) {
                    jRemoteActionCompatParcelizer = l2.longValue();
                }
                if (getsystemnavigationupek5ggoq.MediaSessionCompatQueueItem()) {
                    this.MediaDescriptionCompat = Long.valueOf(jRemoteActionCompatParcelizer);
                } else {
                    this.MediaBrowserCompatMediaItem = Long.valueOf(jRemoteActionCompatParcelizer);
                }
            }
        }
        return true;
    }
}
