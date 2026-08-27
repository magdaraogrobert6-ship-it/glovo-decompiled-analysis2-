package com.incognia.internal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.ReversedListReadOnly;
import kotlin.jvm.internal.Lambda;
import o.accessgetInstancedelegatecp;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getInAppMessageEventMap;
import o.getIsCurrentlyDisplayingInAppMessage;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.resetAfterInAppMessageCloselambda1;
import o.resetAfterInAppMessageCloselambda2;
import o.setCarryoverInAppMessage;
import o.verifyOrientationStatuslambda3;

/* JADX INFO: loaded from: classes2.dex */
public final class F2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ i8Q BGx;
    public final /* synthetic */ iTU HQ;
    public final /* synthetic */ cancelPendingWebViewPause N;
    public final /* synthetic */ StringBuilder hIl;
    public final /* synthetic */ ArrayList hs;
    public final /* synthetic */ StringBuilder mbG;
    public final /* synthetic */ createInAppMessageEventSubscriber x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(i8Q i8q, StringBuilder sb, iTU itu, cancelPendingWebViewPause cancelpendingwebviewpause, createInAppMessageEventSubscriber createinappmessageeventsubscriber, StringBuilder sb2, ArrayList arrayList) {
        super(1);
        this.BGx = i8q;
        this.mbG = sb;
        this.HQ = itu;
        this.N = cancelpendingwebviewpause;
        this.x = createinappmessageeventsubscriber;
        this.hIl = sb2;
        this.hs = arrayList;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws ParseException {
        FQL fql;
        String str;
        String str2 = (String) obj;
        if (this.BGx.mbG) {
            StringBuilder sb = this.mbG;
            sb.append(str2);
            sb.append('\n');
        }
        lParcelableVolumeInfo = null;
        Long lParcelableVolumeInfo = null;
        if (this.BGx.HQ.write(str2)) {
            getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage = getInAppMessageEventMap.read(this.BGx.HQ, str2);
            if (getiscurrentlydisplayinginappmessage != null) {
                iTU itu = this.HQ;
                String str3 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage.IconCompatParcelizer()).get(1);
                String str4 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage.IconCompatParcelizer()).get(2);
                String str5 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage.IconCompatParcelizer()).get(3);
                itu.BGx = Long.valueOf(Long.parseLong(str3));
                TimeZone timeZone = TimeZone.getTimeZone("GMT" + str5);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(i8Q.VLD, Locale.US);
                simpleDateFormat.setTimeZone(timeZone);
                Date date = simpleDateFormat.parse(hideCurrentlyDisplayingInAppMessage.read((CharSequence) str4).toString());
                itu.mbG = date != null ? Long.valueOf(date.getTime()) : null;
                itu.HQ = timeZone.getID();
            }
        } else {
            String str6 = i8Q.TfN;
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, str6, false)) {
                this.HQ.N = hideCurrentlyDisplayingInAppMessage.read((CharSequence) hideCurrentlyDisplayingInAppMessage.write(str2, str6)).toString();
            } else {
                String str7 = i8Q.OV7;
                if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, str7, false)) {
                    this.HQ.x = hideCurrentlyDisplayingInAppMessage.write(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str2, str7, str2), ' ', '\'');
                } else {
                    String str8 = i8Q.JR;
                    if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, str8, false)) {
                        this.HQ.hIl = hideCurrentlyDisplayingInAppMessage.write(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str2, str8, str2), ' ', '\'');
                    } else {
                        String str9 = i8Q.j;
                        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, str9, false)) {
                            this.HQ.hs = hideCurrentlyDisplayingInAppMessage.read((CharSequence) hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str2, str9, str2)).toString();
                        } else {
                            String str10 = i8Q.n;
                            try {
                                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) str10, false)) {
                                    List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer((String) hideCurrentlyDisplayingInAppMessage.serializer(hideCurrentlyDisplayingInAppMessage.read((CharSequence) hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) hideCurrentlyDisplayingInAppMessage.serializer(str2, new String[]{str10}, 6).get(1), new String[]{";"}, 6).get(0)).toString(), new String[]{","}, 6).get(1), new String[]{"/"}, 6);
                                    ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
                                    Iterator it = listSerializer.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Long.valueOf(Long.parseLong(hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it.next()).toString(), i8Q.vM))));
                                    }
                                    if (!arrayList.isEmpty()) {
                                        this.HQ.VV3 = Long.valueOf(((Number) arrayList.get(1)).longValue() - ((Number) arrayList.get(0)).longValue());
                                    }
                                } else if (this.BGx.VV3.read(str2)) {
                                    this.HQ.A1 = Long.valueOf(Long.parseLong(hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(hideCurrentlyDisplayingInAppMessage.read((CharSequence) hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str2, i8Q.l5, str2)).toString(), i8Q.vM)));
                                } else {
                                    String str11 = i8Q.ss;
                                    if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, str11, false)) {
                                        this.HQ.q = Long.valueOf(Long.parseLong(hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(hideCurrentlyDisplayingInAppMessage.read((CharSequence) hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str2, str11, str2)).toString(), i8Q.vM)));
                                    } else if (this.BGx.N.write(str2)) {
                                        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage2 = getInAppMessageEventMap.read(this.BGx.N, str2);
                                        if (getiscurrentlydisplayinginappmessage2 != null && (str = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage2.IconCompatParcelizer()).get(1)) != null) {
                                            lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(str);
                                        }
                                        this.HQ.S = lParcelableVolumeInfo;
                                    } else {
                                        boolean zRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, "\"", false);
                                        cancelPendingWebViewPause cancelpendingwebviewpause = this.N;
                                        if (zRemoteActionCompatParcelizer) {
                                            if (cancelpendingwebviewpause.IconCompatParcelizer) {
                                                oxz oxzVar = (oxz) this.x.IconCompatParcelizer;
                                                String string = hideCurrentlyDisplayingInAppMessage.read(this.hIl.toString()).toString();
                                                oxzVar.getClass();
                                                E6f e6f = new E6f(oxzVar.BGx, oxzVar.mbG, oxzVar.HQ, oxzVar.N, oxzVar.x, string, oxzVar.hIl, oxzVar.hs, oxzVar.VV3);
                                                if (e6f.BGx()) {
                                                    this.hs.add(e6f);
                                                }
                                                StringBuilder sb2 = this.hIl;
                                                sb2.getClass();
                                                sb2.setLength(0);
                                                this.x.IconCompatParcelizer = new oxz();
                                            }
                                            getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage3 = getInAppMessageEventMap.read(this.BGx.x, str2);
                                            if (getiscurrentlydisplayinginappmessage3 != null) {
                                                createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.x;
                                                cancelPendingWebViewPause cancelpendingwebviewpause2 = this.N;
                                                String str12 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage3.IconCompatParcelizer()).get(1);
                                                String str13 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage3.IconCompatParcelizer()).get(2);
                                                String str14 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage3.IconCompatParcelizer()).get(3);
                                                String str15 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage3.IconCompatParcelizer()).get(4);
                                                String str16 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage3.IconCompatParcelizer()).get(5);
                                                oxz oxzVar2 = (oxz) createinappmessageeventsubscriber.IconCompatParcelizer;
                                                oxzVar2.BGx = str12;
                                                oxzVar2.mbG = Integer.valueOf(Integer.parseInt(str14));
                                                oxzVar2.HQ = Boolean.valueOf(str13.length() > 0);
                                                oxzVar2.N = Long.valueOf(Long.parseLong(str15));
                                                onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = FQL.mbG;
                                                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str12, (CharSequence) "ibgnd-", true)) {
                                                    fql = kKI.HQ;
                                                } else if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str12, (CharSequence) "main", true)) {
                                                    fql = dTC.HQ;
                                                } else {
                                                    fql = DHa.HQ;
                                                }
                                                oxzVar2.VV3 = fql;
                                                onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda2 = u8u.mbG;
                                                oxzVar2.hIl = h6W.BGx(str16);
                                                cancelpendingwebviewpause2.IconCompatParcelizer = true;
                                            }
                                        } else if (cancelpendingwebviewpause.IconCompatParcelizer && this.BGx.hIl.write(str2)) {
                                            getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage4 = getInAppMessageEventMap.read(this.BGx.hIl, str2);
                                            ((oxz) this.x.IconCompatParcelizer).x = getiscurrentlydisplayinginappmessage4 != null ? (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage4.IconCompatParcelizer()).get(1) : null;
                                        } else if (this.N.IconCompatParcelizer && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) i8Q.B, false)) {
                                            resetAfterInAppMessageCloselambda1 resetafterinappmessagecloselambda1Write = getInAppMessageEventMap.write(this.BGx.hs, str2);
                                            pi piVar = pi.BGx;
                                            piVar.getClass();
                                            ((oxz) this.x.IconCompatParcelizer).hs = resetAfterInAppMessageCloselambda2.read(new verifyOrientationStatuslambda3(resetafterinappmessagecloselambda1Write, piVar));
                                        } else if (this.N.IconCompatParcelizer && (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, "  at ", false) || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, "  - ", false))) {
                                            StringBuilder sb3 = this.hIl;
                                            sb3.append(hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString());
                                            sb3.append('\n');
                                        } else if (this.N.IconCompatParcelizer && hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                                            oxz oxzVar3 = (oxz) this.x.IconCompatParcelizer;
                                            String string2 = hideCurrentlyDisplayingInAppMessage.read(this.hIl.toString()).toString();
                                            oxzVar3.getClass();
                                            E6f e6f2 = new E6f(oxzVar3.BGx, oxzVar3.mbG, oxzVar3.HQ, oxzVar3.N, oxzVar3.x, string2, oxzVar3.hIl, oxzVar3.hs, oxzVar3.VV3);
                                            if (e6f2.BGx()) {
                                                this.hs.add(e6f2);
                                            }
                                            StringBuilder sb4 = this.hIl;
                                            sb4.getClass();
                                            sb4.setLength(0);
                                            this.x.IconCompatParcelizer = new oxz();
                                            this.N.IconCompatParcelizer = false;
                                        }
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        }
        return createFromParcel.INSTANCE;
    }
}
