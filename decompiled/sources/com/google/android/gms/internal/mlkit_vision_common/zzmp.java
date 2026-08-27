package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import o.ApproachLayoutModifierNodeminApproachIntrinsicWidth1;
import o.accessdetachAndRemoveNode;
import o.accessgetBackspacecp;
import o.accessgetBrowsercp;
import o.accessgetButton10cp;
import o.accessgetButton11cp;
import o.accessgetF12cp;
import o.accessgetF2cp;
import o.accessgetF3cp;
import o.accessgetTvTeletextcp;
import o.colorResource;
import o.getAlignmentLinesMap;
import o.getApproachNode;
import o.getLookaheadScopeCoordinates;
import o.provideRulerValue;
import o.reuseComposition;
import o.setApproachMeasureRequiredui;
import o.setCountrylambda1;
import o.setMeasureBlock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmp implements getApproachNode {
    public final provideRulerValue read;
    public final getLookaheadScopeCoordinates serializer;

    @Override // o.getApproachNode
    public final void read(colorResource colorresource) {
        accessgetF3cp accessgetf3cp = (accessgetF3cp) this.read.write();
        setApproachMeasureRequiredui setapproachmeasurerequiredui = setApproachMeasureRequiredui.serializer;
        accessgetTvTeletextcp accessgettvteletextcp = (accessgetTvTeletextcp) colorresource.IconCompatParcelizer;
        ((setCountrylambda1) colorresource.write).write = false;
        setCountrylambda1 setcountrylambda1 = (setCountrylambda1) colorresource.write;
        setcountrylambda1.RemoteActionCompatParcelizer = Boolean.FALSE;
        accessgettvteletextcp.RemoteActionCompatParcelizer = new setMeasureBlock(setcountrylambda1);
        try {
            setApproachMeasureRequiredui.RemoteActionCompatParcelizer();
            ApproachLayoutModifierNodeminApproachIntrinsicWidth1 approachLayoutModifierNodeminApproachIntrinsicWidth1 = new ApproachLayoutModifierNodeminApproachIntrinsicWidth1(accessgettvteletextcp);
            accessgetTvTeletextcp accessgettvteletextcp2 = new accessgetTvTeletextcp(11);
            setapproachmeasurerequiredui.serializer(accessgettvteletextcp2);
            HashMap map = new HashMap((HashMap) accessgettvteletextcp2.RemoteActionCompatParcelizer);
            HashMap map2 = new HashMap((HashMap) accessgettvteletextcp2.serializer);
            zzaj zzajVar = (zzaj) accessgettvteletextcp2.write;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                zzak zzakVar = new zzak(byteArrayOutputStream, map, map2, zzajVar);
                accessdetachAndRemoveNode accessdetachandremovenode = (accessdetachAndRemoveNode) map.get(ApproachLayoutModifierNodeminApproachIntrinsicWidth1.class);
                if (accessdetachandremovenode == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(ApproachLayoutModifierNodeminApproachIntrinsicWidth1.class)));
                }
                accessdetachandremovenode.serializer(approachLayoutModifierNodeminApproachIntrinsicWidth1, zzakVar);
                accessgetf3cp.read(new accessgetBackspacecp(byteArrayOutputStream.toByteArray(), accessgetBrowsercp.VERY_LOW, null), new getAlignmentLinesMap(2));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public zzmp(Context context, getLookaheadScopeCoordinates getlookaheadscopecoordinates) {
        this.serializer = getlookaheadscopecoordinates;
        accessgetButton11cp accessgetbutton11cp = accessgetButton11cp.write;
        accessgetF2cp.RemoteActionCompatParcelizer(context);
        accessgetF12cp accessgetf12cpRemoteActionCompatParcelizer = accessgetF2cp.read().RemoteActionCompatParcelizer(accessgetbutton11cp);
        if (accessgetButton11cp.serializer.contains(new accessgetButton10cp("json"))) {
            new provideRulerValue(new reuseComposition(accessgetf12cpRemoteActionCompatParcelizer, 3));
        }
        this.read = new provideRulerValue(new reuseComposition(accessgetf12cpRemoteActionCompatParcelizer, 4));
    }
}
