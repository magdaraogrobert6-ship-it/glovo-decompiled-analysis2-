package com.deliveryhero.customerchat;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import kotlin.jvm.internal.Lambda;
import o.LayerSnapshotV22toBitmap2image11;
import o.createFromParcel;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerChatModule$sendMessage$2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ String read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerChatModule$sendMessage$2(String str, int i) {
        super(1);
        this.IconCompatParcelizer = i;
        this.read = str;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        JsonArray asJsonArray;
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        String str = this.read;
        if (i == 0) {
            LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image11 = (LayerSnapshotV22toBitmap2image11) obj;
            layerSnapshotV22toBitmap2image11.getClass();
            str.getClass();
            layerSnapshotV22toBitmap2image11.ParcelableVolumeInfo = str;
            return createfromparcel;
        }
        if (i == 1) {
            LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image12 = (LayerSnapshotV22toBitmap2image11) obj;
            layerSnapshotV22toBitmap2image12.getClass();
            layerSnapshotV22toBitmap2image12.RemoteActionCompatParcelizer = str;
            return createfromparcel;
        }
        if (i == 2) {
            LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image13 = (LayerSnapshotV22toBitmap2image11) obj;
            layerSnapshotV22toBitmap2image13.getClass();
            str.getClass();
            layerSnapshotV22toBitmap2image13.RemoteActionCompatParcelizer = str;
            return createfromparcel;
        }
        LegAnnotation legAnnotation = (LegAnnotation) obj;
        legAnnotation.getClass();
        JsonElement unrecognizedProperty = legAnnotation.getUnrecognizedProperty(str);
        if (unrecognizedProperty == null || (asJsonArray = unrecognizedProperty.getAsJsonArray()) == null) {
            return null;
        }
        return onContentCardDismissed.PlaybackStateCompat(asJsonArray);
    }
}
